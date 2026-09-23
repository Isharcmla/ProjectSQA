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

public class JsonMappingException_fromUnexpectedIOE_829399656102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197128;
     Object term201898;
     Object term201569;

    public JsonMappingException_fromUnexpectedIOE_829399656102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197128 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        term201898 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        setField(term201898, term201898.getClass(), "backtrace", null);
        setField(term201898, term201898.getClass(), "detailMessage", null);
        setField(term201898, term201898.getClass(), "cause", null);
        setField(term201898, term201898.getClass(), "stackTrace", null);
        setIntField(term201898, term201898.getClass(), "depth", 0);
        setField(term201898, term201898.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term201638 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        Class<? extends Object> term201645 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicReferenceArray");
        Class<? extends Object> term201649 = Class.forName((String) "java.util.ServiceConfigurationError");
        Class<? extends Object> term201652 = Class.forName((String) "java.util.function.LongFunction");
        Class<? extends Object> term201656 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsInts");
        Class<? extends Object> term201660 = Class.forName((String) "java.util.Vector");
        Class<? extends Object> term201666 = Class.forName((String) "java.util.regex.Pattern$CharPredicate");
        Class<? extends Object> term201671 = Class.forName((String) "java.lang.NoSuchMethodError");
        Class<? extends Object> term201675 = Class.forName((String) "java.util.HashSet");
        Class<? extends Object> term201679 = Class.forName((String) "java.util.stream.Node$Builder");
        Class<? extends Object> term201683 = Class.forName((String) "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        Class<? extends Object> term201687 = Class.forName((String) "com.fasterxml.jackson.databind.node.TextNode");
        Class<? extends Object> term201691 = Class.forName((String) "java.io.InterruptedIOException");
        Class<? extends Object> term201694 = Class.forName((String) "java.util.Formatter$FormatString");
        Class<? extends Object> term201697 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer");
        Class<? extends Object> term201701 = Class.forName((String) "java.util.Base64$Encoder");
        Class<? extends Object> term201705 = Class.forName((String) "java.lang.reflect.Proxy");
        Class<? extends Object> term201708 = Class.forName((String) "java.lang.Throwable$SentinelHolder");
        Class<? extends Object> term201712 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom$RandomLongsSpliterator");
        term201569 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term201570 = (Object[]) newArray("java.lang.Object", 5);
        short[] term201571 = (short[]) newShortArray(32);
        int[] term201604 = (int[]) newIntArray(32);
        Object[] term201637 = (Object[]) newArray("java.lang.Object", 32);
        long[] term201716 = (long[]) newLongArray(32);
        Object[] term201820 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term201822 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term201569, term201569.getClass(), "_path", null);
        setField(term201569, term201569.getClass(), "_processor", null);
        setField(term201569, term201569.getClass(), "_location", null);
        setShortElement(term201571, 0, (short) 30);
        setShortElement(term201571, 1, (short) 3);
        setShortElement(term201571, 5, (short) 27);
        setShortElement(term201571, 6, (short) 2);
        setShortElement(term201571, 7, (short) 3);
        setShortElement(term201571, 11, (short) 2);
        setShortElement(term201571, 12, (short) 4);
        setShortElement(term201571, 13, (short) 4);
        setShortElement(term201571, 14, (short) 3);
        setShortElement(term201571, 15, (short) 4);
        setShortElement(term201571, 16, (short) 4);
        setShortElement(term201571, 17, (short) 1);
        setShortElement(term201571, 18, (short) 2);
        setShortElement(term201571, 19, (short) 3);
        setShortElement(term201571, 20, (short) 3);
        setShortElement(term201571, 21, (short) 13);
        setShortElement(term201571, 22, (short) 1);
        setShortElement(term201571, 23, (short) 2);
        setShortElement(term201571, 24, (short) 12);
        setElement(term201570, 0, term201571);
        setIntElement(term201604, 0, 57016320);
        setIntElement(term201604, 2, 6553600);
        setIntElement(term201604, 3, 393216);
        setIntElement(term201604, 4, 3866630);
        setIntElement(term201604, 5, 1245184);
        setIntElement(term201604, 6, 2424832);
        setIntElement(term201604, 8, 6553600);
        setIntElement(term201604, 9, 393216);
        setIntElement(term201604, 10, 3866630);
        setIntElement(term201604, 11, 14352384);
        setIntElement(term201604, 12, 10354688);
        setIntElement(term201604, 13, 2883584);
        setIntElement(term201604, 14, 786432);
        setIntElement(term201604, 15, 1441792);
        setIntElement(term201604, 16, 7733248);
        setIntElement(term201604, 17, 20774912);
        setIntElement(term201604, 18, 262144);
        setIntElement(term201604, 19, 2555904);
        setIntElement(term201604, 20, 1835008);
        setIntElement(term201604, 21, 6029312);
        setIntElement(term201604, 22, 327680);
        setIntElement(term201604, 23, 1638400);
        setIntElement(term201604, 24, 720907);
        setElement(term201570, 1, term201604);
        setElement(term201637, 0, term201638);
        setElement(term201637, 1, term201645);
        setElement(term201637, 2, term201645);
        setElement(term201637, 3, term201649);
        setElement(term201637, 4, term201652);
        setElement(term201637, 5, term201656);
        setElement(term201637, 6, term201660);
        setElement(term201637, 7, term201645);
        setElement(term201637, 8, term201645);
        setElement(term201637, 9, term201649);
        setElement(term201637, 10, term201652);
        setElement(term201637, 11, term201666);
        setElement(term201637, 12, term201671);
        setElement(term201637, 13, term201675);
        setElement(term201637, 14, term201679);
        setElement(term201637, 15, term201683);
        setElement(term201637, 16, term201675);
        setElement(term201637, 17, term201687);
        setElement(term201637, 18, term201691);
        setElement(term201637, 19, term201694);
        setElement(term201637, 20, term201697);
        setElement(term201637, 21, term201701);
        setElement(term201637, 22, term201705);
        setElement(term201637, 23, term201708);
        setElement(term201637, 24, term201712);
        setElement(term201570, 2, term201637);
        setLongElement(term201716, 0, 132578329177248L);
        setLongElement(term201716, 1, 34364798256L);
        setLongElement(term201716, 2, 34363739368L);
        setLongElement(term201716, 3, 34363739368L);
        setLongElement(term201716, 4, 34363739368L);
        setLongElement(term201716, 5, 132578328998496L);
        setLongElement(term201716, 6, 34363820048L);
        setLongElement(term201716, 7, 34364798256L);
        setLongElement(term201716, 8, 34363739368L);
        setLongElement(term201716, 9, 34363739368L);
        setLongElement(term201716, 10, 34363739368L);
        setLongElement(term201716, 11, 132582552571296L);
        setLongElement(term201716, 12, 132582552640272L);
        setLongElement(term201716, 13, 132582550089488L);
        setLongElement(term201716, 14, 132582552759024L);
        setLongElement(term201716, 15, 132582550089488L);
        setLongElement(term201716, 16, 132582550089488L);
        setLongElement(term201716, 17, 34363745472L);
        setLongElement(term201716, 18, 34364710216L);
        setLongElement(term201716, 19, 34363745472L);
        setLongElement(term201716, 20, 34363745472L);
        setLongElement(term201716, 21, 34364896224L);
        setLongElement(term201716, 22, 34363745472L);
        setLongElement(term201716, 23, 34363745472L);
        setLongElement(term201716, 24, 34363745472L);
        setElement(term201570, 3, term201716);
        setField(term201569, term201569.getClass(), "backtrace", term201570);
        setField(term201569, term201569.getClass(), "detailMessage", "Unexpected IOException (of type java.io.UTFDataFormatException): null");
        setField(term201569, term201569.getClass(), "cause", term201569);
        setField(term201569, term201569.getClass(), "stackTrace", term201820);
        setIntField(term201569, term201569.getClass(), "depth", 25);
        setIntField(term201822, term201822.getClass(), "modCount", 0);
        setField(term201569, term201569.getClass(), "suppressedExceptions", term201822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term197128;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term197128, term201898));
        assertTrue(recursiveEquals(retValue, term201569));
    }

};


