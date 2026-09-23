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

public class SerializerProvider_mappingException_840623694119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9366;
     Object term9666;

    public SerializerProvider_mappingException_840623694119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9435 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecyclers");
        Class<? extends Object> term9438 = Class.forName((String) "java.util.UUID");
        Class<? extends Object> term9440 = Class.forName((String) "java.lang.invoke.MethodType$OffsetHolder");
        Class<? extends Object> term9444 = Class.forName((String) "java.util.regex.Pattern$Branch");
        Class<? extends Object> term9449 = Class.forName((String) "java.util.function.IntToDoubleFunction");
        Class<? extends Object> term9453 = Class.forName((String) "java.util.stream.ReduceOps$3");
        Class<? extends Object> term9457 = Class.forName((String) "java.util.stream.SortedOps$SizedRefSortingSink");
        Class<? extends Object> term9461 = Class.forName((String) "java.util.stream.SpinedBuffer");
        Class<? extends Object> term9465 = Class.forName((String) "java.io.BufferedReader");
        Class<? extends Object> term9469 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        Class<? extends Object> term9473 = Class.forName((String) "java.nio.file.Files$AcceptAllFilter");
        Class<? extends Object> term9477 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        Class<? extends Object> term9481 = Class.forName((String) "java.util.Locale$Cache");
        Class<? extends Object> term9485 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NullSerializer");
        Class<? extends Object> term9488 = Class.forName((String) "java.util.Locale$Category");
        Class<? extends Object> term9491 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term9494 = Class.forName((String) "com.fasterxml.jackson.databind.deser.AbstractDeserializer");
        Class<? extends Object> term9497 = Class.forName((String) "java.util.stream.Node$Builder$OfInt");
        Class<? extends Object> term9601 = Class.forName((String) "java.io.Console$3");
        Class<? extends Object> term9603 = Class.forName((String) "java.lang.Process$1");
        term9366 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9367 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9368 = (short[]) newShortArray(32);
        int[] term9401 = (int[]) newIntArray(32);
        Object[] term9434 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9500 = (long[]) newLongArray(32);
        Object[] term9533 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9534 = (short[]) newShortArray(32);
        int[] term9567 = (int[]) newIntArray(32);
        Object[] term9600 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9605 = (long[]) newLongArray(32);
        Object[] term9650 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9652 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9368, 0, (short) 1);
        setShortElement(term9368, 1, (short) 2);
        setShortElement(term9368, 2, (short) 1);
        setShortElement(term9368, 3, (short) 7);
        setShortElement(term9368, 4, (short) 2);
        setShortElement(term9368, 5, (short) 1);
        setShortElement(term9368, 6, (short) 6);
        setShortElement(term9368, 7, (short) 2);
        setShortElement(term9368, 8, (short) 10);
        setShortElement(term9368, 9, (short) 11);
        setShortElement(term9368, 10, (short) 29);
        setShortElement(term9368, 11, (short) 5);
        setShortElement(term9368, 12, (short) 4);
        setShortElement(term9368, 13, (short) 5);
        setShortElement(term9368, 14, (short) 6);
        setShortElement(term9368, 15, (short) 7);
        setShortElement(term9368, 16, (short) 10);
        setShortElement(term9368, 17, (short) 11);
        setShortElement(term9368, 18, (short) 12);
        setShortElement(term9368, 19, (short) 4);
        setShortElement(term9368, 20, (short) 1);
        setShortElement(term9368, 23, (short) 3);
        setShortElement(term9368, 24, (short) 4);
        setShortElement(term9368, 25, (short) 4);
        setShortElement(term9368, 26, (short) 1);
        setShortElement(term9368, 27, (short) 2);
        setShortElement(term9368, 28, (short) 3);
        setShortElement(term9368, 29, (short) 3);
        setShortElement(term9368, 30, (short) 13);
        setShortElement(term9368, 31, (short) 1);
        setElement(term9367, 0, term9368);
        setIntElement(term9401, 1, 5570560);
        setIntElement(term9401, 2, 327680);
        setIntElement(term9401, 3, 4456454);
        setIntElement(term9401, 4, 1769472);
        setIntElement(term9401, 5, 14876672);
        setIntElement(term9401, 6, 6225920);
        setIntElement(term9401, 7, 917504);
        setIntElement(term9401, 8, 327680);
        setIntElement(term9401, 9, 8519680);
        setIntElement(term9401, 10, 917504);
        setIntElement(term9401, 11, 11993088);
        setIntElement(term9401, 12, 655360);
        setIntElement(term9401, 13, 7864320);
        setIntElement(term9401, 14, 3735552);
        setIntElement(term9401, 15, 7143424);
        setIntElement(term9401, 16, 8454144);
        setIntElement(term9401, 17, 9240576);
        setIntElement(term9401, 18, 196608);
        setIntElement(term9401, 19, 3801088);
        setIntElement(term9401, 20, 786432);
        setIntElement(term9401, 21, 589824);
        setIntElement(term9401, 22, 17170432);
        setIntElement(term9401, 23, 1376256);
        setIntElement(term9401, 24, 5242880);
        setIntElement(term9401, 25, 2883584);
        setIntElement(term9401, 26, 20774912);
        setIntElement(term9401, 27, 262144);
        setIntElement(term9401, 28, 2555904);
        setIntElement(term9401, 29, 1835008);
        setIntElement(term9401, 30, 6029312);
        setIntElement(term9401, 31, 327680);
        setElement(term9367, 1, term9401);
        setElement(term9434, 0, term9435);
        setElement(term9434, 1, term9435);
        setElement(term9434, 2, term9438);
        setElement(term9434, 3, term9440);
        setElement(term9434, 4, term9444);
        setElement(term9434, 5, term9444);
        setElement(term9434, 6, term9449);
        setElement(term9434, 7, term9449);
        setElement(term9434, 8, term9453);
        setElement(term9434, 9, term9453);
        setElement(term9434, 10, term9453);
        setElement(term9434, 11, term9453);
        setElement(term9434, 12, term9453);
        setElement(term9434, 13, term9457);
        setElement(term9434, 14, term9457);
        setElement(term9434, 15, term9461);
        setElement(term9434, 16, term9461);
        setElement(term9434, 17, term9461);
        setElement(term9434, 18, term9461);
        setElement(term9434, 19, term9465);
        setElement(term9434, 20, term9465);
        setElement(term9434, 21, term9465);
        setElement(term9434, 22, term9469);
        setElement(term9434, 23, term9461);
        setElement(term9434, 24, term9473);
        setElement(term9434, 25, term9477);
        setElement(term9434, 26, term9481);
        setElement(term9434, 27, term9485);
        setElement(term9434, 28, term9488);
        setElement(term9434, 29, term9491);
        setElement(term9434, 30, term9494);
        setElement(term9434, 31, term9497);
        setElement(term9367, 2, term9434);
        setLongElement(term9500, 0, 34363746224L);
        setLongElement(term9500, 1, 34363775512L);
        setLongElement(term9500, 2, 34363775512L);
        setLongElement(term9500, 3, 34363775512L);
        setLongElement(term9500, 4, 135751908134864L);
        setLongElement(term9500, 5, 34364440080L);
        setLongElement(term9500, 6, 135751908201968L);
        setLongElement(term9500, 7, 135751907559328L);
        setLongElement(term9500, 8, 135751907559216L);
        setLongElement(term9500, 9, 135751907559360L);
        setLongElement(term9500, 10, 135751907826432L);
        setLongElement(term9500, 11, 34363766248L);
        setLongElement(term9500, 12, 34363766248L);
        setLongElement(term9500, 13, 135748386964304L);
        setLongElement(term9500, 14, 135748386964304L);
        setLongElement(term9500, 15, 135748386964160L);
        setLongElement(term9500, 16, 135748387007376L);
        setLongElement(term9500, 17, 135748387009024L);
        setLongElement(term9500, 18, 135748387009792L);
        setLongElement(term9500, 19, 135748383823440L);
        setLongElement(term9500, 20, 34363739368L);
        setLongElement(term9500, 21, 34363739368L);
        setLongElement(term9500, 22, 135748386976752L);
        setLongElement(term9500, 23, 34363829248L);
        setLongElement(term9500, 24, 135748383823440L);
        setLongElement(term9500, 25, 135748383810544L);
        setLongElement(term9500, 26, 34363745472L);
        setLongElement(term9500, 27, 34364710216L);
        setLongElement(term9500, 28, 34363745472L);
        setLongElement(term9500, 29, 34363745472L);
        setLongElement(term9500, 30, 34364896224L);
        setLongElement(term9500, 31, 34363745472L);
        setElement(term9367, 3, term9500);
        setShortElement(term9534, 0, (short) 2);
        setShortElement(term9534, 1, (short) 12);
        setElement(term9533, 0, term9534);
        setIntElement(term9567, 0, 1638400);
        setIntElement(term9567, 1, 720907);
        setElement(term9533, 1, term9567);
        setElement(term9600, 0, term9601);
        setElement(term9600, 1, term9603);
        setElement(term9533, 2, term9600);
        setLongElement(term9605, 0, 34363745472L);
        setLongElement(term9605, 1, 34363745472L);
        setElement(term9533, 3, term9605);
        setElement(term9367, 4, term9533);
        setField(term9366, term9366.getClass(), "backtrace", term9367);
        setField(term9366, term9366.getClass(), "detailMessage", "oVcInYnLWB");
        setField(term9366, term9366.getClass(), "cause", term9366);
        setField(term9366, term9366.getClass(), "stackTrace", term9650);
        setIntField(term9366, term9366.getClass(), "depth", 34);
        setIntField(term9652, term9652.getClass(), "modCount", 0);
        setField(term9366, term9366.getClass(), "suppressedExceptions", term9652);
        term9666 = (Object[]) newArray("java.lang.Object", 5);
        Object term9667 = newInstance(Class.forName("java.lang.Object"));
        Object term9668 = newInstance(Class.forName("java.lang.Object"));
        Object term9669 = newInstance(Class.forName("java.lang.Object"));
        Object term9670 = newInstance(Class.forName("java.lang.Object"));
        Object term9671 = newInstance(Class.forName("java.lang.Object"));
        setElement(term9666, 0, term9667);
        setElement(term9666, 1, term9668);
        setElement(term9666, 2, term9669);
        setElement(term9666, 3, term9670);
        setElement(term9666, 4, term9671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term9366;
        args[1] = "aJlieCFVtF";
        args[2] = term9666;
        try {
            callMethod(klass, "mappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


