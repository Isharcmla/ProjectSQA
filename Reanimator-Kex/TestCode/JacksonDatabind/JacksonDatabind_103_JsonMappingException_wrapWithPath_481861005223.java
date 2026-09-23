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

public class JsonMappingException_wrapWithPath_481861005223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419638;
     Object term420172;
     Object term419935;

    public JsonMappingException_wrapWithPath_481861005223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419638 = newInstance(Class.forName("java.nio.channels.ConnectionPendingException"));
        term420172 = newInstance(Class.forName("java.nio.channels.ConnectionPendingException"));
        setField(term420172, term420172.getClass(), "backtrace", null);
        setField(term420172, term420172.getClass(), "detailMessage", null);
        setField(term420172, term420172.getClass(), "cause", null);
        setField(term420172, term420172.getClass(), "stackTrace", null);
        setIntField(term420172, term420172.getClass(), "depth", 0);
        setField(term420172, term420172.getClass(), "suppressedExceptions", null);
        LinkedList term419936 = new LinkedList();
        ((LinkedList) term419936).add((Object)null);
        Class<? extends Object> term420008 = Class.forName((String) "com.fasterxml.jackson.core.JsonProcessingException");
        Class<? extends Object> term420015 = Class.forName((String) "java.util.Collections$UnmodifiableCollection$1");
        Class<? extends Object> term420018 = Class.forName((String) "java.lang.NoSuchFieldException");
        Class<? extends Object> term420020 = Class.forName((String) "java.lang.module.FindException");
        Class<? extends Object> term420024 = Class.forName((String) "java.util.function.ObjLongConsumer");
        Class<? extends Object> term420028 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfDouble");
        Class<? extends Object> term420034 = Class.forName((String) "java.util.Hashtable$EntrySet");
        Class<? extends Object> term420039 = Class.forName((String) "java.nio.file.FileSystems$DefaultFileSystemHolder$1");
        Class<? extends Object> term420043 = Class.forName((String) "java.lang.ref.Reference$1");
        Class<? extends Object> term420047 = Class.forName((String) "java.util.concurrent.RejectedExecutionException");
        Class<? extends Object> term420051 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntryIterator");
        Class<? extends Object> term420055 = Class.forName((String) "java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet");
        Class<? extends Object> term420059 = Class.forName((String) "java.util.concurrent.atomic.AtomicLong");
        Class<? extends Object> term420062 = Class.forName((String) "java.util.stream.LongPipeline$1$1");
        Class<? extends Object> term420065 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr");
        Class<? extends Object> term420069 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings$AsKey");
        Class<? extends Object> term420072 = Class.forName((String) "java.util.concurrent.BlockingQueue");
        Class<? extends Object> term420075 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Class<? extends Object> term420079 = Class.forName((String) "java.util.jar.JarVerifier$2");
        term419935 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term419940 = (Object[]) newArray("java.lang.Object", 5);
        short[] term419941 = (short[]) newShortArray(32);
        int[] term419974 = (int[]) newIntArray(32);
        Object[] term420007 = (Object[]) newArray("java.lang.Object", 32);
        long[] term420083 = (long[]) newLongArray(32);
        Object term419930 = newInstance(Class.forName("java.nio.channels.ConnectionPendingException"));
        Object[] term420168 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term420170 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term419935, term419935.getClass(), "_path", term419936);
        setField(term419935, term419935.getClass(), "_processor", null);
        setField(term419935, term419935.getClass(), "_location", null);
        setShortElement(term419941, 0, (short) 30);
        setShortElement(term419941, 1, (short) 3);
        setShortElement(term419941, 5, (short) 33);
        setShortElement(term419941, 6, (short) 2);
        setShortElement(term419941, 7, (short) 3);
        setShortElement(term419941, 11, (short) 2);
        setShortElement(term419941, 12, (short) 4);
        setShortElement(term419941, 13, (short) 4);
        setShortElement(term419941, 14, (short) 3);
        setShortElement(term419941, 15, (short) 4);
        setShortElement(term419941, 16, (short) 4);
        setShortElement(term419941, 17, (short) 1);
        setShortElement(term419941, 18, (short) 2);
        setShortElement(term419941, 19, (short) 3);
        setShortElement(term419941, 20, (short) 3);
        setShortElement(term419941, 21, (short) 13);
        setShortElement(term419941, 22, (short) 1);
        setShortElement(term419941, 23, (short) 2);
        setShortElement(term419941, 24, (short) 12);
        setElement(term419940, 0, term419941);
        setIntElement(term419974, 0, 128385024);
        setIntElement(term419974, 2, 6553600);
        setIntElement(term419974, 3, 393216);
        setIntElement(term419974, 4, 3866630);
        setIntElement(term419974, 5, 1245184);
        setIntElement(term419974, 6, 3211264);
        setIntElement(term419974, 8, 6553600);
        setIntElement(term419974, 9, 393216);
        setIntElement(term419974, 10, 3866630);
        setIntElement(term419974, 11, 14352384);
        setIntElement(term419974, 12, 10354688);
        setIntElement(term419974, 13, 2883584);
        setIntElement(term419974, 14, 786432);
        setIntElement(term419974, 15, 1441792);
        setIntElement(term419974, 16, 7733248);
        setIntElement(term419974, 17, 20774912);
        setIntElement(term419974, 18, 262144);
        setIntElement(term419974, 19, 2555904);
        setIntElement(term419974, 20, 1835008);
        setIntElement(term419974, 21, 6029312);
        setIntElement(term419974, 22, 327680);
        setIntElement(term419974, 23, 1638400);
        setIntElement(term419974, 24, 720907);
        setElement(term419940, 1, term419974);
        setElement(term420007, 0, term420008);
        setElement(term420007, 1, term420015);
        setElement(term420007, 2, term420015);
        setElement(term420007, 3, term420018);
        setElement(term420007, 4, term420020);
        setElement(term420007, 5, term420024);
        setElement(term420007, 6, term420028);
        setElement(term420007, 7, term420015);
        setElement(term420007, 8, term420015);
        setElement(term420007, 9, term420018);
        setElement(term420007, 10, term420020);
        setElement(term420007, 11, term420034);
        setElement(term420007, 12, term420039);
        setElement(term420007, 13, term420043);
        setElement(term420007, 14, term420047);
        setElement(term420007, 15, term420051);
        setElement(term420007, 16, term420043);
        setElement(term420007, 17, term420055);
        setElement(term420007, 18, term420059);
        setElement(term420007, 19, term420062);
        setElement(term420007, 20, term420065);
        setElement(term420007, 21, term420069);
        setElement(term420007, 22, term420072);
        setElement(term420007, 23, term420075);
        setElement(term420007, 24, term420079);
        setElement(term419940, 2, term420007);
        setLongElement(term420083, 0, 132073604125776L);
        setLongElement(term420083, 1, 34364798256L);
        setLongElement(term420083, 2, 34363739368L);
        setLongElement(term420083, 3, 34363739368L);
        setLongElement(term420083, 4, 34363739368L);
        setLongElement(term420083, 5, 132073603951184L);
        setLongElement(term420083, 6, 34363820048L);
        setLongElement(term420083, 7, 34364798256L);
        setLongElement(term420083, 8, 34363739368L);
        setLongElement(term420083, 9, 34363739368L);
        setLongElement(term420083, 10, 34363739368L);
        setLongElement(term420083, 11, 132077283560208L);
        setLongElement(term420083, 12, 132077283629184L);
        setLongElement(term420083, 13, 132077281112816L);
        setLongElement(term420083, 14, 132077283747392L);
        setLongElement(term420083, 15, 132077281112816L);
        setLongElement(term420083, 16, 132077281112816L);
        setLongElement(term420083, 17, 34363745472L);
        setLongElement(term420083, 18, 34364710216L);
        setLongElement(term420083, 19, 34363745472L);
        setLongElement(term420083, 20, 34363745472L);
        setLongElement(term420083, 21, 34364896224L);
        setLongElement(term420083, 22, 34363745472L);
        setLongElement(term420083, 23, 34363745472L);
        setLongElement(term420083, 24, 34363745472L);
        setElement(term419940, 3, term420083);
        setField(term419935, term419935.getClass(), "backtrace", term419940);
        setField(term419935, term419935.getClass(), "detailMessage", "(was java.nio.channels.ConnectionPendingException)");
        setField(term419930, term419930.getClass(), "backtrace", null);
        setField(term419930, term419930.getClass(), "detailMessage", null);
        setField(term419930, term419930.getClass(), "cause", null);
        setField(term419930, term419930.getClass(), "stackTrace", null);
        setIntField(term419930, term419930.getClass(), "depth", 0);
        setField(term419930, term419930.getClass(), "suppressedExceptions", null);
        setField(term419935, term419935.getClass(), "cause", term419930);
        setField(term419935, term419935.getClass(), "stackTrace", term420168);
        setIntField(term419935, term419935.getClass(), "depth", 25);
        setIntField(term420170, term420170.getClass(), "modCount", 0);
        setField(term419935, term419935.getClass(), "suppressedExceptions", term420170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term419638;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term419638, term420172));
        assertTrue(recursiveEquals(retValue, term419935));
    }

};


