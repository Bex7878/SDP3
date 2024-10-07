interface SensitiveData {
    void accessData();
}

class RealSensitiveData implements SensitiveData {
    public RealSensitiveData() {
        System.out.println("Loading sensitive data from secure source...");
    }

    public void accessData() {
        System.out.println("Accessing sensitive data...");
    }
}


class ProxySensitiveData implements SensitiveData {
    private RealSensitiveData realData;

    public void accessData() {
        if (realData == null) {
            realData = new RealSensitiveData();
        }
        realData.accessData();
    }
}


public class MainProxyTask {
    public static void main(String[] args) {
        SensitiveData dataProxy = new ProxySensitiveData();

        dataProxy.accessData();
        dataProxy.accessData();
    }
}
