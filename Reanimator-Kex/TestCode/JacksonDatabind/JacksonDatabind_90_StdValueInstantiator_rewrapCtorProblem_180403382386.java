package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_rewrapCtorProblem_180403382386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9380;

    public StdValueInstantiator_rewrapCtorProblem_180403382386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9449 = Class.forName((String) "java.util.stream.WhileOps$4$1");
        Class<? extends Object> term9452 = Class.forName((String) "java.util.TreeMap$NavigableSubMap$SubMapIterator");
        Class<? extends Object> term9454 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term9458 = Class.forName((String) "java.io.ObjectInputFilter$Config$Global");
        Class<? extends Object> term9463 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfInt");
        Class<? extends Object> term9467 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Class<? extends Object> term9471 = Class.forName((String) "java.nio.channels.DatagramChannel");
        Class<? extends Object> term9475 = Class.forName((String) "java.util.Collections$UnmodifiableRandomAccessList");
        Class<? extends Object> term9479 = Class.forName((String) "com.fasterxml.jackson.databind.jsonschema.SchemaAware");
        Class<? extends Object> term9483 = Class.forName((String) "java.util.LinkedHashSet");
        Class<? extends Object> term9487 = Class.forName((String) "java.lang.ProcessHandleImpl$1");
        Class<? extends Object> term9491 = Class.forName((String) "java.util.function.BiFunction");
        Class<? extends Object> term9495 = Class.forName((String) "java.util.concurrent.CompletionStage");
        Class<? extends Object> term9499 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        Class<? extends Object> term9502 = Class.forName((String) "java.nio.file.WatchEvent$Modifier");
        Class<? extends Object> term9505 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop");
        Class<? extends Object> term9508 = Class.forName((String) "java.lang.module.ModuleDescriptor$1");
        Class<? extends Object> term9511 = Class.forName((String) "java.util.stream.IntPipeline$1");
        Class<? extends Object> term9615 = Class.forName((String) "java.io.ObjectStreamClass$EntryFuture");
        Class<? extends Object> term9617 = Class.forName((String) "java.util.ServiceLoader$LazyClassPathLookupIterator");
        term9380 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9381 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9382 = (short[]) newShortArray(32);
        int[] term9415 = (int[]) newIntArray(32);
        Object[] term9448 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9514 = (long[]) newLongArray(32);
        Object[] term9547 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9548 = (short[]) newShortArray(32);
        int[] term9581 = (int[]) newIntArray(32);
        Object[] term9614 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9619 = (long[]) newLongArray(32);
        Object[] term9664 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9666 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9382, 0, (short) 1);
        setShortElement(term9382, 1, (short) 2);
        setShortElement(term9382, 2, (short) 1);
        setShortElement(term9382, 3, (short) 7);
        setShortElement(term9382, 4, (short) 2);
        setShortElement(term9382, 5, (short) 1);
        setShortElement(term9382, 6, (short) 6);
        setShortElement(term9382, 7, (short) 2);
        setShortElement(term9382, 8, (short) 10);
        setShortElement(term9382, 9, (short) 11);
        setShortElement(term9382, 10, (short) 29);
        setShortElement(term9382, 11, (short) 5);
        setShortElement(term9382, 12, (short) 4);
        setShortElement(term9382, 13, (short) 5);
        setShortElement(term9382, 14, (short) 6);
        setShortElement(term9382, 15, (short) 6);
        setShortElement(term9382, 16, (short) 9);
        setShortElement(term9382, 17, (short) 10);
        setShortElement(term9382, 18, (short) 11);
        setShortElement(term9382, 19, (short) 4);
        setShortElement(term9382, 20, (short) 1);
        setShortElement(term9382, 23, (short) 3);
        setShortElement(term9382, 24, (short) 4);
        setShortElement(term9382, 25, (short) 4);
        setShortElement(term9382, 26, (short) 1);
        setShortElement(term9382, 27, (short) 2);
        setShortElement(term9382, 28, (short) 3);
        setShortElement(term9382, 29, (short) 3);
        setShortElement(term9382, 30, (short) 13);
        setShortElement(term9382, 31, (short) 1);
        setElement(term9381, 0, term9382);
        setIntElement(term9415, 1, 5570560);
        setIntElement(term9415, 2, 327680);
        setIntElement(term9415, 3, 4456454);
        setIntElement(term9415, 4, 1769472);
        setIntElement(term9415, 5, 14876672);
        setIntElement(term9415, 6, 6225920);
        setIntElement(term9415, 7, 917504);
        setIntElement(term9415, 8, 327680);
        setIntElement(term9415, 9, 8519680);
        setIntElement(term9415, 10, 917504);
        setIntElement(term9415, 11, 11993088);
        setIntElement(term9415, 12, 655360);
        setIntElement(term9415, 13, 7864320);
        setIntElement(term9415, 14, 3735552);
        setIntElement(term9415, 15, 7143424);
        setIntElement(term9415, 16, 8454144);
        setIntElement(term9415, 17, 9240576);
        setIntElement(term9415, 18, 196608);
        setIntElement(term9415, 19, 3801088);
        setIntElement(term9415, 20, 786432);
        setIntElement(term9415, 21, 589824);
        setIntElement(term9415, 22, 17170432);
        setIntElement(term9415, 23, 1376256);
        setIntElement(term9415, 24, 5242880);
        setIntElement(term9415, 25, 2883584);
        setIntElement(term9415, 26, 20774912);
        setIntElement(term9415, 27, 262144);
        setIntElement(term9415, 28, 2555904);
        setIntElement(term9415, 29, 1835008);
        setIntElement(term9415, 30, 6029312);
        setIntElement(term9415, 31, 327680);
        setElement(term9381, 1, term9415);
        setElement(term9448, 0, term9449);
        setElement(term9448, 1, term9449);
        setElement(term9448, 2, term9452);
        setElement(term9448, 3, term9454);
        setElement(term9448, 4, term9458);
        setElement(term9448, 5, term9458);
        setElement(term9448, 6, term9463);
        setElement(term9448, 7, term9463);
        setElement(term9448, 8, term9467);
        setElement(term9448, 9, term9467);
        setElement(term9448, 10, term9467);
        setElement(term9448, 11, term9467);
        setElement(term9448, 12, term9467);
        setElement(term9448, 13, term9471);
        setElement(term9448, 14, term9471);
        setElement(term9448, 15, term9475);
        setElement(term9448, 16, term9475);
        setElement(term9448, 17, term9475);
        setElement(term9448, 18, term9475);
        setElement(term9448, 19, term9479);
        setElement(term9448, 20, term9479);
        setElement(term9448, 21, term9479);
        setElement(term9448, 22, term9483);
        setElement(term9448, 23, term9475);
        setElement(term9448, 24, term9487);
        setElement(term9448, 25, term9491);
        setElement(term9448, 26, term9495);
        setElement(term9448, 27, term9499);
        setElement(term9448, 28, term9502);
        setElement(term9448, 29, term9505);
        setElement(term9448, 30, term9508);
        setElement(term9448, 31, term9511);
        setElement(term9381, 2, term9448);
        setLongElement(term9514, 0, 34363746224L);
        setLongElement(term9514, 1, 34363775512L);
        setLongElement(term9514, 2, 34363775512L);
        setLongElement(term9514, 3, 34363775512L);
        setLongElement(term9514, 4, 127296325552064L);
        setLongElement(term9514, 5, 34364440080L);
        setLongElement(term9514, 6, 127296325619216L);
        setLongElement(term9514, 7, 127296325243872L);
        setLongElement(term9514, 8, 127296325243760L);
        setLongElement(term9514, 9, 127296325243904L);
        setLongElement(term9514, 10, 127296325505648L);
        setLongElement(term9514, 11, 34363766248L);
        setLongElement(term9514, 12, 34363766248L);
        setLongElement(term9514, 13, 127293269653488L);
        setLongElement(term9514, 14, 127293269653488L);
        setLongElement(term9514, 15, 127293269653344L);
        setLongElement(term9514, 16, 127293269697904L);
        setLongElement(term9514, 17, 127293269699552L);
        setLongElement(term9514, 18, 127293269700320L);
        setLongElement(term9514, 19, 127293266625536L);
        setLongElement(term9514, 20, 34363739368L);
        setLongElement(term9514, 21, 34363739368L);
        setLongElement(term9514, 22, 127293269651984L);
        setLongElement(term9514, 23, 34363829248L);
        setLongElement(term9514, 24, 127293266625536L);
        setLongElement(term9514, 25, 127293265779920L);
        setLongElement(term9514, 26, 34363745472L);
        setLongElement(term9514, 27, 34364710216L);
        setLongElement(term9514, 28, 34363745472L);
        setLongElement(term9514, 29, 34363745472L);
        setLongElement(term9514, 30, 34364896224L);
        setLongElement(term9514, 31, 34363745472L);
        setElement(term9381, 3, term9514);
        setShortElement(term9548, 0, (short) 2);
        setShortElement(term9548, 1, (short) 12);
        setElement(term9547, 0, term9548);
        setIntElement(term9581, 0, 1638400);
        setIntElement(term9581, 1, 720907);
        setElement(term9547, 1, term9581);
        setElement(term9614, 0, term9615);
        setElement(term9614, 1, term9617);
        setElement(term9547, 2, term9614);
        setLongElement(term9619, 0, 34363745472L);
        setLongElement(term9619, 1, 34363745472L);
        setElement(term9547, 3, term9619);
        setElement(term9381, 4, term9547);
        setField(term9380, term9380.getClass(), "backtrace", term9381);
        setField(term9380, term9380.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term9380, term9380.getClass(), "cause", term9380);
        setField(term9380, term9380.getClass(), "stackTrace", term9664);
        setIntField(term9380, term9380.getClass(), "depth", 34);
        setIntField(term9666, term9666.getClass(), "modCount", 0);
        setField(term9380, term9380.getClass(), "suppressedExceptions", term9666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9380;
        try {
            callMethod(klass, "rewrapCtorProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


