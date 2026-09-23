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

public class JsonMappingException_init_103664326633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46254;

    public JsonMappingException_init_103664326633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46259 = Class.forName((String) "java.util.EventListenerProxy");
        Class<? extends Object> term46261 = Class.forName((String) "com.fasterxml.jackson.core.Version");
        Class<? extends Object> term46262 = Class.forName((String) "java.util.concurrent.atomic.LongAdder");
        Class<? extends Object> term46265 = Class.forName((String) "java.lang.ProcessBuilder$Redirect$4");
        Class<? extends Object> term46269 = Class.forName((String) "java.util.stream.Streams$2");
        Class<? extends Object> term46273 = Class.forName((String) "java.lang.reflect.AnnotatedType");
        Class<? extends Object> term46274 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonAnnotation");
        Class<? extends Object> term46275 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfLong");
        Class<? extends Object> term46278 = Class.forName((String) "java.util.Spliterators$2Adapter");
        Class<? extends Object> term46282 = Class.forName((String) "java.util.IllegalFormatConversionException");
        Class<? extends Object> term46285 = Class.forName((String) "java.util.concurrent.atomic.AtomicReferenceArray");
        Class<? extends Object> term46288 = Class.forName((String) "java.lang.annotation.AnnotationTypeMismatchException");
        Class<? extends Object> term46291 = Class.forName((String) "java.util.Spliterators$AbstractSpliterator$HoldingConsumer");
        Class<? extends Object> term46294 = Class.forName((String) "java.io.ExpiringCache$Entry");
        Class<? extends Object> term46297 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer");
        Class<? extends Object> term46299 = Class.forName((String) "java.util.Spliterators$AbstractLongSpliterator$HoldingLongConsumer");
        Class<? extends Object> term46301 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedKeyIterator");
        Class<? extends Object> term46304 = Class.forName((String) "java.util.ImmutableCollections$Set12$1");
        Class<? extends Object> term46306 = Class.forName((String) "java.io.StringBufferInputStream");
        Class<? extends Object> term46308 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude");
        Class<? extends Object> term46311 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueSpliterator");
        term46254 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term46255 = (Object[]) newArray("java.lang.Object", 5);
        short[] term46256 = (short[]) newShortArray(32);
        int[] term46257 = (int[]) newIntArray(32);
        Object[] term46258 = (Object[]) newArray("java.lang.Object", 32);
        long[] term46314 = (long[]) newLongArray(32);
        Object[] term46317 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term46318 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term46254, term46254.getClass(), "_path", null);
        setField(term46254, term46254.getClass(), "_processor", null);
        setField(term46254, term46254.getClass(), "_location", null);
        setShortElement(term46256, 0, (short) 1);
        setShortElement(term46256, 1, (short) 2);
        setShortElement(term46256, 2, (short) 1);
        setShortElement(term46256, 3, (short) 7);
        setShortElement(term46256, 4, (short) 14);
        setShortElement(term46256, 5, (short) 2);
        setShortElement(term46256, 6, (short) 3);
        setShortElement(term46256, 10, (short) 2);
        setShortElement(term46256, 11, (short) 4);
        setShortElement(term46256, 12, (short) 4);
        setShortElement(term46256, 13, (short) 3);
        setShortElement(term46256, 14, (short) 4);
        setShortElement(term46256, 15, (short) 4);
        setShortElement(term46256, 16, (short) 1);
        setShortElement(term46256, 17, (short) 2);
        setShortElement(term46256, 18, (short) 3);
        setShortElement(term46256, 19, (short) 3);
        setShortElement(term46256, 20, (short) 13);
        setShortElement(term46256, 21, (short) 1);
        setShortElement(term46256, 22, (short) 2);
        setShortElement(term46256, 23, (short) 12);
        setElement(term46255, 0, term46256);
        setIntElement(term46257, 1, 5570560);
        setIntElement(term46257, 2, 327680);
        setIntElement(term46257, 3, 4456454);
        setIntElement(term46257, 4, 851968);
        setIntElement(term46257, 5, 2883584);
        setIntElement(term46257, 7, 6553600);
        setIntElement(term46257, 8, 393216);
        setIntElement(term46257, 9, 3866630);
        setIntElement(term46257, 10, 14352384);
        setIntElement(term46257, 11, 10354688);
        setIntElement(term46257, 12, 2883584);
        setIntElement(term46257, 13, 786432);
        setIntElement(term46257, 14, 1441792);
        setIntElement(term46257, 15, 7733248);
        setIntElement(term46257, 16, 20774912);
        setIntElement(term46257, 17, 262144);
        setIntElement(term46257, 18, 2555904);
        setIntElement(term46257, 19, 1835008);
        setIntElement(term46257, 20, 6029312);
        setIntElement(term46257, 21, 327680);
        setIntElement(term46257, 22, 1638400);
        setIntElement(term46257, 23, 720907);
        setElement(term46255, 1, term46257);
        setElement(term46258, 0, term46259);
        setElement(term46258, 1, term46259);
        setElement(term46258, 2, term46261);
        setElement(term46258, 3, term46262);
        setElement(term46258, 4, term46265);
        setElement(term46258, 5, term46269);
        setElement(term46258, 6, term46273);
        setElement(term46258, 7, term46273);
        setElement(term46258, 8, term46274);
        setElement(term46258, 9, term46275);
        setElement(term46258, 10, term46278);
        setElement(term46258, 11, term46282);
        setElement(term46258, 12, term46285);
        setElement(term46258, 13, term46288);
        setElement(term46258, 14, term46291);
        setElement(term46258, 15, term46285);
        setElement(term46258, 16, term46294);
        setElement(term46258, 17, term46297);
        setElement(term46258, 18, term46299);
        setElement(term46258, 19, term46301);
        setElement(term46258, 20, term46304);
        setElement(term46258, 21, term46306);
        setElement(term46258, 22, term46308);
        setElement(term46258, 23, term46311);
        setElement(term46255, 2, term46258);
        setLongElement(term46314, 0, 34363746224L);
        setLongElement(term46314, 1, 34363775512L);
        setLongElement(term46314, 2, 34363775512L);
        setLongElement(term46314, 3, 34363775512L);
        setLongElement(term46314, 4, 132578326060064L);
        setLongElement(term46314, 5, 34363820048L);
        setLongElement(term46314, 6, 34364798256L);
        setLongElement(term46314, 7, 34363739368L);
        setLongElement(term46314, 8, 34363739368L);
        setLongElement(term46314, 9, 34363739368L);
        setLongElement(term46314, 10, 132582552571296L);
        setLongElement(term46314, 11, 132582552640272L);
        setLongElement(term46314, 12, 132582550089488L);
        setLongElement(term46314, 13, 132582552759024L);
        setLongElement(term46314, 14, 132582550089488L);
        setLongElement(term46314, 15, 132582550089488L);
        setLongElement(term46314, 16, 34363745472L);
        setLongElement(term46314, 17, 34364710216L);
        setLongElement(term46314, 18, 34363745472L);
        setLongElement(term46314, 19, 34363745472L);
        setLongElement(term46314, 20, 34364896224L);
        setLongElement(term46314, 21, 34363745472L);
        setLongElement(term46314, 22, 34363745472L);
        setLongElement(term46314, 23, 34363745472L);
        setElement(term46255, 3, term46314);
        setField(term46254, term46254.getClass(), "backtrace", term46255);
        setField(term46254, term46254.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term46254, term46254.getClass(), "cause", term46254);
        setField(term46254, term46254.getClass(), "stackTrace", term46317);
        setIntField(term46254, term46254.getClass(), "depth", 24);
        setIntField(term46318, term46318.getClass(), "modCount", 0);
        setField(term46254, term46254.getClass(), "suppressedExceptions", term46318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonLocation");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46254));
    }

};


