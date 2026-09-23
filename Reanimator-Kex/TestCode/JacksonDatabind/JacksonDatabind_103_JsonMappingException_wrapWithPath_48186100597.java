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

public class JsonMappingException_wrapWithPath_48186100597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207959;
     Object term208626;
     Object term208414;

    public JsonMappingException_wrapWithPath_48186100597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207959 = newInstance(Class.forName("java.lang.Throwable"));
        term208626 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term208626, term208626.getClass(), "backtrace", null);
        setField(term208626, term208626.getClass(), "detailMessage", null);
        setField(term208626, term208626.getClass(), "cause", null);
        setField(term208626, term208626.getClass(), "stackTrace", null);
        setIntField(term208626, term208626.getClass(), "depth", 0);
        setField(term208626, term208626.getClass(), "suppressedExceptions", null);
        LinkedList term208415 = new LinkedList();
        ((LinkedList) term208415).add((Object)null);
        Class<? extends Object> term208487 = Class.forName((String) "java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread$1");
        Class<? extends Object> term208494 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        Class<? extends Object> term208497 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        Class<? extends Object> term208499 = Class.forName((String) "java.lang.invoke.Invokers$Lazy");
        Class<? extends Object> term208503 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.PropertyValue$Regular");
        Class<? extends Object> term208507 = Class.forName((String) "java.lang.ProcessImpl$DeferredCloseInputStream");
        Class<? extends Object> term208513 = Class.forName((String) "java.lang.StringUTF16$CharsSpliterator");
        Class<? extends Object> term208518 = Class.forName((String) "java.lang.invoke.CallSite");
        Class<? extends Object> term208522 = Class.forName((String) "com.fasterxml.jackson.databind.SequenceWriter");
        Class<? extends Object> term208526 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Class<? extends Object> term208530 = Class.forName((String) "java.util.stream.ForEachOps$ForEachTask");
        Class<? extends Object> term208534 = Class.forName((String) "java.util.concurrent.CompletableFuture$Completion");
        Class<? extends Object> term208538 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1");
        Class<? extends Object> term208541 = Class.forName((String) "java.util.zip.ZipCoder");
        Class<? extends Object> term208544 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy");
        Class<? extends Object> term208548 = Class.forName((String) "kex.java.util.ArrayList");
        Class<? extends Object> term208551 = Class.forName((String) "java.util.stream.Sink$OfLong");
        Class<? extends Object> term208554 = Class.forName((String) "java.util.stream.IntPipeline$3");
        Class<? extends Object> term208558 = Class.forName((String) "java.util.HashMap$TreeNode");
        term208414 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term208419 = (Object[]) newArray("java.lang.Object", 5);
        short[] term208420 = (short[]) newShortArray(32);
        int[] term208453 = (int[]) newIntArray(32);
        Object[] term208486 = (Object[]) newArray("java.lang.Object", 32);
        long[] term208562 = (long[]) newLongArray(32);
        Object term208409 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term208622 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term208624 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term208414, term208414.getClass(), "_path", term208415);
        setField(term208414, term208414.getClass(), "_processor", null);
        setField(term208414, term208414.getClass(), "_location", null);
        setShortElement(term208420, 0, (short) 30);
        setShortElement(term208420, 1, (short) 3);
        setShortElement(term208420, 5, (short) 33);
        setShortElement(term208420, 6, (short) 2);
        setShortElement(term208420, 7, (short) 3);
        setShortElement(term208420, 11, (short) 2);
        setShortElement(term208420, 12, (short) 4);
        setShortElement(term208420, 13, (short) 4);
        setShortElement(term208420, 14, (short) 3);
        setShortElement(term208420, 15, (short) 4);
        setShortElement(term208420, 16, (short) 4);
        setShortElement(term208420, 17, (short) 1);
        setShortElement(term208420, 18, (short) 2);
        setShortElement(term208420, 19, (short) 3);
        setShortElement(term208420, 20, (short) 3);
        setShortElement(term208420, 21, (short) 13);
        setShortElement(term208420, 22, (short) 1);
        setShortElement(term208420, 23, (short) 2);
        setShortElement(term208420, 24, (short) 12);
        setElement(term208419, 0, term208420);
        setIntElement(term208453, 0, 128385024);
        setIntElement(term208453, 2, 6553600);
        setIntElement(term208453, 3, 393216);
        setIntElement(term208453, 4, 3866630);
        setIntElement(term208453, 5, 1245184);
        setIntElement(term208453, 6, 3211264);
        setIntElement(term208453, 8, 6553600);
        setIntElement(term208453, 9, 393216);
        setIntElement(term208453, 10, 3866630);
        setIntElement(term208453, 11, 14352384);
        setIntElement(term208453, 12, 10354688);
        setIntElement(term208453, 13, 2883584);
        setIntElement(term208453, 14, 786432);
        setIntElement(term208453, 15, 1441792);
        setIntElement(term208453, 16, 7733248);
        setIntElement(term208453, 17, 20774912);
        setIntElement(term208453, 18, 262144);
        setIntElement(term208453, 19, 2555904);
        setIntElement(term208453, 20, 1835008);
        setIntElement(term208453, 21, 6029312);
        setIntElement(term208453, 22, 327680);
        setIntElement(term208453, 23, 1638400);
        setIntElement(term208453, 24, 720907);
        setElement(term208419, 1, term208453);
        setElement(term208486, 0, term208487);
        setElement(term208486, 1, term208494);
        setElement(term208486, 2, term208494);
        setElement(term208486, 3, term208497);
        setElement(term208486, 4, term208499);
        setElement(term208486, 5, term208503);
        setElement(term208486, 6, term208507);
        setElement(term208486, 7, term208494);
        setElement(term208486, 8, term208494);
        setElement(term208486, 9, term208497);
        setElement(term208486, 10, term208499);
        setElement(term208486, 11, term208513);
        setElement(term208486, 12, term208518);
        setElement(term208486, 13, term208522);
        setElement(term208486, 14, term208526);
        setElement(term208486, 15, term208530);
        setElement(term208486, 16, term208522);
        setElement(term208486, 17, term208534);
        setElement(term208486, 18, term208538);
        setElement(term208486, 19, term208541);
        setElement(term208486, 20, term208544);
        setElement(term208486, 21, term208548);
        setElement(term208486, 22, term208551);
        setElement(term208486, 23, term208554);
        setElement(term208486, 24, term208558);
        setElement(term208419, 2, term208486);
        setLongElement(term208562, 0, 132073604125776L);
        setLongElement(term208562, 1, 34364798256L);
        setLongElement(term208562, 2, 34363739368L);
        setLongElement(term208562, 3, 34363739368L);
        setLongElement(term208562, 4, 34363739368L);
        setLongElement(term208562, 5, 132073603951184L);
        setLongElement(term208562, 6, 34363820048L);
        setLongElement(term208562, 7, 34364798256L);
        setLongElement(term208562, 8, 34363739368L);
        setLongElement(term208562, 9, 34363739368L);
        setLongElement(term208562, 10, 34363739368L);
        setLongElement(term208562, 11, 132077283560208L);
        setLongElement(term208562, 12, 132077283629184L);
        setLongElement(term208562, 13, 132077281112816L);
        setLongElement(term208562, 14, 132077283747392L);
        setLongElement(term208562, 15, 132077281112816L);
        setLongElement(term208562, 16, 132077281112816L);
        setLongElement(term208562, 17, 34363745472L);
        setLongElement(term208562, 18, 34364710216L);
        setLongElement(term208562, 19, 34363745472L);
        setLongElement(term208562, 20, 34363745472L);
        setLongElement(term208562, 21, 34364896224L);
        setLongElement(term208562, 22, 34363745472L);
        setLongElement(term208562, 23, 34363745472L);
        setLongElement(term208562, 24, 34363745472L);
        setElement(term208419, 3, term208562);
        setField(term208414, term208414.getClass(), "backtrace", term208419);
        setField(term208414, term208414.getClass(), "detailMessage", "(was java.lang.Throwable)");
        setField(term208409, term208409.getClass(), "backtrace", null);
        setField(term208409, term208409.getClass(), "detailMessage", null);
        setField(term208409, term208409.getClass(), "cause", null);
        setField(term208409, term208409.getClass(), "stackTrace", null);
        setIntField(term208409, term208409.getClass(), "depth", 0);
        setField(term208409, term208409.getClass(), "suppressedExceptions", null);
        setField(term208414, term208414.getClass(), "cause", term208409);
        setField(term208414, term208414.getClass(), "stackTrace", term208622);
        setIntField(term208414, term208414.getClass(), "depth", 25);
        setIntField(term208624, term208624.getClass(), "modCount", 0);
        setField(term208414, term208414.getClass(), "suppressedExceptions", term208624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term207959;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term207959, term208626));
        assertTrue(recursiveEquals(retValue, term208414));
    }

};


