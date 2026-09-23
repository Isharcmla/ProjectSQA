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

public class Reporter_checkedExceptionInvalid_110053838876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Reporter_checkedExceptionInvalid_110053838876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term71 = Class.forName((String) "java.lang.ProcessImpl");
        Class<? extends Object> term74 = Class.forName((String) "net.sourceforge.cobertura.javancss.parser.java15.debug.JavaCharStream");
        Class<? extends Object> term76 = Class.forName((String) "org.mockito.cglib.beans.BulkBeanEmitter");
        Class<? extends Object> term80 = Class.forName((String) "org.mockito.cglib.proxy.Proxy$ProxyImpl");
        Class<? extends Object> term85 = Class.forName((String) "org.mockito.internal.verification.checkers.MissingInvocationChecker");
        Class<? extends Object> term89 = Class.forName((String) "java.lang.WeakPairMap$WeakRefPeer");
        Class<? extends Object> term93 = Class.forName((String) "org.assertj.core.error.ShouldBeAbsolutePath");
        Class<? extends Object> term97 = Class.forName((String) "java.util.stream.Streams");
        Class<? extends Object> term101 = Class.forName((String) "org.mockito.internal.configuration.CaptorAnnotationProcessor");
        Class<? extends Object> term105 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsFloats$ByteBufferHandle");
        Class<? extends Object> term109 = Class.forName((String) "java.lang.NoSuchMethodError");
        Class<? extends Object> term113 = Class.forName((String) "java.lang.ref.Finalizer");
        Class<? extends Object> term117 = Class.forName((String) "java.lang.invoke.VarHandleChars$Array");
        Class<? extends Object> term121 = Class.forName((String) "java.util.stream.DoublePipeline$5$1");
        Class<? extends Object> term123 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider");
        Class<? extends Object> term126 = Class.forName((String) "org.objectweb.asm.xml.ASMContentHandler$FrameTypeRule");
        Class<? extends Object> term128 = Class.forName((String) "org.hamcrest.EasyMock2Matchers");
        Class<? extends Object> term130 = Class.forName((String) "org.hamcrest.text.StringContainsInOrder");
        Class<? extends Object> term233 = Class.forName((String) "kex.java.lang.Float");
        Class<? extends Object> term235 = Class.forName((String) "java.util.IdentityHashMap$EntryIterator$Entry");
        term2 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3 = (Object[]) newArray("java.lang.Object", 5);
        short[] term4 = (short[]) newShortArray(32);
        int[] term37 = (int[]) newIntArray(32);
        Object[] term70 = (Object[]) newArray("java.lang.Object", 32);
        long[] term132 = (long[]) newLongArray(32);
        Object[] term165 = (Object[]) newArray("java.lang.Object", 5);
        short[] term166 = (short[]) newShortArray(32);
        int[] term199 = (int[]) newIntArray(32);
        Object[] term232 = (Object[]) newArray("java.lang.Object", 32);
        long[] term237 = (long[]) newLongArray(32);
        Object[] term282 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term284 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term4, 0, (short) 1);
        setShortElement(term4, 1, (short) 2);
        setShortElement(term4, 2, (short) 1);
        setShortElement(term4, 3, (short) 7);
        setShortElement(term4, 4, (short) 2);
        setShortElement(term4, 5, (short) 1);
        setShortElement(term4, 6, (short) 6);
        setShortElement(term4, 7, (short) 2);
        setShortElement(term4, 8, (short) 10);
        setShortElement(term4, 9, (short) 11);
        setShortElement(term4, 10, (short) 29);
        setShortElement(term4, 11, (short) 5);
        setShortElement(term4, 12, (short) 4);
        setShortElement(term4, 13, (short) 6);
        setShortElement(term4, 14, (short) 8);
        setShortElement(term4, 15, (short) 6);
        setShortElement(term4, 16, (short) 9);
        setShortElement(term4, 17, (short) 10);
        setShortElement(term4, 18, (short) 11);
        setShortElement(term4, 19, (short) 4);
        setShortElement(term4, 20, (short) 1);
        setShortElement(term4, 22, (short) 10);
        setShortElement(term4, 23, (short) 3);
        setShortElement(term4, 24, (short) 4);
        setShortElement(term4, 25, (short) 4);
        setShortElement(term4, 26, (short) 1);
        setShortElement(term4, 27, (short) 2);
        setShortElement(term4, 28, (short) 3);
        setShortElement(term4, 29, (short) 3);
        setShortElement(term4, 30, (short) 13);
        setShortElement(term4, 31, (short) 1);
        setElement(term3, 0, term4);
        setIntElement(term37, 1, 5570560);
        setIntElement(term37, 2, 327680);
        setIntElement(term37, 3, 4456454);
        setIntElement(term37, 4, 1769472);
        setIntElement(term37, 5, 14876672);
        setIntElement(term37, 6, 6225920);
        setIntElement(term37, 7, 917504);
        setIntElement(term37, 8, 327680);
        setIntElement(term37, 9, 8519680);
        setIntElement(term37, 10, 917504);
        setIntElement(term37, 11, 11993088);
        setIntElement(term37, 12, 655360);
        setIntElement(term37, 13, 7864320);
        setIntElement(term37, 14, 3735552);
        setIntElement(term37, 15, 7143424);
        setIntElement(term37, 16, 8454144);
        setIntElement(term37, 17, 9240576);
        setIntElement(term37, 18, 196608);
        setIntElement(term37, 19, 3801088);
        setIntElement(term37, 20, 786432);
        setIntElement(term37, 21, 589824);
        setIntElement(term37, 22, 17170432);
        setIntElement(term37, 23, 1376256);
        setIntElement(term37, 24, 5242880);
        setIntElement(term37, 25, 2883584);
        setIntElement(term37, 26, 20774912);
        setIntElement(term37, 27, 262144);
        setIntElement(term37, 28, 2555904);
        setIntElement(term37, 29, 1835008);
        setIntElement(term37, 30, 6029312);
        setIntElement(term37, 31, 327680);
        setElement(term3, 1, term37);
        setElement(term70, 0, term71);
        setElement(term70, 1, term71);
        setElement(term70, 2, term74);
        setElement(term70, 3, term76);
        setElement(term70, 4, term80);
        setElement(term70, 5, term80);
        setElement(term70, 6, term85);
        setElement(term70, 7, term85);
        setElement(term70, 8, term89);
        setElement(term70, 9, term89);
        setElement(term70, 10, term89);
        setElement(term70, 11, term89);
        setElement(term70, 12, term89);
        setElement(term70, 13, term93);
        setElement(term70, 14, term93);
        setElement(term70, 15, term97);
        setElement(term70, 16, term97);
        setElement(term70, 17, term97);
        setElement(term70, 18, term97);
        setElement(term70, 19, term101);
        setElement(term70, 20, term101);
        setElement(term70, 21, term101);
        setElement(term70, 22, term105);
        setElement(term70, 23, term97);
        setElement(term70, 24, term109);
        setElement(term70, 25, term113);
        setElement(term70, 26, term117);
        setElement(term70, 27, term121);
        setElement(term70, 28, term123);
        setElement(term70, 29, term126);
        setElement(term70, 30, term128);
        setElement(term70, 31, term130);
        setElement(term3, 2, term70);
        setLongElement(term132, 0, 34363746224L);
        setLongElement(term132, 1, 34363775512L);
        setLongElement(term132, 2, 34363775512L);
        setLongElement(term132, 3, 34363775512L);
        setLongElement(term132, 4, 131922273947344L);
        setLongElement(term132, 5, 34364440080L);
        setLongElement(term132, 6, 131922274021824L);
        setLongElement(term132, 7, 131922273860752L);
        setLongElement(term132, 8, 131922273860640L);
        setLongElement(term132, 9, 131922273860784L);
        setLongElement(term132, 10, 131922273908224L);
        setLongElement(term132, 11, 34363766248L);
        setLongElement(term132, 12, 34363766248L);
        setLongElement(term132, 13, 131919151456576L);
        setLongElement(term132, 14, 131919151456576L);
        setLongElement(term132, 15, 131919151456432L);
        setLongElement(term132, 16, 131919151467536L);
        setLongElement(term132, 17, 131919151469184L);
        setLongElement(term132, 18, 131919151469952L);
        setLongElement(term132, 19, 131919148867040L);
        setLongElement(term132, 20, 34363739368L);
        setLongElement(term132, 21, 34363739368L);
        setLongElement(term132, 22, 131919151455072L);
        setLongElement(term132, 23, 34363829248L);
        setLongElement(term132, 24, 131919148867040L);
        setLongElement(term132, 25, 131919147178992L);
        setLongElement(term132, 26, 34363745472L);
        setLongElement(term132, 27, 34364710216L);
        setLongElement(term132, 28, 34363745472L);
        setLongElement(term132, 29, 34363745472L);
        setLongElement(term132, 30, 34364896224L);
        setLongElement(term132, 31, 34363745472L);
        setElement(term3, 3, term132);
        setShortElement(term166, 0, (short) 2);
        setShortElement(term166, 1, (short) 12);
        setElement(term165, 0, term166);
        setIntElement(term199, 0, 1638400);
        setIntElement(term199, 1, 720907);
        setElement(term165, 1, term199);
        setElement(term232, 0, term233);
        setElement(term232, 1, term235);
        setElement(term165, 2, term232);
        setLongElement(term237, 0, 34363745472L);
        setLongElement(term237, 1, 34363745472L);
        setElement(term165, 3, term237);
        setElement(term3, 4, term165);
        setField(term2, term2.getClass(), "backtrace", term3);
        setField(term2, term2.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "cause", term2);
        setField(term2, term2.getClass(), "stackTrace", term282);
        setIntField(term2, term2.getClass(), "depth", 34);
        setIntField(term284, term284.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "suppressedExceptions", term284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = term2;
        try {
            callMethod(klass, "checkedExceptionInvalid", argTypes, term1, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


