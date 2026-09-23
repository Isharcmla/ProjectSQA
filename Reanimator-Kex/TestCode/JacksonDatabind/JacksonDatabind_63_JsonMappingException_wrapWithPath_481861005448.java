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

public class JsonMappingException_wrapWithPath_481861005448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691225;
     Object term691684;
     Object term691467;

    public JsonMappingException_wrapWithPath_481861005448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691225 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        term691684 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        setField(term691684, term691684.getClass(), "flags", null);
        setField(term691684, term691684.getClass(), "backtrace", null);
        setField(term691684, term691684.getClass(), "detailMessage", null);
        setField(term691684, term691684.getClass(), "cause", null);
        setField(term691684, term691684.getClass(), "stackTrace", null);
        setIntField(term691684, term691684.getClass(), "depth", 0);
        setField(term691684, term691684.getClass(), "suppressedExceptions", null);
        LinkedList term691468 = new LinkedList();
        ((LinkedList) term691468).add((Object)null);
        Class<? extends Object> term691540 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor$Base");
        Class<? extends Object> term691547 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term691560 = Class.forName((String) "java.util.function.DoubleConsumer");
        Class<? extends Object> term691564 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntryIterator");
        Class<? extends Object> term691568 = Class.forName((String) "java.lang.ref.WeakReference");
        Class<? extends Object> term691572 = Class.forName((String) "java.util.EnumMap$EnumMapIterator");
        Class<? extends Object> term691578 = Class.forName((String) "kex.java.util.Arrays");
        Class<? extends Object> term691581 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter");
        Class<? extends Object> term691586 = Class.forName((String) "java.nio.file.Files");
        Class<? extends Object> term691590 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer");
        Class<? extends Object> term691594 = Class.forName((String) "java.lang.reflect.ProxyGenerator$MethodInfo");
        Class<? extends Object> term691598 = Class.forName((String) "java.lang.Void");
        Class<? extends Object> term691602 = Class.forName((String) "java.util.regex.Pattern$End");
        Class<? extends Object> term691606 = Class.forName((String) "java.lang.ArrayIndexOutOfBoundsException");
        Class<? extends Object> term691609 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayIterator");
        Class<? extends Object> term691612 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term691616 = Class.forName((String) "java.nio.channels.spi.AbstractSelector");
        Class<? extends Object> term691620 = Class.forName((String) "java.nio.ByteBufferAsShortBufferRB");
        Class<? extends Object> term691623 = Class.forName((String) "java.util.zip.ZipFile$Source$End");
        Class<? extends Object> term691627 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$1");
        term691467 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term691472 = (Object[]) newArray("java.lang.Object", 5);
        short[] term691473 = (short[]) newShortArray(32);
        int[] term691506 = (int[]) newIntArray(32);
        Object[] term691539 = (Object[]) newArray("java.lang.Object", 32);
        long[] term691631 = (long[]) newLongArray(32);
        Object term691462 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        Object[] term691680 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term691682 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term691467, term691467.getClass(), "_path", term691468);
        setField(term691467, term691467.getClass(), "_processor", null);
        setField(term691467, term691467.getClass(), "_location", null);
        setShortElement(term691473, 0, (short) 20);
        setShortElement(term691473, 4, (short) 27);
        setShortElement(term691473, 5, (short) 2);
        setShortElement(term691473, 6, (short) 3);
        setShortElement(term691473, 10, (short) 2);
        setShortElement(term691473, 11, (short) 4);
        setShortElement(term691473, 12, (short) 4);
        setShortElement(term691473, 13, (short) 3);
        setShortElement(term691473, 14, (short) 4);
        setShortElement(term691473, 15, (short) 4);
        setShortElement(term691473, 16, (short) 1);
        setShortElement(term691473, 17, (short) 2);
        setShortElement(term691473, 18, (short) 3);
        setShortElement(term691473, 19, (short) 3);
        setShortElement(term691473, 20, (short) 13);
        setShortElement(term691473, 21, (short) 1);
        setShortElement(term691473, 22, (short) 2);
        setShortElement(term691473, 23, (short) 12);
        setElement(term691472, 0, term691473);
        setIntElement(term691506, 0, 128385024);
        setIntElement(term691506, 1, 2097152);
        setIntElement(term691506, 2, 393216);
        setIntElement(term691506, 3, 3866630);
        setIntElement(term691506, 4, 1245184);
        setIntElement(term691506, 5, 3211264);
        setIntElement(term691506, 7, 6553600);
        setIntElement(term691506, 8, 393216);
        setIntElement(term691506, 9, 3866630);
        setIntElement(term691506, 10, 14352384);
        setIntElement(term691506, 11, 10354688);
        setIntElement(term691506, 12, 2883584);
        setIntElement(term691506, 13, 786432);
        setIntElement(term691506, 14, 1441792);
        setIntElement(term691506, 15, 7733248);
        setIntElement(term691506, 16, 20774912);
        setIntElement(term691506, 17, 262144);
        setIntElement(term691506, 18, 2555904);
        setIntElement(term691506, 19, 1835008);
        setIntElement(term691506, 20, 6029312);
        setIntElement(term691506, 21, 327680);
        setIntElement(term691506, 22, 1638400);
        setIntElement(term691506, 23, 720907);
        setElement(term691472, 1, term691506);
        setElement(term691539, 0, term691540);
        setElement(term691539, 1, term691547);
        setElement(term691539, 2, term691560);
        setElement(term691539, 3, term691564);
        setElement(term691539, 4, term691568);
        setElement(term691539, 5, term691572);
        setElement(term691539, 6, term691578);
        setElement(term691539, 7, term691578);
        setElement(term691539, 8, term691560);
        setElement(term691539, 9, term691564);
        setElement(term691539, 10, term691581);
        setElement(term691539, 11, term691586);
        setElement(term691539, 12, term691590);
        setElement(term691539, 13, term691594);
        setElement(term691539, 14, term691598);
        setElement(term691539, 15, term691590);
        setElement(term691539, 16, term691602);
        setElement(term691539, 17, term691606);
        setElement(term691539, 18, term691609);
        setElement(term691539, 19, term691612);
        setElement(term691539, 20, term691616);
        setElement(term691539, 21, term691620);
        setElement(term691539, 22, term691623);
        setElement(term691539, 23, term691627);
        setElement(term691472, 2, term691539);
        setLongElement(term691631, 0, 132578328546864L);
        setLongElement(term691631, 1, 34363739368L);
        setLongElement(term691631, 2, 34363739368L);
        setLongElement(term691631, 3, 34363739368L);
        setLongElement(term691631, 4, 132578328998496L);
        setLongElement(term691631, 5, 34363820048L);
        setLongElement(term691631, 6, 34364798256L);
        setLongElement(term691631, 7, 34363739368L);
        setLongElement(term691631, 8, 34363739368L);
        setLongElement(term691631, 9, 34363739368L);
        setLongElement(term691631, 10, 132582552571296L);
        setLongElement(term691631, 11, 132582552640272L);
        setLongElement(term691631, 12, 132582550089488L);
        setLongElement(term691631, 13, 132582552759024L);
        setLongElement(term691631, 14, 132582550089488L);
        setLongElement(term691631, 15, 132582550089488L);
        setLongElement(term691631, 16, 34363745472L);
        setLongElement(term691631, 17, 34364710216L);
        setLongElement(term691631, 18, 34363745472L);
        setLongElement(term691631, 19, 34363745472L);
        setLongElement(term691631, 20, 34364896224L);
        setLongElement(term691631, 21, 34363745472L);
        setLongElement(term691631, 22, 34363745472L);
        setLongElement(term691631, 23, 34363745472L);
        setElement(term691472, 3, term691631);
        setField(term691467, term691467.getClass(), "backtrace", term691472);
        setField(term691467, term691467.getClass(), "detailMessage", "Flags = \'null\'");
        setField(term691462, term691462.getClass(), "flags", null);
        setField(term691462, term691462.getClass(), "backtrace", null);
        setField(term691462, term691462.getClass(), "detailMessage", null);
        setField(term691462, term691462.getClass(), "cause", null);
        setField(term691462, term691462.getClass(), "stackTrace", null);
        setIntField(term691462, term691462.getClass(), "depth", 0);
        setField(term691462, term691462.getClass(), "suppressedExceptions", null);
        setField(term691467, term691467.getClass(), "cause", term691462);
        setField(term691467, term691467.getClass(), "stackTrace", term691680);
        setIntField(term691467, term691467.getClass(), "depth", 24);
        setIntField(term691682, term691682.getClass(), "modCount", 0);
        setField(term691467, term691467.getClass(), "suppressedExceptions", term691682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term691225;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term691225, term691684));
        assertTrue(recursiveEquals(retValue, term691467));
    }

};


