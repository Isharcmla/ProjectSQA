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

public class JsonMappingException_fromUnexpectedIOE_829399656135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268449;
     Object term269051;
     Object term268631;

    public JsonMappingException_fromUnexpectedIOE_829399656135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term268503 = new LinkedList();
        term268449 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term268449, term268449.getClass(), "_location", null);
        setField(term268449, term268449.getClass(), "_path", term268503);
        LinkedList term269052 = new LinkedList();
        term269051 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term269051, term269051.getClass(), "_path", term269052);
        setField(term269051, term269051.getClass(), "_processor", null);
        setField(term269051, term269051.getClass(), "_location", null);
        setField(term269051, term269051.getClass(), "backtrace", null);
        setField(term269051, term269051.getClass(), "detailMessage", null);
        setField(term269051, term269051.getClass(), "cause", null);
        setField(term269051, term269051.getClass(), "stackTrace", null);
        setIntField(term269051, term269051.getClass(), "depth", 0);
        setField(term269051, term269051.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term268700 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer");
        Class<? extends Object> term268707 = Class.forName((String) "java.util.Spliterators$2Adapter");
        Class<? extends Object> term268710 = Class.forName((String) "java.util.Formatter$Conversion");
        Class<? extends Object> term268712 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term268716 = Class.forName((String) "java.lang.reflect.AnnotatedWildcardType");
        Class<? extends Object> term268720 = Class.forName((String) "java.io.InputStreamReader");
        Class<? extends Object> term268726 = Class.forName((String) "java.util.function.DoublePredicate");
        Class<? extends Object> term268731 = Class.forName((String) "java.util.stream.IntPipeline$10$1");
        Class<? extends Object> term268735 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque$DescendingItr");
        Class<? extends Object> term268739 = Class.forName((String) "java.util.zip.Adler32");
        Class<? extends Object> term268743 = Class.forName((String) "com.fasterxml.jackson.core.PrettyPrinter");
        Class<? extends Object> term268747 = Class.forName((String) "java.lang.StackOverflowError");
        Class<? extends Object> term268751 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList$COWSubList");
        Class<? extends Object> term268754 = Class.forName((String) "com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<? extends Object> term268757 = Class.forName((String) "java.math.BigDecimal");
        Class<? extends Object> term268761 = Class.forName((String) "java.util.concurrent.locks.ReadWriteLock");
        Class<? extends Object> term268764 = Class.forName((String) "java.lang.ref.ReferenceQueue$Lock");
        Class<? extends Object> term268767 = Class.forName((String) "java.util.Collections$EmptyListIterator");
        Class<? extends Object> term268771 = Class.forName((String) "java.lang.Module");
        term268631 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term268632 = (Object[]) newArray("java.lang.Object", 5);
        short[] term268633 = (short[]) newShortArray(32);
        int[] term268666 = (int[]) newIntArray(32);
        Object[] term268699 = (Object[]) newArray("java.lang.Object", 32);
        long[] term268775 = (long[]) newLongArray(32);
        Object[] term268927 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term268929 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term268631, term268631.getClass(), "_path", null);
        setField(term268631, term268631.getClass(), "_processor", null);
        setField(term268631, term268631.getClass(), "_location", null);
        setShortElement(term268633, 0, (short) 27);
        setShortElement(term268633, 1, (short) 3);
        setShortElement(term268633, 5, (short) 33);
        setShortElement(term268633, 6, (short) 2);
        setShortElement(term268633, 7, (short) 3);
        setShortElement(term268633, 11, (short) 2);
        setShortElement(term268633, 12, (short) 4);
        setShortElement(term268633, 13, (short) 4);
        setShortElement(term268633, 14, (short) 3);
        setShortElement(term268633, 15, (short) 4);
        setShortElement(term268633, 16, (short) 4);
        setShortElement(term268633, 17, (short) 1);
        setShortElement(term268633, 18, (short) 2);
        setShortElement(term268633, 19, (short) 3);
        setShortElement(term268633, 20, (short) 3);
        setShortElement(term268633, 21, (short) 13);
        setShortElement(term268633, 22, (short) 1);
        setShortElement(term268633, 23, (short) 2);
        setShortElement(term268633, 24, (short) 12);
        setElement(term268632, 0, term268633);
        setIntElement(term268666, 0, 57016320);
        setIntElement(term268666, 2, 6553600);
        setIntElement(term268666, 3, 393216);
        setIntElement(term268666, 4, 3866630);
        setIntElement(term268666, 5, 1245184);
        setIntElement(term268666, 6, 2424832);
        setIntElement(term268666, 8, 6553600);
        setIntElement(term268666, 9, 393216);
        setIntElement(term268666, 10, 3866630);
        setIntElement(term268666, 11, 14352384);
        setIntElement(term268666, 12, 10354688);
        setIntElement(term268666, 13, 2883584);
        setIntElement(term268666, 14, 786432);
        setIntElement(term268666, 15, 1441792);
        setIntElement(term268666, 16, 7733248);
        setIntElement(term268666, 17, 20774912);
        setIntElement(term268666, 18, 262144);
        setIntElement(term268666, 19, 2555904);
        setIntElement(term268666, 20, 1835008);
        setIntElement(term268666, 21, 6029312);
        setIntElement(term268666, 22, 327680);
        setIntElement(term268666, 23, 1638400);
        setIntElement(term268666, 24, 720907);
        setElement(term268632, 1, term268666);
        setElement(term268699, 0, term268700);
        setElement(term268699, 1, term268707);
        setElement(term268699, 2, term268707);
        setElement(term268699, 3, term268710);
        setElement(term268699, 4, term268712);
        setElement(term268699, 5, term268716);
        setElement(term268699, 6, term268720);
        setElement(term268699, 7, term268707);
        setElement(term268699, 8, term268707);
        setElement(term268699, 9, term268710);
        setElement(term268699, 10, term268712);
        setElement(term268699, 11, term268726);
        setElement(term268699, 12, term268731);
        setElement(term268699, 13, term268735);
        setElement(term268699, 14, term268739);
        setElement(term268699, 15, term268743);
        setElement(term268699, 16, term268735);
        setElement(term268699, 17, term268747);
        setElement(term268699, 18, term268751);
        setElement(term268699, 19, term268754);
        setElement(term268699, 20, term268757);
        setElement(term268699, 21, term268761);
        setElement(term268699, 22, term268764);
        setElement(term268699, 23, term268767);
        setElement(term268699, 24, term268771);
        setElement(term268632, 2, term268699);
        setLongElement(term268775, 0, 132073604125296L);
        setLongElement(term268775, 1, 34364798256L);
        setLongElement(term268775, 2, 34363739368L);
        setLongElement(term268775, 3, 34363739368L);
        setLongElement(term268775, 4, 34363739368L);
        setLongElement(term268775, 5, 132073603951184L);
        setLongElement(term268775, 6, 34363820048L);
        setLongElement(term268775, 7, 34364798256L);
        setLongElement(term268775, 8, 34363739368L);
        setLongElement(term268775, 9, 34363739368L);
        setLongElement(term268775, 10, 34363739368L);
        setLongElement(term268775, 11, 132077283560208L);
        setLongElement(term268775, 12, 132077283629184L);
        setLongElement(term268775, 13, 132077281112816L);
        setLongElement(term268775, 14, 132077283747392L);
        setLongElement(term268775, 15, 132077281112816L);
        setLongElement(term268775, 16, 132077281112816L);
        setLongElement(term268775, 17, 34363745472L);
        setLongElement(term268775, 18, 34364710216L);
        setLongElement(term268775, 19, 34363745472L);
        setLongElement(term268775, 20, 34363745472L);
        setLongElement(term268775, 21, 34364896224L);
        setLongElement(term268775, 22, 34363745472L);
        setLongElement(term268775, 23, 34363745472L);
        setLongElement(term268775, 24, 34363745472L);
        setElement(term268632, 3, term268775);
        setField(term268631, term268631.getClass(), "backtrace", term268632);
        setField(term268631, term268631.getClass(), "detailMessage", "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): N/A (through reference chain: )");
        setField(term268631, term268631.getClass(), "cause", term268631);
        setField(term268631, term268631.getClass(), "stackTrace", term268927);
        setIntField(term268631, term268631.getClass(), "depth", 25);
        setIntField(term268929, term268929.getClass(), "modCount", 0);
        setField(term268631, term268631.getClass(), "suppressedExceptions", term268929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term268449;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term268449, term269051));
        assertTrue(recursiveEquals(retValue, term268631));
    }

};


