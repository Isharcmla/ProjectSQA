package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class StdSerializer_wrapAndThrow_202533723820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055;
     Object term3339;
     Object term3340;

    public StdSerializer_wrapAndThrow_202533723820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3124 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfInt");
        Class<? extends Object> term3127 = Class.forName((String) "java.lang.ref.SoftReference");
        Class<? extends Object> term3129 = Class.forName((String) "java.util.ImmutableCollections$Set12");
        Class<? extends Object> term3133 = Class.forName((String) "java.io.StringBufferInputStream");
        Class<? extends Object> term3138 = Class.forName((String) "java.nio.channels.NonReadableChannelException");
        Class<? extends Object> term3142 = Class.forName((String) "java.util.DualPivotQuicksort");
        Class<? extends Object> term3146 = Class.forName((String) "java.util.ServiceConfigurationError");
        Class<? extends Object> term3150 = Class.forName((String) "java.util.TreeMap$ValueIterator");
        Class<? extends Object> term3154 = Class.forName((String) "java.util.zip.Adler32");
        Class<? extends Object> term3158 = Class.forName((String) "java.util.function.Predicate");
        Class<? extends Object> term3162 = Class.forName((String) "java.util.function.ToDoubleFunction");
        Class<? extends Object> term3166 = Class.forName((String) "java.util.List");
        Class<? extends Object> term3170 = Class.forName((String) "java.lang.ClassFormatError");
        Class<? extends Object> term3174 = Class.forName((String) "java.util.function.ObjDoubleConsumer");
        Class<? extends Object> term3176 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJInt$Sorter");
        Class<? extends Object> term3179 = Class.forName((String) "java.util.stream.ReferencePipeline$6");
        Class<? extends Object> term3181 = Class.forName((String) "java.util.stream.FindOps$FindSink$OfInt");
        Class<? extends Object> term3183 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializer$None");
        Class<? extends Object> term3286 = Class.forName((String) "java.util.Spliterators$EmptySpliterator");
        Class<? extends Object> term3288 = Class.forName((String) "java.lang.NoSuchMethodException");
        term3055 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3056 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3057 = (short[]) newShortArray(32);
        int[] term3090 = (int[]) newIntArray(32);
        Object[] term3123 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3185 = (long[]) newLongArray(32);
        Object[] term3218 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3219 = (short[]) newShortArray(32);
        int[] term3252 = (int[]) newIntArray(32);
        Object[] term3285 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3290 = (long[]) newLongArray(32);
        Object[] term3335 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3337 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3057, 0, (short) 1);
        setShortElement(term3057, 1, (short) 2);
        setShortElement(term3057, 2, (short) 1);
        setShortElement(term3057, 3, (short) 7);
        setShortElement(term3057, 4, (short) 2);
        setShortElement(term3057, 5, (short) 1);
        setShortElement(term3057, 6, (short) 6);
        setShortElement(term3057, 7, (short) 2);
        setShortElement(term3057, 8, (short) 10);
        setShortElement(term3057, 9, (short) 11);
        setShortElement(term3057, 10, (short) 29);
        setShortElement(term3057, 11, (short) 5);
        setShortElement(term3057, 12, (short) 4);
        setShortElement(term3057, 13, (short) 5);
        setShortElement(term3057, 14, (short) 6);
        setShortElement(term3057, 15, (short) 7);
        setShortElement(term3057, 16, (short) 10);
        setShortElement(term3057, 17, (short) 11);
        setShortElement(term3057, 18, (short) 12);
        setShortElement(term3057, 19, (short) 4);
        setShortElement(term3057, 20, (short) 1);
        setShortElement(term3057, 23, (short) 3);
        setShortElement(term3057, 24, (short) 4);
        setShortElement(term3057, 25, (short) 4);
        setShortElement(term3057, 26, (short) 1);
        setShortElement(term3057, 27, (short) 2);
        setShortElement(term3057, 28, (short) 3);
        setShortElement(term3057, 29, (short) 3);
        setShortElement(term3057, 30, (short) 13);
        setShortElement(term3057, 31, (short) 1);
        setElement(term3056, 0, term3057);
        setIntElement(term3090, 1, 5570560);
        setIntElement(term3090, 2, 327680);
        setIntElement(term3090, 3, 4456454);
        setIntElement(term3090, 4, 1769472);
        setIntElement(term3090, 5, 14876672);
        setIntElement(term3090, 6, 6225920);
        setIntElement(term3090, 7, 917504);
        setIntElement(term3090, 8, 327680);
        setIntElement(term3090, 9, 8519680);
        setIntElement(term3090, 10, 917504);
        setIntElement(term3090, 11, 11993088);
        setIntElement(term3090, 12, 655360);
        setIntElement(term3090, 13, 7864320);
        setIntElement(term3090, 14, 3735552);
        setIntElement(term3090, 15, 7143424);
        setIntElement(term3090, 16, 8454144);
        setIntElement(term3090, 17, 9240576);
        setIntElement(term3090, 18, 196608);
        setIntElement(term3090, 19, 3801088);
        setIntElement(term3090, 20, 786432);
        setIntElement(term3090, 21, 589824);
        setIntElement(term3090, 22, 17170432);
        setIntElement(term3090, 23, 1376256);
        setIntElement(term3090, 24, 5242880);
        setIntElement(term3090, 25, 2883584);
        setIntElement(term3090, 26, 20774912);
        setIntElement(term3090, 27, 262144);
        setIntElement(term3090, 28, 2555904);
        setIntElement(term3090, 29, 1835008);
        setIntElement(term3090, 30, 6029312);
        setIntElement(term3090, 31, 327680);
        setElement(term3056, 1, term3090);
        setElement(term3123, 0, term3124);
        setElement(term3123, 1, term3124);
        setElement(term3123, 2, term3127);
        setElement(term3123, 3, term3129);
        setElement(term3123, 4, term3133);
        setElement(term3123, 5, term3133);
        setElement(term3123, 6, term3138);
        setElement(term3123, 7, term3138);
        setElement(term3123, 8, term3142);
        setElement(term3123, 9, term3142);
        setElement(term3123, 10, term3142);
        setElement(term3123, 11, term3142);
        setElement(term3123, 12, term3142);
        setElement(term3123, 13, term3146);
        setElement(term3123, 14, term3146);
        setElement(term3123, 15, term3150);
        setElement(term3123, 16, term3150);
        setElement(term3123, 17, term3150);
        setElement(term3123, 18, term3150);
        setElement(term3123, 19, term3154);
        setElement(term3123, 20, term3154);
        setElement(term3123, 21, term3154);
        setElement(term3123, 22, term3158);
        setElement(term3123, 23, term3150);
        setElement(term3123, 24, term3162);
        setElement(term3123, 25, term3166);
        setElement(term3123, 26, term3170);
        setElement(term3123, 27, term3174);
        setElement(term3123, 28, term3176);
        setElement(term3123, 29, term3179);
        setElement(term3123, 30, term3181);
        setElement(term3123, 31, term3183);
        setElement(term3056, 2, term3123);
        setLongElement(term3185, 0, 34363746224L);
        setLongElement(term3185, 1, 34363775512L);
        setLongElement(term3185, 2, 34363775512L);
        setLongElement(term3185, 3, 34363775512L);
        setLongElement(term3185, 4, 138182121285600L);
        setLongElement(term3185, 5, 34364440080L);
        setLongElement(term3185, 6, 138182121360080L);
        setLongElement(term3185, 7, 138182121199008L);
        setLongElement(term3185, 8, 138182121198896L);
        setLongElement(term3185, 9, 138182121199040L);
        setLongElement(term3185, 10, 138182121246480L);
        setLongElement(term3185, 11, 34363766248L);
        setLongElement(term3185, 12, 34363766248L);
        setLongElement(term3185, 13, 138179197369136L);
        setLongElement(term3185, 14, 138179197369136L);
        setLongElement(term3185, 15, 138179197368992L);
        setLongElement(term3185, 16, 138179197413552L);
        setLongElement(term3185, 17, 138179197415200L);
        setLongElement(term3185, 18, 138179197415968L);
        setLongElement(term3185, 19, 138179194349792L);
        setLongElement(term3185, 20, 34363739368L);
        setLongElement(term3185, 21, 34363739368L);
        setLongElement(term3185, 22, 138179197367632L);
        setLongElement(term3185, 23, 34363829248L);
        setLongElement(term3185, 24, 138179194349792L);
        setLongElement(term3185, 25, 138179193482640L);
        setLongElement(term3185, 26, 34363745472L);
        setLongElement(term3185, 27, 34364710216L);
        setLongElement(term3185, 28, 34363745472L);
        setLongElement(term3185, 29, 34363745472L);
        setLongElement(term3185, 30, 34364896224L);
        setLongElement(term3185, 31, 34363745472L);
        setElement(term3056, 3, term3185);
        setShortElement(term3219, 0, (short) 2);
        setShortElement(term3219, 1, (short) 12);
        setElement(term3218, 0, term3219);
        setIntElement(term3252, 0, 1638400);
        setIntElement(term3252, 1, 720907);
        setElement(term3218, 1, term3252);
        setElement(term3285, 0, term3286);
        setElement(term3285, 1, term3288);
        setElement(term3218, 2, term3285);
        setLongElement(term3290, 0, 34363745472L);
        setLongElement(term3290, 1, 34363745472L);
        setElement(term3218, 3, term3290);
        setElement(term3056, 4, term3218);
        setField(term3055, term3055.getClass(), "backtrace", term3056);
        setField(term3055, term3055.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term3055, term3055.getClass(), "cause", term3055);
        setField(term3055, term3055.getClass(), "stackTrace", term3335);
        setIntField(term3055, term3055.getClass(), "depth", 34);
        setIntField(term3337, term3337.getClass(), "modCount", 0);
        setField(term3055, term3055.getClass(), "suppressedExceptions", term3337);
        term3339 = newInstance(Class.forName("java.lang.Object"));
        term3340 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.Throwable");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3055;
        args[2] = term3339;
        args[3] = term3340;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


