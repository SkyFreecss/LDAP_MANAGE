import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by wejeh on 2017/5/16.
 */
public class MailTest
{
    //发件人的邮箱和密码（替换为自己的邮箱及密码）
    //某些邮箱服务器为了增加自身的安全性，给SMTP客户端设置了独立密码（有的邮箱称之为授权码），那么这种情况密码就填写这种独立密码。
    public static String myEmailAccount = "18672980500@163.com";
    public static String myEmailPassword = "Hwj19960302";

    //发件邮箱的smtp服务器地址，必须准确，不同邮件服务器地址不同，一般（只是一般，绝非绝对）格式为：smtp.xxx.com
    //网易邮箱的smtp服务器地址为:smtp.163.com
    public static String myEmailSMTPHost = "smtp.163.com";

    //收件人邮箱

    public static String receiveMailAccount = "69017545@qq.com";


        public static void main(String args[])throws Exception
        {
                //1.创建参数配置，用于连接邮件服务器的参数配置
                Properties props = new Properties();

               // props.setProperty("mail.smtp.port","465");
                props.setProperty("mail.transport.protocol","smtp");//使用的协议（JAVAMail规范要求）
                props.setProperty("mail.smtp.host",myEmailSMTPHost);//发件人的邮箱的SMTP服务器地址.
                props.setProperty("mail.smtp.auth","true");//需要请求认证

            //PS;某些邮箱服务器要求SMTP连接需要使用SSL安全认证（为了提高安全性，邮箱支持SSL连接，也可以自己开启）,
            //如果无法连接邮件服务器，仔细查看控制台打印的log,如果有类似“连接失败，要求SSL安全连接”等错误，
            //打开下面/*...*/之间注释的代码，开启SSL安全连接。

            /*
            //SMTP服务器的端口（非SSL连接的端口一般默认为25,可以不添加，如果开启了SSL连接，需要改为对应邮箱的SMTP服务器的端口，具体可查看对应邮箱
            服务的帮助，QQ邮箱的SMTP（SLL）端口为465或587，其他邮箱自行查看。
             */

            /*
            final String smtpPort = "465";
            props.setProperty("mail.smtp.port",smtpPort);
            props.setProperty("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            props.setProperty("mail.smtp.socketFactory.fallback","false");
            props.setProperty("mail.smtp.socketFactory.port",smtpPort);
            */

            //2.根据配置创建会话对象，用于和邮件服务器交互
            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);     //设置为DeBug模式，可以查看详细的发送log

            //3.创建一封邮件
            MimeMessage message = createMimeMessage(session,myEmailAccount,receiveMailAccount);

            //4.根据Session获取邮件传输对象
            Transport transport = session.getTransport();

            //5.使用邮箱账号和密码连接邮件服务器，这里认证的邮箱必须与message中的发件人邮箱一致，否则报错

            //成败的判断关键在此一句，如果连接服务器失败，都会在控制台输出相应失败的原因log，仔细查看失败原因，有些邮件服务器会返回错误代码或
            //查看错误的链接，根据给出的错误类型到对应邮件服务器的帮助网站上查看具体失败原因。

            //连接失败的原因通常为以下几点，仔细检查代码：
            /**
             * 1.邮箱没有开启SMTP服务；
             * 2.邮箱密码错误，例如某些邮箱开启了独立密码；
             * 3.邮箱服务器要求必须使用SSL安全连接；
             * 4.请求过于频繁或其他原因，被邮件服务器拒绝；
             * 5.如果以上几点都确定无误，到邮件服务器网站查找帮助。
             *
             * 仔细看log，认真看log，看懂log，错误原因都在log已说明。
             */

            transport.connect(myEmailAccount,myEmailPassword);

            //6.发送邮件，发到所有的收件地址，message.getAllRecipients()获取到的时在创建邮件对象时添加的所有收件人，抄送人，密送人。
            transport.sendMessage(message,message.getAllRecipients());

            //7.关闭连接
            transport.close();


        }

    /**
     * 创建一封只包换文本的简单邮件
     * @param session
     * @param sendMail
     * @param receiveMail
     * @return
     * @throws Exception
     */
        public static MimeMessage createMimeMessage(Session session,String sendMail,String receiveMail)throws Exception
        {
                //1.创建一封邮件
                MimeMessage message = new MimeMessage(session);
                //2.Form:发件人
                message.setFrom(new InternetAddress(sendMail,"Mr.Huang","UTF-8"));
                //3.To:收件人(可以增加多个收件人、抄送、密送)
                message.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(receiveMail,"黄伟杰","UTF-8"));
                //4.Subject:邮件主题
                message.setSubject("LDAP","UTF-8");
                //5.Content:邮件正文(可以使用html标签)
                message.setContent("徐冠你好！感谢你使用LDAP权限管理系统！","text/html;charset=UTF-8");
                //6.设置发件时间
                message.setSentDate(new Date());
                //7.保存设置
                message.saveChanges();

                return message;
        }
}
