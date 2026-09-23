package com.fasterxml.jackson.databind.deser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializerBase_wrapAndThrow_175095530894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term429;

    public BeanDeserializerBase_wrapAndThrow_175095530894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214 = Class.forName((String) "java.util.concurrent.Executors");
        Class<? extends Object> term217 = Class.forName((String) "java.util.AbstractCollection");
        Class<? extends Object> term219 = Class.forName((String) "java.util.concurrent.CompletableFuture$ThreadPerTaskExecutor");
        Class<? extends Object> term223 = Class.forName((String) "java.util.stream.Streams$LongStreamBuilderImpl");
        Class<? extends Object> term228 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleSerializers");
        Class<? extends Object> term232 = Class.forName((String) "java.util.Spliterators$2Adapter");
        Class<? extends Object> term236 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonValue");
        Class<? extends Object> term240 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary$Unloader");
        Class<? extends Object> term244 = Class.forName((String) "java.util.regex.Pattern$Node");
        Class<? extends Object> term248 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer");
        Class<? extends Object> term252 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool$ValueEntry");
        Class<? extends Object> term256 = Class.forName((String) "java.util.regex.Pattern$BehindS");
        Class<? extends Object> term260 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldInstanceReadWrite");
        Class<? extends Object> term264 = Class.forName((String) "java.io.ObjectStreamClass");
        Class<? extends Object> term266 = Class.forName((String) "java.io.ObjectInputValidation");
        Class<? extends Object> term269 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Class<? extends Object> term271 = Class.forName((String) "java.nio.channels.ServerSocketChannel");
        Class<? extends Object> term273 = Class.forName((String) "java.nio.charset.CharacterCodingException");
        Class<? extends Object> term376 = Class.forName((String) "java.lang.StackFrameInfo");
        Class<? extends Object> term378 = Class.forName((String) "java.lang.Iterable");
        term145 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term146 = (Object[]) newArray("java.lang.Object", 5);
        short[] term147 = (short[]) newShortArray(32);
        int[] term180 = (int[]) newIntArray(32);
        Object[] term213 = (Object[]) newArray("java.lang.Object", 32);
        long[] term275 = (long[]) newLongArray(32);
        Object[] term308 = (Object[]) newArray("java.lang.Object", 5);
        short[] term309 = (short[]) newShortArray(32);
        int[] term342 = (int[]) newIntArray(32);
        Object[] term375 = (Object[]) newArray("java.lang.Object", 32);
        long[] term380 = (long[]) newLongArray(32);
        Object[] term425 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term427 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term147, 0, (short) 1);
        setShortElement(term147, 1, (short) 2);
        setShortElement(term147, 2, (short) 1);
        setShortElement(term147, 3, (short) 7);
        setShortElement(term147, 4, (short) 2);
        setShortElement(term147, 5, (short) 1);
        setShortElement(term147, 6, (short) 6);
        setShortElement(term147, 7, (short) 2);
        setShortElement(term147, 8, (short) 10);
        setShortElement(term147, 9, (short) 11);
        setShortElement(term147, 10, (short) 29);
        setShortElement(term147, 11, (short) 5);
        setShortElement(term147, 12, (short) 4);
        setShortElement(term147, 13, (short) 5);
        setShortElement(term147, 14, (short) 6);
        setShortElement(term147, 15, (short) 6);
        setShortElement(term147, 16, (short) 9);
        setShortElement(term147, 17, (short) 10);
        setShortElement(term147, 18, (short) 11);
        setShortElement(term147, 19, (short) 4);
        setShortElement(term147, 20, (short) 1);
        setShortElement(term147, 23, (short) 3);
        setShortElement(term147, 24, (short) 4);
        setShortElement(term147, 25, (short) 4);
        setShortElement(term147, 26, (short) 1);
        setShortElement(term147, 27, (short) 2);
        setShortElement(term147, 28, (short) 3);
        setShortElement(term147, 29, (short) 3);
        setShortElement(term147, 30, (short) 13);
        setShortElement(term147, 31, (short) 1);
        setElement(term146, 0, term147);
        setIntElement(term180, 1, 5570560);
        setIntElement(term180, 2, 327680);
        setIntElement(term180, 3, 4456454);
        setIntElement(term180, 4, 1769472);
        setIntElement(term180, 5, 14876672);
        setIntElement(term180, 6, 6225920);
        setIntElement(term180, 7, 917504);
        setIntElement(term180, 8, 327680);
        setIntElement(term180, 9, 8519680);
        setIntElement(term180, 10, 917504);
        setIntElement(term180, 11, 11993088);
        setIntElement(term180, 12, 655360);
        setIntElement(term180, 13, 7864320);
        setIntElement(term180, 14, 3735552);
        setIntElement(term180, 15, 7143424);
        setIntElement(term180, 16, 8454144);
        setIntElement(term180, 17, 9240576);
        setIntElement(term180, 18, 196608);
        setIntElement(term180, 19, 3801088);
        setIntElement(term180, 20, 786432);
        setIntElement(term180, 21, 589824);
        setIntElement(term180, 22, 17170432);
        setIntElement(term180, 23, 1376256);
        setIntElement(term180, 24, 5242880);
        setIntElement(term180, 25, 2883584);
        setIntElement(term180, 26, 20774912);
        setIntElement(term180, 27, 262144);
        setIntElement(term180, 28, 2555904);
        setIntElement(term180, 29, 1835008);
        setIntElement(term180, 30, 6029312);
        setIntElement(term180, 31, 327680);
        setElement(term146, 1, term180);
        setElement(term213, 0, term214);
        setElement(term213, 1, term214);
        setElement(term213, 2, term217);
        setElement(term213, 3, term219);
        setElement(term213, 4, term223);
        setElement(term213, 5, term223);
        setElement(term213, 6, term228);
        setElement(term213, 7, term228);
        setElement(term213, 8, term232);
        setElement(term213, 9, term232);
        setElement(term213, 10, term232);
        setElement(term213, 11, term232);
        setElement(term213, 12, term232);
        setElement(term213, 13, term236);
        setElement(term213, 14, term236);
        setElement(term213, 15, term240);
        setElement(term213, 16, term240);
        setElement(term213, 17, term240);
        setElement(term213, 18, term240);
        setElement(term213, 19, term244);
        setElement(term213, 20, term244);
        setElement(term213, 21, term244);
        setElement(term213, 22, term248);
        setElement(term213, 23, term240);
        setElement(term213, 24, term252);
        setElement(term213, 25, term256);
        setElement(term213, 26, term260);
        setElement(term213, 27, term264);
        setElement(term213, 28, term266);
        setElement(term213, 29, term269);
        setElement(term213, 30, term271);
        setElement(term213, 31, term273);
        setElement(term146, 2, term213);
        setLongElement(term275, 0, 34363746224L);
        setLongElement(term275, 1, 34363775512L);
        setLongElement(term275, 2, 34363775512L);
        setLongElement(term275, 3, 34363775512L);
        setLongElement(term275, 4, 127102448043280L);
        setLongElement(term275, 5, 34364440080L);
        setLongElement(term275, 6, 127102448110432L);
        setLongElement(term275, 7, 127102447950512L);
        setLongElement(term275, 8, 127102447950400L);
        setLongElement(term275, 9, 127102447950544L);
        setLongElement(term275, 10, 127102447996864L);
        setLongElement(term275, 11, 34363766248L);
        setLongElement(term275, 12, 34363766248L);
        setLongElement(term275, 13, 127099392863808L);
        setLongElement(term275, 14, 127099392863808L);
        setLongElement(term275, 15, 127099392863664L);
        setLongElement(term275, 16, 127099392908224L);
        setLongElement(term275, 17, 127099392909872L);
        setLongElement(term275, 18, 127099392910640L);
        setLongElement(term275, 19, 127099389837984L);
        setLongElement(term275, 20, 34363739368L);
        setLongElement(term275, 21, 34363739368L);
        setLongElement(term275, 22, 127099392862304L);
        setLongElement(term275, 23, 34363829248L);
        setLongElement(term275, 24, 127099389837984L);
        setLongElement(term275, 25, 127099389022368L);
        setLongElement(term275, 26, 34363745472L);
        setLongElement(term275, 27, 34364710216L);
        setLongElement(term275, 28, 34363745472L);
        setLongElement(term275, 29, 34363745472L);
        setLongElement(term275, 30, 34364896224L);
        setLongElement(term275, 31, 34363745472L);
        setElement(term146, 3, term275);
        setShortElement(term309, 0, (short) 2);
        setShortElement(term309, 1, (short) 12);
        setElement(term308, 0, term309);
        setIntElement(term342, 0, 1638400);
        setIntElement(term342, 1, 720907);
        setElement(term308, 1, term342);
        setElement(term375, 0, term376);
        setElement(term375, 1, term378);
        setElement(term308, 2, term375);
        setLongElement(term380, 0, 34363745472L);
        setLongElement(term380, 1, 34363745472L);
        setElement(term308, 3, term380);
        setElement(term146, 4, term308);
        setField(term145, term145.getClass(), "backtrace", term146);
        setField(term145, term145.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term145, term145.getClass(), "cause", term145);
        setField(term145, term145.getClass(), "stackTrace", term425);
        setIntField(term145, term145.getClass(), "depth", 34);
        setIntField(term427, term427.getClass(), "modCount", 0);
        setField(term145, term145.getClass(), "suppressedExceptions", term427);
        term429 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[4];
        args[0] = term145;
        args[1] = term429;
        args[2] = "MjGYSRKTNF";
        args[3] = null;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


