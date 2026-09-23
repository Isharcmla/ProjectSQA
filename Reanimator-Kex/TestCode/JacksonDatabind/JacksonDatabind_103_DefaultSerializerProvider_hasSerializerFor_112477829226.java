package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultSerializerProvider_hasSerializerFor_112477829226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public DefaultSerializerProvider_hasSerializerFor_112477829226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper$1");
        Class<? extends Object> term76 = Class.forName((String) "java.lang.SecurityException");
        Class<? extends Object> term78 = Class.forName((String) "java.io.ObjectInputStream$GetField");
        Class<? extends Object> term80 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder$1");
        Class<? extends Object> term82 = Class.forName((String) "com.fasterxml.jackson.databind.JsonMappingException");
        Class<? extends Object> term84 = Class.forName((String) "java.util.HashMap$EntrySpliterator");
        Class<? extends Object> term86 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase");
        Class<? extends Object> term88 = Class.forName((String) "java.util.concurrent.SynchronousQueue$LifoWaitQueue");
        Class<? extends Object> term90 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiAccept");
        Class<? extends Object> term92 = Class.forName((String) "java.nio.channels.OverlappingFileLockException");
        Class<? extends Object> term94 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
        Class<? extends Object> term96 = Class.forName((String) "java.util.stream.ReferencePipeline$3");
        Class<? extends Object> term98 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1");
        Class<? extends Object> term100 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfDouble");
        Class<? extends Object> term102 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapSerializer$1");
        term4 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term5 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6 = (Object[]) newArray("java.lang.Object", 5);
        short[] term7 = (short[]) newShortArray(32);
        int[] term40 = (int[]) newIntArray(32);
        Object[] term73 = (Object[]) newArray("java.lang.Object", 32);
        long[] term104 = (long[]) newLongArray(32);
        Object[] term137 = (Object[]) newArray("java.lang.Object", 5);
        short[] term138 = (short[]) newShortArray(32);
        int[] term171 = (int[]) newIntArray(32);
        Object[] term204 = (Object[]) newArray("java.lang.Object", 32);
        long[] term205 = (long[]) newLongArray(32);
        Object[] term250 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term252 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term7, 0, (short) 1);
        setShortElement(term7, 1, (short) 2);
        setShortElement(term7, 2, (short) 1);
        setShortElement(term7, 3, (short) 7);
        setShortElement(term7, 4, (short) 2);
        setShortElement(term7, 5, (short) 1);
        setShortElement(term7, 6, (short) 6);
        setShortElement(term7, 7, (short) 2);
        setShortElement(term7, 8, (short) 10);
        setShortElement(term7, 9, (short) 11);
        setShortElement(term7, 10, (short) 29);
        setShortElement(term7, 11, (short) 5);
        setShortElement(term7, 12, (short) 19);
        setShortElement(term7, 13, (short) 29);
        setShortElement(term7, 14, (short) 5);
        setShortElement(term7, 15, (short) 4);
        setShortElement(term7, 16, (short) 5);
        setShortElement(term7, 17, (short) 6);
        setShortElement(term7, 18, (short) 7);
        setShortElement(term7, 19, (short) 10);
        setShortElement(term7, 20, (short) 11);
        setShortElement(term7, 21, (short) 12);
        setShortElement(term7, 22, (short) 4);
        setShortElement(term7, 23, (short) 1);
        setShortElement(term7, 26, (short) 3);
        setShortElement(term7, 27, (short) 4);
        setShortElement(term7, 28, (short) 4);
        setShortElement(term7, 29, (short) 1);
        setShortElement(term7, 30, (short) 2);
        setShortElement(term7, 31, (short) 3);
        setElement(term6, 0, term7);
        setIntElement(term40, 1, 5570560);
        setIntElement(term40, 2, 327680);
        setIntElement(term40, 3, 4456454);
        setIntElement(term40, 4, 1769472);
        setIntElement(term40, 5, 14876672);
        setIntElement(term40, 6, 6225920);
        setIntElement(term40, 7, 917504);
        setIntElement(term40, 8, 327680);
        setIntElement(term40, 9, 8519680);
        setIntElement(term40, 10, 917504);
        setIntElement(term40, 11, 11993088);
        setIntElement(term40, 12, 38010880);
        setIntElement(term40, 13, 2162688);
        setIntElement(term40, 14, 11993088);
        setIntElement(term40, 15, 655360);
        setIntElement(term40, 16, 7864320);
        setIntElement(term40, 17, 3735552);
        setIntElement(term40, 18, 7143424);
        setIntElement(term40, 19, 8454144);
        setIntElement(term40, 20, 9240576);
        setIntElement(term40, 21, 196608);
        setIntElement(term40, 22, 3801088);
        setIntElement(term40, 23, 786432);
        setIntElement(term40, 24, 589824);
        setIntElement(term40, 25, 17170432);
        setIntElement(term40, 26, 1376256);
        setIntElement(term40, 27, 5242880);
        setIntElement(term40, 28, 2883584);
        setIntElement(term40, 29, 20774912);
        setIntElement(term40, 30, 262144);
        setIntElement(term40, 31, 2555904);
        setElement(term6, 1, term40);
        setElement(term73, 0, term74);
        setElement(term73, 1, term74);
        setElement(term73, 2, term76);
        setElement(term73, 3, term78);
        setElement(term73, 4, term80);
        setElement(term73, 5, term80);
        setElement(term73, 6, term82);
        setElement(term73, 7, term82);
        setElement(term73, 8, term84);
        setElement(term73, 9, term84);
        setElement(term73, 10, term84);
        setElement(term73, 11, term84);
        setElement(term73, 12, term84);
        setElement(term73, 13, term84);
        setElement(term73, 14, term84);
        setElement(term73, 15, term84);
        setElement(term73, 16, term86);
        setElement(term73, 17, term86);
        setElement(term73, 18, term88);
        setElement(term73, 19, term88);
        setElement(term73, 20, term88);
        setElement(term73, 21, term88);
        setElement(term73, 22, term90);
        setElement(term73, 23, term90);
        setElement(term73, 24, term90);
        setElement(term73, 25, term92);
        setElement(term73, 26, term88);
        setElement(term73, 27, term94);
        setElement(term73, 28, term96);
        setElement(term73, 29, term98);
        setElement(term73, 30, term100);
        setElement(term73, 31, term102);
        setElement(term6, 2, term73);
        setLongElement(term104, 0, 34363746224L);
        setLongElement(term104, 1, 34363775512L);
        setLongElement(term104, 2, 34363775512L);
        setLongElement(term104, 3, 34363775512L);
        setLongElement(term104, 4, 134402348647296L);
        setLongElement(term104, 5, 34364440080L);
        setLongElement(term104, 6, 134402348714400L);
        setLongElement(term104, 7, 134402348305760L);
        setLongElement(term104, 8, 134402348305648L);
        setLongElement(term104, 9, 134402348305792L);
        setLongElement(term104, 10, 134402348568128L);
        setLongElement(term104, 11, 34363766248L);
        setLongElement(term104, 12, 134402348565648L);
        setLongElement(term104, 13, 134402348568128L);
        setLongElement(term104, 14, 34363766248L);
        setLongElement(term104, 15, 34363766248L);
        setLongElement(term104, 16, 134398941312448L);
        setLongElement(term104, 17, 134398941312448L);
        setLongElement(term104, 18, 134398941312304L);
        setLongElement(term104, 19, 134398941356208L);
        setLongElement(term104, 20, 134398941357856L);
        setLongElement(term104, 21, 134398941358624L);
        setLongElement(term104, 22, 134402350485616L);
        setLongElement(term104, 23, 34363739368L);
        setLongElement(term104, 24, 34363739368L);
        setLongElement(term104, 25, 134398941310944L);
        setLongElement(term104, 26, 34363829248L);
        setLongElement(term104, 27, 134402350485616L);
        setLongElement(term104, 28, 134402350315536L);
        setLongElement(term104, 29, 34363745472L);
        setLongElement(term104, 30, 34364710216L);
        setLongElement(term104, 31, 34363745472L);
        setElement(term6, 3, term104);
        setShortElement(term138, 0, (short) 3);
        setShortElement(term138, 1, (short) 13);
        setShortElement(term138, 2, (short) 1);
        setShortElement(term138, 3, (short) 2);
        setShortElement(term138, 4, (short) 12);
        setElement(term137, 0, term138);
        setIntElement(term171, 0, 1835008);
        setIntElement(term171, 1, 6029312);
        setIntElement(term171, 2, 327680);
        setIntElement(term171, 3, 1638400);
        setIntElement(term171, 4, 720907);
        setElement(term137, 1, term171);
        setElement(term137, 2, term204);
        setLongElement(term205, 0, 34363745472L);
        setLongElement(term205, 1, 34364896224L);
        setLongElement(term205, 2, 34363745472L);
        setLongElement(term205, 3, 34363745472L);
        setLongElement(term205, 4, 34363745472L);
        setElement(term137, 3, term205);
        setElement(term6, 4, term137);
        setField(term5, term5.getClass(), "backtrace", term6);
        setField(term5, term5.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term5, term5.getClass(), "cause", term5);
        setField(term5, term5.getClass(), "stackTrace", term250);
        setIntField(term5, term5.getClass(), "depth", 37);
        setIntField(term252, term252.getClass(), "modCount", 0);
        setField(term5, term5.getClass(), "suppressedExceptions", term252);
        setField(term4, term4.getClass(), "value", term5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.concurrent.atomic.AtomicReference");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4;
        try {
            callMethod(klass, "hasSerializerFor", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


