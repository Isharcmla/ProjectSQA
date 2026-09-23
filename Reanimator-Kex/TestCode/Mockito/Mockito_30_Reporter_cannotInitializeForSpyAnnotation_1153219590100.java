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

public class Reporter_cannotInitializeForSpyAnnotation_1153219590100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33721;
     Object term33734;

    public Reporter_cannotInitializeForSpyAnnotation_1153219590100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33721 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term33803 = Class.forName((String) "java.util.AbstractList$SubList$1");
        Class<? extends Object> term33806 = Class.forName((String) "java.lang.invoke.VarHandleGuards");
        Class<? extends Object> term33808 = Class.forName((String) "java.util.ResourceBundle$ResourceBundleProviderHelper");
        Class<? extends Object> term33812 = Class.forName((String) "java.lang.RuntimePermission");
        Class<? extends Object> term33817 = Class.forName((String) "org.hamcrest.text.IsEqualIgnoringWhiteSpace");
        Class<? extends Object> term33821 = Class.forName((String) "java.util.Calendar$AvailableCalendarTypes");
        Class<? extends Object> term33825 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJObject$Merger");
        Class<? extends Object> term33829 = Class.forName((String) "java.util.concurrent.Executors$DelegatedScheduledExecutorService");
        Class<? extends Object> term33833 = Class.forName((String) "org.assertj.core.api.UriAssert");
        Class<? extends Object> term33837 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Recipe");
        Class<? extends Object> term33841 = Class.forName((String) "net.sourceforge.cobertura.reporting.Main");
        Class<? extends Object> term33845 = Class.forName((String) "org.mockito.internal.util.MockCreationValidator");
        Class<? extends Object> term33849 = Class.forName((String) "java.lang.invoke.VarHandle$AccessDescriptor");
        Class<? extends Object> term33853 = Class.forName((String) "org.objectweb.asm.tree.analysis.Frame");
        Class<? extends Object> term33855 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfRef");
        Class<? extends Object> term33858 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject");
        Class<? extends Object> term33860 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Class<? extends Object> term33862 = Class.forName((String) "org.assertj.core.error.ShouldNotContainAtIndex");
        Class<? extends Object> term33965 = Class.forName((String) "org.assertj.core.internal.cglib.asm.Handler");
        Class<? extends Object> term33967 = Class.forName((String) "java.util.HashSet");
        term33734 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term33735 = (Object[]) newArray("java.lang.Object", 5);
        short[] term33736 = (short[]) newShortArray(32);
        int[] term33769 = (int[]) newIntArray(32);
        Object[] term33802 = (Object[]) newArray("java.lang.Object", 32);
        long[] term33864 = (long[]) newLongArray(32);
        Object[] term33897 = (Object[]) newArray("java.lang.Object", 5);
        short[] term33898 = (short[]) newShortArray(32);
        int[] term33931 = (int[]) newIntArray(32);
        Object[] term33964 = (Object[]) newArray("java.lang.Object", 32);
        long[] term33969 = (long[]) newLongArray(32);
        Object[] term34014 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term34016 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term33736, 0, (short) 1);
        setShortElement(term33736, 1, (short) 2);
        setShortElement(term33736, 2, (short) 1);
        setShortElement(term33736, 3, (short) 7);
        setShortElement(term33736, 4, (short) 2);
        setShortElement(term33736, 5, (short) 1);
        setShortElement(term33736, 6, (short) 6);
        setShortElement(term33736, 7, (short) 2);
        setShortElement(term33736, 8, (short) 10);
        setShortElement(term33736, 9, (short) 11);
        setShortElement(term33736, 10, (short) 29);
        setShortElement(term33736, 11, (short) 5);
        setShortElement(term33736, 12, (short) 4);
        setShortElement(term33736, 13, (short) 4);
        setShortElement(term33736, 14, (short) 3);
        setShortElement(term33736, 15, (short) 5);
        setShortElement(term33736, 16, (short) 9);
        setShortElement(term33736, 17, (short) 10);
        setShortElement(term33736, 18, (short) 11);
        setShortElement(term33736, 19, (short) 4);
        setShortElement(term33736, 20, (short) 1);
        setShortElement(term33736, 22, (short) 10);
        setShortElement(term33736, 23, (short) 3);
        setShortElement(term33736, 24, (short) 4);
        setShortElement(term33736, 25, (short) 9);
        setShortElement(term33736, 26, (short) 1);
        setShortElement(term33736, 27, (short) 2);
        setShortElement(term33736, 28, (short) 3);
        setShortElement(term33736, 29, (short) 3);
        setShortElement(term33736, 30, (short) 13);
        setShortElement(term33736, 31, (short) 1);
        setElement(term33735, 0, term33736);
        setIntElement(term33769, 1, 5570560);
        setIntElement(term33769, 2, 327680);
        setIntElement(term33769, 3, 4456454);
        setIntElement(term33769, 4, 1769472);
        setIntElement(term33769, 5, 14876672);
        setIntElement(term33769, 6, 6225920);
        setIntElement(term33769, 7, 917504);
        setIntElement(term33769, 8, 327680);
        setIntElement(term33769, 9, 8519680);
        setIntElement(term33769, 10, 917504);
        setIntElement(term33769, 11, 11993088);
        setIntElement(term33769, 12, 655360);
        setIntElement(term33769, 13, 7864320);
        setIntElement(term33769, 14, 3735552);
        setIntElement(term33769, 15, 7143424);
        setIntElement(term33769, 16, 8454144);
        setIntElement(term33769, 17, 9240576);
        setIntElement(term33769, 18, 196608);
        setIntElement(term33769, 19, 3801088);
        setIntElement(term33769, 20, 786432);
        setIntElement(term33769, 21, 589824);
        setIntElement(term33769, 22, 17170432);
        setIntElement(term33769, 23, 1376256);
        setIntElement(term33769, 24, 5242880);
        setIntElement(term33769, 25, 2883584);
        setIntElement(term33769, 26, 20774912);
        setIntElement(term33769, 27, 262144);
        setIntElement(term33769, 28, 2555904);
        setIntElement(term33769, 29, 1835008);
        setIntElement(term33769, 30, 6029312);
        setIntElement(term33769, 31, 327680);
        setElement(term33735, 1, term33769);
        setElement(term33802, 0, term33803);
        setElement(term33802, 1, term33803);
        setElement(term33802, 2, term33806);
        setElement(term33802, 3, term33808);
        setElement(term33802, 4, term33812);
        setElement(term33802, 5, term33812);
        setElement(term33802, 6, term33817);
        setElement(term33802, 7, term33817);
        setElement(term33802, 8, term33821);
        setElement(term33802, 9, term33821);
        setElement(term33802, 10, term33821);
        setElement(term33802, 11, term33821);
        setElement(term33802, 12, term33821);
        setElement(term33802, 13, term33825);
        setElement(term33802, 14, term33825);
        setElement(term33802, 15, term33829);
        setElement(term33802, 16, term33829);
        setElement(term33802, 17, term33829);
        setElement(term33802, 18, term33829);
        setElement(term33802, 19, term33833);
        setElement(term33802, 20, term33833);
        setElement(term33802, 21, term33833);
        setElement(term33802, 22, term33837);
        setElement(term33802, 23, term33829);
        setElement(term33802, 24, term33841);
        setElement(term33802, 25, term33845);
        setElement(term33802, 26, term33849);
        setElement(term33802, 27, term33853);
        setElement(term33802, 28, term33855);
        setElement(term33802, 29, term33858);
        setElement(term33802, 30, term33860);
        setElement(term33802, 31, term33862);
        setElement(term33735, 2, term33802);
        setLongElement(term33864, 0, 34363746224L);
        setLongElement(term33864, 1, 34363775512L);
        setLongElement(term33864, 2, 34363775512L);
        setLongElement(term33864, 3, 34363775512L);
        setLongElement(term33864, 4, 128809362246416L);
        setLongElement(term33864, 5, 34364440080L);
        setLongElement(term33864, 6, 128809362321008L);
        setLongElement(term33864, 7, 128809362085936L);
        setLongElement(term33864, 8, 128809362085824L);
        setLongElement(term33864, 9, 128809362085968L);
        setLongElement(term33864, 10, 128809362207296L);
        setLongElement(term33864, 11, 34363766248L);
        setLongElement(term33864, 12, 34363766248L);
        setLongElement(term33864, 13, 128806364538672L);
        setLongElement(term33864, 14, 128806364538672L);
        setLongElement(term33864, 15, 128806364538528L);
        setLongElement(term33864, 16, 128806364549760L);
        setLongElement(term33864, 17, 128806364551280L);
        setLongElement(term33864, 18, 128806364552048L);
        setLongElement(term33864, 19, 128806361950816L);
        setLongElement(term33864, 20, 34363739368L);
        setLongElement(term33864, 21, 34363739368L);
        setLongElement(term33864, 22, 128806364546688L);
        setLongElement(term33864, 23, 34363829248L);
        setLongElement(term33864, 24, 128806361950816L);
        setLongElement(term33864, 25, 128809410801520L);
        setLongElement(term33864, 26, 34363745472L);
        setLongElement(term33864, 27, 34364710216L);
        setLongElement(term33864, 28, 34363745472L);
        setLongElement(term33864, 29, 34363745472L);
        setLongElement(term33864, 30, 34364896224L);
        setLongElement(term33864, 31, 34363745472L);
        setElement(term33735, 3, term33864);
        setShortElement(term33898, 0, (short) 2);
        setShortElement(term33898, 1, (short) 12);
        setElement(term33897, 0, term33898);
        setIntElement(term33931, 0, 1638400);
        setIntElement(term33931, 1, 720907);
        setElement(term33897, 1, term33931);
        setElement(term33964, 0, term33965);
        setElement(term33964, 1, term33967);
        setElement(term33897, 2, term33964);
        setLongElement(term33969, 0, 34363745472L);
        setLongElement(term33969, 1, 34363745472L);
        setElement(term33897, 3, term33969);
        setElement(term33735, 4, term33897);
        setField(term33734, term33734.getClass(), "backtrace", term33735);
        setField(term33734, term33734.getClass(), "detailMessage", "uuaPigETmJ");
        setField(term33734, term33734.getClass(), "cause", term33734);
        setField(term33734, term33734.getClass(), "stackTrace", term34014);
        setIntField(term33734, term33734.getClass(), "depth", 34);
        setIntField(term34016, term34016.getClass(), "modCount", 0);
        setField(term33734, term33734.getClass(), "suppressedExceptions", term34016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = "NRdvgJlhkX";
        args[1] = term33734;
        try {
            callMethod(klass, "cannotInitializeForSpyAnnotation", argTypes, term33721, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


