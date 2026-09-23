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

public class JsonMappingException_wrapWithPath_481861005372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584065;
     Object term584589;
     Object term584350;

    public JsonMappingException_wrapWithPath_481861005372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584065 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        term584589 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        setField(term584589, term584589.getClass(), "backtrace", null);
        setField(term584589, term584589.getClass(), "detailMessage", null);
        setField(term584589, term584589.getClass(), "cause", null);
        setField(term584589, term584589.getClass(), "stackTrace", null);
        setIntField(term584589, term584589.getClass(), "depth", 0);
        setField(term584589, term584589.getClass(), "suppressedExceptions", null);
        LinkedList term584351 = new LinkedList();
        ((LinkedList) term584351).add((Object)null);
        Class<? extends Object> term584423 = Class.forName((String) "java.util.Arrays$NaturalOrder");
        Class<? extends Object> term584430 = Class.forName((String) "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer");
        Class<? extends Object> term584443 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferL");
        Class<? extends Object> term584447 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo");
        Class<? extends Object> term584451 = Class.forName((String) "java.nio.file.attribute.FileOwnerAttributeView");
        Class<? extends Object> term584455 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableCollection");
        Class<? extends Object> term584461 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary$Unloader");
        Class<? extends Object> term584464 = Class.forName((String) "java.lang.StackStreamFactory$AbstractStackWalker");
        Class<? extends Object> term584469 = Class.forName((String) "java.util.regex.Pattern$TreeInfo");
        Class<? extends Object> term584473 = Class.forName((String) "java.util.stream.FindOps$FindTask");
        Class<? extends Object> term584477 = Class.forName((String) "java.util.regex.Matcher$1MatchResultIterator");
        Class<? extends Object> term584481 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter");
        Class<? extends Object> term584485 = Class.forName((String) "java.lang.invoke.MethodType");
        Class<? extends Object> term584489 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase");
        Class<? extends Object> term584492 = Class.forName((String) "com.fasterxml.jackson.core.type.ResolvedType");
        Class<? extends Object> term584495 = Class.forName((String) "java.util.HashMap$Node");
        Class<? extends Object> term584499 = Class.forName((String) "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class<? extends Object> term584503 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<? extends Object> term584506 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term584510 = Class.forName((String) "java.util.concurrent.atomic.DoubleAccumulator$SerializationProxy");
        term584350 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term584355 = (Object[]) newArray("java.lang.Object", 5);
        short[] term584356 = (short[]) newShortArray(32);
        int[] term584389 = (int[]) newIntArray(32);
        Object[] term584422 = (Object[]) newArray("java.lang.Object", 32);
        long[] term584514 = (long[]) newLongArray(32);
        Object term584345 = newInstance(Class.forName("java.lang.NoSuchFieldException"));
        Object[] term584585 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term584587 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term584350, term584350.getClass(), "_path", term584351);
        setField(term584350, term584350.getClass(), "_processor", null);
        setField(term584350, term584350.getClass(), "_location", null);
        setShortElement(term584356, 0, (short) 20);
        setShortElement(term584356, 4, (short) 27);
        setShortElement(term584356, 5, (short) 2);
        setShortElement(term584356, 6, (short) 3);
        setShortElement(term584356, 10, (short) 2);
        setShortElement(term584356, 11, (short) 4);
        setShortElement(term584356, 12, (short) 4);
        setShortElement(term584356, 13, (short) 3);
        setShortElement(term584356, 14, (short) 4);
        setShortElement(term584356, 15, (short) 4);
        setShortElement(term584356, 16, (short) 1);
        setShortElement(term584356, 17, (short) 2);
        setShortElement(term584356, 18, (short) 3);
        setShortElement(term584356, 19, (short) 3);
        setShortElement(term584356, 20, (short) 13);
        setShortElement(term584356, 21, (short) 1);
        setShortElement(term584356, 22, (short) 2);
        setShortElement(term584356, 23, (short) 12);
        setElement(term584355, 0, term584356);
        setIntElement(term584389, 0, 128385024);
        setIntElement(term584389, 1, 2097152);
        setIntElement(term584389, 2, 393216);
        setIntElement(term584389, 3, 3866630);
        setIntElement(term584389, 4, 1245184);
        setIntElement(term584389, 5, 3211264);
        setIntElement(term584389, 7, 6553600);
        setIntElement(term584389, 8, 393216);
        setIntElement(term584389, 9, 3866630);
        setIntElement(term584389, 10, 14352384);
        setIntElement(term584389, 11, 10354688);
        setIntElement(term584389, 12, 2883584);
        setIntElement(term584389, 13, 786432);
        setIntElement(term584389, 14, 1441792);
        setIntElement(term584389, 15, 7733248);
        setIntElement(term584389, 16, 20774912);
        setIntElement(term584389, 17, 262144);
        setIntElement(term584389, 18, 2555904);
        setIntElement(term584389, 19, 1835008);
        setIntElement(term584389, 20, 6029312);
        setIntElement(term584389, 21, 327680);
        setIntElement(term584389, 22, 1638400);
        setIntElement(term584389, 23, 720907);
        setElement(term584355, 1, term584389);
        setElement(term584422, 0, term584423);
        setElement(term584422, 1, term584430);
        setElement(term584422, 2, term584443);
        setElement(term584422, 3, term584447);
        setElement(term584422, 4, term584451);
        setElement(term584422, 5, term584455);
        setElement(term584422, 6, term584461);
        setElement(term584422, 7, term584461);
        setElement(term584422, 8, term584443);
        setElement(term584422, 9, term584447);
        setElement(term584422, 10, term584464);
        setElement(term584422, 11, term584469);
        setElement(term584422, 12, term584473);
        setElement(term584422, 13, term584477);
        setElement(term584422, 14, term584481);
        setElement(term584422, 15, term584473);
        setElement(term584422, 16, term584485);
        setElement(term584422, 17, term584489);
        setElement(term584422, 18, term584492);
        setElement(term584422, 19, term584495);
        setElement(term584422, 20, term584499);
        setElement(term584422, 21, term584503);
        setElement(term584422, 22, term584506);
        setElement(term584422, 23, term584510);
        setElement(term584355, 2, term584422);
        setLongElement(term584514, 0, 132578328546864L);
        setLongElement(term584514, 1, 34363739368L);
        setLongElement(term584514, 2, 34363739368L);
        setLongElement(term584514, 3, 34363739368L);
        setLongElement(term584514, 4, 132578328998496L);
        setLongElement(term584514, 5, 34363820048L);
        setLongElement(term584514, 6, 34364798256L);
        setLongElement(term584514, 7, 34363739368L);
        setLongElement(term584514, 8, 34363739368L);
        setLongElement(term584514, 9, 34363739368L);
        setLongElement(term584514, 10, 132582552571296L);
        setLongElement(term584514, 11, 132582552640272L);
        setLongElement(term584514, 12, 132582550089488L);
        setLongElement(term584514, 13, 132582552759024L);
        setLongElement(term584514, 14, 132582550089488L);
        setLongElement(term584514, 15, 132582550089488L);
        setLongElement(term584514, 16, 34363745472L);
        setLongElement(term584514, 17, 34364710216L);
        setLongElement(term584514, 18, 34363745472L);
        setLongElement(term584514, 19, 34363745472L);
        setLongElement(term584514, 20, 34364896224L);
        setLongElement(term584514, 21, 34363745472L);
        setLongElement(term584514, 22, 34363745472L);
        setLongElement(term584514, 23, 34363745472L);
        setElement(term584355, 3, term584514);
        setField(term584350, term584350.getClass(), "backtrace", term584355);
        setField(term584350, term584350.getClass(), "detailMessage", "(was java.lang.NoSuchFieldException)");
        setField(term584345, term584345.getClass(), "backtrace", null);
        setField(term584345, term584345.getClass(), "detailMessage", null);
        setField(term584345, term584345.getClass(), "cause", null);
        setField(term584345, term584345.getClass(), "stackTrace", null);
        setIntField(term584345, term584345.getClass(), "depth", 0);
        setField(term584345, term584345.getClass(), "suppressedExceptions", null);
        setField(term584350, term584350.getClass(), "cause", term584345);
        setField(term584350, term584350.getClass(), "stackTrace", term584585);
        setIntField(term584350, term584350.getClass(), "depth", 24);
        setIntField(term584587, term584587.getClass(), "modCount", 0);
        setField(term584350, term584350.getClass(), "suppressedExceptions", term584587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term584065;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term584065, term584589));
        assertTrue(recursiveEquals(retValue, term584350));
    }

};


