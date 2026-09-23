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

public class JsonMappingException_init_129192110237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62827;

    public JsonMappingException_init_129192110237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62832 = Class.forName((String) "java.util.regex.Pattern$LastMatch");
        Class<? extends Object> term62834 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary");
        Class<? extends Object> term62835 = Class.forName((String) "java.nio.ShortBuffer");
        Class<? extends Object> term62838 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiAccept");
        Class<? extends Object> term62842 = Class.forName((String) "java.util.concurrent.TimeUnit$1");
        Class<? extends Object> term62846 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        Class<? extends Object> term62847 = Class.forName((String) "java.util.stream.SortedOps$DoubleSortingSink");
        Class<? extends Object> term62848 = Class.forName((String) "java.util.ServiceLoader$ProviderImpl$2");
        Class<? extends Object> term62851 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<? extends Object> term62855 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        Class<? extends Object> term62858 = Class.forName((String) "java.lang.WeakPairMap$Pair$Weak$1");
        Class<? extends Object> term62861 = Class.forName((String) "java.lang.ArrayIndexOutOfBoundsException");
        Class<? extends Object> term62864 = Class.forName((String) "java.nio.charset.UnmappableCharacterException");
        Class<? extends Object> term62867 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$4");
        Class<? extends Object> term62870 = Class.forName((String) "java.util.zip.Deflater$DeflaterZStreamRef$FinalizableZStreamRef");
        Class<? extends Object> term62872 = Class.forName((String) "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        Class<? extends Object> term62874 = Class.forName((String) "java.util.ArrayDeque$DescendingIterator");
        Class<? extends Object> term62877 = Class.forName((String) "java.nio.file.FileTreeWalker$DirectoryNode");
        Class<? extends Object> term62879 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$TypeAndSerializer");
        Class<? extends Object> term62881 = Class.forName((String) "com.fasterxml.jackson.core.io.JsonStringEncoder");
        Class<? extends Object> term62884 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        term62827 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term62828 = (Object[]) newArray("java.lang.Object", 5);
        short[] term62829 = (short[]) newShortArray(32);
        int[] term62830 = (int[]) newIntArray(32);
        Object[] term62831 = (Object[]) newArray("java.lang.Object", 32);
        long[] term62887 = (long[]) newLongArray(32);
        Object[] term62890 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term62891 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term62827, term62827.getClass(), "_path", null);
        setField(term62827, term62827.getClass(), "_processor", null);
        setField(term62827, term62827.getClass(), "_location", null);
        setShortElement(term62829, 0, (short) 1);
        setShortElement(term62829, 1, (short) 2);
        setShortElement(term62829, 2, (short) 1);
        setShortElement(term62829, 3, (short) 7);
        setShortElement(term62829, 4, (short) 14);
        setShortElement(term62829, 5, (short) 2);
        setShortElement(term62829, 6, (short) 3);
        setShortElement(term62829, 10, (short) 2);
        setShortElement(term62829, 11, (short) 4);
        setShortElement(term62829, 12, (short) 4);
        setShortElement(term62829, 13, (short) 3);
        setShortElement(term62829, 14, (short) 4);
        setShortElement(term62829, 15, (short) 4);
        setShortElement(term62829, 16, (short) 1);
        setShortElement(term62829, 17, (short) 2);
        setShortElement(term62829, 18, (short) 3);
        setShortElement(term62829, 19, (short) 3);
        setShortElement(term62829, 20, (short) 13);
        setShortElement(term62829, 21, (short) 1);
        setShortElement(term62829, 22, (short) 2);
        setShortElement(term62829, 23, (short) 12);
        setElement(term62828, 0, term62829);
        setIntElement(term62830, 1, 5570560);
        setIntElement(term62830, 2, 327680);
        setIntElement(term62830, 3, 4456454);
        setIntElement(term62830, 4, 851968);
        setIntElement(term62830, 5, 3670016);
        setIntElement(term62830, 7, 6553600);
        setIntElement(term62830, 8, 393216);
        setIntElement(term62830, 9, 3866630);
        setIntElement(term62830, 10, 14352384);
        setIntElement(term62830, 11, 10354688);
        setIntElement(term62830, 12, 2883584);
        setIntElement(term62830, 13, 786432);
        setIntElement(term62830, 14, 1441792);
        setIntElement(term62830, 15, 7733248);
        setIntElement(term62830, 16, 20774912);
        setIntElement(term62830, 17, 262144);
        setIntElement(term62830, 18, 2555904);
        setIntElement(term62830, 19, 1835008);
        setIntElement(term62830, 20, 6029312);
        setIntElement(term62830, 21, 327680);
        setIntElement(term62830, 22, 1638400);
        setIntElement(term62830, 23, 720907);
        setElement(term62828, 1, term62830);
        setElement(term62831, 0, term62832);
        setElement(term62831, 1, term62832);
        setElement(term62831, 2, term62834);
        setElement(term62831, 3, term62835);
        setElement(term62831, 4, term62838);
        setElement(term62831, 5, term62842);
        setElement(term62831, 6, term62846);
        setElement(term62831, 7, term62846);
        setElement(term62831, 8, term62847);
        setElement(term62831, 9, term62848);
        setElement(term62831, 10, term62851);
        setElement(term62831, 11, term62855);
        setElement(term62831, 12, term62858);
        setElement(term62831, 13, term62861);
        setElement(term62831, 14, term62864);
        setElement(term62831, 15, term62858);
        setElement(term62831, 16, term62867);
        setElement(term62831, 17, term62870);
        setElement(term62831, 18, term62872);
        setElement(term62831, 19, term62874);
        setElement(term62831, 20, term62877);
        setElement(term62831, 21, term62879);
        setElement(term62831, 22, term62881);
        setElement(term62831, 23, term62884);
        setElement(term62828, 2, term62831);
        setLongElement(term62887, 0, 34363746224L);
        setLongElement(term62887, 1, 34363775512L);
        setLongElement(term62887, 2, 34363775512L);
        setLongElement(term62887, 3, 34363775512L);
        setLongElement(term62887, 4, 132578326060064L);
        setLongElement(term62887, 5, 34363820048L);
        setLongElement(term62887, 6, 34364798256L);
        setLongElement(term62887, 7, 34363739368L);
        setLongElement(term62887, 8, 34363739368L);
        setLongElement(term62887, 9, 34363739368L);
        setLongElement(term62887, 10, 132582552571296L);
        setLongElement(term62887, 11, 132582552640272L);
        setLongElement(term62887, 12, 132582550089488L);
        setLongElement(term62887, 13, 132582552759024L);
        setLongElement(term62887, 14, 132582550089488L);
        setLongElement(term62887, 15, 132582550089488L);
        setLongElement(term62887, 16, 34363745472L);
        setLongElement(term62887, 17, 34364710216L);
        setLongElement(term62887, 18, 34363745472L);
        setLongElement(term62887, 19, 34363745472L);
        setLongElement(term62887, 20, 34364896224L);
        setLongElement(term62887, 21, 34363745472L);
        setLongElement(term62887, 22, 34363745472L);
        setLongElement(term62887, 23, 34363745472L);
        setElement(term62828, 3, term62887);
        setField(term62827, term62827.getClass(), "backtrace", term62828);
        setField(term62827, term62827.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term62827, term62827.getClass(), "cause", term62827);
        setField(term62827, term62827.getClass(), "stackTrace", term62890);
        setIntField(term62827, term62827.getClass(), "depth", 24);
        setIntField(term62891, term62891.getClass(), "modCount", 0);
        setField(term62827, term62827.getClass(), "suppressedExceptions", term62891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.JsonLocation");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "RMFIsYGgne";
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62827));
    }

};


