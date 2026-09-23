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

public class StdValueInstantiator_wrapAsJsonMappingException_210558287087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6315;

    public StdValueInstantiator_wrapAsJsonMappingException_210558287087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6384 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        Class<? extends Object> term6387 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term6389 = Class.forName((String) "java.nio.file.FileSystemLoopException");
        Class<? extends Object> term6393 = Class.forName((String) "java.util.function.IntFunction");
        Class<? extends Object> term6398 = Class.forName((String) "java.util.EnumMap$1");
        Class<? extends Object> term6402 = Class.forName((String) "java.io.ObjectInputStream$Logging");
        Class<? extends Object> term6406 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        Class<? extends Object> term6410 = Class.forName((String) "java.util.EnumMap$ValueIterator");
        Class<? extends Object> term6414 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        Class<? extends Object> term6418 = Class.forName((String) "java.util.stream.ReduceOps$Box");
        Class<? extends Object> term6422 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Merger");
        Class<? extends Object> term6426 = Class.forName((String) "java.lang.ref.Finalizer$1");
        Class<? extends Object> term6430 = Class.forName((String) "java.util.LinkedHashSet");
        Class<? extends Object> term6434 = Class.forName((String) "java.util.AbstractMap$2");
        Class<? extends Object> term6437 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term6440 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term6443 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        Class<? extends Object> term6446 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        Class<? extends Object> term6550 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Class<? extends Object> term6552 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        term6315 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6316 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6317 = (short[]) newShortArray(32);
        int[] term6350 = (int[]) newIntArray(32);
        Object[] term6383 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6449 = (long[]) newLongArray(32);
        Object[] term6482 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6483 = (short[]) newShortArray(32);
        int[] term6516 = (int[]) newIntArray(32);
        Object[] term6549 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6554 = (long[]) newLongArray(32);
        Object[] term6599 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6601 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6317, 0, (short) 1);
        setShortElement(term6317, 1, (short) 2);
        setShortElement(term6317, 2, (short) 1);
        setShortElement(term6317, 3, (short) 7);
        setShortElement(term6317, 4, (short) 2);
        setShortElement(term6317, 5, (short) 1);
        setShortElement(term6317, 6, (short) 6);
        setShortElement(term6317, 7, (short) 2);
        setShortElement(term6317, 8, (short) 10);
        setShortElement(term6317, 9, (short) 11);
        setShortElement(term6317, 10, (short) 29);
        setShortElement(term6317, 11, (short) 5);
        setShortElement(term6317, 12, (short) 4);
        setShortElement(term6317, 13, (short) 5);
        setShortElement(term6317, 14, (short) 6);
        setShortElement(term6317, 15, (short) 6);
        setShortElement(term6317, 16, (short) 9);
        setShortElement(term6317, 17, (short) 10);
        setShortElement(term6317, 18, (short) 11);
        setShortElement(term6317, 19, (short) 4);
        setShortElement(term6317, 20, (short) 1);
        setShortElement(term6317, 23, (short) 3);
        setShortElement(term6317, 24, (short) 4);
        setShortElement(term6317, 25, (short) 4);
        setShortElement(term6317, 26, (short) 1);
        setShortElement(term6317, 27, (short) 2);
        setShortElement(term6317, 28, (short) 3);
        setShortElement(term6317, 29, (short) 3);
        setShortElement(term6317, 30, (short) 13);
        setShortElement(term6317, 31, (short) 1);
        setElement(term6316, 0, term6317);
        setIntElement(term6350, 1, 5570560);
        setIntElement(term6350, 2, 327680);
        setIntElement(term6350, 3, 4456454);
        setIntElement(term6350, 4, 1769472);
        setIntElement(term6350, 5, 14876672);
        setIntElement(term6350, 6, 6225920);
        setIntElement(term6350, 7, 917504);
        setIntElement(term6350, 8, 327680);
        setIntElement(term6350, 9, 8519680);
        setIntElement(term6350, 10, 917504);
        setIntElement(term6350, 11, 11993088);
        setIntElement(term6350, 12, 655360);
        setIntElement(term6350, 13, 7864320);
        setIntElement(term6350, 14, 3735552);
        setIntElement(term6350, 15, 7143424);
        setIntElement(term6350, 16, 8454144);
        setIntElement(term6350, 17, 9240576);
        setIntElement(term6350, 18, 196608);
        setIntElement(term6350, 19, 3801088);
        setIntElement(term6350, 20, 786432);
        setIntElement(term6350, 21, 589824);
        setIntElement(term6350, 22, 17170432);
        setIntElement(term6350, 23, 1376256);
        setIntElement(term6350, 24, 5242880);
        setIntElement(term6350, 25, 2883584);
        setIntElement(term6350, 26, 20774912);
        setIntElement(term6350, 27, 262144);
        setIntElement(term6350, 28, 2555904);
        setIntElement(term6350, 29, 1835008);
        setIntElement(term6350, 30, 6029312);
        setIntElement(term6350, 31, 327680);
        setElement(term6316, 1, term6350);
        setElement(term6383, 0, term6384);
        setElement(term6383, 1, term6384);
        setElement(term6383, 2, term6387);
        setElement(term6383, 3, term6389);
        setElement(term6383, 4, term6393);
        setElement(term6383, 5, term6393);
        setElement(term6383, 6, term6398);
        setElement(term6383, 7, term6398);
        setElement(term6383, 8, term6402);
        setElement(term6383, 9, term6402);
        setElement(term6383, 10, term6402);
        setElement(term6383, 11, term6402);
        setElement(term6383, 12, term6402);
        setElement(term6383, 13, term6406);
        setElement(term6383, 14, term6406);
        setElement(term6383, 15, term6410);
        setElement(term6383, 16, term6410);
        setElement(term6383, 17, term6410);
        setElement(term6383, 18, term6410);
        setElement(term6383, 19, term6414);
        setElement(term6383, 20, term6414);
        setElement(term6383, 21, term6414);
        setElement(term6383, 22, term6418);
        setElement(term6383, 23, term6410);
        setElement(term6383, 24, term6422);
        setElement(term6383, 25, term6426);
        setElement(term6383, 26, term6430);
        setElement(term6383, 27, term6434);
        setElement(term6383, 28, term6437);
        setElement(term6383, 29, term6440);
        setElement(term6383, 30, term6443);
        setElement(term6383, 31, term6446);
        setElement(term6316, 2, term6383);
        setLongElement(term6449, 0, 34363746224L);
        setLongElement(term6449, 1, 34363775512L);
        setLongElement(term6449, 2, 34363775512L);
        setLongElement(term6449, 3, 34363775512L);
        setLongElement(term6449, 4, 140671122080048L);
        setLongElement(term6449, 5, 34364440080L);
        setLongElement(term6449, 6, 140671122147248L);
        setLongElement(term6449, 7, 140671121989648L);
        setLongElement(term6449, 8, 140671121989536L);
        setLongElement(term6449, 9, 140671121989680L);
        setLongElement(term6449, 10, 140671122033680L);
        setLongElement(term6449, 11, 34363766248L);
        setLongElement(term6449, 12, 34363766248L);
        setLongElement(term6449, 13, 140667513310992L);
        setLongElement(term6449, 14, 140667513310992L);
        setLongElement(term6449, 15, 140667513310848L);
        setLongElement(term6449, 16, 140667513354752L);
        setLongElement(term6449, 17, 140667513356400L);
        setLongElement(term6449, 18, 140667513357168L);
        setLongElement(term6449, 19, 140671123758128L);
        setLongElement(term6449, 20, 34363739368L);
        setLongElement(term6449, 21, 34363739368L);
        setLongElement(term6449, 22, 140667513309488L);
        setLongElement(term6449, 23, 34363829248L);
        setLongElement(term6449, 24, 140671123758128L);
        setLongElement(term6449, 25, 140671123559536L);
        setLongElement(term6449, 26, 34363745472L);
        setLongElement(term6449, 27, 34364710216L);
        setLongElement(term6449, 28, 34363745472L);
        setLongElement(term6449, 29, 34363745472L);
        setLongElement(term6449, 30, 34364896224L);
        setLongElement(term6449, 31, 34363745472L);
        setElement(term6316, 3, term6449);
        setShortElement(term6483, 0, (short) 2);
        setShortElement(term6483, 1, (short) 12);
        setElement(term6482, 0, term6483);
        setIntElement(term6516, 0, 1638400);
        setIntElement(term6516, 1, 720907);
        setElement(term6482, 1, term6516);
        setElement(term6549, 0, term6550);
        setElement(term6549, 1, term6552);
        setElement(term6482, 2, term6549);
        setLongElement(term6554, 0, 34363745472L);
        setLongElement(term6554, 1, 34363745472L);
        setElement(term6482, 3, term6554);
        setElement(term6316, 4, term6482);
        setField(term6315, term6315.getClass(), "backtrace", term6316);
        setField(term6315, term6315.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term6315, term6315.getClass(), "cause", term6315);
        setField(term6315, term6315.getClass(), "stackTrace", term6599);
        setIntField(term6315, term6315.getClass(), "depth", 34);
        setIntField(term6601, term6601.getClass(), "modCount", 0);
        setField(term6315, term6315.getClass(), "suppressedExceptions", term6601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6315;
        try {
            callMethod(klass, "wrapAsJsonMappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


