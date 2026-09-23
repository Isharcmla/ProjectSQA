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

public class JsonMappingException_fromUnexpectedIOE_829399656128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223674;
     Object term230467;
     Object term230110;

    public JsonMappingException_fromUnexpectedIOE_829399656128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223674 = newInstance(Class.forName("java.nio.channels.ClosedByInterruptException"));
        term230467 = newInstance(Class.forName("java.nio.channels.ClosedByInterruptException"));
        setField(term230467, term230467.getClass(), "backtrace", null);
        setField(term230467, term230467.getClass(), "detailMessage", null);
        setField(term230467, term230467.getClass(), "cause", null);
        setField(term230467, term230467.getClass(), "stackTrace", null);
        setIntField(term230467, term230467.getClass(), "depth", 0);
        setField(term230467, term230467.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term230179 = Class.forName((String) "java.lang.invoke.VarHandleObjects$Array");
        Class<? extends Object> term230186 = Class.forName((String) "java.util.stream.ForEachOps");
        Class<? extends Object> term230190 = Class.forName((String) "java.util.ArrayPrefixHelpers$LongCumulateTask");
        Class<? extends Object> term230193 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator");
        Class<? extends Object> term230197 = Class.forName((String) "java.util.jar.JarFile$1");
        Class<? extends Object> term230201 = Class.forName((String) "java.util.Spliterator$OfInt");
        Class<? extends Object> term230207 = Class.forName((String) "com.fasterxml.jackson.databind.DatabindContext");
        Class<? extends Object> term230212 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler");
        Class<? extends Object> term230216 = Class.forName((String) "java.util.stream.Collectors$Partition$1");
        Class<? extends Object> term230220 = Class.forName((String) "java.nio.channels.CompletionHandler");
        Class<? extends Object> term230224 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfPrimitive");
        Class<? extends Object> term230228 = Class.forName((String) "java.util.MissingFormatWidthException");
        Class<? extends Object> term230232 = Class.forName((String) "java.util.jar.JarFile$JarFileEntry");
        Class<? extends Object> term230235 = Class.forName((String) "kex.java.util.HashMap$Values");
        Class<? extends Object> term230238 = Class.forName((String) "java.lang.invoke.ConstantBootstraps");
        Class<? extends Object> term230242 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeId");
        Class<? extends Object> term230246 = Class.forName((String) "java.lang.invoke.VarHandleLongs$FieldStaticReadOnly");
        Class<? extends Object> term230249 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonNaming");
        Class<? extends Object> term230253 = Class.forName((String) "java.lang.invoke.BootstrapMethodInvoker");
        term230110 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term230111 = (Object[]) newArray("java.lang.Object", 5);
        short[] term230112 = (short[]) newShortArray(32);
        int[] term230145 = (int[]) newIntArray(32);
        Object[] term230178 = (Object[]) newArray("java.lang.Object", 32);
        long[] term230257 = (long[]) newLongArray(32);
        Object[] term230375 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term230377 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term230110, term230110.getClass(), "_path", null);
        setField(term230110, term230110.getClass(), "_processor", null);
        setField(term230110, term230110.getClass(), "_location", null);
        setShortElement(term230112, 0, (short) 30);
        setShortElement(term230112, 1, (short) 3);
        setShortElement(term230112, 5, (short) 27);
        setShortElement(term230112, 6, (short) 2);
        setShortElement(term230112, 7, (short) 3);
        setShortElement(term230112, 11, (short) 2);
        setShortElement(term230112, 12, (short) 4);
        setShortElement(term230112, 13, (short) 4);
        setShortElement(term230112, 14, (short) 3);
        setShortElement(term230112, 15, (short) 4);
        setShortElement(term230112, 16, (short) 4);
        setShortElement(term230112, 17, (short) 1);
        setShortElement(term230112, 18, (short) 2);
        setShortElement(term230112, 19, (short) 3);
        setShortElement(term230112, 20, (short) 3);
        setShortElement(term230112, 21, (short) 13);
        setShortElement(term230112, 22, (short) 1);
        setShortElement(term230112, 23, (short) 2);
        setShortElement(term230112, 24, (short) 12);
        setElement(term230111, 0, term230112);
        setIntElement(term230145, 0, 57016320);
        setIntElement(term230145, 2, 6553600);
        setIntElement(term230145, 3, 393216);
        setIntElement(term230145, 4, 3866630);
        setIntElement(term230145, 5, 1245184);
        setIntElement(term230145, 6, 2424832);
        setIntElement(term230145, 8, 6553600);
        setIntElement(term230145, 9, 393216);
        setIntElement(term230145, 10, 3866630);
        setIntElement(term230145, 11, 14352384);
        setIntElement(term230145, 12, 10354688);
        setIntElement(term230145, 13, 2883584);
        setIntElement(term230145, 14, 786432);
        setIntElement(term230145, 15, 1441792);
        setIntElement(term230145, 16, 7733248);
        setIntElement(term230145, 17, 20774912);
        setIntElement(term230145, 18, 262144);
        setIntElement(term230145, 19, 2555904);
        setIntElement(term230145, 20, 1835008);
        setIntElement(term230145, 21, 6029312);
        setIntElement(term230145, 22, 327680);
        setIntElement(term230145, 23, 1638400);
        setIntElement(term230145, 24, 720907);
        setElement(term230111, 1, term230145);
        setElement(term230178, 0, term230179);
        setElement(term230178, 1, term230186);
        setElement(term230178, 2, term230186);
        setElement(term230178, 3, term230190);
        setElement(term230178, 4, term230193);
        setElement(term230178, 5, term230197);
        setElement(term230178, 6, term230201);
        setElement(term230178, 7, term230186);
        setElement(term230178, 8, term230186);
        setElement(term230178, 9, term230190);
        setElement(term230178, 10, term230193);
        setElement(term230178, 11, term230207);
        setElement(term230178, 12, term230212);
        setElement(term230178, 13, term230216);
        setElement(term230178, 14, term230220);
        setElement(term230178, 15, term230224);
        setElement(term230178, 16, term230216);
        setElement(term230178, 17, term230228);
        setElement(term230178, 18, term230232);
        setElement(term230178, 19, term230235);
        setElement(term230178, 20, term230238);
        setElement(term230178, 21, term230242);
        setElement(term230178, 22, term230246);
        setElement(term230178, 23, term230249);
        setElement(term230178, 24, term230253);
        setElement(term230111, 2, term230178);
        setLongElement(term230257, 0, 132578329177248L);
        setLongElement(term230257, 1, 34364798256L);
        setLongElement(term230257, 2, 34363739368L);
        setLongElement(term230257, 3, 34363739368L);
        setLongElement(term230257, 4, 34363739368L);
        setLongElement(term230257, 5, 132578328998496L);
        setLongElement(term230257, 6, 34363820048L);
        setLongElement(term230257, 7, 34364798256L);
        setLongElement(term230257, 8, 34363739368L);
        setLongElement(term230257, 9, 34363739368L);
        setLongElement(term230257, 10, 34363739368L);
        setLongElement(term230257, 11, 132582552571296L);
        setLongElement(term230257, 12, 132582552640272L);
        setLongElement(term230257, 13, 132582550089488L);
        setLongElement(term230257, 14, 132582552759024L);
        setLongElement(term230257, 15, 132582550089488L);
        setLongElement(term230257, 16, 132582550089488L);
        setLongElement(term230257, 17, 34363745472L);
        setLongElement(term230257, 18, 34364710216L);
        setLongElement(term230257, 19, 34363745472L);
        setLongElement(term230257, 20, 34363745472L);
        setLongElement(term230257, 21, 34364896224L);
        setLongElement(term230257, 22, 34363745472L);
        setLongElement(term230257, 23, 34363745472L);
        setLongElement(term230257, 24, 34363745472L);
        setElement(term230111, 3, term230257);
        setField(term230110, term230110.getClass(), "backtrace", term230111);
        setField(term230110, term230110.getClass(), "detailMessage", "Unexpected IOException (of type java.nio.channels.ClosedByInterruptException): null");
        setField(term230110, term230110.getClass(), "cause", term230110);
        setField(term230110, term230110.getClass(), "stackTrace", term230375);
        setIntField(term230110, term230110.getClass(), "depth", 25);
        setIntField(term230377, term230377.getClass(), "modCount", 0);
        setField(term230110, term230110.getClass(), "suppressedExceptions", term230377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term223674;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term223674, term230467));
        assertTrue(recursiveEquals(retValue, term230110));
    }

};


