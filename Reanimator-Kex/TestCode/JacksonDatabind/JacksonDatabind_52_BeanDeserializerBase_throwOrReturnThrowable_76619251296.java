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

public class BeanDeserializerBase_throwOrReturnThrowable_76619251296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6746;

    public BeanDeserializerBase_throwOrReturnThrowable_76619251296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6815 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.ShortGenerator");
        Class<? extends Object> term6818 = Class.forName((String) "java.util.stream.SortedOps$LongSortingSink");
        Class<? extends Object> term6820 = Class.forName((String) "java.nio.channels.MulticastChannel");
        Class<? extends Object> term6824 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForEachTransformedKeyTask");
        Class<? extends Object> term6829 = Class.forName((String) "java.lang.module.ModuleReference");
        Class<? extends Object> term6833 = Class.forName((String) "com.fasterxml.jackson.core.Base64Variants");
        Class<? extends Object> term6837 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceEntriesTask");
        Class<? extends Object> term6841 = Class.forName((String) "java.util.FormatterClosedException");
        Class<? extends Object> term6845 = Class.forName((String) "java.util.Vector");
        Class<? extends Object> term6849 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$CSLMSpliterator");
        Class<? extends Object> term6853 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Class<? extends Object> term6857 = Class.forName((String) "java.util.Objects");
        Class<? extends Object> term6861 = Class.forName((String) "java.util.stream.Nodes$DoubleSpinedNodeBuilder");
        Class<? extends Object> term6865 = Class.forName((String) "java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        Class<? extends Object> term6867 = Class.forName((String) "java.util.regex.Pattern$NFCCharProperty");
        Class<? extends Object> term6870 = Class.forName((String) "java.lang.invoke.VarHandleObjects");
        Class<? extends Object> term6872 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase");
        Class<? extends Object> term6874 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend");
        Class<? extends Object> term6977 = Class.forName((String) "com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class<? extends Object> term6979 = Class.forName((String) "java.lang.annotation.Repeatable");
        term6746 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6747 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6748 = (short[]) newShortArray(32);
        int[] term6781 = (int[]) newIntArray(32);
        Object[] term6814 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6876 = (long[]) newLongArray(32);
        Object[] term6909 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6910 = (short[]) newShortArray(32);
        int[] term6943 = (int[]) newIntArray(32);
        Object[] term6976 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6981 = (long[]) newLongArray(32);
        Object[] term7026 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term7028 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6748, 0, (short) 1);
        setShortElement(term6748, 1, (short) 2);
        setShortElement(term6748, 2, (short) 1);
        setShortElement(term6748, 3, (short) 7);
        setShortElement(term6748, 4, (short) 2);
        setShortElement(term6748, 5, (short) 1);
        setShortElement(term6748, 6, (short) 6);
        setShortElement(term6748, 7, (short) 2);
        setShortElement(term6748, 8, (short) 10);
        setShortElement(term6748, 9, (short) 11);
        setShortElement(term6748, 10, (short) 29);
        setShortElement(term6748, 11, (short) 5);
        setShortElement(term6748, 12, (short) 4);
        setShortElement(term6748, 13, (short) 5);
        setShortElement(term6748, 14, (short) 6);
        setShortElement(term6748, 15, (short) 6);
        setShortElement(term6748, 16, (short) 9);
        setShortElement(term6748, 17, (short) 10);
        setShortElement(term6748, 18, (short) 11);
        setShortElement(term6748, 19, (short) 4);
        setShortElement(term6748, 20, (short) 1);
        setShortElement(term6748, 23, (short) 3);
        setShortElement(term6748, 24, (short) 4);
        setShortElement(term6748, 25, (short) 9);
        setShortElement(term6748, 26, (short) 1);
        setShortElement(term6748, 27, (short) 2);
        setShortElement(term6748, 28, (short) 3);
        setShortElement(term6748, 29, (short) 3);
        setShortElement(term6748, 30, (short) 13);
        setShortElement(term6748, 31, (short) 1);
        setElement(term6747, 0, term6748);
        setIntElement(term6781, 1, 5570560);
        setIntElement(term6781, 2, 327680);
        setIntElement(term6781, 3, 4456454);
        setIntElement(term6781, 4, 1769472);
        setIntElement(term6781, 5, 14876672);
        setIntElement(term6781, 6, 6225920);
        setIntElement(term6781, 7, 917504);
        setIntElement(term6781, 8, 327680);
        setIntElement(term6781, 9, 8519680);
        setIntElement(term6781, 10, 917504);
        setIntElement(term6781, 11, 11993088);
        setIntElement(term6781, 12, 655360);
        setIntElement(term6781, 13, 7864320);
        setIntElement(term6781, 14, 3735552);
        setIntElement(term6781, 15, 7143424);
        setIntElement(term6781, 16, 8454144);
        setIntElement(term6781, 17, 9240576);
        setIntElement(term6781, 18, 196608);
        setIntElement(term6781, 19, 3801088);
        setIntElement(term6781, 20, 786432);
        setIntElement(term6781, 21, 589824);
        setIntElement(term6781, 22, 17170432);
        setIntElement(term6781, 23, 1376256);
        setIntElement(term6781, 24, 5242880);
        setIntElement(term6781, 25, 2883584);
        setIntElement(term6781, 26, 20774912);
        setIntElement(term6781, 27, 262144);
        setIntElement(term6781, 28, 2555904);
        setIntElement(term6781, 29, 1835008);
        setIntElement(term6781, 30, 6029312);
        setIntElement(term6781, 31, 327680);
        setElement(term6747, 1, term6781);
        setElement(term6814, 0, term6815);
        setElement(term6814, 1, term6815);
        setElement(term6814, 2, term6818);
        setElement(term6814, 3, term6820);
        setElement(term6814, 4, term6824);
        setElement(term6814, 5, term6824);
        setElement(term6814, 6, term6829);
        setElement(term6814, 7, term6829);
        setElement(term6814, 8, term6833);
        setElement(term6814, 9, term6833);
        setElement(term6814, 10, term6833);
        setElement(term6814, 11, term6833);
        setElement(term6814, 12, term6833);
        setElement(term6814, 13, term6837);
        setElement(term6814, 14, term6837);
        setElement(term6814, 15, term6841);
        setElement(term6814, 16, term6841);
        setElement(term6814, 17, term6841);
        setElement(term6814, 18, term6841);
        setElement(term6814, 19, term6845);
        setElement(term6814, 20, term6845);
        setElement(term6814, 21, term6845);
        setElement(term6814, 22, term6849);
        setElement(term6814, 23, term6841);
        setElement(term6814, 24, term6853);
        setElement(term6814, 25, term6857);
        setElement(term6814, 26, term6861);
        setElement(term6814, 27, term6865);
        setElement(term6814, 28, term6867);
        setElement(term6814, 29, term6870);
        setElement(term6814, 30, term6872);
        setElement(term6814, 31, term6874);
        setElement(term6747, 2, term6814);
        setLongElement(term6876, 0, 34363746224L);
        setLongElement(term6876, 1, 34363775512L);
        setLongElement(term6876, 2, 34363775512L);
        setLongElement(term6876, 3, 34363775512L);
        setLongElement(term6876, 4, 131202531099536L);
        setLongElement(term6876, 5, 34364440080L);
        setLongElement(term6876, 6, 131202531166688L);
        setLongElement(term6876, 7, 131202530692736L);
        setLongElement(term6876, 8, 131202530692624L);
        setLongElement(term6876, 9, 131202530692768L);
        setLongElement(term6876, 10, 131202531053120L);
        setLongElement(term6876, 11, 34363766248L);
        setLongElement(term6876, 12, 34363766248L);
        setLongElement(term6876, 13, 131199477050448L);
        setLongElement(term6876, 14, 131199477050448L);
        setLongElement(term6876, 15, 131199477050304L);
        setLongElement(term6876, 16, 131199477094864L);
        setLongElement(term6876, 17, 131199477096512L);
        setLongElement(term6876, 18, 131199477097280L);
        setLongElement(term6876, 19, 131199474021968L);
        setLongElement(term6876, 20, 34363739368L);
        setLongElement(term6876, 21, 34363739368L);
        setLongElement(term6876, 22, 131199477048944L);
        setLongElement(term6876, 23, 34363829248L);
        setLongElement(term6876, 24, 131199474021968L);
        setLongElement(term6876, 25, 131202527864080L);
        setLongElement(term6876, 26, 34363745472L);
        setLongElement(term6876, 27, 34364710216L);
        setLongElement(term6876, 28, 34363745472L);
        setLongElement(term6876, 29, 34363745472L);
        setLongElement(term6876, 30, 34364896224L);
        setLongElement(term6876, 31, 34363745472L);
        setElement(term6747, 3, term6876);
        setShortElement(term6910, 0, (short) 2);
        setShortElement(term6910, 1, (short) 12);
        setElement(term6909, 0, term6910);
        setIntElement(term6943, 0, 1638400);
        setIntElement(term6943, 1, 720907);
        setElement(term6909, 1, term6943);
        setElement(term6976, 0, term6977);
        setElement(term6976, 1, term6979);
        setElement(term6909, 2, term6976);
        setLongElement(term6981, 0, 34363745472L);
        setLongElement(term6981, 1, 34363745472L);
        setElement(term6909, 3, term6981);
        setElement(term6747, 4, term6909);
        setField(term6746, term6746.getClass(), "backtrace", term6747);
        setField(term6746, term6746.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term6746, term6746.getClass(), "cause", term6746);
        setField(term6746, term6746.getClass(), "stackTrace", term7026);
        setIntField(term6746, term6746.getClass(), "depth", 34);
        setIntField(term7028, term7028.getClass(), "modCount", 0);
        setField(term6746, term6746.getClass(), "suppressedExceptions", term7028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[2];
        args[0] = term6746;
        args[1] = null;
        try {
            callMethod(klass, "throwOrReturnThrowable", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


