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

public class JsonMappingException_wrapWithPath_481861005244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397789;
     Object term398280;
     Object term398052;

    public JsonMappingException_wrapWithPath_481861005244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397789 = newInstance(Class.forName("java.lang.Exception"));
        term398280 = newInstance(Class.forName("java.lang.Exception"));
        setField(term398280, term398280.getClass(), "backtrace", null);
        setField(term398280, term398280.getClass(), "detailMessage", null);
        setField(term398280, term398280.getClass(), "cause", null);
        setField(term398280, term398280.getClass(), "stackTrace", null);
        setIntField(term398280, term398280.getClass(), "depth", 0);
        setField(term398280, term398280.getClass(), "suppressedExceptions", null);
        LinkedList term398053 = new LinkedList();
        ((LinkedList) term398053).add((Object)null);
        Class<? extends Object> term398125 = Class.forName((String) "kex.java.util.ArrayList$ListItr");
        Class<? extends Object> term398132 = Class.forName((String) "java.util.regex.Pattern$1");
        Class<? extends Object> term398145 = Class.forName((String) "java.lang.ref.WeakReference");
        Class<? extends Object> term398149 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList$COWSubListIterator");
        Class<? extends Object> term398153 = Class.forName((String) "java.lang.module.ResolutionException");
        Class<? extends Object> term398157 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder");
        Class<? extends Object> term398163 = Class.forName((String) "java.nio.DirectCharBufferU");
        Class<? extends Object> term398166 = Class.forName((String) "java.util.concurrent.Semaphore$NonfairSync");
        Class<? extends Object> term398171 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer");
        Class<? extends Object> term398175 = Class.forName((String) "java.util.LinkedHashMap$LinkedEntryIterator");
        Class<? extends Object> term398179 = Class.forName((String) "java.util.regex.Pattern$BnMS");
        Class<? extends Object> term398183 = Class.forName((String) "java.util.stream.Node$OfInt");
        Class<? extends Object> term398187 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer");
        Class<? extends Object> term398191 = Class.forName((String) "java.util.WeakHashMap$EntrySpliterator");
        Class<? extends Object> term398194 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySet");
        Class<? extends Object> term398197 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque");
        Class<? extends Object> term398201 = Class.forName((String) "java.nio.file.spi.FileSystemProvider");
        Class<? extends Object> term398205 = Class.forName((String) "java.util.stream.ForEachOps");
        Class<? extends Object> term398208 = Class.forName((String) "java.lang.module.ModuleDescriptor");
        Class<? extends Object> term398212 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default");
        term398052 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term398057 = (Object[]) newArray("java.lang.Object", 5);
        short[] term398058 = (short[]) newShortArray(32);
        int[] term398091 = (int[]) newIntArray(32);
        Object[] term398124 = (Object[]) newArray("java.lang.Object", 32);
        long[] term398216 = (long[]) newLongArray(32);
        Object term398047 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term398276 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term398278 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term398052, term398052.getClass(), "_path", term398053);
        setField(term398052, term398052.getClass(), "_processor", null);
        setField(term398052, term398052.getClass(), "_location", null);
        setShortElement(term398058, 0, (short) 20);
        setShortElement(term398058, 4, (short) 27);
        setShortElement(term398058, 5, (short) 2);
        setShortElement(term398058, 6, (short) 3);
        setShortElement(term398058, 10, (short) 2);
        setShortElement(term398058, 11, (short) 4);
        setShortElement(term398058, 12, (short) 4);
        setShortElement(term398058, 13, (short) 3);
        setShortElement(term398058, 14, (short) 4);
        setShortElement(term398058, 15, (short) 4);
        setShortElement(term398058, 16, (short) 1);
        setShortElement(term398058, 17, (short) 2);
        setShortElement(term398058, 18, (short) 3);
        setShortElement(term398058, 19, (short) 3);
        setShortElement(term398058, 20, (short) 13);
        setShortElement(term398058, 21, (short) 1);
        setShortElement(term398058, 22, (short) 2);
        setShortElement(term398058, 23, (short) 12);
        setElement(term398057, 0, term398058);
        setIntElement(term398091, 0, 128385024);
        setIntElement(term398091, 1, 2097152);
        setIntElement(term398091, 2, 393216);
        setIntElement(term398091, 3, 3866630);
        setIntElement(term398091, 4, 1245184);
        setIntElement(term398091, 5, 3211264);
        setIntElement(term398091, 7, 6553600);
        setIntElement(term398091, 8, 393216);
        setIntElement(term398091, 9, 3866630);
        setIntElement(term398091, 10, 14352384);
        setIntElement(term398091, 11, 10354688);
        setIntElement(term398091, 12, 2883584);
        setIntElement(term398091, 13, 786432);
        setIntElement(term398091, 14, 1441792);
        setIntElement(term398091, 15, 7733248);
        setIntElement(term398091, 16, 20774912);
        setIntElement(term398091, 17, 262144);
        setIntElement(term398091, 18, 2555904);
        setIntElement(term398091, 19, 1835008);
        setIntElement(term398091, 20, 6029312);
        setIntElement(term398091, 21, 327680);
        setIntElement(term398091, 22, 1638400);
        setIntElement(term398091, 23, 720907);
        setElement(term398057, 1, term398091);
        setElement(term398124, 0, term398125);
        setElement(term398124, 1, term398132);
        setElement(term398124, 2, term398145);
        setElement(term398124, 3, term398149);
        setElement(term398124, 4, term398153);
        setElement(term398124, 5, term398157);
        setElement(term398124, 6, term398163);
        setElement(term398124, 7, term398163);
        setElement(term398124, 8, term398145);
        setElement(term398124, 9, term398149);
        setElement(term398124, 10, term398166);
        setElement(term398124, 11, term398171);
        setElement(term398124, 12, term398175);
        setElement(term398124, 13, term398179);
        setElement(term398124, 14, term398183);
        setElement(term398124, 15, term398175);
        setElement(term398124, 16, term398187);
        setElement(term398124, 17, term398191);
        setElement(term398124, 18, term398194);
        setElement(term398124, 19, term398197);
        setElement(term398124, 20, term398201);
        setElement(term398124, 21, term398205);
        setElement(term398124, 22, term398208);
        setElement(term398124, 23, term398212);
        setElement(term398057, 2, term398124);
        setLongElement(term398216, 0, 132578328546864L);
        setLongElement(term398216, 1, 34363739368L);
        setLongElement(term398216, 2, 34363739368L);
        setLongElement(term398216, 3, 34363739368L);
        setLongElement(term398216, 4, 132578328998496L);
        setLongElement(term398216, 5, 34363820048L);
        setLongElement(term398216, 6, 34364798256L);
        setLongElement(term398216, 7, 34363739368L);
        setLongElement(term398216, 8, 34363739368L);
        setLongElement(term398216, 9, 34363739368L);
        setLongElement(term398216, 10, 132582552571296L);
        setLongElement(term398216, 11, 132582552640272L);
        setLongElement(term398216, 12, 132582550089488L);
        setLongElement(term398216, 13, 132582552759024L);
        setLongElement(term398216, 14, 132582550089488L);
        setLongElement(term398216, 15, 132582550089488L);
        setLongElement(term398216, 16, 34363745472L);
        setLongElement(term398216, 17, 34364710216L);
        setLongElement(term398216, 18, 34363745472L);
        setLongElement(term398216, 19, 34363745472L);
        setLongElement(term398216, 20, 34364896224L);
        setLongElement(term398216, 21, 34363745472L);
        setLongElement(term398216, 22, 34363745472L);
        setLongElement(term398216, 23, 34363745472L);
        setElement(term398057, 3, term398216);
        setField(term398052, term398052.getClass(), "backtrace", term398057);
        setField(term398052, term398052.getClass(), "detailMessage", "(was java.lang.Exception)");
        setField(term398047, term398047.getClass(), "backtrace", null);
        setField(term398047, term398047.getClass(), "detailMessage", null);
        setField(term398047, term398047.getClass(), "cause", null);
        setField(term398047, term398047.getClass(), "stackTrace", null);
        setIntField(term398047, term398047.getClass(), "depth", 0);
        setField(term398047, term398047.getClass(), "suppressedExceptions", null);
        setField(term398052, term398052.getClass(), "cause", term398047);
        setField(term398052, term398052.getClass(), "stackTrace", term398276);
        setIntField(term398052, term398052.getClass(), "depth", 24);
        setIntField(term398278, term398278.getClass(), "modCount", 0);
        setField(term398052, term398052.getClass(), "suppressedExceptions", term398278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term397789;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term397789, term398280));
        assertTrue(recursiveEquals(retValue, term398052));
    }

};


