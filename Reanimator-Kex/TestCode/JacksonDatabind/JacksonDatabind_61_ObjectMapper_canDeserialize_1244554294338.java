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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ObjectMapper_canDeserialize_1244554294338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2761;

    public ObjectMapper_canDeserialize_1244554294338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2831 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor");
        Class<? extends Object> term2833 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonView");
        Class<? extends Object> term2835 = Class.forName((String) "java.lang.Boolean");
        Class<? extends Object> term2837 = Class.forName((String) "java.io.EOFException");
        Class<? extends Object> term2839 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeySetView");
        Class<? extends Object> term2841 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash");
        Class<? extends Object> term2843 = Class.forName((String) "java.lang.annotation.AnnotationFormatError");
        Class<? extends Object> term2845 = Class.forName((String) "java.util.TreeMap$DescendingKeySpliterator");
        Class<? extends Object> term2847 = Class.forName((String) "java.io.PrintWriter");
        Class<? extends Object> term2849 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes");
        Class<? extends Object> term2851 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceValuesToIntTask");
        Class<? extends Object> term2853 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer");
        Class<? extends Object> term2855 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer");
        Class<? extends Object> term2857 = Class.forName((String) "com.fasterxml.jackson.databind.util.TypeKey");
        Class<? extends Object> term2859 = Class.forName((String) "java.nio.channels.AlreadyConnectedException");
        term2761 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2762 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term2763 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2764 = (short[]) newShortArray(32);
        int[] term2797 = (int[]) newIntArray(32);
        Object[] term2830 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2861 = (long[]) newLongArray(32);
        Object[] term2894 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2895 = (short[]) newShortArray(32);
        int[] term2928 = (int[]) newIntArray(32);
        Object[] term2961 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2962 = (long[]) newLongArray(32);
        Object[] term3007 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3009 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term2764, 0, (short) 1);
        setShortElement(term2764, 1, (short) 2);
        setShortElement(term2764, 2, (short) 1);
        setShortElement(term2764, 3, (short) 7);
        setShortElement(term2764, 4, (short) 2);
        setShortElement(term2764, 5, (short) 1);
        setShortElement(term2764, 6, (short) 6);
        setShortElement(term2764, 7, (short) 2);
        setShortElement(term2764, 8, (short) 10);
        setShortElement(term2764, 9, (short) 11);
        setShortElement(term2764, 10, (short) 29);
        setShortElement(term2764, 11, (short) 5);
        setShortElement(term2764, 12, (short) 19);
        setShortElement(term2764, 13, (short) 29);
        setShortElement(term2764, 14, (short) 5);
        setShortElement(term2764, 15, (short) 4);
        setShortElement(term2764, 16, (short) 6);
        setShortElement(term2764, 17, (short) 8);
        setShortElement(term2764, 18, (short) 6);
        setShortElement(term2764, 19, (short) 9);
        setShortElement(term2764, 20, (short) 10);
        setShortElement(term2764, 21, (short) 11);
        setShortElement(term2764, 22, (short) 4);
        setShortElement(term2764, 23, (short) 1);
        setShortElement(term2764, 25, (short) 10);
        setShortElement(term2764, 26, (short) 3);
        setShortElement(term2764, 27, (short) 4);
        setShortElement(term2764, 28, (short) 9);
        setShortElement(term2764, 29, (short) 1);
        setShortElement(term2764, 30, (short) 2);
        setShortElement(term2764, 31, (short) 3);
        setElement(term2763, 0, term2764);
        setIntElement(term2797, 1, 5570560);
        setIntElement(term2797, 2, 327680);
        setIntElement(term2797, 3, 4456454);
        setIntElement(term2797, 4, 1769472);
        setIntElement(term2797, 5, 14876672);
        setIntElement(term2797, 6, 6225920);
        setIntElement(term2797, 7, 917504);
        setIntElement(term2797, 8, 327680);
        setIntElement(term2797, 9, 8519680);
        setIntElement(term2797, 10, 917504);
        setIntElement(term2797, 11, 11993088);
        setIntElement(term2797, 12, 38010880);
        setIntElement(term2797, 13, 2162688);
        setIntElement(term2797, 14, 11993088);
        setIntElement(term2797, 15, 655360);
        setIntElement(term2797, 16, 7864320);
        setIntElement(term2797, 17, 3735552);
        setIntElement(term2797, 18, 7143424);
        setIntElement(term2797, 19, 8454144);
        setIntElement(term2797, 20, 9240576);
        setIntElement(term2797, 21, 196608);
        setIntElement(term2797, 22, 3801088);
        setIntElement(term2797, 23, 786432);
        setIntElement(term2797, 24, 589824);
        setIntElement(term2797, 25, 17170432);
        setIntElement(term2797, 26, 1376256);
        setIntElement(term2797, 27, 5242880);
        setIntElement(term2797, 28, 2883584);
        setIntElement(term2797, 29, 20774912);
        setIntElement(term2797, 30, 262144);
        setIntElement(term2797, 31, 2555904);
        setElement(term2763, 1, term2797);
        setElement(term2830, 0, term2831);
        setElement(term2830, 1, term2831);
        setElement(term2830, 2, term2833);
        setElement(term2830, 3, term2835);
        setElement(term2830, 4, term2837);
        setElement(term2830, 5, term2837);
        setElement(term2830, 6, term2839);
        setElement(term2830, 7, term2839);
        setElement(term2830, 8, term2841);
        setElement(term2830, 9, term2841);
        setElement(term2830, 10, term2841);
        setElement(term2830, 11, term2841);
        setElement(term2830, 12, term2841);
        setElement(term2830, 13, term2841);
        setElement(term2830, 14, term2841);
        setElement(term2830, 15, term2841);
        setElement(term2830, 16, term2843);
        setElement(term2830, 17, term2843);
        setElement(term2830, 18, term2845);
        setElement(term2830, 19, term2845);
        setElement(term2830, 20, term2845);
        setElement(term2830, 21, term2845);
        setElement(term2830, 22, term2847);
        setElement(term2830, 23, term2847);
        setElement(term2830, 24, term2847);
        setElement(term2830, 25, term2849);
        setElement(term2830, 26, term2845);
        setElement(term2830, 27, term2851);
        setElement(term2830, 28, term2853);
        setElement(term2830, 29, term2855);
        setElement(term2830, 30, term2857);
        setElement(term2830, 31, term2859);
        setElement(term2763, 2, term2830);
        setLongElement(term2861, 0, 34363746224L);
        setLongElement(term2861, 1, 34363775512L);
        setLongElement(term2861, 2, 34363775512L);
        setLongElement(term2861, 3, 34363775512L);
        setLongElement(term2861, 4, 135646681335552L);
        setLongElement(term2861, 5, 34364440080L);
        setLongElement(term2861, 6, 135646681402704L);
        setLongElement(term2861, 7, 135646680627248L);
        setLongElement(term2861, 8, 135646680627136L);
        setLongElement(term2861, 9, 135646680627280L);
        setLongElement(term2861, 10, 135646681256384L);
        setLongElement(term2861, 11, 34363766248L);
        setLongElement(term2861, 12, 135646681253904L);
        setLongElement(term2861, 13, 135646681256384L);
        setLongElement(term2861, 14, 34363766248L);
        setLongElement(term2861, 15, 34363766248L);
        setLongElement(term2861, 16, 135643626119536L);
        setLongElement(term2861, 17, 135643626119536L);
        setLongElement(term2861, 18, 135643626119392L);
        setLongElement(term2861, 19, 135643626163952L);
        setLongElement(term2861, 20, 135643626165600L);
        setLongElement(term2861, 21, 135643626166368L);
        setLongElement(term2861, 22, 135643623098624L);
        setLongElement(term2861, 23, 34363739368L);
        setLongElement(term2861, 24, 34363739368L);
        setLongElement(term2861, 25, 135643626118032L);
        setLongElement(term2861, 26, 34363829248L);
        setLongElement(term2861, 27, 135643623098624L);
        setLongElement(term2861, 28, 135646677997472L);
        setLongElement(term2861, 29, 34363745472L);
        setLongElement(term2861, 30, 34364710216L);
        setLongElement(term2861, 31, 34363745472L);
        setElement(term2763, 3, term2861);
        setShortElement(term2895, 0, (short) 3);
        setShortElement(term2895, 1, (short) 13);
        setShortElement(term2895, 2, (short) 1);
        setShortElement(term2895, 3, (short) 2);
        setShortElement(term2895, 4, (short) 12);
        setElement(term2894, 0, term2895);
        setIntElement(term2928, 0, 1835008);
        setIntElement(term2928, 1, 6029312);
        setIntElement(term2928, 2, 327680);
        setIntElement(term2928, 3, 1638400);
        setIntElement(term2928, 4, 720907);
        setElement(term2894, 1, term2928);
        setElement(term2894, 2, term2961);
        setLongElement(term2962, 0, 34363745472L);
        setLongElement(term2962, 1, 34364896224L);
        setLongElement(term2962, 2, 34363745472L);
        setLongElement(term2962, 3, 34363745472L);
        setLongElement(term2962, 4, 34363745472L);
        setElement(term2894, 3, term2962);
        setElement(term2763, 4, term2894);
        setField(term2762, term2762.getClass(), "backtrace", term2763);
        setField(term2762, term2762.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term2762, term2762.getClass(), "cause", term2762);
        setField(term2762, term2762.getClass(), "stackTrace", term3007);
        setIntField(term2762, term2762.getClass(), "depth", 37);
        setIntField(term3009, term3009.getClass(), "modCount", 0);
        setField(term2762, term2762.getClass(), "suppressedExceptions", term3009);
        setField(term2761, term2761.getClass(), "value", term2762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.util.concurrent.atomic.AtomicReference");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2761;
        try {
            callMethod(klass, "canDeserialize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


