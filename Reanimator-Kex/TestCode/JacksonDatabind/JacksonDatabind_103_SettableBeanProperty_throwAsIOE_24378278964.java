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

public class SettableBeanProperty_throwAsIOE_24378278964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3040;

    public SettableBeanProperty_throwAsIOE_24378278964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3109 = Class.forName((String) "java.util.stream.SpinedBuffer$OfPrimitive");
        Class<? extends Object> term3112 = Class.forName((String) "java.util.stream.DoubleStream");
        Class<? extends Object> term3114 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term3118 = Class.forName((String) "java.util.Spliterators$ArraySpliterator");
        Class<? extends Object> term3123 = Class.forName((String) "java.lang.Iterable");
        Class<? extends Object> term3127 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldStaticReadOnly");
        Class<? extends Object> term3131 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        Class<? extends Object> term3135 = Class.forName((String) "java.util.stream.IntPipeline$1");
        Class<? extends Object> term3139 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term3143 = Class.forName((String) "java.util.spi.CalendarNameProvider");
        Class<? extends Object> term3147 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        Class<? extends Object> term3151 = Class.forName((String) "java.nio.file.FileSystemLoopException");
        Class<? extends Object> term3155 = Class.forName((String) "java.lang.InstantiationException");
        Class<? extends Object> term3159 = Class.forName((String) "java.util.function.IntFunction");
        Class<? extends Object> term3162 = Class.forName((String) "java.util.EnumMap$1");
        Class<? extends Object> term3165 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
        Class<? extends Object> term3168 = Class.forName((String) "java.io.ObjectInputStream$Logging");
        Class<? extends Object> term3171 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        Class<? extends Object> term3275 = Class.forName((String) "java.util.EnumMap$ValueIterator");
        Class<? extends Object> term3277 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        term3040 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term3041 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3042 = (short[]) newShortArray(32);
        int[] term3075 = (int[]) newIntArray(32);
        Object[] term3108 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3174 = (long[]) newLongArray(32);
        Object[] term3207 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3208 = (short[]) newShortArray(32);
        int[] term3241 = (int[]) newIntArray(32);
        Object[] term3274 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3279 = (long[]) newLongArray(32);
        Object[] term3324 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3326 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3042, 0, (short) 1);
        setShortElement(term3042, 1, (short) 2);
        setShortElement(term3042, 2, (short) 1);
        setShortElement(term3042, 3, (short) 7);
        setShortElement(term3042, 4, (short) 2);
        setShortElement(term3042, 5, (short) 1);
        setShortElement(term3042, 6, (short) 6);
        setShortElement(term3042, 7, (short) 2);
        setShortElement(term3042, 8, (short) 10);
        setShortElement(term3042, 9, (short) 11);
        setShortElement(term3042, 10, (short) 29);
        setShortElement(term3042, 11, (short) 5);
        setShortElement(term3042, 12, (short) 4);
        setShortElement(term3042, 13, (short) 5);
        setShortElement(term3042, 14, (short) 6);
        setShortElement(term3042, 15, (short) 6);
        setShortElement(term3042, 16, (short) 9);
        setShortElement(term3042, 17, (short) 10);
        setShortElement(term3042, 18, (short) 11);
        setShortElement(term3042, 19, (short) 4);
        setShortElement(term3042, 20, (short) 1);
        setShortElement(term3042, 23, (short) 3);
        setShortElement(term3042, 24, (short) 4);
        setShortElement(term3042, 25, (short) 4);
        setShortElement(term3042, 26, (short) 1);
        setShortElement(term3042, 27, (short) 2);
        setShortElement(term3042, 28, (short) 3);
        setShortElement(term3042, 29, (short) 3);
        setShortElement(term3042, 30, (short) 13);
        setShortElement(term3042, 31, (short) 1);
        setElement(term3041, 0, term3042);
        setIntElement(term3075, 1, 5570560);
        setIntElement(term3075, 2, 327680);
        setIntElement(term3075, 3, 4456454);
        setIntElement(term3075, 4, 1769472);
        setIntElement(term3075, 5, 14876672);
        setIntElement(term3075, 6, 6225920);
        setIntElement(term3075, 7, 917504);
        setIntElement(term3075, 8, 327680);
        setIntElement(term3075, 9, 8519680);
        setIntElement(term3075, 10, 917504);
        setIntElement(term3075, 11, 11993088);
        setIntElement(term3075, 12, 655360);
        setIntElement(term3075, 13, 7864320);
        setIntElement(term3075, 14, 3735552);
        setIntElement(term3075, 15, 7143424);
        setIntElement(term3075, 16, 8454144);
        setIntElement(term3075, 17, 9240576);
        setIntElement(term3075, 18, 196608);
        setIntElement(term3075, 19, 3801088);
        setIntElement(term3075, 20, 786432);
        setIntElement(term3075, 21, 589824);
        setIntElement(term3075, 22, 17170432);
        setIntElement(term3075, 23, 1376256);
        setIntElement(term3075, 24, 5242880);
        setIntElement(term3075, 25, 2883584);
        setIntElement(term3075, 26, 20774912);
        setIntElement(term3075, 27, 262144);
        setIntElement(term3075, 28, 2555904);
        setIntElement(term3075, 29, 1835008);
        setIntElement(term3075, 30, 6029312);
        setIntElement(term3075, 31, 327680);
        setElement(term3041, 1, term3075);
        setElement(term3108, 0, term3109);
        setElement(term3108, 1, term3109);
        setElement(term3108, 2, term3112);
        setElement(term3108, 3, term3114);
        setElement(term3108, 4, term3118);
        setElement(term3108, 5, term3118);
        setElement(term3108, 6, term3123);
        setElement(term3108, 7, term3123);
        setElement(term3108, 8, term3127);
        setElement(term3108, 9, term3127);
        setElement(term3108, 10, term3127);
        setElement(term3108, 11, term3127);
        setElement(term3108, 12, term3127);
        setElement(term3108, 13, term3131);
        setElement(term3108, 14, term3131);
        setElement(term3108, 15, term3135);
        setElement(term3108, 16, term3135);
        setElement(term3108, 17, term3135);
        setElement(term3108, 18, term3135);
        setElement(term3108, 19, term3139);
        setElement(term3108, 20, term3139);
        setElement(term3108, 21, term3139);
        setElement(term3108, 22, term3143);
        setElement(term3108, 23, term3135);
        setElement(term3108, 24, term3147);
        setElement(term3108, 25, term3151);
        setElement(term3108, 26, term3155);
        setElement(term3108, 27, term3159);
        setElement(term3108, 28, term3162);
        setElement(term3108, 29, term3165);
        setElement(term3108, 30, term3168);
        setElement(term3108, 31, term3171);
        setElement(term3041, 2, term3108);
        setLongElement(term3174, 0, 34363746224L);
        setLongElement(term3174, 1, 34363775512L);
        setLongElement(term3174, 2, 34363775512L);
        setLongElement(term3174, 3, 34363775512L);
        setLongElement(term3174, 4, 134804263765536L);
        setLongElement(term3174, 5, 34364440080L);
        setLongElement(term3174, 6, 134804263832688L);
        setLongElement(term3174, 7, 134804263671680L);
        setLongElement(term3174, 8, 134804263671568L);
        setLongElement(term3174, 9, 134804263671712L);
        setLongElement(term3174, 10, 134804263719168L);
        setLongElement(term3174, 11, 34363766248L);
        setLongElement(term3174, 12, 34363766248L);
        setLongElement(term3174, 13, 134800737169776L);
        setLongElement(term3174, 14, 134800737169776L);
        setLongElement(term3174, 15, 134800737169632L);
        setLongElement(term3174, 16, 134800737173936L);
        setLongElement(term3174, 17, 134800737175584L);
        setLongElement(term3174, 18, 134800737176352L);
        setLongElement(term3174, 19, 134804265399984L);
        setLongElement(term3174, 20, 34363739368L);
        setLongElement(term3174, 21, 34363739368L);
        setLongElement(term3174, 22, 134800737127424L);
        setLongElement(term3174, 23, 34363829248L);
        setLongElement(term3174, 24, 134804265399984L);
        setLongElement(term3174, 25, 134800734005568L);
        setLongElement(term3174, 26, 34363745472L);
        setLongElement(term3174, 27, 34364710216L);
        setLongElement(term3174, 28, 34363745472L);
        setLongElement(term3174, 29, 34363745472L);
        setLongElement(term3174, 30, 34364896224L);
        setLongElement(term3174, 31, 34363745472L);
        setElement(term3041, 3, term3174);
        setShortElement(term3208, 0, (short) 2);
        setShortElement(term3208, 1, (short) 12);
        setElement(term3207, 0, term3208);
        setIntElement(term3241, 0, 1638400);
        setIntElement(term3241, 1, 720907);
        setElement(term3207, 1, term3241);
        setElement(term3274, 0, term3275);
        setElement(term3274, 1, term3277);
        setElement(term3207, 2, term3274);
        setLongElement(term3279, 0, 34363745472L);
        setLongElement(term3279, 1, 34363745472L);
        setElement(term3207, 3, term3279);
        setElement(term3041, 4, term3207);
        setField(term3040, term3040.getClass(), "backtrace", term3041);
        setField(term3040, term3040.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term3040, term3040.getClass(), "cause", term3040);
        setField(term3040, term3040.getClass(), "stackTrace", term3324);
        setIntField(term3040, term3040.getClass(), "depth", 34);
        setIntField(term3326, term3326.getClass(), "modCount", 0);
        setField(term3040, term3040.getClass(), "suppressedExceptions", term3326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3040;
        try {
            callMethod(klass, "_throwAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


