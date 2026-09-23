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
     Object term5364;
     Object term7528;

    public StringUtils_newIllegalStateException_82531566742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5364 = newInstance(Class.forName("org.apache.commons.codec.binary.StringUtils"));
        Class<? extends Object> term7597 = Class.forName((String) "java.util.Date");
        Class<? extends Object> term7604 = Class.forName((String) "java.nio.file.Files$FileTypeDetectors$1");
        Class<? extends Object> term7608 = Class.forName((String) "java.lang.invoke.LambdaFormEditor$Transform");
        Class<? extends Object> term7611 = Class.forName((String) "java.lang.ProcessEnvironment$StringEntrySet$1");
        Class<? extends Object> term7615 = Class.forName((String) "java.util.stream.Sink$ChainedDouble");
        Class<? extends Object> term7619 = Class.forName((String) "java.util.Collections$SynchronizedSet");
        Class<? extends Object> term7625 = Class.forName((String) "java.util.ConcurrentModificationException");
        Class<? extends Object> term7630 = Class.forName((String) "java.nio.channels.CancelledKeyException");
        Class<? extends Object> term7634 = Class.forName((String) "java.lang.invoke.StringConcatFactory$BytecodeStringBuilderStrategy");
        Class<? extends Object> term7638 = Class.forName((String) "java.lang.reflect.ParameterizedType");
        Class<? extends Object> term7642 = Class.forName((String) "java.util.TreeMap$DescendingSubMap");
        Class<? extends Object> term7646 = Class.forName((String) "kex.java.util.LinkedList$ListItr");
        Class<? extends Object> term7650 = Class.forName((String) "java.util.regex.Pattern$End");
        Class<? extends Object> term7653 = Class.forName((String) "java.util.concurrent.ArrayBlockingQueue$Itrs");
        Class<? extends Object> term7656 = Class.forName((String) "java.util.MissingFormatArgumentException");
        Class<? extends Object> term7659 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.CharGenerator");
        Class<? extends Object> term7662 = Class.forName((String) "java.util.HashMap$ValueSpliterator");
        Class<? extends Object> term7665 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedQueue");
        Class<? extends Object> term7669 = Class.forName((String) "java.nio.channels.CompletionHandler");
        term7528 = newInstance(Class.forName("java.lang.IllegalStateException"));
        Object[] term7529 = (Object[]) newArray("java.lang.Object", 5);
        short[] term7530 = (short[]) newShortArray(32);
        int[] term7563 = (int[]) newIntArray(32);
        Object[] term7596 = (Object[]) newArray("java.lang.Object", 32);
        long[] term7673 = (long[]) newLongArray(32);
        Object[] term7718 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term7720 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term7530, 0, (short) 6);
        setShortElement(term7530, 1, (short) 3);
        setShortElement(term7530, 5, (short) 9);
        setShortElement(term7530, 6, (short) 2);
        setShortElement(term7530, 7, (short) 3);
        setShortElement(term7530, 11, (short) 2);
        setShortElement(term7530, 12, (short) 4);
        setShortElement(term7530, 13, (short) 4);
        setShortElement(term7530, 14, (short) 3);
        setShortElement(term7530, 15, (short) 4);
        setShortElement(term7530, 16, (short) 4);
        setShortElement(term7530, 17, (short) 1);
        setShortElement(term7530, 18, (short) 2);
        setShortElement(term7530, 19, (short) 3);
        setShortElement(term7530, 20, (short) 3);
        setShortElement(term7530, 21, (short) 13);
        setShortElement(term7530, 22, (short) 1);
        setShortElement(term7530, 23, (short) 2);
        setShortElement(term7530, 24, (short) 12);
        setElement(term7529, 0, term7530);
        setIntElement(term7563, 0, 49217536);
        setIntElement(term7563, 2, 6553600);
        setIntElement(term7563, 3, 393216);
        setIntElement(term7563, 4, 3866630);
        setIntElement(term7563, 5, 1245184);
        setIntElement(term7563, 6, 3211264);
        setIntElement(term7563, 8, 6553600);
        setIntElement(term7563, 9, 393216);
        setIntElement(term7563, 10, 3866630);
        setIntElement(term7563, 11, 14352384);
        setIntElement(term7563, 12, 10354688);
        setIntElement(term7563, 13, 2883584);
        setIntElement(term7563, 14, 786432);
        setIntElement(term7563, 15, 1441792);
        setIntElement(term7563, 16, 7733248);
        setIntElement(term7563, 17, 20774912);
        setIntElement(term7563, 18, 262144);
        setIntElement(term7563, 19, 2555904);
        setIntElement(term7563, 20, 1835008);
        setIntElement(term7563, 21, 6029312);
        setIntElement(term7563, 22, 327680);
        setIntElement(term7563, 23, 1638400);
        setIntElement(term7563, 24, 720907);
        setElement(term7529, 1, term7563);
        setElement(term7596, 0, term7597);
        setElement(term7596, 1, term7604);
        setElement(term7596, 2, term7604);
        setElement(term7596, 3, term7608);
        setElement(term7596, 4, term7611);
        setElement(term7596, 5, term7615);
        setElement(term7596, 6, term7619);
        setElement(term7596, 7, term7604);
        setElement(term7596, 8, term7604);
        setElement(term7596, 9, term7608);
        setElement(term7596, 10, term7611);
        setElement(term7596, 11, term7625);
        setElement(term7596, 12, term7630);
        setElement(term7596, 13, term7634);
        setElement(term7596, 14, term7638);
        setElement(term7596, 15, term7642);
        setElement(term7596, 16, term7634);
        setElement(term7596, 17, term7646);
        setElement(term7596, 18, term7650);
        setElement(term7596, 19, term7653);
        setElement(term7596, 20, term7656);
        setElement(term7596, 21, term7659);
        setElement(term7596, 22, term7662);
        setElement(term7596, 23, term7665);
        setElement(term7596, 24, term7669);
        setElement(term7529, 2, term7596);
        setLongElement(term7673, 0, 34364170816L);
        setLongElement(term7673, 1, 34364798256L);
        setLongElement(term7673, 2, 34363739368L);
        setLongElement(term7673, 3, 34363739368L);
        setLongElement(term7673, 4, 34363739368L);
        setLongElement(term7673, 5, 128272890856960L);
        setLongElement(term7673, 6, 34363820048L);
        setLongElement(term7673, 7, 34364798256L);
        setLongElement(term7673, 8, 34363739368L);
        setLongElement(term7673, 9, 34363739368L);
        setLongElement(term7673, 10, 34363739368L);
        setLongElement(term7673, 11, 128276174747280L);
        setLongElement(term7673, 12, 128276174812576L);
        setLongElement(term7673, 13, 128276172450144L);
        setLongElement(term7673, 14, 128276174930736L);
        setLongElement(term7673, 15, 128276172450144L);
        setLongElement(term7673, 16, 128276172450144L);
        setLongElement(term7673, 17, 34363745472L);
        setLongElement(term7673, 18, 34364710216L);
        setLongElement(term7673, 19, 34363745472L);
        setLongElement(term7673, 20, 34363745472L);
        setLongElement(term7673, 21, 34364896224L);
        setLongElement(term7673, 22, 34363745472L);
        setLongElement(term7673, 23, 34363745472L);
        setLongElement(term7673, 24, 34363745472L);
        setElement(term7529, 3, term7673);
        setField(term7528, term7528.getClass(), "backtrace", term7529);
        setField(term7528, term7528.getClass(), "detailMessage", "null: null");
        setField(term7528, term7528.getClass(), "cause", term7528);
        setField(term7528, term7528.getClass(), "stackTrace", term7718);
        setIntField(term7528, term7528.getClass(), "depth", 25);
        setIntField(term7720, term7720.getClass(), "modCount", 0);
        setField(term7528, term7528.getClass(), "suppressedExceptions", term7720);
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
        Object retValue = callMethod(klass, "newIllegalStateException", argTypes, term5364, args);
        assertTrue(recursiveEquals(retValue, term7528));
    }

};


