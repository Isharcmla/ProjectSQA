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
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_init_103664326633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41763;

    public JsonMappingException_init_103664326633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41768 = Class.forName((String) "java.util.concurrent.Callable");
        Class<? extends Object> term41770 = Class.forName((String) "java.util.concurrent.atomic.DoubleAccumulator");
        Class<? extends Object> term41771 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfPrimitive");
        Class<? extends Object> term41774 = Class.forName((String) "java.lang.annotation.RetentionPolicy");
        Class<? extends Object> term41778 = Class.forName((String) "java.util.TimerThread");
        Class<? extends Object> term41782 = Class.forName((String) "java.lang.StackStreamFactory");
        Class<? extends Object> term41783 = Class.forName((String) "java.lang.invoke.SerializedLambda$1");
        Class<? extends Object> term41784 = Class.forName((String) "com.fasterxml.jackson.databind.JsonNode$1");
        Class<? extends Object> term41787 = Class.forName((String) "java.lang.reflect.TypeVariable");
        Class<? extends Object> term41791 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term41794 = Class.forName((String) "java.util.WeakHashMap$EntrySpliterator");
        Class<? extends Object> term41797 = Class.forName((String) "java.lang.Thread$Caches");
        Class<? extends Object> term41800 = Class.forName((String) "java.util.PriorityQueue$PriorityQueueSpliterator");
        Class<? extends Object> term41803 = Class.forName((String) "java.util.regex.Matcher$1MatchResultIterator");
        Class<? extends Object> term41806 = Class.forName((String) "com.fasterxml.jackson.core.JsonProcessingException");
        Class<? extends Object> term41808 = Class.forName((String) "java.util.LinkedList$ListItr");
        Class<? extends Object> term41810 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term41812 = Class.forName((String) "java.util.stream.Nodes$SpinedNodeBuilder");
        Class<? extends Object> term41814 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator$OfRef");
        Class<? extends Object> term41816 = Class.forName((String) "java.util.stream.DoublePipeline$Head");
        Class<? extends Object> term41819 = Class.forName((String) "com.fasterxml.jackson.core.util.Separators");
        term41763 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term41764 = (Object[]) newArray("java.lang.Object", 5);
        short[] term41765 = (short[]) newShortArray(32);
        int[] term41766 = (int[]) newIntArray(32);
        Object[] term41767 = (Object[]) newArray("java.lang.Object", 32);
        long[] term41822 = (long[]) newLongArray(32);
        Object[] term41825 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term41826 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term41763, term41763.getClass(), "_path", null);
        setField(term41763, term41763.getClass(), "_processor", null);
        setField(term41763, term41763.getClass(), "_location", null);
        setShortElement(term41765, 0, (short) 1);
        setShortElement(term41765, 1, (short) 2);
        setShortElement(term41765, 2, (short) 1);
        setShortElement(term41765, 3, (short) 7);
        setShortElement(term41765, 4, (short) 6);
        setShortElement(term41765, 5, (short) 2);
        setShortElement(term41765, 6, (short) 3);
        setShortElement(term41765, 10, (short) 2);
        setShortElement(term41765, 11, (short) 4);
        setShortElement(term41765, 12, (short) 4);
        setShortElement(term41765, 13, (short) 3);
        setShortElement(term41765, 14, (short) 4);
        setShortElement(term41765, 15, (short) 4);
        setShortElement(term41765, 16, (short) 1);
        setShortElement(term41765, 17, (short) 2);
        setShortElement(term41765, 18, (short) 3);
        setShortElement(term41765, 19, (short) 3);
        setShortElement(term41765, 20, (short) 13);
        setShortElement(term41765, 21, (short) 1);
        setShortElement(term41765, 22, (short) 2);
        setShortElement(term41765, 23, (short) 12);
        setElement(term41764, 0, term41765);
        setIntElement(term41766, 1, 5570560);
        setIntElement(term41766, 2, 327680);
        setIntElement(term41766, 3, 4456454);
        setIntElement(term41766, 4, 851968);
        setIntElement(term41766, 5, 2883584);
        setIntElement(term41766, 7, 6553600);
        setIntElement(term41766, 8, 393216);
        setIntElement(term41766, 9, 3866630);
        setIntElement(term41766, 10, 14352384);
        setIntElement(term41766, 11, 10354688);
        setIntElement(term41766, 12, 2883584);
        setIntElement(term41766, 13, 786432);
        setIntElement(term41766, 14, 1441792);
        setIntElement(term41766, 15, 7733248);
        setIntElement(term41766, 16, 20774912);
        setIntElement(term41766, 17, 262144);
        setIntElement(term41766, 18, 2555904);
        setIntElement(term41766, 19, 1835008);
        setIntElement(term41766, 20, 6029312);
        setIntElement(term41766, 21, 327680);
        setIntElement(term41766, 22, 1638400);
        setIntElement(term41766, 23, 720907);
        setElement(term41764, 1, term41766);
        setElement(term41767, 0, term41768);
        setElement(term41767, 1, term41768);
        setElement(term41767, 2, term41770);
        setElement(term41767, 3, term41771);
        setElement(term41767, 4, term41774);
        setElement(term41767, 5, term41778);
        setElement(term41767, 6, term41782);
        setElement(term41767, 7, term41782);
        setElement(term41767, 8, term41783);
        setElement(term41767, 9, term41784);
        setElement(term41767, 10, term41787);
        setElement(term41767, 11, term41791);
        setElement(term41767, 12, term41794);
        setElement(term41767, 13, term41797);
        setElement(term41767, 14, term41800);
        setElement(term41767, 15, term41794);
        setElement(term41767, 16, term41803);
        setElement(term41767, 17, term41806);
        setElement(term41767, 18, term41808);
        setElement(term41767, 19, term41810);
        setElement(term41767, 20, term41812);
        setElement(term41767, 21, term41814);
        setElement(term41767, 22, term41816);
        setElement(term41767, 23, term41819);
        setElement(term41764, 2, term41767);
        setLongElement(term41822, 0, 34363746224L);
        setLongElement(term41822, 1, 34363775512L);
        setLongElement(term41822, 2, 34363775512L);
        setLongElement(term41822, 3, 34363775512L);
        setLongElement(term41822, 4, 132073600938288L);
        setLongElement(term41822, 5, 34363820048L);
        setLongElement(term41822, 6, 34364798256L);
        setLongElement(term41822, 7, 34363739368L);
        setLongElement(term41822, 8, 34363739368L);
        setLongElement(term41822, 9, 34363739368L);
        setLongElement(term41822, 10, 132077283560208L);
        setLongElement(term41822, 11, 132077283629184L);
        setLongElement(term41822, 12, 132077281112816L);
        setLongElement(term41822, 13, 132077283747392L);
        setLongElement(term41822, 14, 132077281112816L);
        setLongElement(term41822, 15, 132077281112816L);
        setLongElement(term41822, 16, 34363745472L);
        setLongElement(term41822, 17, 34364710216L);
        setLongElement(term41822, 18, 34363745472L);
        setLongElement(term41822, 19, 34363745472L);
        setLongElement(term41822, 20, 34364896224L);
        setLongElement(term41822, 21, 34363745472L);
        setLongElement(term41822, 22, 34363745472L);
        setLongElement(term41822, 23, 34363745472L);
        setElement(term41764, 3, term41822);
        setField(term41763, term41763.getClass(), "backtrace", term41764);
        setField(term41763, term41763.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term41763, term41763.getClass(), "cause", term41763);
        setField(term41763, term41763.getClass(), "stackTrace", term41825);
        setIntField(term41763, term41763.getClass(), "depth", 24);
        setIntField(term41826, term41826.getClass(), "modCount", 0);
        setField(term41763, term41763.getClass(), "suppressedExceptions", term41826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonLocation");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41763));
    }

};


