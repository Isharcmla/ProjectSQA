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

public class Reporter_cannotInitializeForSpyAnnotation_1153219590129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3591;
     Object term3604;

    public Reporter_cannotInitializeForSpyAnnotation_1153219590129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3591 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term3673 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfLong$Dropping");
        Class<? extends Object> term3676 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink");
        Class<? extends Object> term3678 = Class.forName((String) "java.lang.ProcessHandle$Info");
        Class<? extends Object> term3682 = Class.forName((String) "java.util.concurrent.Delayed");
        Class<? extends Object> term3687 = Class.forName((String) "org.hamcrest.beans.HasPropertyWithValue$2");
        Class<? extends Object> term3691 = Class.forName((String) "org.assertj.core.error.ShouldHaveAnnotations");
        Class<? extends Object> term3695 = Class.forName((String) "java.util.HashMap$KeyIterator");
        Class<? extends Object> term3699 = Class.forName((String) "org.assertj.core.api.AbstractInputStreamAssert");
        Class<? extends Object> term3703 = Class.forName((String) "java.lang.Long$LongCache");
        Class<? extends Object> term3707 = Class.forName((String) "java.nio.file.attribute.AclFileAttributeView");
        Class<? extends Object> term3711 = Class.forName((String) "org.mockito.internal.stubbing.InvocationContainer");
        Class<? extends Object> term3715 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle");
        Class<? extends Object> term3719 = Class.forName((String) "org.assertj.core.error.ShouldHaveCauseInstance");
        Class<? extends Object> term3723 = Class.forName((String) "org.mockito.cglib.transform.impl.AccessFieldTransformer$Callback");
        Class<? extends Object> term3725 = Class.forName((String) "java.util.concurrent.CountedCompleter");
        Class<? extends Object> term3728 = Class.forName((String) "java.nio.channels.IllegalBlockingModeException");
        Class<? extends Object> term3730 = Class.forName((String) "org.objenesis.instantiator.basic.FailingInstantiator");
        Class<? extends Object> term3732 = Class.forName((String) "java.util.WeakHashMap$WeakHashMapSpliterator");
        Class<? extends Object> term3835 = Class.forName((String) "org.assertj.core.api.AbstractLongAssert");
        Class<? extends Object> term3837 = Class.forName((String) "java.nio.file.FileTreeWalker$1");
        term3604 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term3605 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3606 = (short[]) newShortArray(32);
        int[] term3639 = (int[]) newIntArray(32);
        Object[] term3672 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3734 = (long[]) newLongArray(32);
        Object[] term3767 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3768 = (short[]) newShortArray(32);
        int[] term3801 = (int[]) newIntArray(32);
        Object[] term3834 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3839 = (long[]) newLongArray(32);
        Object[] term3884 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3886 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3606, 0, (short) 1);
        setShortElement(term3606, 1, (short) 2);
        setShortElement(term3606, 2, (short) 1);
        setShortElement(term3606, 3, (short) 7);
        setShortElement(term3606, 4, (short) 2);
        setShortElement(term3606, 5, (short) 1);
        setShortElement(term3606, 6, (short) 6);
        setShortElement(term3606, 7, (short) 2);
        setShortElement(term3606, 8, (short) 10);
        setShortElement(term3606, 9, (short) 11);
        setShortElement(term3606, 10, (short) 29);
        setShortElement(term3606, 11, (short) 5);
        setShortElement(term3606, 12, (short) 4);
        setShortElement(term3606, 13, (short) 6);
        setShortElement(term3606, 14, (short) 8);
        setShortElement(term3606, 15, (short) 6);
        setShortElement(term3606, 16, (short) 9);
        setShortElement(term3606, 17, (short) 10);
        setShortElement(term3606, 18, (short) 11);
        setShortElement(term3606, 19, (short) 4);
        setShortElement(term3606, 20, (short) 1);
        setShortElement(term3606, 22, (short) 10);
        setShortElement(term3606, 23, (short) 3);
        setShortElement(term3606, 24, (short) 4);
        setShortElement(term3606, 25, (short) 4);
        setShortElement(term3606, 26, (short) 1);
        setShortElement(term3606, 27, (short) 2);
        setShortElement(term3606, 28, (short) 3);
        setShortElement(term3606, 29, (short) 3);
        setShortElement(term3606, 30, (short) 13);
        setShortElement(term3606, 31, (short) 1);
        setElement(term3605, 0, term3606);
        setIntElement(term3639, 1, 5570560);
        setIntElement(term3639, 2, 327680);
        setIntElement(term3639, 3, 4456454);
        setIntElement(term3639, 4, 1769472);
        setIntElement(term3639, 5, 14876672);
        setIntElement(term3639, 6, 6225920);
        setIntElement(term3639, 7, 917504);
        setIntElement(term3639, 8, 327680);
        setIntElement(term3639, 9, 8519680);
        setIntElement(term3639, 10, 917504);
        setIntElement(term3639, 11, 11993088);
        setIntElement(term3639, 12, 655360);
        setIntElement(term3639, 13, 7864320);
        setIntElement(term3639, 14, 3735552);
        setIntElement(term3639, 15, 7143424);
        setIntElement(term3639, 16, 8454144);
        setIntElement(term3639, 17, 9240576);
        setIntElement(term3639, 18, 196608);
        setIntElement(term3639, 19, 3801088);
        setIntElement(term3639, 20, 786432);
        setIntElement(term3639, 21, 589824);
        setIntElement(term3639, 22, 17170432);
        setIntElement(term3639, 23, 1376256);
        setIntElement(term3639, 24, 5242880);
        setIntElement(term3639, 25, 2883584);
        setIntElement(term3639, 26, 20774912);
        setIntElement(term3639, 27, 262144);
        setIntElement(term3639, 28, 2555904);
        setIntElement(term3639, 29, 1835008);
        setIntElement(term3639, 30, 6029312);
        setIntElement(term3639, 31, 327680);
        setElement(term3605, 1, term3639);
        setElement(term3672, 0, term3673);
        setElement(term3672, 1, term3673);
        setElement(term3672, 2, term3676);
        setElement(term3672, 3, term3678);
        setElement(term3672, 4, term3682);
        setElement(term3672, 5, term3682);
        setElement(term3672, 6, term3687);
        setElement(term3672, 7, term3687);
        setElement(term3672, 8, term3691);
        setElement(term3672, 9, term3691);
        setElement(term3672, 10, term3691);
        setElement(term3672, 11, term3691);
        setElement(term3672, 12, term3691);
        setElement(term3672, 13, term3695);
        setElement(term3672, 14, term3695);
        setElement(term3672, 15, term3699);
        setElement(term3672, 16, term3699);
        setElement(term3672, 17, term3699);
        setElement(term3672, 18, term3699);
        setElement(term3672, 19, term3703);
        setElement(term3672, 20, term3703);
        setElement(term3672, 21, term3703);
        setElement(term3672, 22, term3707);
        setElement(term3672, 23, term3699);
        setElement(term3672, 24, term3711);
        setElement(term3672, 25, term3715);
        setElement(term3672, 26, term3719);
        setElement(term3672, 27, term3723);
        setElement(term3672, 28, term3725);
        setElement(term3672, 29, term3728);
        setElement(term3672, 30, term3730);
        setElement(term3672, 31, term3732);
        setElement(term3605, 2, term3672);
        setLongElement(term3734, 0, 34363746224L);
        setLongElement(term3734, 1, 34363775512L);
        setLongElement(term3734, 2, 34363775512L);
        setLongElement(term3734, 3, 34363775512L);
        setLongElement(term3734, 4, 131922273947344L);
        setLongElement(term3734, 5, 34364440080L);
        setLongElement(term3734, 6, 131922274021824L);
        setLongElement(term3734, 7, 131922273860752L);
        setLongElement(term3734, 8, 131922273860640L);
        setLongElement(term3734, 9, 131922273860784L);
        setLongElement(term3734, 10, 131922273908224L);
        setLongElement(term3734, 11, 34363766248L);
        setLongElement(term3734, 12, 34363766248L);
        setLongElement(term3734, 13, 131919151456576L);
        setLongElement(term3734, 14, 131919151456576L);
        setLongElement(term3734, 15, 131919151456432L);
        setLongElement(term3734, 16, 131919151467536L);
        setLongElement(term3734, 17, 131919151469184L);
        setLongElement(term3734, 18, 131919151469952L);
        setLongElement(term3734, 19, 131919148867040L);
        setLongElement(term3734, 20, 34363739368L);
        setLongElement(term3734, 21, 34363739368L);
        setLongElement(term3734, 22, 131919151455072L);
        setLongElement(term3734, 23, 34363829248L);
        setLongElement(term3734, 24, 131919148867040L);
        setLongElement(term3734, 25, 131919147178992L);
        setLongElement(term3734, 26, 34363745472L);
        setLongElement(term3734, 27, 34364710216L);
        setLongElement(term3734, 28, 34363745472L);
        setLongElement(term3734, 29, 34363745472L);
        setLongElement(term3734, 30, 34364896224L);
        setLongElement(term3734, 31, 34363745472L);
        setElement(term3605, 3, term3734);
        setShortElement(term3768, 0, (short) 2);
        setShortElement(term3768, 1, (short) 12);
        setElement(term3767, 0, term3768);
        setIntElement(term3801, 0, 1638400);
        setIntElement(term3801, 1, 720907);
        setElement(term3767, 1, term3801);
        setElement(term3834, 0, term3835);
        setElement(term3834, 1, term3837);
        setElement(term3767, 2, term3834);
        setLongElement(term3839, 0, 34363745472L);
        setLongElement(term3839, 1, 34363745472L);
        setElement(term3767, 3, term3839);
        setElement(term3605, 4, term3767);
        setField(term3604, term3604.getClass(), "backtrace", term3605);
        setField(term3604, term3604.getClass(), "detailMessage", "oVcInYnLWB");
        setField(term3604, term3604.getClass(), "cause", term3604);
        setField(term3604, term3604.getClass(), "stackTrace", term3884);
        setIntField(term3604, term3604.getClass(), "depth", 34);
        setIntField(term3886, term3886.getClass(), "modCount", 0);
        setField(term3604, term3604.getClass(), "suppressedExceptions", term3886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = "LQFpaHEwXR";
        args[1] = term3604;
        try {
            callMethod(klass, "cannotInitializeForSpyAnnotation", argTypes, term3591, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


