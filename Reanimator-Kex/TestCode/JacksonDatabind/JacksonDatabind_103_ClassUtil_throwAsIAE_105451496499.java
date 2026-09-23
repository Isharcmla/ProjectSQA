package com.fasterxml.jackson.databind.util;

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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_throwAsIAE_105451496499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16746;

    public ClassUtil_throwAsIAE_105451496499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16815 = Class.forName((String) "java.util.concurrent.Exchanger");
        Class<? extends Object> term16818 = Class.forName((String) "java.io.FileDescriptor");
        Class<? extends Object> term16820 = Class.forName((String) "java.util.zip.Deflater");
        Class<? extends Object> term16824 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$AbortPolicy");
        Class<? extends Object> term16829 = Class.forName((String) "java.util.regex.Pattern$SliceS");
        Class<? extends Object> term16833 = Class.forName((String) "java.util.stream.SortedOps$LongSortingSink");
        Class<? extends Object> term16837 = Class.forName((String) "java.lang.Class$AnnotationData");
        Class<? extends Object> term16841 = Class.forName((String) "java.lang.FdLibm$Pow");
        Class<? extends Object> term16845 = Class.forName((String) "java.util.PriorityQueue");
        Class<? extends Object> term16849 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        Class<? extends Object> term16853 = Class.forName((String) "java.lang.ArithmeticException");
        Class<? extends Object> term16857 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedCallable");
        Class<? extends Object> term16861 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool");
        Class<? extends Object> term16865 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Class<? extends Object> term16868 = Class.forName((String) "java.lang.InstantiationException");
        Class<? extends Object> term16871 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey");
        Class<? extends Object> term16874 = Class.forName((String) "com.fasterxml.jackson.core.util.RequestPayload");
        Class<? extends Object> term16877 = Class.forName((String) "java.io.FileOutputStream$AltFinalizer");
        Class<? extends Object> term16981 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer");
        Class<? extends Object> term16983 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TreeBin");
        term16746 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term16747 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16748 = (short[]) newShortArray(32);
        int[] term16781 = (int[]) newIntArray(32);
        Object[] term16814 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16880 = (long[]) newLongArray(32);
        Object[] term16913 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16914 = (short[]) newShortArray(32);
        int[] term16947 = (int[]) newIntArray(32);
        Object[] term16980 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16985 = (long[]) newLongArray(32);
        Object[] term17030 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term17032 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term16748, 0, (short) 1);
        setShortElement(term16748, 1, (short) 2);
        setShortElement(term16748, 2, (short) 1);
        setShortElement(term16748, 3, (short) 7);
        setShortElement(term16748, 4, (short) 2);
        setShortElement(term16748, 5, (short) 1);
        setShortElement(term16748, 6, (short) 6);
        setShortElement(term16748, 7, (short) 2);
        setShortElement(term16748, 8, (short) 10);
        setShortElement(term16748, 9, (short) 11);
        setShortElement(term16748, 10, (short) 29);
        setShortElement(term16748, 11, (short) 5);
        setShortElement(term16748, 12, (short) 4);
        setShortElement(term16748, 13, (short) 6);
        setShortElement(term16748, 14, (short) 8);
        setShortElement(term16748, 15, (short) 6);
        setShortElement(term16748, 16, (short) 9);
        setShortElement(term16748, 17, (short) 10);
        setShortElement(term16748, 18, (short) 11);
        setShortElement(term16748, 19, (short) 4);
        setShortElement(term16748, 20, (short) 1);
        setShortElement(term16748, 22, (short) 10);
        setShortElement(term16748, 23, (short) 3);
        setShortElement(term16748, 24, (short) 4);
        setShortElement(term16748, 25, (short) 9);
        setShortElement(term16748, 26, (short) 1);
        setShortElement(term16748, 27, (short) 2);
        setShortElement(term16748, 28, (short) 3);
        setShortElement(term16748, 29, (short) 3);
        setShortElement(term16748, 30, (short) 13);
        setShortElement(term16748, 31, (short) 1);
        setElement(term16747, 0, term16748);
        setIntElement(term16781, 1, 5570560);
        setIntElement(term16781, 2, 327680);
        setIntElement(term16781, 3, 4456454);
        setIntElement(term16781, 4, 1769472);
        setIntElement(term16781, 5, 14876672);
        setIntElement(term16781, 6, 6225920);
        setIntElement(term16781, 7, 917504);
        setIntElement(term16781, 8, 327680);
        setIntElement(term16781, 9, 8519680);
        setIntElement(term16781, 10, 917504);
        setIntElement(term16781, 11, 11993088);
        setIntElement(term16781, 12, 655360);
        setIntElement(term16781, 13, 7864320);
        setIntElement(term16781, 14, 3735552);
        setIntElement(term16781, 15, 7143424);
        setIntElement(term16781, 16, 8454144);
        setIntElement(term16781, 17, 9240576);
        setIntElement(term16781, 18, 196608);
        setIntElement(term16781, 19, 3801088);
        setIntElement(term16781, 20, 786432);
        setIntElement(term16781, 21, 589824);
        setIntElement(term16781, 22, 17170432);
        setIntElement(term16781, 23, 1376256);
        setIntElement(term16781, 24, 5242880);
        setIntElement(term16781, 25, 2883584);
        setIntElement(term16781, 26, 20774912);
        setIntElement(term16781, 27, 262144);
        setIntElement(term16781, 28, 2555904);
        setIntElement(term16781, 29, 1835008);
        setIntElement(term16781, 30, 6029312);
        setIntElement(term16781, 31, 327680);
        setElement(term16747, 1, term16781);
        setElement(term16814, 0, term16815);
        setElement(term16814, 1, term16815);
        setElement(term16814, 2, term16818);
        setElement(term16814, 3, term16820);
        setElement(term16814, 4, term16824);
        setElement(term16814, 5, term16824);
        setElement(term16814, 6, term16829);
        setElement(term16814, 7, term16829);
        setElement(term16814, 8, term16833);
        setElement(term16814, 9, term16833);
        setElement(term16814, 10, term16833);
        setElement(term16814, 11, term16833);
        setElement(term16814, 12, term16833);
        setElement(term16814, 13, term16837);
        setElement(term16814, 14, term16837);
        setElement(term16814, 15, term16841);
        setElement(term16814, 16, term16841);
        setElement(term16814, 17, term16841);
        setElement(term16814, 18, term16841);
        setElement(term16814, 19, term16845);
        setElement(term16814, 20, term16845);
        setElement(term16814, 21, term16845);
        setElement(term16814, 22, term16849);
        setElement(term16814, 23, term16841);
        setElement(term16814, 24, term16853);
        setElement(term16814, 25, term16857);
        setElement(term16814, 26, term16861);
        setElement(term16814, 27, term16865);
        setElement(term16814, 28, term16868);
        setElement(term16814, 29, term16871);
        setElement(term16814, 30, term16874);
        setElement(term16814, 31, term16877);
        setElement(term16747, 2, term16814);
        setLongElement(term16880, 0, 34363746224L);
        setLongElement(term16880, 1, 34363775512L);
        setLongElement(term16880, 2, 34363775512L);
        setLongElement(term16880, 3, 34363775512L);
        setLongElement(term16880, 4, 131482375099808L);
        setLongElement(term16880, 5, 34364440080L);
        setLongElement(term16880, 6, 131482375166912L);
        setLongElement(term16880, 7, 131482375009648L);
        setLongElement(term16880, 8, 131482375009536L);
        setLongElement(term16880, 9, 131482375009680L);
        setLongElement(term16880, 10, 131482375053392L);
        setLongElement(term16880, 11, 34363766248L);
        setLongElement(term16880, 12, 34363766248L);
        setLongElement(term16880, 13, 131478873767568L);
        setLongElement(term16880, 14, 131478873767568L);
        setLongElement(term16880, 15, 131478873767424L);
        setLongElement(term16880, 16, 131478873811328L);
        setLongElement(term16880, 17, 131478873812976L);
        setLongElement(term16880, 18, 131478873813744L);
        setLongElement(term16880, 19, 131482377128080L);
        setLongElement(term16880, 20, 34363739368L);
        setLongElement(term16880, 21, 34363739368L);
        setLongElement(term16880, 22, 131478873766064L);
        setLongElement(term16880, 23, 34363829248L);
        setLongElement(term16880, 24, 131482377128080L);
        setLongElement(term16880, 25, 131482377482976L);
        setLongElement(term16880, 26, 34363745472L);
        setLongElement(term16880, 27, 34364710216L);
        setLongElement(term16880, 28, 34363745472L);
        setLongElement(term16880, 29, 34363745472L);
        setLongElement(term16880, 30, 34364896224L);
        setLongElement(term16880, 31, 34363745472L);
        setElement(term16747, 3, term16880);
        setShortElement(term16914, 0, (short) 2);
        setShortElement(term16914, 1, (short) 12);
        setElement(term16913, 0, term16914);
        setIntElement(term16947, 0, 1638400);
        setIntElement(term16947, 1, 720907);
        setElement(term16913, 1, term16947);
        setElement(term16980, 0, term16981);
        setElement(term16980, 1, term16983);
        setElement(term16913, 2, term16980);
        setLongElement(term16985, 0, 34363745472L);
        setLongElement(term16985, 1, 34363745472L);
        setElement(term16913, 3, term16985);
        setElement(term16747, 4, term16913);
        setField(term16746, term16746.getClass(), "backtrace", term16747);
        setField(term16746, term16746.getClass(), "detailMessage", "pCTimMblYc");
        setField(term16746, term16746.getClass(), "cause", term16746);
        setField(term16746, term16746.getClass(), "stackTrace", term17030);
        setIntField(term16746, term16746.getClass(), "depth", 34);
        setIntField(term17032, term17032.getClass(), "modCount", 0);
        setField(term16746, term16746.getClass(), "suppressedExceptions", term17032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = term16746;
        try {
            callMethod(klass, "throwAsIAE", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


