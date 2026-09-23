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

public class JsonMappingException_init_71748431695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191619;

    public JsonMappingException_init_71748431695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191106 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term191150 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term190974 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term191106, term191106.getClass(), "cause", term191150);
        setField(term191106, term191106.getClass(), "stackTrace", term190974);
        setField(term191106, term191106.getClass(), "suppressedExceptions", null);
        setField(term191106, term191106.getClass(), "detailMessage", "");
        Class<? extends Object> term191624 = Class.forName((String) "java.nio.file.NoSuchFileException");
        Class<? extends Object> term191626 = Class.forName((String) "java.util.TimerTask");
        Class<? extends Object> term191627 = Class.forName((String) "java.nio.file.Files$1");
        Class<? extends Object> term191630 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedThreadFactory");
        Class<? extends Object> term191634 = Class.forName((String) "java.lang.Process$PipeInputStream");
        Class<? extends Object> term191638 = Class.forName((String) "java.io.ObjectInputFilter$Config");
        Class<? extends Object> term191640 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class<? extends Object> term191642 = Class.forName((String) "java.util.stream.Nodes$FixedNodeBuilder");
        Class<? extends Object> term191645 = Class.forName((String) "java.util.concurrent.atomic.DoubleAdder");
        Class<? extends Object> term191649 = Class.forName((String) "java.lang.Boolean");
        Class<? extends Object> term191652 = Class.forName((String) "java.nio.DirectLongBufferRS");
        Class<? extends Object> term191655 = Class.forName((String) "java.lang.Void");
        Class<? extends Object> term191658 = Class.forName((String) "java.io.FilePermissionCollection$1");
        Class<? extends Object> term191661 = Class.forName((String) "java.lang.reflect.Modifier");
        Class<? extends Object> term191664 = Class.forName((String) "java.lang.Character$CharacterCache");
        Class<? extends Object> term191666 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer");
        Class<? extends Object> term191668 = Class.forName((String) "kex.java.lang.Double");
        Class<? extends Object> term191671 = Class.forName((String) "java.util.Currency$CurrencyProperty");
        Class<? extends Object> term191674 = Class.forName((String) "java.util.concurrent.CompletableFuture$TaskSubmitter");
        Class<? extends Object> term191676 = Class.forName((String) "java.util.concurrent.PriorityBlockingQueue$Itr");
        Class<? extends Object> term191679 = Class.forName((String) "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        term191619 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term191620 = (Object[]) newArray("java.lang.Object", 5);
        short[] term191621 = (short[]) newShortArray(32);
        int[] term191622 = (int[]) newIntArray(32);
        Object[] term191623 = (Object[]) newArray("java.lang.Object", 32);
        long[] term191682 = (long[]) newLongArray(32);
        Object[] term191683 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term191684 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term191619, term191619.getClass(), "_path", null);
        setField(term191619, term191619.getClass(), "_processor", null);
        setField(term191619, term191619.getClass(), "_location", null);
        setShortElement(term191621, 0, (short) 1);
        setShortElement(term191621, 1, (short) 2);
        setShortElement(term191621, 2, (short) 1);
        setShortElement(term191621, 3, (short) 7);
        setShortElement(term191621, 4, (short) 14);
        setShortElement(term191621, 5, (short) 2);
        setShortElement(term191621, 6, (short) 3);
        setShortElement(term191621, 10, (short) 2);
        setShortElement(term191621, 11, (short) 4);
        setShortElement(term191621, 12, (short) 4);
        setShortElement(term191621, 13, (short) 3);
        setShortElement(term191621, 14, (short) 4);
        setShortElement(term191621, 15, (short) 4);
        setShortElement(term191621, 16, (short) 1);
        setShortElement(term191621, 17, (short) 2);
        setShortElement(term191621, 18, (short) 3);
        setShortElement(term191621, 19, (short) 3);
        setShortElement(term191621, 20, (short) 13);
        setShortElement(term191621, 21, (short) 1);
        setShortElement(term191621, 22, (short) 2);
        setShortElement(term191621, 23, (short) 12);
        setElement(term191620, 0, term191621);
        setIntElement(term191622, 1, 5570560);
        setIntElement(term191622, 2, 327680);
        setIntElement(term191622, 3, 4456454);
        setIntElement(term191622, 4, 851968);
        setIntElement(term191622, 5, 3604480);
        setIntElement(term191622, 7, 6553600);
        setIntElement(term191622, 8, 393216);
        setIntElement(term191622, 9, 3866630);
        setIntElement(term191622, 10, 14352384);
        setIntElement(term191622, 11, 10354688);
        setIntElement(term191622, 12, 2883584);
        setIntElement(term191622, 13, 786432);
        setIntElement(term191622, 14, 1441792);
        setIntElement(term191622, 15, 7733248);
        setIntElement(term191622, 16, 20774912);
        setIntElement(term191622, 17, 262144);
        setIntElement(term191622, 18, 2555904);
        setIntElement(term191622, 19, 1835008);
        setIntElement(term191622, 20, 6029312);
        setIntElement(term191622, 21, 327680);
        setIntElement(term191622, 22, 1638400);
        setIntElement(term191622, 23, 720907);
        setElement(term191620, 1, term191622);
        setElement(term191623, 0, term191624);
        setElement(term191623, 1, term191624);
        setElement(term191623, 2, term191626);
        setElement(term191623, 3, term191627);
        setElement(term191623, 4, term191630);
        setElement(term191623, 5, term191634);
        setElement(term191623, 6, term191638);
        setElement(term191623, 7, term191638);
        setElement(term191623, 8, term191640);
        setElement(term191623, 9, term191642);
        setElement(term191623, 10, term191645);
        setElement(term191623, 11, term191649);
        setElement(term191623, 12, term191652);
        setElement(term191623, 13, term191655);
        setElement(term191623, 14, term191658);
        setElement(term191623, 15, term191652);
        setElement(term191623, 16, term191661);
        setElement(term191623, 17, term191664);
        setElement(term191623, 18, term191666);
        setElement(term191623, 19, term191668);
        setElement(term191623, 20, term191671);
        setElement(term191623, 21, term191674);
        setElement(term191623, 22, term191676);
        setElement(term191623, 23, term191679);
        setElement(term191620, 2, term191623);
        setLongElement(term191682, 0, 34363746224L);
        setLongElement(term191682, 1, 34363775512L);
        setLongElement(term191682, 2, 34363775512L);
        setLongElement(term191682, 3, 34363775512L);
        setLongElement(term191682, 4, 132578326060064L);
        setLongElement(term191682, 5, 34363820048L);
        setLongElement(term191682, 6, 34364798256L);
        setLongElement(term191682, 7, 34363739368L);
        setLongElement(term191682, 8, 34363739368L);
        setLongElement(term191682, 9, 34363739368L);
        setLongElement(term191682, 10, 132582552571296L);
        setLongElement(term191682, 11, 132582552640272L);
        setLongElement(term191682, 12, 132582550089488L);
        setLongElement(term191682, 13, 132582552759024L);
        setLongElement(term191682, 14, 132582550089488L);
        setLongElement(term191682, 15, 132582550089488L);
        setLongElement(term191682, 16, 34363745472L);
        setLongElement(term191682, 17, 34364710216L);
        setLongElement(term191682, 18, 34363745472L);
        setLongElement(term191682, 19, 34363745472L);
        setLongElement(term191682, 20, 34364896224L);
        setLongElement(term191682, 21, 34363745472L);
        setLongElement(term191682, 22, 34363745472L);
        setLongElement(term191682, 23, 34363745472L);
        setElement(term191620, 3, term191682);
        setField(term191619, term191619.getClass(), "backtrace", term191620);
        setField(term191619, term191619.getClass(), "detailMessage", null);
        setField(term191619, term191619.getClass(), "cause", term191619);
        setField(term191619, term191619.getClass(), "stackTrace", term191683);
        setIntField(term191619, term191619.getClass(), "depth", 24);
        setIntField(term191684, term191684.getClass(), "modCount", 0);
        setField(term191619, term191619.getClass(), "suppressedExceptions", term191684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term191619));
    }

};


