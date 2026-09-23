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

public class JsonMappingException_from_1729994055105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217964;
     Object term222146;
     Object term221964;

    public JsonMappingException_from_1729994055105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217964 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term222146 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term222146, term222146.getClass(), "_objectIds", null);
        setField(term222146, term222146.getClass(), "_objectIdResolvers", null);
        setField(term222146, term222146.getClass(), "_cache", null);
        setField(term222146, term222146.getClass(), "_factory", null);
        setField(term222146, term222146.getClass(), "_config", null);
        setIntField(term222146, term222146.getClass(), "_featureFlags", 0);
        setField(term222146, term222146.getClass(), "_view", null);
        setField(term222146, term222146.getClass(), "_parser", null);
        setField(term222146, term222146.getClass(), "_injectableValues", null);
        setField(term222146, term222146.getClass(), "_arrayBuilders", null);
        setField(term222146, term222146.getClass(), "_objectBuffer", null);
        setField(term222146, term222146.getClass(), "_dateFormat", null);
        setField(term222146, term222146.getClass(), "_attributes", null);
        setField(term222146, term222146.getClass(), "_currentType", null);
        Class<? extends Object> term222033 = Class.forName((String) "java.util.stream.SliceOps$2");
        Class<? extends Object> term222040 = Class.forName((String) "java.util.stream.ReduceOps$10ReducingSink");
        Class<? extends Object> term222043 = Class.forName((String) "java.util.regex.MatchResult");
        Class<? extends Object> term222045 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapKeyIterator");
        Class<? extends Object> term222049 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        Class<? extends Object> term222053 = Class.forName((String) "java.util.Collections$CheckedMap$CheckedEntrySet$CheckedEntry");
        Class<? extends Object> term222059 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$ValueIterator");
        Class<? extends Object> term222064 = Class.forName((String) "kex.java.util.HashMap$Node");
        Class<? extends Object> term222068 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJByte$Sorter");
        Class<? extends Object> term222072 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        Class<? extends Object> term222076 = Class.forName((String) "java.util.jar.JarVerifier$1");
        Class<? extends Object> term222080 = Class.forName((String) "java.util.stream.Nodes$LongSpinedNodeBuilder");
        Class<? extends Object> term222084 = Class.forName((String) "java.util.stream.Nodes$IntSpinedNodeBuilder");
        Class<? extends Object> term222087 = Class.forName((String) "java.io.ObjectInputStream$PeekInputStream");
        Class<? extends Object> term222090 = Class.forName((String) "java.util.SortedSet$1");
        Class<? extends Object> term222094 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldInstanceReadWrite");
        Class<? extends Object> term222097 = Class.forName((String) "java.util.stream.Nodes$CollectorTask");
        Class<? extends Object> term222100 = Class.forName((String) "java.util.spi.LocaleServiceProvider");
        Class<? extends Object> term222104 = Class.forName((String) "java.util.Spliterators$EmptySpliterator$OfRef");
        term221964 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term221965 = (Object[]) newArray("java.lang.Object", 5);
        short[] term221966 = (short[]) newShortArray(32);
        int[] term221999 = (int[]) newIntArray(32);
        Object[] term222032 = (Object[]) newArray("java.lang.Object", 32);
        long[] term222108 = (long[]) newLongArray(32);
        Object[] term222141 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term222143 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term221964, term221964.getClass(), "_path", null);
        setField(term221964, term221964.getClass(), "_processor", null);
        setField(term221964, term221964.getClass(), "_location", null);
        setShortElement(term221966, 0, (short) 9);
        setShortElement(term221966, 1, (short) 3);
        setShortElement(term221966, 5, (short) 33);
        setShortElement(term221966, 6, (short) 2);
        setShortElement(term221966, 7, (short) 3);
        setShortElement(term221966, 11, (short) 2);
        setShortElement(term221966, 12, (short) 4);
        setShortElement(term221966, 13, (short) 4);
        setShortElement(term221966, 14, (short) 3);
        setShortElement(term221966, 15, (short) 4);
        setShortElement(term221966, 16, (short) 4);
        setShortElement(term221966, 17, (short) 1);
        setShortElement(term221966, 18, (short) 2);
        setShortElement(term221966, 19, (short) 3);
        setShortElement(term221966, 20, (short) 3);
        setShortElement(term221966, 21, (short) 13);
        setShortElement(term221966, 22, (short) 1);
        setShortElement(term221966, 23, (short) 2);
        setShortElement(term221966, 24, (short) 12);
        setElement(term221965, 0, term221966);
        setIntElement(term221999, 0, 22937600);
        setIntElement(term221999, 2, 6553600);
        setIntElement(term221999, 3, 393216);
        setIntElement(term221999, 4, 3866630);
        setIntElement(term221999, 5, 1245184);
        setIntElement(term221999, 6, 3997696);
        setIntElement(term221999, 8, 6553600);
        setIntElement(term221999, 9, 393216);
        setIntElement(term221999, 10, 3866630);
        setIntElement(term221999, 11, 14352384);
        setIntElement(term221999, 12, 10354688);
        setIntElement(term221999, 13, 2883584);
        setIntElement(term221999, 14, 786432);
        setIntElement(term221999, 15, 1441792);
        setIntElement(term221999, 16, 7733248);
        setIntElement(term221999, 17, 20774912);
        setIntElement(term221999, 18, 262144);
        setIntElement(term221999, 19, 2555904);
        setIntElement(term221999, 20, 1835008);
        setIntElement(term221999, 21, 6029312);
        setIntElement(term221999, 22, 327680);
        setIntElement(term221999, 23, 1638400);
        setIntElement(term221999, 24, 720907);
        setElement(term221965, 1, term221999);
        setElement(term222032, 0, term222033);
        setElement(term222032, 1, term222040);
        setElement(term222032, 2, term222040);
        setElement(term222032, 3, term222043);
        setElement(term222032, 4, term222045);
        setElement(term222032, 5, term222049);
        setElement(term222032, 6, term222053);
        setElement(term222032, 7, term222040);
        setElement(term222032, 8, term222040);
        setElement(term222032, 9, term222043);
        setElement(term222032, 10, term222045);
        setElement(term222032, 11, term222059);
        setElement(term222032, 12, term222064);
        setElement(term222032, 13, term222068);
        setElement(term222032, 14, term222072);
        setElement(term222032, 15, term222076);
        setElement(term222032, 16, term222068);
        setElement(term222032, 17, term222080);
        setElement(term222032, 18, term222084);
        setElement(term222032, 19, term222087);
        setElement(term222032, 20, term222090);
        setElement(term222032, 21, term222094);
        setElement(term222032, 22, term222097);
        setElement(term222032, 23, term222100);
        setElement(term222032, 24, term222104);
        setElement(term221965, 2, term222032);
        setLongElement(term222108, 0, 34363800864L);
        setLongElement(term222108, 1, 34364798256L);
        setLongElement(term222108, 2, 34363739368L);
        setLongElement(term222108, 3, 34363739368L);
        setLongElement(term222108, 4, 34363739368L);
        setLongElement(term222108, 5, 132073603951184L);
        setLongElement(term222108, 6, 34363820048L);
        setLongElement(term222108, 7, 34364798256L);
        setLongElement(term222108, 8, 34363739368L);
        setLongElement(term222108, 9, 34363739368L);
        setLongElement(term222108, 10, 34363739368L);
        setLongElement(term222108, 11, 132077283560208L);
        setLongElement(term222108, 12, 132077283629184L);
        setLongElement(term222108, 13, 132077281112816L);
        setLongElement(term222108, 14, 132077283747392L);
        setLongElement(term222108, 15, 132077281112816L);
        setLongElement(term222108, 16, 132077281112816L);
        setLongElement(term222108, 17, 34363745472L);
        setLongElement(term222108, 18, 34364710216L);
        setLongElement(term222108, 19, 34363745472L);
        setLongElement(term222108, 20, 34363745472L);
        setLongElement(term222108, 21, 34364896224L);
        setLongElement(term222108, 22, 34363745472L);
        setLongElement(term222108, 23, 34363745472L);
        setLongElement(term222108, 24, 34363745472L);
        setElement(term221965, 3, term222108);
        setField(term221964, term221964.getClass(), "backtrace", term221965);
        setField(term221964, term221964.getClass(), "detailMessage", null);
        setField(term221964, term221964.getClass(), "cause", term221964);
        setField(term221964, term221964.getClass(), "stackTrace", term222141);
        setIntField(term221964, term221964.getClass(), "depth", 25);
        setIntField(term222143, term222143.getClass(), "modCount", 0);
        setField(term221964, term221964.getClass(), "suppressedExceptions", term222143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term217964;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term217964, term222146));
        assertTrue(recursiveEquals(retValue, term221964));
    }

};


