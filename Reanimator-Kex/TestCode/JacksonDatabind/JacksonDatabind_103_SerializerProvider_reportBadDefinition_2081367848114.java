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

public class SerializerProvider_reportBadDefinition_2081367848114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public SerializerProvider_reportBadDefinition_2081367848114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base");
        Class<? extends Object> term229 = Class.forName((String) "java.nio.channels.ClosedSelectorException");
        Class<? extends Object> term231 = Class.forName((String) "java.nio.file.FileSystemException");
        Class<? extends Object> term235 = Class.forName((String) "java.util.stream.ReduceOps$9ReducingSink");
        Class<? extends Object> term240 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom");
        Class<? extends Object> term244 = Class.forName((String) "java.io.ExpiringCache$1");
        Class<? extends Object> term248 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer");
        Class<? extends Object> term252 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$LoopClauses");
        Class<? extends Object> term256 = Class.forName((String) "java.util.stream.SpinedBuffer$OfPrimitive");
        Class<? extends Object> term260 = Class.forName((String) "java.util.stream.DoubleStream");
        Class<? extends Object> term264 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term268 = Class.forName((String) "java.util.Spliterators$ArraySpliterator");
        Class<? extends Object> term272 = Class.forName((String) "java.lang.Iterable");
        Class<? extends Object> term276 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldStaticReadOnly");
        Class<? extends Object> term279 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        Class<? extends Object> term282 = Class.forName((String) "java.util.stream.IntPipeline$1");
        Class<? extends Object> term285 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term288 = Class.forName((String) "java.util.spi.CalendarNameProvider");
        Class<? extends Object> term392 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        Class<? extends Object> term394 = Class.forName((String) "java.nio.file.FileSystemLoopException");
        term157 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term158 = (Object[]) newArray("java.lang.Object", 5);
        short[] term159 = (short[]) newShortArray(32);
        int[] term192 = (int[]) newIntArray(32);
        Object[] term225 = (Object[]) newArray("java.lang.Object", 32);
        long[] term291 = (long[]) newLongArray(32);
        Object[] term324 = (Object[]) newArray("java.lang.Object", 5);
        short[] term325 = (short[]) newShortArray(32);
        int[] term358 = (int[]) newIntArray(32);
        Object[] term391 = (Object[]) newArray("java.lang.Object", 32);
        long[] term396 = (long[]) newLongArray(32);
        Object[] term441 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term443 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term159, 0, (short) 1);
        setShortElement(term159, 1, (short) 2);
        setShortElement(term159, 2, (short) 1);
        setShortElement(term159, 3, (short) 7);
        setShortElement(term159, 4, (short) 2);
        setShortElement(term159, 5, (short) 1);
        setShortElement(term159, 6, (short) 6);
        setShortElement(term159, 7, (short) 2);
        setShortElement(term159, 8, (short) 10);
        setShortElement(term159, 9, (short) 11);
        setShortElement(term159, 10, (short) 29);
        setShortElement(term159, 11, (short) 5);
        setShortElement(term159, 12, (short) 4);
        setShortElement(term159, 13, (short) 5);
        setShortElement(term159, 14, (short) 6);
        setShortElement(term159, 15, (short) 7);
        setShortElement(term159, 16, (short) 10);
        setShortElement(term159, 17, (short) 11);
        setShortElement(term159, 18, (short) 12);
        setShortElement(term159, 19, (short) 4);
        setShortElement(term159, 20, (short) 1);
        setShortElement(term159, 23, (short) 3);
        setShortElement(term159, 24, (short) 4);
        setShortElement(term159, 25, (short) 4);
        setShortElement(term159, 26, (short) 1);
        setShortElement(term159, 27, (short) 2);
        setShortElement(term159, 28, (short) 3);
        setShortElement(term159, 29, (short) 3);
        setShortElement(term159, 30, (short) 13);
        setShortElement(term159, 31, (short) 1);
        setElement(term158, 0, term159);
        setIntElement(term192, 1, 5570560);
        setIntElement(term192, 2, 327680);
        setIntElement(term192, 3, 4456454);
        setIntElement(term192, 4, 1769472);
        setIntElement(term192, 5, 14876672);
        setIntElement(term192, 6, 6225920);
        setIntElement(term192, 7, 917504);
        setIntElement(term192, 8, 327680);
        setIntElement(term192, 9, 8519680);
        setIntElement(term192, 10, 917504);
        setIntElement(term192, 11, 11993088);
        setIntElement(term192, 12, 655360);
        setIntElement(term192, 13, 7864320);
        setIntElement(term192, 14, 3735552);
        setIntElement(term192, 15, 7143424);
        setIntElement(term192, 16, 8454144);
        setIntElement(term192, 17, 9240576);
        setIntElement(term192, 18, 196608);
        setIntElement(term192, 19, 3801088);
        setIntElement(term192, 20, 786432);
        setIntElement(term192, 21, 589824);
        setIntElement(term192, 22, 17170432);
        setIntElement(term192, 23, 1376256);
        setIntElement(term192, 24, 5242880);
        setIntElement(term192, 25, 2883584);
        setIntElement(term192, 26, 20774912);
        setIntElement(term192, 27, 262144);
        setIntElement(term192, 28, 2555904);
        setIntElement(term192, 29, 1835008);
        setIntElement(term192, 30, 6029312);
        setIntElement(term192, 31, 327680);
        setElement(term158, 1, term192);
        setElement(term225, 0, term226);
        setElement(term225, 1, term226);
        setElement(term225, 2, term229);
        setElement(term225, 3, term231);
        setElement(term225, 4, term235);
        setElement(term225, 5, term235);
        setElement(term225, 6, term240);
        setElement(term225, 7, term240);
        setElement(term225, 8, term244);
        setElement(term225, 9, term244);
        setElement(term225, 10, term244);
        setElement(term225, 11, term244);
        setElement(term225, 12, term244);
        setElement(term225, 13, term248);
        setElement(term225, 14, term248);
        setElement(term225, 15, term252);
        setElement(term225, 16, term252);
        setElement(term225, 17, term252);
        setElement(term225, 18, term252);
        setElement(term225, 19, term256);
        setElement(term225, 20, term256);
        setElement(term225, 21, term256);
        setElement(term225, 22, term260);
        setElement(term225, 23, term252);
        setElement(term225, 24, term264);
        setElement(term225, 25, term268);
        setElement(term225, 26, term272);
        setElement(term225, 27, term276);
        setElement(term225, 28, term279);
        setElement(term225, 29, term282);
        setElement(term225, 30, term285);
        setElement(term225, 31, term288);
        setElement(term158, 2, term225);
        setLongElement(term291, 0, 34363746224L);
        setLongElement(term291, 1, 34363775512L);
        setLongElement(term291, 2, 34363775512L);
        setLongElement(term291, 3, 34363775512L);
        setLongElement(term291, 4, 135751908134864L);
        setLongElement(term291, 5, 34364440080L);
        setLongElement(term291, 6, 135751908201968L);
        setLongElement(term291, 7, 135751907559328L);
        setLongElement(term291, 8, 135751907559216L);
        setLongElement(term291, 9, 135751907559360L);
        setLongElement(term291, 10, 135751907826432L);
        setLongElement(term291, 11, 34363766248L);
        setLongElement(term291, 12, 34363766248L);
        setLongElement(term291, 13, 135748386964304L);
        setLongElement(term291, 14, 135748386964304L);
        setLongElement(term291, 15, 135748386964160L);
        setLongElement(term291, 16, 135748387007376L);
        setLongElement(term291, 17, 135748387009024L);
        setLongElement(term291, 18, 135748387009792L);
        setLongElement(term291, 19, 135748383823440L);
        setLongElement(term291, 20, 34363739368L);
        setLongElement(term291, 21, 34363739368L);
        setLongElement(term291, 22, 135748386976752L);
        setLongElement(term291, 23, 34363829248L);
        setLongElement(term291, 24, 135748383823440L);
        setLongElement(term291, 25, 135748383810544L);
        setLongElement(term291, 26, 34363745472L);
        setLongElement(term291, 27, 34364710216L);
        setLongElement(term291, 28, 34363745472L);
        setLongElement(term291, 29, 34363745472L);
        setLongElement(term291, 30, 34364896224L);
        setLongElement(term291, 31, 34363745472L);
        setElement(term158, 3, term291);
        setShortElement(term325, 0, (short) 2);
        setShortElement(term325, 1, (short) 12);
        setElement(term324, 0, term325);
        setIntElement(term358, 0, 1638400);
        setIntElement(term358, 1, 720907);
        setElement(term324, 1, term358);
        setElement(term391, 0, term392);
        setElement(term391, 1, term394);
        setElement(term324, 2, term391);
        setLongElement(term396, 0, 34363745472L);
        setLongElement(term396, 1, 34363745472L);
        setElement(term324, 3, term396);
        setElement(term158, 4, term324);
        setField(term157, term157.getClass(), "backtrace", term158);
        setField(term157, term157.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term157, term157.getClass(), "cause", term157);
        setField(term157, term157.getClass(), "stackTrace", term441);
        setIntField(term157, term157.getClass(), "depth", 34);
        setIntField(term443, term443.getClass(), "modCount", 0);
        setField(term157, term157.getClass(), "suppressedExceptions", term443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "EGtDIRbSSb";
        args[2] = term157;
        try {
            callMethod(klass, "reportBadDefinition", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


