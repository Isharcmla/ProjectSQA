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

public class BeanDeserializerBase_wrapInstantiationProblem_142741794897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9075;

    public BeanDeserializerBase_wrapInstantiationProblem_142741794897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9144 = Class.forName((String) "com.fasterxml.jackson.databind.JsonDeserializer");
        Class<? extends Object> term9147 = Class.forName((String) "java.nio.ShortBuffer");
        Class<? extends Object> term9149 = Class.forName((String) "java.util.stream.WhileOps$4");
        Class<? extends Object> term9153 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Constructor");
        Class<? extends Object> term9158 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.UUIDSerializer");
        Class<? extends Object> term9162 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TreeBin");
        Class<? extends Object> term9166 = Class.forName((String) "java.util.ServiceLoader$LazyClassPathLookupIterator$2");
        Class<? extends Object> term9170 = Class.forName((String) "java.lang.invoke.LambdaConversionException");
        Class<? extends Object> term9174 = Class.forName((String) "java.lang.StackStreamFactory$LiveStackInfoTraverser$LiveStackFrameBuffer");
        Class<? extends Object> term9178 = Class.forName((String) "java.util.stream.SliceOps$2$1");
        Class<? extends Object> term9182 = Class.forName((String) "java.util.stream.SpinedBuffer$OfLong");
        Class<? extends Object> term9186 = Class.forName((String) "java.lang.ProcessHandle");
        Class<? extends Object> term9190 = Class.forName((String) "java.nio.channels.ShutdownChannelGroupException");
        Class<? extends Object> term9194 = Class.forName((String) "java.lang.CompoundEnumeration");
        Class<? extends Object> term9196 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Sorter");
        Class<? extends Object> term9199 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$SearchKeysTask");
        Class<? extends Object> term9201 = Class.forName((String) "java.nio.file.ClosedDirectoryStreamException");
        Class<? extends Object> term9203 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$CollectionReferring");
        Class<? extends Object> term9306 = Class.forName((String) "java.lang.invoke.VarHandleChars$Array");
        Class<? extends Object> term9308 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$ArrayAccessor$1");
        term9075 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9076 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9077 = (short[]) newShortArray(32);
        int[] term9110 = (int[]) newIntArray(32);
        Object[] term9143 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9205 = (long[]) newLongArray(32);
        Object[] term9238 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9239 = (short[]) newShortArray(32);
        int[] term9272 = (int[]) newIntArray(32);
        Object[] term9305 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9310 = (long[]) newLongArray(32);
        Object[] term9355 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9357 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9077, 0, (short) 1);
        setShortElement(term9077, 1, (short) 2);
        setShortElement(term9077, 2, (short) 1);
        setShortElement(term9077, 3, (short) 7);
        setShortElement(term9077, 4, (short) 2);
        setShortElement(term9077, 5, (short) 1);
        setShortElement(term9077, 6, (short) 6);
        setShortElement(term9077, 7, (short) 2);
        setShortElement(term9077, 8, (short) 10);
        setShortElement(term9077, 9, (short) 11);
        setShortElement(term9077, 10, (short) 29);
        setShortElement(term9077, 11, (short) 5);
        setShortElement(term9077, 12, (short) 4);
        setShortElement(term9077, 13, (short) 5);
        setShortElement(term9077, 14, (short) 6);
        setShortElement(term9077, 15, (short) 6);
        setShortElement(term9077, 16, (short) 9);
        setShortElement(term9077, 17, (short) 10);
        setShortElement(term9077, 18, (short) 11);
        setShortElement(term9077, 19, (short) 4);
        setShortElement(term9077, 20, (short) 1);
        setShortElement(term9077, 23, (short) 3);
        setShortElement(term9077, 24, (short) 4);
        setShortElement(term9077, 25, (short) 4);
        setShortElement(term9077, 26, (short) 1);
        setShortElement(term9077, 27, (short) 2);
        setShortElement(term9077, 28, (short) 3);
        setShortElement(term9077, 29, (short) 3);
        setShortElement(term9077, 30, (short) 13);
        setShortElement(term9077, 31, (short) 1);
        setElement(term9076, 0, term9077);
        setIntElement(term9110, 1, 5570560);
        setIntElement(term9110, 2, 327680);
        setIntElement(term9110, 3, 4456454);
        setIntElement(term9110, 4, 1769472);
        setIntElement(term9110, 5, 14876672);
        setIntElement(term9110, 6, 6225920);
        setIntElement(term9110, 7, 917504);
        setIntElement(term9110, 8, 327680);
        setIntElement(term9110, 9, 8519680);
        setIntElement(term9110, 10, 917504);
        setIntElement(term9110, 11, 11993088);
        setIntElement(term9110, 12, 655360);
        setIntElement(term9110, 13, 7864320);
        setIntElement(term9110, 14, 3735552);
        setIntElement(term9110, 15, 7143424);
        setIntElement(term9110, 16, 8454144);
        setIntElement(term9110, 17, 9240576);
        setIntElement(term9110, 18, 196608);
        setIntElement(term9110, 19, 3801088);
        setIntElement(term9110, 20, 786432);
        setIntElement(term9110, 21, 589824);
        setIntElement(term9110, 22, 17170432);
        setIntElement(term9110, 23, 1376256);
        setIntElement(term9110, 24, 5242880);
        setIntElement(term9110, 25, 2883584);
        setIntElement(term9110, 26, 20774912);
        setIntElement(term9110, 27, 262144);
        setIntElement(term9110, 28, 2555904);
        setIntElement(term9110, 29, 1835008);
        setIntElement(term9110, 30, 6029312);
        setIntElement(term9110, 31, 327680);
        setElement(term9076, 1, term9110);
        setElement(term9143, 0, term9144);
        setElement(term9143, 1, term9144);
        setElement(term9143, 2, term9147);
        setElement(term9143, 3, term9149);
        setElement(term9143, 4, term9153);
        setElement(term9143, 5, term9153);
        setElement(term9143, 6, term9158);
        setElement(term9143, 7, term9158);
        setElement(term9143, 8, term9162);
        setElement(term9143, 9, term9162);
        setElement(term9143, 10, term9162);
        setElement(term9143, 11, term9162);
        setElement(term9143, 12, term9162);
        setElement(term9143, 13, term9166);
        setElement(term9143, 14, term9166);
        setElement(term9143, 15, term9170);
        setElement(term9143, 16, term9170);
        setElement(term9143, 17, term9170);
        setElement(term9143, 18, term9170);
        setElement(term9143, 19, term9174);
        setElement(term9143, 20, term9174);
        setElement(term9143, 21, term9174);
        setElement(term9143, 22, term9178);
        setElement(term9143, 23, term9170);
        setElement(term9143, 24, term9182);
        setElement(term9143, 25, term9186);
        setElement(term9143, 26, term9190);
        setElement(term9143, 27, term9194);
        setElement(term9143, 28, term9196);
        setElement(term9143, 29, term9199);
        setElement(term9143, 30, term9201);
        setElement(term9143, 31, term9203);
        setElement(term9076, 2, term9143);
        setLongElement(term9205, 0, 34363746224L);
        setLongElement(term9205, 1, 34363775512L);
        setLongElement(term9205, 2, 34363775512L);
        setLongElement(term9205, 3, 34363775512L);
        setLongElement(term9205, 4, 127102448043280L);
        setLongElement(term9205, 5, 34364440080L);
        setLongElement(term9205, 6, 127102448110432L);
        setLongElement(term9205, 7, 127102447950512L);
        setLongElement(term9205, 8, 127102447950400L);
        setLongElement(term9205, 9, 127102447950544L);
        setLongElement(term9205, 10, 127102447996864L);
        setLongElement(term9205, 11, 34363766248L);
        setLongElement(term9205, 12, 34363766248L);
        setLongElement(term9205, 13, 127099392863808L);
        setLongElement(term9205, 14, 127099392863808L);
        setLongElement(term9205, 15, 127099392863664L);
        setLongElement(term9205, 16, 127099392908224L);
        setLongElement(term9205, 17, 127099392909872L);
        setLongElement(term9205, 18, 127099392910640L);
        setLongElement(term9205, 19, 127099389837984L);
        setLongElement(term9205, 20, 34363739368L);
        setLongElement(term9205, 21, 34363739368L);
        setLongElement(term9205, 22, 127099392862304L);
        setLongElement(term9205, 23, 34363829248L);
        setLongElement(term9205, 24, 127099389837984L);
        setLongElement(term9205, 25, 127099389022368L);
        setLongElement(term9205, 26, 34363745472L);
        setLongElement(term9205, 27, 34364710216L);
        setLongElement(term9205, 28, 34363745472L);
        setLongElement(term9205, 29, 34363745472L);
        setLongElement(term9205, 30, 34364896224L);
        setLongElement(term9205, 31, 34363745472L);
        setElement(term9076, 3, term9205);
        setShortElement(term9239, 0, (short) 2);
        setShortElement(term9239, 1, (short) 12);
        setElement(term9238, 0, term9239);
        setIntElement(term9272, 0, 1638400);
        setIntElement(term9272, 1, 720907);
        setElement(term9238, 1, term9272);
        setElement(term9305, 0, term9306);
        setElement(term9305, 1, term9308);
        setElement(term9238, 2, term9305);
        setLongElement(term9310, 0, 34363745472L);
        setLongElement(term9310, 1, 34363745472L);
        setElement(term9238, 3, term9310);
        setElement(term9076, 4, term9238);
        setField(term9075, term9075.getClass(), "backtrace", term9076);
        setField(term9075, term9075.getClass(), "detailMessage", "NRdvgJlhkX");
        setField(term9075, term9075.getClass(), "cause", term9075);
        setField(term9075, term9075.getClass(), "stackTrace", term9355);
        setIntField(term9075, term9075.getClass(), "depth", 34);
        setIntField(term9357, term9357.getClass(), "modCount", 0);
        setField(term9075, term9075.getClass(), "suppressedExceptions", term9357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term9075;
        args[1] = null;
        try {
            callMethod(klass, "wrapInstantiationProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


