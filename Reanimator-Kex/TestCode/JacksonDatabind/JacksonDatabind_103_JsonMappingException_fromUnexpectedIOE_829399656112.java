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

public class JsonMappingException_fromUnexpectedIOE_829399656112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231091;
     Object term232515;
     Object term231899;

    public JsonMappingException_fromUnexpectedIOE_829399656112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231091 = newInstance(Class.forName("java.nio.channels.InterruptedByTimeoutException"));
        term232515 = newInstance(Class.forName("java.nio.channels.InterruptedByTimeoutException"));
        setField(term232515, term232515.getClass(), "backtrace", null);
        setField(term232515, term232515.getClass(), "detailMessage", null);
        setField(term232515, term232515.getClass(), "cause", null);
        setField(term232515, term232515.getClass(), "stackTrace", null);
        setIntField(term232515, term232515.getClass(), "depth", 0);
        setField(term232515, term232515.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term231968 = Class.forName((String) "java.nio.file.attribute.PosixFilePermissions");
        Class<? extends Object> term231975 = Class.forName((String) "com.fasterxml.jackson.databind.ext.Java7SupportImpl");
        Class<? extends Object> term231978 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser");
        Class<? extends Object> term231980 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer");
        Class<? extends Object> term231984 = Class.forName((String) "java.lang.InterruptedException");
        Class<? extends Object> term231988 = Class.forName((String) "java.util.stream.Nodes$IntArrayNode");
        Class<? extends Object> term231994 = Class.forName((String) "java.nio.Buffer");
        Class<? extends Object> term231999 = Class.forName((String) "java.nio.file.InvalidPathException");
        Class<? extends Object> term232003 = Class.forName((String) "java.util.concurrent.CompletionService");
        Class<? extends Object> term232007 = Class.forName((String) "com.fasterxml.jackson.databind.jsonschema.JsonSchema");
        Class<? extends Object> term232011 = Class.forName((String) "java.lang.Short$ShortCache");
        Class<? extends Object> term232015 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntBoolean2BooleanFunction");
        Class<? extends Object> term232019 = Class.forName((String) "com.fasterxml.jackson.databind.util.TokenBufferReadContext");
        Class<? extends Object> term232022 = Class.forName((String) "java.util.stream.LongPipeline$6");
        Class<? extends Object> term232025 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$Node");
        Class<? extends Object> term232029 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.NoClass");
        Class<? extends Object> term232032 = Class.forName((String) "java.lang.invoke.SimpleMethodHandle");
        Class<? extends Object> term232035 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
        Class<? extends Object> term232039 = Class.forName((String) "java.lang.System$1");
        term231899 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term231900 = (Object[]) newArray("java.lang.Object", 5);
        short[] term231901 = (short[]) newShortArray(32);
        int[] term231934 = (int[]) newIntArray(32);
        Object[] term231967 = (Object[]) newArray("java.lang.Object", 32);
        long[] term232043 = (long[]) newLongArray(32);
        Object[] term232164 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term232166 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term231899, term231899.getClass(), "_path", null);
        setField(term231899, term231899.getClass(), "_processor", null);
        setField(term231899, term231899.getClass(), "_location", null);
        setShortElement(term231901, 0, (short) 27);
        setShortElement(term231901, 1, (short) 3);
        setShortElement(term231901, 5, (short) 33);
        setShortElement(term231901, 6, (short) 2);
        setShortElement(term231901, 7, (short) 3);
        setShortElement(term231901, 11, (short) 2);
        setShortElement(term231901, 12, (short) 4);
        setShortElement(term231901, 13, (short) 4);
        setShortElement(term231901, 14, (short) 3);
        setShortElement(term231901, 15, (short) 4);
        setShortElement(term231901, 16, (short) 4);
        setShortElement(term231901, 17, (short) 1);
        setShortElement(term231901, 18, (short) 2);
        setShortElement(term231901, 19, (short) 3);
        setShortElement(term231901, 20, (short) 3);
        setShortElement(term231901, 21, (short) 13);
        setShortElement(term231901, 22, (short) 1);
        setShortElement(term231901, 23, (short) 2);
        setShortElement(term231901, 24, (short) 12);
        setElement(term231900, 0, term231901);
        setIntElement(term231934, 0, 57016320);
        setIntElement(term231934, 2, 6553600);
        setIntElement(term231934, 3, 393216);
        setIntElement(term231934, 4, 3866630);
        setIntElement(term231934, 5, 1245184);
        setIntElement(term231934, 6, 2424832);
        setIntElement(term231934, 8, 6553600);
        setIntElement(term231934, 9, 393216);
        setIntElement(term231934, 10, 3866630);
        setIntElement(term231934, 11, 14352384);
        setIntElement(term231934, 12, 10354688);
        setIntElement(term231934, 13, 2883584);
        setIntElement(term231934, 14, 786432);
        setIntElement(term231934, 15, 1441792);
        setIntElement(term231934, 16, 7733248);
        setIntElement(term231934, 17, 20774912);
        setIntElement(term231934, 18, 262144);
        setIntElement(term231934, 19, 2555904);
        setIntElement(term231934, 20, 1835008);
        setIntElement(term231934, 21, 6029312);
        setIntElement(term231934, 22, 327680);
        setIntElement(term231934, 23, 1638400);
        setIntElement(term231934, 24, 720907);
        setElement(term231900, 1, term231934);
        setElement(term231967, 0, term231968);
        setElement(term231967, 1, term231975);
        setElement(term231967, 2, term231975);
        setElement(term231967, 3, term231978);
        setElement(term231967, 4, term231980);
        setElement(term231967, 5, term231984);
        setElement(term231967, 6, term231988);
        setElement(term231967, 7, term231975);
        setElement(term231967, 8, term231975);
        setElement(term231967, 9, term231978);
        setElement(term231967, 10, term231980);
        setElement(term231967, 11, term231994);
        setElement(term231967, 12, term231999);
        setElement(term231967, 13, term232003);
        setElement(term231967, 14, term232007);
        setElement(term231967, 15, term232011);
        setElement(term231967, 16, term232003);
        setElement(term231967, 17, term232015);
        setElement(term231967, 18, term232019);
        setElement(term231967, 19, term232022);
        setElement(term231967, 20, term232025);
        setElement(term231967, 21, term232029);
        setElement(term231967, 22, term232032);
        setElement(term231967, 23, term232035);
        setElement(term231967, 24, term232039);
        setElement(term231900, 2, term231967);
        setLongElement(term232043, 0, 132073604125296L);
        setLongElement(term232043, 1, 34364798256L);
        setLongElement(term232043, 2, 34363739368L);
        setLongElement(term232043, 3, 34363739368L);
        setLongElement(term232043, 4, 34363739368L);
        setLongElement(term232043, 5, 132073603951184L);
        setLongElement(term232043, 6, 34363820048L);
        setLongElement(term232043, 7, 34364798256L);
        setLongElement(term232043, 8, 34363739368L);
        setLongElement(term232043, 9, 34363739368L);
        setLongElement(term232043, 10, 34363739368L);
        setLongElement(term232043, 11, 132077283560208L);
        setLongElement(term232043, 12, 132077283629184L);
        setLongElement(term232043, 13, 132077281112816L);
        setLongElement(term232043, 14, 132077283747392L);
        setLongElement(term232043, 15, 132077281112816L);
        setLongElement(term232043, 16, 132077281112816L);
        setLongElement(term232043, 17, 34363745472L);
        setLongElement(term232043, 18, 34364710216L);
        setLongElement(term232043, 19, 34363745472L);
        setLongElement(term232043, 20, 34363745472L);
        setLongElement(term232043, 21, 34364896224L);
        setLongElement(term232043, 22, 34363745472L);
        setLongElement(term232043, 23, 34363745472L);
        setLongElement(term232043, 24, 34363745472L);
        setElement(term231900, 3, term232043);
        setField(term231899, term231899.getClass(), "backtrace", term231900);
        setField(term231899, term231899.getClass(), "detailMessage", "Unexpected IOException (of type java.nio.channels.InterruptedByTimeoutException): null");
        setField(term231899, term231899.getClass(), "cause", term231899);
        setField(term231899, term231899.getClass(), "stackTrace", term232164);
        setIntField(term231899, term231899.getClass(), "depth", 25);
        setIntField(term232166, term232166.getClass(), "modCount", 0);
        setField(term231899, term231899.getClass(), "suppressedExceptions", term232166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term231091;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term231091, term232515));
        assertTrue(recursiveEquals(retValue, term231899));
    }

};


