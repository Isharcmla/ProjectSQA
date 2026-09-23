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

public class JsonMappingException_from_32020508972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155914;
     Object term159917;
     Object term159732;

    public JsonMappingException_from_32020508972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155914 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term159917 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term159917, term159917.getClass(), "_objectIds", null);
        setField(term159917, term159917.getClass(), "_objectIdResolvers", null);
        setField(term159917, term159917.getClass(), "_cache", null);
        setField(term159917, term159917.getClass(), "_factory", null);
        setField(term159917, term159917.getClass(), "_config", null);
        setIntField(term159917, term159917.getClass(), "_featureFlags", 0);
        setField(term159917, term159917.getClass(), "_view", null);
        setField(term159917, term159917.getClass(), "_parser", null);
        setField(term159917, term159917.getClass(), "_injectableValues", null);
        setField(term159917, term159917.getClass(), "_arrayBuilders", null);
        setField(term159917, term159917.getClass(), "_objectBuffer", null);
        setField(term159917, term159917.getClass(), "_dateFormat", null);
        setField(term159917, term159917.getClass(), "_attributes", null);
        setField(term159917, term159917.getClass(), "_currentType", null);
        Class<? extends Object> term159801 = Class.forName((String) "java.util.stream.SpinedBuffer$OfLong$1Splitr");
        Class<? extends Object> term159808 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$3");
        Class<? extends Object> term159812 = Class.forName((String) "java.lang.invoke.LambdaFormEditor");
        Class<? extends Object> term159815 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonValue");
        Class<? extends Object> term159819 = Class.forName((String) "java.lang.LiveStackFrameInfo");
        Class<? extends Object> term159823 = Class.forName((String) "java.util.ResourceBundle$BundleReference");
        Class<? extends Object> term159829 = Class.forName((String) "java.util.stream.SliceOps$2");
        Class<? extends Object> term159834 = Class.forName((String) "java.nio.ReadOnlyBufferException");
        Class<? extends Object> term159838 = Class.forName((String) "java.nio.channels.ScatteringByteChannel");
        Class<? extends Object> term159842 = Class.forName((String) "java.util.Spliterator");
        Class<? extends Object> term159846 = Class.forName((String) "java.util.stream.ReduceOps$2ReducingSink");
        Class<? extends Object> term159850 = Class.forName((String) "java.io.UTFDataFormatException");
        Class<? extends Object> term159854 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer");
        Class<? extends Object> term159857 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfDouble");
        Class<? extends Object> term159860 = Class.forName((String) "java.lang.SuppressWarnings");
        Class<? extends Object> term159864 = Class.forName((String) "java.util.stream.Nodes$DoubleArrayNode");
        Class<? extends Object> term159868 = Class.forName((String) "java.util.ResourceBundle$1");
        Class<? extends Object> term159871 = Class.forName((String) "java.lang.invoke.ClassSpecializer$1");
        Class<? extends Object> term159875 = Class.forName((String) "java.util.regex.PrintPattern");
        term159732 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term159733 = (Object[]) newArray("java.lang.Object", 5);
        short[] term159734 = (short[]) newShortArray(32);
        int[] term159767 = (int[]) newIntArray(32);
        Object[] term159800 = (Object[]) newArray("java.lang.Object", 32);
        long[] term159879 = (long[]) newLongArray(32);
        Object[] term159912 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term159914 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term159732, term159732.getClass(), "_path", null);
        setField(term159732, term159732.getClass(), "_processor", null);
        setField(term159732, term159732.getClass(), "_location", null);
        setShortElement(term159734, 0, (short) 8);
        setShortElement(term159734, 1, (short) 3);
        setShortElement(term159734, 5, (short) 27);
        setShortElement(term159734, 6, (short) 2);
        setShortElement(term159734, 7, (short) 3);
        setShortElement(term159734, 11, (short) 2);
        setShortElement(term159734, 12, (short) 4);
        setShortElement(term159734, 13, (short) 4);
        setShortElement(term159734, 14, (short) 3);
        setShortElement(term159734, 15, (short) 4);
        setShortElement(term159734, 16, (short) 4);
        setShortElement(term159734, 17, (short) 1);
        setShortElement(term159734, 18, (short) 2);
        setShortElement(term159734, 19, (short) 3);
        setShortElement(term159734, 20, (short) 3);
        setShortElement(term159734, 21, (short) 13);
        setShortElement(term159734, 22, (short) 1);
        setShortElement(term159734, 23, (short) 2);
        setShortElement(term159734, 24, (short) 12);
        setElement(term159733, 0, term159734);
        setIntElement(term159767, 0, 19529728);
        setIntElement(term159767, 2, 6553600);
        setIntElement(term159767, 3, 393216);
        setIntElement(term159767, 4, 3866630);
        setIntElement(term159767, 5, 1245184);
        setIntElement(term159767, 6, 3211264);
        setIntElement(term159767, 8, 6553600);
        setIntElement(term159767, 9, 393216);
        setIntElement(term159767, 10, 3866630);
        setIntElement(term159767, 11, 14352384);
        setIntElement(term159767, 12, 10354688);
        setIntElement(term159767, 13, 2883584);
        setIntElement(term159767, 14, 786432);
        setIntElement(term159767, 15, 1441792);
        setIntElement(term159767, 16, 7733248);
        setIntElement(term159767, 17, 20774912);
        setIntElement(term159767, 18, 262144);
        setIntElement(term159767, 19, 2555904);
        setIntElement(term159767, 20, 1835008);
        setIntElement(term159767, 21, 6029312);
        setIntElement(term159767, 22, 327680);
        setIntElement(term159767, 23, 1638400);
        setIntElement(term159767, 24, 720907);
        setElement(term159733, 1, term159767);
        setElement(term159800, 0, term159801);
        setElement(term159800, 1, term159808);
        setElement(term159800, 2, term159808);
        setElement(term159800, 3, term159812);
        setElement(term159800, 4, term159815);
        setElement(term159800, 5, term159819);
        setElement(term159800, 6, term159823);
        setElement(term159800, 7, term159808);
        setElement(term159800, 8, term159808);
        setElement(term159800, 9, term159812);
        setElement(term159800, 10, term159815);
        setElement(term159800, 11, term159829);
        setElement(term159800, 12, term159834);
        setElement(term159800, 13, term159838);
        setElement(term159800, 14, term159842);
        setElement(term159800, 15, term159846);
        setElement(term159800, 16, term159838);
        setElement(term159800, 17, term159850);
        setElement(term159800, 18, term159854);
        setElement(term159800, 19, term159857);
        setElement(term159800, 20, term159860);
        setElement(term159800, 21, term159864);
        setElement(term159800, 22, term159868);
        setElement(term159800, 23, term159871);
        setElement(term159800, 24, term159875);
        setElement(term159733, 2, term159800);
        setLongElement(term159879, 0, 34363800864L);
        setLongElement(term159879, 1, 34364798256L);
        setLongElement(term159879, 2, 34363739368L);
        setLongElement(term159879, 3, 34363739368L);
        setLongElement(term159879, 4, 34363739368L);
        setLongElement(term159879, 5, 132578328998496L);
        setLongElement(term159879, 6, 34363820048L);
        setLongElement(term159879, 7, 34364798256L);
        setLongElement(term159879, 8, 34363739368L);
        setLongElement(term159879, 9, 34363739368L);
        setLongElement(term159879, 10, 34363739368L);
        setLongElement(term159879, 11, 132582552571296L);
        setLongElement(term159879, 12, 132582552640272L);
        setLongElement(term159879, 13, 132582550089488L);
        setLongElement(term159879, 14, 132582552759024L);
        setLongElement(term159879, 15, 132582550089488L);
        setLongElement(term159879, 16, 132582550089488L);
        setLongElement(term159879, 17, 34363745472L);
        setLongElement(term159879, 18, 34364710216L);
        setLongElement(term159879, 19, 34363745472L);
        setLongElement(term159879, 20, 34363745472L);
        setLongElement(term159879, 21, 34364896224L);
        setLongElement(term159879, 22, 34363745472L);
        setLongElement(term159879, 23, 34363745472L);
        setLongElement(term159879, 24, 34363745472L);
        setElement(term159733, 3, term159879);
        setField(term159732, term159732.getClass(), "backtrace", term159733);
        setField(term159732, term159732.getClass(), "detailMessage", null);
        setField(term159732, term159732.getClass(), "cause", term159732);
        setField(term159732, term159732.getClass(), "stackTrace", term159912);
        setIntField(term159732, term159732.getClass(), "depth", 25);
        setIntField(term159914, term159914.getClass(), "modCount", 0);
        setField(term159732, term159732.getClass(), "suppressedExceptions", term159914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term155914;
        args[1] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term155914, term159917));
        assertTrue(recursiveEquals(retValue, term159732));
    }

};


