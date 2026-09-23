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

public class JsonMappingException_from_32020508985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181950;
     Object term190337;
     Object term190155;

    public JsonMappingException_from_32020508985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181950 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term190337 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term190337, term190337.getClass(), "_objectIds", null);
        setField(term190337, term190337.getClass(), "_objectIdResolvers", null);
        setField(term190337, term190337.getClass(), "_cache", null);
        setField(term190337, term190337.getClass(), "_factory", null);
        setField(term190337, term190337.getClass(), "_config", null);
        setIntField(term190337, term190337.getClass(), "_featureFlags", 0);
        setField(term190337, term190337.getClass(), "_view", null);
        setField(term190337, term190337.getClass(), "_parser", null);
        setField(term190337, term190337.getClass(), "_injectableValues", null);
        setField(term190337, term190337.getClass(), "_arrayBuilders", null);
        setField(term190337, term190337.getClass(), "_objectBuffer", null);
        setField(term190337, term190337.getClass(), "_dateFormat", null);
        setField(term190337, term190337.getClass(), "_attributes", null);
        setField(term190337, term190337.getClass(), "_currentType", null);
        Class<? extends Object> term190224 = Class.forName((String) "java.lang.ClassLoader$ParallelLoaders");
        Class<? extends Object> term190231 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$IntrinsicMethodHandle");
        Class<? extends Object> term190234 = Class.forName((String) "java.util.stream.ReduceOps$3ReducingSink");
        Class<? extends Object> term190236 = Class.forName((String) "java.nio.DirectIntBufferRU");
        Class<? extends Object> term190240 = Class.forName((String) "com.fasterxml.jackson.databind.ext.Java7SupportImpl");
        Class<? extends Object> term190244 = Class.forName((String) "com.fasterxml.jackson.databind.DatabindContext");
        Class<? extends Object> term190250 = Class.forName((String) "java.util.jar.JavaUtilJarAccessImpl");
        Class<? extends Object> term190255 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter");
        Class<? extends Object> term190259 = Class.forName((String) "java.lang.Character$CharacterCache");
        Class<? extends Object> term190263 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldStaticReadWrite");
        Class<? extends Object> term190267 = Class.forName((String) "java.util.regex.Pattern$XGrapheme");
        Class<? extends Object> term190271 = Class.forName((String) "java.util.stream.DoubleStream$2");
        Class<? extends Object> term190275 = Class.forName((String) "java.nio.channels.AsynchronousChannel");
        Class<? extends Object> term190278 = Class.forName((String) "java.lang.StackStreamFactory$StackFrameTraverser");
        Class<? extends Object> term190281 = Class.forName((String) "java.util.stream.DoublePipeline$4");
        Class<? extends Object> term190285 = Class.forName((String) "java.util.zip.Checksum$1");
        Class<? extends Object> term190288 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor");
        Class<? extends Object> term190291 = Class.forName((String) "java.util.stream.Streams$ConcatSpliterator$OfInt");
        Class<? extends Object> term190295 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$1");
        term190155 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term190156 = (Object[]) newArray("java.lang.Object", 5);
        short[] term190157 = (short[]) newShortArray(32);
        int[] term190190 = (int[]) newIntArray(32);
        Object[] term190223 = (Object[]) newArray("java.lang.Object", 32);
        long[] term190299 = (long[]) newLongArray(32);
        Object[] term190332 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term190334 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term190155, term190155.getClass(), "_path", null);
        setField(term190155, term190155.getClass(), "_processor", null);
        setField(term190155, term190155.getClass(), "_location", null);
        setShortElement(term190157, 0, (short) 8);
        setShortElement(term190157, 1, (short) 3);
        setShortElement(term190157, 5, (short) 33);
        setShortElement(term190157, 6, (short) 2);
        setShortElement(term190157, 7, (short) 3);
        setShortElement(term190157, 11, (short) 2);
        setShortElement(term190157, 12, (short) 4);
        setShortElement(term190157, 13, (short) 4);
        setShortElement(term190157, 14, (short) 3);
        setShortElement(term190157, 15, (short) 4);
        setShortElement(term190157, 16, (short) 4);
        setShortElement(term190157, 17, (short) 1);
        setShortElement(term190157, 18, (short) 2);
        setShortElement(term190157, 19, (short) 3);
        setShortElement(term190157, 20, (short) 3);
        setShortElement(term190157, 21, (short) 13);
        setShortElement(term190157, 22, (short) 1);
        setShortElement(term190157, 23, (short) 2);
        setShortElement(term190157, 24, (short) 12);
        setElement(term190156, 0, term190157);
        setIntElement(term190190, 0, 19529728);
        setIntElement(term190190, 2, 6553600);
        setIntElement(term190190, 3, 393216);
        setIntElement(term190190, 4, 3866630);
        setIntElement(term190190, 5, 1245184);
        setIntElement(term190190, 6, 3211264);
        setIntElement(term190190, 8, 6553600);
        setIntElement(term190190, 9, 393216);
        setIntElement(term190190, 10, 3866630);
        setIntElement(term190190, 11, 14352384);
        setIntElement(term190190, 12, 10354688);
        setIntElement(term190190, 13, 2883584);
        setIntElement(term190190, 14, 786432);
        setIntElement(term190190, 15, 1441792);
        setIntElement(term190190, 16, 7733248);
        setIntElement(term190190, 17, 20774912);
        setIntElement(term190190, 18, 262144);
        setIntElement(term190190, 19, 2555904);
        setIntElement(term190190, 20, 1835008);
        setIntElement(term190190, 21, 6029312);
        setIntElement(term190190, 22, 327680);
        setIntElement(term190190, 23, 1638400);
        setIntElement(term190190, 24, 720907);
        setElement(term190156, 1, term190190);
        setElement(term190223, 0, term190224);
        setElement(term190223, 1, term190231);
        setElement(term190223, 2, term190231);
        setElement(term190223, 3, term190234);
        setElement(term190223, 4, term190236);
        setElement(term190223, 5, term190240);
        setElement(term190223, 6, term190244);
        setElement(term190223, 7, term190231);
        setElement(term190223, 8, term190231);
        setElement(term190223, 9, term190234);
        setElement(term190223, 10, term190236);
        setElement(term190223, 11, term190250);
        setElement(term190223, 12, term190255);
        setElement(term190223, 13, term190259);
        setElement(term190223, 14, term190263);
        setElement(term190223, 15, term190267);
        setElement(term190223, 16, term190259);
        setElement(term190223, 17, term190271);
        setElement(term190223, 18, term190275);
        setElement(term190223, 19, term190278);
        setElement(term190223, 20, term190281);
        setElement(term190223, 21, term190285);
        setElement(term190223, 22, term190288);
        setElement(term190223, 23, term190291);
        setElement(term190223, 24, term190295);
        setElement(term190156, 2, term190223);
        setLongElement(term190299, 0, 34363800864L);
        setLongElement(term190299, 1, 34364798256L);
        setLongElement(term190299, 2, 34363739368L);
        setLongElement(term190299, 3, 34363739368L);
        setLongElement(term190299, 4, 34363739368L);
        setLongElement(term190299, 5, 132073603951184L);
        setLongElement(term190299, 6, 34363820048L);
        setLongElement(term190299, 7, 34364798256L);
        setLongElement(term190299, 8, 34363739368L);
        setLongElement(term190299, 9, 34363739368L);
        setLongElement(term190299, 10, 34363739368L);
        setLongElement(term190299, 11, 132077283560208L);
        setLongElement(term190299, 12, 132077283629184L);
        setLongElement(term190299, 13, 132077281112816L);
        setLongElement(term190299, 14, 132077283747392L);
        setLongElement(term190299, 15, 132077281112816L);
        setLongElement(term190299, 16, 132077281112816L);
        setLongElement(term190299, 17, 34363745472L);
        setLongElement(term190299, 18, 34364710216L);
        setLongElement(term190299, 19, 34363745472L);
        setLongElement(term190299, 20, 34363745472L);
        setLongElement(term190299, 21, 34364896224L);
        setLongElement(term190299, 22, 34363745472L);
        setLongElement(term190299, 23, 34363745472L);
        setLongElement(term190299, 24, 34363745472L);
        setElement(term190156, 3, term190299);
        setField(term190155, term190155.getClass(), "backtrace", term190156);
        setField(term190155, term190155.getClass(), "detailMessage", null);
        setField(term190155, term190155.getClass(), "cause", term190155);
        setField(term190155, term190155.getClass(), "stackTrace", term190332);
        setIntField(term190155, term190155.getClass(), "depth", 25);
        setIntField(term190334, term190334.getClass(), "modCount", 0);
        setField(term190155, term190155.getClass(), "suppressedExceptions", term190334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term181950;
        args[1] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term181950, term190337));
        assertTrue(recursiveEquals(retValue, term190155));
    }

};


