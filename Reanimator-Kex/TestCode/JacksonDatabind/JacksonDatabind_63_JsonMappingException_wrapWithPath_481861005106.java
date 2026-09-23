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

public class JsonMappingException_wrapWithPath_481861005106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205064;
     Object term208930;
     Object term208715;

    public JsonMappingException_wrapWithPath_481861005106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205064 = newInstance(Class.forName("java.lang.Throwable"));
        term208930 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term208930, term208930.getClass(), "backtrace", null);
        setField(term208930, term208930.getClass(), "detailMessage", null);
        setField(term208930, term208930.getClass(), "cause", null);
        setField(term208930, term208930.getClass(), "stackTrace", null);
        setIntField(term208930, term208930.getClass(), "depth", 0);
        setField(term208930, term208930.getClass(), "suppressedExceptions", null);
        LinkedList term208716 = new LinkedList();
        ((LinkedList) term208716).add((Object)null);
        Class<? extends Object> term208788 = Class.forName((String) "java.util.concurrent.DelayQueue");
        Class<? extends Object> term208795 = Class.forName((String) "com.fasterxml.jackson.databind.AnnotationIntrospector");
        Class<? extends Object> term208799 = Class.forName((String) "java.nio.channels.Channels$ReadableByteChannelImpl");
        Class<? extends Object> term208802 = Class.forName((String) "java.io.CharArrayReader");
        Class<? extends Object> term208806 = Class.forName((String) "java.util.stream.SortedOps$OfInt");
        Class<? extends Object> term208810 = Class.forName((String) "java.lang.ApplicationShutdownHooks$1");
        Class<? extends Object> term208816 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$SearchMappingsTask");
        Class<? extends Object> term208821 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableCollection");
        Class<? extends Object> term208825 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayIterator");
        Class<? extends Object> term208829 = Class.forName((String) "java.util.IllformedLocaleException");
        Class<? extends Object> term208833 = Class.forName((String) "com.fasterxml.jackson.databind.AbstractTypeResolver");
        Class<? extends Object> term208837 = Class.forName((String) "java.lang.reflect.ProxyGenerator");
        Class<? extends Object> term208841 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
        Class<? extends Object> term208844 = Class.forName((String) "com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<? extends Object> term208847 = Class.forName((String) "java.lang.invoke.MethodHandleInfo");
        Class<? extends Object> term208851 = Class.forName((String) "java.nio.channels.Pipe$SourceChannel");
        Class<? extends Object> term208855 = Class.forName((String) "java.lang.IllegalAccessException");
        Class<? extends Object> term208858 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl");
        Class<? extends Object> term208862 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name1");
        term208715 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term208720 = (Object[]) newArray("java.lang.Object", 5);
        short[] term208721 = (short[]) newShortArray(32);
        int[] term208754 = (int[]) newIntArray(32);
        Object[] term208787 = (Object[]) newArray("java.lang.Object", 32);
        long[] term208866 = (long[]) newLongArray(32);
        Object term208710 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term208926 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term208928 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term208715, term208715.getClass(), "_path", term208716);
        setField(term208715, term208715.getClass(), "_processor", null);
        setField(term208715, term208715.getClass(), "_location", null);
        setShortElement(term208721, 0, (short) 20);
        setShortElement(term208721, 1, (short) 3);
        setShortElement(term208721, 5, (short) 27);
        setShortElement(term208721, 6, (short) 2);
        setShortElement(term208721, 7, (short) 3);
        setShortElement(term208721, 11, (short) 2);
        setShortElement(term208721, 12, (short) 4);
        setShortElement(term208721, 13, (short) 4);
        setShortElement(term208721, 14, (short) 3);
        setShortElement(term208721, 15, (short) 4);
        setShortElement(term208721, 16, (short) 4);
        setShortElement(term208721, 17, (short) 1);
        setShortElement(term208721, 18, (short) 2);
        setShortElement(term208721, 19, (short) 3);
        setShortElement(term208721, 20, (short) 3);
        setShortElement(term208721, 21, (short) 13);
        setShortElement(term208721, 22, (short) 1);
        setShortElement(term208721, 23, (short) 2);
        setShortElement(term208721, 24, (short) 12);
        setElement(term208720, 0, term208721);
        setIntElement(term208754, 0, 128385024);
        setIntElement(term208754, 2, 6553600);
        setIntElement(term208754, 3, 393216);
        setIntElement(term208754, 4, 3866630);
        setIntElement(term208754, 5, 1245184);
        setIntElement(term208754, 6, 3211264);
        setIntElement(term208754, 8, 6553600);
        setIntElement(term208754, 9, 393216);
        setIntElement(term208754, 10, 3866630);
        setIntElement(term208754, 11, 14352384);
        setIntElement(term208754, 12, 10354688);
        setIntElement(term208754, 13, 2883584);
        setIntElement(term208754, 14, 786432);
        setIntElement(term208754, 15, 1441792);
        setIntElement(term208754, 16, 7733248);
        setIntElement(term208754, 17, 20774912);
        setIntElement(term208754, 18, 262144);
        setIntElement(term208754, 19, 2555904);
        setIntElement(term208754, 20, 1835008);
        setIntElement(term208754, 21, 6029312);
        setIntElement(term208754, 22, 327680);
        setIntElement(term208754, 23, 1638400);
        setIntElement(term208754, 24, 720907);
        setElement(term208720, 1, term208754);
        setElement(term208787, 0, term208788);
        setElement(term208787, 1, term208795);
        setElement(term208787, 2, term208795);
        setElement(term208787, 3, term208799);
        setElement(term208787, 4, term208802);
        setElement(term208787, 5, term208806);
        setElement(term208787, 6, term208810);
        setElement(term208787, 7, term208795);
        setElement(term208787, 8, term208795);
        setElement(term208787, 9, term208799);
        setElement(term208787, 10, term208802);
        setElement(term208787, 11, term208816);
        setElement(term208787, 12, term208821);
        setElement(term208787, 13, term208825);
        setElement(term208787, 14, term208829);
        setElement(term208787, 15, term208833);
        setElement(term208787, 16, term208825);
        setElement(term208787, 17, term208837);
        setElement(term208787, 18, term208841);
        setElement(term208787, 19, term208844);
        setElement(term208787, 20, term208847);
        setElement(term208787, 21, term208851);
        setElement(term208787, 22, term208855);
        setElement(term208787, 23, term208858);
        setElement(term208787, 24, term208862);
        setElement(term208720, 2, term208787);
        setLongElement(term208866, 0, 132578328546864L);
        setLongElement(term208866, 1, 34364798256L);
        setLongElement(term208866, 2, 34363739368L);
        setLongElement(term208866, 3, 34363739368L);
        setLongElement(term208866, 4, 34363739368L);
        setLongElement(term208866, 5, 132578328998496L);
        setLongElement(term208866, 6, 34363820048L);
        setLongElement(term208866, 7, 34364798256L);
        setLongElement(term208866, 8, 34363739368L);
        setLongElement(term208866, 9, 34363739368L);
        setLongElement(term208866, 10, 34363739368L);
        setLongElement(term208866, 11, 132582552571296L);
        setLongElement(term208866, 12, 132582552640272L);
        setLongElement(term208866, 13, 132582550089488L);
        setLongElement(term208866, 14, 132582552759024L);
        setLongElement(term208866, 15, 132582550089488L);
        setLongElement(term208866, 16, 132582550089488L);
        setLongElement(term208866, 17, 34363745472L);
        setLongElement(term208866, 18, 34364710216L);
        setLongElement(term208866, 19, 34363745472L);
        setLongElement(term208866, 20, 34363745472L);
        setLongElement(term208866, 21, 34364896224L);
        setLongElement(term208866, 22, 34363745472L);
        setLongElement(term208866, 23, 34363745472L);
        setLongElement(term208866, 24, 34363745472L);
        setElement(term208720, 3, term208866);
        setField(term208715, term208715.getClass(), "backtrace", term208720);
        setField(term208715, term208715.getClass(), "detailMessage", "(was java.lang.Throwable)");
        setField(term208710, term208710.getClass(), "backtrace", null);
        setField(term208710, term208710.getClass(), "detailMessage", null);
        setField(term208710, term208710.getClass(), "cause", null);
        setField(term208710, term208710.getClass(), "stackTrace", null);
        setIntField(term208710, term208710.getClass(), "depth", 0);
        setField(term208710, term208710.getClass(), "suppressedExceptions", null);
        setField(term208715, term208715.getClass(), "cause", term208710);
        setField(term208715, term208715.getClass(), "stackTrace", term208926);
        setIntField(term208715, term208715.getClass(), "depth", 25);
        setIntField(term208928, term208928.getClass(), "modCount", 0);
        setField(term208715, term208715.getClass(), "suppressedExceptions", term208928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term205064;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term205064, term208930));
        assertTrue(recursiveEquals(retValue, term208715));
    }

};


