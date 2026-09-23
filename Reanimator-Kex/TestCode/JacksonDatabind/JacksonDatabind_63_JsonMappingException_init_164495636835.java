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

public class JsonMappingException_init_164495636835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53014;

    public JsonMappingException_init_164495636835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53019 = Class.forName((String) "java.util.concurrent.ExecutionException");
        Class<? extends Object> term53021 = Class.forName((String) "java.util.stream.WhileOps$3$1");
        Class<? extends Object> term53022 = Class.forName((String) "java.lang.ProcessHandleImpl$ExitCompletion");
        Class<? extends Object> term53025 = Class.forName((String) "java.lang.ArrayIndexOutOfBoundsException");
        Class<? extends Object> term53029 = Class.forName((String) "com.fasterxml.jackson.databind.JsonDeserializer");
        Class<? extends Object> term53033 = Class.forName((String) "java.nio.HeapCharBufferR");
        Class<? extends Object> term53034 = Class.forName((String) "java.util.Locale$Category");
        Class<? extends Object> term53035 = Class.forName((String) "java.lang.invoke.VarHandleObjects$FieldStaticReadWrite");
        Class<? extends Object> term53038 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap");
        Class<? extends Object> term53042 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary$Unloader");
        Class<? extends Object> term53045 = Class.forName((String) "java.util.AbstractMap$2$1");
        Class<? extends Object> term53048 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator");
        Class<? extends Object> term53051 = Class.forName((String) "java.util.stream.SliceOps$SliceTask");
        Class<? extends Object> term53054 = Class.forName((String) "java.util.AbstractQueue");
        Class<? extends Object> term53057 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer");
        Class<? extends Object> term53059 = Class.forName((String) "java.lang.StringConcatHelper");
        Class<? extends Object> term53061 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<? extends Object> term53064 = Class.forName((String) "com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator");
        Class<? extends Object> term53066 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Accessor");
        Class<? extends Object> term53068 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleModule");
        Class<? extends Object> term53071 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Value");
        term53014 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term53015 = (Object[]) newArray("java.lang.Object", 5);
        short[] term53016 = (short[]) newShortArray(32);
        int[] term53017 = (int[]) newIntArray(32);
        Object[] term53018 = (Object[]) newArray("java.lang.Object", 32);
        long[] term53074 = (long[]) newLongArray(32);
        Object[] term53077 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term53078 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term53014, term53014.getClass(), "_path", null);
        setField(term53014, term53014.getClass(), "_processor", null);
        setField(term53014, term53014.getClass(), "_location", null);
        setShortElement(term53016, 0, (short) 1);
        setShortElement(term53016, 1, (short) 2);
        setShortElement(term53016, 2, (short) 1);
        setShortElement(term53016, 3, (short) 7);
        setShortElement(term53016, 4, (short) 14);
        setShortElement(term53016, 5, (short) 2);
        setShortElement(term53016, 6, (short) 3);
        setShortElement(term53016, 10, (short) 2);
        setShortElement(term53016, 11, (short) 4);
        setShortElement(term53016, 12, (short) 4);
        setShortElement(term53016, 13, (short) 3);
        setShortElement(term53016, 14, (short) 4);
        setShortElement(term53016, 15, (short) 4);
        setShortElement(term53016, 16, (short) 1);
        setShortElement(term53016, 17, (short) 2);
        setShortElement(term53016, 18, (short) 3);
        setShortElement(term53016, 19, (short) 3);
        setShortElement(term53016, 20, (short) 13);
        setShortElement(term53016, 21, (short) 1);
        setShortElement(term53016, 22, (short) 2);
        setShortElement(term53016, 23, (short) 12);
        setElement(term53015, 0, term53016);
        setIntElement(term53017, 1, 5570560);
        setIntElement(term53017, 2, 327680);
        setIntElement(term53017, 3, 4456454);
        setIntElement(term53017, 4, 851968);
        setIntElement(term53017, 5, 2883584);
        setIntElement(term53017, 7, 6553600);
        setIntElement(term53017, 8, 393216);
        setIntElement(term53017, 9, 3866630);
        setIntElement(term53017, 10, 14352384);
        setIntElement(term53017, 11, 10354688);
        setIntElement(term53017, 12, 2883584);
        setIntElement(term53017, 13, 786432);
        setIntElement(term53017, 14, 1441792);
        setIntElement(term53017, 15, 7733248);
        setIntElement(term53017, 16, 20774912);
        setIntElement(term53017, 17, 262144);
        setIntElement(term53017, 18, 2555904);
        setIntElement(term53017, 19, 1835008);
        setIntElement(term53017, 20, 6029312);
        setIntElement(term53017, 21, 327680);
        setIntElement(term53017, 22, 1638400);
        setIntElement(term53017, 23, 720907);
        setElement(term53015, 1, term53017);
        setElement(term53018, 0, term53019);
        setElement(term53018, 1, term53019);
        setElement(term53018, 2, term53021);
        setElement(term53018, 3, term53022);
        setElement(term53018, 4, term53025);
        setElement(term53018, 5, term53029);
        setElement(term53018, 6, term53033);
        setElement(term53018, 7, term53033);
        setElement(term53018, 8, term53034);
        setElement(term53018, 9, term53035);
        setElement(term53018, 10, term53038);
        setElement(term53018, 11, term53042);
        setElement(term53018, 12, term53045);
        setElement(term53018, 13, term53048);
        setElement(term53018, 14, term53051);
        setElement(term53018, 15, term53045);
        setElement(term53018, 16, term53054);
        setElement(term53018, 17, term53057);
        setElement(term53018, 18, term53059);
        setElement(term53018, 19, term53061);
        setElement(term53018, 20, term53064);
        setElement(term53018, 21, term53066);
        setElement(term53018, 22, term53068);
        setElement(term53018, 23, term53071);
        setElement(term53015, 2, term53018);
        setLongElement(term53074, 0, 34363746224L);
        setLongElement(term53074, 1, 34363775512L);
        setLongElement(term53074, 2, 34363775512L);
        setLongElement(term53074, 3, 34363775512L);
        setLongElement(term53074, 4, 132578326060064L);
        setLongElement(term53074, 5, 34363820048L);
        setLongElement(term53074, 6, 34364798256L);
        setLongElement(term53074, 7, 34363739368L);
        setLongElement(term53074, 8, 34363739368L);
        setLongElement(term53074, 9, 34363739368L);
        setLongElement(term53074, 10, 132582552571296L);
        setLongElement(term53074, 11, 132582552640272L);
        setLongElement(term53074, 12, 132582550089488L);
        setLongElement(term53074, 13, 132582552759024L);
        setLongElement(term53074, 14, 132582550089488L);
        setLongElement(term53074, 15, 132582550089488L);
        setLongElement(term53074, 16, 34363745472L);
        setLongElement(term53074, 17, 34364710216L);
        setLongElement(term53074, 18, 34363745472L);
        setLongElement(term53074, 19, 34363745472L);
        setLongElement(term53074, 20, 34364896224L);
        setLongElement(term53074, 21, 34363745472L);
        setLongElement(term53074, 22, 34363745472L);
        setLongElement(term53074, 23, 34363745472L);
        setElement(term53015, 3, term53074);
        setField(term53014, term53014.getClass(), "backtrace", term53015);
        setField(term53014, term53014.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term53014, term53014.getClass(), "cause", term53014);
        setField(term53014, term53014.getClass(), "stackTrace", term53077);
        setIntField(term53014, term53014.getClass(), "depth", 24);
        setIntField(term53078, term53078.getClass(), "modCount", 0);
        setField(term53014, term53014.getClass(), "suppressedExceptions", term53078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53014));
    }

};


