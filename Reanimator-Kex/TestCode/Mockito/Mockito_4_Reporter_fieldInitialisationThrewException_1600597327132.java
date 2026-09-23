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
import java.lang.String;
import java.lang.Object;

public class Reporter_fieldInitialisationThrewException_1600597327132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9454;
     Object term9455;
     Object term9582;

    public Reporter_fieldInitialisationThrewException_1600597327132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9454 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term61946 = Class.forName((String) "java.io.ObjectStreamClass$FieldReflectorKey");
        term9455 = ((Class) term61946).getDeclaredField((String) "sigs");
        ((Field) term9455).setAccessible(true);
        Class<? extends Object> term9651 = Class.forName((String) "java.nio.BufferUnderflowException");
        Class<? extends Object> term9654 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Stringifiers$StringifierAny");
        Class<? extends Object> term9656 = Class.forName((String) "java.util.regex.ASCII");
        Class<? extends Object> term9660 = Class.forName((String) "org.mockito.internal.stubbing.OngoingStubbingImpl");
        Class<? extends Object> term9665 = Class.forName((String) "org.objectweb.asm.tree.IincInsnNode");
        Class<? extends Object> term9669 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfDouble");
        Class<? extends Object> term9673 = Class.forName((String) "org.mockito.cglib.proxy.NoOp");
        Class<? extends Object> term9677 = Class.forName((String) "org.mockito.internal.configuration.injection.MockInjection$1");
        Class<? extends Object> term9681 = Class.forName((String) "java.util.stream.LongPipeline$5$1");
        Class<? extends Object> term9685 = Class.forName((String) "org.fest.assertions.ItemGroupAssert");
        Class<? extends Object> term9689 = Class.forName((String) "java.util.SimpleTimeZone$Cache");
        Class<? extends Object> term9693 = Class.forName((String) "java.util.StringTokenizer");
        Class<? extends Object> term9697 = Class.forName((String) "java.nio.ShortBuffer");
        Class<? extends Object> term9701 = Class.forName((String) "java.lang.invoke.LambdaForm$Kind");
        Class<? extends Object> term9703 = Class.forName((String) "org.mockito.internal.stubbing.StubbedInvocationMatcher");
        Class<? extends Object> term9706 = Class.forName((String) "org.mockito.cglib.transform.ClassTransformer");
        Class<? extends Object> term9708 = Class.forName((String) "java.lang.StackStreamFactory$CallerClassFinder$ClassBuffer");
        Class<? extends Object> term9710 = Class.forName((String) "org.mockito.internal.listeners.MockingStartedListener");
        Class<? extends Object> term9813 = Class.forName((String) "org.assertj.core.internal.FloatArrays");
        Class<? extends Object> term9815 = Class.forName((String) "org.assertj.core.presentation.HexadecimalRepresentation");
        term9582 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9583 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9584 = (short[]) newShortArray(32);
        int[] term9617 = (int[]) newIntArray(32);
        Object[] term9650 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9712 = (long[]) newLongArray(32);
        Object[] term9745 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9746 = (short[]) newShortArray(32);
        int[] term9779 = (int[]) newIntArray(32);
        Object[] term9812 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9817 = (long[]) newLongArray(32);
        Object[] term9862 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9864 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9584, 0, (short) 1);
        setShortElement(term9584, 1, (short) 2);
        setShortElement(term9584, 2, (short) 1);
        setShortElement(term9584, 3, (short) 7);
        setShortElement(term9584, 4, (short) 2);
        setShortElement(term9584, 5, (short) 1);
        setShortElement(term9584, 6, (short) 6);
        setShortElement(term9584, 7, (short) 2);
        setShortElement(term9584, 8, (short) 10);
        setShortElement(term9584, 9, (short) 11);
        setShortElement(term9584, 10, (short) 29);
        setShortElement(term9584, 11, (short) 5);
        setShortElement(term9584, 12, (short) 4);
        setShortElement(term9584, 13, (short) 6);
        setShortElement(term9584, 14, (short) 8);
        setShortElement(term9584, 15, (short) 6);
        setShortElement(term9584, 16, (short) 9);
        setShortElement(term9584, 17, (short) 10);
        setShortElement(term9584, 18, (short) 11);
        setShortElement(term9584, 19, (short) 4);
        setShortElement(term9584, 20, (short) 1);
        setShortElement(term9584, 22, (short) 10);
        setShortElement(term9584, 23, (short) 3);
        setShortElement(term9584, 24, (short) 4);
        setShortElement(term9584, 25, (short) 4);
        setShortElement(term9584, 26, (short) 1);
        setShortElement(term9584, 27, (short) 2);
        setShortElement(term9584, 28, (short) 3);
        setShortElement(term9584, 29, (short) 3);
        setShortElement(term9584, 30, (short) 13);
        setShortElement(term9584, 31, (short) 1);
        setElement(term9583, 0, term9584);
        setIntElement(term9617, 1, 5570560);
        setIntElement(term9617, 2, 327680);
        setIntElement(term9617, 3, 4456454);
        setIntElement(term9617, 4, 1769472);
        setIntElement(term9617, 5, 14876672);
        setIntElement(term9617, 6, 6225920);
        setIntElement(term9617, 7, 917504);
        setIntElement(term9617, 8, 327680);
        setIntElement(term9617, 9, 8519680);
        setIntElement(term9617, 10, 917504);
        setIntElement(term9617, 11, 11993088);
        setIntElement(term9617, 12, 655360);
        setIntElement(term9617, 13, 7864320);
        setIntElement(term9617, 14, 3735552);
        setIntElement(term9617, 15, 7143424);
        setIntElement(term9617, 16, 8454144);
        setIntElement(term9617, 17, 9240576);
        setIntElement(term9617, 18, 196608);
        setIntElement(term9617, 19, 3801088);
        setIntElement(term9617, 20, 786432);
        setIntElement(term9617, 21, 589824);
        setIntElement(term9617, 22, 17170432);
        setIntElement(term9617, 23, 1376256);
        setIntElement(term9617, 24, 5242880);
        setIntElement(term9617, 25, 2883584);
        setIntElement(term9617, 26, 20774912);
        setIntElement(term9617, 27, 262144);
        setIntElement(term9617, 28, 2555904);
        setIntElement(term9617, 29, 1835008);
        setIntElement(term9617, 30, 6029312);
        setIntElement(term9617, 31, 327680);
        setElement(term9583, 1, term9617);
        setElement(term9650, 0, term9651);
        setElement(term9650, 1, term9651);
        setElement(term9650, 2, term9654);
        setElement(term9650, 3, term9656);
        setElement(term9650, 4, term9660);
        setElement(term9650, 5, term9660);
        setElement(term9650, 6, term9665);
        setElement(term9650, 7, term9665);
        setElement(term9650, 8, term9669);
        setElement(term9650, 9, term9669);
        setElement(term9650, 10, term9669);
        setElement(term9650, 11, term9669);
        setElement(term9650, 12, term9669);
        setElement(term9650, 13, term9673);
        setElement(term9650, 14, term9673);
        setElement(term9650, 15, term9677);
        setElement(term9650, 16, term9677);
        setElement(term9650, 17, term9677);
        setElement(term9650, 18, term9677);
        setElement(term9650, 19, term9681);
        setElement(term9650, 20, term9681);
        setElement(term9650, 21, term9681);
        setElement(term9650, 22, term9685);
        setElement(term9650, 23, term9677);
        setElement(term9650, 24, term9689);
        setElement(term9650, 25, term9693);
        setElement(term9650, 26, term9697);
        setElement(term9650, 27, term9701);
        setElement(term9650, 28, term9703);
        setElement(term9650, 29, term9706);
        setElement(term9650, 30, term9708);
        setElement(term9650, 31, term9710);
        setElement(term9583, 2, term9650);
        setLongElement(term9712, 0, 34363746224L);
        setLongElement(term9712, 1, 34363775512L);
        setLongElement(term9712, 2, 34363775512L);
        setLongElement(term9712, 3, 34363775512L);
        setLongElement(term9712, 4, 131922273947344L);
        setLongElement(term9712, 5, 34364440080L);
        setLongElement(term9712, 6, 131922274021824L);
        setLongElement(term9712, 7, 131922273860752L);
        setLongElement(term9712, 8, 131922273860640L);
        setLongElement(term9712, 9, 131922273860784L);
        setLongElement(term9712, 10, 131922273908224L);
        setLongElement(term9712, 11, 34363766248L);
        setLongElement(term9712, 12, 34363766248L);
        setLongElement(term9712, 13, 131919151456576L);
        setLongElement(term9712, 14, 131919151456576L);
        setLongElement(term9712, 15, 131919151456432L);
        setLongElement(term9712, 16, 131919151467536L);
        setLongElement(term9712, 17, 131919151469184L);
        setLongElement(term9712, 18, 131919151469952L);
        setLongElement(term9712, 19, 131919148867040L);
        setLongElement(term9712, 20, 34363739368L);
        setLongElement(term9712, 21, 34363739368L);
        setLongElement(term9712, 22, 131919151455072L);
        setLongElement(term9712, 23, 34363829248L);
        setLongElement(term9712, 24, 131919148867040L);
        setLongElement(term9712, 25, 131919147178992L);
        setLongElement(term9712, 26, 34363745472L);
        setLongElement(term9712, 27, 34364710216L);
        setLongElement(term9712, 28, 34363745472L);
        setLongElement(term9712, 29, 34363745472L);
        setLongElement(term9712, 30, 34364896224L);
        setLongElement(term9712, 31, 34363745472L);
        setElement(term9583, 3, term9712);
        setShortElement(term9746, 0, (short) 2);
        setShortElement(term9746, 1, (short) 12);
        setElement(term9745, 0, term9746);
        setIntElement(term9779, 0, 1638400);
        setIntElement(term9779, 1, 720907);
        setElement(term9745, 1, term9779);
        setElement(term9812, 0, term9813);
        setElement(term9812, 1, term9815);
        setElement(term9745, 2, term9812);
        setLongElement(term9817, 0, 34363745472L);
        setLongElement(term9817, 1, 34363745472L);
        setElement(term9745, 3, term9817);
        setElement(term9583, 4, term9745);
        setField(term9582, term9582.getClass(), "backtrace", term9583);
        setField(term9582, term9582.getClass(), "detailMessage", "vrQLuWIDJX");
        setField(term9582, term9582.getClass(), "cause", term9582);
        setField(term9582, term9582.getClass(), "stackTrace", term9862);
        setIntField(term9582, term9582.getClass(), "depth", 34);
        setIntField(term9864, term9864.getClass(), "modCount", 0);
        setField(term9582, term9582.getClass(), "suppressedExceptions", term9864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = term9455;
        args[1] = term9582;
        try {
            callMethod(klass, "fieldInitialisationThrewException", argTypes, term9454, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


