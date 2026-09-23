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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_cannotInitializeForInjectMocksAnnotation_630954850130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6342;
     Object term6355;

    public Reporter_cannotInitializeForInjectMocksAnnotation_630954850130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6342 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term6424 = Class.forName((String) "org.assertj.core.internal.ObjectArrays");
        Class<? extends Object> term6427 = Class.forName((String) "org.objectweb.asm.signature.SignatureWriter");
        Class<? extends Object> term6429 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniAccept");
        Class<? extends Object> term6433 = Class.forName((String) "java.io.CharConversionException");
        Class<? extends Object> term6438 = Class.forName((String) "java.lang.ProcessBuilder$NullOutputStream");
        Class<? extends Object> term6442 = Class.forName((String) "java.util.concurrent.BrokenBarrierException");
        Class<? extends Object> term6446 = Class.forName((String) "java.util.stream.Collectors");
        Class<? extends Object> term6450 = Class.forName((String) "org.assertj.core.internal.InputStreams");
        Class<? extends Object> term6454 = Class.forName((String) "java.util.TooManyListenersException");
        Class<? extends Object> term6458 = Class.forName((String) "java.util.stream.Nodes$SizedCollectorTask$OfDouble");
        Class<? extends Object> term6462 = Class.forName((String) "java.util.Vector$1");
        Class<? extends Object> term6466 = Class.forName((String) "org.assertj.core.presentation.NumberGrouping");
        Class<? extends Object> term6470 = Class.forName((String) "java.nio.file.AccessDeniedException");
        Class<? extends Object> term6474 = Class.forName((String) "java.nio.channels.CompletionHandler");
        Class<? extends Object> term6476 = Class.forName((String) "java.util.regex.Pattern$BnM");
        Class<? extends Object> term6479 = Class.forName((String) "org.hamcrest.generator.FactoryMethod");
        Class<? extends Object> term6481 = Class.forName((String) "java.nio.file.NotLinkException");
        Class<? extends Object> term6483 = Class.forName((String) "java.nio.channels.ClosedByInterruptException");
        Class<? extends Object> term6586 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque$Itr");
        Class<? extends Object> term6588 = Class.forName((String) "java.util.stream.Nodes$AbstractConcNode");
        term6355 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term6356 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6357 = (short[]) newShortArray(32);
        int[] term6390 = (int[]) newIntArray(32);
        Object[] term6423 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6485 = (long[]) newLongArray(32);
        Object[] term6518 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6519 = (short[]) newShortArray(32);
        int[] term6552 = (int[]) newIntArray(32);
        Object[] term6585 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6590 = (long[]) newLongArray(32);
        Object[] term6635 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6637 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6357, 0, (short) 1);
        setShortElement(term6357, 1, (short) 2);
        setShortElement(term6357, 2, (short) 1);
        setShortElement(term6357, 3, (short) 7);
        setShortElement(term6357, 4, (short) 2);
        setShortElement(term6357, 5, (short) 1);
        setShortElement(term6357, 6, (short) 6);
        setShortElement(term6357, 7, (short) 2);
        setShortElement(term6357, 8, (short) 10);
        setShortElement(term6357, 9, (short) 11);
        setShortElement(term6357, 10, (short) 29);
        setShortElement(term6357, 11, (short) 5);
        setShortElement(term6357, 12, (short) 4);
        setShortElement(term6357, 13, (short) 6);
        setShortElement(term6357, 14, (short) 8);
        setShortElement(term6357, 15, (short) 6);
        setShortElement(term6357, 16, (short) 9);
        setShortElement(term6357, 17, (short) 10);
        setShortElement(term6357, 18, (short) 11);
        setShortElement(term6357, 19, (short) 4);
        setShortElement(term6357, 20, (short) 1);
        setShortElement(term6357, 22, (short) 10);
        setShortElement(term6357, 23, (short) 3);
        setShortElement(term6357, 24, (short) 4);
        setShortElement(term6357, 25, (short) 4);
        setShortElement(term6357, 26, (short) 1);
        setShortElement(term6357, 27, (short) 2);
        setShortElement(term6357, 28, (short) 3);
        setShortElement(term6357, 29, (short) 3);
        setShortElement(term6357, 30, (short) 13);
        setShortElement(term6357, 31, (short) 1);
        setElement(term6356, 0, term6357);
        setIntElement(term6390, 1, 5570560);
        setIntElement(term6390, 2, 327680);
        setIntElement(term6390, 3, 4456454);
        setIntElement(term6390, 4, 1769472);
        setIntElement(term6390, 5, 14876672);
        setIntElement(term6390, 6, 6225920);
        setIntElement(term6390, 7, 917504);
        setIntElement(term6390, 8, 327680);
        setIntElement(term6390, 9, 8519680);
        setIntElement(term6390, 10, 917504);
        setIntElement(term6390, 11, 11993088);
        setIntElement(term6390, 12, 655360);
        setIntElement(term6390, 13, 7864320);
        setIntElement(term6390, 14, 3735552);
        setIntElement(term6390, 15, 7143424);
        setIntElement(term6390, 16, 8454144);
        setIntElement(term6390, 17, 9240576);
        setIntElement(term6390, 18, 196608);
        setIntElement(term6390, 19, 3801088);
        setIntElement(term6390, 20, 786432);
        setIntElement(term6390, 21, 589824);
        setIntElement(term6390, 22, 17170432);
        setIntElement(term6390, 23, 1376256);
        setIntElement(term6390, 24, 5242880);
        setIntElement(term6390, 25, 2883584);
        setIntElement(term6390, 26, 20774912);
        setIntElement(term6390, 27, 262144);
        setIntElement(term6390, 28, 2555904);
        setIntElement(term6390, 29, 1835008);
        setIntElement(term6390, 30, 6029312);
        setIntElement(term6390, 31, 327680);
        setElement(term6356, 1, term6390);
        setElement(term6423, 0, term6424);
        setElement(term6423, 1, term6424);
        setElement(term6423, 2, term6427);
        setElement(term6423, 3, term6429);
        setElement(term6423, 4, term6433);
        setElement(term6423, 5, term6433);
        setElement(term6423, 6, term6438);
        setElement(term6423, 7, term6438);
        setElement(term6423, 8, term6442);
        setElement(term6423, 9, term6442);
        setElement(term6423, 10, term6442);
        setElement(term6423, 11, term6442);
        setElement(term6423, 12, term6442);
        setElement(term6423, 13, term6446);
        setElement(term6423, 14, term6446);
        setElement(term6423, 15, term6450);
        setElement(term6423, 16, term6450);
        setElement(term6423, 17, term6450);
        setElement(term6423, 18, term6450);
        setElement(term6423, 19, term6454);
        setElement(term6423, 20, term6454);
        setElement(term6423, 21, term6454);
        setElement(term6423, 22, term6458);
        setElement(term6423, 23, term6450);
        setElement(term6423, 24, term6462);
        setElement(term6423, 25, term6466);
        setElement(term6423, 26, term6470);
        setElement(term6423, 27, term6474);
        setElement(term6423, 28, term6476);
        setElement(term6423, 29, term6479);
        setElement(term6423, 30, term6481);
        setElement(term6423, 31, term6483);
        setElement(term6356, 2, term6423);
        setLongElement(term6485, 0, 34363746224L);
        setLongElement(term6485, 1, 34363775512L);
        setLongElement(term6485, 2, 34363775512L);
        setLongElement(term6485, 3, 34363775512L);
        setLongElement(term6485, 4, 131922273947344L);
        setLongElement(term6485, 5, 34364440080L);
        setLongElement(term6485, 6, 131922274021824L);
        setLongElement(term6485, 7, 131922273860752L);
        setLongElement(term6485, 8, 131922273860640L);
        setLongElement(term6485, 9, 131922273860784L);
        setLongElement(term6485, 10, 131922273908224L);
        setLongElement(term6485, 11, 34363766248L);
        setLongElement(term6485, 12, 34363766248L);
        setLongElement(term6485, 13, 131919151456576L);
        setLongElement(term6485, 14, 131919151456576L);
        setLongElement(term6485, 15, 131919151456432L);
        setLongElement(term6485, 16, 131919151467536L);
        setLongElement(term6485, 17, 131919151469184L);
        setLongElement(term6485, 18, 131919151469952L);
        setLongElement(term6485, 19, 131919148867040L);
        setLongElement(term6485, 20, 34363739368L);
        setLongElement(term6485, 21, 34363739368L);
        setLongElement(term6485, 22, 131919151455072L);
        setLongElement(term6485, 23, 34363829248L);
        setLongElement(term6485, 24, 131919148867040L);
        setLongElement(term6485, 25, 131919147178992L);
        setLongElement(term6485, 26, 34363745472L);
        setLongElement(term6485, 27, 34364710216L);
        setLongElement(term6485, 28, 34363745472L);
        setLongElement(term6485, 29, 34363745472L);
        setLongElement(term6485, 30, 34364896224L);
        setLongElement(term6485, 31, 34363745472L);
        setElement(term6356, 3, term6485);
        setShortElement(term6519, 0, (short) 2);
        setShortElement(term6519, 1, (short) 12);
        setElement(term6518, 0, term6519);
        setIntElement(term6552, 0, 1638400);
        setIntElement(term6552, 1, 720907);
        setElement(term6518, 1, term6552);
        setElement(term6585, 0, term6586);
        setElement(term6585, 1, term6588);
        setElement(term6518, 2, term6585);
        setLongElement(term6590, 0, 34363745472L);
        setLongElement(term6590, 1, 34363745472L);
        setElement(term6518, 3, term6590);
        setElement(term6356, 4, term6518);
        setField(term6355, term6355.getClass(), "backtrace", term6356);
        setField(term6355, term6355.getClass(), "detailMessage", "ZiaGIbnzTs");
        setField(term6355, term6355.getClass(), "cause", term6355);
        setField(term6355, term6355.getClass(), "stackTrace", term6635);
        setIntField(term6355, term6355.getClass(), "depth", 34);
        setIntField(term6637, term6637.getClass(), "modCount", 0);
        setField(term6355, term6355.getClass(), "suppressedExceptions", term6637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = "aJlieCFVtF";
        args[1] = term6355;
        try {
            callMethod(klass, "cannotInitializeForInjectMocksAnnotation", argTypes, term6342, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


