package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        System.out.println(-a);

    }
}

//        코드 100 1039번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(a + b);

    }
}


// 코드 100 1038번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(a + b);

    }
}

// 코드 100 1037번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = (char)(a);
        System.out.println(b);

    }
}

// 코드 100 1036번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int)(a);
        System.out.println(b);

    }
}

//코드 100 1035번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b =Integer.parseInt(a, 16);
        String octa = Integer.toOctalString(b);
        System.out.println(octa);

    }
}

// 코드 100 1034번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b =Integer.parseInt(a, 8);

        System.out.println(b);

    }
}



 //코드 100 1033번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String hexaDecimal = Integer.toHexString(a).toUpperCase();
        System.out.println(hexaDecimal);

    }
}


 //코드 100 1032번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String hexaDecimal = Integer.toHexString(a);
        System.out.println(hexaDecimal);

    }
}

// 코드 100 1031번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String octal = Integer.toOctalString(a);
        System.out.println(octal);

    }
}

// 코드 100 1030번


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(a);

    }
}

// 코드 100 1028번

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(a);

    }
}

// 코드 100 1027번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("\\.");
        int i = 1;

        while (i <= 2) {
            if (arr[i].length() < 2) {
                arr[i] = "0" + arr[i];
            }
            i++;
        }
        while (arr[0].length() < 4)  {
            arr[0] = "0" + arr[0];
        }

        System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);

    }
}

// 코드 100 1026번

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(":");
        int i = 1;

        while (i <= 2) {
            if (Integer.parseInt(arr[i]) == 00){
                arr[i] = "0";
                break;
            }
            if (arr[i].length() < 2) {
                arr[i] = "0" + arr[i];
            }
            i++;
        }

        System.out.println(arr[1]);

    }
}
