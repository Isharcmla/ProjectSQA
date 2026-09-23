package com.fasterxml.jackson.databind.deser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class BeanDeserializerBase_wrapAndThrow_211907288995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3007;
     Object term3291;
     Object term3292;

    public BeanDeserializerBase_wrapAndThrow_211907288995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3076 = Class.forName((String) "java.util.stream.ReduceOps$AccumulatingSink");
        Class<? extends Object> term3079 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiRelay");
        Class<? extends Object> term3081 = Class.forName((String) "java.util.TreeMap$KeySpliterator");
        Class<? extends Object> term3085 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfLong");
        Class<? extends Object> term3090 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ExceptionTableEntry");
        Class<? extends Object> term3094 = Class.forName((String) "java.util.function.DoubleUnaryOperator");
        Class<? extends Object> term3098 = Class.forName((String) "java.util.stream.DoubleStream");
        Class<? extends Object> term3102 = Class.forName((String) "com.fasterxml.jackson.databind.JsonMappingException");
        Class<? extends Object> term3106 = Class.forName((String) "java.util.stream.SortedOps$SizedLongSortingSink");
        Class<? extends Object> term3110 = Class.forName((String) "java.lang.invoke.MethodType$OffsetHolder");
        Class<? extends Object> term3114 = Class.forName((String) "java.lang.module.ModuleDescriptor$Requires$Modifier");
        Class<? extends Object> term3118 = Class.forName((String) "java.lang.reflect.Method");
        Class<? extends Object> term3122 = Class.forName((String) "java.util.GregorianCalendar");
        Class<? extends Object> term3126 = Class.forName((String) "java.util.stream.ReduceOps$3");
        Class<? extends Object> term3128 = Class.forName((String) "java.util.jar.JarVerifier$VerifierStream");
        Class<? extends Object> term3131 = Class.forName((String) "com.fasterxml.jackson.core.io.NumberOutput");
        Class<? extends Object> term3133 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Class<? extends Object> term3135 = Class.forName((String) "java.io.FileInputStream$AltFinalizer");
        Class<? extends Object> term3238 = Class.forName((String) "java.util.Properties$LineReader");
        Class<? extends Object> term3240 = Class.forName((String) "java.io.ObjectStreamClass$FieldReflector");
        term3007 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3008 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3009 = (short[]) newShortArray(32);
        int[] term3042 = (int[]) newIntArray(32);
        Object[] term3075 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3137 = (long[]) newLongArray(32);
        Object[] term3170 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3171 = (short[]) newShortArray(32);
        int[] term3204 = (int[]) newIntArray(32);
        Object[] term3237 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3242 = (long[]) newLongArray(32);
        Object[] term3287 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3289 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3009, 0, (short) 1);
        setShortElement(term3009, 1, (short) 2);
        setShortElement(term3009, 2, (short) 1);
        setShortElement(term3009, 3, (short) 7);
        setShortElement(term3009, 4, (short) 2);
        setShortElement(term3009, 5, (short) 1);
        setShortElement(term3009, 6, (short) 6);
        setShortElement(term3009, 7, (short) 2);
        setShortElement(term3009, 8, (short) 10);
        setShortElement(term3009, 9, (short) 11);
        setShortElement(term3009, 10, (short) 29);
        setShortElement(term3009, 11, (short) 5);
        setShortElement(term3009, 12, (short) 4);
        setShortElement(term3009, 13, (short) 5);
        setShortElement(term3009, 14, (short) 6);
        setShortElement(term3009, 15, (short) 6);
        setShortElement(term3009, 16, (short) 9);
        setShortElement(term3009, 17, (short) 10);
        setShortElement(term3009, 18, (short) 11);
        setShortElement(term3009, 19, (short) 4);
        setShortElement(term3009, 20, (short) 1);
        setShortElement(term3009, 23, (short) 3);
        setShortElement(term3009, 24, (short) 4);
        setShortElement(term3009, 25, (short) 4);
        setShortElement(term3009, 26, (short) 1);
        setShortElement(term3009, 27, (short) 2);
        setShortElement(term3009, 28, (short) 3);
        setShortElement(term3009, 29, (short) 3);
        setShortElement(term3009, 30, (short) 13);
        setShortElement(term3009, 31, (short) 1);
        setElement(term3008, 0, term3009);
        setIntElement(term3042, 1, 5570560);
        setIntElement(term3042, 2, 327680);
        setIntElement(term3042, 3, 4456454);
        setIntElement(term3042, 4, 1769472);
        setIntElement(term3042, 5, 14876672);
        setIntElement(term3042, 6, 6225920);
        setIntElement(term3042, 7, 917504);
        setIntElement(term3042, 8, 327680);
        setIntElement(term3042, 9, 8519680);
        setIntElement(term3042, 10, 917504);
        setIntElement(term3042, 11, 11993088);
        setIntElement(term3042, 12, 655360);
        setIntElement(term3042, 13, 7864320);
        setIntElement(term3042, 14, 3735552);
        setIntElement(term3042, 15, 7143424);
        setIntElement(term3042, 16, 8454144);
        setIntElement(term3042, 17, 9240576);
        setIntElement(term3042, 18, 196608);
        setIntElement(term3042, 19, 3801088);
        setIntElement(term3042, 20, 786432);
        setIntElement(term3042, 21, 589824);
        setIntElement(term3042, 22, 17170432);
        setIntElement(term3042, 23, 1376256);
        setIntElement(term3042, 24, 5242880);
        setIntElement(term3042, 25, 2883584);
        setIntElement(term3042, 26, 20774912);
        setIntElement(term3042, 27, 262144);
        setIntElement(term3042, 28, 2555904);
        setIntElement(term3042, 29, 1835008);
        setIntElement(term3042, 30, 6029312);
        setIntElement(term3042, 31, 327680);
        setElement(term3008, 1, term3042);
        setElement(term3075, 0, term3076);
        setElement(term3075, 1, term3076);
        setElement(term3075, 2, term3079);
        setElement(term3075, 3, term3081);
        setElement(term3075, 4, term3085);
        setElement(term3075, 5, term3085);
        setElement(term3075, 6, term3090);
        setElement(term3075, 7, term3090);
        setElement(term3075, 8, term3094);
        setElement(term3075, 9, term3094);
        setElement(term3075, 10, term3094);
        setElement(term3075, 11, term3094);
        setElement(term3075, 12, term3094);
        setElement(term3075, 13, term3098);
        setElement(term3075, 14, term3098);
        setElement(term3075, 15, term3102);
        setElement(term3075, 16, term3102);
        setElement(term3075, 17, term3102);
        setElement(term3075, 18, term3102);
        setElement(term3075, 19, term3106);
        setElement(term3075, 20, term3106);
        setElement(term3075, 21, term3106);
        setElement(term3075, 22, term3110);
        setElement(term3075, 23, term3102);
        setElement(term3075, 24, term3114);
        setElement(term3075, 25, term3118);
        setElement(term3075, 26, term3122);
        setElement(term3075, 27, term3126);
        setElement(term3075, 28, term3128);
        setElement(term3075, 29, term3131);
        setElement(term3075, 30, term3133);
        setElement(term3075, 31, term3135);
        setElement(term3008, 2, term3075);
        setLongElement(term3137, 0, 34363746224L);
        setLongElement(term3137, 1, 34363775512L);
        setLongElement(term3137, 2, 34363775512L);
        setLongElement(term3137, 3, 34363775512L);
        setLongElement(term3137, 4, 127102448043280L);
        setLongElement(term3137, 5, 34364440080L);
        setLongElement(term3137, 6, 127102448110432L);
        setLongElement(term3137, 7, 127102447950512L);
        setLongElement(term3137, 8, 127102447950400L);
        setLongElement(term3137, 9, 127102447950544L);
        setLongElement(term3137, 10, 127102447996864L);
        setLongElement(term3137, 11, 34363766248L);
        setLongElement(term3137, 12, 34363766248L);
        setLongElement(term3137, 13, 127099392863808L);
        setLongElement(term3137, 14, 127099392863808L);
        setLongElement(term3137, 15, 127099392863664L);
        setLongElement(term3137, 16, 127099392908224L);
        setLongElement(term3137, 17, 127099392909872L);
        setLongElement(term3137, 18, 127099392910640L);
        setLongElement(term3137, 19, 127099389837984L);
        setLongElement(term3137, 20, 34363739368L);
        setLongElement(term3137, 21, 34363739368L);
        setLongElement(term3137, 22, 127099392862304L);
        setLongElement(term3137, 23, 34363829248L);
        setLongElement(term3137, 24, 127099389837984L);
        setLongElement(term3137, 25, 127099389022368L);
        setLongElement(term3137, 26, 34363745472L);
        setLongElement(term3137, 27, 34364710216L);
        setLongElement(term3137, 28, 34363745472L);
        setLongElement(term3137, 29, 34363745472L);
        setLongElement(term3137, 30, 34364896224L);
        setLongElement(term3137, 31, 34363745472L);
        setElement(term3008, 3, term3137);
        setShortElement(term3171, 0, (short) 2);
        setShortElement(term3171, 1, (short) 12);
        setElement(term3170, 0, term3171);
        setIntElement(term3204, 0, 1638400);
        setIntElement(term3204, 1, 720907);
        setElement(term3170, 1, term3204);
        setElement(term3237, 0, term3238);
        setElement(term3237, 1, term3240);
        setElement(term3170, 2, term3237);
        setLongElement(term3242, 0, 34363745472L);
        setLongElement(term3242, 1, 34363745472L);
        setElement(term3170, 3, term3242);
        setElement(term3008, 4, term3170);
        setField(term3007, term3007.getClass(), "backtrace", term3008);
        setField(term3007, term3007.getClass(), "detailMessage", "hRNSzYYIrc");
        setField(term3007, term3007.getClass(), "cause", term3007);
        setField(term3007, term3007.getClass(), "stackTrace", term3287);
        setIntField(term3007, term3007.getClass(), "depth", 34);
        setIntField(term3289, term3289.getClass(), "modCount", 0);
        setField(term3007, term3007.getClass(), "suppressedExceptions", term3289);
        term3291 = newInstance(Class.forName("java.lang.Object"));
        term3292 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[4];
        args[0] = term3007;
        args[1] = term3291;
        args[2] = term3292;
        args[3] = null;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


