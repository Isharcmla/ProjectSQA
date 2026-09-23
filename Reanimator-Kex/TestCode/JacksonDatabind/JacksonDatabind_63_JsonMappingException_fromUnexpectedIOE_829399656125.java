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

public class JsonMappingException_fromUnexpectedIOE_829399656125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223219;
     Object term224577;
     Object term224218;

    public JsonMappingException_fromUnexpectedIOE_829399656125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223219 = newInstance(Class.forName("java.nio.file.AtomicMoveNotSupportedException"));
        term224577 = newInstance(Class.forName("java.nio.file.AtomicMoveNotSupportedException"));
        setField(term224577, term224577.getClass(), "file", null);
        setField(term224577, term224577.getClass(), "other", null);
        setField(term224577, term224577.getClass(), "backtrace", null);
        setField(term224577, term224577.getClass(), "detailMessage", null);
        setField(term224577, term224577.getClass(), "cause", null);
        setField(term224577, term224577.getClass(), "stackTrace", null);
        setIntField(term224577, term224577.getClass(), "depth", 0);
        setField(term224577, term224577.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term224287 = Class.forName((String) "java.util.LinkedHashMap$LinkedKeySet");
        Class<? extends Object> term224294 = Class.forName((String) "java.lang.invoke.DelegatingMethodHandle");
        Class<? extends Object> term224298 = Class.forName((String) "java.util.stream.WhileOps$1Op$1OpSink");
        Class<? extends Object> term224301 = Class.forName((String) "java.util.ImmutableCollections$Set12$1");
        Class<? extends Object> term224305 = Class.forName((String) "java.lang.module.ModuleDescriptor$Modifier");
        Class<? extends Object> term224309 = Class.forName((String) "java.util.stream.ReduceOps$13ReducingSink");
        Class<? extends Object> term224315 = Class.forName((String) "java.util.stream.WhileOps$2Op");
        Class<? extends Object> term224320 = Class.forName((String) "java.lang.CharacterData00");
        Class<? extends Object> term224324 = Class.forName((String) "java.util.stream.ReferencePipeline$11");
        Class<? extends Object> term224328 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadWrite");
        Class<? extends Object> term224332 = Class.forName((String) "java.util.Spliterators$AbstractSpliterator");
        Class<? extends Object> term224336 = Class.forName((String) "java.util.regex.Pattern$CharProperty");
        Class<? extends Object> term224340 = Class.forName((String) "java.lang.reflect.AnnotatedArrayType");
        Class<? extends Object> term224343 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer");
        Class<? extends Object> term224346 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$Iter");
        Class<? extends Object> term224350 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term224354 = Class.forName((String) "java.lang.annotation.Repeatable");
        Class<? extends Object> term224357 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfPrimitive");
        Class<? extends Object> term224361 = Class.forName((String) "java.nio.file.SimpleFileVisitor");
        term224218 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term224219 = (Object[]) newArray("java.lang.Object", 5);
        short[] term224220 = (short[]) newShortArray(32);
        int[] term224253 = (int[]) newIntArray(32);
        Object[] term224286 = (Object[]) newArray("java.lang.Object", 32);
        long[] term224365 = (long[]) newLongArray(32);
        Object[] term224484 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term224486 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term224218, term224218.getClass(), "_path", null);
        setField(term224218, term224218.getClass(), "_processor", null);
        setField(term224218, term224218.getClass(), "_location", null);
        setShortElement(term224220, 0, (short) 30);
        setShortElement(term224220, 1, (short) 3);
        setShortElement(term224220, 5, (short) 27);
        setShortElement(term224220, 6, (short) 2);
        setShortElement(term224220, 7, (short) 3);
        setShortElement(term224220, 11, (short) 2);
        setShortElement(term224220, 12, (short) 4);
        setShortElement(term224220, 13, (short) 4);
        setShortElement(term224220, 14, (short) 3);
        setShortElement(term224220, 15, (short) 4);
        setShortElement(term224220, 16, (short) 4);
        setShortElement(term224220, 17, (short) 1);
        setShortElement(term224220, 18, (short) 2);
        setShortElement(term224220, 19, (short) 3);
        setShortElement(term224220, 20, (short) 3);
        setShortElement(term224220, 21, (short) 13);
        setShortElement(term224220, 22, (short) 1);
        setShortElement(term224220, 23, (short) 2);
        setShortElement(term224220, 24, (short) 12);
        setElement(term224219, 0, term224220);
        setIntElement(term224253, 0, 57016320);
        setIntElement(term224253, 2, 6553600);
        setIntElement(term224253, 3, 393216);
        setIntElement(term224253, 4, 3866630);
        setIntElement(term224253, 5, 1245184);
        setIntElement(term224253, 6, 2424832);
        setIntElement(term224253, 8, 6553600);
        setIntElement(term224253, 9, 393216);
        setIntElement(term224253, 10, 3866630);
        setIntElement(term224253, 11, 14352384);
        setIntElement(term224253, 12, 10354688);
        setIntElement(term224253, 13, 2883584);
        setIntElement(term224253, 14, 786432);
        setIntElement(term224253, 15, 1441792);
        setIntElement(term224253, 16, 7733248);
        setIntElement(term224253, 17, 20774912);
        setIntElement(term224253, 18, 262144);
        setIntElement(term224253, 19, 2555904);
        setIntElement(term224253, 20, 1835008);
        setIntElement(term224253, 21, 6029312);
        setIntElement(term224253, 22, 327680);
        setIntElement(term224253, 23, 1638400);
        setIntElement(term224253, 24, 720907);
        setElement(term224219, 1, term224253);
        setElement(term224286, 0, term224287);
        setElement(term224286, 1, term224294);
        setElement(term224286, 2, term224294);
        setElement(term224286, 3, term224298);
        setElement(term224286, 4, term224301);
        setElement(term224286, 5, term224305);
        setElement(term224286, 6, term224309);
        setElement(term224286, 7, term224294);
        setElement(term224286, 8, term224294);
        setElement(term224286, 9, term224298);
        setElement(term224286, 10, term224301);
        setElement(term224286, 11, term224315);
        setElement(term224286, 12, term224320);
        setElement(term224286, 13, term224324);
        setElement(term224286, 14, term224328);
        setElement(term224286, 15, term224332);
        setElement(term224286, 16, term224324);
        setElement(term224286, 17, term224336);
        setElement(term224286, 18, term224340);
        setElement(term224286, 19, term224343);
        setElement(term224286, 20, term224346);
        setElement(term224286, 21, term224350);
        setElement(term224286, 22, term224354);
        setElement(term224286, 23, term224357);
        setElement(term224286, 24, term224361);
        setElement(term224219, 2, term224286);
        setLongElement(term224365, 0, 132578329177248L);
        setLongElement(term224365, 1, 34364798256L);
        setLongElement(term224365, 2, 34363739368L);
        setLongElement(term224365, 3, 34363739368L);
        setLongElement(term224365, 4, 34363739368L);
        setLongElement(term224365, 5, 132578328998496L);
        setLongElement(term224365, 6, 34363820048L);
        setLongElement(term224365, 7, 34364798256L);
        setLongElement(term224365, 8, 34363739368L);
        setLongElement(term224365, 9, 34363739368L);
        setLongElement(term224365, 10, 34363739368L);
        setLongElement(term224365, 11, 132582552571296L);
        setLongElement(term224365, 12, 132582552640272L);
        setLongElement(term224365, 13, 132582550089488L);
        setLongElement(term224365, 14, 132582552759024L);
        setLongElement(term224365, 15, 132582550089488L);
        setLongElement(term224365, 16, 132582550089488L);
        setLongElement(term224365, 17, 34363745472L);
        setLongElement(term224365, 18, 34364710216L);
        setLongElement(term224365, 19, 34363745472L);
        setLongElement(term224365, 20, 34363745472L);
        setLongElement(term224365, 21, 34364896224L);
        setLongElement(term224365, 22, 34363745472L);
        setLongElement(term224365, 23, 34363745472L);
        setLongElement(term224365, 24, 34363745472L);
        setElement(term224219, 3, term224365);
        setField(term224218, term224218.getClass(), "backtrace", term224219);
        setField(term224218, term224218.getClass(), "detailMessage", "Unexpected IOException (of type java.nio.file.AtomicMoveNotSupportedException): null");
        setField(term224218, term224218.getClass(), "cause", term224218);
        setField(term224218, term224218.getClass(), "stackTrace", term224484);
        setIntField(term224218, term224218.getClass(), "depth", 25);
        setIntField(term224486, term224486.getClass(), "modCount", 0);
        setField(term224218, term224218.getClass(), "suppressedExceptions", term224486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term223219;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term223219, term224577));
        assertTrue(recursiveEquals(retValue, term224218));
    }

};


