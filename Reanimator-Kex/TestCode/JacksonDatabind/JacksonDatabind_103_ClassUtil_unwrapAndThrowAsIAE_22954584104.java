package com.fasterxml.jackson.databind.util;

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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_unwrapAndThrowAsIAE_22954584104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25636;

    public ClassUtil_unwrapAndThrowAsIAE_22954584104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25705 = Class.forName((String) "java.io.PipedInputStream");
        Class<? extends Object> term25708 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceValuesToIntTask");
        Class<? extends Object> term25710 = Class.forName((String) "java.util.concurrent.atomic.AtomicLongArray");
        Class<? extends Object> term25714 = Class.forName((String) "com.fasterxml.jackson.core.ObjectCodec");
        Class<? extends Object> term25719 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer");
        Class<? extends Object> term25723 = Class.forName((String) "java.util.Hashtable$Entry");
        Class<? extends Object> term25727 = Class.forName((String) "java.util.Vector$ListItr");
        Class<? extends Object> term25731 = Class.forName((String) "java.lang.ref.ReferenceQueue");
        Class<? extends Object> term25735 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueSpliterator");
        Class<? extends Object> term25739 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder");
        Class<? extends Object> term25743 = Class.forName((String) "java.lang.ref.Reference");
        Class<? extends Object> term25747 = Class.forName((String) "java.lang.NamedPackage");
        Class<? extends Object> term25751 = Class.forName((String) "java.util.stream.IntPipeline$2");
        Class<? extends Object> term25755 = Class.forName((String) "java.util.concurrent.LinkedTransferQueue");
        Class<? extends Object> term25758 = Class.forName((String) "com.fasterxml.jackson.core.io.OutputDecorator");
        Class<? extends Object> term25761 = Class.forName((String) "java.util.concurrent.locks.StampedLock$ReadLockView");
        Class<? extends Object> term25764 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$DescendingItr");
        Class<? extends Object> term25767 = Class.forName((String) "java.util.stream.AbstractSpinedBuffer");
        Class<? extends Object> term25871 = Class.forName((String) "java.io.ObjectStreamClass$3");
        Class<? extends Object> term25873 = Class.forName((String) "java.util.stream.Node$Builder$OfDouble");
        term25636 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term25637 = (Object[]) newArray("java.lang.Object", 5);
        short[] term25638 = (short[]) newShortArray(32);
        int[] term25671 = (int[]) newIntArray(32);
        Object[] term25704 = (Object[]) newArray("java.lang.Object", 32);
        long[] term25770 = (long[]) newLongArray(32);
        Object[] term25803 = (Object[]) newArray("java.lang.Object", 5);
        short[] term25804 = (short[]) newShortArray(32);
        int[] term25837 = (int[]) newIntArray(32);
        Object[] term25870 = (Object[]) newArray("java.lang.Object", 32);
        long[] term25875 = (long[]) newLongArray(32);
        Object[] term25920 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term25922 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term25638, 0, (short) 1);
        setShortElement(term25638, 1, (short) 2);
        setShortElement(term25638, 2, (short) 1);
        setShortElement(term25638, 3, (short) 7);
        setShortElement(term25638, 4, (short) 2);
        setShortElement(term25638, 5, (short) 1);
        setShortElement(term25638, 6, (short) 6);
        setShortElement(term25638, 7, (short) 2);
        setShortElement(term25638, 8, (short) 10);
        setShortElement(term25638, 9, (short) 11);
        setShortElement(term25638, 10, (short) 29);
        setShortElement(term25638, 11, (short) 5);
        setShortElement(term25638, 12, (short) 4);
        setShortElement(term25638, 13, (short) 6);
        setShortElement(term25638, 14, (short) 8);
        setShortElement(term25638, 15, (short) 6);
        setShortElement(term25638, 16, (short) 9);
        setShortElement(term25638, 17, (short) 10);
        setShortElement(term25638, 18, (short) 11);
        setShortElement(term25638, 19, (short) 4);
        setShortElement(term25638, 20, (short) 1);
        setShortElement(term25638, 22, (short) 10);
        setShortElement(term25638, 23, (short) 3);
        setShortElement(term25638, 24, (short) 4);
        setShortElement(term25638, 25, (short) 9);
        setShortElement(term25638, 26, (short) 1);
        setShortElement(term25638, 27, (short) 2);
        setShortElement(term25638, 28, (short) 3);
        setShortElement(term25638, 29, (short) 3);
        setShortElement(term25638, 30, (short) 13);
        setShortElement(term25638, 31, (short) 1);
        setElement(term25637, 0, term25638);
        setIntElement(term25671, 1, 5570560);
        setIntElement(term25671, 2, 327680);
        setIntElement(term25671, 3, 4456454);
        setIntElement(term25671, 4, 1769472);
        setIntElement(term25671, 5, 14876672);
        setIntElement(term25671, 6, 6225920);
        setIntElement(term25671, 7, 917504);
        setIntElement(term25671, 8, 327680);
        setIntElement(term25671, 9, 8519680);
        setIntElement(term25671, 10, 917504);
        setIntElement(term25671, 11, 11993088);
        setIntElement(term25671, 12, 655360);
        setIntElement(term25671, 13, 7864320);
        setIntElement(term25671, 14, 3735552);
        setIntElement(term25671, 15, 7143424);
        setIntElement(term25671, 16, 8454144);
        setIntElement(term25671, 17, 9240576);
        setIntElement(term25671, 18, 196608);
        setIntElement(term25671, 19, 3801088);
        setIntElement(term25671, 20, 786432);
        setIntElement(term25671, 21, 589824);
        setIntElement(term25671, 22, 17170432);
        setIntElement(term25671, 23, 1376256);
        setIntElement(term25671, 24, 5242880);
        setIntElement(term25671, 25, 2883584);
        setIntElement(term25671, 26, 20774912);
        setIntElement(term25671, 27, 262144);
        setIntElement(term25671, 28, 2555904);
        setIntElement(term25671, 29, 1835008);
        setIntElement(term25671, 30, 6029312);
        setIntElement(term25671, 31, 327680);
        setElement(term25637, 1, term25671);
        setElement(term25704, 0, term25705);
        setElement(term25704, 1, term25705);
        setElement(term25704, 2, term25708);
        setElement(term25704, 3, term25710);
        setElement(term25704, 4, term25714);
        setElement(term25704, 5, term25714);
        setElement(term25704, 6, term25719);
        setElement(term25704, 7, term25719);
        setElement(term25704, 8, term25723);
        setElement(term25704, 9, term25723);
        setElement(term25704, 10, term25723);
        setElement(term25704, 11, term25723);
        setElement(term25704, 12, term25723);
        setElement(term25704, 13, term25727);
        setElement(term25704, 14, term25727);
        setElement(term25704, 15, term25731);
        setElement(term25704, 16, term25731);
        setElement(term25704, 17, term25731);
        setElement(term25704, 18, term25731);
        setElement(term25704, 19, term25735);
        setElement(term25704, 20, term25735);
        setElement(term25704, 21, term25735);
        setElement(term25704, 22, term25739);
        setElement(term25704, 23, term25731);
        setElement(term25704, 24, term25743);
        setElement(term25704, 25, term25747);
        setElement(term25704, 26, term25751);
        setElement(term25704, 27, term25755);
        setElement(term25704, 28, term25758);
        setElement(term25704, 29, term25761);
        setElement(term25704, 30, term25764);
        setElement(term25704, 31, term25767);
        setElement(term25637, 2, term25704);
        setLongElement(term25770, 0, 34363746224L);
        setLongElement(term25770, 1, 34363775512L);
        setLongElement(term25770, 2, 34363775512L);
        setLongElement(term25770, 3, 34363775512L);
        setLongElement(term25770, 4, 131482375099808L);
        setLongElement(term25770, 5, 34364440080L);
        setLongElement(term25770, 6, 131482375166912L);
        setLongElement(term25770, 7, 131482375009648L);
        setLongElement(term25770, 8, 131482375009536L);
        setLongElement(term25770, 9, 131482375009680L);
        setLongElement(term25770, 10, 131482375053392L);
        setLongElement(term25770, 11, 34363766248L);
        setLongElement(term25770, 12, 34363766248L);
        setLongElement(term25770, 13, 131478873767568L);
        setLongElement(term25770, 14, 131478873767568L);
        setLongElement(term25770, 15, 131478873767424L);
        setLongElement(term25770, 16, 131478873811328L);
        setLongElement(term25770, 17, 131478873812976L);
        setLongElement(term25770, 18, 131478873813744L);
        setLongElement(term25770, 19, 131482377128080L);
        setLongElement(term25770, 20, 34363739368L);
        setLongElement(term25770, 21, 34363739368L);
        setLongElement(term25770, 22, 131478873766064L);
        setLongElement(term25770, 23, 34363829248L);
        setLongElement(term25770, 24, 131482377128080L);
        setLongElement(term25770, 25, 131482377482976L);
        setLongElement(term25770, 26, 34363745472L);
        setLongElement(term25770, 27, 34364710216L);
        setLongElement(term25770, 28, 34363745472L);
        setLongElement(term25770, 29, 34363745472L);
        setLongElement(term25770, 30, 34364896224L);
        setLongElement(term25770, 31, 34363745472L);
        setElement(term25637, 3, term25770);
        setShortElement(term25804, 0, (short) 2);
        setShortElement(term25804, 1, (short) 12);
        setElement(term25803, 0, term25804);
        setIntElement(term25837, 0, 1638400);
        setIntElement(term25837, 1, 720907);
        setElement(term25803, 1, term25837);
        setElement(term25870, 0, term25871);
        setElement(term25870, 1, term25873);
        setElement(term25803, 2, term25870);
        setLongElement(term25875, 0, 34363745472L);
        setLongElement(term25875, 1, 34363745472L);
        setElement(term25803, 3, term25875);
        setElement(term25637, 4, term25803);
        setField(term25636, term25636.getClass(), "backtrace", term25637);
        setField(term25636, term25636.getClass(), "detailMessage", "eZFUvlxvGV");
        setField(term25636, term25636.getClass(), "cause", term25636);
        setField(term25636, term25636.getClass(), "stackTrace", term25920);
        setIntField(term25636, term25636.getClass(), "depth", 34);
        setIntField(term25922, term25922.getClass(), "modCount", 0);
        setField(term25636, term25636.getClass(), "suppressedExceptions", term25922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = term25636;
        try {
            callMethod(klass, "unwrapAndThrowAsIAE", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


