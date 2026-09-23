package org.mockito.exceptions;

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
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_invocationListenerThrewException_1767381550135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12858;
     Object term12859;

    public Reporter_invocationListenerThrewException_1767381550135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12858 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term12928 = Class.forName((String) "java.lang.StackStreamFactory$WalkerState");
        Class<? extends Object> term12931 = Class.forName((String) "java.util.regex.Pattern$LineEnding");
        Class<? extends Object> term12933 = Class.forName((String) "org.mockito.internal.debugging.LoggingListener");
        Class<? extends Object> term12937 = Class.forName((String) "org.mockito.exceptions.Discrepancy");
        Class<? extends Object> term12942 = Class.forName((String) "org.hamcrest.object.IsCompatibleType");
        Class<? extends Object> term12946 = Class.forName((String) "java.util.zip.ZipFile$CleanableResource");
        Class<? extends Object> term12950 = Class.forName((String) "java.util.concurrent.TimeoutException");
        Class<? extends Object> term12954 = Class.forName((String) "java.util.zip.GZIPInputStream$1");
        Class<? extends Object> term12958 = Class.forName((String) "net.sourceforge.cobertura.instrument.pass3.AbstractCodeProvider$Abcd");
        Class<? extends Object> term12962 = Class.forName((String) "java.util.concurrent.ForkJoinTask$ExceptionNode");
        Class<? extends Object> term12966 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfLong$Dropping");
        Class<? extends Object> term12970 = Class.forName((String) "java.util.stream.AbstractShortCircuitTask");
        Class<? extends Object> term12974 = Class.forName((String) "java.nio.channels.FileChannel");
        Class<? extends Object> term12978 = Class.forName((String) "java.nio.charset.IllegalCharsetNameException");
        Class<? extends Object> term12980 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy");
        Class<? extends Object> term12983 = Class.forName((String) "org.mockito.internal.configuration.DefaultAnnotationEngine$1");
        Class<? extends Object> term12985 = Class.forName((String) "java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet");
        Class<? extends Object> term12987 = Class.forName((String) "java.util.DualPivotQuicksort");
        Class<? extends Object> term13090 = Class.forName((String) "java.nio.file.StandardOpenOption");
        Class<? extends Object> term13092 = Class.forName((String) "java.lang.reflect.Field");
        term12859 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term12860 = (Object[]) newArray("java.lang.Object", 5);
        short[] term12861 = (short[]) newShortArray(32);
        int[] term12894 = (int[]) newIntArray(32);
        Object[] term12927 = (Object[]) newArray("java.lang.Object", 32);
        long[] term12989 = (long[]) newLongArray(32);
        Object[] term13022 = (Object[]) newArray("java.lang.Object", 5);
        short[] term13023 = (short[]) newShortArray(32);
        int[] term13056 = (int[]) newIntArray(32);
        Object[] term13089 = (Object[]) newArray("java.lang.Object", 32);
        long[] term13094 = (long[]) newLongArray(32);
        Object[] term13139 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term13141 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term12861, 0, (short) 1);
        setShortElement(term12861, 1, (short) 2);
        setShortElement(term12861, 2, (short) 1);
        setShortElement(term12861, 3, (short) 7);
        setShortElement(term12861, 4, (short) 2);
        setShortElement(term12861, 5, (short) 1);
        setShortElement(term12861, 6, (short) 6);
        setShortElement(term12861, 7, (short) 2);
        setShortElement(term12861, 8, (short) 10);
        setShortElement(term12861, 9, (short) 11);
        setShortElement(term12861, 10, (short) 29);
        setShortElement(term12861, 11, (short) 5);
        setShortElement(term12861, 12, (short) 4);
        setShortElement(term12861, 13, (short) 6);
        setShortElement(term12861, 14, (short) 8);
        setShortElement(term12861, 15, (short) 6);
        setShortElement(term12861, 16, (short) 9);
        setShortElement(term12861, 17, (short) 10);
        setShortElement(term12861, 18, (short) 11);
        setShortElement(term12861, 19, (short) 4);
        setShortElement(term12861, 20, (short) 1);
        setShortElement(term12861, 22, (short) 10);
        setShortElement(term12861, 23, (short) 3);
        setShortElement(term12861, 24, (short) 4);
        setShortElement(term12861, 25, (short) 4);
        setShortElement(term12861, 26, (short) 1);
        setShortElement(term12861, 27, (short) 2);
        setShortElement(term12861, 28, (short) 3);
        setShortElement(term12861, 29, (short) 3);
        setShortElement(term12861, 30, (short) 13);
        setShortElement(term12861, 31, (short) 1);
        setElement(term12860, 0, term12861);
        setIntElement(term12894, 1, 5570560);
        setIntElement(term12894, 2, 327680);
        setIntElement(term12894, 3, 4456454);
        setIntElement(term12894, 4, 1769472);
        setIntElement(term12894, 5, 14876672);
        setIntElement(term12894, 6, 6225920);
        setIntElement(term12894, 7, 917504);
        setIntElement(term12894, 8, 327680);
        setIntElement(term12894, 9, 8519680);
        setIntElement(term12894, 10, 917504);
        setIntElement(term12894, 11, 11993088);
        setIntElement(term12894, 12, 655360);
        setIntElement(term12894, 13, 7864320);
        setIntElement(term12894, 14, 3735552);
        setIntElement(term12894, 15, 7143424);
        setIntElement(term12894, 16, 8454144);
        setIntElement(term12894, 17, 9240576);
        setIntElement(term12894, 18, 196608);
        setIntElement(term12894, 19, 3801088);
        setIntElement(term12894, 20, 786432);
        setIntElement(term12894, 21, 589824);
        setIntElement(term12894, 22, 17170432);
        setIntElement(term12894, 23, 1376256);
        setIntElement(term12894, 24, 5242880);
        setIntElement(term12894, 25, 2883584);
        setIntElement(term12894, 26, 20774912);
        setIntElement(term12894, 27, 262144);
        setIntElement(term12894, 28, 2555904);
        setIntElement(term12894, 29, 1835008);
        setIntElement(term12894, 30, 6029312);
        setIntElement(term12894, 31, 327680);
        setElement(term12860, 1, term12894);
        setElement(term12927, 0, term12928);
        setElement(term12927, 1, term12928);
        setElement(term12927, 2, term12931);
        setElement(term12927, 3, term12933);
        setElement(term12927, 4, term12937);
        setElement(term12927, 5, term12937);
        setElement(term12927, 6, term12942);
        setElement(term12927, 7, term12942);
        setElement(term12927, 8, term12946);
        setElement(term12927, 9, term12946);
        setElement(term12927, 10, term12946);
        setElement(term12927, 11, term12946);
        setElement(term12927, 12, term12946);
        setElement(term12927, 13, term12950);
        setElement(term12927, 14, term12950);
        setElement(term12927, 15, term12954);
        setElement(term12927, 16, term12954);
        setElement(term12927, 17, term12954);
        setElement(term12927, 18, term12954);
        setElement(term12927, 19, term12958);
        setElement(term12927, 20, term12958);
        setElement(term12927, 21, term12958);
        setElement(term12927, 22, term12962);
        setElement(term12927, 23, term12954);
        setElement(term12927, 24, term12966);
        setElement(term12927, 25, term12970);
        setElement(term12927, 26, term12974);
        setElement(term12927, 27, term12978);
        setElement(term12927, 28, term12980);
        setElement(term12927, 29, term12983);
        setElement(term12927, 30, term12985);
        setElement(term12927, 31, term12987);
        setElement(term12860, 2, term12927);
        setLongElement(term12989, 0, 34363746224L);
        setLongElement(term12989, 1, 34363775512L);
        setLongElement(term12989, 2, 34363775512L);
        setLongElement(term12989, 3, 34363775512L);
        setLongElement(term12989, 4, 131922273947344L);
        setLongElement(term12989, 5, 34364440080L);
        setLongElement(term12989, 6, 131922274021824L);
        setLongElement(term12989, 7, 131922273860752L);
        setLongElement(term12989, 8, 131922273860640L);
        setLongElement(term12989, 9, 131922273860784L);
        setLongElement(term12989, 10, 131922273908224L);
        setLongElement(term12989, 11, 34363766248L);
        setLongElement(term12989, 12, 34363766248L);
        setLongElement(term12989, 13, 131919151456576L);
        setLongElement(term12989, 14, 131919151456576L);
        setLongElement(term12989, 15, 131919151456432L);
        setLongElement(term12989, 16, 131919151467536L);
        setLongElement(term12989, 17, 131919151469184L);
        setLongElement(term12989, 18, 131919151469952L);
        setLongElement(term12989, 19, 131919148867040L);
        setLongElement(term12989, 20, 34363739368L);
        setLongElement(term12989, 21, 34363739368L);
        setLongElement(term12989, 22, 131919151455072L);
        setLongElement(term12989, 23, 34363829248L);
        setLongElement(term12989, 24, 131919148867040L);
        setLongElement(term12989, 25, 131919147178992L);
        setLongElement(term12989, 26, 34363745472L);
        setLongElement(term12989, 27, 34364710216L);
        setLongElement(term12989, 28, 34363745472L);
        setLongElement(term12989, 29, 34363745472L);
        setLongElement(term12989, 30, 34364896224L);
        setLongElement(term12989, 31, 34363745472L);
        setElement(term12860, 3, term12989);
        setShortElement(term13023, 0, (short) 2);
        setShortElement(term13023, 1, (short) 12);
        setElement(term13022, 0, term13023);
        setIntElement(term13056, 0, 1638400);
        setIntElement(term13056, 1, 720907);
        setElement(term13022, 1, term13056);
        setElement(term13089, 0, term13090);
        setElement(term13089, 1, term13092);
        setElement(term13022, 2, term13089);
        setLongElement(term13094, 0, 34363745472L);
        setLongElement(term13094, 1, 34363745472L);
        setElement(term13022, 3, term13094);
        setElement(term12860, 4, term13022);
        setField(term12859, term12859.getClass(), "backtrace", term12860);
        setField(term12859, term12859.getClass(), "detailMessage", "flxyYxBRtu");
        setField(term12859, term12859.getClass(), "cause", term12859);
        setField(term12859, term12859.getClass(), "stackTrace", term13139);
        setIntField(term12859, term12859.getClass(), "depth", 34);
        setIntField(term13141, term13141.getClass(), "modCount", 0);
        setField(term12859, term12859.getClass(), "suppressedExceptions", term13141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.listeners.InvocationListener");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12859;
        try {
            callMethod(klass, "invocationListenerThrewException", argTypes, term12858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


