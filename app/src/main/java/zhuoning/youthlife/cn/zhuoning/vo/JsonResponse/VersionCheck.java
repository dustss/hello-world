package zhuoning.youthlife.cn.zhuoning.vo.JsonResponse;

/**
 * Created by dusts on 2016/4/19. 14
 */
public class VersionCheck {

    /**
     * name : 卓宁小控
     * version : 2
     * changelog :
     * updated_at : 1460992869
     * versionShort : 1.1
     * build : 2
     * installUrl : http://download.fir.im/v2/app/install/57138eb6f2fc420d1f000001?download_token=d271edc1b996c64023ec0bb180ea0cf5
     * install_url : http://download.fir.im/v2/app/install/57138eb6f2fc420d1f000001?download_token=d271edc1b996c64023ec0bb180ea0cf5
     * direct_install_url : http://download.fir.im/v2/app/install/57138eb6f2fc420d1f000001?download_token=d271edc1b996c64023ec0bb180ea0cf5
     * update_url : http://fir.im/zniot
     * binary : {"fsize":2983264}
     */

    private String name;
    private String version;
    private String changelog;
    private int updated_at;
    private String versionShort;
    private String build;
    private String installUrl;
    private String install_url;
    private String direct_install_url;
    private String update_url;
    /**
     * fsize : 2983264
     */

    private BinaryBean binary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public String getVersionShort() {
        return versionShort;
    }

    public void setVersionShort(String versionShort) {
        this.versionShort = versionShort;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getInstallUrl() {
        return installUrl;
    }

    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl;
    }

    public String getInstall_url() {
        return install_url;
    }

    public void setInstall_url(String install_url) {
        this.install_url = install_url;
    }

    public String getDirect_install_url() {
        return direct_install_url;
    }

    public void setDirect_install_url(String direct_install_url) {
        this.direct_install_url = direct_install_url;
    }

    public String getUpdate_url() {
        return update_url;
    }

    public void setUpdate_url(String update_url) {
        this.update_url = update_url;
    }

    public BinaryBean getBinary() {
        return binary;
    }

    public void setBinary(BinaryBean binary) {
        this.binary = binary;
    }

    public static class BinaryBean {
        private int fsize;

        public int getFsize() {
            return fsize;
        }

        public void setFsize(int fsize) {
            this.fsize = fsize;
        }
    }
}
