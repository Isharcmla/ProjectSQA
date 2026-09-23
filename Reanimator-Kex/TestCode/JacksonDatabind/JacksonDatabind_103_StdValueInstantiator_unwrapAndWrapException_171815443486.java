package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_unwrapAndWrapException_171815443486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3109;

    public StdValueInstantiator_unwrapAndWrapException_171815443486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3178 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldStaticReadOnly");
        Class<? extends Object> term3181 = Class.forName((String) "java.util.stream.IntPipeline$1");
        Class<? extends Object> term3183 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        Class<? extends Object> term3187 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        Class<? extends Object> term3192 = Class.forName((String) "java.util.Calendar$1");
        Class<? extends Object> term3196 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term3200 = Class.forName((String) "java.util.SortedSet$1");
        Class<? extends Object> term3204 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Class<? extends Object> term3208 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<? extends Object> term3212 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        Class<? extends Object> term3216 = Class.forName((String) "com.fasterxml.jackson.databind.ser.package-info");
        Class<? extends Object> term3220 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term3224 = Class.forName((String) "java.util.jar.JarInputStream");
        Class<? extends Object> term3228 = Class.forName((String) "java.lang.InheritableThreadLocal");
        Class<? extends Object> term3231 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecyclers");
        Class<? extends Object> term3234 = Class.forName((String) "java.util.UUID");
        Class<? extends Object> term3237 = Class.forName((String) "java.lang.invoke.MethodType$OffsetHolder");
        Class<? extends Object> term3240 = Class.forName((String) "java.util.function.IntToDoubleFunction");
        Class<? extends Object> term3344 = Class.forName((String) "java.util.stream.ReduceOps$3");
        Class<? extends Object> term3346 = Class.forName((String) "java.util.stream.SortedOps$SizedRefSortingSink");
        term3109 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3110 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3111 = (short[]) newShortArray(32);
        int[] term3144 = (int[]) newIntArray(32);
        Object[] term3177 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3243 = (long[]) newLongArray(32);
        Object[] term3276 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3277 = (short[]) newShortArray(32);
        int[] term3310 = (int[]) newIntArray(32);
        Object[] term3343 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3348 = (long[]) newLongArray(32);
        Object[] term3393 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3395 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3111, 0, (short) 1);
        setShortElement(term3111, 1, (short) 2);
        setShortElement(term3111, 2, (short) 1);
        setShortElement(term3111, 3, (short) 7);
        setShortElement(term3111, 4, (short) 2);
        setShortElement(term3111, 5, (short) 1);
        setShortElement(term3111, 6, (short) 6);
        setShortElement(term3111, 7, (short) 2);
        setShortElement(term3111, 8, (short) 10);
        setShortElement(term3111, 9, (short) 11);
        setShortElement(term3111, 10, (short) 29);
        setShortElement(term3111, 11, (short) 5);
        setShortElement(term3111, 12, (short) 4);
        setShortElement(term3111, 13, (short) 5);
        setShortElement(term3111, 14, (short) 6);
        setShortElement(term3111, 15, (short) 6);
        setShortElement(term3111, 16, (short) 9);
        setShortElement(term3111, 17, (short) 10);
        setShortElement(term3111, 18, (short) 11);
        setShortElement(term3111, 19, (short) 4);
        setShortElement(term3111, 20, (short) 1);
        setShortElement(term3111, 23, (short) 3);
        setShortElement(term3111, 24, (short) 4);
        setShortElement(term3111, 25, (short) 4);
        setShortElement(term3111, 26, (short) 1);
        setShortElement(term3111, 27, (short) 2);
        setShortElement(term3111, 28, (short) 3);
        setShortElement(term3111, 29, (short) 3);
        setShortElement(term3111, 30, (short) 13);
        setShortElement(term3111, 31, (short) 1);
        setElement(term3110, 0, term3111);
        setIntElement(term3144, 1, 5570560);
        setIntElement(term3144, 2, 327680);
        setIntElement(term3144, 3, 4456454);
        setIntElement(term3144, 4, 1769472);
        setIntElement(term3144, 5, 14876672);
        setIntElement(term3144, 6, 6225920);
        setIntElement(term3144, 7, 917504);
        setIntElement(term3144, 8, 327680);
        setIntElement(term3144, 9, 8519680);
        setIntElement(term3144, 10, 917504);
        setIntElement(term3144, 11, 11993088);
        setIntElement(term3144, 12, 655360);
        setIntElement(term3144, 13, 7864320);
        setIntElement(term3144, 14, 3735552);
        setIntElement(term3144, 15, 7143424);
        setIntElement(term3144, 16, 8454144);
        setIntElement(term3144, 17, 9240576);
        setIntElement(term3144, 18, 196608);
        setIntElement(term3144, 19, 3801088);
        setIntElement(term3144, 20, 786432);
        setIntElement(term3144, 21, 589824);
        setIntElement(term3144, 22, 17170432);
        setIntElement(term3144, 23, 1376256);
        setIntElement(term3144, 24, 5242880);
        setIntElement(term3144, 25, 2883584);
        setIntElement(term3144, 26, 20774912);
        setIntElement(term3144, 27, 262144);
        setIntElement(term3144, 28, 2555904);
        setIntElement(term3144, 29, 1835008);
        setIntElement(term3144, 30, 6029312);
        setIntElement(term3144, 31, 327680);
        setElement(term3110, 1, term3144);
        setElement(term3177, 0, term3178);
        setElement(term3177, 1, term3178);
        setElement(term3177, 2, term3181);
        setElement(term3177, 3, term3183);
        setElement(term3177, 4, term3187);
        setElement(term3177, 5, term3187);
        setElement(term3177, 6, term3192);
        setElement(term3177, 7, term3192);
        setElement(term3177, 8, term3196);
        setElement(term3177, 9, term3196);
        setElement(term3177, 10, term3196);
        setElement(term3177, 11, term3196);
        setElement(term3177, 12, term3196);
        setElement(term3177, 13, term3200);
        setElement(term3177, 14, term3200);
        setElement(term3177, 15, term3204);
        setElement(term3177, 16, term3204);
        setElement(term3177, 17, term3204);
        setElement(term3177, 18, term3204);
        setElement(term3177, 19, term3208);
        setElement(term3177, 20, term3208);
        setElement(term3177, 21, term3208);
        setElement(term3177, 22, term3212);
        setElement(term3177, 23, term3204);
        setElement(term3177, 24, term3216);
        setElement(term3177, 25, term3220);
        setElement(term3177, 26, term3224);
        setElement(term3177, 27, term3228);
        setElement(term3177, 28, term3231);
        setElement(term3177, 29, term3234);
        setElement(term3177, 30, term3237);
        setElement(term3177, 31, term3240);
        setElement(term3110, 2, term3177);
        setLongElement(term3243, 0, 34363746224L);
        setLongElement(term3243, 1, 34363775512L);
        setLongElement(term3243, 2, 34363775512L);
        setLongElement(term3243, 3, 34363775512L);
        setLongElement(term3243, 4, 140671122080048L);
        setLongElement(term3243, 5, 34364440080L);
        setLongElement(term3243, 6, 140671122147248L);
        setLongElement(term3243, 7, 140671121989648L);
        setLongElement(term3243, 8, 140671121989536L);
        setLongElement(term3243, 9, 140671121989680L);
        setLongElement(term3243, 10, 140671122033680L);
        setLongElement(term3243, 11, 34363766248L);
        setLongElement(term3243, 12, 34363766248L);
        setLongElement(term3243, 13, 140667513310992L);
        setLongElement(term3243, 14, 140667513310992L);
        setLongElement(term3243, 15, 140667513310848L);
        setLongElement(term3243, 16, 140667513354752L);
        setLongElement(term3243, 17, 140667513356400L);
        setLongElement(term3243, 18, 140667513357168L);
        setLongElement(term3243, 19, 140671123758128L);
        setLongElement(term3243, 20, 34363739368L);
        setLongElement(term3243, 21, 34363739368L);
        setLongElement(term3243, 22, 140667513309488L);
        setLongElement(term3243, 23, 34363829248L);
        setLongElement(term3243, 24, 140671123758128L);
        setLongElement(term3243, 25, 140671123559536L);
        setLongElement(term3243, 26, 34363745472L);
        setLongElement(term3243, 27, 34364710216L);
        setLongElement(term3243, 28, 34363745472L);
        setLongElement(term3243, 29, 34363745472L);
        setLongElement(term3243, 30, 34364896224L);
        setLongElement(term3243, 31, 34363745472L);
        setElement(term3110, 3, term3243);
        setShortElement(term3277, 0, (short) 2);
        setShortElement(term3277, 1, (short) 12);
        setElement(term3276, 0, term3277);
        setIntElement(term3310, 0, 1638400);
        setIntElement(term3310, 1, 720907);
        setElement(term3276, 1, term3310);
        setElement(term3343, 0, term3344);
        setElement(term3343, 1, term3346);
        setElement(term3276, 2, term3343);
        setLongElement(term3348, 0, 34363745472L);
        setLongElement(term3348, 1, 34363745472L);
        setElement(term3276, 3, term3348);
        setElement(term3110, 4, term3276);
        setField(term3109, term3109.getClass(), "backtrace", term3110);
        setField(term3109, term3109.getClass(), "detailMessage", "MuLcgQHgqz");
        setField(term3109, term3109.getClass(), "cause", term3109);
        setField(term3109, term3109.getClass(), "stackTrace", term3393);
        setIntField(term3109, term3109.getClass(), "depth", 34);
        setIntField(term3395, term3395.getClass(), "modCount", 0);
        setField(term3109, term3109.getClass(), "suppressedExceptions", term3395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3109;
        try {
            callMethod(klass, "unwrapAndWrapException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


