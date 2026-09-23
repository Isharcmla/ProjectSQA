package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_wrapWithPath_481861005113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212047;
     Object term215809;
     Object term215594;

    public JsonMappingException_wrapWithPath_481861005113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212047 = newInstance(Class.forName("java.lang.Throwable"));
        term215809 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term215809, term215809.getClass(), "backtrace", null);
        setField(term215809, term215809.getClass(), "detailMessage", null);
        setField(term215809, term215809.getClass(), "cause", null);
        setField(term215809, term215809.getClass(), "stackTrace", null);
        setIntField(term215809, term215809.getClass(), "depth", 0);
        setField(term215809, term215809.getClass(), "suppressedExceptions", null);
        LinkedList term215595 = new LinkedList();
        ((LinkedList) term215595).add((Object)null);
        Class<? extends Object> term215667 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedEntryIterator");
        Class<? extends Object> term215674 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfDouble");
        Class<? extends Object> term215678 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfInt");
        Class<? extends Object> term215681 = Class.forName((String) "java.lang.Character$UnicodeBlock");
        Class<? extends Object> term215685 = Class.forName((String) "java.lang.ProcessEnvironment$Variable");
        Class<? extends Object> term215689 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Stringifiers");
        Class<? extends Object> term215695 = Class.forName((String) "java.nio.channels.FileChannel");
        Class<? extends Object> term215700 = Class.forName((String) "java.util.stream.SpinedBuffer$OfPrimitive$BaseSpliterator");
        Class<? extends Object> term215704 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.DateSerializer");
        Class<? extends Object> term215708 = Class.forName((String) "java.util.stream.Streams$RangeLongSpliterator");
        Class<? extends Object> term215712 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Accessor");
        Class<? extends Object> term215716 = Class.forName((String) "java.util.concurrent.atomic.AtomicLongArray");
        Class<? extends Object> term215720 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter");
        Class<? extends Object> term215723 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.PackageVersion");
        Class<? extends Object> term215726 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfRef");
        Class<? extends Object> term215730 = Class.forName((String) "java.lang.Throwable$WrappedPrintWriter");
        Class<? extends Object> term215734 = Class.forName((String) "java.util.regex.Pattern$SliceUS");
        Class<? extends Object> term215737 = Class.forName((String) "java.lang.ClassNotFoundException");
        Class<? extends Object> term215741 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeySpliterator");
        term215594 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term215599 = (Object[]) newArray("java.lang.Object", 5);
        short[] term215600 = (short[]) newShortArray(32);
        int[] term215633 = (int[]) newIntArray(32);
        Object[] term215666 = (Object[]) newArray("java.lang.Object", 32);
        long[] term215745 = (long[]) newLongArray(32);
        Object term215589 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term215805 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term215807 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term215594, term215594.getClass(), "_path", term215595);
        setField(term215594, term215594.getClass(), "_processor", null);
        setField(term215594, term215594.getClass(), "_location", null);
        setShortElement(term215600, 0, (short) 20);
        setShortElement(term215600, 1, (short) 3);
        setShortElement(term215600, 5, (short) 27);
        setShortElement(term215600, 6, (short) 2);
        setShortElement(term215600, 7, (short) 3);
        setShortElement(term215600, 11, (short) 2);
        setShortElement(term215600, 12, (short) 4);
        setShortElement(term215600, 13, (short) 4);
        setShortElement(term215600, 14, (short) 3);
        setShortElement(term215600, 15, (short) 4);
        setShortElement(term215600, 16, (short) 4);
        setShortElement(term215600, 17, (short) 1);
        setShortElement(term215600, 18, (short) 2);
        setShortElement(term215600, 19, (short) 3);
        setShortElement(term215600, 20, (short) 3);
        setShortElement(term215600, 21, (short) 13);
        setShortElement(term215600, 22, (short) 1);
        setShortElement(term215600, 23, (short) 2);
        setShortElement(term215600, 24, (short) 12);
        setElement(term215599, 0, term215600);
        setIntElement(term215633, 0, 128385024);
        setIntElement(term215633, 2, 6553600);
        setIntElement(term215633, 3, 393216);
        setIntElement(term215633, 4, 3866630);
        setIntElement(term215633, 5, 1245184);
        setIntElement(term215633, 6, 3211264);
        setIntElement(term215633, 8, 6553600);
        setIntElement(term215633, 9, 393216);
        setIntElement(term215633, 10, 3866630);
        setIntElement(term215633, 11, 14352384);
        setIntElement(term215633, 12, 10354688);
        setIntElement(term215633, 13, 2883584);
        setIntElement(term215633, 14, 786432);
        setIntElement(term215633, 15, 1441792);
        setIntElement(term215633, 16, 7733248);
        setIntElement(term215633, 17, 20774912);
        setIntElement(term215633, 18, 262144);
        setIntElement(term215633, 19, 2555904);
        setIntElement(term215633, 20, 1835008);
        setIntElement(term215633, 21, 6029312);
        setIntElement(term215633, 22, 327680);
        setIntElement(term215633, 23, 1638400);
        setIntElement(term215633, 24, 720907);
        setElement(term215599, 1, term215633);
        setElement(term215666, 0, term215667);
        setElement(term215666, 1, term215674);
        setElement(term215666, 2, term215674);
        setElement(term215666, 3, term215678);
        setElement(term215666, 4, term215681);
        setElement(term215666, 5, term215685);
        setElement(term215666, 6, term215689);
        setElement(term215666, 7, term215674);
        setElement(term215666, 8, term215674);
        setElement(term215666, 9, term215678);
        setElement(term215666, 10, term215681);
        setElement(term215666, 11, term215695);
        setElement(term215666, 12, term215700);
        setElement(term215666, 13, term215704);
        setElement(term215666, 14, term215708);
        setElement(term215666, 15, term215712);
        setElement(term215666, 16, term215704);
        setElement(term215666, 17, term215716);
        setElement(term215666, 18, term215720);
        setElement(term215666, 19, term215723);
        setElement(term215666, 20, term215726);
        setElement(term215666, 21, term215730);
        setElement(term215666, 22, term215734);
        setElement(term215666, 23, term215737);
        setElement(term215666, 24, term215741);
        setElement(term215599, 2, term215666);
        setLongElement(term215745, 0, 132578328546864L);
        setLongElement(term215745, 1, 34364798256L);
        setLongElement(term215745, 2, 34363739368L);
        setLongElement(term215745, 3, 34363739368L);
        setLongElement(term215745, 4, 34363739368L);
        setLongElement(term215745, 5, 132578328998496L);
        setLongElement(term215745, 6, 34363820048L);
        setLongElement(term215745, 7, 34364798256L);
        setLongElement(term215745, 8, 34363739368L);
        setLongElement(term215745, 9, 34363739368L);
        setLongElement(term215745, 10, 34363739368L);
        setLongElement(term215745, 11, 132582552571296L);
        setLongElement(term215745, 12, 132582552640272L);
        setLongElement(term215745, 13, 132582550089488L);
        setLongElement(term215745, 14, 132582552759024L);
        setLongElement(term215745, 15, 132582550089488L);
        setLongElement(term215745, 16, 132582550089488L);
        setLongElement(term215745, 17, 34363745472L);
        setLongElement(term215745, 18, 34364710216L);
        setLongElement(term215745, 19, 34363745472L);
        setLongElement(term215745, 20, 34363745472L);
        setLongElement(term215745, 21, 34364896224L);
        setLongElement(term215745, 22, 34363745472L);
        setLongElement(term215745, 23, 34363745472L);
        setLongElement(term215745, 24, 34363745472L);
        setElement(term215599, 3, term215745);
        setField(term215594, term215594.getClass(), "backtrace", term215599);
        setField(term215594, term215594.getClass(), "detailMessage", "(was java.lang.Throwable)");
        setField(term215589, term215589.getClass(), "backtrace", null);
        setField(term215589, term215589.getClass(), "detailMessage", null);
        setField(term215589, term215589.getClass(), "cause", null);
        setField(term215589, term215589.getClass(), "stackTrace", null);
        setIntField(term215589, term215589.getClass(), "depth", 0);
        setField(term215589, term215589.getClass(), "suppressedExceptions", null);
        setField(term215594, term215594.getClass(), "cause", term215589);
        setField(term215594, term215594.getClass(), "stackTrace", term215805);
        setIntField(term215594, term215594.getClass(), "depth", 25);
        setIntField(term215807, term215807.getClass(), "modCount", 0);
        setField(term215594, term215594.getClass(), "suppressedExceptions", term215807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term212047;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term212047, term215809));
        assertTrue(recursiveEquals(retValue, term215594));
    }

};


