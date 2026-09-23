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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_init_972762152348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550593;

    public JsonMappingException_init_972762152348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term550321 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term550365 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term550189 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term550321, term550321.getClass(), "cause", term550365);
        setField(term550321, term550321.getClass(), "stackTrace", term550189);
        setField(term550321, term550321.getClass(), "suppressedExceptions", null);
        setField(term550321, term550321.getClass(), "detailMessage", "");
        Class<? extends Object> term550598 = Class.forName((String) "java.util.regex.Pattern$SliceNode");
        Class<? extends Object> term550600 = Class.forName((String) "java.lang.ProcessEnvironment$ExternalData");
        Class<? extends Object> term550601 = Class.forName((String) "java.util.stream.DoublePipeline$StatelessOp");
        Class<? extends Object> term550605 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfRef");
        Class<? extends Object> term550609 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldInstanceReadOnly");
        Class<? extends Object> term550613 = Class.forName((String) "java.nio.file.attribute.BasicFileAttributeView");
        Class<? extends Object> term550615 = Class.forName((String) "java.util.regex.Pattern$Ques");
        Class<? extends Object> term550617 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer");
        Class<? extends Object> term550620 = Class.forName((String) "com.fasterxml.jackson.databind.util.ViewMatcher$Single");
        Class<? extends Object> term550624 = Class.forName((String) "java.util.spi.AbstractResourceBundleProvider");
        Class<? extends Object> term550627 = Class.forName((String) "java.util.stream.MatchOps$1MatchSink");
        Class<? extends Object> term550630 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder");
        Class<? extends Object> term550633 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldInstanceReadOnly");
        Class<? extends Object> term550636 = Class.forName((String) "java.util.concurrent.FutureTask");
        Class<? extends Object> term550639 = Class.forName((String) "java.util.Queue");
        Class<? extends Object> term550641 = Class.forName((String) "java.util.stream.WhileOps$2Op");
        Class<? extends Object> term550643 = Class.forName((String) "java.util.HashSet");
        Class<? extends Object> term550646 = Class.forName((String) "java.nio.file.FileChannelLinesSpliterator$1");
        Class<? extends Object> term550649 = Class.forName((String) "java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread");
        Class<? extends Object> term550651 = Class.forName((String) "java.util.zip.ZipFile");
        Class<? extends Object> term550654 = Class.forName((String) "com.fasterxml.jackson.databind.util.Named");
        term550593 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term550594 = (Object[]) newArray("java.lang.Object", 5);
        short[] term550595 = (short[]) newShortArray(32);
        int[] term550596 = (int[]) newIntArray(32);
        Object[] term550597 = (Object[]) newArray("java.lang.Object", 32);
        long[] term550657 = (long[]) newLongArray(32);
        Object[] term550658 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term550659 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term550593, term550593.getClass(), "_path", null);
        setField(term550593, term550593.getClass(), "_processor", null);
        setField(term550593, term550593.getClass(), "_location", null);
        setShortElement(term550595, 0, (short) 1);
        setShortElement(term550595, 1, (short) 2);
        setShortElement(term550595, 2, (short) 1);
        setShortElement(term550595, 3, (short) 7);
        setShortElement(term550595, 4, (short) 14);
        setShortElement(term550595, 5, (short) 2);
        setShortElement(term550595, 6, (short) 3);
        setShortElement(term550595, 10, (short) 2);
        setShortElement(term550595, 11, (short) 4);
        setShortElement(term550595, 12, (short) 4);
        setShortElement(term550595, 13, (short) 3);
        setShortElement(term550595, 14, (short) 4);
        setShortElement(term550595, 15, (short) 4);
        setShortElement(term550595, 16, (short) 1);
        setShortElement(term550595, 17, (short) 2);
        setShortElement(term550595, 18, (short) 3);
        setShortElement(term550595, 19, (short) 3);
        setShortElement(term550595, 20, (short) 13);
        setShortElement(term550595, 21, (short) 1);
        setShortElement(term550595, 22, (short) 2);
        setShortElement(term550595, 23, (short) 12);
        setElement(term550594, 0, term550595);
        setIntElement(term550596, 1, 5570560);
        setIntElement(term550596, 2, 327680);
        setIntElement(term550596, 3, 4456454);
        setIntElement(term550596, 4, 851968);
        setIntElement(term550596, 5, 2818048);
        setIntElement(term550596, 7, 6553600);
        setIntElement(term550596, 8, 393216);
        setIntElement(term550596, 9, 3866630);
        setIntElement(term550596, 10, 14352384);
        setIntElement(term550596, 11, 10354688);
        setIntElement(term550596, 12, 2883584);
        setIntElement(term550596, 13, 786432);
        setIntElement(term550596, 14, 1441792);
        setIntElement(term550596, 15, 7733248);
        setIntElement(term550596, 16, 20774912);
        setIntElement(term550596, 17, 262144);
        setIntElement(term550596, 18, 2555904);
        setIntElement(term550596, 19, 1835008);
        setIntElement(term550596, 20, 6029312);
        setIntElement(term550596, 21, 327680);
        setIntElement(term550596, 22, 1638400);
        setIntElement(term550596, 23, 720907);
        setElement(term550594, 1, term550596);
        setElement(term550597, 0, term550598);
        setElement(term550597, 1, term550598);
        setElement(term550597, 2, term550600);
        setElement(term550597, 3, term550601);
        setElement(term550597, 4, term550605);
        setElement(term550597, 5, term550609);
        setElement(term550597, 6, term550613);
        setElement(term550597, 7, term550613);
        setElement(term550597, 8, term550615);
        setElement(term550597, 9, term550617);
        setElement(term550597, 10, term550620);
        setElement(term550597, 11, term550624);
        setElement(term550597, 12, term550627);
        setElement(term550597, 13, term550630);
        setElement(term550597, 14, term550633);
        setElement(term550597, 15, term550627);
        setElement(term550597, 16, term550636);
        setElement(term550597, 17, term550639);
        setElement(term550597, 18, term550641);
        setElement(term550597, 19, term550643);
        setElement(term550597, 20, term550646);
        setElement(term550597, 21, term550649);
        setElement(term550597, 22, term550651);
        setElement(term550597, 23, term550654);
        setElement(term550594, 2, term550597);
        setLongElement(term550657, 0, 34363746224L);
        setLongElement(term550657, 1, 34363775512L);
        setLongElement(term550657, 2, 34363775512L);
        setLongElement(term550657, 3, 34363775512L);
        setLongElement(term550657, 4, 132578326060064L);
        setLongElement(term550657, 5, 34363820048L);
        setLongElement(term550657, 6, 34364798256L);
        setLongElement(term550657, 7, 34363739368L);
        setLongElement(term550657, 8, 34363739368L);
        setLongElement(term550657, 9, 34363739368L);
        setLongElement(term550657, 10, 132582552571296L);
        setLongElement(term550657, 11, 132582552640272L);
        setLongElement(term550657, 12, 132582550089488L);
        setLongElement(term550657, 13, 132582552759024L);
        setLongElement(term550657, 14, 132582550089488L);
        setLongElement(term550657, 15, 132582550089488L);
        setLongElement(term550657, 16, 34363745472L);
        setLongElement(term550657, 17, 34364710216L);
        setLongElement(term550657, 18, 34363745472L);
        setLongElement(term550657, 19, 34363745472L);
        setLongElement(term550657, 20, 34364896224L);
        setLongElement(term550657, 21, 34363745472L);
        setLongElement(term550657, 22, 34363745472L);
        setLongElement(term550657, 23, 34363745472L);
        setElement(term550594, 3, term550657);
        setField(term550593, term550593.getClass(), "backtrace", term550594);
        setField(term550593, term550593.getClass(), "detailMessage", null);
        setField(term550593, term550593.getClass(), "cause", term550593);
        setField(term550593, term550593.getClass(), "stackTrace", term550658);
        setIntField(term550593, term550593.getClass(), "depth", 24);
        setIntField(term550659, term550659.getClass(), "modCount", 0);
        setField(term550593, term550593.getClass(), "suppressedExceptions", term550659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term550593));
    }

};


