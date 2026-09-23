package com.fasterxml.jackson.databind.util;

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
import java.lang.RuntimeException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_closeOnFailAndThrowAsIOE_2114651799110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34853;

    public ClassUtil_closeOnFailAndThrowAsIOE_2114651799110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34922 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleModule");
        Class<? extends Object> term34925 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator");
        Class<? extends Object> term34927 = Class.forName((String) "com.fasterxml.jackson.core.util.InternCache");
        Class<? extends Object> term34931 = Class.forName((String) "java.math.BigDecimal$StringBuilderHelper");
        Class<? extends Object> term34936 = Class.forName((String) "java.util.stream.SliceOps$1");
        Class<? extends Object> term34940 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonBackReference");
        Class<? extends Object> term34944 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotationCollector");
        Class<? extends Object> term34948 = Class.forName((String) "com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder");
        Class<? extends Object> term34952 = Class.forName((String) "java.util.stream.SortedOps$AbstractIntSortingSink");
        Class<? extends Object> term34956 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicBoolean");
        Class<? extends Object> term34960 = Class.forName((String) "java.util.ArrayList$SubList");
        Class<? extends Object> term34964 = Class.forName((String) "com.fasterxml.jackson.databind.node.ArrayNode");
        Class<? extends Object> term34968 = Class.forName((String) "java.util.concurrent.ExecutionException");
        Class<? extends Object> term34972 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder");
        Class<? extends Object> term34975 = Class.forName((String) "java.util.Scanner$TokenSpliterator");
        Class<? extends Object> term34978 = Class.forName((String) "java.util.stream.ReferencePipeline$4");
        Class<? extends Object> term34981 = Class.forName((String) "java.lang.invoke.VarHandleLongs");
        Class<? extends Object> term34984 = Class.forName((String) "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate");
        Class<? extends Object> term35088 = Class.forName((String) "java.util.stream.ReferencePipeline$3");
        Class<? extends Object> term35090 = Class.forName((String) "java.nio.file.Files$3");
        term34853 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term34854 = (Object[]) newArray("java.lang.Object", 5);
        short[] term34855 = (short[]) newShortArray(32);
        int[] term34888 = (int[]) newIntArray(32);
        Object[] term34921 = (Object[]) newArray("java.lang.Object", 32);
        long[] term34987 = (long[]) newLongArray(32);
        Object[] term35020 = (Object[]) newArray("java.lang.Object", 5);
        short[] term35021 = (short[]) newShortArray(32);
        int[] term35054 = (int[]) newIntArray(32);
        Object[] term35087 = (Object[]) newArray("java.lang.Object", 32);
        long[] term35092 = (long[]) newLongArray(32);
        Object[] term35137 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term35139 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term34855, 0, (short) 1);
        setShortElement(term34855, 1, (short) 2);
        setShortElement(term34855, 2, (short) 1);
        setShortElement(term34855, 3, (short) 7);
        setShortElement(term34855, 4, (short) 2);
        setShortElement(term34855, 5, (short) 1);
        setShortElement(term34855, 6, (short) 6);
        setShortElement(term34855, 7, (short) 2);
        setShortElement(term34855, 8, (short) 10);
        setShortElement(term34855, 9, (short) 11);
        setShortElement(term34855, 10, (short) 29);
        setShortElement(term34855, 11, (short) 5);
        setShortElement(term34855, 12, (short) 4);
        setShortElement(term34855, 13, (short) 6);
        setShortElement(term34855, 14, (short) 8);
        setShortElement(term34855, 15, (short) 6);
        setShortElement(term34855, 16, (short) 9);
        setShortElement(term34855, 17, (short) 10);
        setShortElement(term34855, 18, (short) 11);
        setShortElement(term34855, 19, (short) 4);
        setShortElement(term34855, 20, (short) 1);
        setShortElement(term34855, 22, (short) 10);
        setShortElement(term34855, 23, (short) 3);
        setShortElement(term34855, 24, (short) 4);
        setShortElement(term34855, 25, (short) 9);
        setShortElement(term34855, 26, (short) 1);
        setShortElement(term34855, 27, (short) 2);
        setShortElement(term34855, 28, (short) 3);
        setShortElement(term34855, 29, (short) 3);
        setShortElement(term34855, 30, (short) 13);
        setShortElement(term34855, 31, (short) 1);
        setElement(term34854, 0, term34855);
        setIntElement(term34888, 1, 5570560);
        setIntElement(term34888, 2, 327680);
        setIntElement(term34888, 3, 4456454);
        setIntElement(term34888, 4, 1769472);
        setIntElement(term34888, 5, 14876672);
        setIntElement(term34888, 6, 6225920);
        setIntElement(term34888, 7, 917504);
        setIntElement(term34888, 8, 327680);
        setIntElement(term34888, 9, 8519680);
        setIntElement(term34888, 10, 917504);
        setIntElement(term34888, 11, 11993088);
        setIntElement(term34888, 12, 655360);
        setIntElement(term34888, 13, 7864320);
        setIntElement(term34888, 14, 3735552);
        setIntElement(term34888, 15, 7143424);
        setIntElement(term34888, 16, 8454144);
        setIntElement(term34888, 17, 9240576);
        setIntElement(term34888, 18, 196608);
        setIntElement(term34888, 19, 3801088);
        setIntElement(term34888, 20, 786432);
        setIntElement(term34888, 21, 589824);
        setIntElement(term34888, 22, 17170432);
        setIntElement(term34888, 23, 1376256);
        setIntElement(term34888, 24, 5242880);
        setIntElement(term34888, 25, 2883584);
        setIntElement(term34888, 26, 20774912);
        setIntElement(term34888, 27, 262144);
        setIntElement(term34888, 28, 2555904);
        setIntElement(term34888, 29, 1835008);
        setIntElement(term34888, 30, 6029312);
        setIntElement(term34888, 31, 327680);
        setElement(term34854, 1, term34888);
        setElement(term34921, 0, term34922);
        setElement(term34921, 1, term34922);
        setElement(term34921, 2, term34925);
        setElement(term34921, 3, term34927);
        setElement(term34921, 4, term34931);
        setElement(term34921, 5, term34931);
        setElement(term34921, 6, term34936);
        setElement(term34921, 7, term34936);
        setElement(term34921, 8, term34940);
        setElement(term34921, 9, term34940);
        setElement(term34921, 10, term34940);
        setElement(term34921, 11, term34940);
        setElement(term34921, 12, term34940);
        setElement(term34921, 13, term34944);
        setElement(term34921, 14, term34944);
        setElement(term34921, 15, term34948);
        setElement(term34921, 16, term34948);
        setElement(term34921, 17, term34948);
        setElement(term34921, 18, term34948);
        setElement(term34921, 19, term34952);
        setElement(term34921, 20, term34952);
        setElement(term34921, 21, term34952);
        setElement(term34921, 22, term34956);
        setElement(term34921, 23, term34948);
        setElement(term34921, 24, term34960);
        setElement(term34921, 25, term34964);
        setElement(term34921, 26, term34968);
        setElement(term34921, 27, term34972);
        setElement(term34921, 28, term34975);
        setElement(term34921, 29, term34978);
        setElement(term34921, 30, term34981);
        setElement(term34921, 31, term34984);
        setElement(term34854, 2, term34921);
        setLongElement(term34987, 0, 34363746224L);
        setLongElement(term34987, 1, 34363775512L);
        setLongElement(term34987, 2, 34363775512L);
        setLongElement(term34987, 3, 34363775512L);
        setLongElement(term34987, 4, 131482375099808L);
        setLongElement(term34987, 5, 34364440080L);
        setLongElement(term34987, 6, 131482375166912L);
        setLongElement(term34987, 7, 131482375009648L);
        setLongElement(term34987, 8, 131482375009536L);
        setLongElement(term34987, 9, 131482375009680L);
        setLongElement(term34987, 10, 131482375053392L);
        setLongElement(term34987, 11, 34363766248L);
        setLongElement(term34987, 12, 34363766248L);
        setLongElement(term34987, 13, 131478873767568L);
        setLongElement(term34987, 14, 131478873767568L);
        setLongElement(term34987, 15, 131478873767424L);
        setLongElement(term34987, 16, 131478873811328L);
        setLongElement(term34987, 17, 131478873812976L);
        setLongElement(term34987, 18, 131478873813744L);
        setLongElement(term34987, 19, 131482377128080L);
        setLongElement(term34987, 20, 34363739368L);
        setLongElement(term34987, 21, 34363739368L);
        setLongElement(term34987, 22, 131478873766064L);
        setLongElement(term34987, 23, 34363829248L);
        setLongElement(term34987, 24, 131482377128080L);
        setLongElement(term34987, 25, 131482377482976L);
        setLongElement(term34987, 26, 34363745472L);
        setLongElement(term34987, 27, 34364710216L);
        setLongElement(term34987, 28, 34363745472L);
        setLongElement(term34987, 29, 34363745472L);
        setLongElement(term34987, 30, 34364896224L);
        setLongElement(term34987, 31, 34363745472L);
        setElement(term34854, 3, term34987);
        setShortElement(term35021, 0, (short) 2);
        setShortElement(term35021, 1, (short) 12);
        setElement(term35020, 0, term35021);
        setIntElement(term35054, 0, 1638400);
        setIntElement(term35054, 1, 720907);
        setElement(term35020, 1, term35054);
        setElement(term35087, 0, term35088);
        setElement(term35087, 1, term35090);
        setElement(term35020, 2, term35087);
        setLongElement(term35092, 0, 34363745472L);
        setLongElement(term35092, 1, 34363745472L);
        setElement(term35020, 3, term35092);
        setElement(term34854, 4, term35020);
        setField(term34853, term34853.getClass(), "backtrace", term34854);
        setField(term34853, term34853.getClass(), "detailMessage", "OclPbYPkcH");
        setField(term34853, term34853.getClass(), "cause", term34853);
        setField(term34853, term34853.getClass(), "stackTrace", term35137);
        setIntField(term34853, term34853.getClass(), "depth", 34);
        setIntField(term35139, term35139.getClass(), "modCount", 0);
        setField(term34853, term34853.getClass(), "suppressedExceptions", term35139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.io.Closeable");
        argTypes[2] = Class.forName("java.lang.Exception");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term34853;
        try {
            callMethod(klass, "closeOnFailAndThrowAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


