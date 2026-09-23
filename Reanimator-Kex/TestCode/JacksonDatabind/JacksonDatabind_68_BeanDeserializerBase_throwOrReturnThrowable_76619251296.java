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

public class BeanDeserializerBase_throwOrReturnThrowable_76619251296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6047;

    public BeanDeserializerBase_throwOrReturnThrowable_76619251296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6116 = Class.forName((String) "kex.java.lang.Short");
        Class<? extends Object> term6119 = Class.forName((String) "java.lang.Comparable");
        Class<? extends Object> term6121 = Class.forName((String) "java.util.KeyValueHolder");
        Class<? extends Object> term6125 = Class.forName((String) "java.lang.StrictMath");
        Class<? extends Object> term6130 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsShorts");
        Class<? extends Object> term6134 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonProperty");
        Class<? extends Object> term6138 = Class.forName((String) "java.util.stream.Nodes$CollectorTask$OfRef");
        Class<? extends Object> term6142 = Class.forName((String) "java.lang.module.ModuleFinder$1");
        Class<? extends Object> term6146 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$Makers$3");
        Class<? extends Object> term6150 = Class.forName((String) "java.lang.invoke.VarHandleBytes$FieldStaticReadOnly");
        Class<? extends Object> term6154 = Class.forName((String) "java.lang.CharacterData0E");
        Class<? extends Object> term6158 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedEntrySet");
        Class<? extends Object> term6162 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        Class<? extends Object> term6166 = Class.forName((String) "java.util.concurrent.atomic.AtomicStampedReference");
        Class<? extends Object> term6168 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfPrimitive");
        Class<? extends Object> term6171 = Class.forName((String) "java.lang.Class$ReflectionData");
        Class<? extends Object> term6173 = Class.forName((String) "java.io.DeleteOnExitHook");
        Class<? extends Object> term6175 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonRootName");
        Class<? extends Object> term6278 = Class.forName((String) "java.util.Spliterators$1Adapter");
        Class<? extends Object> term6280 = Class.forName((String) "java.util.Collections");
        term6047 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6048 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6049 = (short[]) newShortArray(32);
        int[] term6082 = (int[]) newIntArray(32);
        Object[] term6115 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6177 = (long[]) newLongArray(32);
        Object[] term6210 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6211 = (short[]) newShortArray(32);
        int[] term6244 = (int[]) newIntArray(32);
        Object[] term6277 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6282 = (long[]) newLongArray(32);
        Object[] term6327 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6329 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6049, 0, (short) 1);
        setShortElement(term6049, 1, (short) 2);
        setShortElement(term6049, 2, (short) 1);
        setShortElement(term6049, 3, (short) 7);
        setShortElement(term6049, 4, (short) 2);
        setShortElement(term6049, 5, (short) 1);
        setShortElement(term6049, 6, (short) 6);
        setShortElement(term6049, 7, (short) 2);
        setShortElement(term6049, 8, (short) 10);
        setShortElement(term6049, 9, (short) 11);
        setShortElement(term6049, 10, (short) 29);
        setShortElement(term6049, 11, (short) 5);
        setShortElement(term6049, 12, (short) 4);
        setShortElement(term6049, 13, (short) 5);
        setShortElement(term6049, 14, (short) 6);
        setShortElement(term6049, 15, (short) 6);
        setShortElement(term6049, 16, (short) 9);
        setShortElement(term6049, 17, (short) 10);
        setShortElement(term6049, 18, (short) 11);
        setShortElement(term6049, 19, (short) 4);
        setShortElement(term6049, 20, (short) 1);
        setShortElement(term6049, 23, (short) 3);
        setShortElement(term6049, 24, (short) 4);
        setShortElement(term6049, 25, (short) 4);
        setShortElement(term6049, 26, (short) 1);
        setShortElement(term6049, 27, (short) 2);
        setShortElement(term6049, 28, (short) 3);
        setShortElement(term6049, 29, (short) 3);
        setShortElement(term6049, 30, (short) 13);
        setShortElement(term6049, 31, (short) 1);
        setElement(term6048, 0, term6049);
        setIntElement(term6082, 1, 5570560);
        setIntElement(term6082, 2, 327680);
        setIntElement(term6082, 3, 4456454);
        setIntElement(term6082, 4, 1769472);
        setIntElement(term6082, 5, 14876672);
        setIntElement(term6082, 6, 6225920);
        setIntElement(term6082, 7, 917504);
        setIntElement(term6082, 8, 327680);
        setIntElement(term6082, 9, 8519680);
        setIntElement(term6082, 10, 917504);
        setIntElement(term6082, 11, 11993088);
        setIntElement(term6082, 12, 655360);
        setIntElement(term6082, 13, 7864320);
        setIntElement(term6082, 14, 3735552);
        setIntElement(term6082, 15, 7143424);
        setIntElement(term6082, 16, 8454144);
        setIntElement(term6082, 17, 9240576);
        setIntElement(term6082, 18, 196608);
        setIntElement(term6082, 19, 3801088);
        setIntElement(term6082, 20, 786432);
        setIntElement(term6082, 21, 589824);
        setIntElement(term6082, 22, 17170432);
        setIntElement(term6082, 23, 1376256);
        setIntElement(term6082, 24, 5242880);
        setIntElement(term6082, 25, 2883584);
        setIntElement(term6082, 26, 20774912);
        setIntElement(term6082, 27, 262144);
        setIntElement(term6082, 28, 2555904);
        setIntElement(term6082, 29, 1835008);
        setIntElement(term6082, 30, 6029312);
        setIntElement(term6082, 31, 327680);
        setElement(term6048, 1, term6082);
        setElement(term6115, 0, term6116);
        setElement(term6115, 1, term6116);
        setElement(term6115, 2, term6119);
        setElement(term6115, 3, term6121);
        setElement(term6115, 4, term6125);
        setElement(term6115, 5, term6125);
        setElement(term6115, 6, term6130);
        setElement(term6115, 7, term6130);
        setElement(term6115, 8, term6134);
        setElement(term6115, 9, term6134);
        setElement(term6115, 10, term6134);
        setElement(term6115, 11, term6134);
        setElement(term6115, 12, term6134);
        setElement(term6115, 13, term6138);
        setElement(term6115, 14, term6138);
        setElement(term6115, 15, term6142);
        setElement(term6115, 16, term6142);
        setElement(term6115, 17, term6142);
        setElement(term6115, 18, term6142);
        setElement(term6115, 19, term6146);
        setElement(term6115, 20, term6146);
        setElement(term6115, 21, term6146);
        setElement(term6115, 22, term6150);
        setElement(term6115, 23, term6142);
        setElement(term6115, 24, term6154);
        setElement(term6115, 25, term6158);
        setElement(term6115, 26, term6162);
        setElement(term6115, 27, term6166);
        setElement(term6115, 28, term6168);
        setElement(term6115, 29, term6171);
        setElement(term6115, 30, term6173);
        setElement(term6115, 31, term6175);
        setElement(term6048, 2, term6115);
        setLongElement(term6177, 0, 34363746224L);
        setLongElement(term6177, 1, 34363775512L);
        setLongElement(term6177, 2, 34363775512L);
        setLongElement(term6177, 3, 34363775512L);
        setLongElement(term6177, 4, 127102448043280L);
        setLongElement(term6177, 5, 34364440080L);
        setLongElement(term6177, 6, 127102448110432L);
        setLongElement(term6177, 7, 127102447950512L);
        setLongElement(term6177, 8, 127102447950400L);
        setLongElement(term6177, 9, 127102447950544L);
        setLongElement(term6177, 10, 127102447996864L);
        setLongElement(term6177, 11, 34363766248L);
        setLongElement(term6177, 12, 34363766248L);
        setLongElement(term6177, 13, 127099392863808L);
        setLongElement(term6177, 14, 127099392863808L);
        setLongElement(term6177, 15, 127099392863664L);
        setLongElement(term6177, 16, 127099392908224L);
        setLongElement(term6177, 17, 127099392909872L);
        setLongElement(term6177, 18, 127099392910640L);
        setLongElement(term6177, 19, 127099389837984L);
        setLongElement(term6177, 20, 34363739368L);
        setLongElement(term6177, 21, 34363739368L);
        setLongElement(term6177, 22, 127099392862304L);
        setLongElement(term6177, 23, 34363829248L);
        setLongElement(term6177, 24, 127099389837984L);
        setLongElement(term6177, 25, 127099389022368L);
        setLongElement(term6177, 26, 34363745472L);
        setLongElement(term6177, 27, 34364710216L);
        setLongElement(term6177, 28, 34363745472L);
        setLongElement(term6177, 29, 34363745472L);
        setLongElement(term6177, 30, 34364896224L);
        setLongElement(term6177, 31, 34363745472L);
        setElement(term6048, 3, term6177);
        setShortElement(term6211, 0, (short) 2);
        setShortElement(term6211, 1, (short) 12);
        setElement(term6210, 0, term6211);
        setIntElement(term6244, 0, 1638400);
        setIntElement(term6244, 1, 720907);
        setElement(term6210, 1, term6244);
        setElement(term6277, 0, term6278);
        setElement(term6277, 1, term6280);
        setElement(term6210, 2, term6277);
        setLongElement(term6282, 0, 34363745472L);
        setLongElement(term6282, 1, 34363745472L);
        setElement(term6210, 3, term6282);
        setElement(term6048, 4, term6210);
        setField(term6047, term6047.getClass(), "backtrace", term6048);
        setField(term6047, term6047.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term6047, term6047.getClass(), "cause", term6047);
        setField(term6047, term6047.getClass(), "stackTrace", term6327);
        setIntField(term6047, term6047.getClass(), "depth", 34);
        setIntField(term6329, term6329.getClass(), "modCount", 0);
        setField(term6047, term6047.getClass(), "suppressedExceptions", term6329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term6047;
        args[1] = null;
        try {
            callMethod(klass, "throwOrReturnThrowable", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


