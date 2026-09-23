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

public class SettableBeanProperty_throwAsIOE_67006121966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9338;
     Object term9626;

    public SettableBeanProperty_throwAsIOE_67006121966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9407 = Class.forName((String) "java.util.jar.JarInputStream");
        Class<? extends Object> term9410 = Class.forName((String) "java.nio.channels.GatheringByteChannel");
        Class<? extends Object> term9412 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term9416 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term9421 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        Class<? extends Object> term9425 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        Class<? extends Object> term9429 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Class<? extends Object> term9433 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        Class<? extends Object> term9437 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term9441 = Class.forName((String) "java.util.stream.LongPipeline$9$1");
        Class<? extends Object> term9445 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser");
        Class<? extends Object> term9449 = Class.forName((String) "java.lang.InheritableThreadLocal");
        Class<? extends Object> term9453 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecyclers");
        Class<? extends Object> term9457 = Class.forName((String) "java.util.UUID");
        Class<? extends Object> term9460 = Class.forName((String) "java.lang.invoke.MethodType$OffsetHolder");
        Class<? extends Object> term9463 = Class.forName((String) "java.util.regex.Pattern$Branch");
        Class<? extends Object> term9466 = Class.forName((String) "java.util.function.IntToDoubleFunction");
        Class<? extends Object> term9469 = Class.forName((String) "java.util.stream.ReduceOps$3");
        Class<? extends Object> term9573 = Class.forName((String) "java.util.stream.SortedOps$SizedRefSortingSink");
        Class<? extends Object> term9575 = Class.forName((String) "java.util.stream.SpinedBuffer");
        term9338 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term9339 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9340 = (short[]) newShortArray(32);
        int[] term9373 = (int[]) newIntArray(32);
        Object[] term9406 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9472 = (long[]) newLongArray(32);
        Object[] term9505 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9506 = (short[]) newShortArray(32);
        int[] term9539 = (int[]) newIntArray(32);
        Object[] term9572 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9577 = (long[]) newLongArray(32);
        Object[] term9622 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9624 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9340, 0, (short) 1);
        setShortElement(term9340, 1, (short) 2);
        setShortElement(term9340, 2, (short) 1);
        setShortElement(term9340, 3, (short) 7);
        setShortElement(term9340, 4, (short) 2);
        setShortElement(term9340, 5, (short) 1);
        setShortElement(term9340, 6, (short) 6);
        setShortElement(term9340, 7, (short) 2);
        setShortElement(term9340, 8, (short) 10);
        setShortElement(term9340, 9, (short) 11);
        setShortElement(term9340, 10, (short) 29);
        setShortElement(term9340, 11, (short) 5);
        setShortElement(term9340, 12, (short) 4);
        setShortElement(term9340, 13, (short) 5);
        setShortElement(term9340, 14, (short) 6);
        setShortElement(term9340, 15, (short) 6);
        setShortElement(term9340, 16, (short) 9);
        setShortElement(term9340, 17, (short) 10);
        setShortElement(term9340, 18, (short) 11);
        setShortElement(term9340, 19, (short) 4);
        setShortElement(term9340, 20, (short) 1);
        setShortElement(term9340, 23, (short) 3);
        setShortElement(term9340, 24, (short) 4);
        setShortElement(term9340, 25, (short) 4);
        setShortElement(term9340, 26, (short) 1);
        setShortElement(term9340, 27, (short) 2);
        setShortElement(term9340, 28, (short) 3);
        setShortElement(term9340, 29, (short) 3);
        setShortElement(term9340, 30, (short) 13);
        setShortElement(term9340, 31, (short) 1);
        setElement(term9339, 0, term9340);
        setIntElement(term9373, 1, 5570560);
        setIntElement(term9373, 2, 327680);
        setIntElement(term9373, 3, 4456454);
        setIntElement(term9373, 4, 1769472);
        setIntElement(term9373, 5, 14876672);
        setIntElement(term9373, 6, 6225920);
        setIntElement(term9373, 7, 917504);
        setIntElement(term9373, 8, 327680);
        setIntElement(term9373, 9, 8519680);
        setIntElement(term9373, 10, 917504);
        setIntElement(term9373, 11, 11993088);
        setIntElement(term9373, 12, 655360);
        setIntElement(term9373, 13, 7864320);
        setIntElement(term9373, 14, 3735552);
        setIntElement(term9373, 15, 7143424);
        setIntElement(term9373, 16, 8454144);
        setIntElement(term9373, 17, 9240576);
        setIntElement(term9373, 18, 196608);
        setIntElement(term9373, 19, 3801088);
        setIntElement(term9373, 20, 786432);
        setIntElement(term9373, 21, 589824);
        setIntElement(term9373, 22, 17170432);
        setIntElement(term9373, 23, 1376256);
        setIntElement(term9373, 24, 5242880);
        setIntElement(term9373, 25, 2883584);
        setIntElement(term9373, 26, 20774912);
        setIntElement(term9373, 27, 262144);
        setIntElement(term9373, 28, 2555904);
        setIntElement(term9373, 29, 1835008);
        setIntElement(term9373, 30, 6029312);
        setIntElement(term9373, 31, 327680);
        setElement(term9339, 1, term9373);
        setElement(term9406, 0, term9407);
        setElement(term9406, 1, term9407);
        setElement(term9406, 2, term9410);
        setElement(term9406, 3, term9412);
        setElement(term9406, 4, term9416);
        setElement(term9406, 5, term9416);
        setElement(term9406, 6, term9421);
        setElement(term9406, 7, term9421);
        setElement(term9406, 8, term9425);
        setElement(term9406, 9, term9425);
        setElement(term9406, 10, term9425);
        setElement(term9406, 11, term9425);
        setElement(term9406, 12, term9425);
        setElement(term9406, 13, term9429);
        setElement(term9406, 14, term9429);
        setElement(term9406, 15, term9433);
        setElement(term9406, 16, term9433);
        setElement(term9406, 17, term9433);
        setElement(term9406, 18, term9433);
        setElement(term9406, 19, term9437);
        setElement(term9406, 20, term9437);
        setElement(term9406, 21, term9437);
        setElement(term9406, 22, term9441);
        setElement(term9406, 23, term9433);
        setElement(term9406, 24, term9445);
        setElement(term9406, 25, term9449);
        setElement(term9406, 26, term9453);
        setElement(term9406, 27, term9457);
        setElement(term9406, 28, term9460);
        setElement(term9406, 29, term9463);
        setElement(term9406, 30, term9466);
        setElement(term9406, 31, term9469);
        setElement(term9339, 2, term9406);
        setLongElement(term9472, 0, 34363746224L);
        setLongElement(term9472, 1, 34363775512L);
        setLongElement(term9472, 2, 34363775512L);
        setLongElement(term9472, 3, 34363775512L);
        setLongElement(term9472, 4, 134804263765536L);
        setLongElement(term9472, 5, 34364440080L);
        setLongElement(term9472, 6, 134804263832688L);
        setLongElement(term9472, 7, 134804263671680L);
        setLongElement(term9472, 8, 134804263671568L);
        setLongElement(term9472, 9, 134804263671712L);
        setLongElement(term9472, 10, 134804263719168L);
        setLongElement(term9472, 11, 34363766248L);
        setLongElement(term9472, 12, 34363766248L);
        setLongElement(term9472, 13, 134800737169776L);
        setLongElement(term9472, 14, 134800737169776L);
        setLongElement(term9472, 15, 134800737169632L);
        setLongElement(term9472, 16, 134800737173936L);
        setLongElement(term9472, 17, 134800737175584L);
        setLongElement(term9472, 18, 134800737176352L);
        setLongElement(term9472, 19, 134804265399984L);
        setLongElement(term9472, 20, 34363739368L);
        setLongElement(term9472, 21, 34363739368L);
        setLongElement(term9472, 22, 134800737127424L);
        setLongElement(term9472, 23, 34363829248L);
        setLongElement(term9472, 24, 134804265399984L);
        setLongElement(term9472, 25, 134800734005568L);
        setLongElement(term9472, 26, 34363745472L);
        setLongElement(term9472, 27, 34364710216L);
        setLongElement(term9472, 28, 34363745472L);
        setLongElement(term9472, 29, 34363745472L);
        setLongElement(term9472, 30, 34364896224L);
        setLongElement(term9472, 31, 34363745472L);
        setElement(term9339, 3, term9472);
        setShortElement(term9506, 0, (short) 2);
        setShortElement(term9506, 1, (short) 12);
        setElement(term9505, 0, term9506);
        setIntElement(term9539, 0, 1638400);
        setIntElement(term9539, 1, 720907);
        setElement(term9505, 1, term9539);
        setElement(term9572, 0, term9573);
        setElement(term9572, 1, term9575);
        setElement(term9505, 2, term9572);
        setLongElement(term9577, 0, 34363745472L);
        setLongElement(term9577, 1, 34363745472L);
        setElement(term9505, 3, term9577);
        setElement(term9339, 4, term9505);
        setField(term9338, term9338.getClass(), "backtrace", term9339);
        setField(term9338, term9338.getClass(), "detailMessage", "EGtDIRbSSb");
        setField(term9338, term9338.getClass(), "cause", term9338);
        setField(term9338, term9338.getClass(), "stackTrace", term9622);
        setIntField(term9338, term9338.getClass(), "depth", 34);
        setIntField(term9624, term9624.getClass(), "modCount", 0);
        setField(term9338, term9338.getClass(), "suppressedExceptions", term9624);
        term9626 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Exception");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term9338;
        args[1] = term9626;
        try {
            callMethod(klass, "_throwAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


