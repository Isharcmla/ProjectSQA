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
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Reporter_argumentsAreDifferent_74095868469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7717;
     Object term7742;

    public Reporter_argumentsAreDifferent_74095868469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7717 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term7812 = Class.forName((String) "java.io.File");
        Class<? extends Object> term7814 = Class.forName((String) "java.lang.ProcessEnvironment$StringKeySet$1");
        Class<? extends Object> term7816 = Class.forName((String) "java.util.Locale$Builder");
        Class<? extends Object> term7818 = Class.forName((String) "org.assertj.core.error.ShouldHaveAnnotations");
        Class<? extends Object> term7820 = Class.forName((String) "org.mockito.runners.MockitoJUnitRunner");
        Class<? extends Object> term7822 = Class.forName((String) "org.assertj.core.internal.Strings");
        Class<? extends Object> term7824 = Class.forName((String) "org.hamcrest.generator.qdox.model.annotation.AnnotationEquals");
        Class<? extends Object> term7826 = Class.forName((String) "java.util.stream.SpinedBuffer$OfInt$1Splitr");
        Class<? extends Object> term7828 = Class.forName((String) "org.assertj.core.error.ShouldBeEqualByComparingOnlyGivenFields");
        Class<? extends Object> term7830 = Class.forName((String) "org.mockito.cglib.core.EmitUtils$ArrayDelimiters");
        Class<? extends Object> term7832 = Class.forName((String) "java.util.regex.Pattern$Behind");
        Class<? extends Object> term7834 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJObject$Sorter");
        Class<? extends Object> term7836 = Class.forName((String) "java.lang.FdLibm");
        Class<? extends Object> term7838 = Class.forName((String) "java.util.concurrent.Executors$DelegatedExecutorService");
        Class<? extends Object> term7840 = Class.forName((String) "java.lang.Class$2");
        Class<? extends Object> term7842 = Class.forName((String) "org.mockito.exceptions.base.MockitoException");
        Class<? extends Object> term7844 = Class.forName((String) "java.util.concurrent.atomic.AtomicIntegerFieldUpdater$AtomicIntegerFieldUpdaterImpl$1");
        term7742 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term7743 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term7744 = (Object[]) newArray("java.lang.Object", 5);
        short[] term7745 = (short[]) newShortArray(32);
        int[] term7778 = (int[]) newIntArray(32);
        Object[] term7811 = (Object[]) newArray("java.lang.Object", 32);
        long[] term7846 = (long[]) newLongArray(32);
        Object[] term7879 = (Object[]) newArray("java.lang.Object", 5);
        short[] term7880 = (short[]) newShortArray(32);
        int[] term7913 = (int[]) newIntArray(32);
        Object[] term7946 = (Object[]) newArray("java.lang.Object", 32);
        long[] term7947 = (long[]) newLongArray(32);
        Object[] term7980 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term7982 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term7984 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term7745, 0, (short) 1);
        setShortElement(term7745, 2, (short) 1);
        setShortElement(term7745, 3, (short) 2);
        setShortElement(term7745, 4, (short) 1);
        setShortElement(term7745, 5, (short) 7);
        setShortElement(term7745, 6, (short) 2);
        setShortElement(term7745, 7, (short) 1);
        setShortElement(term7745, 8, (short) 6);
        setShortElement(term7745, 9, (short) 2);
        setShortElement(term7745, 10, (short) 10);
        setShortElement(term7745, 11, (short) 11);
        setShortElement(term7745, 12, (short) 29);
        setShortElement(term7745, 13, (short) 5);
        setShortElement(term7745, 14, (short) 4);
        setShortElement(term7745, 15, (short) 4);
        setShortElement(term7745, 16, (short) 3);
        setShortElement(term7745, 17, (short) 5);
        setShortElement(term7745, 18, (short) 9);
        setShortElement(term7745, 19, (short) 10);
        setShortElement(term7745, 20, (short) 11);
        setShortElement(term7745, 21, (short) 4);
        setShortElement(term7745, 22, (short) 1);
        setShortElement(term7745, 24, (short) 10);
        setShortElement(term7745, 25, (short) 3);
        setShortElement(term7745, 26, (short) 4);
        setShortElement(term7745, 27, (short) 9);
        setShortElement(term7745, 28, (short) 1);
        setShortElement(term7745, 29, (short) 2);
        setShortElement(term7745, 30, (short) 3);
        setShortElement(term7745, 31, (short) 3);
        setElement(term7744, 0, term7745);
        setIntElement(term7778, 0, 917504);
        setIntElement(term7778, 1, 524288);
        setIntElement(term7778, 3, 5570560);
        setIntElement(term7778, 4, 327680);
        setIntElement(term7778, 5, 4456454);
        setIntElement(term7778, 6, 1769472);
        setIntElement(term7778, 7, 14876672);
        setIntElement(term7778, 8, 6225920);
        setIntElement(term7778, 9, 917504);
        setIntElement(term7778, 10, 327680);
        setIntElement(term7778, 11, 8519680);
        setIntElement(term7778, 12, 917504);
        setIntElement(term7778, 13, 11993088);
        setIntElement(term7778, 14, 655360);
        setIntElement(term7778, 15, 7864320);
        setIntElement(term7778, 16, 3735552);
        setIntElement(term7778, 17, 7143424);
        setIntElement(term7778, 18, 8454144);
        setIntElement(term7778, 19, 9240576);
        setIntElement(term7778, 20, 196608);
        setIntElement(term7778, 21, 3801088);
        setIntElement(term7778, 22, 786432);
        setIntElement(term7778, 23, 589824);
        setIntElement(term7778, 24, 17170432);
        setIntElement(term7778, 25, 1376256);
        setIntElement(term7778, 26, 5242880);
        setIntElement(term7778, 27, 2883584);
        setIntElement(term7778, 28, 20774912);
        setIntElement(term7778, 29, 262144);
        setIntElement(term7778, 30, 2555904);
        setIntElement(term7778, 31, 1835008);
        setElement(term7744, 1, term7778);
        setElement(term7811, 0, term7812);
        setElement(term7811, 1, term7812);
        setElement(term7811, 2, term7814);
        setElement(term7811, 3, term7814);
        setElement(term7811, 4, term7816);
        setElement(term7811, 5, term7818);
        setElement(term7811, 6, term7820);
        setElement(term7811, 7, term7820);
        setElement(term7811, 8, term7822);
        setElement(term7811, 9, term7822);
        setElement(term7811, 10, term7824);
        setElement(term7811, 11, term7824);
        setElement(term7811, 12, term7824);
        setElement(term7811, 13, term7824);
        setElement(term7811, 14, term7824);
        setElement(term7811, 15, term7826);
        setElement(term7811, 16, term7826);
        setElement(term7811, 17, term7828);
        setElement(term7811, 18, term7828);
        setElement(term7811, 19, term7828);
        setElement(term7811, 20, term7828);
        setElement(term7811, 21, term7830);
        setElement(term7811, 22, term7830);
        setElement(term7811, 23, term7830);
        setElement(term7811, 24, term7832);
        setElement(term7811, 25, term7828);
        setElement(term7811, 26, term7834);
        setElement(term7811, 27, term7836);
        setElement(term7811, 28, term7838);
        setElement(term7811, 29, term7840);
        setElement(term7811, 30, term7842);
        setElement(term7811, 31, term7844);
        setElement(term7744, 2, term7811);
        setLongElement(term7846, 0, 34363745304L);
        setLongElement(term7846, 1, 34363745304L);
        setLongElement(term7846, 2, 34363746224L);
        setLongElement(term7846, 3, 34363775512L);
        setLongElement(term7846, 4, 34363775512L);
        setLongElement(term7846, 5, 34363775512L);
        setLongElement(term7846, 6, 128809362246416L);
        setLongElement(term7846, 7, 34364440080L);
        setLongElement(term7846, 8, 128809362321008L);
        setLongElement(term7846, 9, 128809362085936L);
        setLongElement(term7846, 10, 128809362085824L);
        setLongElement(term7846, 11, 128809362085968L);
        setLongElement(term7846, 12, 128809362207296L);
        setLongElement(term7846, 13, 34363766248L);
        setLongElement(term7846, 14, 34363766248L);
        setLongElement(term7846, 15, 128806364538672L);
        setLongElement(term7846, 16, 128806364538672L);
        setLongElement(term7846, 17, 128806364538528L);
        setLongElement(term7846, 18, 128806364549760L);
        setLongElement(term7846, 19, 128806364551280L);
        setLongElement(term7846, 20, 128806364552048L);
        setLongElement(term7846, 21, 128806361950816L);
        setLongElement(term7846, 22, 34363739368L);
        setLongElement(term7846, 23, 34363739368L);
        setLongElement(term7846, 24, 128806364546688L);
        setLongElement(term7846, 25, 34363829248L);
        setLongElement(term7846, 26, 128806361950816L);
        setLongElement(term7846, 27, 128809410801520L);
        setLongElement(term7846, 28, 34363745472L);
        setLongElement(term7846, 29, 34364710216L);
        setLongElement(term7846, 30, 34363745472L);
        setLongElement(term7846, 31, 34363745472L);
        setElement(term7744, 3, term7846);
        setShortElement(term7880, 0, (short) 13);
        setShortElement(term7880, 1, (short) 1);
        setShortElement(term7880, 2, (short) 2);
        setShortElement(term7880, 3, (short) 12);
        setElement(term7879, 0, term7880);
        setIntElement(term7913, 0, 6029312);
        setIntElement(term7913, 1, 327680);
        setIntElement(term7913, 2, 1638400);
        setIntElement(term7913, 3, 720907);
        setElement(term7879, 1, term7913);
        setElement(term7879, 2, term7946);
        setLongElement(term7947, 0, 34364896224L);
        setLongElement(term7947, 1, 34363745472L);
        setLongElement(term7947, 2, 34363745472L);
        setLongElement(term7947, 3, 34363745472L);
        setElement(term7879, 3, term7947);
        setElement(term7744, 4, term7879);
        setField(term7743, term7743.getClass(), "backtrace", term7744);
        setField(term7743, term7743.getClass(), "detailMessage", null);
        setField(term7743, term7743.getClass(), "cause", term7743);
        setField(term7743, term7743.getClass(), "stackTrace", term7980);
        setIntField(term7743, term7743.getClass(), "depth", 36);
        setIntField(term7982, term7982.getClass(), "modCount", 0);
        setField(term7743, term7743.getClass(), "suppressedExceptions", term7982);
        setField(term7742, term7742.getClass(), "stackTraceHolder", term7743);
        setField(term7742, term7742.getClass(), "stackTraceFilter", term7984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[3];
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        args[2] = term7742;
        try {
            callMethod(klass, "argumentsAreDifferent", argTypes, term7717, args);
            assertTrue(false);
        }
        catch (ArgumentsAreDifferent e) {
        }

    }

};


