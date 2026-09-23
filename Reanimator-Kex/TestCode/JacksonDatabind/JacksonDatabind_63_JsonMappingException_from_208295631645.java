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

public class JsonMappingException_from_208295631645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18018;

    public JsonMappingException_from_208295631645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18087 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceValuesTask");
        Class<? extends Object> term18090 = Class.forName((String) "java.io.FileFilter");
        Class<? extends Object> term18092 = Class.forName((String) "java.util.stream.DistinctOps$1$2");
        Class<? extends Object> term18096 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.WritableObjectId");
        Class<? extends Object> term18101 = Class.forName((String) "java.nio.file.FileChannelLinesSpliterator$1");
        Class<? extends Object> term18105 = Class.forName((String) "java.lang.reflect.InvocationHandler");
        Class<? extends Object> term18109 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver");
        Class<? extends Object> term18113 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer");
        Class<? extends Object> term18117 = Class.forName((String) "java.lang.annotation.Inherited");
        Class<? extends Object> term18121 = Class.forName((String) "java.util.stream.Sink$ChainedReference");
        Class<? extends Object> term18125 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class<? extends Object> term18129 = Class.forName((String) "com.fasterxml.jackson.core.Versioned");
        Class<? extends Object> term18133 = Class.forName((String) "java.util.regex.Pattern$BackRef");
        Class<? extends Object> term18137 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForEachValueTask");
        Class<? extends Object> term18139 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonBackReference");
        Class<? extends Object> term18142 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonCreator");
        Class<? extends Object> term18144 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.EnumSetSerializer");
        Class<? extends Object> term18146 = Class.forName((String) "java.lang.invoke.StringConcatException");
        Class<? extends Object> term18249 = Class.forName((String) "java.util.stream.DoublePipeline$8$1");
        Class<? extends Object> term18251 = Class.forName((String) "java.util.Collections$UnmodifiableNavigableSet");
        term18018 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term18019 = (Object[]) newArray("java.lang.Object", 5);
        short[] term18020 = (short[]) newShortArray(32);
        int[] term18053 = (int[]) newIntArray(32);
        Object[] term18086 = (Object[]) newArray("java.lang.Object", 32);
        long[] term18148 = (long[]) newLongArray(32);
        Object[] term18181 = (Object[]) newArray("java.lang.Object", 5);
        short[] term18182 = (short[]) newShortArray(32);
        int[] term18215 = (int[]) newIntArray(32);
        Object[] term18248 = (Object[]) newArray("java.lang.Object", 32);
        long[] term18253 = (long[]) newLongArray(32);
        Object[] term18298 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term18300 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term18020, 0, (short) 1);
        setShortElement(term18020, 1, (short) 2);
        setShortElement(term18020, 2, (short) 1);
        setShortElement(term18020, 3, (short) 7);
        setShortElement(term18020, 4, (short) 2);
        setShortElement(term18020, 5, (short) 1);
        setShortElement(term18020, 6, (short) 6);
        setShortElement(term18020, 7, (short) 2);
        setShortElement(term18020, 8, (short) 10);
        setShortElement(term18020, 9, (short) 11);
        setShortElement(term18020, 10, (short) 29);
        setShortElement(term18020, 11, (short) 5);
        setShortElement(term18020, 12, (short) 4);
        setShortElement(term18020, 13, (short) 6);
        setShortElement(term18020, 14, (short) 8);
        setShortElement(term18020, 15, (short) 6);
        setShortElement(term18020, 16, (short) 9);
        setShortElement(term18020, 17, (short) 10);
        setShortElement(term18020, 18, (short) 11);
        setShortElement(term18020, 19, (short) 4);
        setShortElement(term18020, 20, (short) 1);
        setShortElement(term18020, 22, (short) 10);
        setShortElement(term18020, 23, (short) 3);
        setShortElement(term18020, 24, (short) 4);
        setShortElement(term18020, 25, (short) 4);
        setShortElement(term18020, 26, (short) 1);
        setShortElement(term18020, 27, (short) 2);
        setShortElement(term18020, 28, (short) 3);
        setShortElement(term18020, 29, (short) 3);
        setShortElement(term18020, 30, (short) 13);
        setShortElement(term18020, 31, (short) 1);
        setElement(term18019, 0, term18020);
        setIntElement(term18053, 1, 5570560);
        setIntElement(term18053, 2, 327680);
        setIntElement(term18053, 3, 4456454);
        setIntElement(term18053, 4, 1769472);
        setIntElement(term18053, 5, 14876672);
        setIntElement(term18053, 6, 6225920);
        setIntElement(term18053, 7, 917504);
        setIntElement(term18053, 8, 327680);
        setIntElement(term18053, 9, 8519680);
        setIntElement(term18053, 10, 917504);
        setIntElement(term18053, 11, 11993088);
        setIntElement(term18053, 12, 655360);
        setIntElement(term18053, 13, 7864320);
        setIntElement(term18053, 14, 3735552);
        setIntElement(term18053, 15, 7143424);
        setIntElement(term18053, 16, 8454144);
        setIntElement(term18053, 17, 9240576);
        setIntElement(term18053, 18, 196608);
        setIntElement(term18053, 19, 3801088);
        setIntElement(term18053, 20, 786432);
        setIntElement(term18053, 21, 589824);
        setIntElement(term18053, 22, 17170432);
        setIntElement(term18053, 23, 1376256);
        setIntElement(term18053, 24, 5242880);
        setIntElement(term18053, 25, 2883584);
        setIntElement(term18053, 26, 20774912);
        setIntElement(term18053, 27, 262144);
        setIntElement(term18053, 28, 2555904);
        setIntElement(term18053, 29, 1835008);
        setIntElement(term18053, 30, 6029312);
        setIntElement(term18053, 31, 327680);
        setElement(term18019, 1, term18053);
        setElement(term18086, 0, term18087);
        setElement(term18086, 1, term18087);
        setElement(term18086, 2, term18090);
        setElement(term18086, 3, term18092);
        setElement(term18086, 4, term18096);
        setElement(term18086, 5, term18096);
        setElement(term18086, 6, term18101);
        setElement(term18086, 7, term18101);
        setElement(term18086, 8, term18105);
        setElement(term18086, 9, term18105);
        setElement(term18086, 10, term18105);
        setElement(term18086, 11, term18105);
        setElement(term18086, 12, term18105);
        setElement(term18086, 13, term18109);
        setElement(term18086, 14, term18109);
        setElement(term18086, 15, term18113);
        setElement(term18086, 16, term18113);
        setElement(term18086, 17, term18113);
        setElement(term18086, 18, term18113);
        setElement(term18086, 19, term18117);
        setElement(term18086, 20, term18117);
        setElement(term18086, 21, term18117);
        setElement(term18086, 22, term18121);
        setElement(term18086, 23, term18113);
        setElement(term18086, 24, term18125);
        setElement(term18086, 25, term18129);
        setElement(term18086, 26, term18133);
        setElement(term18086, 27, term18137);
        setElement(term18086, 28, term18139);
        setElement(term18086, 29, term18142);
        setElement(term18086, 30, term18144);
        setElement(term18086, 31, term18146);
        setElement(term18019, 2, term18086);
        setLongElement(term18148, 0, 34363746224L);
        setLongElement(term18148, 1, 34363775512L);
        setLongElement(term18148, 2, 34363775512L);
        setLongElement(term18148, 3, 34363775512L);
        setLongElement(term18148, 4, 137160187801520L);
        setLongElement(term18148, 5, 34364440080L);
        setLongElement(term18148, 6, 137160187868672L);
        setLongElement(term18148, 7, 137160187711024L);
        setLongElement(term18148, 8, 137160187710912L);
        setLongElement(term18148, 9, 137160187711056L);
        setLongElement(term18148, 10, 137160187755152L);
        setLongElement(term18148, 11, 34363766248L);
        setLongElement(term18148, 12, 34363766248L);
        setLongElement(term18148, 13, 137157266191152L);
        setLongElement(term18148, 14, 137157266191152L);
        setLongElement(term18148, 15, 137157266191008L);
        setLongElement(term18148, 16, 137157266235568L);
        setLongElement(term18148, 17, 137157266237216L);
        setLongElement(term18148, 18, 137157266237984L);
        setLongElement(term18148, 19, 137157263167376L);
        setLongElement(term18148, 20, 34363739368L);
        setLongElement(term18148, 21, 34363739368L);
        setLongElement(term18148, 22, 137157266189648L);
        setLongElement(term18148, 23, 34363829248L);
        setLongElement(term18148, 24, 137157263167376L);
        setLongElement(term18148, 25, 137157262310128L);
        setLongElement(term18148, 26, 34363745472L);
        setLongElement(term18148, 27, 34364710216L);
        setLongElement(term18148, 28, 34363745472L);
        setLongElement(term18148, 29, 34363745472L);
        setLongElement(term18148, 30, 34364896224L);
        setLongElement(term18148, 31, 34363745472L);
        setElement(term18019, 3, term18148);
        setShortElement(term18182, 0, (short) 2);
        setShortElement(term18182, 1, (short) 12);
        setElement(term18181, 0, term18182);
        setIntElement(term18215, 0, 1638400);
        setIntElement(term18215, 1, 720907);
        setElement(term18181, 1, term18215);
        setElement(term18248, 0, term18249);
        setElement(term18248, 1, term18251);
        setElement(term18181, 2, term18248);
        setLongElement(term18253, 0, 34363745472L);
        setLongElement(term18253, 1, 34363745472L);
        setElement(term18181, 3, term18253);
        setElement(term18019, 4, term18181);
        setField(term18018, term18018.getClass(), "backtrace", term18019);
        setField(term18018, term18018.getClass(), "detailMessage", "RkybSrpybU");
        setField(term18018, term18018.getClass(), "cause", term18018);
        setField(term18018, term18018.getClass(), "stackTrace", term18298);
        setIntField(term18018, term18018.getClass(), "depth", 34);
        setIntField(term18300, term18300.getClass(), "modCount", 0);
        setField(term18018, term18018.getClass(), "suppressedExceptions", term18300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term18018;
        try {
            callMethod(klass, "from", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


