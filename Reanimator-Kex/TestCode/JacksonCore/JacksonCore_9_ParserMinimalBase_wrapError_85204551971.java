package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ParserMinimalBase_wrapError_85204551971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;

    public ParserMinimalBase_wrapError_85204551971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term284 = Class.forName((String) "kex.java.util.ArrayList$ListItr");
        Class<? extends Object> term287 = Class.forName((String) "java.util.Collections$EmptyList");
        Class<? extends Object> term289 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceEntriesTask");
        Class<? extends Object> term293 = Class.forName((String) "java.lang.StringLatin1$LinesSpliterator");
        Class<? extends Object> term298 = Class.forName((String) "java.util.Deque");
        Class<? extends Object> term302 = Class.forName((String) "java.util.HashMap$EntrySet");
        Class<? extends Object> term306 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfDouble");
        Class<? extends Object> term310 = Class.forName((String) "java.util.function.LongConsumer");
        Class<? extends Object> term314 = Class.forName((String) "java.util.jar.Pack200$Unpacker");
        Class<? extends Object> term318 = Class.forName((String) "com.fasterxml.jackson.core.io.CharTypes");
        Class<? extends Object> term322 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs$Node");
        Class<? extends Object> term326 = Class.forName((String) "java.lang.invoke.VarHandle$AccessMode");
        Class<? extends Object> term330 = Class.forName((String) "java.util.LocaleISOData");
        Class<? extends Object> term334 = Class.forName((String) "java.io.Console$1");
        Class<? extends Object> term337 = Class.forName((String) "java.util.AbstractMap$2");
        Class<? extends Object> term340 = Class.forName((String) "java.util.stream.DoublePipeline$StatelessOp");
        Class<? extends Object> term343 = Class.forName((String) "java.util.concurrent.CompletableFuture$OrAccept");
        Class<? extends Object> term346 = Class.forName((String) "java.util.stream.IntPipeline$Head");
        Class<? extends Object> term450 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$Makers$3");
        Class<? extends Object> term452 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry");
        term215 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term216 = (Object[]) newArray("java.lang.Object", 5);
        short[] term217 = (short[]) newShortArray(32);
        int[] term250 = (int[]) newIntArray(32);
        Object[] term283 = (Object[]) newArray("java.lang.Object", 32);
        long[] term349 = (long[]) newLongArray(32);
        Object[] term382 = (Object[]) newArray("java.lang.Object", 5);
        short[] term383 = (short[]) newShortArray(32);
        int[] term416 = (int[]) newIntArray(32);
        Object[] term449 = (Object[]) newArray("java.lang.Object", 32);
        long[] term454 = (long[]) newLongArray(32);
        Object[] term499 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term501 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term217, 0, (short) 1);
        setShortElement(term217, 1, (short) 2);
        setShortElement(term217, 2, (short) 1);
        setShortElement(term217, 3, (short) 7);
        setShortElement(term217, 4, (short) 2);
        setShortElement(term217, 5, (short) 1);
        setShortElement(term217, 6, (short) 6);
        setShortElement(term217, 7, (short) 2);
        setShortElement(term217, 8, (short) 10);
        setShortElement(term217, 9, (short) 11);
        setShortElement(term217, 10, (short) 29);
        setShortElement(term217, 11, (short) 5);
        setShortElement(term217, 12, (short) 4);
        setShortElement(term217, 13, (short) 5);
        setShortElement(term217, 14, (short) 6);
        setShortElement(term217, 15, (short) 6);
        setShortElement(term217, 16, (short) 9);
        setShortElement(term217, 17, (short) 10);
        setShortElement(term217, 18, (short) 11);
        setShortElement(term217, 19, (short) 4);
        setShortElement(term217, 20, (short) 1);
        setShortElement(term217, 23, (short) 3);
        setShortElement(term217, 24, (short) 4);
        setShortElement(term217, 25, (short) 4);
        setShortElement(term217, 26, (short) 1);
        setShortElement(term217, 27, (short) 2);
        setShortElement(term217, 28, (short) 3);
        setShortElement(term217, 29, (short) 3);
        setShortElement(term217, 30, (short) 13);
        setShortElement(term217, 31, (short) 1);
        setElement(term216, 0, term217);
        setIntElement(term250, 1, 5570560);
        setIntElement(term250, 2, 327680);
        setIntElement(term250, 3, 4456454);
        setIntElement(term250, 4, 1769472);
        setIntElement(term250, 5, 14876672);
        setIntElement(term250, 6, 6225920);
        setIntElement(term250, 7, 917504);
        setIntElement(term250, 8, 327680);
        setIntElement(term250, 9, 8519680);
        setIntElement(term250, 10, 917504);
        setIntElement(term250, 11, 11993088);
        setIntElement(term250, 12, 655360);
        setIntElement(term250, 13, 7864320);
        setIntElement(term250, 14, 3735552);
        setIntElement(term250, 15, 7143424);
        setIntElement(term250, 16, 8454144);
        setIntElement(term250, 17, 9240576);
        setIntElement(term250, 18, 196608);
        setIntElement(term250, 19, 3801088);
        setIntElement(term250, 20, 786432);
        setIntElement(term250, 21, 589824);
        setIntElement(term250, 22, 17170432);
        setIntElement(term250, 23, 1376256);
        setIntElement(term250, 24, 5242880);
        setIntElement(term250, 25, 2883584);
        setIntElement(term250, 26, 20774912);
        setIntElement(term250, 27, 262144);
        setIntElement(term250, 28, 2555904);
        setIntElement(term250, 29, 1835008);
        setIntElement(term250, 30, 6029312);
        setIntElement(term250, 31, 327680);
        setElement(term216, 1, term250);
        setElement(term283, 0, term284);
        setElement(term283, 1, term284);
        setElement(term283, 2, term287);
        setElement(term283, 3, term289);
        setElement(term283, 4, term293);
        setElement(term283, 5, term293);
        setElement(term283, 6, term298);
        setElement(term283, 7, term298);
        setElement(term283, 8, term302);
        setElement(term283, 9, term302);
        setElement(term283, 10, term302);
        setElement(term283, 11, term302);
        setElement(term283, 12, term302);
        setElement(term283, 13, term306);
        setElement(term283, 14, term306);
        setElement(term283, 15, term310);
        setElement(term283, 16, term310);
        setElement(term283, 17, term310);
        setElement(term283, 18, term310);
        setElement(term283, 19, term314);
        setElement(term283, 20, term314);
        setElement(term283, 21, term314);
        setElement(term283, 22, term318);
        setElement(term283, 23, term310);
        setElement(term283, 24, term322);
        setElement(term283, 25, term326);
        setElement(term283, 26, term330);
        setElement(term283, 27, term334);
        setElement(term283, 28, term337);
        setElement(term283, 29, term340);
        setElement(term283, 30, term343);
        setElement(term283, 31, term346);
        setElement(term216, 2, term283);
        setLongElement(term349, 0, 34363746224L);
        setLongElement(term349, 1, 34363775512L);
        setLongElement(term349, 2, 34363775512L);
        setLongElement(term349, 3, 34363775512L);
        setLongElement(term349, 4, 136056649237120L);
        setLongElement(term349, 5, 34364440080L);
        setLongElement(term349, 6, 136056649313136L);
        setLongElement(term349, 7, 136056649151744L);
        setLongElement(term349, 8, 136056649151632L);
        setLongElement(term349, 9, 136056649151776L);
        setLongElement(term349, 10, 136056649198976L);
        setLongElement(term349, 11, 34363766248L);
        setLongElement(term349, 12, 34363766248L);
        setLongElement(term349, 13, 136052016372576L);
        setLongElement(term349, 14, 136052016372576L);
        setLongElement(term349, 15, 136052016372432L);
        setLongElement(term349, 16, 136052016415840L);
        setLongElement(term349, 17, 136052016417488L);
        setLongElement(term349, 18, 136052016418256L);
        setLongElement(term349, 19, 136056710966080L);
        setLongElement(term349, 20, 34363739368L);
        setLongElement(term349, 21, 34363739368L);
        setLongElement(term349, 22, 136052016385216L);
        setLongElement(term349, 23, 34363829248L);
        setLongElement(term349, 24, 136056710966080L);
        setLongElement(term349, 25, 136056707707456L);
        setLongElement(term349, 26, 34363745472L);
        setLongElement(term349, 27, 34364710216L);
        setLongElement(term349, 28, 34363745472L);
        setLongElement(term349, 29, 34363745472L);
        setLongElement(term349, 30, 34364896224L);
        setLongElement(term349, 31, 34363745472L);
        setElement(term216, 3, term349);
        setShortElement(term383, 0, (short) 2);
        setShortElement(term383, 1, (short) 12);
        setElement(term382, 0, term383);
        setIntElement(term416, 0, 1638400);
        setIntElement(term416, 1, 720907);
        setElement(term382, 1, term416);
        setElement(term449, 0, term450);
        setElement(term449, 1, term452);
        setElement(term382, 2, term449);
        setLongElement(term454, 0, 34363745472L);
        setLongElement(term454, 1, 34363745472L);
        setElement(term382, 3, term454);
        setElement(term216, 4, term382);
        setField(term215, term215.getClass(), "backtrace", term216);
        setField(term215, term215.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term215, term215.getClass(), "cause", term215);
        setField(term215, term215.getClass(), "stackTrace", term499);
        setIntField(term215, term215.getClass(), "depth", 34);
        setIntField(term501, term501.getClass(), "modCount", 0);
        setField(term215, term215.getClass(), "suppressedExceptions", term501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term215;
        try {
            callMethod(klass, "_wrapError", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


