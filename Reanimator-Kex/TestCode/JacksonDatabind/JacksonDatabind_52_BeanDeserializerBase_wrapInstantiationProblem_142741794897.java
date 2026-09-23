package com.fasterxml.jackson.databind.deser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializerBase_wrapInstantiationProblem_142741794897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9819;

    public BeanDeserializerBase_wrapInstantiationProblem_142741794897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9888 = Class.forName((String) "java.io.Console$LineReader");
        Class<? extends Object> term9891 = Class.forName((String) "java.util.ServiceLoader$LazyClassPathLookupIterator");
        Class<? extends Object> term9893 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
        Class<? extends Object> term9897 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Sorter");
        Class<? extends Object> term9902 = Class.forName((String) "com.fasterxml.jackson.databind.SequenceWriter");
        Class<? extends Object> term9906 = Class.forName((String) "java.util.TreeMap$KeySet");
        Class<? extends Object> term9910 = Class.forName((String) "java.util.concurrent.CompletableFuture$AsyncRun");
        Class<? extends Object> term9914 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        Class<? extends Object> term9918 = Class.forName((String) "java.util.stream.LongPipeline$StatelessOp");
        Class<? extends Object> term9922 = Class.forName((String) "com.fasterxml.jackson.databind.jsonschema.SchemaAware");
        Class<? extends Object> term9926 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$IntrinsicMethodHandle");
        Class<? extends Object> term9930 = Class.forName((String) "java.util.TreeMap$TreeMapSpliterator");
        Class<? extends Object> term9934 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntConsumer");
        Class<? extends Object> term9938 = Class.forName((String) "java.util.HashMap$TreeNode");
        Class<? extends Object> term9940 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJShort$Sorter");
        Class<? extends Object> term9943 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy");
        Class<? extends Object> term9945 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldStaticReadWrite");
        Class<? extends Object> term9947 = Class.forName((String) "java.lang.invoke.ClassSpecializer$SpeciesData");
        Class<? extends Object> term10050 = Class.forName((String) "java.util.ArrayDeque$DescendingIterator");
        Class<? extends Object> term10052 = Class.forName((String) "java.util.jar.JarFile$2");
        term9819 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9820 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9821 = (short[]) newShortArray(32);
        int[] term9854 = (int[]) newIntArray(32);
        Object[] term9887 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9949 = (long[]) newLongArray(32);
        Object[] term9982 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9983 = (short[]) newShortArray(32);
        int[] term10016 = (int[]) newIntArray(32);
        Object[] term10049 = (Object[]) newArray("java.lang.Object", 32);
        long[] term10054 = (long[]) newLongArray(32);
        Object[] term10099 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term10101 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9821, 0, (short) 1);
        setShortElement(term9821, 1, (short) 2);
        setShortElement(term9821, 2, (short) 1);
        setShortElement(term9821, 3, (short) 7);
        setShortElement(term9821, 4, (short) 2);
        setShortElement(term9821, 5, (short) 1);
        setShortElement(term9821, 6, (short) 6);
        setShortElement(term9821, 7, (short) 2);
        setShortElement(term9821, 8, (short) 10);
        setShortElement(term9821, 9, (short) 11);
        setShortElement(term9821, 10, (short) 29);
        setShortElement(term9821, 11, (short) 5);
        setShortElement(term9821, 12, (short) 4);
        setShortElement(term9821, 13, (short) 5);
        setShortElement(term9821, 14, (short) 6);
        setShortElement(term9821, 15, (short) 6);
        setShortElement(term9821, 16, (short) 9);
        setShortElement(term9821, 17, (short) 10);
        setShortElement(term9821, 18, (short) 11);
        setShortElement(term9821, 19, (short) 4);
        setShortElement(term9821, 20, (short) 1);
        setShortElement(term9821, 23, (short) 3);
        setShortElement(term9821, 24, (short) 4);
        setShortElement(term9821, 25, (short) 9);
        setShortElement(term9821, 26, (short) 1);
        setShortElement(term9821, 27, (short) 2);
        setShortElement(term9821, 28, (short) 3);
        setShortElement(term9821, 29, (short) 3);
        setShortElement(term9821, 30, (short) 13);
        setShortElement(term9821, 31, (short) 1);
        setElement(term9820, 0, term9821);
        setIntElement(term9854, 1, 5570560);
        setIntElement(term9854, 2, 327680);
        setIntElement(term9854, 3, 4456454);
        setIntElement(term9854, 4, 1769472);
        setIntElement(term9854, 5, 14876672);
        setIntElement(term9854, 6, 6225920);
        setIntElement(term9854, 7, 917504);
        setIntElement(term9854, 8, 327680);
        setIntElement(term9854, 9, 8519680);
        setIntElement(term9854, 10, 917504);
        setIntElement(term9854, 11, 11993088);
        setIntElement(term9854, 12, 655360);
        setIntElement(term9854, 13, 7864320);
        setIntElement(term9854, 14, 3735552);
        setIntElement(term9854, 15, 7143424);
        setIntElement(term9854, 16, 8454144);
        setIntElement(term9854, 17, 9240576);
        setIntElement(term9854, 18, 196608);
        setIntElement(term9854, 19, 3801088);
        setIntElement(term9854, 20, 786432);
        setIntElement(term9854, 21, 589824);
        setIntElement(term9854, 22, 17170432);
        setIntElement(term9854, 23, 1376256);
        setIntElement(term9854, 24, 5242880);
        setIntElement(term9854, 25, 2883584);
        setIntElement(term9854, 26, 20774912);
        setIntElement(term9854, 27, 262144);
        setIntElement(term9854, 28, 2555904);
        setIntElement(term9854, 29, 1835008);
        setIntElement(term9854, 30, 6029312);
        setIntElement(term9854, 31, 327680);
        setElement(term9820, 1, term9854);
        setElement(term9887, 0, term9888);
        setElement(term9887, 1, term9888);
        setElement(term9887, 2, term9891);
        setElement(term9887, 3, term9893);
        setElement(term9887, 4, term9897);
        setElement(term9887, 5, term9897);
        setElement(term9887, 6, term9902);
        setElement(term9887, 7, term9902);
        setElement(term9887, 8, term9906);
        setElement(term9887, 9, term9906);
        setElement(term9887, 10, term9906);
        setElement(term9887, 11, term9906);
        setElement(term9887, 12, term9906);
        setElement(term9887, 13, term9910);
        setElement(term9887, 14, term9910);
        setElement(term9887, 15, term9914);
        setElement(term9887, 16, term9914);
        setElement(term9887, 17, term9914);
        setElement(term9887, 18, term9914);
        setElement(term9887, 19, term9918);
        setElement(term9887, 20, term9918);
        setElement(term9887, 21, term9918);
        setElement(term9887, 22, term9922);
        setElement(term9887, 23, term9914);
        setElement(term9887, 24, term9926);
        setElement(term9887, 25, term9930);
        setElement(term9887, 26, term9934);
        setElement(term9887, 27, term9938);
        setElement(term9887, 28, term9940);
        setElement(term9887, 29, term9943);
        setElement(term9887, 30, term9945);
        setElement(term9887, 31, term9947);
        setElement(term9820, 2, term9887);
        setLongElement(term9949, 0, 34363746224L);
        setLongElement(term9949, 1, 34363775512L);
        setLongElement(term9949, 2, 34363775512L);
        setLongElement(term9949, 3, 34363775512L);
        setLongElement(term9949, 4, 131202531099536L);
        setLongElement(term9949, 5, 34364440080L);
        setLongElement(term9949, 6, 131202531166688L);
        setLongElement(term9949, 7, 131202530692736L);
        setLongElement(term9949, 8, 131202530692624L);
        setLongElement(term9949, 9, 131202530692768L);
        setLongElement(term9949, 10, 131202531053120L);
        setLongElement(term9949, 11, 34363766248L);
        setLongElement(term9949, 12, 34363766248L);
        setLongElement(term9949, 13, 131199477050448L);
        setLongElement(term9949, 14, 131199477050448L);
        setLongElement(term9949, 15, 131199477050304L);
        setLongElement(term9949, 16, 131199477094864L);
        setLongElement(term9949, 17, 131199477096512L);
        setLongElement(term9949, 18, 131199477097280L);
        setLongElement(term9949, 19, 131199474021968L);
        setLongElement(term9949, 20, 34363739368L);
        setLongElement(term9949, 21, 34363739368L);
        setLongElement(term9949, 22, 131199477048944L);
        setLongElement(term9949, 23, 34363829248L);
        setLongElement(term9949, 24, 131199474021968L);
        setLongElement(term9949, 25, 131202527864080L);
        setLongElement(term9949, 26, 34363745472L);
        setLongElement(term9949, 27, 34364710216L);
        setLongElement(term9949, 28, 34363745472L);
        setLongElement(term9949, 29, 34363745472L);
        setLongElement(term9949, 30, 34364896224L);
        setLongElement(term9949, 31, 34363745472L);
        setElement(term9820, 3, term9949);
        setShortElement(term9983, 0, (short) 2);
        setShortElement(term9983, 1, (short) 12);
        setElement(term9982, 0, term9983);
        setIntElement(term10016, 0, 1638400);
        setIntElement(term10016, 1, 720907);
        setElement(term9982, 1, term10016);
        setElement(term10049, 0, term10050);
        setElement(term10049, 1, term10052);
        setElement(term9982, 2, term10049);
        setLongElement(term10054, 0, 34363745472L);
        setLongElement(term10054, 1, 34363745472L);
        setElement(term9982, 3, term10054);
        setElement(term9820, 4, term9982);
        setField(term9819, term9819.getClass(), "backtrace", term9820);
        setField(term9819, term9819.getClass(), "detailMessage", "NRdvgJlhkX");
        setField(term9819, term9819.getClass(), "cause", term9819);
        setField(term9819, term9819.getClass(), "stackTrace", term10099);
        setIntField(term9819, term9819.getClass(), "depth", 34);
        setIntField(term10101, term10101.getClass(), "modCount", 0);
        setField(term9819, term9819.getClass(), "suppressedExceptions", term10101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term9819;
        args[1] = null;
        try {
            callMethod(klass, "wrapInstantiationProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


