package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DeserializationContext_instantiationException_3174786160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6329;

    public DeserializationContext_instantiationException_3174786160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6398 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term6401 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Class<? extends Object> term6403 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Merger");
        Class<? extends Object> term6407 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<? extends Object> term6412 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        Class<? extends Object> term6416 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        Class<? extends Object> term6420 = Class.forName((String) "java.lang.ref.Finalizer$1");
        Class<? extends Object> term6424 = Class.forName((String) "java.util.LinkedHashSet");
        Class<? extends Object> term6428 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term6432 = Class.forName((String) "java.util.AbstractMap$2");
        Class<? extends Object> term6436 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term6440 = Class.forName((String) "com.fasterxml.jackson.databind.ser.package-info");
        Class<? extends Object> term6444 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term6448 = Class.forName((String) "java.util.BitSet");
        Class<? extends Object> term6451 = Class.forName((String) "java.util.jar.JarInputStream");
        Class<? extends Object> term6454 = Class.forName((String) "java.nio.channels.GatheringByteChannel");
        Class<? extends Object> term6457 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term6460 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term6564 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        Class<? extends Object> term6566 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        term6329 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6330 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6331 = (short[]) newShortArray(32);
        int[] term6364 = (int[]) newIntArray(32);
        Object[] term6397 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6463 = (long[]) newLongArray(32);
        Object[] term6496 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6497 = (short[]) newShortArray(32);
        int[] term6530 = (int[]) newIntArray(32);
        Object[] term6563 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6568 = (long[]) newLongArray(32);
        Object[] term6613 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6615 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6331, 0, (short) 1);
        setShortElement(term6331, 1, (short) 2);
        setShortElement(term6331, 2, (short) 1);
        setShortElement(term6331, 3, (short) 7);
        setShortElement(term6331, 4, (short) 2);
        setShortElement(term6331, 5, (short) 1);
        setShortElement(term6331, 6, (short) 6);
        setShortElement(term6331, 7, (short) 2);
        setShortElement(term6331, 8, (short) 10);
        setShortElement(term6331, 9, (short) 11);
        setShortElement(term6331, 10, (short) 29);
        setShortElement(term6331, 11, (short) 5);
        setShortElement(term6331, 12, (short) 4);
        setShortElement(term6331, 13, (short) 6);
        setShortElement(term6331, 14, (short) 8);
        setShortElement(term6331, 15, (short) 6);
        setShortElement(term6331, 16, (short) 9);
        setShortElement(term6331, 17, (short) 10);
        setShortElement(term6331, 18, (short) 11);
        setShortElement(term6331, 19, (short) 4);
        setShortElement(term6331, 20, (short) 1);
        setShortElement(term6331, 22, (short) 10);
        setShortElement(term6331, 23, (short) 3);
        setShortElement(term6331, 24, (short) 4);
        setShortElement(term6331, 25, (short) 9);
        setShortElement(term6331, 26, (short) 1);
        setShortElement(term6331, 27, (short) 2);
        setShortElement(term6331, 28, (short) 3);
        setShortElement(term6331, 29, (short) 3);
        setShortElement(term6331, 30, (short) 13);
        setShortElement(term6331, 31, (short) 1);
        setElement(term6330, 0, term6331);
        setIntElement(term6364, 1, 5570560);
        setIntElement(term6364, 2, 327680);
        setIntElement(term6364, 3, 4456454);
        setIntElement(term6364, 4, 1769472);
        setIntElement(term6364, 5, 14876672);
        setIntElement(term6364, 6, 6225920);
        setIntElement(term6364, 7, 917504);
        setIntElement(term6364, 8, 327680);
        setIntElement(term6364, 9, 8519680);
        setIntElement(term6364, 10, 917504);
        setIntElement(term6364, 11, 11993088);
        setIntElement(term6364, 12, 655360);
        setIntElement(term6364, 13, 7864320);
        setIntElement(term6364, 14, 3735552);
        setIntElement(term6364, 15, 7143424);
        setIntElement(term6364, 16, 8454144);
        setIntElement(term6364, 17, 9240576);
        setIntElement(term6364, 18, 196608);
        setIntElement(term6364, 19, 3801088);
        setIntElement(term6364, 20, 786432);
        setIntElement(term6364, 21, 589824);
        setIntElement(term6364, 22, 17170432);
        setIntElement(term6364, 23, 1376256);
        setIntElement(term6364, 24, 5242880);
        setIntElement(term6364, 25, 2883584);
        setIntElement(term6364, 26, 20774912);
        setIntElement(term6364, 27, 262144);
        setIntElement(term6364, 28, 2555904);
        setIntElement(term6364, 29, 1835008);
        setIntElement(term6364, 30, 6029312);
        setIntElement(term6364, 31, 327680);
        setElement(term6330, 1, term6364);
        setElement(term6397, 0, term6398);
        setElement(term6397, 1, term6398);
        setElement(term6397, 2, term6401);
        setElement(term6397, 3, term6403);
        setElement(term6397, 4, term6407);
        setElement(term6397, 5, term6407);
        setElement(term6397, 6, term6412);
        setElement(term6397, 7, term6412);
        setElement(term6397, 8, term6416);
        setElement(term6397, 9, term6416);
        setElement(term6397, 10, term6416);
        setElement(term6397, 11, term6416);
        setElement(term6397, 12, term6416);
        setElement(term6397, 13, term6420);
        setElement(term6397, 14, term6420);
        setElement(term6397, 15, term6424);
        setElement(term6397, 16, term6424);
        setElement(term6397, 17, term6424);
        setElement(term6397, 18, term6424);
        setElement(term6397, 19, term6428);
        setElement(term6397, 20, term6428);
        setElement(term6397, 21, term6428);
        setElement(term6397, 22, term6432);
        setElement(term6397, 23, term6424);
        setElement(term6397, 24, term6436);
        setElement(term6397, 25, term6440);
        setElement(term6397, 26, term6444);
        setElement(term6397, 27, term6448);
        setElement(term6397, 28, term6451);
        setElement(term6397, 29, term6454);
        setElement(term6397, 30, term6457);
        setElement(term6397, 31, term6460);
        setElement(term6330, 2, term6397);
        setLongElement(term6463, 0, 34363746224L);
        setLongElement(term6463, 1, 34363775512L);
        setLongElement(term6463, 2, 34363775512L);
        setLongElement(term6463, 3, 34363775512L);
        setLongElement(term6463, 4, 132755497387184L);
        setLongElement(term6463, 5, 34364440080L);
        setLongElement(term6463, 6, 132755497454240L);
        setLongElement(term6463, 7, 132755497261584L);
        setLongElement(term6463, 8, 132755497261472L);
        setLongElement(term6463, 9, 132755497261616L);
        setLongElement(term6463, 10, 132755497340720L);
        setLongElement(term6463, 11, 34363766248L);
        setLongElement(term6463, 12, 34363766248L);
        setLongElement(term6463, 13, 132752053541984L);
        setLongElement(term6463, 14, 132752053541984L);
        setLongElement(term6463, 15, 132752053541840L);
        setLongElement(term6463, 16, 132752053585744L);
        setLongElement(term6463, 17, 132752053587392L);
        setLongElement(term6463, 18, 132752053588160L);
        setLongElement(term6463, 19, 132755499210672L);
        setLongElement(term6463, 20, 34363739368L);
        setLongElement(term6463, 21, 34363739368L);
        setLongElement(term6463, 22, 132752053540480L);
        setLongElement(term6463, 23, 34363829248L);
        setLongElement(term6463, 24, 132755499210672L);
        setLongElement(term6463, 25, 132755500583712L);
        setLongElement(term6463, 26, 34363745472L);
        setLongElement(term6463, 27, 34364710216L);
        setLongElement(term6463, 28, 34363745472L);
        setLongElement(term6463, 29, 34363745472L);
        setLongElement(term6463, 30, 34364896224L);
        setLongElement(term6463, 31, 34363745472L);
        setElement(term6330, 3, term6463);
        setShortElement(term6497, 0, (short) 2);
        setShortElement(term6497, 1, (short) 12);
        setElement(term6496, 0, term6497);
        setIntElement(term6530, 0, 1638400);
        setIntElement(term6530, 1, 720907);
        setElement(term6496, 1, term6530);
        setElement(term6563, 0, term6564);
        setElement(term6563, 1, term6566);
        setElement(term6496, 2, term6563);
        setLongElement(term6568, 0, 34363745472L);
        setLongElement(term6568, 1, 34363745472L);
        setElement(term6496, 3, term6568);
        setElement(term6330, 4, term6496);
        setField(term6329, term6329.getClass(), "backtrace", term6330);
        setField(term6329, term6329.getClass(), "detailMessage", "xrwlQZdwCp");
        setField(term6329, term6329.getClass(), "cause", term6329);
        setField(term6329, term6329.getClass(), "stackTrace", term6613);
        setIntField(term6329, term6329.getClass(), "depth", 34);
        setIntField(term6615, term6615.getClass(), "modCount", 0);
        setField(term6329, term6329.getClass(), "suppressedExceptions", term6615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6329;
        try {
            callMethod(klass, "instantiationException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


