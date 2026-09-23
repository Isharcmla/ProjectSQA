package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class StringUtils_newIllegalStateException_82531566742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5360;
     Object term7365;

    public StringUtils_newIllegalStateException_82531566742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5360 = newInstance(Class.forName("org.apache.commons.codec.binary.StringUtils"));
        Class<? extends Object> term7434 = Class.forName((String) "java.util.concurrent.TimeoutException");
        Class<? extends Object> term7441 = Class.forName((String) "java.util.concurrent.CompletableFuture$AsyncRun");
        Class<? extends Object> term7445 = Class.forName((String) "java.util.Date");
        Class<? extends Object> term7448 = Class.forName((String) "java.nio.file.Files$FileTypeDetectors$1");
        Class<? extends Object> term7452 = Class.forName((String) "java.lang.invoke.LambdaFormEditor$Transform");
        Class<? extends Object> term7456 = Class.forName((String) "java.lang.ProcessEnvironment$StringEntrySet$1");
        Class<? extends Object> term7462 = Class.forName((String) "java.util.stream.Sink$ChainedDouble");
        Class<? extends Object> term7467 = Class.forName((String) "java.util.Collections$SynchronizedSet");
        Class<? extends Object> term7471 = Class.forName((String) "java.util.ConcurrentModificationException");
        Class<? extends Object> term7475 = Class.forName((String) "java.nio.channels.CancelledKeyException");
        Class<? extends Object> term7479 = Class.forName((String) "java.lang.invoke.StringConcatFactory$BytecodeStringBuilderStrategy");
        Class<? extends Object> term7483 = Class.forName((String) "java.lang.reflect.ParameterizedType");
        Class<? extends Object> term7487 = Class.forName((String) "java.util.TreeMap$DescendingSubMap");
        Class<? extends Object> term7490 = Class.forName((String) "kex.java.util.LinkedList$ListItr");
        Class<? extends Object> term7493 = Class.forName((String) "java.util.regex.Pattern$End");
        Class<? extends Object> term7496 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs");
        Class<? extends Object> term7499 = Class.forName((String) "java.util.MissingFormatArgumentException");
        Class<? extends Object> term7502 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.CharGenerator");
        Class<? extends Object> term7506 = Class.forName((String) "java.util.HashMap$ValueSpliterator");
        term7365 = newInstance(Class.forName("java.lang.IllegalStateException"));
        Object[] term7366 = (Object[]) newArray("java.lang.Object", 5);
        short[] term7367 = (short[]) newShortArray(32);
        int[] term7400 = (int[]) newIntArray(32);
        Object[] term7433 = (Object[]) newArray("java.lang.Object", 32);
        long[] term7510 = (long[]) newLongArray(32);
        Object[] term7555 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term7557 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term7367, 0, (short) 6);
        setShortElement(term7367, 1, (short) 3);
        setShortElement(term7367, 5, (short) 13);
        setShortElement(term7367, 6, (short) 2);
        setShortElement(term7367, 7, (short) 3);
        setShortElement(term7367, 11, (short) 1);
        setShortElement(term7367, 12, (short) 4);
        setShortElement(term7367, 13, (short) 4);
        setShortElement(term7367, 14, (short) 3);
        setShortElement(term7367, 15, (short) 4);
        setShortElement(term7367, 16, (short) 4);
        setShortElement(term7367, 17, (short) 1);
        setShortElement(term7367, 18, (short) 2);
        setShortElement(term7367, 19, (short) 3);
        setShortElement(term7367, 20, (short) 3);
        setShortElement(term7367, 21, (short) 13);
        setShortElement(term7367, 22, (short) 1);
        setShortElement(term7367, 23, (short) 2);
        setShortElement(term7367, 24, (short) 12);
        setElement(term7366, 0, term7367);
        setIntElement(term7400, 0, 49217536);
        setIntElement(term7400, 2, 6553600);
        setIntElement(term7400, 3, 393216);
        setIntElement(term7400, 4, 3866630);
        setIntElement(term7400, 5, 1245184);
        setIntElement(term7400, 6, 3211264);
        setIntElement(term7400, 8, 6553600);
        setIntElement(term7400, 9, 393216);
        setIntElement(term7400, 10, 3866630);
        setIntElement(term7400, 11, 14352384);
        setIntElement(term7400, 12, 10354688);
        setIntElement(term7400, 13, 2883584);
        setIntElement(term7400, 14, 786432);
        setIntElement(term7400, 15, 1441792);
        setIntElement(term7400, 16, 7733248);
        setIntElement(term7400, 17, 20774912);
        setIntElement(term7400, 18, 262144);
        setIntElement(term7400, 19, 2555904);
        setIntElement(term7400, 20, 1835008);
        setIntElement(term7400, 21, 6029312);
        setIntElement(term7400, 22, 327680);
        setIntElement(term7400, 23, 1638400);
        setIntElement(term7400, 24, 720907);
        setElement(term7366, 1, term7400);
        setElement(term7433, 0, term7434);
        setElement(term7433, 1, term7441);
        setElement(term7433, 2, term7441);
        setElement(term7433, 3, term7445);
        setElement(term7433, 4, term7448);
        setElement(term7433, 5, term7452);
        setElement(term7433, 6, term7456);
        setElement(term7433, 7, term7441);
        setElement(term7433, 8, term7441);
        setElement(term7433, 9, term7445);
        setElement(term7433, 10, term7448);
        setElement(term7433, 11, term7462);
        setElement(term7433, 12, term7467);
        setElement(term7433, 13, term7471);
        setElement(term7433, 14, term7475);
        setElement(term7433, 15, term7479);
        setElement(term7433, 16, term7471);
        setElement(term7433, 17, term7483);
        setElement(term7433, 18, term7487);
        setElement(term7433, 19, term7490);
        setElement(term7433, 20, term7493);
        setElement(term7433, 21, term7496);
        setElement(term7433, 22, term7499);
        setElement(term7433, 23, term7502);
        setElement(term7433, 24, term7506);
        setElement(term7366, 2, term7433);
        setLongElement(term7510, 0, 34364170816L);
        setLongElement(term7510, 1, 34364798256L);
        setLongElement(term7510, 2, 34363739368L);
        setLongElement(term7510, 3, 34363739368L);
        setLongElement(term7510, 4, 34363739368L);
        setLongElement(term7510, 5, 137659878333040L);
        setLongElement(term7510, 6, 34363820048L);
        setLongElement(term7510, 7, 34364798256L);
        setLongElement(term7510, 8, 34363739368L);
        setLongElement(term7510, 9, 34363739368L);
        setLongElement(term7510, 10, 34363739368L);
        setLongElement(term7510, 11, 137660705471200L);
        setLongElement(term7510, 12, 137660705539664L);
        setLongElement(term7510, 13, 137660702914720L);
        setLongElement(term7510, 14, 137660705657408L);
        setLongElement(term7510, 15, 137660702914720L);
        setLongElement(term7510, 16, 137660702914720L);
        setLongElement(term7510, 17, 34363745472L);
        setLongElement(term7510, 18, 34364710216L);
        setLongElement(term7510, 19, 34363745472L);
        setLongElement(term7510, 20, 34363745472L);
        setLongElement(term7510, 21, 34364896224L);
        setLongElement(term7510, 22, 34363745472L);
        setLongElement(term7510, 23, 34363745472L);
        setLongElement(term7510, 24, 34363745472L);
        setElement(term7366, 3, term7510);
        setField(term7365, term7365.getClass(), "backtrace", term7366);
        setField(term7365, term7365.getClass(), "detailMessage", "null: null");
        setField(term7365, term7365.getClass(), "cause", term7365);
        setField(term7365, term7365.getClass(), "stackTrace", term7555);
        setIntField(term7365, term7365.getClass(), "depth", 25);
        setIntField(term7557, term7557.getClass(), "modCount", 0);
        setField(term7365, term7365.getClass(), "suppressedExceptions", term7557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.UnsupportedEncodingException");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "newIllegalStateException", argTypes, term5360, args);
        assertTrue(recursiveEquals(retValue, term7365));
    }

};


