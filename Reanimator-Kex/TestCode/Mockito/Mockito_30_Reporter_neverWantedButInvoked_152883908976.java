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

public class Reporter_neverWantedButInvoked_152883908976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15284;
     Object term15285;

    public Reporter_neverWantedButInvoked_152883908976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15284 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term15355 = Class.forName((String) "org.assertj.core.internal.cglib.proxy.MethodInterceptorGenerator");
        Class<? extends Object> term15357 = Class.forName((String) "org.fest.util.FilesException");
        Class<? extends Object> term15359 = Class.forName((String) "java.util.stream.IntPipeline$6");
        Class<? extends Object> term15361 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ByteBufferHandle");
        Class<? extends Object> term15363 = Class.forName((String) "java.nio.file.StandardWatchEventKinds$StdWatchEventKind");
        Class<? extends Object> term15365 = Class.forName((String) "net.sourceforge.cobertura.javancss.parser.JavaParser$ModifierSet");
        Class<? extends Object> term15367 = Class.forName((String) "java.util.Collections$EmptyList");
        Class<? extends Object> term15369 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsIterator");
        Class<? extends Object> term15371 = Class.forName((String) "org.mockito.cglib.proxy.NoOpGenerator");
        Class<? extends Object> term15373 = Class.forName((String) "java.lang.CharSequence$1CharIterator");
        Class<? extends Object> term15375 = Class.forName((String) "org.assertj.core.internal.cglib.asm.AnnotationVisitor");
        Class<? extends Object> term15377 = Class.forName((String) "org.mockito.internal.matchers.CompareTo");
        Class<? extends Object> term15379 = Class.forName((String) "org.assertj.core.internal.cglib.core.DebuggingClassWriter$1");
        Class<? extends Object> term15381 = Class.forName((String) "java.lang.Enum");
        Class<? extends Object> term15383 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedEntrySet");
        Class<? extends Object> term15385 = Class.forName((String) "org.assertj.core.error.ShouldBeOfClassIn");
        Class<? extends Object> term15387 = Class.forName((String) "org.assertj.core.util.IterableUtil");
        term15285 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term15286 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term15287 = (Object[]) newArray("java.lang.Object", 5);
        short[] term15288 = (short[]) newShortArray(32);
        int[] term15321 = (int[]) newIntArray(32);
        Object[] term15354 = (Object[]) newArray("java.lang.Object", 32);
        long[] term15389 = (long[]) newLongArray(32);
        Object[] term15422 = (Object[]) newArray("java.lang.Object", 5);
        short[] term15423 = (short[]) newShortArray(32);
        int[] term15456 = (int[]) newIntArray(32);
        Object[] term15489 = (Object[]) newArray("java.lang.Object", 32);
        long[] term15490 = (long[]) newLongArray(32);
        Object[] term15523 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term15525 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term15527 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term15288, 0, (short) 1);
        setShortElement(term15288, 2, (short) 1);
        setShortElement(term15288, 3, (short) 2);
        setShortElement(term15288, 4, (short) 1);
        setShortElement(term15288, 5, (short) 7);
        setShortElement(term15288, 6, (short) 2);
        setShortElement(term15288, 7, (short) 1);
        setShortElement(term15288, 8, (short) 6);
        setShortElement(term15288, 9, (short) 2);
        setShortElement(term15288, 10, (short) 10);
        setShortElement(term15288, 11, (short) 11);
        setShortElement(term15288, 12, (short) 29);
        setShortElement(term15288, 13, (short) 5);
        setShortElement(term15288, 14, (short) 4);
        setShortElement(term15288, 15, (short) 4);
        setShortElement(term15288, 16, (short) 3);
        setShortElement(term15288, 17, (short) 5);
        setShortElement(term15288, 18, (short) 9);
        setShortElement(term15288, 19, (short) 10);
        setShortElement(term15288, 20, (short) 11);
        setShortElement(term15288, 21, (short) 4);
        setShortElement(term15288, 22, (short) 1);
        setShortElement(term15288, 24, (short) 10);
        setShortElement(term15288, 25, (short) 3);
        setShortElement(term15288, 26, (short) 4);
        setShortElement(term15288, 27, (short) 9);
        setShortElement(term15288, 28, (short) 1);
        setShortElement(term15288, 29, (short) 2);
        setShortElement(term15288, 30, (short) 3);
        setShortElement(term15288, 31, (short) 3);
        setElement(term15287, 0, term15288);
        setIntElement(term15321, 0, 917504);
        setIntElement(term15321, 1, 524288);
        setIntElement(term15321, 3, 5570560);
        setIntElement(term15321, 4, 327680);
        setIntElement(term15321, 5, 4456454);
        setIntElement(term15321, 6, 1769472);
        setIntElement(term15321, 7, 14876672);
        setIntElement(term15321, 8, 6225920);
        setIntElement(term15321, 9, 917504);
        setIntElement(term15321, 10, 327680);
        setIntElement(term15321, 11, 8519680);
        setIntElement(term15321, 12, 917504);
        setIntElement(term15321, 13, 11993088);
        setIntElement(term15321, 14, 655360);
        setIntElement(term15321, 15, 7864320);
        setIntElement(term15321, 16, 3735552);
        setIntElement(term15321, 17, 7143424);
        setIntElement(term15321, 18, 8454144);
        setIntElement(term15321, 19, 9240576);
        setIntElement(term15321, 20, 196608);
        setIntElement(term15321, 21, 3801088);
        setIntElement(term15321, 22, 786432);
        setIntElement(term15321, 23, 589824);
        setIntElement(term15321, 24, 17170432);
        setIntElement(term15321, 25, 1376256);
        setIntElement(term15321, 26, 5242880);
        setIntElement(term15321, 27, 2883584);
        setIntElement(term15321, 28, 20774912);
        setIntElement(term15321, 29, 262144);
        setIntElement(term15321, 30, 2555904);
        setIntElement(term15321, 31, 1835008);
        setElement(term15287, 1, term15321);
        setElement(term15354, 0, term15355);
        setElement(term15354, 1, term15355);
        setElement(term15354, 2, term15357);
        setElement(term15354, 3, term15357);
        setElement(term15354, 4, term15359);
        setElement(term15354, 5, term15361);
        setElement(term15354, 6, term15363);
        setElement(term15354, 7, term15363);
        setElement(term15354, 8, term15365);
        setElement(term15354, 9, term15365);
        setElement(term15354, 10, term15367);
        setElement(term15354, 11, term15367);
        setElement(term15354, 12, term15367);
        setElement(term15354, 13, term15367);
        setElement(term15354, 14, term15367);
        setElement(term15354, 15, term15369);
        setElement(term15354, 16, term15369);
        setElement(term15354, 17, term15371);
        setElement(term15354, 18, term15371);
        setElement(term15354, 19, term15371);
        setElement(term15354, 20, term15371);
        setElement(term15354, 21, term15373);
        setElement(term15354, 22, term15373);
        setElement(term15354, 23, term15373);
        setElement(term15354, 24, term15375);
        setElement(term15354, 25, term15371);
        setElement(term15354, 26, term15377);
        setElement(term15354, 27, term15379);
        setElement(term15354, 28, term15381);
        setElement(term15354, 29, term15383);
        setElement(term15354, 30, term15385);
        setElement(term15354, 31, term15387);
        setElement(term15287, 2, term15354);
        setLongElement(term15389, 0, 34363745304L);
        setLongElement(term15389, 1, 34363745304L);
        setLongElement(term15389, 2, 34363746224L);
        setLongElement(term15389, 3, 34363775512L);
        setLongElement(term15389, 4, 34363775512L);
        setLongElement(term15389, 5, 34363775512L);
        setLongElement(term15389, 6, 128809362246416L);
        setLongElement(term15389, 7, 34364440080L);
        setLongElement(term15389, 8, 128809362321008L);
        setLongElement(term15389, 9, 128809362085936L);
        setLongElement(term15389, 10, 128809362085824L);
        setLongElement(term15389, 11, 128809362085968L);
        setLongElement(term15389, 12, 128809362207296L);
        setLongElement(term15389, 13, 34363766248L);
        setLongElement(term15389, 14, 34363766248L);
        setLongElement(term15389, 15, 128806364538672L);
        setLongElement(term15389, 16, 128806364538672L);
        setLongElement(term15389, 17, 128806364538528L);
        setLongElement(term15389, 18, 128806364549760L);
        setLongElement(term15389, 19, 128806364551280L);
        setLongElement(term15389, 20, 128806364552048L);
        setLongElement(term15389, 21, 128806361950816L);
        setLongElement(term15389, 22, 34363739368L);
        setLongElement(term15389, 23, 34363739368L);
        setLongElement(term15389, 24, 128806364546688L);
        setLongElement(term15389, 25, 34363829248L);
        setLongElement(term15389, 26, 128806361950816L);
        setLongElement(term15389, 27, 128809410801520L);
        setLongElement(term15389, 28, 34363745472L);
        setLongElement(term15389, 29, 34364710216L);
        setLongElement(term15389, 30, 34363745472L);
        setLongElement(term15389, 31, 34363745472L);
        setElement(term15287, 3, term15389);
        setShortElement(term15423, 0, (short) 13);
        setShortElement(term15423, 1, (short) 1);
        setShortElement(term15423, 2, (short) 2);
        setShortElement(term15423, 3, (short) 12);
        setElement(term15422, 0, term15423);
        setIntElement(term15456, 0, 6029312);
        setIntElement(term15456, 1, 327680);
        setIntElement(term15456, 2, 1638400);
        setIntElement(term15456, 3, 720907);
        setElement(term15422, 1, term15456);
        setElement(term15422, 2, term15489);
        setLongElement(term15490, 0, 34364896224L);
        setLongElement(term15490, 1, 34363745472L);
        setLongElement(term15490, 2, 34363745472L);
        setLongElement(term15490, 3, 34363745472L);
        setElement(term15422, 3, term15490);
        setElement(term15287, 4, term15422);
        setField(term15286, term15286.getClass(), "backtrace", term15287);
        setField(term15286, term15286.getClass(), "detailMessage", null);
        setField(term15286, term15286.getClass(), "cause", term15286);
        setField(term15286, term15286.getClass(), "stackTrace", term15523);
        setIntField(term15286, term15286.getClass(), "depth", 36);
        setIntField(term15525, term15525.getClass(), "modCount", 0);
        setField(term15286, term15286.getClass(), "suppressedExceptions", term15525);
        setField(term15285, term15285.getClass(), "stackTraceHolder", term15286);
        setField(term15285, term15285.getClass(), "stackTraceFilter", term15527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[1] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15285;
        try {
            callMethod(klass, "neverWantedButInvoked", argTypes, term15284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


