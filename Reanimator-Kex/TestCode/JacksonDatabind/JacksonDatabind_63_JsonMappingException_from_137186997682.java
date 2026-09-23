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

public class JsonMappingException_from_137186997682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175123;

    public JsonMappingException_from_137186997682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175192 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityInfo");
        Class<? extends Object> term175199 = Class.forName((String) "java.util.concurrent.Executor");
        Class<? extends Object> term175203 = Class.forName((String) "java.util.stream.ReduceOps$16");
        Class<? extends Object> term175206 = Class.forName((String) "kex.java.lang.Float");
        Class<? extends Object> term175210 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsShorts$ByteArrayViewVarHandle");
        Class<? extends Object> term175214 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer");
        Class<? extends Object> term175220 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext");
        Class<? extends Object> term175225 = Class.forName((String) "com.fasterxml.jackson.databind.JsonMappingException");
        Class<? extends Object> term175229 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializer");
        Class<? extends Object> term175233 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$SubGroup");
        Class<? extends Object> term175237 = Class.forName((String) "java.lang.Character$Subset");
        Class<? extends Object> term175241 = Class.forName((String) "java.lang.invoke.VarHandleChars$FieldInstanceReadWrite");
        Class<? extends Object> term175245 = Class.forName((String) "java.io.ObjectInputFilter");
        Class<? extends Object> term175248 = Class.forName((String) "java.io.InterruptedIOException");
        Class<? extends Object> term175251 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJByte$Sorter");
        Class<? extends Object> term175255 = Class.forName((String) "java.lang.reflect.ProxyGenerator$FieldInfo");
        Class<? extends Object> term175259 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$PermitStatus");
        Class<? extends Object> term175262 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeyIterator");
        Class<? extends Object> term175266 = Class.forName((String) "java.nio.DirectDoubleBufferS");
        term175123 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term175124 = (Object[]) newArray("java.lang.Object", 5);
        short[] term175125 = (short[]) newShortArray(32);
        int[] term175158 = (int[]) newIntArray(32);
        Object[] term175191 = (Object[]) newArray("java.lang.Object", 32);
        long[] term175270 = (long[]) newLongArray(32);
        Object[] term175305 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term175307 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term175123, term175123.getClass(), "_path", null);
        setField(term175123, term175123.getClass(), "_processor", null);
        setField(term175123, term175123.getClass(), "_location", null);
        setShortElement(term175125, 0, (short) 13);
        setShortElement(term175125, 1, (short) 3);
        setShortElement(term175125, 5, (short) 27);
        setShortElement(term175125, 6, (short) 2);
        setShortElement(term175125, 7, (short) 3);
        setShortElement(term175125, 11, (short) 2);
        setShortElement(term175125, 12, (short) 4);
        setShortElement(term175125, 13, (short) 4);
        setShortElement(term175125, 14, (short) 3);
        setShortElement(term175125, 15, (short) 4);
        setShortElement(term175125, 16, (short) 4);
        setShortElement(term175125, 17, (short) 1);
        setShortElement(term175125, 18, (short) 2);
        setShortElement(term175125, 19, (short) 3);
        setShortElement(term175125, 20, (short) 3);
        setShortElement(term175125, 21, (short) 13);
        setShortElement(term175125, 22, (short) 1);
        setShortElement(term175125, 23, (short) 2);
        setShortElement(term175125, 24, (short) 12);
        setElement(term175124, 0, term175125);
        setIntElement(term175158, 0, 16449536);
        setIntElement(term175158, 2, 6553600);
        setIntElement(term175158, 3, 393216);
        setIntElement(term175158, 4, 3866630);
        setIntElement(term175158, 5, 1245184);
        setIntElement(term175158, 6, 3866624);
        setIntElement(term175158, 8, 6553600);
        setIntElement(term175158, 9, 393216);
        setIntElement(term175158, 10, 3866630);
        setIntElement(term175158, 11, 14352384);
        setIntElement(term175158, 12, 10354688);
        setIntElement(term175158, 13, 2883584);
        setIntElement(term175158, 14, 786432);
        setIntElement(term175158, 15, 1441792);
        setIntElement(term175158, 16, 7733248);
        setIntElement(term175158, 17, 20774912);
        setIntElement(term175158, 18, 262144);
        setIntElement(term175158, 19, 2555904);
        setIntElement(term175158, 20, 1835008);
        setIntElement(term175158, 21, 6029312);
        setIntElement(term175158, 22, 327680);
        setIntElement(term175158, 23, 1638400);
        setIntElement(term175158, 24, 720907);
        setElement(term175124, 1, term175158);
        setElement(term175191, 0, term175192);
        setElement(term175191, 1, term175199);
        setElement(term175191, 2, term175199);
        setElement(term175191, 3, term175203);
        setElement(term175191, 4, term175206);
        setElement(term175191, 5, term175210);
        setElement(term175191, 6, term175214);
        setElement(term175191, 7, term175199);
        setElement(term175191, 8, term175199);
        setElement(term175191, 9, term175203);
        setElement(term175191, 10, term175206);
        setElement(term175191, 11, term175220);
        setElement(term175191, 12, term175225);
        setElement(term175191, 13, term175229);
        setElement(term175191, 14, term175233);
        setElement(term175191, 15, term175237);
        setElement(term175191, 16, term175229);
        setElement(term175191, 17, term175241);
        setElement(term175191, 18, term175245);
        setElement(term175191, 19, term175248);
        setElement(term175191, 20, term175251);
        setElement(term175191, 21, term175255);
        setElement(term175191, 22, term175259);
        setElement(term175191, 23, term175262);
        setElement(term175191, 24, term175266);
        setElement(term175124, 2, term175191);
        setLongElement(term175270, 0, 34363800864L);
        setLongElement(term175270, 1, 34364798256L);
        setLongElement(term175270, 2, 34363739368L);
        setLongElement(term175270, 3, 34363739368L);
        setLongElement(term175270, 4, 34363739368L);
        setLongElement(term175270, 5, 132578328998496L);
        setLongElement(term175270, 6, 34363820048L);
        setLongElement(term175270, 7, 34364798256L);
        setLongElement(term175270, 8, 34363739368L);
        setLongElement(term175270, 9, 34363739368L);
        setLongElement(term175270, 10, 34363739368L);
        setLongElement(term175270, 11, 132582552571296L);
        setLongElement(term175270, 12, 132582552640272L);
        setLongElement(term175270, 13, 132582550089488L);
        setLongElement(term175270, 14, 132582552759024L);
        setLongElement(term175270, 15, 132582550089488L);
        setLongElement(term175270, 16, 132582550089488L);
        setLongElement(term175270, 17, 34363745472L);
        setLongElement(term175270, 18, 34364710216L);
        setLongElement(term175270, 19, 34363745472L);
        setLongElement(term175270, 20, 34363745472L);
        setLongElement(term175270, 21, 34364896224L);
        setLongElement(term175270, 22, 34363745472L);
        setLongElement(term175270, 23, 34363745472L);
        setLongElement(term175270, 24, 34363745472L);
        setElement(term175124, 3, term175270);
        setField(term175123, term175123.getClass(), "backtrace", term175124);
        setField(term175123, term175123.getClass(), "detailMessage", "");
        setField(term175123, term175123.getClass(), "cause", term175123);
        setField(term175123, term175123.getClass(), "stackTrace", term175305);
        setIntField(term175123, term175123.getClass(), "depth", 25);
        setIntField(term175307, term175307.getClass(), "modCount", 0);
        setField(term175123, term175123.getClass(), "suppressedExceptions", term175307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term175123));
    }

};


