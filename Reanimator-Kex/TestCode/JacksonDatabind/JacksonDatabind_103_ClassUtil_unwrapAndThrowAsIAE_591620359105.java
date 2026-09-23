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

public class ClassUtil_unwrapAndThrowAsIAE_591620359105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28842;

    public ClassUtil_unwrapAndThrowAsIAE_591620359105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28911 = Class.forName((String) "com.fasterxml.jackson.core.JsonTokenId");
        Class<? extends Object> term28914 = Class.forName((String) "java.lang.ArithmeticException");
        Class<? extends Object> term28916 = Class.forName((String) "java.util.zip.GZIPOutputStream");
        Class<? extends Object> term28920 = Class.forName((String) "java.util.concurrent.CancellationException");
        Class<? extends Object> term28925 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializable");
        Class<? extends Object> term28929 = Class.forName((String) "java.util.stream.SortedOps");
        Class<? extends Object> term28933 = Class.forName((String) "kex.sun.misc.FloatConsts");
        Class<? extends Object> term28937 = Class.forName((String) "com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class<? extends Object> term28941 = Class.forName((String) "java.util.stream.Streams$ConcatSpliterator");
        Class<? extends Object> term28945 = Class.forName((String) "java.util.stream.ReferencePipeline$StatefulOp");
        Class<? extends Object> term28949 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$DiscardPolicy");
        Class<? extends Object> term28953 = Class.forName((String) "java.util.concurrent.locks.LockSupport");
        Class<? extends Object> term28957 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<? extends Object> term28961 = Class.forName((String) "java.util.EventObject");
        Class<? extends Object> term28964 = Class.forName((String) "java.lang.Character$UnicodeBlock");
        Class<? extends Object> term28967 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedQueue$Itr");
        Class<? extends Object> term28970 = Class.forName((String) "java.lang.reflect.MalformedParameterizedTypeException");
        Class<? extends Object> term28973 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ClassSerializer");
        Class<? extends Object> term29077 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$8");
        Class<? extends Object> term29079 = Class.forName((String) "java.lang.NegativeArraySizeException");
        term28842 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term28843 = (Object[]) newArray("java.lang.Object", 5);
        short[] term28844 = (short[]) newShortArray(32);
        int[] term28877 = (int[]) newIntArray(32);
        Object[] term28910 = (Object[]) newArray("java.lang.Object", 32);
        long[] term28976 = (long[]) newLongArray(32);
        Object[] term29009 = (Object[]) newArray("java.lang.Object", 5);
        short[] term29010 = (short[]) newShortArray(32);
        int[] term29043 = (int[]) newIntArray(32);
        Object[] term29076 = (Object[]) newArray("java.lang.Object", 32);
        long[] term29081 = (long[]) newLongArray(32);
        Object[] term29126 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term29128 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term28844, 0, (short) 1);
        setShortElement(term28844, 1, (short) 2);
        setShortElement(term28844, 2, (short) 1);
        setShortElement(term28844, 3, (short) 7);
        setShortElement(term28844, 4, (short) 2);
        setShortElement(term28844, 5, (short) 1);
        setShortElement(term28844, 6, (short) 6);
        setShortElement(term28844, 7, (short) 2);
        setShortElement(term28844, 8, (short) 10);
        setShortElement(term28844, 9, (short) 11);
        setShortElement(term28844, 10, (short) 29);
        setShortElement(term28844, 11, (short) 5);
        setShortElement(term28844, 12, (short) 4);
        setShortElement(term28844, 13, (short) 6);
        setShortElement(term28844, 14, (short) 8);
        setShortElement(term28844, 15, (short) 6);
        setShortElement(term28844, 16, (short) 9);
        setShortElement(term28844, 17, (short) 10);
        setShortElement(term28844, 18, (short) 11);
        setShortElement(term28844, 19, (short) 4);
        setShortElement(term28844, 20, (short) 1);
        setShortElement(term28844, 22, (short) 10);
        setShortElement(term28844, 23, (short) 3);
        setShortElement(term28844, 24, (short) 4);
        setShortElement(term28844, 25, (short) 9);
        setShortElement(term28844, 26, (short) 1);
        setShortElement(term28844, 27, (short) 2);
        setShortElement(term28844, 28, (short) 3);
        setShortElement(term28844, 29, (short) 3);
        setShortElement(term28844, 30, (short) 13);
        setShortElement(term28844, 31, (short) 1);
        setElement(term28843, 0, term28844);
        setIntElement(term28877, 1, 5570560);
        setIntElement(term28877, 2, 327680);
        setIntElement(term28877, 3, 4456454);
        setIntElement(term28877, 4, 1769472);
        setIntElement(term28877, 5, 14876672);
        setIntElement(term28877, 6, 6225920);
        setIntElement(term28877, 7, 917504);
        setIntElement(term28877, 8, 327680);
        setIntElement(term28877, 9, 8519680);
        setIntElement(term28877, 10, 917504);
        setIntElement(term28877, 11, 11993088);
        setIntElement(term28877, 12, 655360);
        setIntElement(term28877, 13, 7864320);
        setIntElement(term28877, 14, 3735552);
        setIntElement(term28877, 15, 7143424);
        setIntElement(term28877, 16, 8454144);
        setIntElement(term28877, 17, 9240576);
        setIntElement(term28877, 18, 196608);
        setIntElement(term28877, 19, 3801088);
        setIntElement(term28877, 20, 786432);
        setIntElement(term28877, 21, 589824);
        setIntElement(term28877, 22, 17170432);
        setIntElement(term28877, 23, 1376256);
        setIntElement(term28877, 24, 5242880);
        setIntElement(term28877, 25, 2883584);
        setIntElement(term28877, 26, 20774912);
        setIntElement(term28877, 27, 262144);
        setIntElement(term28877, 28, 2555904);
        setIntElement(term28877, 29, 1835008);
        setIntElement(term28877, 30, 6029312);
        setIntElement(term28877, 31, 327680);
        setElement(term28843, 1, term28877);
        setElement(term28910, 0, term28911);
        setElement(term28910, 1, term28911);
        setElement(term28910, 2, term28914);
        setElement(term28910, 3, term28916);
        setElement(term28910, 4, term28920);
        setElement(term28910, 5, term28920);
        setElement(term28910, 6, term28925);
        setElement(term28910, 7, term28925);
        setElement(term28910, 8, term28929);
        setElement(term28910, 9, term28929);
        setElement(term28910, 10, term28929);
        setElement(term28910, 11, term28929);
        setElement(term28910, 12, term28929);
        setElement(term28910, 13, term28933);
        setElement(term28910, 14, term28933);
        setElement(term28910, 15, term28937);
        setElement(term28910, 16, term28937);
        setElement(term28910, 17, term28937);
        setElement(term28910, 18, term28937);
        setElement(term28910, 19, term28941);
        setElement(term28910, 20, term28941);
        setElement(term28910, 21, term28941);
        setElement(term28910, 22, term28945);
        setElement(term28910, 23, term28937);
        setElement(term28910, 24, term28949);
        setElement(term28910, 25, term28953);
        setElement(term28910, 26, term28957);
        setElement(term28910, 27, term28961);
        setElement(term28910, 28, term28964);
        setElement(term28910, 29, term28967);
        setElement(term28910, 30, term28970);
        setElement(term28910, 31, term28973);
        setElement(term28843, 2, term28910);
        setLongElement(term28976, 0, 34363746224L);
        setLongElement(term28976, 1, 34363775512L);
        setLongElement(term28976, 2, 34363775512L);
        setLongElement(term28976, 3, 34363775512L);
        setLongElement(term28976, 4, 131482375099808L);
        setLongElement(term28976, 5, 34364440080L);
        setLongElement(term28976, 6, 131482375166912L);
        setLongElement(term28976, 7, 131482375009648L);
        setLongElement(term28976, 8, 131482375009536L);
        setLongElement(term28976, 9, 131482375009680L);
        setLongElement(term28976, 10, 131482375053392L);
        setLongElement(term28976, 11, 34363766248L);
        setLongElement(term28976, 12, 34363766248L);
        setLongElement(term28976, 13, 131478873767568L);
        setLongElement(term28976, 14, 131478873767568L);
        setLongElement(term28976, 15, 131478873767424L);
        setLongElement(term28976, 16, 131478873811328L);
        setLongElement(term28976, 17, 131478873812976L);
        setLongElement(term28976, 18, 131478873813744L);
        setLongElement(term28976, 19, 131482377128080L);
        setLongElement(term28976, 20, 34363739368L);
        setLongElement(term28976, 21, 34363739368L);
        setLongElement(term28976, 22, 131478873766064L);
        setLongElement(term28976, 23, 34363829248L);
        setLongElement(term28976, 24, 131482377128080L);
        setLongElement(term28976, 25, 131482377482976L);
        setLongElement(term28976, 26, 34363745472L);
        setLongElement(term28976, 27, 34364710216L);
        setLongElement(term28976, 28, 34363745472L);
        setLongElement(term28976, 29, 34363745472L);
        setLongElement(term28976, 30, 34364896224L);
        setLongElement(term28976, 31, 34363745472L);
        setElement(term28843, 3, term28976);
        setShortElement(term29010, 0, (short) 2);
        setShortElement(term29010, 1, (short) 12);
        setElement(term29009, 0, term29010);
        setIntElement(term29043, 0, 1638400);
        setIntElement(term29043, 1, 720907);
        setElement(term29009, 1, term29043);
        setElement(term29076, 0, term29077);
        setElement(term29076, 1, term29079);
        setElement(term29009, 2, term29076);
        setLongElement(term29081, 0, 34363745472L);
        setLongElement(term29081, 1, 34363745472L);
        setElement(term29009, 3, term29081);
        setElement(term28843, 4, term29009);
        setField(term28842, term28842.getClass(), "backtrace", term28843);
        setField(term28842, term28842.getClass(), "detailMessage", "BYqFIqCKAV");
        setField(term28842, term28842.getClass(), "cause", term28842);
        setField(term28842, term28842.getClass(), "stackTrace", term29126);
        setIntField(term28842, term28842.getClass(), "depth", 34);
        setIntField(term29128, term29128.getClass(), "modCount", 0);
        setField(term28842, term28842.getClass(), "suppressedExceptions", term29128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term28842;
        args[1] = "vrQLuWIDJX";
        try {
            callMethod(klass, "unwrapAndThrowAsIAE", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


