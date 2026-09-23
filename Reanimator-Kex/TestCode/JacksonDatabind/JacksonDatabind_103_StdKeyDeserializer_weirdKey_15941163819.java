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

public class StdKeyDeserializer_weirdKey_15941163819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public StdKeyDeserializer_weirdKey_15941163819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1");
        Class<? extends Object> term199 = Class.forName((String) "java.io.ObjectInputStream$GetField");
        Class<? extends Object> term201 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder$1");
        Class<? extends Object> term205 = Class.forName((String) "com.fasterxml.jackson.databind.JsonMappingException");
        Class<? extends Object> term210 = Class.forName((String) "java.util.HashMap$EntrySpliterator");
        Class<? extends Object> term214 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase");
        Class<? extends Object> term218 = Class.forName((String) "java.util.concurrent.SynchronousQueue$LifoWaitQueue");
        Class<? extends Object> term222 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiAccept");
        Class<? extends Object> term226 = Class.forName((String) "java.nio.channels.OverlappingFileLockException");
        Class<? extends Object> term230 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
        Class<? extends Object> term234 = Class.forName((String) "java.util.stream.ReferencePipeline$3");
        Class<? extends Object> term238 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1");
        Class<? extends Object> term242 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfDouble");
        Class<? extends Object> term246 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.MapSerializer$1");
        Class<? extends Object> term249 = Class.forName((String) "java.lang.invoke.VarHandleBytes");
        Class<? extends Object> term252 = Class.forName((String) "java.io.DataOutputStream");
        Class<? extends Object> term255 = Class.forName((String) "kex.java.util.LinkedList");
        Class<? extends Object> term258 = Class.forName((String) "java.lang.invoke.VarHandleShorts");
        Class<? extends Object> term362 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers");
        Class<? extends Object> term364 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfDouble");
        term127 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term128 = (Object[]) newArray("java.lang.Object", 5);
        short[] term129 = (short[]) newShortArray(32);
        int[] term162 = (int[]) newIntArray(32);
        Object[] term195 = (Object[]) newArray("java.lang.Object", 32);
        long[] term261 = (long[]) newLongArray(32);
        Object[] term294 = (Object[]) newArray("java.lang.Object", 5);
        short[] term295 = (short[]) newShortArray(32);
        int[] term328 = (int[]) newIntArray(32);
        Object[] term361 = (Object[]) newArray("java.lang.Object", 32);
        long[] term366 = (long[]) newLongArray(32);
        Object[] term411 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term413 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term129, 0, (short) 1);
        setShortElement(term129, 1, (short) 2);
        setShortElement(term129, 2, (short) 1);
        setShortElement(term129, 3, (short) 7);
        setShortElement(term129, 4, (short) 2);
        setShortElement(term129, 5, (short) 1);
        setShortElement(term129, 6, (short) 6);
        setShortElement(term129, 7, (short) 2);
        setShortElement(term129, 8, (short) 8);
        setShortElement(term129, 9, (short) 9);
        setShortElement(term129, 10, (short) 27);
        setShortElement(term129, 11, (short) 4);
        setShortElement(term129, 12, (short) 5);
        setShortElement(term129, 13, (short) 6);
        setShortElement(term129, 14, (short) 8);
        setShortElement(term129, 15, (short) 6);
        setShortElement(term129, 16, (short) 9);
        setShortElement(term129, 17, (short) 10);
        setShortElement(term129, 18, (short) 11);
        setShortElement(term129, 19, (short) 4);
        setShortElement(term129, 20, (short) 1);
        setShortElement(term129, 22, (short) 10);
        setShortElement(term129, 23, (short) 3);
        setShortElement(term129, 24, (short) 4);
        setShortElement(term129, 25, (short) 9);
        setShortElement(term129, 26, (short) 1);
        setShortElement(term129, 27, (short) 2);
        setShortElement(term129, 28, (short) 3);
        setShortElement(term129, 29, (short) 3);
        setShortElement(term129, 30, (short) 13);
        setShortElement(term129, 31, (short) 1);
        setElement(term128, 0, term129);
        setIntElement(term162, 1, 5570560);
        setIntElement(term162, 2, 327680);
        setIntElement(term162, 3, 4456454);
        setIntElement(term162, 4, 1769472);
        setIntElement(term162, 5, 14876672);
        setIntElement(term162, 6, 6225920);
        setIntElement(term162, 7, 917504);
        setIntElement(term162, 8, 327680);
        setIntElement(term162, 9, 8519680);
        setIntElement(term162, 10, 917504);
        setIntElement(term162, 11, 11993088);
        setIntElement(term162, 12, 655360);
        setIntElement(term162, 13, 7864320);
        setIntElement(term162, 14, 3735552);
        setIntElement(term162, 15, 7143424);
        setIntElement(term162, 16, 8454144);
        setIntElement(term162, 17, 9240576);
        setIntElement(term162, 18, 196608);
        setIntElement(term162, 19, 3801088);
        setIntElement(term162, 20, 786432);
        setIntElement(term162, 21, 589824);
        setIntElement(term162, 22, 17170432);
        setIntElement(term162, 23, 1376256);
        setIntElement(term162, 24, 5242880);
        setIntElement(term162, 25, 2883584);
        setIntElement(term162, 26, 20774912);
        setIntElement(term162, 27, 262144);
        setIntElement(term162, 28, 2555904);
        setIntElement(term162, 29, 1835008);
        setIntElement(term162, 30, 6029312);
        setIntElement(term162, 31, 327680);
        setElement(term128, 1, term162);
        setElement(term195, 0, term196);
        setElement(term195, 1, term196);
        setElement(term195, 2, term199);
        setElement(term195, 3, term201);
        setElement(term195, 4, term205);
        setElement(term195, 5, term205);
        setElement(term195, 6, term210);
        setElement(term195, 7, term210);
        setElement(term195, 8, term214);
        setElement(term195, 9, term214);
        setElement(term195, 10, term214);
        setElement(term195, 11, term214);
        setElement(term195, 12, term214);
        setElement(term195, 13, term218);
        setElement(term195, 14, term218);
        setElement(term195, 15, term222);
        setElement(term195, 16, term222);
        setElement(term195, 17, term222);
        setElement(term195, 18, term222);
        setElement(term195, 19, term226);
        setElement(term195, 20, term226);
        setElement(term195, 21, term226);
        setElement(term195, 22, term230);
        setElement(term195, 23, term222);
        setElement(term195, 24, term234);
        setElement(term195, 25, term238);
        setElement(term195, 26, term242);
        setElement(term195, 27, term246);
        setElement(term195, 28, term249);
        setElement(term195, 29, term252);
        setElement(term195, 30, term255);
        setElement(term195, 31, term258);
        setElement(term128, 2, term195);
        setLongElement(term261, 0, 34363746224L);
        setLongElement(term261, 1, 34363775512L);
        setLongElement(term261, 2, 34363775512L);
        setLongElement(term261, 3, 34363775512L);
        setLongElement(term261, 4, 131176157320192L);
        setLongElement(term261, 5, 34364440080L);
        setLongElement(term261, 6, 131176157387344L);
        setLongElement(term261, 7, 131176157190944L);
        setLongElement(term261, 8, 131176157190832L);
        setLongElement(term261, 9, 131176157190976L);
        setLongElement(term261, 10, 131176157195680L);
        setLongElement(term261, 11, 34363766248L);
        setLongElement(term261, 12, 34363766248L);
        setLongElement(term261, 13, 131172581331184L);
        setLongElement(term261, 14, 131172581331184L);
        setLongElement(term261, 15, 131172581331040L);
        setLongElement(term261, 16, 131172581375568L);
        setLongElement(term261, 17, 131172581377216L);
        setLongElement(term261, 18, 131172581377984L);
        setLongElement(term261, 19, 131176158909280L);
        setLongElement(term261, 20, 34363739368L);
        setLongElement(term261, 21, 34363739368L);
        setLongElement(term261, 22, 131172581329680L);
        setLongElement(term261, 23, 34363829248L);
        setLongElement(term261, 24, 131176158909280L);
        setLongElement(term261, 25, 131176159082000L);
        setLongElement(term261, 26, 34363745472L);
        setLongElement(term261, 27, 34364710216L);
        setLongElement(term261, 28, 34363745472L);
        setLongElement(term261, 29, 34363745472L);
        setLongElement(term261, 30, 34364896224L);
        setLongElement(term261, 31, 34363745472L);
        setElement(term128, 3, term261);
        setShortElement(term295, 0, (short) 2);
        setShortElement(term295, 1, (short) 12);
        setElement(term294, 0, term295);
        setIntElement(term328, 0, 1638400);
        setIntElement(term328, 1, 720907);
        setElement(term294, 1, term328);
        setElement(term361, 0, term362);
        setElement(term361, 1, term364);
        setElement(term294, 2, term361);
        setLongElement(term366, 0, 34363745472L);
        setLongElement(term366, 1, 34363745472L);
        setElement(term294, 3, term366);
        setElement(term128, 4, term294);
        setField(term127, term127.getClass(), "backtrace", term128);
        setField(term127, term127.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term127, term127.getClass(), "cause", term127);
        setField(term127, term127.getClass(), "stackTrace", term411);
        setIntField(term127, term127.getClass(), "depth", 34);
        setIntField(term413, term413.getClass(), "modCount", 0);
        setField(term127, term127.getClass(), "suppressedExceptions", term413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Exception");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "EGtDIRbSSb";
        args[2] = term127;
        try {
            callMethod(klass, "_weirdKey", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


