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

public class ObjectMapper_canDeserialize_1244554294331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;

    public ObjectMapper_canDeserialize_1244554294331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2669 = Class.forName((String) "java.nio.file.LinkPermission");
        Class<? extends Object> term2671 = Class.forName((String) "com.fasterxml.jackson.databind.util.LRUMap");
        Class<? extends Object> term2673 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceKeysToLongTask");
        Class<? extends Object> term2675 = Class.forName((String) "java.lang.invoke.VarHandleChars$Array");
        Class<? extends Object> term2677 = Class.forName((String) "java.lang.VerifyError");
        Class<? extends Object> term2679 = Class.forName((String) "java.util.concurrent.BlockingQueue");
        Class<? extends Object> term2681 = Class.forName((String) "java.nio.channels.SelectionKey");
        Class<? extends Object> term2683 = Class.forName((String) "java.util.TreeMap$EntryIterator");
        Class<? extends Object> term2685 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.CollectionSerializer");
        Class<? extends Object> term2687 = Class.forName((String) "java.io.ObjectStreamClass$2");
        Class<? extends Object> term2689 = Class.forName((String) "java.lang.ProcessEnvironment$Variable");
        Class<? extends Object> term2691 = Class.forName((String) "kex.java.util.Arrays$NaturalOrder");
        Class<? extends Object> term2693 = Class.forName((String) "com.fasterxml.jackson.databind.SerializerProvider");
        Class<? extends Object> term2695 = Class.forName((String) "com.fasterxml.jackson.core.io.MergedStream");
        Class<? extends Object> term2697 = Class.forName((String) "java.nio.channels.ReadableByteChannel");
        term2599 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2600 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term2601 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2602 = (short[]) newShortArray(32);
        int[] term2635 = (int[]) newIntArray(32);
        Object[] term2668 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2699 = (long[]) newLongArray(32);
        Object[] term2732 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2733 = (short[]) newShortArray(32);
        int[] term2766 = (int[]) newIntArray(32);
        Object[] term2799 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2800 = (long[]) newLongArray(32);
        Object[] term2845 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term2847 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term2602, 0, (short) 1);
        setShortElement(term2602, 1, (short) 2);
        setShortElement(term2602, 2, (short) 1);
        setShortElement(term2602, 3, (short) 7);
        setShortElement(term2602, 4, (short) 2);
        setShortElement(term2602, 5, (short) 1);
        setShortElement(term2602, 6, (short) 6);
        setShortElement(term2602, 7, (short) 2);
        setShortElement(term2602, 8, (short) 10);
        setShortElement(term2602, 9, (short) 11);
        setShortElement(term2602, 10, (short) 29);
        setShortElement(term2602, 11, (short) 5);
        setShortElement(term2602, 12, (short) 19);
        setShortElement(term2602, 13, (short) 29);
        setShortElement(term2602, 14, (short) 5);
        setShortElement(term2602, 15, (short) 4);
        setShortElement(term2602, 16, (short) 6);
        setShortElement(term2602, 17, (short) 8);
        setShortElement(term2602, 18, (short) 7);
        setShortElement(term2602, 19, (short) 10);
        setShortElement(term2602, 20, (short) 11);
        setShortElement(term2602, 21, (short) 12);
        setShortElement(term2602, 22, (short) 4);
        setShortElement(term2602, 23, (short) 1);
        setShortElement(term2602, 25, (short) 10);
        setShortElement(term2602, 26, (short) 3);
        setShortElement(term2602, 27, (short) 4);
        setShortElement(term2602, 28, (short) 4);
        setShortElement(term2602, 29, (short) 1);
        setShortElement(term2602, 30, (short) 2);
        setShortElement(term2602, 31, (short) 3);
        setElement(term2601, 0, term2602);
        setIntElement(term2635, 1, 5570560);
        setIntElement(term2635, 2, 327680);
        setIntElement(term2635, 3, 4456454);
        setIntElement(term2635, 4, 1769472);
        setIntElement(term2635, 5, 14876672);
        setIntElement(term2635, 6, 6225920);
        setIntElement(term2635, 7, 917504);
        setIntElement(term2635, 8, 327680);
        setIntElement(term2635, 9, 8519680);
        setIntElement(term2635, 10, 917504);
        setIntElement(term2635, 11, 11993088);
        setIntElement(term2635, 12, 38010880);
        setIntElement(term2635, 13, 2162688);
        setIntElement(term2635, 14, 11993088);
        setIntElement(term2635, 15, 655360);
        setIntElement(term2635, 16, 7864320);
        setIntElement(term2635, 17, 3735552);
        setIntElement(term2635, 18, 7143424);
        setIntElement(term2635, 19, 8454144);
        setIntElement(term2635, 20, 9240576);
        setIntElement(term2635, 21, 196608);
        setIntElement(term2635, 22, 3801088);
        setIntElement(term2635, 23, 786432);
        setIntElement(term2635, 24, 589824);
        setIntElement(term2635, 25, 17170432);
        setIntElement(term2635, 26, 1376256);
        setIntElement(term2635, 27, 5242880);
        setIntElement(term2635, 28, 2883584);
        setIntElement(term2635, 29, 20774912);
        setIntElement(term2635, 30, 262144);
        setIntElement(term2635, 31, 2555904);
        setElement(term2601, 1, term2635);
        setElement(term2668, 0, term2669);
        setElement(term2668, 1, term2669);
        setElement(term2668, 2, term2671);
        setElement(term2668, 3, term2673);
        setElement(term2668, 4, term2675);
        setElement(term2668, 5, term2675);
        setElement(term2668, 6, term2677);
        setElement(term2668, 7, term2677);
        setElement(term2668, 8, term2679);
        setElement(term2668, 9, term2679);
        setElement(term2668, 10, term2679);
        setElement(term2668, 11, term2679);
        setElement(term2668, 12, term2679);
        setElement(term2668, 13, term2679);
        setElement(term2668, 14, term2679);
        setElement(term2668, 15, term2679);
        setElement(term2668, 16, term2681);
        setElement(term2668, 17, term2681);
        setElement(term2668, 18, term2683);
        setElement(term2668, 19, term2683);
        setElement(term2668, 20, term2683);
        setElement(term2668, 21, term2683);
        setElement(term2668, 22, term2685);
        setElement(term2668, 23, term2685);
        setElement(term2668, 24, term2685);
        setElement(term2668, 25, term2687);
        setElement(term2668, 26, term2683);
        setElement(term2668, 27, term2689);
        setElement(term2668, 28, term2691);
        setElement(term2668, 29, term2693);
        setElement(term2668, 30, term2695);
        setElement(term2668, 31, term2697);
        setElement(term2601, 2, term2668);
        setLongElement(term2699, 0, 34363746224L);
        setLongElement(term2699, 1, 34363775512L);
        setLongElement(term2699, 2, 34363775512L);
        setLongElement(term2699, 3, 34363775512L);
        setLongElement(term2699, 4, 136746595575680L);
        setLongElement(term2699, 5, 34364440080L);
        setLongElement(term2699, 6, 136746595650160L);
        setLongElement(term2699, 7, 136746595489312L);
        setLongElement(term2699, 8, 136746595489200L);
        setLongElement(term2699, 9, 136746595489344L);
        setLongElement(term2699, 10, 136746595536608L);
        setLongElement(term2699, 11, 34363766248L);
        setLongElement(term2699, 12, 136746595534128L);
        setLongElement(term2699, 13, 136746595536608L);
        setLongElement(term2699, 14, 34363766248L);
        setLongElement(term2699, 15, 34363766248L);
        setLongElement(term2699, 16, 136743751666144L);
        setLongElement(term2699, 17, 136743751666144L);
        setLongElement(term2699, 18, 136743751666000L);
        setLongElement(term2699, 19, 136743751710576L);
        setLongElement(term2699, 20, 136743751712224L);
        setLongElement(term2699, 21, 136743751712992L);
        setLongElement(term2699, 22, 136743748637360L);
        setLongElement(term2699, 23, 34363739368L);
        setLongElement(term2699, 24, 34363739368L);
        setLongElement(term2699, 25, 136743751664640L);
        setLongElement(term2699, 26, 34363829248L);
        setLongElement(term2699, 27, 136743748637360L);
        setLongElement(term2699, 28, 136743747823024L);
        setLongElement(term2699, 29, 34363745472L);
        setLongElement(term2699, 30, 34364710216L);
        setLongElement(term2699, 31, 34363745472L);
        setElement(term2601, 3, term2699);
        setShortElement(term2733, 0, (short) 3);
        setShortElement(term2733, 1, (short) 13);
        setShortElement(term2733, 2, (short) 1);
        setShortElement(term2733, 3, (short) 2);
        setShortElement(term2733, 4, (short) 12);
        setElement(term2732, 0, term2733);
        setIntElement(term2766, 0, 1835008);
        setIntElement(term2766, 1, 6029312);
        setIntElement(term2766, 2, 327680);
        setIntElement(term2766, 3, 1638400);
        setIntElement(term2766, 4, 720907);
        setElement(term2732, 1, term2766);
        setElement(term2732, 2, term2799);
        setLongElement(term2800, 0, 34363745472L);
        setLongElement(term2800, 1, 34364896224L);
        setLongElement(term2800, 2, 34363745472L);
        setLongElement(term2800, 3, 34363745472L);
        setLongElement(term2800, 4, 34363745472L);
        setElement(term2732, 3, term2800);
        setElement(term2601, 4, term2732);
        setField(term2600, term2600.getClass(), "backtrace", term2601);
        setField(term2600, term2600.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term2600, term2600.getClass(), "cause", term2600);
        setField(term2600, term2600.getClass(), "stackTrace", term2845);
        setIntField(term2600, term2600.getClass(), "depth", 37);
        setIntField(term2847, term2847.getClass(), "modCount", 0);
        setField(term2600, term2600.getClass(), "suppressedExceptions", term2847);
        setField(term2599, term2599.getClass(), "value", term2600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.util.concurrent.atomic.AtomicReference");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2599;
        try {
            callMethod(klass, "canDeserialize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


