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

public class ParserMinimalBase_wrapError_85204551993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388;

    public ParserMinimalBase_wrapError_85204551993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term457 = Class.forName((String) "java.math.BigInteger");
        Class<? extends Object> term460 = Class.forName((String) "java.io.InterruptedIOException");
        Class<? extends Object> term462 = Class.forName((String) "java.util.function.Predicate");
        Class<? extends Object> term466 = Class.forName((String) "java.lang.invoke.VarHandle$AccessType");
        Class<? extends Object> term471 = Class.forName((String) "java.lang.Shutdown");
        Class<? extends Object> term475 = Class.forName((String) "java.lang.SecurityManager");
        Class<? extends Object> term479 = Class.forName((String) "java.util.jar.Manifest");
        Class<? extends Object> term483 = Class.forName((String) "java.lang.invoke.LambdaForm");
        Class<? extends Object> term487 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Class<? extends Object> term491 = Class.forName((String) "java.util.stream.StreamSpliterators$WrappingSpliterator");
        Class<? extends Object> term495 = Class.forName((String) "java.lang.ref.Finalizer");
        Class<? extends Object> term499 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfLong");
        Class<? extends Object> term503 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TreeBin");
        Class<? extends Object> term507 = Class.forName((String) "kex.java.lang.Float");
        Class<? extends Object> term510 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask$OfLong");
        Class<? extends Object> term513 = Class.forName((String) "java.util.stream.Sink$ChainedInt");
        Class<? extends Object> term516 = Class.forName((String) "java.lang.ref.Cleaner");
        Class<? extends Object> term519 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerationException");
        Class<? extends Object> term623 = Class.forName((String) "java.io.InvalidObjectException");
        Class<? extends Object> term625 = Class.forName((String) "java.util.stream.FindOps$FindOp");
        term388 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term389 = (Object[]) newArray("java.lang.Object", 5);
        short[] term390 = (short[]) newShortArray(32);
        int[] term423 = (int[]) newIntArray(32);
        Object[] term456 = (Object[]) newArray("java.lang.Object", 32);
        long[] term522 = (long[]) newLongArray(32);
        Object[] term555 = (Object[]) newArray("java.lang.Object", 5);
        short[] term556 = (short[]) newShortArray(32);
        int[] term589 = (int[]) newIntArray(32);
        Object[] term622 = (Object[]) newArray("java.lang.Object", 32);
        long[] term627 = (long[]) newLongArray(32);
        Object[] term672 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term674 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term390, 0, (short) 1);
        setShortElement(term390, 1, (short) 2);
        setShortElement(term390, 2, (short) 1);
        setShortElement(term390, 3, (short) 7);
        setShortElement(term390, 4, (short) 2);
        setShortElement(term390, 5, (short) 1);
        setShortElement(term390, 6, (short) 6);
        setShortElement(term390, 7, (short) 2);
        setShortElement(term390, 8, (short) 9);
        setShortElement(term390, 9, (short) 10);
        setShortElement(term390, 10, (short) 29);
        setShortElement(term390, 11, (short) 4);
        setShortElement(term390, 12, (short) 5);
        setShortElement(term390, 13, (short) 5);
        setShortElement(term390, 14, (short) 6);
        setShortElement(term390, 15, (short) 7);
        setShortElement(term390, 16, (short) 10);
        setShortElement(term390, 17, (short) 11);
        setShortElement(term390, 18, (short) 12);
        setShortElement(term390, 19, (short) 4);
        setShortElement(term390, 20, (short) 1);
        setShortElement(term390, 23, (short) 3);
        setShortElement(term390, 24, (short) 4);
        setShortElement(term390, 25, (short) 4);
        setShortElement(term390, 26, (short) 1);
        setShortElement(term390, 27, (short) 2);
        setShortElement(term390, 28, (short) 3);
        setShortElement(term390, 29, (short) 3);
        setShortElement(term390, 30, (short) 13);
        setShortElement(term390, 31, (short) 1);
        setElement(term389, 0, term390);
        setIntElement(term423, 1, 5570560);
        setIntElement(term423, 2, 327680);
        setIntElement(term423, 3, 4456454);
        setIntElement(term423, 4, 1769472);
        setIntElement(term423, 5, 14876672);
        setIntElement(term423, 6, 6225920);
        setIntElement(term423, 7, 917504);
        setIntElement(term423, 8, 327680);
        setIntElement(term423, 9, 8519680);
        setIntElement(term423, 10, 917504);
        setIntElement(term423, 11, 11993088);
        setIntElement(term423, 12, 655360);
        setIntElement(term423, 13, 7864320);
        setIntElement(term423, 14, 3735552);
        setIntElement(term423, 15, 7143424);
        setIntElement(term423, 16, 8454144);
        setIntElement(term423, 17, 9240576);
        setIntElement(term423, 18, 196608);
        setIntElement(term423, 19, 3801088);
        setIntElement(term423, 20, 786432);
        setIntElement(term423, 21, 589824);
        setIntElement(term423, 22, 17170432);
        setIntElement(term423, 23, 1376256);
        setIntElement(term423, 24, 5242880);
        setIntElement(term423, 25, 2883584);
        setIntElement(term423, 26, 20774912);
        setIntElement(term423, 27, 262144);
        setIntElement(term423, 28, 2555904);
        setIntElement(term423, 29, 1835008);
        setIntElement(term423, 30, 6029312);
        setIntElement(term423, 31, 327680);
        setElement(term389, 1, term423);
        setElement(term456, 0, term457);
        setElement(term456, 1, term457);
        setElement(term456, 2, term460);
        setElement(term456, 3, term462);
        setElement(term456, 4, term466);
        setElement(term456, 5, term466);
        setElement(term456, 6, term471);
        setElement(term456, 7, term471);
        setElement(term456, 8, term475);
        setElement(term456, 9, term475);
        setElement(term456, 10, term475);
        setElement(term456, 11, term475);
        setElement(term456, 12, term475);
        setElement(term456, 13, term479);
        setElement(term456, 14, term479);
        setElement(term456, 15, term483);
        setElement(term456, 16, term483);
        setElement(term456, 17, term483);
        setElement(term456, 18, term483);
        setElement(term456, 19, term487);
        setElement(term456, 20, term487);
        setElement(term456, 21, term487);
        setElement(term456, 22, term491);
        setElement(term456, 23, term483);
        setElement(term456, 24, term495);
        setElement(term456, 25, term499);
        setElement(term456, 26, term503);
        setElement(term456, 27, term507);
        setElement(term456, 28, term510);
        setElement(term456, 29, term513);
        setElement(term456, 30, term516);
        setElement(term456, 31, term519);
        setElement(term389, 2, term456);
        setLongElement(term522, 0, 34363746224L);
        setLongElement(term522, 1, 34363775512L);
        setLongElement(term522, 2, 34363775512L);
        setLongElement(term522, 3, 34363775512L);
        setLongElement(term522, 4, 134967204021216L);
        setLongElement(term522, 5, 34364440080L);
        setLongElement(term522, 6, 134967204097408L);
        setLongElement(term522, 7, 134967203935840L);
        setLongElement(term522, 8, 134967203935728L);
        setLongElement(term522, 9, 134967203935872L);
        setLongElement(term522, 10, 134967203983072L);
        setLongElement(term522, 11, 34363766248L);
        setLongElement(term522, 12, 34363766248L);
        setLongElement(term522, 13, 134964287964304L);
        setLongElement(term522, 14, 134964287964304L);
        setLongElement(term522, 15, 134964287964160L);
        setLongElement(term522, 16, 134964287968192L);
        setLongElement(term522, 17, 134964287969840L);
        setLongElement(term522, 18, 134964287970608L);
        setLongElement(term522, 19, 134964284896464L);
        setLongElement(term522, 20, 34363739368L);
        setLongElement(term522, 21, 34363739368L);
        setLongElement(term522, 22, 134964287923696L);
        setLongElement(term522, 23, 34363829248L);
        setLongElement(term522, 24, 134964284896464L);
        setLongElement(term522, 25, 134964284764432L);
        setLongElement(term522, 26, 34363745472L);
        setLongElement(term522, 27, 34364710216L);
        setLongElement(term522, 28, 34363745472L);
        setLongElement(term522, 29, 34363745472L);
        setLongElement(term522, 30, 34364896224L);
        setLongElement(term522, 31, 34363745472L);
        setElement(term389, 3, term522);
        setShortElement(term556, 0, (short) 2);
        setShortElement(term556, 1, (short) 12);
        setElement(term555, 0, term556);
        setIntElement(term589, 0, 1638400);
        setIntElement(term589, 1, 720907);
        setElement(term555, 1, term589);
        setElement(term622, 0, term623);
        setElement(term622, 1, term625);
        setElement(term555, 2, term622);
        setLongElement(term627, 0, 34363745472L);
        setLongElement(term627, 1, 34363745472L);
        setElement(term555, 3, term627);
        setElement(term389, 4, term555);
        setField(term388, term388.getClass(), "backtrace", term389);
        setField(term388, term388.getClass(), "detailMessage", "tbcdzjIfER");
        setField(term388, term388.getClass(), "cause", term388);
        setField(term388, term388.getClass(), "stackTrace", term672);
        setIntField(term388, term388.getClass(), "depth", 34);
        setIntField(term674, term674.getClass(), "modCount", 0);
        setField(term388, term388.getClass(), "suppressedExceptions", term674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = "ZiaGIbnzTs";
        args[1] = term388;
        try {
            callMethod(klass, "_wrapError", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


