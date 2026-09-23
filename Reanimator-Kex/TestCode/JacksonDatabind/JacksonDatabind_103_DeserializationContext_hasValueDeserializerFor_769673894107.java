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

public class DeserializationContext_hasValueDeserializerFor_769673894107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;

    public DeserializationContext_hasValueDeserializerFor_769673894107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80 = Class.forName((String) "java.nio.BufferMismatch");
        Class<? extends Object> term82 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base");
        Class<? extends Object> term84 = Class.forName((String) "java.nio.channels.ClosedSelectorException");
        Class<? extends Object> term86 = Class.forName((String) "java.nio.file.FileSystemException");
        Class<? extends Object> term88 = Class.forName((String) "java.util.stream.ReduceOps$9ReducingSink");
        Class<? extends Object> term90 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom");
        Class<? extends Object> term92 = Class.forName((String) "java.io.ExpiringCache$1");
        Class<? extends Object> term94 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer");
        Class<? extends Object> term96 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$LoopClauses");
        Class<? extends Object> term98 = Class.forName((String) "java.util.stream.SpinedBuffer$OfPrimitive");
        Class<? extends Object> term100 = Class.forName((String) "java.util.stream.DoubleStream");
        Class<? extends Object> term102 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term104 = Class.forName((String) "java.util.Spliterators$ArraySpliterator");
        Class<? extends Object> term106 = Class.forName((String) "java.lang.Iterable");
        Class<? extends Object> term108 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldStaticReadOnly");
        term10 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term11 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term12 = (Object[]) newArray("java.lang.Object", 5);
        short[] term13 = (short[]) newShortArray(32);
        int[] term46 = (int[]) newIntArray(32);
        Object[] term79 = (Object[]) newArray("java.lang.Object", 32);
        long[] term110 = (long[]) newLongArray(32);
        Object[] term143 = (Object[]) newArray("java.lang.Object", 5);
        short[] term144 = (short[]) newShortArray(32);
        int[] term177 = (int[]) newIntArray(32);
        Object[] term210 = (Object[]) newArray("java.lang.Object", 32);
        long[] term211 = (long[]) newLongArray(32);
        Object[] term256 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term258 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term13, 0, (short) 1);
        setShortElement(term13, 1, (short) 2);
        setShortElement(term13, 2, (short) 1);
        setShortElement(term13, 3, (short) 7);
        setShortElement(term13, 4, (short) 2);
        setShortElement(term13, 5, (short) 1);
        setShortElement(term13, 6, (short) 6);
        setShortElement(term13, 7, (short) 2);
        setShortElement(term13, 8, (short) 10);
        setShortElement(term13, 9, (short) 11);
        setShortElement(term13, 10, (short) 29);
        setShortElement(term13, 11, (short) 5);
        setShortElement(term13, 12, (short) 19);
        setShortElement(term13, 13, (short) 29);
        setShortElement(term13, 14, (short) 5);
        setShortElement(term13, 15, (short) 4);
        setShortElement(term13, 16, (short) 6);
        setShortElement(term13, 17, (short) 8);
        setShortElement(term13, 18, (short) 6);
        setShortElement(term13, 19, (short) 9);
        setShortElement(term13, 20, (short) 10);
        setShortElement(term13, 21, (short) 11);
        setShortElement(term13, 22, (short) 4);
        setShortElement(term13, 23, (short) 1);
        setShortElement(term13, 25, (short) 10);
        setShortElement(term13, 26, (short) 3);
        setShortElement(term13, 27, (short) 4);
        setShortElement(term13, 28, (short) 9);
        setShortElement(term13, 29, (short) 1);
        setShortElement(term13, 30, (short) 2);
        setShortElement(term13, 31, (short) 3);
        setElement(term12, 0, term13);
        setIntElement(term46, 1, 5570560);
        setIntElement(term46, 2, 327680);
        setIntElement(term46, 3, 4456454);
        setIntElement(term46, 4, 1769472);
        setIntElement(term46, 5, 14876672);
        setIntElement(term46, 6, 6225920);
        setIntElement(term46, 7, 917504);
        setIntElement(term46, 8, 327680);
        setIntElement(term46, 9, 8519680);
        setIntElement(term46, 10, 917504);
        setIntElement(term46, 11, 11993088);
        setIntElement(term46, 12, 38010880);
        setIntElement(term46, 13, 2162688);
        setIntElement(term46, 14, 11993088);
        setIntElement(term46, 15, 655360);
        setIntElement(term46, 16, 7864320);
        setIntElement(term46, 17, 3735552);
        setIntElement(term46, 18, 7143424);
        setIntElement(term46, 19, 8454144);
        setIntElement(term46, 20, 9240576);
        setIntElement(term46, 21, 196608);
        setIntElement(term46, 22, 3801088);
        setIntElement(term46, 23, 786432);
        setIntElement(term46, 24, 589824);
        setIntElement(term46, 25, 17170432);
        setIntElement(term46, 26, 1376256);
        setIntElement(term46, 27, 5242880);
        setIntElement(term46, 28, 2883584);
        setIntElement(term46, 29, 20774912);
        setIntElement(term46, 30, 262144);
        setIntElement(term46, 31, 2555904);
        setElement(term12, 1, term46);
        setElement(term79, 0, term80);
        setElement(term79, 1, term80);
        setElement(term79, 2, term82);
        setElement(term79, 3, term84);
        setElement(term79, 4, term86);
        setElement(term79, 5, term86);
        setElement(term79, 6, term88);
        setElement(term79, 7, term88);
        setElement(term79, 8, term90);
        setElement(term79, 9, term90);
        setElement(term79, 10, term90);
        setElement(term79, 11, term90);
        setElement(term79, 12, term90);
        setElement(term79, 13, term90);
        setElement(term79, 14, term90);
        setElement(term79, 15, term90);
        setElement(term79, 16, term92);
        setElement(term79, 17, term92);
        setElement(term79, 18, term94);
        setElement(term79, 19, term94);
        setElement(term79, 20, term94);
        setElement(term79, 21, term94);
        setElement(term79, 22, term96);
        setElement(term79, 23, term96);
        setElement(term79, 24, term96);
        setElement(term79, 25, term98);
        setElement(term79, 26, term94);
        setElement(term79, 27, term100);
        setElement(term79, 28, term102);
        setElement(term79, 29, term104);
        setElement(term79, 30, term106);
        setElement(term79, 31, term108);
        setElement(term12, 2, term79);
        setLongElement(term110, 0, 34363746224L);
        setLongElement(term110, 1, 34363775512L);
        setLongElement(term110, 2, 34363775512L);
        setLongElement(term110, 3, 34363775512L);
        setLongElement(term110, 4, 132755497387184L);
        setLongElement(term110, 5, 34364440080L);
        setLongElement(term110, 6, 132755497454240L);
        setLongElement(term110, 7, 132755497261584L);
        setLongElement(term110, 8, 132755497261472L);
        setLongElement(term110, 9, 132755497261616L);
        setLongElement(term110, 10, 132755497340720L);
        setLongElement(term110, 11, 34363766248L);
        setLongElement(term110, 12, 132755497338240L);
        setLongElement(term110, 13, 132755497340720L);
        setLongElement(term110, 14, 34363766248L);
        setLongElement(term110, 15, 34363766248L);
        setLongElement(term110, 16, 132752053541984L);
        setLongElement(term110, 17, 132752053541984L);
        setLongElement(term110, 18, 132752053541840L);
        setLongElement(term110, 19, 132752053585744L);
        setLongElement(term110, 20, 132752053587392L);
        setLongElement(term110, 21, 132752053588160L);
        setLongElement(term110, 22, 132755499210672L);
        setLongElement(term110, 23, 34363739368L);
        setLongElement(term110, 24, 34363739368L);
        setLongElement(term110, 25, 132752053540480L);
        setLongElement(term110, 26, 34363829248L);
        setLongElement(term110, 27, 132755499210672L);
        setLongElement(term110, 28, 132755500583712L);
        setLongElement(term110, 29, 34363745472L);
        setLongElement(term110, 30, 34364710216L);
        setLongElement(term110, 31, 34363745472L);
        setElement(term12, 3, term110);
        setShortElement(term144, 0, (short) 3);
        setShortElement(term144, 1, (short) 13);
        setShortElement(term144, 2, (short) 1);
        setShortElement(term144, 3, (short) 2);
        setShortElement(term144, 4, (short) 12);
        setElement(term143, 0, term144);
        setIntElement(term177, 0, 1835008);
        setIntElement(term177, 1, 6029312);
        setIntElement(term177, 2, 327680);
        setIntElement(term177, 3, 1638400);
        setIntElement(term177, 4, 720907);
        setElement(term143, 1, term177);
        setElement(term143, 2, term210);
        setLongElement(term211, 0, 34363745472L);
        setLongElement(term211, 1, 34364896224L);
        setLongElement(term211, 2, 34363745472L);
        setLongElement(term211, 3, 34363745472L);
        setLongElement(term211, 4, 34363745472L);
        setElement(term143, 3, term211);
        setElement(term12, 4, term143);
        setField(term11, term11.getClass(), "backtrace", term12);
        setField(term11, term11.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term11, term11.getClass(), "cause", term11);
        setField(term11, term11.getClass(), "stackTrace", term256);
        setIntField(term11, term11.getClass(), "depth", 37);
        setIntField(term258, term258.getClass(), "modCount", 0);
        setField(term11, term11.getClass(), "suppressedExceptions", term258);
        setField(term10, term10.getClass(), "value", term11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.util.concurrent.atomic.AtomicReference");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10;
        try {
            callMethod(klass, "hasValueDeserializerFor", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


