public class Main {
    public static void main(String[] args) {
        Device device = (Device) DebugProxy.newInstance(new LinuxDevice());

        System.out.println("Hello world! " + device.getName());


    }
}

