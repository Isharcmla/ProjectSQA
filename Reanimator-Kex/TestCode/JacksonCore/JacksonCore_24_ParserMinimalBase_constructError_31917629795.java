package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ParserMinimalBase_constructError_31917629795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3154;

    public ParserMinimalBase_constructError_31917629795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3223 = Class.forName((String) "java.lang.SecurityManager$2");
        Class<? extends Object> term3226 = Class.forName((String) "java.util.regex.IntHashSet");
        Class<? extends Object> term3228 = Class.forName((String) "java.lang.Number");
        Class<? extends Object> term3232 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor");
        Class<? extends Object> term3237 = Class.forName((String) "java.nio.file.PathMatcher");
        Class<? extends Object> term3241 = Class.forName((String) "java.io.SerializablePermission");
        Class<? extends Object> term3245 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferL");
        Class<? extends Object> term3249 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs");
        Class<? extends Object> term3253 = Class.forName((String) "java.lang.IllegalMonitorStateException");
        Class<? extends Object> term3257 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Mode");
        Class<? extends Object> term3261 = Class.forName((String) "java.util.concurrent.CompletableFuture$Delayer");
        Class<? extends Object> term3265 = Class.forName((String) "java.util.stream.Node$OfLong");
        Class<? extends Object> term3269 = Class.forName((String) "java.lang.invoke.VarHandles");
        Class<? extends Object> term3273 = Class.forName((String) "java.lang.ThreadLocal$ThreadLocalMap$Entry");
        Class<? extends Object> term3276 = Class.forName((String) "java.util.HashSet");
        Class<? extends Object> term3279 = Class.forName((String) "java.nio.file.attribute.BasicFileAttributes");
        Class<? extends Object> term3282 = Class.forName((String) "java.util.stream.LongPipeline$7");
        Class<? extends Object> term3285 = Class.forName((String) "java.util.concurrent.LinkedTransferQueue$Node");
        Class<? extends Object> term3389 = Class.forName((String) "java.lang.invoke.MethodHandle");
        Class<? extends Object> term3391 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$Iter");
        term3154 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3155 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3156 = (short[]) newShortArray(32);
        int[] term3189 = (int[]) newIntArray(32);
        Object[] term3222 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3288 = (long[]) newLongArray(32);
        Object[] term3321 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3322 = (short[]) newShortArray(32);
        int[] term3355 = (int[]) newIntArray(32);
        Object[] term3388 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3393 = (long[]) newLongArray(32);
        Object[] term3438 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3440 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3156, 0, (short) 1);
        setShortElement(term3156, 1, (short) 2);
        setShortElement(term3156, 2, (short) 1);
        setShortElement(term3156, 3, (short) 7);
        setShortElement(term3156, 4, (short) 2);
        setShortElement(term3156, 5, (short) 1);
        setShortElement(term3156, 6, (short) 6);
        setShortElement(term3156, 7, (short) 2);
        setShortElement(term3156, 8, (short) 9);
        setShortElement(term3156, 9, (short) 10);
        setShortElement(term3156, 10, (short) 29);
        setShortElement(term3156, 11, (short) 4);
        setShortElement(term3156, 12, (short) 5);
        setShortElement(term3156, 13, (short) 5);
        setShortElement(term3156, 14, (short) 6);
        setShortElement(term3156, 15, (short) 7);
        setShortElement(term3156, 16, (short) 10);
        setShortElement(term3156, 17, (short) 11);
        setShortElement(term3156, 18, (short) 12);
        setShortElement(term3156, 19, (short) 4);
        setShortElement(term3156, 20, (short) 1);
        setShortElement(term3156, 23, (short) 3);
        setShortElement(term3156, 24, (short) 4);
        setShortElement(term3156, 25, (short) 4);
        setShortElement(term3156, 26, (short) 1);
        setShortElement(term3156, 27, (short) 2);
        setShortElement(term3156, 28, (short) 3);
        setShortElement(term3156, 29, (short) 3);
        setShortElement(term3156, 30, (short) 13);
        setShortElement(term3156, 31, (short) 1);
        setElement(term3155, 0, term3156);
        setIntElement(term3189, 1, 5570560);
        setIntElement(term3189, 2, 327680);
        setIntElement(term3189, 3, 4456454);
        setIntElement(term3189, 4, 1769472);
        setIntElement(term3189, 5, 14876672);
        setIntElement(term3189, 6, 6225920);
        setIntElement(term3189, 7, 917504);
        setIntElement(term3189, 8, 327680);
        setIntElement(term3189, 9, 8519680);
        setIntElement(term3189, 10, 917504);
        setIntElement(term3189, 11, 11993088);
        setIntElement(term3189, 12, 655360);
        setIntElement(term3189, 13, 7864320);
        setIntElement(term3189, 14, 3735552);
        setIntElement(term3189, 15, 7143424);
        setIntElement(term3189, 16, 8454144);
        setIntElement(term3189, 17, 9240576);
        setIntElement(term3189, 18, 196608);
        setIntElement(term3189, 19, 3801088);
        setIntElement(term3189, 20, 786432);
        setIntElement(term3189, 21, 589824);
        setIntElement(term3189, 22, 17170432);
        setIntElement(term3189, 23, 1376256);
        setIntElement(term3189, 24, 5242880);
        setIntElement(term3189, 25, 2883584);
        setIntElement(term3189, 26, 20774912);
        setIntElement(term3189, 27, 262144);
        setIntElement(term3189, 28, 2555904);
        setIntElement(term3189, 29, 1835008);
        setIntElement(term3189, 30, 6029312);
        setIntElement(term3189, 31, 327680);
        setElement(term3155, 1, term3189);
        setElement(term3222, 0, term3223);
        setElement(term3222, 1, term3223);
        setElement(term3222, 2, term3226);
        setElement(term3222, 3, term3228);
        setElement(term3222, 4, term3232);
        setElement(term3222, 5, term3232);
        setElement(term3222, 6, term3237);
        setElement(term3222, 7, term3237);
        setElement(term3222, 8, term3241);
        setElement(term3222, 9, term3241);
        setElement(term3222, 10, term3241);
        setElement(term3222, 11, term3241);
        setElement(term3222, 12, term3241);
        setElement(term3222, 13, term3245);
        setElement(term3222, 14, term3245);
        setElement(term3222, 15, term3249);
        setElement(term3222, 16, term3249);
        setElement(term3222, 17, term3249);
        setElement(term3222, 18, term3249);
        setElement(term3222, 19, term3253);
        setElement(term3222, 20, term3253);
        setElement(term3222, 21, term3253);
        setElement(term3222, 22, term3257);
        setElement(term3222, 23, term3249);
        setElement(term3222, 24, term3261);
        setElement(term3222, 25, term3265);
        setElement(term3222, 26, term3269);
        setElement(term3222, 27, term3273);
        setElement(term3222, 28, term3276);
        setElement(term3222, 29, term3279);
        setElement(term3222, 30, term3282);
        setElement(term3222, 31, term3285);
        setElement(term3155, 2, term3222);
        setLongElement(term3288, 0, 34363746224L);
        setLongElement(term3288, 1, 34363775512L);
        setLongElement(term3288, 2, 34363775512L);
        setLongElement(term3288, 3, 34363775512L);
        setLongElement(term3288, 4, 134967204021216L);
        setLongElement(term3288, 5, 34364440080L);
        setLongElement(term3288, 6, 134967204097408L);
        setLongElement(term3288, 7, 134967203935840L);
        setLongElement(term3288, 8, 134967203935728L);
        setLongElement(term3288, 9, 134967203935872L);
        setLongElement(term3288, 10, 134967203983072L);
        setLongElement(term3288, 11, 34363766248L);
        setLongElement(term3288, 12, 34363766248L);
        setLongElement(term3288, 13, 134964287964304L);
        setLongElement(term3288, 14, 134964287964304L);
        setLongElement(term3288, 15, 134964287964160L);
        setLongElement(term3288, 16, 134964287968192L);
        setLongElement(term3288, 17, 134964287969840L);
        setLongElement(term3288, 18, 134964287970608L);
        setLongElement(term3288, 19, 134964284896464L);
        setLongElement(term3288, 20, 34363739368L);
        setLongElement(term3288, 21, 34363739368L);
        setLongElement(term3288, 22, 134964287923696L);
        setLongElement(term3288, 23, 34363829248L);
        setLongElement(term3288, 24, 134964284896464L);
        setLongElement(term3288, 25, 134964284764432L);
        setLongElement(term3288, 26, 34363745472L);
        setLongElement(term3288, 27, 34364710216L);
        setLongElement(term3288, 28, 34363745472L);
        setLongElement(term3288, 29, 34363745472L);
        setLongElement(term3288, 30, 34364896224L);
        setLongElement(term3288, 31, 34363745472L);
        setElement(term3155, 3, term3288);
        setShortElement(term3322, 0, (short) 2);
        setShortElement(term3322, 1, (short) 12);
        setElement(term3321, 0, term3322);
        setIntElement(term3355, 0, 1638400);
        setIntElement(term3355, 1, 720907);
        setElement(term3321, 1, term3355);
        setElement(term3388, 0, term3389);
        setElement(term3388, 1, term3391);
        setElement(term3321, 2, term3388);
        setLongElement(term3393, 0, 34363745472L);
        setLongElement(term3393, 1, 34363745472L);
        setElement(term3321, 3, term3393);
        setElement(term3155, 4, term3321);
        setField(term3154, term3154.getClass(), "backtrace", term3155);
        setField(term3154, term3154.getClass(), "detailMessage", "pCTimMblYc");
        setField(term3154, term3154.getClass(), "cause", term3154);
        setField(term3154, term3154.getClass(), "stackTrace", term3438);
        setIntField(term3154, term3154.getClass(), "depth", 34);
        setIntField(term3440, term3440.getClass(), "modCount", 0);
        setField(term3154, term3154.getClass(), "suppressedExceptions", term3440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = "HyxfbSQYBe";
        args[1] = term3154;
        try {
            callMethod(klass, "_constructError", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


