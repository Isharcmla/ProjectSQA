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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Reporter_cannotInjectDependency_967640532136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16010;
     Object term16011;
     Object term16147;
     Object term16148;

    public Reporter_cannotInjectDependency_967640532136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16010 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term69384 = Class.forName((String) "java.lang.ThreadLocal$ThreadLocalMap$Entry");
        term16011 = ((Class) term69384).getDeclaredField((String) "value");
        ((Field) term16011).setAccessible(true);
        term16147 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term16217 = Class.forName((String) "org.assertj.core.api.FloatingPointNumberAssert");
        Class<? extends Object> term16220 = Class.forName((String) "org.assertj.core.internal.cglib.proxy.CallbackGenerator$Context");
        Class<? extends Object> term16222 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term16226 = Class.forName((String) "java.util.WeakHashMap$Entry");
        Class<? extends Object> term16231 = Class.forName((String) "java.lang.PublicMethods");
        Class<? extends Object> term16235 = Class.forName((String) "java.util.stream.DistinctOps$1$2");
        Class<? extends Object> term16239 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term16243 = Class.forName((String) "org.assertj.core.error.ShouldBeInThePast");
        Class<? extends Object> term16247 = Class.forName((String) "java.util.stream.DoublePipeline$5$1");
        Class<? extends Object> term16251 = Class.forName((String) "org.hamcrest.text.StringContainsInOrder");
        Class<? extends Object> term16255 = Class.forName((String) "org.mockito.cglib.core.ClassesKey");
        Class<? extends Object> term16259 = Class.forName((String) "java.lang.invoke.MethodHandleNatives$Constants");
        Class<? extends Object> term16263 = Class.forName((String) "org.mockito.asm.util.TraceClassVisitor");
        Class<? extends Object> term16267 = Class.forName((String) "org.objectweb.asm.xml.Processor$InputSlicingHandler");
        Class<? extends Object> term16269 = Class.forName((String) "java.lang.reflect.AnnotatedArrayType");
        Class<? extends Object> term16272 = Class.forName((String) "org.mockito.asm.util.CheckMethodAdapter");
        Class<? extends Object> term16274 = Class.forName((String) "org.assertj.core.api.AbstractLongArrayAssert");
        Class<? extends Object> term16276 = Class.forName((String) "org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<? extends Object> term16379 = Class.forName((String) "org.assertj.core.description.Description");
        Class<? extends Object> term16381 = Class.forName((String) "org.assertj.core.error.ShouldBeInSameHour");
        term16148 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term16149 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16150 = (short[]) newShortArray(32);
        int[] term16183 = (int[]) newIntArray(32);
        Object[] term16216 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16278 = (long[]) newLongArray(32);
        Object[] term16311 = (Object[]) newArray("java.lang.Object", 5);
        short[] term16312 = (short[]) newShortArray(32);
        int[] term16345 = (int[]) newIntArray(32);
        Object[] term16378 = (Object[]) newArray("java.lang.Object", 32);
        long[] term16383 = (long[]) newLongArray(32);
        Object[] term16428 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term16430 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term16150, 0, (short) 1);
        setShortElement(term16150, 1, (short) 2);
        setShortElement(term16150, 2, (short) 1);
        setShortElement(term16150, 3, (short) 7);
        setShortElement(term16150, 4, (short) 2);
        setShortElement(term16150, 5, (short) 1);
        setShortElement(term16150, 6, (short) 6);
        setShortElement(term16150, 7, (short) 2);
        setShortElement(term16150, 8, (short) 10);
        setShortElement(term16150, 9, (short) 11);
        setShortElement(term16150, 10, (short) 29);
        setShortElement(term16150, 11, (short) 5);
        setShortElement(term16150, 12, (short) 4);
        setShortElement(term16150, 13, (short) 6);
        setShortElement(term16150, 14, (short) 8);
        setShortElement(term16150, 15, (short) 6);
        setShortElement(term16150, 16, (short) 9);
        setShortElement(term16150, 17, (short) 10);
        setShortElement(term16150, 18, (short) 11);
        setShortElement(term16150, 19, (short) 4);
        setShortElement(term16150, 20, (short) 1);
        setShortElement(term16150, 22, (short) 10);
        setShortElement(term16150, 23, (short) 3);
        setShortElement(term16150, 24, (short) 4);
        setShortElement(term16150, 25, (short) 4);
        setShortElement(term16150, 26, (short) 1);
        setShortElement(term16150, 27, (short) 2);
        setShortElement(term16150, 28, (short) 3);
        setShortElement(term16150, 29, (short) 3);
        setShortElement(term16150, 30, (short) 13);
        setShortElement(term16150, 31, (short) 1);
        setElement(term16149, 0, term16150);
        setIntElement(term16183, 1, 5570560);
        setIntElement(term16183, 2, 327680);
        setIntElement(term16183, 3, 4456454);
        setIntElement(term16183, 4, 1769472);
        setIntElement(term16183, 5, 14876672);
        setIntElement(term16183, 6, 6225920);
        setIntElement(term16183, 7, 917504);
        setIntElement(term16183, 8, 327680);
        setIntElement(term16183, 9, 8519680);
        setIntElement(term16183, 10, 917504);
        setIntElement(term16183, 11, 11993088);
        setIntElement(term16183, 12, 655360);
        setIntElement(term16183, 13, 7864320);
        setIntElement(term16183, 14, 3735552);
        setIntElement(term16183, 15, 7143424);
        setIntElement(term16183, 16, 8454144);
        setIntElement(term16183, 17, 9240576);
        setIntElement(term16183, 18, 196608);
        setIntElement(term16183, 19, 3801088);
        setIntElement(term16183, 20, 786432);
        setIntElement(term16183, 21, 589824);
        setIntElement(term16183, 22, 17170432);
        setIntElement(term16183, 23, 1376256);
        setIntElement(term16183, 24, 5242880);
        setIntElement(term16183, 25, 2883584);
        setIntElement(term16183, 26, 20774912);
        setIntElement(term16183, 27, 262144);
        setIntElement(term16183, 28, 2555904);
        setIntElement(term16183, 29, 1835008);
        setIntElement(term16183, 30, 6029312);
        setIntElement(term16183, 31, 327680);
        setElement(term16149, 1, term16183);
        setElement(term16216, 0, term16217);
        setElement(term16216, 1, term16217);
        setElement(term16216, 2, term16220);
        setElement(term16216, 3, term16222);
        setElement(term16216, 4, term16226);
        setElement(term16216, 5, term16226);
        setElement(term16216, 6, term16231);
        setElement(term16216, 7, term16231);
        setElement(term16216, 8, term16235);
        setElement(term16216, 9, term16235);
        setElement(term16216, 10, term16235);
        setElement(term16216, 11, term16235);
        setElement(term16216, 12, term16235);
        setElement(term16216, 13, term16239);
        setElement(term16216, 14, term16239);
        setElement(term16216, 15, term16243);
        setElement(term16216, 16, term16243);
        setElement(term16216, 17, term16243);
        setElement(term16216, 18, term16243);
        setElement(term16216, 19, term16247);
        setElement(term16216, 20, term16247);
        setElement(term16216, 21, term16247);
        setElement(term16216, 22, term16251);
        setElement(term16216, 23, term16243);
        setElement(term16216, 24, term16255);
        setElement(term16216, 25, term16259);
        setElement(term16216, 26, term16263);
        setElement(term16216, 27, term16267);
        setElement(term16216, 28, term16269);
        setElement(term16216, 29, term16272);
        setElement(term16216, 30, term16274);
        setElement(term16216, 31, term16276);
        setElement(term16149, 2, term16216);
        setLongElement(term16278, 0, 34363746224L);
        setLongElement(term16278, 1, 34363775512L);
        setLongElement(term16278, 2, 34363775512L);
        setLongElement(term16278, 3, 34363775512L);
        setLongElement(term16278, 4, 131922273947344L);
        setLongElement(term16278, 5, 34364440080L);
        setLongElement(term16278, 6, 131922274021824L);
        setLongElement(term16278, 7, 131922273860752L);
        setLongElement(term16278, 8, 131922273860640L);
        setLongElement(term16278, 9, 131922273860784L);
        setLongElement(term16278, 10, 131922273908224L);
        setLongElement(term16278, 11, 34363766248L);
        setLongElement(term16278, 12, 34363766248L);
        setLongElement(term16278, 13, 131919151456576L);
        setLongElement(term16278, 14, 131919151456576L);
        setLongElement(term16278, 15, 131919151456432L);
        setLongElement(term16278, 16, 131919151467536L);
        setLongElement(term16278, 17, 131919151469184L);
        setLongElement(term16278, 18, 131919151469952L);
        setLongElement(term16278, 19, 131919148867040L);
        setLongElement(term16278, 20, 34363739368L);
        setLongElement(term16278, 21, 34363739368L);
        setLongElement(term16278, 22, 131919151455072L);
        setLongElement(term16278, 23, 34363829248L);
        setLongElement(term16278, 24, 131919148867040L);
        setLongElement(term16278, 25, 131919147178992L);
        setLongElement(term16278, 26, 34363745472L);
        setLongElement(term16278, 27, 34364710216L);
        setLongElement(term16278, 28, 34363745472L);
        setLongElement(term16278, 29, 34363745472L);
        setLongElement(term16278, 30, 34364896224L);
        setLongElement(term16278, 31, 34363745472L);
        setElement(term16149, 3, term16278);
        setShortElement(term16312, 0, (short) 2);
        setShortElement(term16312, 1, (short) 12);
        setElement(term16311, 0, term16312);
        setIntElement(term16345, 0, 1638400);
        setIntElement(term16345, 1, 720907);
        setElement(term16311, 1, term16345);
        setElement(term16378, 0, term16379);
        setElement(term16378, 1, term16381);
        setElement(term16311, 2, term16378);
        setLongElement(term16383, 0, 34363745472L);
        setLongElement(term16383, 1, 34363745472L);
        setElement(term16311, 3, term16383);
        setElement(term16149, 4, term16311);
        setField(term16148, term16148.getClass(), "backtrace", term16149);
        setField(term16148, term16148.getClass(), "detailMessage", "Ghbwtircqb");
        setField(term16148, term16148.getClass(), "cause", term16148);
        setField(term16148, term16148.getClass(), "stackTrace", term16428);
        setIntField(term16148, term16148.getClass(), "depth", 34);
        setIntField(term16430, term16430.getClass(), "modCount", 0);
        setField(term16148, term16148.getClass(), "suppressedExceptions", term16430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Exception");
        Object[] args = new Object[3];
        args[0] = term16011;
        args[1] = term16147;
        args[2] = term16148;
        try {
            callMethod(klass, "cannotInjectDependency", argTypes, term16010, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


