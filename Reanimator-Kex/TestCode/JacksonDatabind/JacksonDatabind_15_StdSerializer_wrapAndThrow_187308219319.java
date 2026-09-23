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

public class StdSerializer_wrapAndThrow_187308219319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term333;

    public StdSerializer_wrapAndThrow_187308219319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118 = Class.forName((String) "java.util.regex.Pattern$NotBehind");
        Class<? extends Object> term121 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term123 = Class.forName((String) "java.util.function.LongFunction");
        Class<? extends Object> term127 = Class.forName((String) "java.util.zip.ZipFile$1");
        Class<? extends Object> term132 = Class.forName((String) "java.util.Collection");
        Class<? extends Object> term136 = Class.forName((String) "java.nio.file.FileSystem");
        Class<? extends Object> term140 = Class.forName((String) "java.nio.file.AccessMode");
        Class<? extends Object> term144 = Class.forName((String) "java.util.concurrent.locks.ReentrantLock$Sync");
        Class<? extends Object> term148 = Class.forName((String) "java.util.OptionalInt");
        Class<? extends Object> term152 = Class.forName((String) "java.util.AbstractMap$1");
        Class<? extends Object> term156 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        Class<? extends Object> term160 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat$Sorter");
        Class<? extends Object> term164 = Class.forName((String) "java.io.BufferedInputStream");
        Class<? extends Object> term168 = Class.forName((String) "java.util.TimerThread");
        Class<? extends Object> term170 = Class.forName((String) "java.lang.StringUTF16$LinesSpliterator");
        Class<? extends Object> term173 = Class.forName((String) "java.lang.EnumConstantNotPresentException");
        Class<? extends Object> term175 = Class.forName((String) "kex.java.util.HashMap");
        Class<? extends Object> term177 = Class.forName((String) "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Class<? extends Object> term280 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$AbstractItr");
        Class<? extends Object> term282 = Class.forName((String) "java.util.function.BiConsumer");
        term49 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term50 = (Object[]) newArray("java.lang.Object", 5);
        short[] term51 = (short[]) newShortArray(32);
        int[] term84 = (int[]) newIntArray(32);
        Object[] term117 = (Object[]) newArray("java.lang.Object", 32);
        long[] term179 = (long[]) newLongArray(32);
        Object[] term212 = (Object[]) newArray("java.lang.Object", 5);
        short[] term213 = (short[]) newShortArray(32);
        int[] term246 = (int[]) newIntArray(32);
        Object[] term279 = (Object[]) newArray("java.lang.Object", 32);
        long[] term284 = (long[]) newLongArray(32);
        Object[] term329 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term331 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term51, 0, (short) 1);
        setShortElement(term51, 1, (short) 2);
        setShortElement(term51, 2, (short) 1);
        setShortElement(term51, 3, (short) 7);
        setShortElement(term51, 4, (short) 2);
        setShortElement(term51, 5, (short) 1);
        setShortElement(term51, 6, (short) 6);
        setShortElement(term51, 7, (short) 2);
        setShortElement(term51, 8, (short) 10);
        setShortElement(term51, 9, (short) 11);
        setShortElement(term51, 10, (short) 29);
        setShortElement(term51, 11, (short) 5);
        setShortElement(term51, 12, (short) 4);
        setShortElement(term51, 13, (short) 5);
        setShortElement(term51, 14, (short) 6);
        setShortElement(term51, 15, (short) 7);
        setShortElement(term51, 16, (short) 10);
        setShortElement(term51, 17, (short) 11);
        setShortElement(term51, 18, (short) 12);
        setShortElement(term51, 19, (short) 4);
        setShortElement(term51, 20, (short) 1);
        setShortElement(term51, 23, (short) 3);
        setShortElement(term51, 24, (short) 4);
        setShortElement(term51, 25, (short) 4);
        setShortElement(term51, 26, (short) 1);
        setShortElement(term51, 27, (short) 2);
        setShortElement(term51, 28, (short) 3);
        setShortElement(term51, 29, (short) 3);
        setShortElement(term51, 30, (short) 13);
        setShortElement(term51, 31, (short) 1);
        setElement(term50, 0, term51);
        setIntElement(term84, 1, 5570560);
        setIntElement(term84, 2, 327680);
        setIntElement(term84, 3, 4456454);
        setIntElement(term84, 4, 1769472);
        setIntElement(term84, 5, 14876672);
        setIntElement(term84, 6, 6225920);
        setIntElement(term84, 7, 917504);
        setIntElement(term84, 8, 327680);
        setIntElement(term84, 9, 8519680);
        setIntElement(term84, 10, 917504);
        setIntElement(term84, 11, 11993088);
        setIntElement(term84, 12, 655360);
        setIntElement(term84, 13, 7864320);
        setIntElement(term84, 14, 3735552);
        setIntElement(term84, 15, 7143424);
        setIntElement(term84, 16, 8454144);
        setIntElement(term84, 17, 9240576);
        setIntElement(term84, 18, 196608);
        setIntElement(term84, 19, 3801088);
        setIntElement(term84, 20, 786432);
        setIntElement(term84, 21, 589824);
        setIntElement(term84, 22, 17170432);
        setIntElement(term84, 23, 1376256);
        setIntElement(term84, 24, 5242880);
        setIntElement(term84, 25, 2883584);
        setIntElement(term84, 26, 20774912);
        setIntElement(term84, 27, 262144);
        setIntElement(term84, 28, 2555904);
        setIntElement(term84, 29, 1835008);
        setIntElement(term84, 30, 6029312);
        setIntElement(term84, 31, 327680);
        setElement(term50, 1, term84);
        setElement(term117, 0, term118);
        setElement(term117, 1, term118);
        setElement(term117, 2, term121);
        setElement(term117, 3, term123);
        setElement(term117, 4, term127);
        setElement(term117, 5, term127);
        setElement(term117, 6, term132);
        setElement(term117, 7, term132);
        setElement(term117, 8, term136);
        setElement(term117, 9, term136);
        setElement(term117, 10, term136);
        setElement(term117, 11, term136);
        setElement(term117, 12, term136);
        setElement(term117, 13, term140);
        setElement(term117, 14, term140);
        setElement(term117, 15, term144);
        setElement(term117, 16, term144);
        setElement(term117, 17, term144);
        setElement(term117, 18, term144);
        setElement(term117, 19, term148);
        setElement(term117, 20, term148);
        setElement(term117, 21, term148);
        setElement(term117, 22, term152);
        setElement(term117, 23, term144);
        setElement(term117, 24, term156);
        setElement(term117, 25, term160);
        setElement(term117, 26, term164);
        setElement(term117, 27, term168);
        setElement(term117, 28, term170);
        setElement(term117, 29, term173);
        setElement(term117, 30, term175);
        setElement(term117, 31, term177);
        setElement(term50, 2, term117);
        setLongElement(term179, 0, 34363746224L);
        setLongElement(term179, 1, 34363775512L);
        setLongElement(term179, 2, 34363775512L);
        setLongElement(term179, 3, 34363775512L);
        setLongElement(term179, 4, 138182121285600L);
        setLongElement(term179, 5, 34364440080L);
        setLongElement(term179, 6, 138182121360080L);
        setLongElement(term179, 7, 138182121199008L);
        setLongElement(term179, 8, 138182121198896L);
        setLongElement(term179, 9, 138182121199040L);
        setLongElement(term179, 10, 138182121246480L);
        setLongElement(term179, 11, 34363766248L);
        setLongElement(term179, 12, 34363766248L);
        setLongElement(term179, 13, 138179197369136L);
        setLongElement(term179, 14, 138179197369136L);
        setLongElement(term179, 15, 138179197368992L);
        setLongElement(term179, 16, 138179197413552L);
        setLongElement(term179, 17, 138179197415200L);
        setLongElement(term179, 18, 138179197415968L);
        setLongElement(term179, 19, 138179194349792L);
        setLongElement(term179, 20, 34363739368L);
        setLongElement(term179, 21, 34363739368L);
        setLongElement(term179, 22, 138179197367632L);
        setLongElement(term179, 23, 34363829248L);
        setLongElement(term179, 24, 138179194349792L);
        setLongElement(term179, 25, 138179193482640L);
        setLongElement(term179, 26, 34363745472L);
        setLongElement(term179, 27, 34364710216L);
        setLongElement(term179, 28, 34363745472L);
        setLongElement(term179, 29, 34363745472L);
        setLongElement(term179, 30, 34364896224L);
        setLongElement(term179, 31, 34363745472L);
        setElement(term50, 3, term179);
        setShortElement(term213, 0, (short) 2);
        setShortElement(term213, 1, (short) 12);
        setElement(term212, 0, term213);
        setIntElement(term246, 0, 1638400);
        setIntElement(term246, 1, 720907);
        setElement(term212, 1, term246);
        setElement(term279, 0, term280);
        setElement(term279, 1, term282);
        setElement(term212, 2, term279);
        setLongElement(term284, 0, 34363745472L);
        setLongElement(term284, 1, 34363745472L);
        setElement(term212, 3, term284);
        setElement(term50, 4, term212);
        setField(term49, term49.getClass(), "backtrace", term50);
        setField(term49, term49.getClass(), "detailMessage", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "cause", term49);
        setField(term49, term49.getClass(), "stackTrace", term329);
        setIntField(term49, term49.getClass(), "depth", 34);
        setIntField(term331, term331.getClass(), "modCount", 0);
        setField(term49, term49.getClass(), "suppressedExceptions", term331);
        term333 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.StdSerializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.Throwable");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term49;
        args[2] = term333;
        args[3] = "xxtlPwDYFs";
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


