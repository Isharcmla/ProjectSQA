package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class UnsupportedDurationField_unsupported_2185106349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term6873;
     Object term6665;

    public UnsupportedDurationField_unsupported_2185106349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term64, term64.getClass(), "iType", null);
        term6873 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term6873, term6873.getClass(), "iType", null);
        Class<? extends Object> term6734 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
        Class<? extends Object> term6741 = Class.forName((String) "java.util.concurrent.atomic.AtomicLongFieldUpdater$LockedUpdater");
        Class<? extends Object> term6744 = Class.forName((String) "java.util.Spliterators$3Adapter");
        Class<? extends Object> term6746 = Class.forName((String) "java.util.Spliterators$IntArraySpliterator");
        Class<? extends Object> term6750 = Class.forName((String) "java.lang.invoke.VarHandleFloats");
        Class<? extends Object> term6754 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadOnly");
        Class<? extends Object> term6760 = Class.forName((String) "java.util.AbstractMap");
        Class<? extends Object> term6765 = Class.forName((String) "java.util.EventListener");
        Class<? extends Object> term6769 = Class.forName((String) "java.util.concurrent.atomic.Striped64");
        Class<? extends Object> term6773 = Class.forName((String) "java.util.TreeMap");
        Class<? extends Object> term6777 = Class.forName((String) "java.util.stream.ReduceOps$9");
        Class<? extends Object> term6781 = Class.forName((String) "java.util.concurrent.ForkJoinPool$WorkQueue");
        Class<? extends Object> term6785 = Class.forName((String) "java.util.zip.ZipCoder$UTF8");
        Class<? extends Object> term6788 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadWrite");
        Class<? extends Object> term6791 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$SubGroup");
        Class<? extends Object> term6794 = Class.forName((String) "java.util.Collections$CheckedMap");
        Class<? extends Object> term6797 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TableStack");
        Class<? extends Object> term6800 = Class.forName((String) "java.lang.FdLibm");
        Class<? extends Object> term6804 = Class.forName((String) "java.util.SplittableRandom");
        term6665 = newInstance(Class.forName("java.lang.UnsupportedOperationException"));
        Object[] term6666 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6667 = (short[]) newShortArray(32);
        int[] term6700 = (int[]) newIntArray(32);
        Object[] term6733 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6808 = (long[]) newLongArray(32);
        Object[] term6868 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6870 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6667, 0, (short) 13);
        setShortElement(term6667, 1, (short) 3);
        setShortElement(term6667, 5, (short) 6);
        setShortElement(term6667, 6, (short) 2);
        setShortElement(term6667, 7, (short) 3);
        setShortElement(term6667, 11, (short) 2);
        setShortElement(term6667, 12, (short) 4);
        setShortElement(term6667, 13, (short) 4);
        setShortElement(term6667, 14, (short) 3);
        setShortElement(term6667, 15, (short) 4);
        setShortElement(term6667, 16, (short) 4);
        setShortElement(term6667, 17, (short) 1);
        setShortElement(term6667, 18, (short) 2);
        setShortElement(term6667, 19, (short) 3);
        setShortElement(term6667, 20, (short) 3);
        setShortElement(term6667, 21, (short) 13);
        setShortElement(term6667, 22, (short) 1);
        setShortElement(term6667, 23, (short) 2);
        setShortElement(term6667, 24, (short) 12);
        setElement(term6666, 0, term6667);
        setIntElement(term6700, 0, 42926080);
        setIntElement(term6700, 2, 6553600);
        setIntElement(term6700, 3, 393216);
        setIntElement(term6700, 4, 3866630);
        setIntElement(term6700, 5, 1245184);
        setIntElement(term6700, 6, 1638400);
        setIntElement(term6700, 8, 6553600);
        setIntElement(term6700, 9, 393216);
        setIntElement(term6700, 10, 3866630);
        setIntElement(term6700, 11, 14352384);
        setIntElement(term6700, 12, 10354688);
        setIntElement(term6700, 13, 2883584);
        setIntElement(term6700, 14, 786432);
        setIntElement(term6700, 15, 1441792);
        setIntElement(term6700, 16, 7733248);
        setIntElement(term6700, 17, 20774912);
        setIntElement(term6700, 18, 262144);
        setIntElement(term6700, 19, 2555904);
        setIntElement(term6700, 20, 1835008);
        setIntElement(term6700, 21, 6029312);
        setIntElement(term6700, 22, 327680);
        setIntElement(term6700, 23, 1638400);
        setIntElement(term6700, 24, 720907);
        setElement(term6666, 1, term6700);
        setElement(term6733, 0, term6734);
        setElement(term6733, 1, term6741);
        setElement(term6733, 2, term6741);
        setElement(term6733, 3, term6744);
        setElement(term6733, 4, term6746);
        setElement(term6733, 5, term6750);
        setElement(term6733, 6, term6754);
        setElement(term6733, 7, term6741);
        setElement(term6733, 8, term6741);
        setElement(term6733, 9, term6744);
        setElement(term6733, 10, term6746);
        setElement(term6733, 11, term6760);
        setElement(term6733, 12, term6765);
        setElement(term6733, 13, term6769);
        setElement(term6733, 14, term6773);
        setElement(term6733, 15, term6777);
        setElement(term6733, 16, term6769);
        setElement(term6733, 17, term6781);
        setElement(term6733, 18, term6785);
        setElement(term6733, 19, term6788);
        setElement(term6733, 20, term6791);
        setElement(term6733, 21, term6794);
        setElement(term6733, 22, term6797);
        setElement(term6733, 23, term6800);
        setElement(term6733, 24, term6804);
        setElement(term6666, 2, term6733);
        setLongElement(term6808, 0, 34363891800L);
        setLongElement(term6808, 1, 34364798256L);
        setLongElement(term6808, 2, 34363739368L);
        setLongElement(term6808, 3, 34363739368L);
        setLongElement(term6808, 4, 34363739368L);
        setLongElement(term6808, 5, 137814964770848L);
        setLongElement(term6808, 6, 34363820048L);
        setLongElement(term6808, 7, 34364798256L);
        setLongElement(term6808, 8, 34363739368L);
        setLongElement(term6808, 9, 34363739368L);
        setLongElement(term6808, 10, 34363739368L);
        setLongElement(term6808, 11, 137818303072432L);
        setLongElement(term6808, 12, 137818303141808L);
        setLongElement(term6808, 13, 137818300663536L);
        setLongElement(term6808, 14, 137818303259984L);
        setLongElement(term6808, 15, 137818300663536L);
        setLongElement(term6808, 16, 137818300663536L);
        setLongElement(term6808, 17, 34363745472L);
        setLongElement(term6808, 18, 34364710216L);
        setLongElement(term6808, 19, 34363745472L);
        setLongElement(term6808, 20, 34363745472L);
        setLongElement(term6808, 21, 34364896224L);
        setLongElement(term6808, 22, 34363745472L);
        setLongElement(term6808, 23, 34363745472L);
        setLongElement(term6808, 24, 34363745472L);
        setElement(term6666, 3, term6808);
        setField(term6665, term6665.getClass(), "backtrace", term6666);
        setField(term6665, term6665.getClass(), "detailMessage", "null field is unsupported");
        setField(term6665, term6665.getClass(), "cause", term6665);
        setField(term6665, term6665.getClass(), "stackTrace", term6868);
        setIntField(term6665, term6665.getClass(), "depth", 25);
        setIntField(term6870, term6870.getClass(), "modCount", 0);
        setField(term6665, term6665.getClass(), "suppressedExceptions", term6870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "unsupported", argTypes, term64, args);
        assertTrue(recursiveEquals(term64, term6873));
        assertTrue(recursiveEquals(retValue, term6665));
    }

};


