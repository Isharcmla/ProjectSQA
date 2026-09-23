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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_wrapWithPath_481861005162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284137;
     Object term288336;
     Object term288110;

    public JsonMappingException_wrapWithPath_481861005162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284137 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        term288336 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        setField(term288336, term288336.getClass(), "backtrace", null);
        setField(term288336, term288336.getClass(), "detailMessage", null);
        setField(term288336, term288336.getClass(), "cause", null);
        setField(term288336, term288336.getClass(), "stackTrace", null);
        setIntField(term288336, term288336.getClass(), "depth", 0);
        setField(term288336, term288336.getClass(), "suppressedExceptions", null);
        LinkedList term288111 = new LinkedList();
        ((LinkedList) term288111).add((Object)null);
        Class<? extends Object> term288183 = Class.forName((String) "java.util.concurrent.RunnableFuture");
        Class<? extends Object> term288190 = Class.forName((String) "java.lang.ProcessHandleImpl$ExitCompletion");
        Class<? extends Object> term288194 = Class.forName((String) "java.io.LineNumberReader");
        Class<? extends Object> term288197 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer");
        Class<? extends Object> term288201 = Class.forName((String) "java.util.concurrent.Executors$RunnableAdapter");
        Class<? extends Object> term288205 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Class<? extends Object> term288211 = Class.forName((String) "java.nio.file.DirectoryStream$Filter");
        Class<? extends Object> term288216 = Class.forName((String) "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket");
        Class<? extends Object> term288220 = Class.forName((String) "java.util.concurrent.atomic.DoubleAccumulator$SerializationProxy");
        Class<? extends Object> term288224 = Class.forName((String) "com.fasterxml.jackson.core.json.DupDetector");
        Class<? extends Object> term288228 = Class.forName((String) "java.util.function.IntToLongFunction");
        Class<? extends Object> term288232 = Class.forName((String) "java.util.function.BiFunction");
        Class<? extends Object> term288236 = Class.forName((String) "java.io.WriteAbortedException");
        Class<? extends Object> term288239 = Class.forName((String) "java.lang.Thread$WeakClassKey");
        Class<? extends Object> term288242 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter");
        Class<? extends Object> term288246 = Class.forName((String) "java.lang.invoke.InvokerBytecodeGenerator$BytecodeGenerationException");
        Class<? extends Object> term288250 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Sorter");
        Class<? extends Object> term288253 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<? extends Object> term288257 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty$PropertyReferring");
        term288110 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term288115 = (Object[]) newArray("java.lang.Object", 5);
        short[] term288116 = (short[]) newShortArray(32);
        int[] term288149 = (int[]) newIntArray(32);
        Object[] term288182 = (Object[]) newArray("java.lang.Object", 32);
        long[] term288261 = (long[]) newLongArray(32);
        Object term288105 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        Object[] term288332 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term288334 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term288110, term288110.getClass(), "_path", term288111);
        setField(term288110, term288110.getClass(), "_processor", null);
        setField(term288110, term288110.getClass(), "_location", null);
        setShortElement(term288116, 0, (short) 20);
        setShortElement(term288116, 1, (short) 3);
        setShortElement(term288116, 5, (short) 27);
        setShortElement(term288116, 6, (short) 2);
        setShortElement(term288116, 7, (short) 3);
        setShortElement(term288116, 11, (short) 2);
        setShortElement(term288116, 12, (short) 4);
        setShortElement(term288116, 13, (short) 4);
        setShortElement(term288116, 14, (short) 3);
        setShortElement(term288116, 15, (short) 4);
        setShortElement(term288116, 16, (short) 4);
        setShortElement(term288116, 17, (short) 1);
        setShortElement(term288116, 18, (short) 2);
        setShortElement(term288116, 19, (short) 3);
        setShortElement(term288116, 20, (short) 3);
        setShortElement(term288116, 21, (short) 13);
        setShortElement(term288116, 22, (short) 1);
        setShortElement(term288116, 23, (short) 2);
        setShortElement(term288116, 24, (short) 12);
        setElement(term288115, 0, term288116);
        setIntElement(term288149, 0, 128385024);
        setIntElement(term288149, 2, 6553600);
        setIntElement(term288149, 3, 393216);
        setIntElement(term288149, 4, 3866630);
        setIntElement(term288149, 5, 1245184);
        setIntElement(term288149, 6, 3211264);
        setIntElement(term288149, 8, 6553600);
        setIntElement(term288149, 9, 393216);
        setIntElement(term288149, 10, 3866630);
        setIntElement(term288149, 11, 14352384);
        setIntElement(term288149, 12, 10354688);
        setIntElement(term288149, 13, 2883584);
        setIntElement(term288149, 14, 786432);
        setIntElement(term288149, 15, 1441792);
        setIntElement(term288149, 16, 7733248);
        setIntElement(term288149, 17, 20774912);
        setIntElement(term288149, 18, 262144);
        setIntElement(term288149, 19, 2555904);
        setIntElement(term288149, 20, 1835008);
        setIntElement(term288149, 21, 6029312);
        setIntElement(term288149, 22, 327680);
        setIntElement(term288149, 23, 1638400);
        setIntElement(term288149, 24, 720907);
        setElement(term288115, 1, term288149);
        setElement(term288182, 0, term288183);
        setElement(term288182, 1, term288190);
        setElement(term288182, 2, term288190);
        setElement(term288182, 3, term288194);
        setElement(term288182, 4, term288197);
        setElement(term288182, 5, term288201);
        setElement(term288182, 6, term288205);
        setElement(term288182, 7, term288190);
        setElement(term288182, 8, term288190);
        setElement(term288182, 9, term288194);
        setElement(term288182, 10, term288197);
        setElement(term288182, 11, term288211);
        setElement(term288182, 12, term288216);
        setElement(term288182, 13, term288220);
        setElement(term288182, 14, term288224);
        setElement(term288182, 15, term288228);
        setElement(term288182, 16, term288220);
        setElement(term288182, 17, term288232);
        setElement(term288182, 18, term288236);
        setElement(term288182, 19, term288239);
        setElement(term288182, 20, term288242);
        setElement(term288182, 21, term288246);
        setElement(term288182, 22, term288250);
        setElement(term288182, 23, term288253);
        setElement(term288182, 24, term288257);
        setElement(term288115, 2, term288182);
        setLongElement(term288261, 0, 132578328546864L);
        setLongElement(term288261, 1, 34364798256L);
        setLongElement(term288261, 2, 34363739368L);
        setLongElement(term288261, 3, 34363739368L);
        setLongElement(term288261, 4, 34363739368L);
        setLongElement(term288261, 5, 132578328998496L);
        setLongElement(term288261, 6, 34363820048L);
        setLongElement(term288261, 7, 34364798256L);
        setLongElement(term288261, 8, 34363739368L);
        setLongElement(term288261, 9, 34363739368L);
        setLongElement(term288261, 10, 34363739368L);
        setLongElement(term288261, 11, 132582552571296L);
        setLongElement(term288261, 12, 132582552640272L);
        setLongElement(term288261, 13, 132582550089488L);
        setLongElement(term288261, 14, 132582552759024L);
        setLongElement(term288261, 15, 132582550089488L);
        setLongElement(term288261, 16, 132582550089488L);
        setLongElement(term288261, 17, 34363745472L);
        setLongElement(term288261, 18, 34364710216L);
        setLongElement(term288261, 19, 34363745472L);
        setLongElement(term288261, 20, 34363745472L);
        setLongElement(term288261, 21, 34364896224L);
        setLongElement(term288261, 22, 34363745472L);
        setLongElement(term288261, 23, 34363745472L);
        setLongElement(term288261, 24, 34363745472L);
        setElement(term288115, 3, term288261);
        setField(term288110, term288110.getClass(), "backtrace", term288115);
        setField(term288110, term288110.getClass(), "detailMessage", "(was java.io.UTFDataFormatException)");
        setField(term288105, term288105.getClass(), "backtrace", null);
        setField(term288105, term288105.getClass(), "detailMessage", null);
        setField(term288105, term288105.getClass(), "cause", null);
        setField(term288105, term288105.getClass(), "stackTrace", null);
        setIntField(term288105, term288105.getClass(), "depth", 0);
        setField(term288105, term288105.getClass(), "suppressedExceptions", null);
        setField(term288110, term288110.getClass(), "cause", term288105);
        setField(term288110, term288110.getClass(), "stackTrace", term288332);
        setIntField(term288110, term288110.getClass(), "depth", 25);
        setIntField(term288334, term288334.getClass(), "modCount", 0);
        setField(term288110, term288110.getClass(), "suppressedExceptions", term288334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term284137;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term284137, term288336));
        assertTrue(recursiveEquals(retValue, term288110));
    }

};


