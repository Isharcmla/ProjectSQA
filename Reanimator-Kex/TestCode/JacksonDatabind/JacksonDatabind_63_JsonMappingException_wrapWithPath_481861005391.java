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

public class JsonMappingException_wrapWithPath_481861005391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608772;
     Object term609817;
     Object term609600;

    public JsonMappingException_wrapWithPath_481861005391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608772 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        term609817 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        setField(term609817, term609817.getClass(), "flags", null);
        setField(term609817, term609817.getClass(), "backtrace", null);
        setField(term609817, term609817.getClass(), "detailMessage", null);
        setField(term609817, term609817.getClass(), "cause", null);
        setField(term609817, term609817.getClass(), "stackTrace", null);
        setIntField(term609817, term609817.getClass(), "depth", 0);
        setField(term609817, term609817.getClass(), "suppressedExceptions", null);
        LinkedList term609601 = new LinkedList();
        ((LinkedList) term609601).add((Object)null);
        Class<? extends Object> term609673 = Class.forName((String) "java.util.stream.FindOps$FindSink$OfInt");
        Class<? extends Object> term609680 = Class.forName((String) "java.lang.CharacterDataPrivateUse");
        Class<? extends Object> term609693 = Class.forName((String) "java.lang.Boolean");
        Class<? extends Object> term609697 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor");
        Class<? extends Object> term609701 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
        Class<? extends Object> term609705 = Class.forName((String) "java.lang.ThreadDeath");
        Class<? extends Object> term609711 = Class.forName((String) "java.lang.WeakPairMap$Pair$Weak$1");
        Class<? extends Object> term609714 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForwardingNode");
        Class<? extends Object> term609719 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom$RandomLongsSpliterator");
        Class<? extends Object> term609723 = Class.forName((String) "java.nio.file.DirectoryStream");
        Class<? extends Object> term609727 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble");
        Class<? extends Object> term609731 = Class.forName((String) "java.util.stream.Nodes$ConcNode$OfPrimitive");
        Class<? extends Object> term609735 = Class.forName((String) "java.util.TreeMap$EntrySpliterator");
        Class<? extends Object> term609739 = Class.forName((String) "java.util.stream.StreamSpliterators");
        Class<? extends Object> term609742 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
        Class<? extends Object> term609745 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonEnumDefaultValue");
        Class<? extends Object> term609749 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$ArrayAccess");
        Class<? extends Object> term609753 = Class.forName((String) "java.nio.file.FileVisitResult");
        Class<? extends Object> term609756 = Class.forName((String) "java.util.ArraysParallelSortHelpers$Relay");
        Class<? extends Object> term609760 = Class.forName((String) "com.fasterxml.jackson.databind.ser.PropertyBuilder$1");
        term609600 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term609605 = (Object[]) newArray("java.lang.Object", 5);
        short[] term609606 = (short[]) newShortArray(32);
        int[] term609639 = (int[]) newIntArray(32);
        Object[] term609672 = (Object[]) newArray("java.lang.Object", 32);
        long[] term609764 = (long[]) newLongArray(32);
        Object term609595 = newInstance(Class.forName("java.util.IllegalFormatFlagsException"));
        Object[] term609813 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term609815 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term609600, term609600.getClass(), "_path", term609601);
        setField(term609600, term609600.getClass(), "_processor", null);
        setField(term609600, term609600.getClass(), "_location", null);
        setShortElement(term609606, 0, (short) 20);
        setShortElement(term609606, 4, (short) 27);
        setShortElement(term609606, 5, (short) 2);
        setShortElement(term609606, 6, (short) 3);
        setShortElement(term609606, 10, (short) 2);
        setShortElement(term609606, 11, (short) 4);
        setShortElement(term609606, 12, (short) 4);
        setShortElement(term609606, 13, (short) 3);
        setShortElement(term609606, 14, (short) 4);
        setShortElement(term609606, 15, (short) 4);
        setShortElement(term609606, 16, (short) 1);
        setShortElement(term609606, 17, (short) 2);
        setShortElement(term609606, 18, (short) 3);
        setShortElement(term609606, 19, (short) 3);
        setShortElement(term609606, 20, (short) 13);
        setShortElement(term609606, 21, (short) 1);
        setShortElement(term609606, 22, (short) 2);
        setShortElement(term609606, 23, (short) 12);
        setElement(term609605, 0, term609606);
        setIntElement(term609639, 0, 128385024);
        setIntElement(term609639, 1, 2097152);
        setIntElement(term609639, 2, 393216);
        setIntElement(term609639, 3, 3866630);
        setIntElement(term609639, 4, 1245184);
        setIntElement(term609639, 5, 3211264);
        setIntElement(term609639, 7, 6553600);
        setIntElement(term609639, 8, 393216);
        setIntElement(term609639, 9, 3866630);
        setIntElement(term609639, 10, 14352384);
        setIntElement(term609639, 11, 10354688);
        setIntElement(term609639, 12, 2883584);
        setIntElement(term609639, 13, 786432);
        setIntElement(term609639, 14, 1441792);
        setIntElement(term609639, 15, 7733248);
        setIntElement(term609639, 16, 20774912);
        setIntElement(term609639, 17, 262144);
        setIntElement(term609639, 18, 2555904);
        setIntElement(term609639, 19, 1835008);
        setIntElement(term609639, 20, 6029312);
        setIntElement(term609639, 21, 327680);
        setIntElement(term609639, 22, 1638400);
        setIntElement(term609639, 23, 720907);
        setElement(term609605, 1, term609639);
        setElement(term609672, 0, term609673);
        setElement(term609672, 1, term609680);
        setElement(term609672, 2, term609693);
        setElement(term609672, 3, term609697);
        setElement(term609672, 4, term609701);
        setElement(term609672, 5, term609705);
        setElement(term609672, 6, term609711);
        setElement(term609672, 7, term609711);
        setElement(term609672, 8, term609693);
        setElement(term609672, 9, term609697);
        setElement(term609672, 10, term609714);
        setElement(term609672, 11, term609719);
        setElement(term609672, 12, term609723);
        setElement(term609672, 13, term609727);
        setElement(term609672, 14, term609731);
        setElement(term609672, 15, term609723);
        setElement(term609672, 16, term609735);
        setElement(term609672, 17, term609739);
        setElement(term609672, 18, term609742);
        setElement(term609672, 19, term609745);
        setElement(term609672, 20, term609749);
        setElement(term609672, 21, term609753);
        setElement(term609672, 22, term609756);
        setElement(term609672, 23, term609760);
        setElement(term609605, 2, term609672);
        setLongElement(term609764, 0, 132578328546864L);
        setLongElement(term609764, 1, 34363739368L);
        setLongElement(term609764, 2, 34363739368L);
        setLongElement(term609764, 3, 34363739368L);
        setLongElement(term609764, 4, 132578328998496L);
        setLongElement(term609764, 5, 34363820048L);
        setLongElement(term609764, 6, 34364798256L);
        setLongElement(term609764, 7, 34363739368L);
        setLongElement(term609764, 8, 34363739368L);
        setLongElement(term609764, 9, 34363739368L);
        setLongElement(term609764, 10, 132582552571296L);
        setLongElement(term609764, 11, 132582552640272L);
        setLongElement(term609764, 12, 132582550089488L);
        setLongElement(term609764, 13, 132582552759024L);
        setLongElement(term609764, 14, 132582550089488L);
        setLongElement(term609764, 15, 132582550089488L);
        setLongElement(term609764, 16, 34363745472L);
        setLongElement(term609764, 17, 34364710216L);
        setLongElement(term609764, 18, 34363745472L);
        setLongElement(term609764, 19, 34363745472L);
        setLongElement(term609764, 20, 34364896224L);
        setLongElement(term609764, 21, 34363745472L);
        setLongElement(term609764, 22, 34363745472L);
        setLongElement(term609764, 23, 34363745472L);
        setElement(term609605, 3, term609764);
        setField(term609600, term609600.getClass(), "backtrace", term609605);
        setField(term609600, term609600.getClass(), "detailMessage", "Flags = \'null\'");
        setField(term609595, term609595.getClass(), "flags", null);
        setField(term609595, term609595.getClass(), "backtrace", null);
        setField(term609595, term609595.getClass(), "detailMessage", null);
        setField(term609595, term609595.getClass(), "cause", null);
        setField(term609595, term609595.getClass(), "stackTrace", null);
        setIntField(term609595, term609595.getClass(), "depth", 0);
        setField(term609595, term609595.getClass(), "suppressedExceptions", null);
        setField(term609600, term609600.getClass(), "cause", term609595);
        setField(term609600, term609600.getClass(), "stackTrace", term609813);
        setIntField(term609600, term609600.getClass(), "depth", 24);
        setIntField(term609815, term609815.getClass(), "modCount", 0);
        setField(term609600, term609600.getClass(), "suppressedExceptions", term609815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term608772;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term608772, term609817));
        assertTrue(recursiveEquals(retValue, term609600));
    }

};


