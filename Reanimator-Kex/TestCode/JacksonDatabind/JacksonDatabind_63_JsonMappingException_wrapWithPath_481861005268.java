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

public class JsonMappingException_wrapWithPath_481861005268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432588;
     Object term433163;
     Object term432907;

    public JsonMappingException_wrapWithPath_481861005268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432588 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        term433163 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        setField(term433163, term433163.getClass(), "backtrace", null);
        setField(term433163, term433163.getClass(), "detailMessage", null);
        setField(term433163, term433163.getClass(), "cause", null);
        setField(term433163, term433163.getClass(), "stackTrace", null);
        setIntField(term433163, term433163.getClass(), "depth", 0);
        setField(term433163, term433163.getClass(), "suppressedExceptions", null);
        LinkedList term432908 = new LinkedList();
        ((LinkedList) term432908).add((Object)null);
        Class<? extends Object> term432980 = Class.forName((String) "java.lang.invoke.MethodHandleImpl");
        Class<? extends Object> term432987 = Class.forName((String) "java.nio.file.attribute.FileAttribute");
        Class<? extends Object> term433000 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer");
        Class<? extends Object> term433004 = Class.forName((String) "java.nio.DirectCharBufferU");
        Class<? extends Object> term433008 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsLongs$ByteArrayViewVarHandle");
        Class<? extends Object> term433012 = Class.forName((String) "java.lang.Appendable");
        Class<? extends Object> term433018 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong");
        Class<? extends Object> term433021 = Class.forName((String) "java.util.stream.DoublePipeline$3$1");
        Class<? extends Object> term433026 = Class.forName((String) "java.util.zip.DeflaterOutputStream");
        Class<? extends Object> term433030 = Class.forName((String) "java.lang.StackStreamFactory$LiveStackInfoTraverser$LiveStackFrameBuffer");
        Class<? extends Object> term433034 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.package-info");
        Class<? extends Object> term433038 = Class.forName((String) "java.util.stream.MatchOps$MatchKind");
        Class<? extends Object> term433042 = Class.forName((String) "java.util.stream.ReduceOps$12");
        Class<? extends Object> term433046 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term433049 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniRun");
        Class<? extends Object> term433052 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember");
        Class<? extends Object> term433056 = Class.forName((String) "java.util.concurrent.TimeUnit$1");
        Class<? extends Object> term433060 = Class.forName((String) "java.nio.DirectDoubleBufferRU");
        Class<? extends Object> term433063 = Class.forName((String) "java.nio.file.NoSuchFileException");
        Class<? extends Object> term433067 = Class.forName((String) "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException");
        term432907 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term432912 = (Object[]) newArray("java.lang.Object", 5);
        short[] term432913 = (short[]) newShortArray(32);
        int[] term432946 = (int[]) newIntArray(32);
        Object[] term432979 = (Object[]) newArray("java.lang.Object", 32);
        long[] term433071 = (long[]) newLongArray(32);
        Object term432902 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        Object[] term433159 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term433161 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term432907, term432907.getClass(), "_path", term432908);
        setField(term432907, term432907.getClass(), "_processor", null);
        setField(term432907, term432907.getClass(), "_location", null);
        setShortElement(term432913, 0, (short) 20);
        setShortElement(term432913, 4, (short) 27);
        setShortElement(term432913, 5, (short) 2);
        setShortElement(term432913, 6, (short) 3);
        setShortElement(term432913, 10, (short) 2);
        setShortElement(term432913, 11, (short) 4);
        setShortElement(term432913, 12, (short) 4);
        setShortElement(term432913, 13, (short) 3);
        setShortElement(term432913, 14, (short) 4);
        setShortElement(term432913, 15, (short) 4);
        setShortElement(term432913, 16, (short) 1);
        setShortElement(term432913, 17, (short) 2);
        setShortElement(term432913, 18, (short) 3);
        setShortElement(term432913, 19, (short) 3);
        setShortElement(term432913, 20, (short) 13);
        setShortElement(term432913, 21, (short) 1);
        setShortElement(term432913, 22, (short) 2);
        setShortElement(term432913, 23, (short) 12);
        setElement(term432912, 0, term432913);
        setIntElement(term432946, 0, 128385024);
        setIntElement(term432946, 1, 2097152);
        setIntElement(term432946, 2, 393216);
        setIntElement(term432946, 3, 3866630);
        setIntElement(term432946, 4, 1245184);
        setIntElement(term432946, 5, 3211264);
        setIntElement(term432946, 7, 6553600);
        setIntElement(term432946, 8, 393216);
        setIntElement(term432946, 9, 3866630);
        setIntElement(term432946, 10, 14352384);
        setIntElement(term432946, 11, 10354688);
        setIntElement(term432946, 12, 2883584);
        setIntElement(term432946, 13, 786432);
        setIntElement(term432946, 14, 1441792);
        setIntElement(term432946, 15, 7733248);
        setIntElement(term432946, 16, 20774912);
        setIntElement(term432946, 17, 262144);
        setIntElement(term432946, 18, 2555904);
        setIntElement(term432946, 19, 1835008);
        setIntElement(term432946, 20, 6029312);
        setIntElement(term432946, 21, 327680);
        setIntElement(term432946, 22, 1638400);
        setIntElement(term432946, 23, 720907);
        setElement(term432912, 1, term432946);
        setElement(term432979, 0, term432980);
        setElement(term432979, 1, term432987);
        setElement(term432979, 2, term433000);
        setElement(term432979, 3, term433004);
        setElement(term432979, 4, term433008);
        setElement(term432979, 5, term433012);
        setElement(term432979, 6, term433018);
        setElement(term432979, 7, term433018);
        setElement(term432979, 8, term433000);
        setElement(term432979, 9, term433004);
        setElement(term432979, 10, term433021);
        setElement(term432979, 11, term433026);
        setElement(term432979, 12, term433030);
        setElement(term432979, 13, term433034);
        setElement(term432979, 14, term433038);
        setElement(term432979, 15, term433030);
        setElement(term432979, 16, term433042);
        setElement(term432979, 17, term433046);
        setElement(term432979, 18, term433049);
        setElement(term432979, 19, term433052);
        setElement(term432979, 20, term433056);
        setElement(term432979, 21, term433060);
        setElement(term432979, 22, term433063);
        setElement(term432979, 23, term433067);
        setElement(term432912, 2, term432979);
        setLongElement(term433071, 0, 132578328546864L);
        setLongElement(term433071, 1, 34363739368L);
        setLongElement(term433071, 2, 34363739368L);
        setLongElement(term433071, 3, 34363739368L);
        setLongElement(term433071, 4, 132578328998496L);
        setLongElement(term433071, 5, 34363820048L);
        setLongElement(term433071, 6, 34364798256L);
        setLongElement(term433071, 7, 34363739368L);
        setLongElement(term433071, 8, 34363739368L);
        setLongElement(term433071, 9, 34363739368L);
        setLongElement(term433071, 10, 132582552571296L);
        setLongElement(term433071, 11, 132582552640272L);
        setLongElement(term433071, 12, 132582550089488L);
        setLongElement(term433071, 13, 132582552759024L);
        setLongElement(term433071, 14, 132582550089488L);
        setLongElement(term433071, 15, 132582550089488L);
        setLongElement(term433071, 16, 34363745472L);
        setLongElement(term433071, 17, 34364710216L);
        setLongElement(term433071, 18, 34363745472L);
        setLongElement(term433071, 19, 34363745472L);
        setLongElement(term433071, 20, 34364896224L);
        setLongElement(term433071, 21, 34363745472L);
        setLongElement(term433071, 22, 34363745472L);
        setLongElement(term433071, 23, 34363745472L);
        setElement(term432912, 3, term433071);
        setField(term432907, term432907.getClass(), "backtrace", term432912);
        setField(term432907, term432907.getClass(), "detailMessage", "(was java.util.concurrent.RejectedExecutionException)");
        setField(term432902, term432902.getClass(), "backtrace", null);
        setField(term432902, term432902.getClass(), "detailMessage", null);
        setField(term432902, term432902.getClass(), "cause", null);
        setField(term432902, term432902.getClass(), "stackTrace", null);
        setIntField(term432902, term432902.getClass(), "depth", 0);
        setField(term432902, term432902.getClass(), "suppressedExceptions", null);
        setField(term432907, term432907.getClass(), "cause", term432902);
        setField(term432907, term432907.getClass(), "stackTrace", term433159);
        setIntField(term432907, term432907.getClass(), "depth", 24);
        setIntField(term433161, term433161.getClass(), "modCount", 0);
        setField(term432907, term432907.getClass(), "suppressedExceptions", term433161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term432588;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term432588, term433163));
        assertTrue(recursiveEquals(retValue, term432907));
    }

};


