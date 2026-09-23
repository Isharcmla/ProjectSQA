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

public class JsonMappingException_wrapWithPath_481861005127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247918;
     Object term254250;
     Object term253502;

    public JsonMappingException_wrapWithPath_481861005127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247918 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        term254250 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        setField(term254250, term254250.getClass(), "backtrace", null);
        setField(term254250, term254250.getClass(), "detailMessage", null);
        setField(term254250, term254250.getClass(), "cause", null);
        setField(term254250, term254250.getClass(), "stackTrace", null);
        setIntField(term254250, term254250.getClass(), "depth", 0);
        setField(term254250, term254250.getClass(), "suppressedExceptions", null);
        LinkedList term253503 = new LinkedList();
        ((LinkedList) term253503).add((Object)null);
        Class<? extends Object> term253575 = Class.forName((String) "java.util.JapaneseImperialCalendar");
        Class<? extends Object> term253582 = Class.forName((String) "java.lang.Throwable$PrintStreamOrWriter");
        Class<? extends Object> term253585 = Class.forName((String) "java.util.stream.LongStream$2");
        Class<? extends Object> term253587 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ProxyMethod");
        Class<? extends Object> term253591 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs");
        Class<? extends Object> term253595 = Class.forName((String) "java.util.Spliterators$ArraySpliterator");
        Class<? extends Object> term253601 = Class.forName((String) "java.util.TreeMap$EntryIterator");
        Class<? extends Object> term253606 = Class.forName((String) "com.fasterxml.jackson.core.format.DataFormatMatcher");
        Class<? extends Object> term253610 = Class.forName((String) "com.fasterxml.jackson.databind.ser.FilterProvider");
        Class<? extends Object> term253614 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator");
        Class<? extends Object> term253618 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfDouble");
        Class<? extends Object> term253622 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.NamedType");
        Class<? extends Object> term253626 = Class.forName((String) "java.util.Collections$CheckedMap");
        Class<? extends Object> term253629 = Class.forName((String) "module-info");
        Class<? extends Object> term253632 = Class.forName((String) "java.util.stream.MatchOps$MatchTask");
        Class<? extends Object> term253636 = Class.forName((String) "java.nio.ByteBufferAsIntBufferRB");
        Class<? extends Object> term253639 = Class.forName((String) "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
        Class<? extends Object> term253642 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<? extends Object> term253646 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSetter$Value");
        term253502 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term253507 = (Object[]) newArray("java.lang.Object", 5);
        short[] term253508 = (short[]) newShortArray(32);
        int[] term253541 = (int[]) newIntArray(32);
        Object[] term253574 = (Object[]) newArray("java.lang.Object", 32);
        long[] term253650 = (long[]) newLongArray(32);
        Object term253411 = newInstance(Class.forName("java.nio.channels.NoConnectionPendingException"));
        Object[] term253737 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term253739 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term253502, term253502.getClass(), "_path", term253503);
        setField(term253502, term253502.getClass(), "_processor", null);
        setField(term253502, term253502.getClass(), "_location", null);
        setShortElement(term253508, 0, (short) 30);
        setShortElement(term253508, 1, (short) 3);
        setShortElement(term253508, 5, (short) 33);
        setShortElement(term253508, 6, (short) 2);
        setShortElement(term253508, 7, (short) 3);
        setShortElement(term253508, 11, (short) 2);
        setShortElement(term253508, 12, (short) 4);
        setShortElement(term253508, 13, (short) 4);
        setShortElement(term253508, 14, (short) 3);
        setShortElement(term253508, 15, (short) 4);
        setShortElement(term253508, 16, (short) 4);
        setShortElement(term253508, 17, (short) 1);
        setShortElement(term253508, 18, (short) 2);
        setShortElement(term253508, 19, (short) 3);
        setShortElement(term253508, 20, (short) 3);
        setShortElement(term253508, 21, (short) 13);
        setShortElement(term253508, 22, (short) 1);
        setShortElement(term253508, 23, (short) 2);
        setShortElement(term253508, 24, (short) 12);
        setElement(term253507, 0, term253508);
        setIntElement(term253541, 0, 128385024);
        setIntElement(term253541, 2, 6553600);
        setIntElement(term253541, 3, 393216);
        setIntElement(term253541, 4, 3866630);
        setIntElement(term253541, 5, 1245184);
        setIntElement(term253541, 6, 3211264);
        setIntElement(term253541, 8, 6553600);
        setIntElement(term253541, 9, 393216);
        setIntElement(term253541, 10, 3866630);
        setIntElement(term253541, 11, 14352384);
        setIntElement(term253541, 12, 10354688);
        setIntElement(term253541, 13, 2883584);
        setIntElement(term253541, 14, 786432);
        setIntElement(term253541, 15, 1441792);
        setIntElement(term253541, 16, 7733248);
        setIntElement(term253541, 17, 20774912);
        setIntElement(term253541, 18, 262144);
        setIntElement(term253541, 19, 2555904);
        setIntElement(term253541, 20, 1835008);
        setIntElement(term253541, 21, 6029312);
        setIntElement(term253541, 22, 327680);
        setIntElement(term253541, 23, 1638400);
        setIntElement(term253541, 24, 720907);
        setElement(term253507, 1, term253541);
        setElement(term253574, 0, term253575);
        setElement(term253574, 1, term253582);
        setElement(term253574, 2, term253582);
        setElement(term253574, 3, term253585);
        setElement(term253574, 4, term253587);
        setElement(term253574, 5, term253591);
        setElement(term253574, 6, term253595);
        setElement(term253574, 7, term253582);
        setElement(term253574, 8, term253582);
        setElement(term253574, 9, term253585);
        setElement(term253574, 10, term253587);
        setElement(term253574, 11, term253601);
        setElement(term253574, 12, term253606);
        setElement(term253574, 13, term253610);
        setElement(term253574, 14, term253614);
        setElement(term253574, 15, term253618);
        setElement(term253574, 16, term253610);
        setElement(term253574, 17, term253622);
        setElement(term253574, 18, term253626);
        setElement(term253574, 19, term253629);
        setElement(term253574, 20, term253632);
        setElement(term253574, 21, term253636);
        setElement(term253574, 22, term253639);
        setElement(term253574, 23, term253642);
        setElement(term253574, 24, term253646);
        setElement(term253507, 2, term253574);
        setLongElement(term253650, 0, 132073604125776L);
        setLongElement(term253650, 1, 34364798256L);
        setLongElement(term253650, 2, 34363739368L);
        setLongElement(term253650, 3, 34363739368L);
        setLongElement(term253650, 4, 34363739368L);
        setLongElement(term253650, 5, 132073603951184L);
        setLongElement(term253650, 6, 34363820048L);
        setLongElement(term253650, 7, 34364798256L);
        setLongElement(term253650, 8, 34363739368L);
        setLongElement(term253650, 9, 34363739368L);
        setLongElement(term253650, 10, 34363739368L);
        setLongElement(term253650, 11, 132077283560208L);
        setLongElement(term253650, 12, 132077283629184L);
        setLongElement(term253650, 13, 132077281112816L);
        setLongElement(term253650, 14, 132077283747392L);
        setLongElement(term253650, 15, 132077281112816L);
        setLongElement(term253650, 16, 132077281112816L);
        setLongElement(term253650, 17, 34363745472L);
        setLongElement(term253650, 18, 34364710216L);
        setLongElement(term253650, 19, 34363745472L);
        setLongElement(term253650, 20, 34363745472L);
        setLongElement(term253650, 21, 34364896224L);
        setLongElement(term253650, 22, 34363745472L);
        setLongElement(term253650, 23, 34363745472L);
        setLongElement(term253650, 24, 34363745472L);
        setElement(term253507, 3, term253650);
        setField(term253502, term253502.getClass(), "backtrace", term253507);
        setField(term253502, term253502.getClass(), "detailMessage", "(was java.nio.channels.NoConnectionPendingException)");
        setField(term253411, term253411.getClass(), "backtrace", null);
        setField(term253411, term253411.getClass(), "detailMessage", null);
        setField(term253411, term253411.getClass(), "cause", null);
        setField(term253411, term253411.getClass(), "stackTrace", null);
        setIntField(term253411, term253411.getClass(), "depth", 0);
        setField(term253411, term253411.getClass(), "suppressedExceptions", null);
        setField(term253502, term253502.getClass(), "cause", term253411);
        setField(term253502, term253502.getClass(), "stackTrace", term253737);
        setIntField(term253502, term253502.getClass(), "depth", 25);
        setIntField(term253739, term253739.getClass(), "modCount", 0);
        setField(term253502, term253502.getClass(), "suppressedExceptions", term253739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term247918;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term247918, term254250));
        assertTrue(recursiveEquals(retValue, term253502));
    }

};


