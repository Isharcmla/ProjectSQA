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

public class JsonMappingException_from_177296842640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82612;

    public JsonMappingException_from_177296842640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82681 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat");
        Class<? extends Object> term82688 = Class.forName((String) "java.lang.ProcessHandleImpl$ExitCompletion");
        Class<? extends Object> term82691 = Class.forName((String) "java.util.concurrent.RejectedExecutionHandler");
        Class<? extends Object> term82693 = Class.forName((String) "java.nio.channels.SelectionKey");
        Class<? extends Object> term82697 = Class.forName((String) "java.util.Spliterators$LongArraySpliterator");
        Class<? extends Object> term82701 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator");
        Class<? extends Object> term82707 = Class.forName((String) "com.fasterxml.jackson.core.JsonFactory");
        Class<? extends Object> term82712 = Class.forName((String) "java.lang.invoke.ClassSpecializer$Factory$1Var");
        Class<? extends Object> term82716 = Class.forName((String) "com.fasterxml.jackson.databind.ser.PropertyBuilder$1");
        Class<? extends Object> term82720 = Class.forName((String) "java.util.TreeMap$AscendingSubMap");
        Class<? extends Object> term82724 = Class.forName((String) "java.util.stream.Sink$ChainedInt");
        Class<? extends Object> term82728 = Class.forName((String) "java.util.stream.DoublePipeline$StatelessOp");
        Class<? extends Object> term82732 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$BulkTask");
        Class<? extends Object> term82735 = Class.forName((String) "com.fasterxml.jackson.core.json.JsonWriteContext");
        Class<? extends Object> term82738 = Class.forName((String) "java.util.Collections$UnmodifiableCollection");
        Class<? extends Object> term82742 = Class.forName((String) "java.util.regex.Pattern$SliceU");
        Class<? extends Object> term82745 = Class.forName((String) "java.util.WeakHashMap$WeakHashMapSpliterator");
        Class<? extends Object> term82748 = Class.forName((String) "com.fasterxml.jackson.databind.ext.OptionalHandlerFactory");
        Class<? extends Object> term82752 = Class.forName((String) "java.util.stream.DoublePipeline$8");
        term82612 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term82613 = (Object[]) newArray("java.lang.Object", 5);
        short[] term82614 = (short[]) newShortArray(32);
        int[] term82647 = (int[]) newIntArray(32);
        Object[] term82680 = (Object[]) newArray("java.lang.Object", 32);
        long[] term82756 = (long[]) newLongArray(32);
        Object[] term82801 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term82803 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term82612, term82612.getClass(), "_path", null);
        setField(term82612, term82612.getClass(), "_processor", null);
        setField(term82612, term82612.getClass(), "_location", null);
        setShortElement(term82614, 0, (short) 14);
        setShortElement(term82614, 1, (short) 3);
        setShortElement(term82614, 5, (short) 27);
        setShortElement(term82614, 6, (short) 2);
        setShortElement(term82614, 7, (short) 3);
        setShortElement(term82614, 11, (short) 2);
        setShortElement(term82614, 12, (short) 4);
        setShortElement(term82614, 13, (short) 4);
        setShortElement(term82614, 14, (short) 3);
        setShortElement(term82614, 15, (short) 4);
        setShortElement(term82614, 16, (short) 4);
        setShortElement(term82614, 17, (short) 1);
        setShortElement(term82614, 18, (short) 2);
        setShortElement(term82614, 19, (short) 3);
        setShortElement(term82614, 20, (short) 3);
        setShortElement(term82614, 21, (short) 13);
        setShortElement(term82614, 22, (short) 1);
        setShortElement(term82614, 23, (short) 2);
        setShortElement(term82614, 24, (short) 12);
        setElement(term82613, 0, term82614);
        setIntElement(term82647, 0, 18743296);
        setIntElement(term82647, 2, 6553600);
        setIntElement(term82647, 3, 393216);
        setIntElement(term82647, 4, 3866630);
        setIntElement(term82647, 5, 1245184);
        setIntElement(term82647, 6, 3080192);
        setIntElement(term82647, 8, 6553600);
        setIntElement(term82647, 9, 393216);
        setIntElement(term82647, 10, 3866630);
        setIntElement(term82647, 11, 14352384);
        setIntElement(term82647, 12, 10354688);
        setIntElement(term82647, 13, 2883584);
        setIntElement(term82647, 14, 786432);
        setIntElement(term82647, 15, 1441792);
        setIntElement(term82647, 16, 7733248);
        setIntElement(term82647, 17, 20774912);
        setIntElement(term82647, 18, 262144);
        setIntElement(term82647, 19, 2555904);
        setIntElement(term82647, 20, 1835008);
        setIntElement(term82647, 21, 6029312);
        setIntElement(term82647, 22, 327680);
        setIntElement(term82647, 23, 1638400);
        setIntElement(term82647, 24, 720907);
        setElement(term82613, 1, term82647);
        setElement(term82680, 0, term82681);
        setElement(term82680, 1, term82688);
        setElement(term82680, 2, term82688);
        setElement(term82680, 3, term82691);
        setElement(term82680, 4, term82693);
        setElement(term82680, 5, term82697);
        setElement(term82680, 6, term82701);
        setElement(term82680, 7, term82688);
        setElement(term82680, 8, term82688);
        setElement(term82680, 9, term82691);
        setElement(term82680, 10, term82693);
        setElement(term82680, 11, term82707);
        setElement(term82680, 12, term82712);
        setElement(term82680, 13, term82716);
        setElement(term82680, 14, term82720);
        setElement(term82680, 15, term82724);
        setElement(term82680, 16, term82716);
        setElement(term82680, 17, term82728);
        setElement(term82680, 18, term82732);
        setElement(term82680, 19, term82735);
        setElement(term82680, 20, term82738);
        setElement(term82680, 21, term82742);
        setElement(term82680, 22, term82745);
        setElement(term82680, 23, term82748);
        setElement(term82680, 24, term82752);
        setElement(term82613, 2, term82680);
        setLongElement(term82756, 0, 34363800864L);
        setLongElement(term82756, 1, 34364798256L);
        setLongElement(term82756, 2, 34363739368L);
        setLongElement(term82756, 3, 34363739368L);
        setLongElement(term82756, 4, 34363739368L);
        setLongElement(term82756, 5, 132578328998496L);
        setLongElement(term82756, 6, 34363820048L);
        setLongElement(term82756, 7, 34364798256L);
        setLongElement(term82756, 8, 34363739368L);
        setLongElement(term82756, 9, 34363739368L);
        setLongElement(term82756, 10, 34363739368L);
        setLongElement(term82756, 11, 132582552571296L);
        setLongElement(term82756, 12, 132582552640272L);
        setLongElement(term82756, 13, 132582550089488L);
        setLongElement(term82756, 14, 132582552759024L);
        setLongElement(term82756, 15, 132582550089488L);
        setLongElement(term82756, 16, 132582550089488L);
        setLongElement(term82756, 17, 34363745472L);
        setLongElement(term82756, 18, 34364710216L);
        setLongElement(term82756, 19, 34363745472L);
        setLongElement(term82756, 20, 34363745472L);
        setLongElement(term82756, 21, 34364896224L);
        setLongElement(term82756, 22, 34363745472L);
        setLongElement(term82756, 23, 34363745472L);
        setLongElement(term82756, 24, 34363745472L);
        setElement(term82613, 3, term82756);
        setField(term82612, term82612.getClass(), "backtrace", term82613);
        setField(term82612, term82612.getClass(), "detailMessage", "LQFpaHEwXR");
        setField(term82612, term82612.getClass(), "cause", term82612);
        setField(term82612, term82612.getClass(), "stackTrace", term82801);
        setIntField(term82612, term82612.getClass(), "depth", 25);
        setIntField(term82803, term82803.getClass(), "modCount", 0);
        setField(term82612, term82612.getClass(), "suppressedExceptions", term82803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "LQFpaHEwXR";
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term82612));
    }

};


