package demo.hewe.rpc.model;

import java.io.Serializable;

/**
 *
 */
public class Account implements Serializable {
    private String loginname;
    private String passwd;

    @Override
    public String toString() {
        return "Account{" +
                "loginname='" + loginname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
