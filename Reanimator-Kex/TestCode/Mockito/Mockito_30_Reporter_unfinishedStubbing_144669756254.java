package org.mockito.exceptions;

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
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_unfinishedStubbing_144669756254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2857;
     Object term2858;

    public Reporter_unfinishedStubbing_144669756254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2857 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term2928 = Class.forName((String) "java.util.regex.Pattern$BmpCharPredicate");
        Class<? extends Object> term2930 = Class.forName((String) "org.fest.assertions.Threshold");
        Class<? extends Object> term2932 = Class.forName((String) "java.util.Collections$SetFromMap");
        Class<? extends Object> term2934 = Class.forName((String) "org.objenesis.instantiator.gcj.GCJInstantiator");
        Class<? extends Object> term2936 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsInts$ByteBufferHandle");
        Class<? extends Object> term2938 = Class.forName((String) "org.assertj.core.condition.Negative");
        Class<? extends Object> term2940 = Class.forName((String) "java.math.BigDecimal");
        Class<? extends Object> term2942 = Class.forName((String) "java.util.ResourceBundle$CacheKeyReference");
        Class<? extends Object> term2944 = Class.forName((String) "org.assertj.core.error.ShouldContainOnlyKeys");
        Class<? extends Object> term2946 = Class.forName((String) "org.assertj.core.api.SoftAssertionError");
        Class<? extends Object> term2948 = Class.forName((String) "java.util.stream.Sink$OfInt");
        Class<? extends Object> term2950 = Class.forName((String) "org.assertj.core.internal.cglib.reflect.FastClassEmitter");
        Class<? extends Object> term2952 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfDouble");
        Class<? extends Object> term2954 = Class.forName((String) "java.lang.reflect.WildcardType");
        Class<? extends Object> term2956 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceKeysToDoubleTask");
        Class<? extends Object> term2958 = Class.forName((String) "java.util.Spliterators$AbstractIntSpliterator$HoldingIntConsumer");
        Class<? extends Object> term2960 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedHashIterator");
        term2858 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2859 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term2860 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2861 = (short[]) newShortArray(32);
        int[] term2894 = (int[]) newIntArray(32);
        Object[] term2927 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2962 = (long[]) newLongArray(32);
        Object[] term2995 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2996 = (short[]) newShortArray(32);
        int[] term3029 = (int[]) newIntArray(32);
        Object[] term3062 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3063 = (long[]) newLongArray(32);
        Object[] term3096 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3098 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term3100 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term2861, 0, (short) 1);
        setShortElement(term2861, 2, (short) 1);
        setShortElement(term2861, 3, (short) 2);
        setShortElement(term2861, 4, (short) 1);
        setShortElement(term2861, 5, (short) 7);
        setShortElement(term2861, 6, (short) 2);
        setShortElement(term2861, 7, (short) 1);
        setShortElement(term2861, 8, (short) 6);
        setShortElement(term2861, 9, (short) 2);
        setShortElement(term2861, 10, (short) 10);
        setShortElement(term2861, 11, (short) 11);
        setShortElement(term2861, 12, (short) 29);
        setShortElement(term2861, 13, (short) 5);
        setShortElement(term2861, 14, (short) 4);
        setShortElement(term2861, 15, (short) 4);
        setShortElement(term2861, 16, (short) 3);
        setShortElement(term2861, 17, (short) 5);
        setShortElement(term2861, 18, (short) 9);
        setShortElement(term2861, 19, (short) 10);
        setShortElement(term2861, 20, (short) 11);
        setShortElement(term2861, 21, (short) 4);
        setShortElement(term2861, 22, (short) 1);
        setShortElement(term2861, 24, (short) 10);
        setShortElement(term2861, 25, (short) 3);
        setShortElement(term2861, 26, (short) 4);
        setShortElement(term2861, 27, (short) 9);
        setShortElement(term2861, 28, (short) 1);
        setShortElement(term2861, 29, (short) 2);
        setShortElement(term2861, 30, (short) 3);
        setShortElement(term2861, 31, (short) 3);
        setElement(term2860, 0, term2861);
        setIntElement(term2894, 0, 917504);
        setIntElement(term2894, 1, 524288);
        setIntElement(term2894, 3, 5570560);
        setIntElement(term2894, 4, 327680);
        setIntElement(term2894, 5, 4456454);
        setIntElement(term2894, 6, 1769472);
        setIntElement(term2894, 7, 14876672);
        setIntElement(term2894, 8, 6225920);
        setIntElement(term2894, 9, 917504);
        setIntElement(term2894, 10, 327680);
        setIntElement(term2894, 11, 8519680);
        setIntElement(term2894, 12, 917504);
        setIntElement(term2894, 13, 11993088);
        setIntElement(term2894, 14, 655360);
        setIntElement(term2894, 15, 7864320);
        setIntElement(term2894, 16, 3735552);
        setIntElement(term2894, 17, 7143424);
        setIntElement(term2894, 18, 8454144);
        setIntElement(term2894, 19, 9240576);
        setIntElement(term2894, 20, 196608);
        setIntElement(term2894, 21, 3801088);
        setIntElement(term2894, 22, 786432);
        setIntElement(term2894, 23, 589824);
        setIntElement(term2894, 24, 17170432);
        setIntElement(term2894, 25, 1376256);
        setIntElement(term2894, 26, 5242880);
        setIntElement(term2894, 27, 2883584);
        setIntElement(term2894, 28, 20774912);
        setIntElement(term2894, 29, 262144);
        setIntElement(term2894, 30, 2555904);
        setIntElement(term2894, 31, 1835008);
        setElement(term2860, 1, term2894);
        setElement(term2927, 0, term2928);
        setElement(term2927, 1, term2928);
        setElement(term2927, 2, term2930);
        setElement(term2927, 3, term2930);
        setElement(term2927, 4, term2932);
        setElement(term2927, 5, term2934);
        setElement(term2927, 6, term2936);
        setElement(term2927, 7, term2936);
        setElement(term2927, 8, term2938);
        setElement(term2927, 9, term2938);
        setElement(term2927, 10, term2940);
        setElement(term2927, 11, term2940);
        setElement(term2927, 12, term2940);
        setElement(term2927, 13, term2940);
        setElement(term2927, 14, term2940);
        setElement(term2927, 15, term2942);
        setElement(term2927, 16, term2942);
        setElement(term2927, 17, term2944);
        setElement(term2927, 18, term2944);
        setElement(term2927, 19, term2944);
        setElement(term2927, 20, term2944);
        setElement(term2927, 21, term2946);
        setElement(term2927, 22, term2946);
        setElement(term2927, 23, term2946);
        setElement(term2927, 24, term2948);
        setElement(term2927, 25, term2944);
        setElement(term2927, 26, term2950);
        setElement(term2927, 27, term2952);
        setElement(term2927, 28, term2954);
        setElement(term2927, 29, term2956);
        setElement(term2927, 30, term2958);
        setElement(term2927, 31, term2960);
        setElement(term2860, 2, term2927);
        setLongElement(term2962, 0, 34363745304L);
        setLongElement(term2962, 1, 34363745304L);
        setLongElement(term2962, 2, 34363746224L);
        setLongElement(term2962, 3, 34363775512L);
        setLongElement(term2962, 4, 34363775512L);
        setLongElement(term2962, 5, 34363775512L);
        setLongElement(term2962, 6, 128809362246416L);
        setLongElement(term2962, 7, 34364440080L);
        setLongElement(term2962, 8, 128809362321008L);
        setLongElement(term2962, 9, 128809362085936L);
        setLongElement(term2962, 10, 128809362085824L);
        setLongElement(term2962, 11, 128809362085968L);
        setLongElement(term2962, 12, 128809362207296L);
        setLongElement(term2962, 13, 34363766248L);
        setLongElement(term2962, 14, 34363766248L);
        setLongElement(term2962, 15, 128806364538672L);
        setLongElement(term2962, 16, 128806364538672L);
        setLongElement(term2962, 17, 128806364538528L);
        setLongElement(term2962, 18, 128806364549760L);
        setLongElement(term2962, 19, 128806364551280L);
        setLongElement(term2962, 20, 128806364552048L);
        setLongElement(term2962, 21, 128806361950816L);
        setLongElement(term2962, 22, 34363739368L);
        setLongElement(term2962, 23, 34363739368L);
        setLongElement(term2962, 24, 128806364546688L);
        setLongElement(term2962, 25, 34363829248L);
        setLongElement(term2962, 26, 128806361950816L);
        setLongElement(term2962, 27, 128809410801520L);
        setLongElement(term2962, 28, 34363745472L);
        setLongElement(term2962, 29, 34364710216L);
        setLongElement(term2962, 30, 34363745472L);
        setLongElement(term2962, 31, 34363745472L);
        setElement(term2860, 3, term2962);
        setShortElement(term2996, 0, (short) 13);
        setShortElement(term2996, 1, (short) 1);
        setShortElement(term2996, 2, (short) 2);
        setShortElement(term2996, 3, (short) 12);
        setElement(term2995, 0, term2996);
        setIntElement(term3029, 0, 6029312);
        setIntElement(term3029, 1, 327680);
        setIntElement(term3029, 2, 1638400);
        setIntElement(term3029, 3, 720907);
        setElement(term2995, 1, term3029);
        setElement(term2995, 2, term3062);
        setLongElement(term3063, 0, 34364896224L);
        setLongElement(term3063, 1, 34363745472L);
        setLongElement(term3063, 2, 34363745472L);
        setLongElement(term3063, 3, 34363745472L);
        setElement(term2995, 3, term3063);
        setElement(term2860, 4, term2995);
        setField(term2859, term2859.getClass(), "backtrace", term2860);
        setField(term2859, term2859.getClass(), "detailMessage", null);
        setField(term2859, term2859.getClass(), "cause", term2859);
        setField(term2859, term2859.getClass(), "stackTrace", term3096);
        setIntField(term2859, term2859.getClass(), "depth", 36);
        setIntField(term3098, term3098.getClass(), "modCount", 0);
        setField(term2859, term2859.getClass(), "suppressedExceptions", term3098);
        setField(term2858, term2858.getClass(), "stackTraceHolder", term2859);
        setField(term2858, term2858.getClass(), "stackTraceFilter", term3100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[1];
        args[0] = term2858;
        try {
            callMethod(klass, "unfinishedStubbing", argTypes, term2857, args);
            assertTrue(false);
        }
        catch (UnfinishedStubbingException e) {
        }

    }

};


