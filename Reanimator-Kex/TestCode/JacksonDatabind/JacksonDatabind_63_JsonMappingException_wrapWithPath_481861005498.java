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

public class JsonMappingException_wrapWithPath_481861005498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771467;
     Object term771926;
     Object term771709;

    public JsonMappingException_wrapWithPath_481861005498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771467 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        term771926 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        setField(term771926, term771926.getClass(), "flags", null);
        setField(term771926, term771926.getClass(), "backtrace", null);
        setField(term771926, term771926.getClass(), "detailMessage", null);
        setField(term771926, term771926.getClass(), "cause", null);
        setField(term771926, term771926.getClass(), "stackTrace", null);
        setIntField(term771926, term771926.getClass(), "depth", 0);
        setField(term771926, term771926.getClass(), "suppressedExceptions", null);
        LinkedList term771710 = new LinkedList();
        ((LinkedList) term771710).add((Object)null);
        Class<? extends Object> term771782 = Class.forName((String) "java.lang.Process$1");
        Class<? extends Object> term771789 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
        Class<? extends Object> term771802 = Class.forName((String) "java.lang.invoke.InnerClassLambdaMetafactory$2");
        Class<? extends Object> term771806 = Class.forName((String) "java.util.Base64$Encoder");
        Class<? extends Object> term771810 = Class.forName((String) "java.nio.file.NotDirectoryException");
        Class<? extends Object> term771814 = Class.forName((String) "java.util.AbstractList$ListItr");
        Class<? extends Object> term771820 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp");
        Class<? extends Object> term771823 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.package-info");
        Class<? extends Object> term771828 = Class.forName((String) "java.nio.DirectFloatBufferS");
        Class<? extends Object> term771832 = Class.forName((String) "com.fasterxml.jackson.core.io.CharTypes");
        Class<? extends Object> term771836 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySet");
        Class<? extends Object> term771840 = Class.forName((String) "java.nio.channels.NonReadableChannelException");
        Class<? extends Object> term771844 = Class.forName((String) "java.util.Iterator");
        Class<? extends Object> term771848 = Class.forName((String) "java.util.concurrent.CompletableFuture$Delayer$DaemonThreadFactory");
        Class<? extends Object> term771851 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer");
        Class<? extends Object> term771854 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToLongTask");
        Class<? extends Object> term771858 = Class.forName((String) "java.lang.LiveStackFrameInfo");
        Class<? extends Object> term771862 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Holder");
        Class<? extends Object> term771865 = Class.forName((String) "java.util.jar.Pack200$Unpacker");
        Class<? extends Object> term771869 = Class.forName((String) "java.util.stream.Sink$OfDouble");
        term771709 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term771714 = (Object[]) newArray("java.lang.Object", 5);
        short[] term771715 = (short[]) newShortArray(32);
        int[] term771748 = (int[]) newIntArray(32);
        Object[] term771781 = (Object[]) newArray("java.lang.Object", 32);
        long[] term771873 = (long[]) newLongArray(32);
        Object term771704 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        Object[] term771922 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term771924 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term771709, term771709.getClass(), "_path", term771710);
        setField(term771709, term771709.getClass(), "_processor", null);
        setField(term771709, term771709.getClass(), "_location", null);
        setShortElement(term771715, 0, (short) 20);
        setShortElement(term771715, 4, (short) 27);
        setShortElement(term771715, 5, (short) 2);
        setShortElement(term771715, 6, (short) 3);
        setShortElement(term771715, 10, (short) 2);
        setShortElement(term771715, 11, (short) 4);
        setShortElement(term771715, 12, (short) 4);
        setShortElement(term771715, 13, (short) 3);
        setShortElement(term771715, 14, (short) 4);
        setShortElement(term771715, 15, (short) 4);
        setShortElement(term771715, 16, (short) 1);
        setShortElement(term771715, 17, (short) 2);
        setShortElement(term771715, 18, (short) 3);
        setShortElement(term771715, 19, (short) 3);
        setShortElement(term771715, 20, (short) 13);
        setShortElement(term771715, 21, (short) 1);
        setShortElement(term771715, 22, (short) 2);
        setShortElement(term771715, 23, (short) 12);
        setElement(term771714, 0, term771715);
        setIntElement(term771748, 0, 128385024);
        setIntElement(term771748, 1, 2097152);
        setIntElement(term771748, 2, 393216);
        setIntElement(term771748, 3, 3866630);
        setIntElement(term771748, 4, 1245184);
        setIntElement(term771748, 5, 3211264);
        setIntElement(term771748, 7, 6553600);
        setIntElement(term771748, 8, 393216);
        setIntElement(term771748, 9, 3866630);
        setIntElement(term771748, 10, 14352384);
        setIntElement(term771748, 11, 10354688);
        setIntElement(term771748, 12, 2883584);
        setIntElement(term771748, 13, 786432);
        setIntElement(term771748, 14, 1441792);
        setIntElement(term771748, 15, 7733248);
        setIntElement(term771748, 16, 20774912);
        setIntElement(term771748, 17, 262144);
        setIntElement(term771748, 18, 2555904);
        setIntElement(term771748, 19, 1835008);
        setIntElement(term771748, 20, 6029312);
        setIntElement(term771748, 21, 327680);
        setIntElement(term771748, 22, 1638400);
        setIntElement(term771748, 23, 720907);
        setElement(term771714, 1, term771748);
        setElement(term771781, 0, term771782);
        setElement(term771781, 1, term771789);
        setElement(term771781, 2, term771802);
        setElement(term771781, 3, term771806);
        setElement(term771781, 4, term771810);
        setElement(term771781, 5, term771814);
        setElement(term771781, 6, term771820);
        setElement(term771781, 7, term771820);
        setElement(term771781, 8, term771802);
        setElement(term771781, 9, term771806);
        setElement(term771781, 10, term771823);
        setElement(term771781, 11, term771828);
        setElement(term771781, 12, term771832);
        setElement(term771781, 13, term771836);
        setElement(term771781, 14, term771840);
        setElement(term771781, 15, term771832);
        setElement(term771781, 16, term771844);
        setElement(term771781, 17, term771848);
        setElement(term771781, 18, term771851);
        setElement(term771781, 19, term771854);
        setElement(term771781, 20, term771858);
        setElement(term771781, 21, term771862);
        setElement(term771781, 22, term771865);
        setElement(term771781, 23, term771869);
        setElement(term771714, 2, term771781);
        setLongElement(term771873, 0, 132578328546864L);
        setLongElement(term771873, 1, 34363739368L);
        setLongElement(term771873, 2, 34363739368L);
        setLongElement(term771873, 3, 34363739368L);
        setLongElement(term771873, 4, 132578328998496L);
        setLongElement(term771873, 5, 34363820048L);
        setLongElement(term771873, 6, 34364798256L);
        setLongElement(term771873, 7, 34363739368L);
        setLongElement(term771873, 8, 34363739368L);
        setLongElement(term771873, 9, 34363739368L);
        setLongElement(term771873, 10, 132582552571296L);
        setLongElement(term771873, 11, 132582552640272L);
        setLongElement(term771873, 12, 132582550089488L);
        setLongElement(term771873, 13, 132582552759024L);
        setLongElement(term771873, 14, 132582550089488L);
        setLongElement(term771873, 15, 132582550089488L);
        setLongElement(term771873, 16, 34363745472L);
        setLongElement(term771873, 17, 34364710216L);
        setLongElement(term771873, 18, 34363745472L);
        setLongElement(term771873, 19, 34363745472L);
        setLongElement(term771873, 20, 34364896224L);
        setLongElement(term771873, 21, 34363745472L);
        setLongElement(term771873, 22, 34363745472L);
        setLongElement(term771873, 23, 34363745472L);
        setElement(term771714, 3, term771873);
        setField(term771709, term771709.getClass(), "backtrace", term771714);
        setField(term771709, term771709.getClass(), "detailMessage", "Flags = \'null\'");
        setField(term771704, term771704.getClass(), "flags", null);
        setField(term771704, term771704.getClass(), "backtrace", null);
        setField(term771704, term771704.getClass(), "detailMessage", null);
        setField(term771704, term771704.getClass(), "cause", null);
        setField(term771704, term771704.getClass(), "stackTrace", null);
        setIntField(term771704, term771704.getClass(), "depth", 0);
        setField(term771704, term771704.getClass(), "suppressedExceptions", null);
        setField(term771709, term771709.getClass(), "cause", term771704);
        setField(term771709, term771709.getClass(), "stackTrace", term771922);
        setIntField(term771709, term771709.getClass(), "depth", 24);
        setIntField(term771924, term771924.getClass(), "modCount", 0);
        setField(term771709, term771709.getClass(), "suppressedExceptions", term771924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term771467;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term771467, term771926));
        assertTrue(recursiveEquals(retValue, term771709));
    }

};


