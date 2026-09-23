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

public class JsonMappingException_fromUnexpectedIOE_829399656106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221317;
     Object term225035;
     Object term224705;

    public JsonMappingException_fromUnexpectedIOE_829399656106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221317 = newInstance(Class.forName("java.io.NotSerializableException"));
        term225035 = newInstance(Class.forName("java.io.NotSerializableException"));
        setField(term225035, term225035.getClass(), "backtrace", null);
        setField(term225035, term225035.getClass(), "detailMessage", null);
        setField(term225035, term225035.getClass(), "cause", null);
        setField(term225035, term225035.getClass(), "stackTrace", null);
        setIntField(term225035, term225035.getClass(), "depth", 0);
        setField(term225035, term225035.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term224774 = Class.forName((String) "kex.java.lang.Long");
        Class<? extends Object> term224781 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntrySetSpliterator");
        Class<? extends Object> term224784 = Class.forName((String) "java.util.regex.Pattern$BnM");
        Class<? extends Object> term224786 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator$OfInt");
        Class<? extends Object> term224790 = Class.forName((String) "java.util.stream.ReduceOps$AccumulatingSink");
        Class<? extends Object> term224794 = Class.forName((String) "java.nio.channels.SelectableChannel");
        Class<? extends Object> term224800 = Class.forName((String) "com.fasterxml.jackson.databind.jsonschema.package-info");
        Class<? extends Object> term224805 = Class.forName((String) "java.util.FormattableFlags");
        Class<? extends Object> term224809 = Class.forName((String) "java.util.TreeSet");
        Class<? extends Object> term224813 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniCompletion");
        Class<? extends Object> term224817 = Class.forName((String) "java.nio.charset.UnmappableCharacterException");
        Class<? extends Object> term224821 = Class.forName((String) "java.util.HashMap$ValueSpliterator");
        Class<? extends Object> term224825 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators");
        Class<? extends Object> term224828 = Class.forName((String) "java.util.stream.SpinedBuffer$OfLong");
        Class<? extends Object> term224831 = Class.forName((String) "kex.java.util.ArrayList$Itr");
        Class<? extends Object> term224835 = Class.forName((String) "java.nio.file.SimpleFileVisitor");
        Class<? extends Object> term224838 = Class.forName((String) "java.util.stream.AbstractShortCircuitTask");
        Class<? extends Object> term224841 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer");
        Class<? extends Object> term224845 = Class.forName((String) "java.lang.reflect.AnnotatedType");
        term224705 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term224706 = (Object[]) newArray("java.lang.Object", 5);
        short[] term224707 = (short[]) newShortArray(32);
        int[] term224740 = (int[]) newIntArray(32);
        Object[] term224773 = (Object[]) newArray("java.lang.Object", 32);
        long[] term224849 = (long[]) newLongArray(32);
        Object[] term224955 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term224957 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term224705, term224705.getClass(), "_path", null);
        setField(term224705, term224705.getClass(), "_processor", null);
        setField(term224705, term224705.getClass(), "_location", null);
        setShortElement(term224707, 0, (short) 27);
        setShortElement(term224707, 1, (short) 3);
        setShortElement(term224707, 5, (short) 33);
        setShortElement(term224707, 6, (short) 2);
        setShortElement(term224707, 7, (short) 3);
        setShortElement(term224707, 11, (short) 2);
        setShortElement(term224707, 12, (short) 4);
        setShortElement(term224707, 13, (short) 4);
        setShortElement(term224707, 14, (short) 3);
        setShortElement(term224707, 15, (short) 4);
        setShortElement(term224707, 16, (short) 4);
        setShortElement(term224707, 17, (short) 1);
        setShortElement(term224707, 18, (short) 2);
        setShortElement(term224707, 19, (short) 3);
        setShortElement(term224707, 20, (short) 3);
        setShortElement(term224707, 21, (short) 13);
        setShortElement(term224707, 22, (short) 1);
        setShortElement(term224707, 23, (short) 2);
        setShortElement(term224707, 24, (short) 12);
        setElement(term224706, 0, term224707);
        setIntElement(term224740, 0, 57016320);
        setIntElement(term224740, 2, 6553600);
        setIntElement(term224740, 3, 393216);
        setIntElement(term224740, 4, 3866630);
        setIntElement(term224740, 5, 1245184);
        setIntElement(term224740, 6, 2424832);
        setIntElement(term224740, 8, 6553600);
        setIntElement(term224740, 9, 393216);
        setIntElement(term224740, 10, 3866630);
        setIntElement(term224740, 11, 14352384);
        setIntElement(term224740, 12, 10354688);
        setIntElement(term224740, 13, 2883584);
        setIntElement(term224740, 14, 786432);
        setIntElement(term224740, 15, 1441792);
        setIntElement(term224740, 16, 7733248);
        setIntElement(term224740, 17, 20774912);
        setIntElement(term224740, 18, 262144);
        setIntElement(term224740, 19, 2555904);
        setIntElement(term224740, 20, 1835008);
        setIntElement(term224740, 21, 6029312);
        setIntElement(term224740, 22, 327680);
        setIntElement(term224740, 23, 1638400);
        setIntElement(term224740, 24, 720907);
        setElement(term224706, 1, term224740);
        setElement(term224773, 0, term224774);
        setElement(term224773, 1, term224781);
        setElement(term224773, 2, term224781);
        setElement(term224773, 3, term224784);
        setElement(term224773, 4, term224786);
        setElement(term224773, 5, term224790);
        setElement(term224773, 6, term224794);
        setElement(term224773, 7, term224781);
        setElement(term224773, 8, term224781);
        setElement(term224773, 9, term224784);
        setElement(term224773, 10, term224786);
        setElement(term224773, 11, term224800);
        setElement(term224773, 12, term224805);
        setElement(term224773, 13, term224809);
        setElement(term224773, 14, term224813);
        setElement(term224773, 15, term224817);
        setElement(term224773, 16, term224809);
        setElement(term224773, 17, term224821);
        setElement(term224773, 18, term224825);
        setElement(term224773, 19, term224828);
        setElement(term224773, 20, term224831);
        setElement(term224773, 21, term224835);
        setElement(term224773, 22, term224838);
        setElement(term224773, 23, term224841);
        setElement(term224773, 24, term224845);
        setElement(term224706, 2, term224773);
        setLongElement(term224849, 0, 132073604125296L);
        setLongElement(term224849, 1, 34364798256L);
        setLongElement(term224849, 2, 34363739368L);
        setLongElement(term224849, 3, 34363739368L);
        setLongElement(term224849, 4, 34363739368L);
        setLongElement(term224849, 5, 132073603951184L);
        setLongElement(term224849, 6, 34363820048L);
        setLongElement(term224849, 7, 34364798256L);
        setLongElement(term224849, 8, 34363739368L);
        setLongElement(term224849, 9, 34363739368L);
        setLongElement(term224849, 10, 34363739368L);
        setLongElement(term224849, 11, 132077283560208L);
        setLongElement(term224849, 12, 132077283629184L);
        setLongElement(term224849, 13, 132077281112816L);
        setLongElement(term224849, 14, 132077283747392L);
        setLongElement(term224849, 15, 132077281112816L);
        setLongElement(term224849, 16, 132077281112816L);
        setLongElement(term224849, 17, 34363745472L);
        setLongElement(term224849, 18, 34364710216L);
        setLongElement(term224849, 19, 34363745472L);
        setLongElement(term224849, 20, 34363745472L);
        setLongElement(term224849, 21, 34364896224L);
        setLongElement(term224849, 22, 34363745472L);
        setLongElement(term224849, 23, 34363745472L);
        setLongElement(term224849, 24, 34363745472L);
        setElement(term224706, 3, term224849);
        setField(term224705, term224705.getClass(), "backtrace", term224706);
        setField(term224705, term224705.getClass(), "detailMessage", "Unexpected IOException (of type java.io.NotSerializableException): null");
        setField(term224705, term224705.getClass(), "cause", term224705);
        setField(term224705, term224705.getClass(), "stackTrace", term224955);
        setIntField(term224705, term224705.getClass(), "depth", 25);
        setIntField(term224957, term224957.getClass(), "modCount", 0);
        setField(term224705, term224705.getClass(), "suppressedExceptions", term224957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term221317;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term221317, term225035));
        assertTrue(recursiveEquals(retValue, term224705));
    }

};


