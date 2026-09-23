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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_closeOnFailAndThrowAsIOE_1814548157106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31872;

    public ClassUtil_closeOnFailAndThrowAsIOE_1814548157106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31941 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy");
        Class<? extends Object> term31944 = Class.forName((String) "java.util.concurrent.Phaser$QNode");
        Class<? extends Object> term31946 = Class.forName((String) "java.nio.StringCharBuffer");
        Class<? extends Object> term31950 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$1");
        Class<? extends Object> term31955 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer");
        Class<? extends Object> term31959 = Class.forName((String) "java.lang.reflect.Field");
        Class<? extends Object> term31963 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedLongSynchronizer");
        Class<? extends Object> term31967 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSubTypes");
        Class<? extends Object> term31971 = Class.forName((String) "java.util.concurrent.Exchanger$Node");
        Class<? extends Object> term31975 = Class.forName((String) "java.util.HashMap$Node");
        Class<? extends Object> term31979 = Class.forName((String) "java.nio.file.attribute.FileTime");
        Class<? extends Object> term31983 = Class.forName((String) "java.util.SplittableRandom$RandomLongsSpliterator");
        Class<? extends Object> term31987 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<? extends Object> term31991 = Class.forName((String) "java.util.stream.SpinedBuffer$OfLong$1Splitr");
        Class<? extends Object> term31994 = Class.forName((String) "java.lang.CharSequence$1CharIterator");
        Class<? extends Object> term31997 = Class.forName((String) "java.util.Collections$UnmodifiableMap");
        Class<? extends Object> term32000 = Class.forName((String) "java.util.Collections$CheckedNavigableSet");
        Class<? extends Object> term32003 = Class.forName((String) "java.util.AbstractList$RandomAccessSubList");
        Class<? extends Object> term32107 = Class.forName((String) "java.nio.charset.IllegalCharsetNameException");
        Class<? extends Object> term32109 = Class.forName((String) "java.math.MutableBigInteger");
        term31872 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term31873 = (Object[]) newArray("java.lang.Object", 5);
        short[] term31874 = (short[]) newShortArray(32);
        int[] term31907 = (int[]) newIntArray(32);
        Object[] term31940 = (Object[]) newArray("java.lang.Object", 32);
        long[] term32006 = (long[]) newLongArray(32);
        Object[] term32039 = (Object[]) newArray("java.lang.Object", 5);
        short[] term32040 = (short[]) newShortArray(32);
        int[] term32073 = (int[]) newIntArray(32);
        Object[] term32106 = (Object[]) newArray("java.lang.Object", 32);
        long[] term32111 = (long[]) newLongArray(32);
        Object[] term32156 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term32158 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term31874, 0, (short) 1);
        setShortElement(term31874, 1, (short) 2);
        setShortElement(term31874, 2, (short) 1);
        setShortElement(term31874, 3, (short) 7);
        setShortElement(term31874, 4, (short) 2);
        setShortElement(term31874, 5, (short) 1);
        setShortElement(term31874, 6, (short) 6);
        setShortElement(term31874, 7, (short) 2);
        setShortElement(term31874, 8, (short) 10);
        setShortElement(term31874, 9, (short) 11);
        setShortElement(term31874, 10, (short) 29);
        setShortElement(term31874, 11, (short) 5);
        setShortElement(term31874, 12, (short) 4);
        setShortElement(term31874, 13, (short) 6);
        setShortElement(term31874, 14, (short) 8);
        setShortElement(term31874, 15, (short) 6);
        setShortElement(term31874, 16, (short) 9);
        setShortElement(term31874, 17, (short) 10);
        setShortElement(term31874, 18, (short) 11);
        setShortElement(term31874, 19, (short) 4);
        setShortElement(term31874, 20, (short) 1);
        setShortElement(term31874, 22, (short) 10);
        setShortElement(term31874, 23, (short) 3);
        setShortElement(term31874, 24, (short) 4);
        setShortElement(term31874, 25, (short) 9);
        setShortElement(term31874, 26, (short) 1);
        setShortElement(term31874, 27, (short) 2);
        setShortElement(term31874, 28, (short) 3);
        setShortElement(term31874, 29, (short) 3);
        setShortElement(term31874, 30, (short) 13);
        setShortElement(term31874, 31, (short) 1);
        setElement(term31873, 0, term31874);
        setIntElement(term31907, 1, 5570560);
        setIntElement(term31907, 2, 327680);
        setIntElement(term31907, 3, 4456454);
        setIntElement(term31907, 4, 1769472);
        setIntElement(term31907, 5, 14876672);
        setIntElement(term31907, 6, 6225920);
        setIntElement(term31907, 7, 917504);
        setIntElement(term31907, 8, 327680);
        setIntElement(term31907, 9, 8519680);
        setIntElement(term31907, 10, 917504);
        setIntElement(term31907, 11, 11993088);
        setIntElement(term31907, 12, 655360);
        setIntElement(term31907, 13, 7864320);
        setIntElement(term31907, 14, 3735552);
        setIntElement(term31907, 15, 7143424);
        setIntElement(term31907, 16, 8454144);
        setIntElement(term31907, 17, 9240576);
        setIntElement(term31907, 18, 196608);
        setIntElement(term31907, 19, 3801088);
        setIntElement(term31907, 20, 786432);
        setIntElement(term31907, 21, 589824);
        setIntElement(term31907, 22, 17170432);
        setIntElement(term31907, 23, 1376256);
        setIntElement(term31907, 24, 5242880);
        setIntElement(term31907, 25, 2883584);
        setIntElement(term31907, 26, 20774912);
        setIntElement(term31907, 27, 262144);
        setIntElement(term31907, 28, 2555904);
        setIntElement(term31907, 29, 1835008);
        setIntElement(term31907, 30, 6029312);
        setIntElement(term31907, 31, 327680);
        setElement(term31873, 1, term31907);
        setElement(term31940, 0, term31941);
        setElement(term31940, 1, term31941);
        setElement(term31940, 2, term31944);
        setElement(term31940, 3, term31946);
        setElement(term31940, 4, term31950);
        setElement(term31940, 5, term31950);
        setElement(term31940, 6, term31955);
        setElement(term31940, 7, term31955);
        setElement(term31940, 8, term31959);
        setElement(term31940, 9, term31959);
        setElement(term31940, 10, term31959);
        setElement(term31940, 11, term31959);
        setElement(term31940, 12, term31959);
        setElement(term31940, 13, term31963);
        setElement(term31940, 14, term31963);
        setElement(term31940, 15, term31967);
        setElement(term31940, 16, term31967);
        setElement(term31940, 17, term31967);
        setElement(term31940, 18, term31967);
        setElement(term31940, 19, term31971);
        setElement(term31940, 20, term31971);
        setElement(term31940, 21, term31971);
        setElement(term31940, 22, term31975);
        setElement(term31940, 23, term31967);
        setElement(term31940, 24, term31979);
        setElement(term31940, 25, term31983);
        setElement(term31940, 26, term31987);
        setElement(term31940, 27, term31991);
        setElement(term31940, 28, term31994);
        setElement(term31940, 29, term31997);
        setElement(term31940, 30, term32000);
        setElement(term31940, 31, term32003);
        setElement(term31873, 2, term31940);
        setLongElement(term32006, 0, 34363746224L);
        setLongElement(term32006, 1, 34363775512L);
        setLongElement(term32006, 2, 34363775512L);
        setLongElement(term32006, 3, 34363775512L);
        setLongElement(term32006, 4, 131482375099808L);
        setLongElement(term32006, 5, 34364440080L);
        setLongElement(term32006, 6, 131482375166912L);
        setLongElement(term32006, 7, 131482375009648L);
        setLongElement(term32006, 8, 131482375009536L);
        setLongElement(term32006, 9, 131482375009680L);
        setLongElement(term32006, 10, 131482375053392L);
        setLongElement(term32006, 11, 34363766248L);
        setLongElement(term32006, 12, 34363766248L);
        setLongElement(term32006, 13, 131478873767568L);
        setLongElement(term32006, 14, 131478873767568L);
        setLongElement(term32006, 15, 131478873767424L);
        setLongElement(term32006, 16, 131478873811328L);
        setLongElement(term32006, 17, 131478873812976L);
        setLongElement(term32006, 18, 131478873813744L);
        setLongElement(term32006, 19, 131482377128080L);
        setLongElement(term32006, 20, 34363739368L);
        setLongElement(term32006, 21, 34363739368L);
        setLongElement(term32006, 22, 131478873766064L);
        setLongElement(term32006, 23, 34363829248L);
        setLongElement(term32006, 24, 131482377128080L);
        setLongElement(term32006, 25, 131482377482976L);
        setLongElement(term32006, 26, 34363745472L);
        setLongElement(term32006, 27, 34364710216L);
        setLongElement(term32006, 28, 34363745472L);
        setLongElement(term32006, 29, 34363745472L);
        setLongElement(term32006, 30, 34364896224L);
        setLongElement(term32006, 31, 34363745472L);
        setElement(term31873, 3, term32006);
        setShortElement(term32040, 0, (short) 2);
        setShortElement(term32040, 1, (short) 12);
        setElement(term32039, 0, term32040);
        setIntElement(term32073, 0, 1638400);
        setIntElement(term32073, 1, 720907);
        setElement(term32039, 1, term32073);
        setElement(term32106, 0, term32107);
        setElement(term32106, 1, term32109);
        setElement(term32039, 2, term32106);
        setLongElement(term32111, 0, 34363745472L);
        setLongElement(term32111, 1, 34363745472L);
        setElement(term32039, 3, term32111);
        setElement(term31873, 4, term32039);
        setField(term31872, term31872.getClass(), "backtrace", term31873);
        setField(term31872, term31872.getClass(), "detailMessage", "flxyYxBRtu");
        setField(term31872, term31872.getClass(), "cause", term31872);
        setField(term31872, term31872.getClass(), "stackTrace", term32156);
        setIntField(term31872, term31872.getClass(), "depth", 34);
        setIntField(term32158, term32158.getClass(), "modCount", 0);
        setField(term31872, term31872.getClass(), "suppressedExceptions", term32158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31872;
        try {
            callMethod(klass, "closeOnFailAndThrowAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


