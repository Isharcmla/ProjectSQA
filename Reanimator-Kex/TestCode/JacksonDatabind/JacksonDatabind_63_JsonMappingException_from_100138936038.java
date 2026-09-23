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

public class JsonMappingException_from_100138936038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65205;

    public JsonMappingException_from_100138936038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65576 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.package-info");
        Class<? extends Object> term65635 = Class.forName((String) "com.fasterxml.jackson.databind.BeanProperty");
        Class<? extends Object> term65638 = Class.forName((String) "java.math.BigDecimal$StringBuilderHelper");
        Class<? extends Object> term65640 = Class.forName((String) "java.io.ByteArrayInputStream");
        Class<? extends Object> term65644 = Class.forName((String) "com.fasterxml.jackson.databind.BeanProperty");
        Class<? extends Object> term65648 = Class.forName((String) "com.fasterxml.jackson.databind.SequenceWriter");
        Class<? extends Object> term65654 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceEntriesToLongTask");
        Class<? extends Object> term65659 = Class.forName((String) "java.lang.StackTraceElement$HashedModules");
        Class<? extends Object> term65663 = Class.forName((String) "java.lang.Process$PipeInputStream");
        Class<? extends Object> term65667 = Class.forName((String) "java.lang.ProcessEnvironment$Variable");
        Class<? extends Object> term65671 = Class.forName((String) "java.lang.Class$1");
        Class<? extends Object> term65675 = Class.forName((String) "java.util.ArrayList");
        Class<? extends Object> term65679 = Class.forName((String) "com.fasterxml.jackson.databind.SequenceWriter");
        Class<? extends Object> term65682 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper$1");
        Class<? extends Object> term65685 = Class.forName((String) "java.util.concurrent.CompletableFuture$OrRun");
        Class<? extends Object> term65689 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.Int2BooleanFunction");
        Class<? extends Object> term65692 = Class.forName((String) "java.util.HashMap$EntryIterator");
        Class<? extends Object> term65695 = Class.forName((String) "java.util.Enumeration");
        Class<? extends Object> term65699 = Class.forName((String) "java.util.ArrayList$SubList$2");
        term65205 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term65250 = (Object[]) newArray("java.lang.Object", 5);
        short[] term65272 = (short[]) newShortArray(32);
        int[] term65490 = (int[]) newIntArray(32);
        Object[] term65572 = (Object[]) newArray("java.lang.Object", 32);
        long[] term65703 = (long[]) newLongArray(32);
        Object[] term65748 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term65750 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term65205, term65205.getClass(), "_path", null);
        setField(term65205, term65205.getClass(), "_processor", null);
        setField(term65205, term65205.getClass(), "_location", null);
        setShortElement(term65272, 0, (short) 12);
        setShortElement(term65272, 1, (short) 3);
        setShortElement(term65272, 5, (short) 27);
        setShortElement(term65272, 6, (short) 2);
        setShortElement(term65272, 7, (short) 3);
        setShortElement(term65272, 11, (short) 2);
        setShortElement(term65272, 12, (short) 4);
        setShortElement(term65272, 13, (short) 4);
        setShortElement(term65272, 14, (short) 3);
        setShortElement(term65272, 15, (short) 4);
        setShortElement(term65272, 16, (short) 4);
        setShortElement(term65272, 17, (short) 1);
        setShortElement(term65272, 18, (short) 2);
        setShortElement(term65272, 19, (short) 3);
        setShortElement(term65272, 20, (short) 3);
        setShortElement(term65272, 21, (short) 13);
        setShortElement(term65272, 22, (short) 1);
        setShortElement(term65272, 23, (short) 2);
        setShortElement(term65272, 24, (short) 12);
        setElement(term65250, 0, term65272);
        setIntElement(term65490, 0, 13303808);
        setIntElement(term65490, 2, 6553600);
        setIntElement(term65490, 3, 393216);
        setIntElement(term65490, 4, 3866630);
        setIntElement(term65490, 5, 1245184);
        setIntElement(term65490, 6, 3080192);
        setIntElement(term65490, 8, 6553600);
        setIntElement(term65490, 9, 393216);
        setIntElement(term65490, 10, 3866630);
        setIntElement(term65490, 11, 14352384);
        setIntElement(term65490, 12, 10354688);
        setIntElement(term65490, 13, 2883584);
        setIntElement(term65490, 14, 786432);
        setIntElement(term65490, 15, 1441792);
        setIntElement(term65490, 16, 7733248);
        setIntElement(term65490, 17, 20774912);
        setIntElement(term65490, 18, 262144);
        setIntElement(term65490, 19, 2555904);
        setIntElement(term65490, 20, 1835008);
        setIntElement(term65490, 21, 6029312);
        setIntElement(term65490, 22, 327680);
        setIntElement(term65490, 23, 1638400);
        setIntElement(term65490, 24, 720907);
        setElement(term65250, 1, term65490);
        setElement(term65572, 0, term65576);
        setElement(term65572, 1, term65635);
        setElement(term65572, 2, term65635);
        setElement(term65572, 3, term65638);
        setElement(term65572, 4, term65640);
        setElement(term65572, 5, term65644);
        setElement(term65572, 6, term65648);
        setElement(term65572, 7, term65635);
        setElement(term65572, 8, term65635);
        setElement(term65572, 9, term65638);
        setElement(term65572, 10, term65640);
        setElement(term65572, 11, term65654);
        setElement(term65572, 12, term65659);
        setElement(term65572, 13, term65663);
        setElement(term65572, 14, term65667);
        setElement(term65572, 15, term65671);
        setElement(term65572, 16, term65663);
        setElement(term65572, 17, term65675);
        setElement(term65572, 18, term65679);
        setElement(term65572, 19, term65682);
        setElement(term65572, 20, term65685);
        setElement(term65572, 21, term65689);
        setElement(term65572, 22, term65692);
        setElement(term65572, 23, term65695);
        setElement(term65572, 24, term65699);
        setElement(term65250, 2, term65572);
        setLongElement(term65703, 0, 34363800864L);
        setLongElement(term65703, 1, 34364798256L);
        setLongElement(term65703, 2, 34363739368L);
        setLongElement(term65703, 3, 34363739368L);
        setLongElement(term65703, 4, 34363739368L);
        setLongElement(term65703, 5, 132578328998496L);
        setLongElement(term65703, 6, 34363820048L);
        setLongElement(term65703, 7, 34364798256L);
        setLongElement(term65703, 8, 34363739368L);
        setLongElement(term65703, 9, 34363739368L);
        setLongElement(term65703, 10, 34363739368L);
        setLongElement(term65703, 11, 132582552571296L);
        setLongElement(term65703, 12, 132582552640272L);
        setLongElement(term65703, 13, 132582550089488L);
        setLongElement(term65703, 14, 132582552759024L);
        setLongElement(term65703, 15, 132582550089488L);
        setLongElement(term65703, 16, 132582550089488L);
        setLongElement(term65703, 17, 34363745472L);
        setLongElement(term65703, 18, 34364710216L);
        setLongElement(term65703, 19, 34363745472L);
        setLongElement(term65703, 20, 34363745472L);
        setLongElement(term65703, 21, 34364896224L);
        setLongElement(term65703, 22, 34363745472L);
        setLongElement(term65703, 23, 34363745472L);
        setLongElement(term65703, 24, 34363745472L);
        setElement(term65250, 3, term65703);
        setField(term65205, term65205.getClass(), "backtrace", term65250);
        setField(term65205, term65205.getClass(), "detailMessage", "NRdvgJlhkX");
        setField(term65205, term65205.getClass(), "cause", term65205);
        setField(term65205, term65205.getClass(), "stackTrace", term65748);
        setIntField(term65205, term65205.getClass(), "depth", 25);
        setIntField(term65750, term65750.getClass(), "modCount", 0);
        setField(term65205, term65205.getClass(), "suppressedExceptions", term65750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term65205));
    }

};


