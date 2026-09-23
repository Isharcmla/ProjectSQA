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

public class JsonMappingException_fromUnexpectedIOE_829399656120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241006;
     Object term241425;
     Object term241079;

    public JsonMappingException_fromUnexpectedIOE_829399656120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241006 = newInstance(Class.forName("java.nio.file.FileAlreadyExistsException"));
        term241425 = newInstance(Class.forName("java.nio.file.FileAlreadyExistsException"));
        setField(term241425, term241425.getClass(), "file", null);
        setField(term241425, term241425.getClass(), "other", null);
        setField(term241425, term241425.getClass(), "backtrace", null);
        setField(term241425, term241425.getClass(), "detailMessage", null);
        setField(term241425, term241425.getClass(), "cause", null);
        setField(term241425, term241425.getClass(), "stackTrace", null);
        setIntField(term241425, term241425.getClass(), "depth", 0);
        setField(term241425, term241425.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term241148 = Class.forName((String) "java.lang.invoke.VarHandle$1");
        Class<? extends Object> term241155 = Class.forName((String) "java.lang.CharSequence$1CodePointIterator");
        Class<? extends Object> term241158 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6");
        Class<? extends Object> term241160 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
        Class<? extends Object> term241164 = Class.forName((String) "java.util.stream.AbstractSpinedBuffer");
        Class<? extends Object> term241168 = Class.forName((String) "java.util.concurrent.ExecutionException");
        Class<? extends Object> term241174 = Class.forName((String) "kex.java.lang.Character$UnicodeBlock");
        Class<? extends Object> term241179 = Class.forName((String) "java.util.TreeMap$ValueIterator");
        Class<? extends Object> term241183 = Class.forName((String) "java.util.Locale$Category");
        Class<? extends Object> term241187 = Class.forName((String) "java.lang.ProcessEnvironment$StringValues");
        Class<? extends Object> term241191 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer");
        Class<? extends Object> term241195 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        Class<? extends Object> term241199 = Class.forName((String) "java.util.concurrent.FutureTask$WaitNode");
        Class<? extends Object> term241202 = Class.forName((String) "java.nio.file.WatchKey");
        Class<? extends Object> term241205 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsLongs$ByteBufferHandle");
        Class<? extends Object> term241209 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder");
        Class<? extends Object> term241212 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldInstanceReadOnly");
        Class<? extends Object> term241215 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$1");
        Class<? extends Object> term241219 = Class.forName((String) "java.io.DeleteOnExitHook");
        term241079 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term241080 = (Object[]) newArray("java.lang.Object", 5);
        short[] term241081 = (short[]) newShortArray(32);
        int[] term241114 = (int[]) newIntArray(32);
        Object[] term241147 = (Object[]) newArray("java.lang.Object", 32);
        long[] term241223 = (long[]) newLongArray(32);
        Object[] term241337 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term241339 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term241079, term241079.getClass(), "_path", null);
        setField(term241079, term241079.getClass(), "_processor", null);
        setField(term241079, term241079.getClass(), "_location", null);
        setShortElement(term241081, 0, (short) 27);
        setShortElement(term241081, 1, (short) 3);
        setShortElement(term241081, 5, (short) 33);
        setShortElement(term241081, 6, (short) 2);
        setShortElement(term241081, 7, (short) 3);
        setShortElement(term241081, 11, (short) 2);
        setShortElement(term241081, 12, (short) 4);
        setShortElement(term241081, 13, (short) 4);
        setShortElement(term241081, 14, (short) 3);
        setShortElement(term241081, 15, (short) 4);
        setShortElement(term241081, 16, (short) 4);
        setShortElement(term241081, 17, (short) 1);
        setShortElement(term241081, 18, (short) 2);
        setShortElement(term241081, 19, (short) 3);
        setShortElement(term241081, 20, (short) 3);
        setShortElement(term241081, 21, (short) 13);
        setShortElement(term241081, 22, (short) 1);
        setShortElement(term241081, 23, (short) 2);
        setShortElement(term241081, 24, (short) 12);
        setElement(term241080, 0, term241081);
        setIntElement(term241114, 0, 57016320);
        setIntElement(term241114, 2, 6553600);
        setIntElement(term241114, 3, 393216);
        setIntElement(term241114, 4, 3866630);
        setIntElement(term241114, 5, 1245184);
        setIntElement(term241114, 6, 2424832);
        setIntElement(term241114, 8, 6553600);
        setIntElement(term241114, 9, 393216);
        setIntElement(term241114, 10, 3866630);
        setIntElement(term241114, 11, 14352384);
        setIntElement(term241114, 12, 10354688);
        setIntElement(term241114, 13, 2883584);
        setIntElement(term241114, 14, 786432);
        setIntElement(term241114, 15, 1441792);
        setIntElement(term241114, 16, 7733248);
        setIntElement(term241114, 17, 20774912);
        setIntElement(term241114, 18, 262144);
        setIntElement(term241114, 19, 2555904);
        setIntElement(term241114, 20, 1835008);
        setIntElement(term241114, 21, 6029312);
        setIntElement(term241114, 22, 327680);
        setIntElement(term241114, 23, 1638400);
        setIntElement(term241114, 24, 720907);
        setElement(term241080, 1, term241114);
        setElement(term241147, 0, term241148);
        setElement(term241147, 1, term241155);
        setElement(term241147, 2, term241155);
        setElement(term241147, 3, term241158);
        setElement(term241147, 4, term241160);
        setElement(term241147, 5, term241164);
        setElement(term241147, 6, term241168);
        setElement(term241147, 7, term241155);
        setElement(term241147, 8, term241155);
        setElement(term241147, 9, term241158);
        setElement(term241147, 10, term241160);
        setElement(term241147, 11, term241174);
        setElement(term241147, 12, term241179);
        setElement(term241147, 13, term241183);
        setElement(term241147, 14, term241187);
        setElement(term241147, 15, term241191);
        setElement(term241147, 16, term241183);
        setElement(term241147, 17, term241195);
        setElement(term241147, 18, term241199);
        setElement(term241147, 19, term241202);
        setElement(term241147, 20, term241205);
        setElement(term241147, 21, term241209);
        setElement(term241147, 22, term241212);
        setElement(term241147, 23, term241215);
        setElement(term241147, 24, term241219);
        setElement(term241080, 2, term241147);
        setLongElement(term241223, 0, 132073604125296L);
        setLongElement(term241223, 1, 34364798256L);
        setLongElement(term241223, 2, 34363739368L);
        setLongElement(term241223, 3, 34363739368L);
        setLongElement(term241223, 4, 34363739368L);
        setLongElement(term241223, 5, 132073603951184L);
        setLongElement(term241223, 6, 34363820048L);
        setLongElement(term241223, 7, 34364798256L);
        setLongElement(term241223, 8, 34363739368L);
        setLongElement(term241223, 9, 34363739368L);
        setLongElement(term241223, 10, 34363739368L);
        setLongElement(term241223, 11, 132077283560208L);
        setLongElement(term241223, 12, 132077283629184L);
        setLongElement(term241223, 13, 132077281112816L);
        setLongElement(term241223, 14, 132077283747392L);
        setLongElement(term241223, 15, 132077281112816L);
        setLongElement(term241223, 16, 132077281112816L);
        setLongElement(term241223, 17, 34363745472L);
        setLongElement(term241223, 18, 34364710216L);
        setLongElement(term241223, 19, 34363745472L);
        setLongElement(term241223, 20, 34363745472L);
        setLongElement(term241223, 21, 34364896224L);
        setLongElement(term241223, 22, 34363745472L);
        setLongElement(term241223, 23, 34363745472L);
        setLongElement(term241223, 24, 34363745472L);
        setElement(term241080, 3, term241223);
        setField(term241079, term241079.getClass(), "backtrace", term241080);
        setField(term241079, term241079.getClass(), "detailMessage", "Unexpected IOException (of type java.nio.file.FileAlreadyExistsException): null");
        setField(term241079, term241079.getClass(), "cause", term241079);
        setField(term241079, term241079.getClass(), "stackTrace", term241337);
        setIntField(term241079, term241079.getClass(), "depth", 25);
        setIntField(term241339, term241339.getClass(), "modCount", 0);
        setField(term241079, term241079.getClass(), "suppressedExceptions", term241339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term241006;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term241006, term241425));
        assertTrue(recursiveEquals(retValue, term241079));
    }

};


