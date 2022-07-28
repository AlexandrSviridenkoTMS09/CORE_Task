package Task17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class CodeAnalyzer {
    public static void analyzeClass(Object o) {
        Class<?> clas = o.getClass();
        String className = clas.getName();
        Printer.printClassName(className);

        ClassLoader classLoaderName = clas.getClassLoader();
        Printer.PrintClassLoaderName(classLoaderName);

        Class<?>[] interfaces = clas.getInterfaces();
        Printer.printInterfaces(interfaces);

        Field[] fields = clas.getDeclaredFields();
        Printer.printFields(fields);

        Constructor<?>[] constructors = clas.getDeclaredConstructors();
        Printer.printConstructors(constructors);

        Method[] methods = clas.getDeclaredMethods();
        Printer.printMethods(methods);

        Annotation[] annotations = clas.getDeclaredAnnotations();
        Printer.printAnnotations(annotations);
    }

    public static String getModifiers(int modifiers) {
        StringBuilder modifiersStr = new StringBuilder();

        if (Modifier.isAbstract(modifiers)) {
            modifiersStr.append("abstract ");
        }
        if (Modifier.isFinal(modifiers)) {
            modifiersStr.append("final ");
        }
        if (Modifier.isNative(modifiers)) {
            modifiersStr.append("native ");
        }
        if (Modifier.isPrivate(modifiers)) {
            modifiersStr.append("private ");
        } else if (Modifier.isProtected(modifiers)) {
            modifiersStr.append("protected ");
        } else if (Modifier.isPublic(modifiers)) {
            modifiersStr.append("public ");
        }

        return modifiersStr.toString();
    }

    public static String getParameters(Class<?>[] parameterTypes) {
        StringBuilder paramInfo = new StringBuilder();

        for (Class<?> parameter : parameterTypes) {
            paramInfo.append(parameter.getTypeName()).append(" ");
        }

        return paramInfo.toString();
    }

}

