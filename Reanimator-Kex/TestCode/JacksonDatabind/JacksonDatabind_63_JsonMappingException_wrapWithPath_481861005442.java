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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_wrapWithPath_481861005442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677526;
     Object term678050;
     Object term677811;

    public JsonMappingException_wrapWithPath_481861005442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677526 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        term678050 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        setField(term678050, term678050.getClass(), "backtrace", null);
        setField(term678050, term678050.getClass(), "detailMessage", null);
        setField(term678050, term678050.getClass(), "cause", null);
        setField(term678050, term678050.getClass(), "stackTrace", null);
        setIntField(term678050, term678050.getClass(), "depth", 0);
        setField(term678050, term678050.getClass(), "suppressedExceptions", null);
        LinkedList term677812 = new LinkedList();
        ((LinkedList) term677812).add((Object)null);
        Class<? extends Object> term677884 = Class.forName((String) "java.util.regex.Pattern$UnixDollar");
        Class<? extends Object> term677891 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueIterator");
        Class<? extends Object> term677904 = Class.forName((String) "java.util.regex.Pattern$BmpCharPropertyGreedy");
        Class<? extends Object> term677908 = Class.forName((String) "java.io.NotActiveException");
        Class<? extends Object> term677912 = Class.forName((String) "java.util.EventListener");
        Class<? extends Object> term677916 = Class.forName((String) "java.util.AbstractList$RandomAccessSubList");
        Class<? extends Object> term677922 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term677925 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs");
        Class<? extends Object> term677930 = Class.forName((String) "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket");
        Class<? extends Object> term677934 = Class.forName((String) "com.fasterxml.jackson.databind.KeyDeserializer$None");
        Class<? extends Object> term677938 = Class.forName((String) "java.util.Arrays$NaturalOrder");
        Class<? extends Object> term677942 = Class.forName((String) "com.fasterxml.jackson.databind.package-info");
        Class<? extends Object> term677946 = Class.forName((String) "java.util.WeakHashMap$EntrySet");
        Class<? extends Object> term677950 = Class.forName((String) "com.fasterxml.jackson.databind.KeyDeserializer");
        Class<? extends Object> term677953 = Class.forName((String) "java.lang.StackStreamFactory$AbstractStackWalker");
        Class<? extends Object> term677956 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer");
        Class<? extends Object> term677960 = Class.forName((String) "java.lang.reflect.GenericArrayType");
        Class<? extends Object> term677964 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy");
        Class<? extends Object> term677967 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfInt");
        Class<? extends Object> term677971 = Class.forName((String) "java.lang.Class$3");
        term677811 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term677816 = (Object[]) newArray("java.lang.Object", 5);
        short[] term677817 = (short[]) newShortArray(32);
        int[] term677850 = (int[]) newIntArray(32);
        Object[] term677883 = (Object[]) newArray("java.lang.Object", 32);
        long[] term677975 = (long[]) newLongArray(32);
        Object term677806 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        Object[] term678046 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term678048 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term677811, term677811.getClass(), "_path", term677812);
        setField(term677811, term677811.getClass(), "_processor", null);
        setField(term677811, term677811.getClass(), "_location", null);
        setShortElement(term677817, 0, (short) 20);
        setShortElement(term677817, 4, (short) 27);
        setShortElement(term677817, 5, (short) 2);
        setShortElement(term677817, 6, (short) 3);
        setShortElement(term677817, 10, (short) 2);
        setShortElement(term677817, 11, (short) 4);
        setShortElement(term677817, 12, (short) 4);
        setShortElement(term677817, 13, (short) 3);
        setShortElement(term677817, 14, (short) 4);
        setShortElement(term677817, 15, (short) 4);
        setShortElement(term677817, 16, (short) 1);
        setShortElement(term677817, 17, (short) 2);
        setShortElement(term677817, 18, (short) 3);
        setShortElement(term677817, 19, (short) 3);
        setShortElement(term677817, 20, (short) 13);
        setShortElement(term677817, 21, (short) 1);
        setShortElement(term677817, 22, (short) 2);
        setShortElement(term677817, 23, (short) 12);
        setElement(term677816, 0, term677817);
        setIntElement(term677850, 0, 128385024);
        setIntElement(term677850, 1, 2097152);
        setIntElement(term677850, 2, 393216);
        setIntElement(term677850, 3, 3866630);
        setIntElement(term677850, 4, 1245184);
        setIntElement(term677850, 5, 3211264);
        setIntElement(term677850, 7, 6553600);
        setIntElement(term677850, 8, 393216);
        setIntElement(term677850, 9, 3866630);
        setIntElement(term677850, 10, 14352384);
        setIntElement(term677850, 11, 10354688);
        setIntElement(term677850, 12, 2883584);
        setIntElement(term677850, 13, 786432);
        setIntElement(term677850, 14, 1441792);
        setIntElement(term677850, 15, 7733248);
        setIntElement(term677850, 16, 20774912);
        setIntElement(term677850, 17, 262144);
        setIntElement(term677850, 18, 2555904);
        setIntElement(term677850, 19, 1835008);
        setIntElement(term677850, 20, 6029312);
        setIntElement(term677850, 21, 327680);
        setIntElement(term677850, 22, 1638400);
        setIntElement(term677850, 23, 720907);
        setElement(term677816, 1, term677850);
        setElement(term677883, 0, term677884);
        setElement(term677883, 1, term677891);
        setElement(term677883, 2, term677904);
        setElement(term677883, 3, term677908);
        setElement(term677883, 4, term677912);
        setElement(term677883, 5, term677916);
        setElement(term677883, 6, term677922);
        setElement(term677883, 7, term677922);
        setElement(term677883, 8, term677904);
        setElement(term677883, 9, term677908);
        setElement(term677883, 10, term677925);
        setElement(term677883, 11, term677930);
        setElement(term677883, 12, term677934);
        setElement(term677883, 13, term677938);
        setElement(term677883, 14, term677942);
        setElement(term677883, 15, term677934);
        setElement(term677883, 16, term677946);
        setElement(term677883, 17, term677950);
        setElement(term677883, 18, term677953);
        setElement(term677883, 19, term677956);
        setElement(term677883, 20, term677960);
        setElement(term677883, 21, term677964);
        setElement(term677883, 22, term677967);
        setElement(term677883, 23, term677971);
        setElement(term677816, 2, term677883);
        setLongElement(term677975, 0, 132578328546864L);
        setLongElement(term677975, 1, 34363739368L);
        setLongElement(term677975, 2, 34363739368L);
        setLongElement(term677975, 3, 34363739368L);
        setLongElement(term677975, 4, 132578328998496L);
        setLongElement(term677975, 5, 34363820048L);
        setLongElement(term677975, 6, 34364798256L);
        setLongElement(term677975, 7, 34363739368L);
        setLongElement(term677975, 8, 34363739368L);
        setLongElement(term677975, 9, 34363739368L);
        setLongElement(term677975, 10, 132582552571296L);
        setLongElement(term677975, 11, 132582552640272L);
        setLongElement(term677975, 12, 132582550089488L);
        setLongElement(term677975, 13, 132582552759024L);
        setLongElement(term677975, 14, 132582550089488L);
        setLongElement(term677975, 15, 132582550089488L);
        setLongElement(term677975, 16, 34363745472L);
        setLongElement(term677975, 17, 34364710216L);
        setLongElement(term677975, 18, 34363745472L);
        setLongElement(term677975, 19, 34363745472L);
        setLongElement(term677975, 20, 34364896224L);
        setLongElement(term677975, 21, 34363745472L);
        setLongElement(term677975, 22, 34363745472L);
        setLongElement(term677975, 23, 34363745472L);
        setElement(term677816, 3, term677975);
        setField(term677811, term677811.getClass(), "backtrace", term677816);
        setField(term677811, term677811.getClass(), "detailMessage", "(was java.lang.NoSuchFieldException)");
        setField(term677806, term677806.getClass(), "backtrace", null);
        setField(term677806, term677806.getClass(), "detailMessage", null);
        setField(term677806, term677806.getClass(), "cause", null);
        setField(term677806, term677806.getClass(), "stackTrace", null);
        setIntField(term677806, term677806.getClass(), "depth", 0);
        setField(term677806, term677806.getClass(), "suppressedExceptions", null);
        setField(term677811, term677811.getClass(), "cause", term677806);
        setField(term677811, term677811.getClass(), "stackTrace", term678046);
        setIntField(term677811, term677811.getClass(), "depth", 24);
        setIntField(term678048, term678048.getClass(), "modCount", 0);
        setField(term677811, term677811.getClass(), "suppressedExceptions", term678048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term677526;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term677526, term678050));
        assertTrue(recursiveEquals(retValue, term677811));
    }

};


