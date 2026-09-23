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

public class JsonMappingException_wrapWithPath_481861005173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307000;
     Object term307789;
     Object term307566;

    public JsonMappingException_wrapWithPath_481861005173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307000 = newInstance(Class.forName("java.lang.SecurityException"));
        term307789 = newInstance(Class.forName("java.lang.SecurityException"));
        setField(term307789, term307789.getClass(), "backtrace", null);
        setField(term307789, term307789.getClass(), "detailMessage", null);
        setField(term307789, term307789.getClass(), "cause", null);
        setField(term307789, term307789.getClass(), "stackTrace", null);
        setIntField(term307789, term307789.getClass(), "depth", 0);
        setField(term307789, term307789.getClass(), "suppressedExceptions", null);
        LinkedList term307567 = new LinkedList();
        ((LinkedList) term307567).add((Object)null);
        Class<? extends Object> term307639 = Class.forName((String) "java.util.regex.ASCII");
        Class<? extends Object> term307646 = Class.forName((String) "java.util.Observable");
        Class<? extends Object> term307650 = Class.forName((String) "java.lang.RuntimePermission");
        Class<? extends Object> term307653 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Class<? extends Object> term307657 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6");
        Class<? extends Object> term307661 = Class.forName((String) "java.lang.ArithmeticException");
        Class<? extends Object> term307667 = Class.forName((String) "java.util.Formatter$Conversion");
        Class<? extends Object> term307672 = Class.forName((String) "java.util.Map");
        Class<? extends Object> term307676 = Class.forName((String) "java.util.stream.Streams$LongStreamBuilderImpl");
        Class<? extends Object> term307680 = Class.forName((String) "java.util.zip.DataFormatException");
        Class<? extends Object> term307684 = Class.forName((String) "java.lang.VerifyError");
        Class<? extends Object> term307688 = Class.forName((String) "java.nio.channels.spi.AbstractSelectableChannel");
        Class<? extends Object> term307692 = Class.forName((String) "java.util.WeakHashMap$EntrySpliterator");
        Class<? extends Object> term307695 = Class.forName((String) "java.util.concurrent.ForkJoinPool$DefaultForkJoinWorkerThreadFactory$1");
        Class<? extends Object> term307698 = Class.forName((String) "java.lang.ProcessEnvironment");
        Class<? extends Object> term307702 = Class.forName((String) "java.io.StringBufferInputStream");
        Class<? extends Object> term307706 = Class.forName((String) "java.io.ObjectStreamClass$MemberSignature");
        Class<? extends Object> term307709 = Class.forName((String) "java.nio.DirectByteBuffer$Deallocator");
        Class<? extends Object> term307713 = Class.forName((String) "java.util.Hashtable$Enumerator");
        term307566 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term307571 = (Object[]) newArray("java.lang.Object", 5);
        short[] term307572 = (short[]) newShortArray(32);
        int[] term307605 = (int[]) newIntArray(32);
        Object[] term307638 = (Object[]) newArray("java.lang.Object", 32);
        long[] term307717 = (long[]) newLongArray(32);
        Object term307561 = newInstance(Class.forName("java.lang.SecurityException"));
        Object[] term307785 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term307787 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term307566, term307566.getClass(), "_path", term307567);
        setField(term307566, term307566.getClass(), "_processor", null);
        setField(term307566, term307566.getClass(), "_location", null);
        setShortElement(term307572, 0, (short) 20);
        setShortElement(term307572, 1, (short) 3);
        setShortElement(term307572, 5, (short) 27);
        setShortElement(term307572, 6, (short) 2);
        setShortElement(term307572, 7, (short) 3);
        setShortElement(term307572, 11, (short) 2);
        setShortElement(term307572, 12, (short) 4);
        setShortElement(term307572, 13, (short) 4);
        setShortElement(term307572, 14, (short) 3);
        setShortElement(term307572, 15, (short) 4);
        setShortElement(term307572, 16, (short) 4);
        setShortElement(term307572, 17, (short) 1);
        setShortElement(term307572, 18, (short) 2);
        setShortElement(term307572, 19, (short) 3);
        setShortElement(term307572, 20, (short) 3);
        setShortElement(term307572, 21, (short) 13);
        setShortElement(term307572, 22, (short) 1);
        setShortElement(term307572, 23, (short) 2);
        setShortElement(term307572, 24, (short) 12);
        setElement(term307571, 0, term307572);
        setIntElement(term307605, 0, 128385024);
        setIntElement(term307605, 2, 6553600);
        setIntElement(term307605, 3, 393216);
        setIntElement(term307605, 4, 3866630);
        setIntElement(term307605, 5, 1245184);
        setIntElement(term307605, 6, 3211264);
        setIntElement(term307605, 8, 6553600);
        setIntElement(term307605, 9, 393216);
        setIntElement(term307605, 10, 3866630);
        setIntElement(term307605, 11, 14352384);
        setIntElement(term307605, 12, 10354688);
        setIntElement(term307605, 13, 2883584);
        setIntElement(term307605, 14, 786432);
        setIntElement(term307605, 15, 1441792);
        setIntElement(term307605, 16, 7733248);
        setIntElement(term307605, 17, 20774912);
        setIntElement(term307605, 18, 262144);
        setIntElement(term307605, 19, 2555904);
        setIntElement(term307605, 20, 1835008);
        setIntElement(term307605, 21, 6029312);
        setIntElement(term307605, 22, 327680);
        setIntElement(term307605, 23, 1638400);
        setIntElement(term307605, 24, 720907);
        setElement(term307571, 1, term307605);
        setElement(term307638, 0, term307639);
        setElement(term307638, 1, term307646);
        setElement(term307638, 2, term307646);
        setElement(term307638, 3, term307650);
        setElement(term307638, 4, term307653);
        setElement(term307638, 5, term307657);
        setElement(term307638, 6, term307661);
        setElement(term307638, 7, term307646);
        setElement(term307638, 8, term307646);
        setElement(term307638, 9, term307650);
        setElement(term307638, 10, term307653);
        setElement(term307638, 11, term307667);
        setElement(term307638, 12, term307672);
        setElement(term307638, 13, term307676);
        setElement(term307638, 14, term307680);
        setElement(term307638, 15, term307684);
        setElement(term307638, 16, term307676);
        setElement(term307638, 17, term307688);
        setElement(term307638, 18, term307692);
        setElement(term307638, 19, term307695);
        setElement(term307638, 20, term307698);
        setElement(term307638, 21, term307702);
        setElement(term307638, 22, term307706);
        setElement(term307638, 23, term307709);
        setElement(term307638, 24, term307713);
        setElement(term307571, 2, term307638);
        setLongElement(term307717, 0, 132578328546864L);
        setLongElement(term307717, 1, 34364798256L);
        setLongElement(term307717, 2, 34363739368L);
        setLongElement(term307717, 3, 34363739368L);
        setLongElement(term307717, 4, 34363739368L);
        setLongElement(term307717, 5, 132578328998496L);
        setLongElement(term307717, 6, 34363820048L);
        setLongElement(term307717, 7, 34364798256L);
        setLongElement(term307717, 8, 34363739368L);
        setLongElement(term307717, 9, 34363739368L);
        setLongElement(term307717, 10, 34363739368L);
        setLongElement(term307717, 11, 132582552571296L);
        setLongElement(term307717, 12, 132582552640272L);
        setLongElement(term307717, 13, 132582550089488L);
        setLongElement(term307717, 14, 132582552759024L);
        setLongElement(term307717, 15, 132582550089488L);
        setLongElement(term307717, 16, 132582550089488L);
        setLongElement(term307717, 17, 34363745472L);
        setLongElement(term307717, 18, 34364710216L);
        setLongElement(term307717, 19, 34363745472L);
        setLongElement(term307717, 20, 34363745472L);
        setLongElement(term307717, 21, 34364896224L);
        setLongElement(term307717, 22, 34363745472L);
        setLongElement(term307717, 23, 34363745472L);
        setLongElement(term307717, 24, 34363745472L);
        setElement(term307571, 3, term307717);
        setField(term307566, term307566.getClass(), "backtrace", term307571);
        setField(term307566, term307566.getClass(), "detailMessage", "(was java.lang.SecurityException)");
        setField(term307561, term307561.getClass(), "backtrace", null);
        setField(term307561, term307561.getClass(), "detailMessage", null);
        setField(term307561, term307561.getClass(), "cause", null);
        setField(term307561, term307561.getClass(), "stackTrace", null);
        setIntField(term307561, term307561.getClass(), "depth", 0);
        setField(term307561, term307561.getClass(), "suppressedExceptions", null);
        setField(term307566, term307566.getClass(), "cause", term307561);
        setField(term307566, term307566.getClass(), "stackTrace", term307785);
        setIntField(term307566, term307566.getClass(), "depth", 25);
        setIntField(term307787, term307787.getClass(), "modCount", 0);
        setField(term307566, term307566.getClass(), "suppressedExceptions", term307787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term307000;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term307000, term307789));
        assertTrue(recursiveEquals(retValue, term307566));
    }

};


