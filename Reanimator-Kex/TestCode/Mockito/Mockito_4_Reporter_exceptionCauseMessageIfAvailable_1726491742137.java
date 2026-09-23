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

public class Reporter_exceptionCauseMessageIfAvailable_1726491742137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19361;
     Object term19362;

    public Reporter_exceptionCauseMessageIfAvailable_1726491742137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19361 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term19431 = Class.forName((String) "java.util.stream.DoublePipeline$2$1");
        Class<? extends Object> term19434 = Class.forName((String) "java.util.concurrent.CompletableFuture$BiAccept");
        Class<? extends Object> term19436 = Class.forName((String) "org.assertj.core.util.introspection.MemberUtils");
        Class<? extends Object> term19440 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedCallable");
        Class<? extends Object> term19445 = Class.forName((String) "org.assertj.core.internal.cglib.core.ClassEmitter$1");
        Class<? extends Object> term19449 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJShort$Sorter");
        Class<? extends Object> term19453 = Class.forName((String) "java.lang.invoke.VarHandleBytes");
        Class<? extends Object> term19457 = Class.forName((String) "java.util.concurrent.SubmissionPublisher$ConsumerSubscriber");
        Class<? extends Object> term19461 = Class.forName((String) "java.nio.HeapDoubleBufferR");
        Class<? extends Object> term19465 = Class.forName((String) "java.util.zip.CheckedOutputStream");
        Class<? extends Object> term19469 = Class.forName((String) "org.objectweb.asm.tree.IincInsnNode");
        Class<? extends Object> term19473 = Class.forName((String) "java.io.Console");
        Class<? extends Object> term19477 = Class.forName((String) "org.mockito.cglib.proxy.DispatcherGenerator");
        Class<? extends Object> term19481 = Class.forName((String) "net.sourceforge.cobertura.javancss.parser.java15.debug.TokenMgrError");
        Class<? extends Object> term19483 = Class.forName((String) "org.objectweb.asm.commons.Remapper");
        Class<? extends Object> term19486 = Class.forName((String) "org.mockito.internal.invocation.finder.VerifiableInvocationsFinder$1");
        Class<? extends Object> term19488 = Class.forName((String) "java.util.Arrays$NaturalOrder");
        Class<? extends Object> term19490 = Class.forName((String) "java.util.function.IntToDoubleFunction");
        Class<? extends Object> term19593 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfInt$Taking");
        Class<? extends Object> term19595 = Class.forName((String) "org.assertj.core.internal.cglib.proxy.ProxyRefDispatcher");
        term19362 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term19363 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19364 = (short[]) newShortArray(32);
        int[] term19397 = (int[]) newIntArray(32);
        Object[] term19430 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19492 = (long[]) newLongArray(32);
        Object[] term19525 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19526 = (short[]) newShortArray(32);
        int[] term19559 = (int[]) newIntArray(32);
        Object[] term19592 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19597 = (long[]) newLongArray(32);
        Object[] term19642 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term19644 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term19364, 0, (short) 1);
        setShortElement(term19364, 1, (short) 2);
        setShortElement(term19364, 2, (short) 1);
        setShortElement(term19364, 3, (short) 7);
        setShortElement(term19364, 4, (short) 2);
        setShortElement(term19364, 5, (short) 1);
        setShortElement(term19364, 6, (short) 6);
        setShortElement(term19364, 7, (short) 2);
        setShortElement(term19364, 8, (short) 10);
        setShortElement(term19364, 9, (short) 11);
        setShortElement(term19364, 10, (short) 29);
        setShortElement(term19364, 11, (short) 5);
        setShortElement(term19364, 12, (short) 4);
        setShortElement(term19364, 13, (short) 6);
        setShortElement(term19364, 14, (short) 8);
        setShortElement(term19364, 15, (short) 6);
        setShortElement(term19364, 16, (short) 9);
        setShortElement(term19364, 17, (short) 10);
        setShortElement(term19364, 18, (short) 11);
        setShortElement(term19364, 19, (short) 4);
        setShortElement(term19364, 20, (short) 1);
        setShortElement(term19364, 22, (short) 10);
        setShortElement(term19364, 23, (short) 3);
        setShortElement(term19364, 24, (short) 4);
        setShortElement(term19364, 25, (short) 4);
        setShortElement(term19364, 26, (short) 1);
        setShortElement(term19364, 27, (short) 2);
        setShortElement(term19364, 28, (short) 3);
        setShortElement(term19364, 29, (short) 3);
        setShortElement(term19364, 30, (short) 13);
        setShortElement(term19364, 31, (short) 1);
        setElement(term19363, 0, term19364);
        setIntElement(term19397, 1, 5570560);
        setIntElement(term19397, 2, 327680);
        setIntElement(term19397, 3, 4456454);
        setIntElement(term19397, 4, 1769472);
        setIntElement(term19397, 5, 14876672);
        setIntElement(term19397, 6, 6225920);
        setIntElement(term19397, 7, 917504);
        setIntElement(term19397, 8, 327680);
        setIntElement(term19397, 9, 8519680);
        setIntElement(term19397, 10, 917504);
        setIntElement(term19397, 11, 11993088);
        setIntElement(term19397, 12, 655360);
        setIntElement(term19397, 13, 7864320);
        setIntElement(term19397, 14, 3735552);
        setIntElement(term19397, 15, 7143424);
        setIntElement(term19397, 16, 8454144);
        setIntElement(term19397, 17, 9240576);
        setIntElement(term19397, 18, 196608);
        setIntElement(term19397, 19, 3801088);
        setIntElement(term19397, 20, 786432);
        setIntElement(term19397, 21, 589824);
        setIntElement(term19397, 22, 17170432);
        setIntElement(term19397, 23, 1376256);
        setIntElement(term19397, 24, 5242880);
        setIntElement(term19397, 25, 2883584);
        setIntElement(term19397, 26, 20774912);
        setIntElement(term19397, 27, 262144);
        setIntElement(term19397, 28, 2555904);
        setIntElement(term19397, 29, 1835008);
        setIntElement(term19397, 30, 6029312);
        setIntElement(term19397, 31, 327680);
        setElement(term19363, 1, term19397);
        setElement(term19430, 0, term19431);
        setElement(term19430, 1, term19431);
        setElement(term19430, 2, term19434);
        setElement(term19430, 3, term19436);
        setElement(term19430, 4, term19440);
        setElement(term19430, 5, term19440);
        setElement(term19430, 6, term19445);
        setElement(term19430, 7, term19445);
        setElement(term19430, 8, term19449);
        setElement(term19430, 9, term19449);
        setElement(term19430, 10, term19449);
        setElement(term19430, 11, term19449);
        setElement(term19430, 12, term19449);
        setElement(term19430, 13, term19453);
        setElement(term19430, 14, term19453);
        setElement(term19430, 15, term19457);
        setElement(term19430, 16, term19457);
        setElement(term19430, 17, term19457);
        setElement(term19430, 18, term19457);
        setElement(term19430, 19, term19461);
        setElement(term19430, 20, term19461);
        setElement(term19430, 21, term19461);
        setElement(term19430, 22, term19465);
        setElement(term19430, 23, term19457);
        setElement(term19430, 24, term19469);
        setElement(term19430, 25, term19473);
        setElement(term19430, 26, term19477);
        setElement(term19430, 27, term19481);
        setElement(term19430, 28, term19483);
        setElement(term19430, 29, term19486);
        setElement(term19430, 30, term19488);
        setElement(term19430, 31, term19490);
        setElement(term19363, 2, term19430);
        setLongElement(term19492, 0, 34363746224L);
        setLongElement(term19492, 1, 34363775512L);
        setLongElement(term19492, 2, 34363775512L);
        setLongElement(term19492, 3, 34363775512L);
        setLongElement(term19492, 4, 131922273947344L);
        setLongElement(term19492, 5, 34364440080L);
        setLongElement(term19492, 6, 131922274021824L);
        setLongElement(term19492, 7, 131922273860752L);
        setLongElement(term19492, 8, 131922273860640L);
        setLongElement(term19492, 9, 131922273860784L);
        setLongElement(term19492, 10, 131922273908224L);
        setLongElement(term19492, 11, 34363766248L);
        setLongElement(term19492, 12, 34363766248L);
        setLongElement(term19492, 13, 131919151456576L);
        setLongElement(term19492, 14, 131919151456576L);
        setLongElement(term19492, 15, 131919151456432L);
        setLongElement(term19492, 16, 131919151467536L);
        setLongElement(term19492, 17, 131919151469184L);
        setLongElement(term19492, 18, 131919151469952L);
        setLongElement(term19492, 19, 131919148867040L);
        setLongElement(term19492, 20, 34363739368L);
        setLongElement(term19492, 21, 34363739368L);
        setLongElement(term19492, 22, 131919151455072L);
        setLongElement(term19492, 23, 34363829248L);
        setLongElement(term19492, 24, 131919148867040L);
        setLongElement(term19492, 25, 131919147178992L);
        setLongElement(term19492, 26, 34363745472L);
        setLongElement(term19492, 27, 34364710216L);
        setLongElement(term19492, 28, 34363745472L);
        setLongElement(term19492, 29, 34363745472L);
        setLongElement(term19492, 30, 34364896224L);
        setLongElement(term19492, 31, 34363745472L);
        setElement(term19363, 3, term19492);
        setShortElement(term19526, 0, (short) 2);
        setShortElement(term19526, 1, (short) 12);
        setElement(term19525, 0, term19526);
        setIntElement(term19559, 0, 1638400);
        setIntElement(term19559, 1, 720907);
        setElement(term19525, 1, term19559);
        setElement(term19592, 0, term19593);
        setElement(term19592, 1, term19595);
        setElement(term19525, 2, term19592);
        setLongElement(term19597, 0, 34363745472L);
        setLongElement(term19597, 1, 34363745472L);
        setElement(term19525, 3, term19597);
        setElement(term19363, 4, term19525);
        setField(term19362, term19362.getClass(), "backtrace", term19363);
        setField(term19362, term19362.getClass(), "detailMessage", "xrwlQZdwCp");
        setField(term19362, term19362.getClass(), "cause", term19362);
        setField(term19362, term19362.getClass(), "stackTrace", term19642);
        setIntField(term19362, term19362.getClass(), "depth", 34);
        setIntField(term19644, term19644.getClass(), "modCount", 0);
        setField(term19362, term19362.getClass(), "suppressedExceptions", term19644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Exception");
        Object[] args = new Object[1];
        args[0] = term19362;
        try {
            callMethod(klass, "exceptionCauseMessageIfAvailable", argTypes, term19361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


