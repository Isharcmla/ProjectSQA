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
import java.lang.Integer;

public class BeanDeserializerBase_wrapAndThrow_211907288995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616;
     Object term3900;
     Object term3901;

    public BeanDeserializerBase_wrapAndThrow_211907288995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3685 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Class<? extends Object> term3688 = Class.forName((String) "java.util.stream.Node$Builder$OfInt");
        Class<? extends Object> term3690 = Class.forName((String) "java.util.Arrays");
        Class<? extends Object> term3694 = Class.forName((String) "java.util.regex.Pattern$Conditional");
        Class<? extends Object> term3699 = Class.forName((String) "java.io.ByteArrayInputStream");
        Class<? extends Object> term3703 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver");
        Class<? extends Object> term3707 = Class.forName((String) "java.util.HashMap$EntryIterator");
        Class<? extends Object> term3711 = Class.forName((String) "java.util.stream.Streams$ConcatSpliterator$OfInt");
        Class<? extends Object> term3715 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfInt");
        Class<? extends Object> term3719 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
        Class<? extends Object> term3723 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base");
        Class<? extends Object> term3727 = Class.forName((String) "java.util.BitSet");
        Class<? extends Object> term3731 = Class.forName((String) "java.lang.Runtime");
        Class<? extends Object> term3735 = Class.forName((String) "java.nio.file.attribute.UserPrincipal");
        Class<? extends Object> term3737 = Class.forName((String) "java.util.Hashtable");
        Class<? extends Object> term3740 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldInstanceReadOnly");
        Class<? extends Object> term3742 = Class.forName((String) "java.lang.ProcessHandleImpl$Info");
        Class<? extends Object> term3744 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term3847 = Class.forName((String) "com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class<? extends Object> term3849 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForEachTransformedKeyTask");
        term3616 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3617 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3618 = (short[]) newShortArray(32);
        int[] term3651 = (int[]) newIntArray(32);
        Object[] term3684 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3746 = (long[]) newLongArray(32);
        Object[] term3779 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3780 = (short[]) newShortArray(32);
        int[] term3813 = (int[]) newIntArray(32);
        Object[] term3846 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3851 = (long[]) newLongArray(32);
        Object[] term3896 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3898 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3618, 0, (short) 1);
        setShortElement(term3618, 1, (short) 2);
        setShortElement(term3618, 2, (short) 1);
        setShortElement(term3618, 3, (short) 7);
        setShortElement(term3618, 4, (short) 2);
        setShortElement(term3618, 5, (short) 1);
        setShortElement(term3618, 6, (short) 6);
        setShortElement(term3618, 7, (short) 2);
        setShortElement(term3618, 8, (short) 10);
        setShortElement(term3618, 9, (short) 11);
        setShortElement(term3618, 10, (short) 29);
        setShortElement(term3618, 11, (short) 5);
        setShortElement(term3618, 12, (short) 4);
        setShortElement(term3618, 13, (short) 5);
        setShortElement(term3618, 14, (short) 6);
        setShortElement(term3618, 15, (short) 6);
        setShortElement(term3618, 16, (short) 9);
        setShortElement(term3618, 17, (short) 10);
        setShortElement(term3618, 18, (short) 11);
        setShortElement(term3618, 19, (short) 4);
        setShortElement(term3618, 20, (short) 1);
        setShortElement(term3618, 23, (short) 3);
        setShortElement(term3618, 24, (short) 4);
        setShortElement(term3618, 25, (short) 9);
        setShortElement(term3618, 26, (short) 1);
        setShortElement(term3618, 27, (short) 2);
        setShortElement(term3618, 28, (short) 3);
        setShortElement(term3618, 29, (short) 3);
        setShortElement(term3618, 30, (short) 13);
        setShortElement(term3618, 31, (short) 1);
        setElement(term3617, 0, term3618);
        setIntElement(term3651, 1, 5570560);
        setIntElement(term3651, 2, 327680);
        setIntElement(term3651, 3, 4456454);
        setIntElement(term3651, 4, 1769472);
        setIntElement(term3651, 5, 14876672);
        setIntElement(term3651, 6, 6225920);
        setIntElement(term3651, 7, 917504);
        setIntElement(term3651, 8, 327680);
        setIntElement(term3651, 9, 8519680);
        setIntElement(term3651, 10, 917504);
        setIntElement(term3651, 11, 11993088);
        setIntElement(term3651, 12, 655360);
        setIntElement(term3651, 13, 7864320);
        setIntElement(term3651, 14, 3735552);
        setIntElement(term3651, 15, 7143424);
        setIntElement(term3651, 16, 8454144);
        setIntElement(term3651, 17, 9240576);
        setIntElement(term3651, 18, 196608);
        setIntElement(term3651, 19, 3801088);
        setIntElement(term3651, 20, 786432);
        setIntElement(term3651, 21, 589824);
        setIntElement(term3651, 22, 17170432);
        setIntElement(term3651, 23, 1376256);
        setIntElement(term3651, 24, 5242880);
        setIntElement(term3651, 25, 2883584);
        setIntElement(term3651, 26, 20774912);
        setIntElement(term3651, 27, 262144);
        setIntElement(term3651, 28, 2555904);
        setIntElement(term3651, 29, 1835008);
        setIntElement(term3651, 30, 6029312);
        setIntElement(term3651, 31, 327680);
        setElement(term3617, 1, term3651);
        setElement(term3684, 0, term3685);
        setElement(term3684, 1, term3685);
        setElement(term3684, 2, term3688);
        setElement(term3684, 3, term3690);
        setElement(term3684, 4, term3694);
        setElement(term3684, 5, term3694);
        setElement(term3684, 6, term3699);
        setElement(term3684, 7, term3699);
        setElement(term3684, 8, term3703);
        setElement(term3684, 9, term3703);
        setElement(term3684, 10, term3703);
        setElement(term3684, 11, term3703);
        setElement(term3684, 12, term3703);
        setElement(term3684, 13, term3707);
        setElement(term3684, 14, term3707);
        setElement(term3684, 15, term3711);
        setElement(term3684, 16, term3711);
        setElement(term3684, 17, term3711);
        setElement(term3684, 18, term3711);
        setElement(term3684, 19, term3715);
        setElement(term3684, 20, term3715);
        setElement(term3684, 21, term3715);
        setElement(term3684, 22, term3719);
        setElement(term3684, 23, term3711);
        setElement(term3684, 24, term3723);
        setElement(term3684, 25, term3727);
        setElement(term3684, 26, term3731);
        setElement(term3684, 27, term3735);
        setElement(term3684, 28, term3737);
        setElement(term3684, 29, term3740);
        setElement(term3684, 30, term3742);
        setElement(term3684, 31, term3744);
        setElement(term3617, 2, term3684);
        setLongElement(term3746, 0, 34363746224L);
        setLongElement(term3746, 1, 34363775512L);
        setLongElement(term3746, 2, 34363775512L);
        setLongElement(term3746, 3, 34363775512L);
        setLongElement(term3746, 4, 131202531099536L);
        setLongElement(term3746, 5, 34364440080L);
        setLongElement(term3746, 6, 131202531166688L);
        setLongElement(term3746, 7, 131202530692736L);
        setLongElement(term3746, 8, 131202530692624L);
        setLongElement(term3746, 9, 131202530692768L);
        setLongElement(term3746, 10, 131202531053120L);
        setLongElement(term3746, 11, 34363766248L);
        setLongElement(term3746, 12, 34363766248L);
        setLongElement(term3746, 13, 131199477050448L);
        setLongElement(term3746, 14, 131199477050448L);
        setLongElement(term3746, 15, 131199477050304L);
        setLongElement(term3746, 16, 131199477094864L);
        setLongElement(term3746, 17, 131199477096512L);
        setLongElement(term3746, 18, 131199477097280L);
        setLongElement(term3746, 19, 131199474021968L);
        setLongElement(term3746, 20, 34363739368L);
        setLongElement(term3746, 21, 34363739368L);
        setLongElement(term3746, 22, 131199477048944L);
        setLongElement(term3746, 23, 34363829248L);
        setLongElement(term3746, 24, 131199474021968L);
        setLongElement(term3746, 25, 131202527864080L);
        setLongElement(term3746, 26, 34363745472L);
        setLongElement(term3746, 27, 34364710216L);
        setLongElement(term3746, 28, 34363745472L);
        setLongElement(term3746, 29, 34363745472L);
        setLongElement(term3746, 30, 34364896224L);
        setLongElement(term3746, 31, 34363745472L);
        setElement(term3617, 3, term3746);
        setShortElement(term3780, 0, (short) 2);
        setShortElement(term3780, 1, (short) 12);
        setElement(term3779, 0, term3780);
        setIntElement(term3813, 0, 1638400);
        setIntElement(term3813, 1, 720907);
        setElement(term3779, 1, term3813);
        setElement(term3846, 0, term3847);
        setElement(term3846, 1, term3849);
        setElement(term3779, 2, term3846);
        setLongElement(term3851, 0, 34363745472L);
        setLongElement(term3851, 1, 34363745472L);
        setElement(term3779, 3, term3851);
        setElement(term3617, 4, term3779);
        setField(term3616, term3616.getClass(), "backtrace", term3617);
        setField(term3616, term3616.getClass(), "detailMessage", "hRNSzYYIrc");
        setField(term3616, term3616.getClass(), "cause", term3616);
        setField(term3616, term3616.getClass(), "stackTrace", term3896);
        setIntField(term3616, term3616.getClass(), "depth", 34);
        setIntField(term3898, term3898.getClass(), "modCount", 0);
        setField(term3616, term3616.getClass(), "suppressedExceptions", term3898);
        term3900 = newInstance(Class.forName("java.lang.Object"));
        term3901 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[4];
        args[0] = term3616;
        args[1] = term3900;
        args[2] = term3901;
        args[3] = null;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


