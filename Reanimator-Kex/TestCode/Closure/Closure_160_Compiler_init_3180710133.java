package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Compiler_init_3180710133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Compiler_init_3180710133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.io.PrintStream"));
        Object term4 = newInstance(Class.forName("java.util.Formatter"));
        Object term5 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6 = (byte[]) newByteArray(16);
        Object term25 = newInstance(Class.forName("java.util.Locale"));
        Object term26 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term40 = newInstance(Class.forName("java.io.IOException"));
        Object[] term41 = (Object[]) newArray("java.lang.Object", 5);
        short[] term42 = (short[]) newShortArray(32);
        int[] term75 = (int[]) newIntArray(32);
        Object[] term108 = (Object[]) newArray("java.lang.Object", 32);
        long[] term109 = (long[]) newLongArray(32);
        Object[] term142 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term155 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term157 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term160 = newInstance(Class.forName("java.io.BufferedWriter"));
        char[] term161 = (char[]) newCharArray(5);
        char[] term169 = (char[]) newCharArray(4);
        Object term174 = newInstance(Class.forName("java.lang.Object"));
        Object term175 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        char[] term176 = (char[]) newCharArray(3);
        Object term180 = newInstance(Class.forName("java.lang.Object"));
        Object term183 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1, term1.getClass(), "autoFlush", false);
        setBooleanField(term1, term1.getClass(), "trouble", false);
        setField(term5, term5.getClass(), "value", term6);
        setByteField(term5, term5.getClass(), "coder", (byte) 0);
        setIntField(term5, term5.getClass(), "count", 0);
        setField(term4, term4.getClass(), "a", term5);
        setField(term26, term26.getClass(), "language", "");
        setField(term26, term26.getClass(), "script", "");
        setField(term26, term26.getClass(), "region", "");
        setField(term26, term26.getClass(), "variant", "");
        setIntField(term26, term26.getClass(), "hash", 96636889);
        setField(term25, term25.getClass(), "baseLocale", term26);
        setField(term25, term25.getClass(), "localeExtensions", null);
        setIntField(term25, term25.getClass(), "hashCodeValue", 96636889);
        setField(term25, term25.getClass(), "languageTag", "en-US");
        setField(term4, term4.getClass(), "l", term25);
        setShortElement(term42, 0, (short) 1);
        setShortElement(term42, 1, (short) 2);
        setShortElement(term42, 2, (short) 1);
        setShortElement(term42, 3, (short) 7);
        setShortElement(term42, 4, (short) 2);
        setShortElement(term42, 5, (short) 1);
        setShortElement(term42, 6, (short) 6);
        setShortElement(term42, 7, (short) 3);
        setShortElement(term42, 8, (short) 2);
        setShortElement(term42, 9, (short) 8);
        setShortElement(term42, 10, (short) 7);
        setShortElement(term42, 11, (short) 6);
        setShortElement(term42, 12, (short) 3);
        setShortElement(term42, 13, (short) 2);
        setShortElement(term42, 14, (short) 8);
        setShortElement(term42, 15, (short) 7);
        setShortElement(term42, 16, (short) 6);
        setShortElement(term42, 17, (short) 2);
        setShortElement(term42, 18, (short) 10);
        setShortElement(term42, 19, (short) 11);
        setShortElement(term42, 20, (short) 29);
        setShortElement(term42, 21, (short) 5);
        setShortElement(term42, 22, (short) 4);
        setShortElement(term42, 23, (short) 7);
        setShortElement(term42, 24, (short) 8);
        setShortElement(term42, 25, (short) 6);
        setShortElement(term42, 26, (short) 9);
        setShortElement(term42, 27, (short) 10);
        setShortElement(term42, 28, (short) 11);
        setShortElement(term42, 29, (short) 4);
        setShortElement(term42, 30, (short) 1);
        setElement(term41, 0, term42);
        setIntElement(term75, 1, 5570560);
        setIntElement(term75, 2, 327680);
        setIntElement(term75, 3, 4456454);
        setIntElement(term75, 4, 1769472);
        setIntElement(term75, 5, 14876672);
        setIntElement(term75, 6, 6225920);
        setIntElement(term75, 7, 15728640);
        setIntElement(term75, 8, 4980736);
        setIntElement(term75, 9, 3211264);
        setIntElement(term75, 10, 2293760);
        setIntElement(term75, 11, 10354688);
        setIntElement(term75, 12, 15728640);
        setIntElement(term75, 13, 4980736);
        setIntElement(term75, 14, 3211264);
        setIntElement(term75, 15, 2293760);
        setIntElement(term75, 16, 10354688);
        setIntElement(term75, 17, 917504);
        setIntElement(term75, 18, 327680);
        setIntElement(term75, 19, 8519680);
        setIntElement(term75, 20, 917504);
        setIntElement(term75, 21, 11993088);
        setIntElement(term75, 22, 655360);
        setIntElement(term75, 23, 6291456);
        setIntElement(term75, 24, 2818048);
        setIntElement(term75, 25, 7143424);
        setIntElement(term75, 26, 8454144);
        setIntElement(term75, 27, 9240576);
        setIntElement(term75, 28, 196608);
        setIntElement(term75, 29, 3801088);
        setIntElement(term75, 30, 786432);
        setIntElement(term75, 31, 589824);
        setElement(term41, 1, term75);
        setElement(term41, 2, term108);
        setLongElement(term109, 0, 34363746224L);
        setLongElement(term109, 1, 34363775512L);
        setLongElement(term109, 2, 34363775512L);
        setLongElement(term109, 3, 34363775512L);
        setLongElement(term109, 4, 133986945103856L);
        setLongElement(term109, 5, 34364440080L);
        setLongElement(term109, 6, 133986945179552L);
        setLongElement(term109, 7, 133986945476048L);
        setLongElement(term109, 8, 133986945180176L);
        setLongElement(term109, 9, 133986945180176L);
        setLongElement(term109, 10, 133986945179920L);
        setLongElement(term109, 11, 133986945179552L);
        setLongElement(term109, 12, 133986945476048L);
        setLongElement(term109, 13, 133986945180176L);
        setLongElement(term109, 14, 133986945180176L);
        setLongElement(term109, 15, 133986945179920L);
        setLongElement(term109, 16, 133986945179552L);
        setLongElement(term109, 17, 133986944574752L);
        setLongElement(term109, 18, 133986944574640L);
        setLongElement(term109, 19, 133986944574784L);
        setLongElement(term109, 20, 133986945065328L);
        setLongElement(term109, 21, 34363766248L);
        setLongElement(term109, 22, 34363766248L);
        setLongElement(term109, 23, 133982910972032L);
        setLongElement(term109, 24, 133982910972032L);
        setLongElement(term109, 25, 133982910971888L);
        setLongElement(term109, 26, 133982911016432L);
        setLongElement(term109, 27, 133982911018080L);
        setLongElement(term109, 28, 133982911027056L);
        setLongElement(term109, 29, 133982907970192L);
        setLongElement(term109, 30, 34363739368L);
        setLongElement(term109, 31, 34363739368L);
        setElement(term41, 3, term109);
        setElement(term41, 4, term142);
        setField(term40, term40.getClass(), "backtrace", term41);
        setField(term40, term40.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term40, term40.getClass(), "cause", term40);
        setField(term40, term40.getClass(), "stackTrace", term155);
        setIntField(term40, term40.getClass(), "depth", 44);
        setIntField(term157, term157.getClass(), "modCount", 0);
        setField(term40, term40.getClass(), "suppressedExceptions", term157);
        setField(term4, term4.getClass(), "lastException", term40);
        setCharField(term4, term4.getClass(), "zero", (char) 48);
        setField(term1, term1.getClass(), "formatter", term4);
        setField(term160, term160.getClass(), "out", null);
        setCharElement(term161, 0, 'P');
        setCharElement(term161, 1, 'A');
        setCharElement(term161, 2, 'E');
        setCharElement(term161, 3, 'B');
        setCharElement(term161, 4, 't');
        setField(term160, term160.getClass(), "cb", term161);
        setIntField(term160, term160.getClass(), "nChars", 568599855);
        setIntField(term160, term160.getClass(), "nextChar", 1162663216);
        setCharElement(term169, 0, 'n');
        setCharElement(term169, 1, 'Z');
        setCharElement(term169, 2, 't');
        setCharElement(term169, 3, 'T');
        setField(term160, term160.getClass(), "writeBuffer", term169);
        setField(term160, term160.getClass(), "lock", term174);
        setField(term1, term1.getClass(), "textOut", term160);
        setField(term175, term175.getClass(), "se", null);
        setCharElement(term176, 0, 'D');
        setCharElement(term176, 1, 's');
        setCharElement(term176, 2, 'j');
        setField(term175, term175.getClass(), "writeBuffer", term176);
        setField(term175, term175.getClass(), "lock", term180);
        setField(term1, term1.getClass(), "charOut", term175);
        setBooleanField(term1, term1.getClass(), "closing", false);
        setField(term1, term1.getClass(), "out", null);
        setBooleanField(term1, term1.getClass(), "closed", false);
        setField(term1, term1.getClass(), "closeLock", term183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.PrintStream");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};


