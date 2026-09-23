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

public class SettableBeanProperty_throwAsIOE_183010985165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6138;

    public SettableBeanProperty_throwAsIOE_183010985165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6207 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        Class<? extends Object> term6210 = Class.forName((String) "java.util.Calendar$1");
        Class<? extends Object> term6212 = Class.forName((String) "java.io.ObjectStreamConstants");
        Class<? extends Object> term6216 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term6221 = Class.forName((String) "java.util.SortedSet$1");
        Class<? extends Object> term6225 = Class.forName((String) "java.util.stream.ReduceOps$Box");
        Class<? extends Object> term6229 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term6233 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Class<? extends Object> term6237 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Merger");
        Class<? extends Object> term6241 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<? extends Object> term6245 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        Class<? extends Object> term6249 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        Class<? extends Object> term6253 = Class.forName((String) "java.lang.ref.Finalizer$1");
        Class<? extends Object> term6257 = Class.forName((String) "java.util.LinkedHashSet");
        Class<? extends Object> term6260 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term6263 = Class.forName((String) "java.util.AbstractMap$2");
        Class<? extends Object> term6266 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term6269 = Class.forName((String) "com.fasterxml.jackson.databind.ser.package-info");
        Class<? extends Object> term6373 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term6375 = Class.forName((String) "java.util.BitSet");
        term6138 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term6139 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6140 = (short[]) newShortArray(32);
        int[] term6173 = (int[]) newIntArray(32);
        Object[] term6206 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6272 = (long[]) newLongArray(32);
        Object[] term6305 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6306 = (short[]) newShortArray(32);
        int[] term6339 = (int[]) newIntArray(32);
        Object[] term6372 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6377 = (long[]) newLongArray(32);
        Object[] term6422 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6424 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6140, 0, (short) 1);
        setShortElement(term6140, 1, (short) 2);
        setShortElement(term6140, 2, (short) 1);
        setShortElement(term6140, 3, (short) 7);
        setShortElement(term6140, 4, (short) 2);
        setShortElement(term6140, 5, (short) 1);
        setShortElement(term6140, 6, (short) 6);
        setShortElement(term6140, 7, (short) 2);
        setShortElement(term6140, 8, (short) 10);
        setShortElement(term6140, 9, (short) 11);
        setShortElement(term6140, 10, (short) 29);
        setShortElement(term6140, 11, (short) 5);
        setShortElement(term6140, 12, (short) 4);
        setShortElement(term6140, 13, (short) 5);
        setShortElement(term6140, 14, (short) 6);
        setShortElement(term6140, 15, (short) 6);
        setShortElement(term6140, 16, (short) 9);
        setShortElement(term6140, 17, (short) 10);
        setShortElement(term6140, 18, (short) 11);
        setShortElement(term6140, 19, (short) 4);
        setShortElement(term6140, 20, (short) 1);
        setShortElement(term6140, 23, (short) 3);
        setShortElement(term6140, 24, (short) 4);
        setShortElement(term6140, 25, (short) 4);
        setShortElement(term6140, 26, (short) 1);
        setShortElement(term6140, 27, (short) 2);
        setShortElement(term6140, 28, (short) 3);
        setShortElement(term6140, 29, (short) 3);
        setShortElement(term6140, 30, (short) 13);
        setShortElement(term6140, 31, (short) 1);
        setElement(term6139, 0, term6140);
        setIntElement(term6173, 1, 5570560);
        setIntElement(term6173, 2, 327680);
        setIntElement(term6173, 3, 4456454);
        setIntElement(term6173, 4, 1769472);
        setIntElement(term6173, 5, 14876672);
        setIntElement(term6173, 6, 6225920);
        setIntElement(term6173, 7, 917504);
        setIntElement(term6173, 8, 327680);
        setIntElement(term6173, 9, 8519680);
        setIntElement(term6173, 10, 917504);
        setIntElement(term6173, 11, 11993088);
        setIntElement(term6173, 12, 655360);
        setIntElement(term6173, 13, 7864320);
        setIntElement(term6173, 14, 3735552);
        setIntElement(term6173, 15, 7143424);
        setIntElement(term6173, 16, 8454144);
        setIntElement(term6173, 17, 9240576);
        setIntElement(term6173, 18, 196608);
        setIntElement(term6173, 19, 3801088);
        setIntElement(term6173, 20, 786432);
        setIntElement(term6173, 21, 589824);
        setIntElement(term6173, 22, 17170432);
        setIntElement(term6173, 23, 1376256);
        setIntElement(term6173, 24, 5242880);
        setIntElement(term6173, 25, 2883584);
        setIntElement(term6173, 26, 20774912);
        setIntElement(term6173, 27, 262144);
        setIntElement(term6173, 28, 2555904);
        setIntElement(term6173, 29, 1835008);
        setIntElement(term6173, 30, 6029312);
        setIntElement(term6173, 31, 327680);
        setElement(term6139, 1, term6173);
        setElement(term6206, 0, term6207);
        setElement(term6206, 1, term6207);
        setElement(term6206, 2, term6210);
        setElement(term6206, 3, term6212);
        setElement(term6206, 4, term6216);
        setElement(term6206, 5, term6216);
        setElement(term6206, 6, term6221);
        setElement(term6206, 7, term6221);
        setElement(term6206, 8, term6225);
        setElement(term6206, 9, term6225);
        setElement(term6206, 10, term6225);
        setElement(term6206, 11, term6225);
        setElement(term6206, 12, term6225);
        setElement(term6206, 13, term6229);
        setElement(term6206, 14, term6229);
        setElement(term6206, 15, term6233);
        setElement(term6206, 16, term6233);
        setElement(term6206, 17, term6233);
        setElement(term6206, 18, term6233);
        setElement(term6206, 19, term6237);
        setElement(term6206, 20, term6237);
        setElement(term6206, 21, term6237);
        setElement(term6206, 22, term6241);
        setElement(term6206, 23, term6233);
        setElement(term6206, 24, term6245);
        setElement(term6206, 25, term6249);
        setElement(term6206, 26, term6253);
        setElement(term6206, 27, term6257);
        setElement(term6206, 28, term6260);
        setElement(term6206, 29, term6263);
        setElement(term6206, 30, term6266);
        setElement(term6206, 31, term6269);
        setElement(term6139, 2, term6206);
        setLongElement(term6272, 0, 34363746224L);
        setLongElement(term6272, 1, 34363775512L);
        setLongElement(term6272, 2, 34363775512L);
        setLongElement(term6272, 3, 34363775512L);
        setLongElement(term6272, 4, 134804263765536L);
        setLongElement(term6272, 5, 34364440080L);
        setLongElement(term6272, 6, 134804263832688L);
        setLongElement(term6272, 7, 134804263671680L);
        setLongElement(term6272, 8, 134804263671568L);
        setLongElement(term6272, 9, 134804263671712L);
        setLongElement(term6272, 10, 134804263719168L);
        setLongElement(term6272, 11, 34363766248L);
        setLongElement(term6272, 12, 34363766248L);
        setLongElement(term6272, 13, 134800737169776L);
        setLongElement(term6272, 14, 134800737169776L);
        setLongElement(term6272, 15, 134800737169632L);
        setLongElement(term6272, 16, 134800737173936L);
        setLongElement(term6272, 17, 134800737175584L);
        setLongElement(term6272, 18, 134800737176352L);
        setLongElement(term6272, 19, 134804265399984L);
        setLongElement(term6272, 20, 34363739368L);
        setLongElement(term6272, 21, 34363739368L);
        setLongElement(term6272, 22, 134800737127424L);
        setLongElement(term6272, 23, 34363829248L);
        setLongElement(term6272, 24, 134804265399984L);
        setLongElement(term6272, 25, 134800734005568L);
        setLongElement(term6272, 26, 34363745472L);
        setLongElement(term6272, 27, 34364710216L);
        setLongElement(term6272, 28, 34363745472L);
        setLongElement(term6272, 29, 34363745472L);
        setLongElement(term6272, 30, 34364896224L);
        setLongElement(term6272, 31, 34363745472L);
        setElement(term6139, 3, term6272);
        setShortElement(term6306, 0, (short) 2);
        setShortElement(term6306, 1, (short) 12);
        setElement(term6305, 0, term6306);
        setIntElement(term6339, 0, 1638400);
        setIntElement(term6339, 1, 720907);
        setElement(term6305, 1, term6339);
        setElement(term6372, 0, term6373);
        setElement(term6372, 1, term6375);
        setElement(term6305, 2, term6372);
        setLongElement(term6377, 0, 34363745472L);
        setLongElement(term6377, 1, 34363745472L);
        setElement(term6305, 3, term6377);
        setElement(term6139, 4, term6305);
        setField(term6138, term6138.getClass(), "backtrace", term6139);
        setField(term6138, term6138.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term6138, term6138.getClass(), "cause", term6138);
        setField(term6138, term6138.getClass(), "stackTrace", term6422);
        setIntField(term6138, term6138.getClass(), "depth", 34);
        setIntField(term6424, term6424.getClass(), "modCount", 0);
        setField(term6138, term6138.getClass(), "suppressedExceptions", term6424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Exception");
        Object[] args = new Object[1];
        args[0] = term6138;
        try {
            callMethod(klass, "_throwAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


