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

public class JsonMappingException_wrapWithPath_481861005370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580627;
     Object term581202;
     Object term580946;

    public JsonMappingException_wrapWithPath_481861005370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580627 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        term581202 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        setField(term581202, term581202.getClass(), "backtrace", null);
        setField(term581202, term581202.getClass(), "detailMessage", null);
        setField(term581202, term581202.getClass(), "cause", null);
        setField(term581202, term581202.getClass(), "stackTrace", null);
        setIntField(term581202, term581202.getClass(), "depth", 0);
        setField(term581202, term581202.getClass(), "suppressedExceptions", null);
        LinkedList term580947 = new LinkedList();
        ((LinkedList) term580947).add((Object)null);
        Class<? extends Object> term581019 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl");
        Class<? extends Object> term581026 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer");
        Class<? extends Object> term581039 = Class.forName((String) "java.lang.Long$LongCache");
        Class<? extends Object> term581043 = Class.forName((String) "java.nio.file.FileTreeWalker");
        Class<? extends Object> term581047 = Class.forName((String) "java.util.TreeSet");
        Class<? extends Object> term581051 = Class.forName((String) "java.util.zip.ZipFile$ZipFileInputStream");
        Class<? extends Object> term581057 = Class.forName((String) "kex.java.util.LinkedList");
        Class<? extends Object> term581060 = Class.forName((String) "java.util.TreeMap$ValueIterator");
        Class<? extends Object> term581065 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfRef");
        Class<? extends Object> term581069 = Class.forName((String) "java.util.stream.Nodes$IntSpinedNodeBuilder");
        Class<? extends Object> term581073 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectReader");
        Class<? extends Object> term581077 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldStaticReadWrite");
        Class<? extends Object> term581081 = Class.forName((String) "java.nio.IntBuffer");
        Class<? extends Object> term581085 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsLongs$ByteBufferHandle");
        Class<? extends Object> term581088 = Class.forName((String) "java.util.function.LongPredicate");
        Class<? extends Object> term581091 = Class.forName((String) "com.fasterxml.jackson.databind.util.RawValue");
        Class<? extends Object> term581095 = Class.forName((String) "java.lang.ThreadGroup");
        Class<? extends Object> term581099 = Class.forName((String) "java.util.ResourceBundle$CacheKeyReference");
        Class<? extends Object> term581102 = Class.forName((String) "java.util.concurrent.SynchronousQueue");
        Class<? extends Object> term581106 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.TypeResolutionContext");
        term580946 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term580951 = (Object[]) newArray("java.lang.Object", 5);
        short[] term580952 = (short[]) newShortArray(32);
        int[] term580985 = (int[]) newIntArray(32);
        Object[] term581018 = (Object[]) newArray("java.lang.Object", 32);
        long[] term581110 = (long[]) newLongArray(32);
        Object term580941 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        Object[] term581198 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term581200 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term580946, term580946.getClass(), "_path", term580947);
        setField(term580946, term580946.getClass(), "_processor", null);
        setField(term580946, term580946.getClass(), "_location", null);
        setShortElement(term580952, 0, (short) 20);
        setShortElement(term580952, 4, (short) 27);
        setShortElement(term580952, 5, (short) 2);
        setShortElement(term580952, 6, (short) 3);
        setShortElement(term580952, 10, (short) 2);
        setShortElement(term580952, 11, (short) 4);
        setShortElement(term580952, 12, (short) 4);
        setShortElement(term580952, 13, (short) 3);
        setShortElement(term580952, 14, (short) 4);
        setShortElement(term580952, 15, (short) 4);
        setShortElement(term580952, 16, (short) 1);
        setShortElement(term580952, 17, (short) 2);
        setShortElement(term580952, 18, (short) 3);
        setShortElement(term580952, 19, (short) 3);
        setShortElement(term580952, 20, (short) 13);
        setShortElement(term580952, 21, (short) 1);
        setShortElement(term580952, 22, (short) 2);
        setShortElement(term580952, 23, (short) 12);
        setElement(term580951, 0, term580952);
        setIntElement(term580985, 0, 128385024);
        setIntElement(term580985, 1, 2097152);
        setIntElement(term580985, 2, 393216);
        setIntElement(term580985, 3, 3866630);
        setIntElement(term580985, 4, 1245184);
        setIntElement(term580985, 5, 3211264);
        setIntElement(term580985, 7, 6553600);
        setIntElement(term580985, 8, 393216);
        setIntElement(term580985, 9, 3866630);
        setIntElement(term580985, 10, 14352384);
        setIntElement(term580985, 11, 10354688);
        setIntElement(term580985, 12, 2883584);
        setIntElement(term580985, 13, 786432);
        setIntElement(term580985, 14, 1441792);
        setIntElement(term580985, 15, 7733248);
        setIntElement(term580985, 16, 20774912);
        setIntElement(term580985, 17, 262144);
        setIntElement(term580985, 18, 2555904);
        setIntElement(term580985, 19, 1835008);
        setIntElement(term580985, 20, 6029312);
        setIntElement(term580985, 21, 327680);
        setIntElement(term580985, 22, 1638400);
        setIntElement(term580985, 23, 720907);
        setElement(term580951, 1, term580985);
        setElement(term581018, 0, term581019);
        setElement(term581018, 1, term581026);
        setElement(term581018, 2, term581039);
        setElement(term581018, 3, term581043);
        setElement(term581018, 4, term581047);
        setElement(term581018, 5, term581051);
        setElement(term581018, 6, term581057);
        setElement(term581018, 7, term581057);
        setElement(term581018, 8, term581039);
        setElement(term581018, 9, term581043);
        setElement(term581018, 10, term581060);
        setElement(term581018, 11, term581065);
        setElement(term581018, 12, term581069);
        setElement(term581018, 13, term581073);
        setElement(term581018, 14, term581077);
        setElement(term581018, 15, term581069);
        setElement(term581018, 16, term581081);
        setElement(term581018, 17, term581085);
        setElement(term581018, 18, term581088);
        setElement(term581018, 19, term581091);
        setElement(term581018, 20, term581095);
        setElement(term581018, 21, term581099);
        setElement(term581018, 22, term581102);
        setElement(term581018, 23, term581106);
        setElement(term580951, 2, term581018);
        setLongElement(term581110, 0, 132578328546864L);
        setLongElement(term581110, 1, 34363739368L);
        setLongElement(term581110, 2, 34363739368L);
        setLongElement(term581110, 3, 34363739368L);
        setLongElement(term581110, 4, 132578328998496L);
        setLongElement(term581110, 5, 34363820048L);
        setLongElement(term581110, 6, 34364798256L);
        setLongElement(term581110, 7, 34363739368L);
        setLongElement(term581110, 8, 34363739368L);
        setLongElement(term581110, 9, 34363739368L);
        setLongElement(term581110, 10, 132582552571296L);
        setLongElement(term581110, 11, 132582552640272L);
        setLongElement(term581110, 12, 132582550089488L);
        setLongElement(term581110, 13, 132582552759024L);
        setLongElement(term581110, 14, 132582550089488L);
        setLongElement(term581110, 15, 132582550089488L);
        setLongElement(term581110, 16, 34363745472L);
        setLongElement(term581110, 17, 34364710216L);
        setLongElement(term581110, 18, 34363745472L);
        setLongElement(term581110, 19, 34363745472L);
        setLongElement(term581110, 20, 34364896224L);
        setLongElement(term581110, 21, 34363745472L);
        setLongElement(term581110, 22, 34363745472L);
        setLongElement(term581110, 23, 34363745472L);
        setElement(term580951, 3, term581110);
        setField(term580946, term580946.getClass(), "backtrace", term580951);
        setField(term580946, term580946.getClass(), "detailMessage", "(was java.util.concurrent.RejectedExecutionException)");
        setField(term580941, term580941.getClass(), "backtrace", null);
        setField(term580941, term580941.getClass(), "detailMessage", null);
        setField(term580941, term580941.getClass(), "cause", null);
        setField(term580941, term580941.getClass(), "stackTrace", null);
        setIntField(term580941, term580941.getClass(), "depth", 0);
        setField(term580941, term580941.getClass(), "suppressedExceptions", null);
        setField(term580946, term580946.getClass(), "cause", term580941);
        setField(term580946, term580946.getClass(), "stackTrace", term581198);
        setIntField(term580946, term580946.getClass(), "depth", 24);
        setIntField(term581200, term581200.getClass(), "modCount", 0);
        setField(term580946, term580946.getClass(), "suppressedExceptions", term581200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term580627;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term580627, term581202));
        assertTrue(recursiveEquals(retValue, term580946));
    }

};


