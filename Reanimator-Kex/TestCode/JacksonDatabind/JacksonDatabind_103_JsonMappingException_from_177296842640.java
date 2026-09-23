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

public class JsonMappingException_from_177296842640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80645;

    public JsonMappingException_from_177296842640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80756 = Class.forName((String) "java.io.ObjectOutputStream$ReplaceTable");
        Class<? extends Object> term80763 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecycler");
        Class<? extends Object> term80766 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper");
        Class<? extends Object> term80768 = Class.forName((String) "java.nio.ShortBuffer");
        Class<? extends Object> term80772 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<? extends Object> term80776 = Class.forName((String) "java.util.stream.Nodes$LongArrayNode");
        Class<? extends Object> term80792 = Class.forName((String) "java.util.Collections$SingletonMap");
        Class<? extends Object> term80797 = Class.forName((String) "java.lang.invoke.InvokerBytecodeGenerator$2");
        Class<? extends Object> term80809 = Class.forName((String) "java.util.jar.JarException");
        Class<? extends Object> term80825 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityInfo");
        Class<? extends Object> term80841 = Class.forName((String) "java.util.concurrent.RunnableScheduledFuture");
        Class<? extends Object> term80845 = Class.forName((String) "java.util.TimerThread");
        Class<? extends Object> term80856 = Class.forName((String) "java.nio.HeapDoubleBuffer");
        Class<? extends Object> term80874 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class<? extends Object> term80888 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Class<? extends Object> term80891 = Class.forName((String) "java.util.stream.SortedOps$DoubleSortingSink");
        Class<? extends Object> term80894 = Class.forName((String) "java.util.function.DoubleSupplier");
        Class<? extends Object> term80897 = Class.forName((String) "java.io.Console$3");
        Class<? extends Object> term80901 = Class.forName((String) "java.util.Collections$EmptyIterator");
        term80645 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term80646 = (Object[]) newArray("java.lang.Object", 5);
        short[] term80652 = (short[]) newShortArray(32);
        int[] term80722 = (int[]) newIntArray(32);
        Object[] term80755 = (Object[]) newArray("java.lang.Object", 32);
        long[] term80911 = (long[]) newLongArray(32);
        Object[] term80981 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term80985 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term80645, term80645.getClass(), "_path", null);
        setField(term80645, term80645.getClass(), "_processor", null);
        setField(term80645, term80645.getClass(), "_location", null);
        setShortElement(term80652, 0, (short) 14);
        setShortElement(term80652, 1, (short) 3);
        setShortElement(term80652, 5, (short) 33);
        setShortElement(term80652, 6, (short) 2);
        setShortElement(term80652, 7, (short) 3);
        setShortElement(term80652, 11, (short) 2);
        setShortElement(term80652, 12, (short) 4);
        setShortElement(term80652, 13, (short) 4);
        setShortElement(term80652, 14, (short) 3);
        setShortElement(term80652, 15, (short) 4);
        setShortElement(term80652, 16, (short) 4);
        setShortElement(term80652, 17, (short) 1);
        setShortElement(term80652, 18, (short) 2);
        setShortElement(term80652, 19, (short) 3);
        setShortElement(term80652, 20, (short) 3);
        setShortElement(term80652, 21, (short) 13);
        setShortElement(term80652, 22, (short) 1);
        setShortElement(term80652, 23, (short) 2);
        setShortElement(term80652, 24, (short) 12);
        setElement(term80646, 0, term80652);
        setIntElement(term80722, 0, 18743296);
        setIntElement(term80722, 2, 6553600);
        setIntElement(term80722, 3, 393216);
        setIntElement(term80722, 4, 3866630);
        setIntElement(term80722, 5, 1245184);
        setIntElement(term80722, 6, 3080192);
        setIntElement(term80722, 8, 6553600);
        setIntElement(term80722, 9, 393216);
        setIntElement(term80722, 10, 3866630);
        setIntElement(term80722, 11, 14352384);
        setIntElement(term80722, 12, 10354688);
        setIntElement(term80722, 13, 2883584);
        setIntElement(term80722, 14, 786432);
        setIntElement(term80722, 15, 1441792);
        setIntElement(term80722, 16, 7733248);
        setIntElement(term80722, 17, 20774912);
        setIntElement(term80722, 18, 262144);
        setIntElement(term80722, 19, 2555904);
        setIntElement(term80722, 20, 1835008);
        setIntElement(term80722, 21, 6029312);
        setIntElement(term80722, 22, 327680);
        setIntElement(term80722, 23, 1638400);
        setIntElement(term80722, 24, 720907);
        setElement(term80646, 1, term80722);
        setElement(term80755, 0, term80756);
        setElement(term80755, 1, term80763);
        setElement(term80755, 2, term80763);
        setElement(term80755, 3, term80766);
        setElement(term80755, 4, term80768);
        setElement(term80755, 5, term80772);
        setElement(term80755, 6, term80776);
        setElement(term80755, 7, term80763);
        setElement(term80755, 8, term80763);
        setElement(term80755, 9, term80766);
        setElement(term80755, 10, term80768);
        setElement(term80755, 11, term80792);
        setElement(term80755, 12, term80797);
        setElement(term80755, 13, term80809);
        setElement(term80755, 14, term80825);
        setElement(term80755, 15, term80841);
        setElement(term80755, 16, term80809);
        setElement(term80755, 17, term80845);
        setElement(term80755, 18, term80856);
        setElement(term80755, 19, term80874);
        setElement(term80755, 20, term80888);
        setElement(term80755, 21, term80891);
        setElement(term80755, 22, term80894);
        setElement(term80755, 23, term80897);
        setElement(term80755, 24, term80901);
        setElement(term80646, 2, term80755);
        setLongElement(term80911, 0, 34363800864L);
        setLongElement(term80911, 1, 34364798256L);
        setLongElement(term80911, 2, 34363739368L);
        setLongElement(term80911, 3, 34363739368L);
        setLongElement(term80911, 4, 34363739368L);
        setLongElement(term80911, 5, 132073603951184L);
        setLongElement(term80911, 6, 34363820048L);
        setLongElement(term80911, 7, 34364798256L);
        setLongElement(term80911, 8, 34363739368L);
        setLongElement(term80911, 9, 34363739368L);
        setLongElement(term80911, 10, 34363739368L);
        setLongElement(term80911, 11, 132077283560208L);
        setLongElement(term80911, 12, 132077283629184L);
        setLongElement(term80911, 13, 132077281112816L);
        setLongElement(term80911, 14, 132077283747392L);
        setLongElement(term80911, 15, 132077281112816L);
        setLongElement(term80911, 16, 132077281112816L);
        setLongElement(term80911, 17, 34363745472L);
        setLongElement(term80911, 18, 34364710216L);
        setLongElement(term80911, 19, 34363745472L);
        setLongElement(term80911, 20, 34363745472L);
        setLongElement(term80911, 21, 34364896224L);
        setLongElement(term80911, 22, 34363745472L);
        setLongElement(term80911, 23, 34363745472L);
        setLongElement(term80911, 24, 34363745472L);
        setElement(term80646, 3, term80911);
        setField(term80645, term80645.getClass(), "backtrace", term80646);
        setField(term80645, term80645.getClass(), "detailMessage", "LQFpaHEwXR");
        setField(term80645, term80645.getClass(), "cause", term80645);
        setField(term80645, term80645.getClass(), "stackTrace", term80981);
        setIntField(term80645, term80645.getClass(), "depth", 25);
        setIntField(term80985, term80985.getClass(), "modCount", 0);
        setField(term80645, term80645.getClass(), "suppressedExceptions", term80985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "LQFpaHEwXR";
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term80645));
    }

};


