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

public class JsonMappingException_wrapWithPath_481861005262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422381;
     Object term422896;
     Object term422660;

    public JsonMappingException_wrapWithPath_481861005262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422381 = newInstance(Class.forName("java.lang.SecurityException"));
        term422896 = newInstance(Class.forName("java.lang.SecurityException"));
        setField(term422896, term422896.getClass(), "backtrace", null);
        setField(term422896, term422896.getClass(), "detailMessage", null);
        setField(term422896, term422896.getClass(), "cause", null);
        setField(term422896, term422896.getClass(), "stackTrace", null);
        setIntField(term422896, term422896.getClass(), "depth", 0);
        setField(term422896, term422896.getClass(), "suppressedExceptions", null);
        LinkedList term422661 = new LinkedList();
        ((LinkedList) term422661).add((Object)null);
        Class<? extends Object> term422733 = Class.forName((String) "java.lang.reflect.AnnotatedArrayType");
        Class<? extends Object> term422740 = Class.forName((String) "java.lang.invoke.BoundMethodHandle$Specializer$Factory");
        Class<? extends Object> term422753 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase");
        Class<? extends Object> term422757 = Class.forName((String) "java.util.stream.SliceOps$3");
        Class<? extends Object> term422761 = Class.forName((String) "java.nio.channels.IllegalSelectorException");
        Class<? extends Object> term422765 = Class.forName((String) "java.io.Writer");
        Class<? extends Object> term422771 = Class.forName((String) "java.lang.NullPointerException");
        Class<? extends Object> term422774 = Class.forName((String) "java.util.regex.Matcher");
        Class<? extends Object> term422779 = Class.forName((String) "java.util.DuplicateFormatFlagsException");
        Class<? extends Object> term422783 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler");
        Class<? extends Object> term422787 = Class.forName((String) "java.util.AbstractQueue");
        Class<? extends Object> term422791 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiCompletion");
        Class<? extends Object> term422795 = Class.forName((String) "java.util.stream.SpinedBuffer$OfPrimitive$BaseSpliterator");
        Class<? extends Object> term422799 = Class.forName((String) "java.util.Collections$SetFromMap");
        Class<? extends Object> term422802 = Class.forName((String) "java.util.Locale$Cache");
        Class<? extends Object> term422805 = Class.forName((String) "java.util.concurrent.CountedCompleter");
        Class<? extends Object> term422809 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer");
        Class<? extends Object> term422813 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter");
        Class<? extends Object> term422816 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        Class<? extends Object> term422820 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapEntry");
        term422660 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term422665 = (Object[]) newArray("java.lang.Object", 5);
        short[] term422666 = (short[]) newShortArray(32);
        int[] term422699 = (int[]) newIntArray(32);
        Object[] term422732 = (Object[]) newArray("java.lang.Object", 32);
        long[] term422824 = (long[]) newLongArray(32);
        Object term422655 = newInstance(Class.forName("java.lang.SecurityException"));
        Object[] term422892 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term422894 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term422660, term422660.getClass(), "_path", term422661);
        setField(term422660, term422660.getClass(), "_processor", null);
        setField(term422660, term422660.getClass(), "_location", null);
        setShortElement(term422666, 0, (short) 20);
        setShortElement(term422666, 4, (short) 27);
        setShortElement(term422666, 5, (short) 2);
        setShortElement(term422666, 6, (short) 3);
        setShortElement(term422666, 10, (short) 2);
        setShortElement(term422666, 11, (short) 4);
        setShortElement(term422666, 12, (short) 4);
        setShortElement(term422666, 13, (short) 3);
        setShortElement(term422666, 14, (short) 4);
        setShortElement(term422666, 15, (short) 4);
        setShortElement(term422666, 16, (short) 1);
        setShortElement(term422666, 17, (short) 2);
        setShortElement(term422666, 18, (short) 3);
        setShortElement(term422666, 19, (short) 3);
        setShortElement(term422666, 20, (short) 13);
        setShortElement(term422666, 21, (short) 1);
        setShortElement(term422666, 22, (short) 2);
        setShortElement(term422666, 23, (short) 12);
        setElement(term422665, 0, term422666);
        setIntElement(term422699, 0, 128385024);
        setIntElement(term422699, 1, 2097152);
        setIntElement(term422699, 2, 393216);
        setIntElement(term422699, 3, 3866630);
        setIntElement(term422699, 4, 1245184);
        setIntElement(term422699, 5, 3211264);
        setIntElement(term422699, 7, 6553600);
        setIntElement(term422699, 8, 393216);
        setIntElement(term422699, 9, 3866630);
        setIntElement(term422699, 10, 14352384);
        setIntElement(term422699, 11, 10354688);
        setIntElement(term422699, 12, 2883584);
        setIntElement(term422699, 13, 786432);
        setIntElement(term422699, 14, 1441792);
        setIntElement(term422699, 15, 7733248);
        setIntElement(term422699, 16, 20774912);
        setIntElement(term422699, 17, 262144);
        setIntElement(term422699, 18, 2555904);
        setIntElement(term422699, 19, 1835008);
        setIntElement(term422699, 20, 6029312);
        setIntElement(term422699, 21, 327680);
        setIntElement(term422699, 22, 1638400);
        setIntElement(term422699, 23, 720907);
        setElement(term422665, 1, term422699);
        setElement(term422732, 0, term422733);
        setElement(term422732, 1, term422740);
        setElement(term422732, 2, term422753);
        setElement(term422732, 3, term422757);
        setElement(term422732, 4, term422761);
        setElement(term422732, 5, term422765);
        setElement(term422732, 6, term422771);
        setElement(term422732, 7, term422771);
        setElement(term422732, 8, term422753);
        setElement(term422732, 9, term422757);
        setElement(term422732, 10, term422774);
        setElement(term422732, 11, term422779);
        setElement(term422732, 12, term422783);
        setElement(term422732, 13, term422787);
        setElement(term422732, 14, term422791);
        setElement(term422732, 15, term422783);
        setElement(term422732, 16, term422795);
        setElement(term422732, 17, term422799);
        setElement(term422732, 18, term422802);
        setElement(term422732, 19, term422805);
        setElement(term422732, 20, term422809);
        setElement(term422732, 21, term422813);
        setElement(term422732, 22, term422816);
        setElement(term422732, 23, term422820);
        setElement(term422665, 2, term422732);
        setLongElement(term422824, 0, 132578328546864L);
        setLongElement(term422824, 1, 34363739368L);
        setLongElement(term422824, 2, 34363739368L);
        setLongElement(term422824, 3, 34363739368L);
        setLongElement(term422824, 4, 132578328998496L);
        setLongElement(term422824, 5, 34363820048L);
        setLongElement(term422824, 6, 34364798256L);
        setLongElement(term422824, 7, 34363739368L);
        setLongElement(term422824, 8, 34363739368L);
        setLongElement(term422824, 9, 34363739368L);
        setLongElement(term422824, 10, 132582552571296L);
        setLongElement(term422824, 11, 132582552640272L);
        setLongElement(term422824, 12, 132582550089488L);
        setLongElement(term422824, 13, 132582552759024L);
        setLongElement(term422824, 14, 132582550089488L);
        setLongElement(term422824, 15, 132582550089488L);
        setLongElement(term422824, 16, 34363745472L);
        setLongElement(term422824, 17, 34364710216L);
        setLongElement(term422824, 18, 34363745472L);
        setLongElement(term422824, 19, 34363745472L);
        setLongElement(term422824, 20, 34364896224L);
        setLongElement(term422824, 21, 34363745472L);
        setLongElement(term422824, 22, 34363745472L);
        setLongElement(term422824, 23, 34363745472L);
        setElement(term422665, 3, term422824);
        setField(term422660, term422660.getClass(), "backtrace", term422665);
        setField(term422660, term422660.getClass(), "detailMessage", "(was java.lang.SecurityException)");
        setField(term422655, term422655.getClass(), "backtrace", null);
        setField(term422655, term422655.getClass(), "detailMessage", null);
        setField(term422655, term422655.getClass(), "cause", null);
        setField(term422655, term422655.getClass(), "stackTrace", null);
        setIntField(term422655, term422655.getClass(), "depth", 0);
        setField(term422655, term422655.getClass(), "suppressedExceptions", null);
        setField(term422660, term422660.getClass(), "cause", term422655);
        setField(term422660, term422660.getClass(), "stackTrace", term422892);
        setIntField(term422660, term422660.getClass(), "depth", 24);
        setIntField(term422894, term422894.getClass(), "modCount", 0);
        setField(term422660, term422660.getClass(), "suppressedExceptions", term422894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term422381;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term422381, term422896));
        assertTrue(recursiveEquals(retValue, term422660));
    }

};


