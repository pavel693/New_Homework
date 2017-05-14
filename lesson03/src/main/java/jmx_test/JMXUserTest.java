package jmx_test;

import java.lang.management.ManagementFactory;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.StandardMBean;

public class JMXUserTest {

    public static void main(String[] args)
        throws NotCompliantMBeanException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {

        UserMBean userMBean = new User("Vasy", "Petrov", 25);

        StandardMBean standardMBean = new StandardMBean(userMBean, UserMBean.class);

        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        platformMBeanServer.registerMBean(standardMBean, new ObjectName("user_test:name=user"));
        Thread.sleep(Long.MAX_VALUE);
    }
}
