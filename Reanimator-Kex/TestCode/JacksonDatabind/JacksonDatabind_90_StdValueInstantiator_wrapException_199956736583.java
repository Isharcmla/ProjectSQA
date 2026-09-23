package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_wrapException_199956736583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;

    public StdValueInstantiator_wrapException_199956736583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110 = Class.forName((String) "com.fasterxml.jackson.databind.MappingJsonFactory");
        Class<? extends Object> term113 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term115 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask$OfInt");
        Class<? extends Object> term119 = Class.forName((String) "java.util.Currency$1");
        Class<? extends Object> term124 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfDouble");
        Class<? extends Object> term128 = Class.forName((String) "java.util.concurrent.ForkJoinTask$ExceptionNode");
        Class<? extends Object> term132 = Class.forName((String) "java.util.IdentityHashMap$ValueIterator");
        Class<? extends Object> term136 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$10");
        Class<? extends Object> term140 = Class.forName((String) "java.util.TreeMap$DescendingKeySpliterator");
        Class<? extends Object> term144 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink");
        Class<? extends Object> term148 = Class.forName((String) "java.lang.ModuleLayer");
        Class<? extends Object> term152 = Class.forName((String) "java.util.jar.JarFile$1");
        Class<? extends Object> term156 = Class.forName((String) "java.util.zip.ZipFile$EntrySpliterator");
        Class<? extends Object> term160 = Class.forName((String) "java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream");
        Class<? extends Object> term163 = Class.forName((String) "java.util.stream.Node");
        Class<? extends Object> term166 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedValues");
        Class<? extends Object> term169 = Class.forName((String) "java.util.GregorianCalendar");
        Class<? extends Object> term172 = Class.forName((String) "java.util.TreeMap$NavigableSubMap$SubMapIterator");
        Class<? extends Object> term276 = Class.forName((String) "java.util.Currency$CurrencyNameGetter");
        Class<? extends Object> term278 = Class.forName((String) "java.nio.file.Files$FileTypeDetectors$2");
        term41 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term42 = (Object[]) newArray("java.lang.Object", 5);
        short[] term43 = (short[]) newShortArray(32);
        int[] term76 = (int[]) newIntArray(32);
        Object[] term109 = (Object[]) newArray("java.lang.Object", 32);
        long[] term175 = (long[]) newLongArray(32);
        Object[] term208 = (Object[]) newArray("java.lang.Object", 5);
        short[] term209 = (short[]) newShortArray(32);
        int[] term242 = (int[]) newIntArray(32);
        Object[] term275 = (Object[]) newArray("java.lang.Object", 32);
        long[] term280 = (long[]) newLongArray(32);
        Object[] term325 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term327 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term43, 0, (short) 1);
        setShortElement(term43, 1, (short) 2);
        setShortElement(term43, 2, (short) 1);
        setShortElement(term43, 3, (short) 7);
        setShortElement(term43, 4, (short) 2);
        setShortElement(term43, 5, (short) 1);
        setShortElement(term43, 6, (short) 6);
        setShortElement(term43, 7, (short) 2);
        setShortElement(term43, 8, (short) 10);
        setShortElement(term43, 9, (short) 11);
        setShortElement(term43, 10, (short) 29);
        setShortElement(term43, 11, (short) 5);
        setShortElement(term43, 12, (short) 4);
        setShortElement(term43, 13, (short) 5);
        setShortElement(term43, 14, (short) 6);
        setShortElement(term43, 15, (short) 6);
        setShortElement(term43, 16, (short) 9);
        setShortElement(term43, 17, (short) 10);
        setShortElement(term43, 18, (short) 11);
        setShortElement(term43, 19, (short) 4);
        setShortElement(term43, 20, (short) 1);
        setShortElement(term43, 23, (short) 3);
        setShortElement(term43, 24, (short) 4);
        setShortElement(term43, 25, (short) 4);
        setShortElement(term43, 26, (short) 1);
        setShortElement(term43, 27, (short) 2);
        setShortElement(term43, 28, (short) 3);
        setShortElement(term43, 29, (short) 3);
        setShortElement(term43, 30, (short) 13);
        setShortElement(term43, 31, (short) 1);
        setElement(term42, 0, term43);
        setIntElement(term76, 1, 5570560);
        setIntElement(term76, 2, 327680);
        setIntElement(term76, 3, 4456454);
        setIntElement(term76, 4, 1769472);
        setIntElement(term76, 5, 14876672);
        setIntElement(term76, 6, 6225920);
        setIntElement(term76, 7, 917504);
        setIntElement(term76, 8, 327680);
        setIntElement(term76, 9, 8519680);
        setIntElement(term76, 10, 917504);
        setIntElement(term76, 11, 11993088);
        setIntElement(term76, 12, 655360);
        setIntElement(term76, 13, 7864320);
        setIntElement(term76, 14, 3735552);
        setIntElement(term76, 15, 7143424);
        setIntElement(term76, 16, 8454144);
        setIntElement(term76, 17, 9240576);
        setIntElement(term76, 18, 196608);
        setIntElement(term76, 19, 3801088);
        setIntElement(term76, 20, 786432);
        setIntElement(term76, 21, 589824);
        setIntElement(term76, 22, 17170432);
        setIntElement(term76, 23, 1376256);
        setIntElement(term76, 24, 5242880);
        setIntElement(term76, 25, 2883584);
        setIntElement(term76, 26, 20774912);
        setIntElement(term76, 27, 262144);
        setIntElement(term76, 28, 2555904);
        setIntElement(term76, 29, 1835008);
        setIntElement(term76, 30, 6029312);
        setIntElement(term76, 31, 327680);
        setElement(term42, 1, term76);
        setElement(term109, 0, term110);
        setElement(term109, 1, term110);
        setElement(term109, 2, term113);
        setElement(term109, 3, term115);
        setElement(term109, 4, term119);
        setElement(term109, 5, term119);
        setElement(term109, 6, term124);
        setElement(term109, 7, term124);
        setElement(term109, 8, term128);
        setElement(term109, 9, term128);
        setElement(term109, 10, term128);
        setElement(term109, 11, term128);
        setElement(term109, 12, term128);
        setElement(term109, 13, term132);
        setElement(term109, 14, term132);
        setElement(term109, 15, term136);
        setElement(term109, 16, term136);
        setElement(term109, 17, term136);
        setElement(term109, 18, term136);
        setElement(term109, 19, term140);
        setElement(term109, 20, term140);
        setElement(term109, 21, term140);
        setElement(term109, 22, term144);
        setElement(term109, 23, term136);
        setElement(term109, 24, term148);
        setElement(term109, 25, term152);
        setElement(term109, 26, term156);
        setElement(term109, 27, term160);
        setElement(term109, 28, term163);
        setElement(term109, 29, term166);
        setElement(term109, 30, term169);
        setElement(term109, 31, term172);
        setElement(term42, 2, term109);
        setLongElement(term175, 0, 34363746224L);
        setLongElement(term175, 1, 34363775512L);
        setLongElement(term175, 2, 34363775512L);
        setLongElement(term175, 3, 34363775512L);
        setLongElement(term175, 4, 127296325552064L);
        setLongElement(term175, 5, 34364440080L);
        setLongElement(term175, 6, 127296325619216L);
        setLongElement(term175, 7, 127296325243872L);
        setLongElement(term175, 8, 127296325243760L);
        setLongElement(term175, 9, 127296325243904L);
        setLongElement(term175, 10, 127296325505648L);
        setLongElement(term175, 11, 34363766248L);
        setLongElement(term175, 12, 34363766248L);
        setLongElement(term175, 13, 127293269653488L);
        setLongElement(term175, 14, 127293269653488L);
        setLongElement(term175, 15, 127293269653344L);
        setLongElement(term175, 16, 127293269697904L);
        setLongElement(term175, 17, 127293269699552L);
        setLongElement(term175, 18, 127293269700320L);
        setLongElement(term175, 19, 127293266625536L);
        setLongElement(term175, 20, 34363739368L);
        setLongElement(term175, 21, 34363739368L);
        setLongElement(term175, 22, 127293269651984L);
        setLongElement(term175, 23, 34363829248L);
        setLongElement(term175, 24, 127293266625536L);
        setLongElement(term175, 25, 127293265779920L);
        setLongElement(term175, 26, 34363745472L);
        setLongElement(term175, 27, 34364710216L);
        setLongElement(term175, 28, 34363745472L);
        setLongElement(term175, 29, 34363745472L);
        setLongElement(term175, 30, 34364896224L);
        setLongElement(term175, 31, 34363745472L);
        setElement(term42, 3, term175);
        setShortElement(term209, 0, (short) 2);
        setShortElement(term209, 1, (short) 12);
        setElement(term208, 0, term209);
        setIntElement(term242, 0, 1638400);
        setIntElement(term242, 1, 720907);
        setElement(term208, 1, term242);
        setElement(term275, 0, term276);
        setElement(term275, 1, term278);
        setElement(term208, 2, term275);
        setLongElement(term280, 0, 34363745472L);
        setLongElement(term280, 1, 34363745472L);
        setElement(term208, 3, term280);
        setElement(term42, 4, term208);
        setField(term41, term41.getClass(), "backtrace", term42);
        setField(term41, term41.getClass(), "detailMessage", "sjlJAEtRrb");
        setField(term41, term41.getClass(), "cause", term41);
        setField(term41, term41.getClass(), "stackTrace", term325);
        setIntField(term41, term41.getClass(), "depth", 34);
        setIntField(term327, term327.getClass(), "modCount", 0);
        setField(term41, term41.getClass(), "suppressedExceptions", term327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = term41;
        try {
            callMethod(klass, "wrapException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


