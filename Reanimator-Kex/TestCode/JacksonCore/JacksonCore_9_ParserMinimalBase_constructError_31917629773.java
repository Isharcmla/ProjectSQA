package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ParserMinimalBase_constructError_31917629773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3029;

    public ParserMinimalBase_constructError_31917629773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3098 = Class.forName((String) "java.util.regex.Pattern$StartS");
        Class<? extends Object> term3101 = Class.forName((String) "java.lang.annotation.RetentionPolicy");
        Class<? extends Object> term3103 = Class.forName((String) "java.util.function.UnaryOperator");
        Class<? extends Object> term3107 = Class.forName((String) "java.util.stream.ReduceOps$9ReducingSink");
        Class<? extends Object> term3112 = Class.forName((String) "java.util.stream.Node$Builder$OfLong");
        Class<? extends Object> term3116 = Class.forName((String) "java.util.Formattable");
        Class<? extends Object> term3120 = Class.forName((String) "java.util.Collection");
        Class<? extends Object> term3124 = Class.forName((String) "java.util.stream.ReferencePipeline$3$1");
        Class<? extends Object> term3128 = Class.forName((String) "java.lang.ref.FinalReference");
        Class<? extends Object> term3132 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask");
        Class<? extends Object> term3136 = Class.forName((String) "java.util.SplittableRandom");
        Class<? extends Object> term3140 = Class.forName((String) "java.util.concurrent.CancellationException");
        Class<? extends Object> term3144 = Class.forName((String) "java.util.FormatFlagsConversionMismatchException");
        Class<? extends Object> term3148 = Class.forName((String) "java.util.stream.IntStream$2");
        Class<? extends Object> term3151 = Class.forName((String) "java.util.concurrent.atomic.AtomicIntegerFieldUpdater$AtomicIntegerFieldUpdaterImpl");
        Class<? extends Object> term3154 = Class.forName((String) "java.lang.Enum");
        Class<? extends Object> term3157 = Class.forName((String) "java.io.FilePermissionCollection");
        Class<? extends Object> term3160 = Class.forName((String) "java.lang.ClassValue$Identity");
        Class<? extends Object> term3264 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJByte$Sorter");
        Class<? extends Object> term3266 = Class.forName((String) "java.util.regex.Pattern$LastNode");
        term3029 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3030 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3031 = (short[]) newShortArray(32);
        int[] term3064 = (int[]) newIntArray(32);
        Object[] term3097 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3163 = (long[]) newLongArray(32);
        Object[] term3196 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3197 = (short[]) newShortArray(32);
        int[] term3230 = (int[]) newIntArray(32);
        Object[] term3263 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3268 = (long[]) newLongArray(32);
        Object[] term3313 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3315 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3031, 0, (short) 1);
        setShortElement(term3031, 1, (short) 2);
        setShortElement(term3031, 2, (short) 1);
        setShortElement(term3031, 3, (short) 7);
        setShortElement(term3031, 4, (short) 2);
        setShortElement(term3031, 5, (short) 1);
        setShortElement(term3031, 6, (short) 6);
        setShortElement(term3031, 7, (short) 2);
        setShortElement(term3031, 8, (short) 10);
        setShortElement(term3031, 9, (short) 11);
        setShortElement(term3031, 10, (short) 29);
        setShortElement(term3031, 11, (short) 5);
        setShortElement(term3031, 12, (short) 4);
        setShortElement(term3031, 13, (short) 5);
        setShortElement(term3031, 14, (short) 6);
        setShortElement(term3031, 15, (short) 6);
        setShortElement(term3031, 16, (short) 9);
        setShortElement(term3031, 17, (short) 10);
        setShortElement(term3031, 18, (short) 11);
        setShortElement(term3031, 19, (short) 4);
        setShortElement(term3031, 20, (short) 1);
        setShortElement(term3031, 23, (short) 3);
        setShortElement(term3031, 24, (short) 4);
        setShortElement(term3031, 25, (short) 4);
        setShortElement(term3031, 26, (short) 1);
        setShortElement(term3031, 27, (short) 2);
        setShortElement(term3031, 28, (short) 3);
        setShortElement(term3031, 29, (short) 3);
        setShortElement(term3031, 30, (short) 13);
        setShortElement(term3031, 31, (short) 1);
        setElement(term3030, 0, term3031);
        setIntElement(term3064, 1, 5570560);
        setIntElement(term3064, 2, 327680);
        setIntElement(term3064, 3, 4456454);
        setIntElement(term3064, 4, 1769472);
        setIntElement(term3064, 5, 14876672);
        setIntElement(term3064, 6, 6225920);
        setIntElement(term3064, 7, 917504);
        setIntElement(term3064, 8, 327680);
        setIntElement(term3064, 9, 8519680);
        setIntElement(term3064, 10, 917504);
        setIntElement(term3064, 11, 11993088);
        setIntElement(term3064, 12, 655360);
        setIntElement(term3064, 13, 7864320);
        setIntElement(term3064, 14, 3735552);
        setIntElement(term3064, 15, 7143424);
        setIntElement(term3064, 16, 8454144);
        setIntElement(term3064, 17, 9240576);
        setIntElement(term3064, 18, 196608);
        setIntElement(term3064, 19, 3801088);
        setIntElement(term3064, 20, 786432);
        setIntElement(term3064, 21, 589824);
        setIntElement(term3064, 22, 17170432);
        setIntElement(term3064, 23, 1376256);
        setIntElement(term3064, 24, 5242880);
        setIntElement(term3064, 25, 2883584);
        setIntElement(term3064, 26, 20774912);
        setIntElement(term3064, 27, 262144);
        setIntElement(term3064, 28, 2555904);
        setIntElement(term3064, 29, 1835008);
        setIntElement(term3064, 30, 6029312);
        setIntElement(term3064, 31, 327680);
        setElement(term3030, 1, term3064);
        setElement(term3097, 0, term3098);
        setElement(term3097, 1, term3098);
        setElement(term3097, 2, term3101);
        setElement(term3097, 3, term3103);
        setElement(term3097, 4, term3107);
        setElement(term3097, 5, term3107);
        setElement(term3097, 6, term3112);
        setElement(term3097, 7, term3112);
        setElement(term3097, 8, term3116);
        setElement(term3097, 9, term3116);
        setElement(term3097, 10, term3116);
        setElement(term3097, 11, term3116);
        setElement(term3097, 12, term3116);
        setElement(term3097, 13, term3120);
        setElement(term3097, 14, term3120);
        setElement(term3097, 15, term3124);
        setElement(term3097, 16, term3124);
        setElement(term3097, 17, term3124);
        setElement(term3097, 18, term3124);
        setElement(term3097, 19, term3128);
        setElement(term3097, 20, term3128);
        setElement(term3097, 21, term3128);
        setElement(term3097, 22, term3132);
        setElement(term3097, 23, term3124);
        setElement(term3097, 24, term3136);
        setElement(term3097, 25, term3140);
        setElement(term3097, 26, term3144);
        setElement(term3097, 27, term3148);
        setElement(term3097, 28, term3151);
        setElement(term3097, 29, term3154);
        setElement(term3097, 30, term3157);
        setElement(term3097, 31, term3160);
        setElement(term3030, 2, term3097);
        setLongElement(term3163, 0, 34363746224L);
        setLongElement(term3163, 1, 34363775512L);
        setLongElement(term3163, 2, 34363775512L);
        setLongElement(term3163, 3, 34363775512L);
        setLongElement(term3163, 4, 136056649237120L);
        setLongElement(term3163, 5, 34364440080L);
        setLongElement(term3163, 6, 136056649313136L);
        setLongElement(term3163, 7, 136056649151744L);
        setLongElement(term3163, 8, 136056649151632L);
        setLongElement(term3163, 9, 136056649151776L);
        setLongElement(term3163, 10, 136056649198976L);
        setLongElement(term3163, 11, 34363766248L);
        setLongElement(term3163, 12, 34363766248L);
        setLongElement(term3163, 13, 136052016372576L);
        setLongElement(term3163, 14, 136052016372576L);
        setLongElement(term3163, 15, 136052016372432L);
        setLongElement(term3163, 16, 136052016415840L);
        setLongElement(term3163, 17, 136052016417488L);
        setLongElement(term3163, 18, 136052016418256L);
        setLongElement(term3163, 19, 136056710966080L);
        setLongElement(term3163, 20, 34363739368L);
        setLongElement(term3163, 21, 34363739368L);
        setLongElement(term3163, 22, 136052016385216L);
        setLongElement(term3163, 23, 34363829248L);
        setLongElement(term3163, 24, 136056710966080L);
        setLongElement(term3163, 25, 136056707707456L);
        setLongElement(term3163, 26, 34363745472L);
        setLongElement(term3163, 27, 34364710216L);
        setLongElement(term3163, 28, 34363745472L);
        setLongElement(term3163, 29, 34363745472L);
        setLongElement(term3163, 30, 34364896224L);
        setLongElement(term3163, 31, 34363745472L);
        setElement(term3030, 3, term3163);
        setShortElement(term3197, 0, (short) 2);
        setShortElement(term3197, 1, (short) 12);
        setElement(term3196, 0, term3197);
        setIntElement(term3230, 0, 1638400);
        setIntElement(term3230, 1, 720907);
        setElement(term3196, 1, term3230);
        setElement(term3263, 0, term3264);
        setElement(term3263, 1, term3266);
        setElement(term3196, 2, term3263);
        setLongElement(term3268, 0, 34363745472L);
        setLongElement(term3268, 1, 34363745472L);
        setElement(term3196, 3, term3268);
        setElement(term3030, 4, term3196);
        setField(term3029, term3029.getClass(), "backtrace", term3030);
        setField(term3029, term3029.getClass(), "detailMessage", "uuaPigETmJ");
        setField(term3029, term3029.getClass(), "cause", term3029);
        setField(term3029, term3029.getClass(), "stackTrace", term3313);
        setIntField(term3029, term3029.getClass(), "depth", 34);
        setIntField(term3315, term3315.getClass(), "modCount", 0);
        setField(term3029, term3029.getClass(), "suppressedExceptions", term3315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = "NRdvgJlhkX";
        args[1] = term3029;
        try {
            callMethod(klass, "_constructError", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


