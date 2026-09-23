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

public class JsonMappingException_wrapWithPath_48186100588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182151;
     Object term194339;
     Object term193874;

    public JsonMappingException_wrapWithPath_48186100588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182151 = newInstance(Class.forName("java.lang.Throwable"));
        term194339 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term194339, term194339.getClass(), "backtrace", null);
        setField(term194339, term194339.getClass(), "detailMessage", null);
        setField(term194339, term194339.getClass(), "cause", null);
        setField(term194339, term194339.getClass(), "stackTrace", null);
        setIntField(term194339, term194339.getClass(), "depth", 0);
        setField(term194339, term194339.getClass(), "suppressedExceptions", null);
        LinkedList term193875 = new LinkedList();
        ((LinkedList) term193875).add((Object)null);
        Class<? extends Object> term193947 = Class.forName((String) "java.util.NavigableSet");
        Class<? extends Object> term193954 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$CounterCell");
        Class<? extends Object> term193957 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer");
        Class<? extends Object> term193959 = Class.forName((String) "java.util.Spliterator$OfPrimitive");
        Class<? extends Object> term193963 = Class.forName((String) "java.nio.file.FileTreeWalker$EventType");
        Class<? extends Object> term193967 = Class.forName((String) "java.util.concurrent.Exchanger$Participant");
        Class<? extends Object> term193973 = Class.forName((String) "java.lang.reflect.Type");
        Class<? extends Object> term193978 = Class.forName((String) "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException");
        Class<? extends Object> term193982 = Class.forName((String) "java.util.LocaleISOData");
        Class<? extends Object> term193986 = Class.forName((String) "java.util.concurrent.ConcurrentNavigableMap");
        Class<? extends Object> term193990 = Class.forName((String) "com.fasterxml.jackson.databind.JsonNode$1");
        Class<? extends Object> term193994 = Class.forName((String) "java.nio.HeapIntBufferR");
        Class<? extends Object> term193998 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer");
        Class<? extends Object> term194001 = Class.forName((String) "java.lang.Iterable");
        Class<? extends Object> term194004 = Class.forName((String) "com.fasterxml.jackson.databind.BeanProperty");
        Class<? extends Object> term194008 = Class.forName((String) "java.util.stream.IntStream");
        Class<? extends Object> term194011 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Class<? extends Object> term194014 = Class.forName((String) "java.nio.file.Files$1");
        Class<? extends Object> term194018 = Class.forName((String) "java.util.zip.ZipFile$EntrySpliterator");
        term193874 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term193879 = (Object[]) newArray("java.lang.Object", 5);
        short[] term193880 = (short[]) newShortArray(32);
        int[] term193913 = (int[]) newIntArray(32);
        Object[] term193946 = (Object[]) newArray("java.lang.Object", 32);
        long[] term194022 = (long[]) newLongArray(32);
        Object term193765 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term194082 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term194084 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term193874, term193874.getClass(), "_path", term193875);
        setField(term193874, term193874.getClass(), "_processor", null);
        setField(term193874, term193874.getClass(), "_location", null);
        setShortElement(term193880, 0, (short) 30);
        setShortElement(term193880, 1, (short) 3);
        setShortElement(term193880, 5, (short) 33);
        setShortElement(term193880, 6, (short) 2);
        setShortElement(term193880, 7, (short) 3);
        setShortElement(term193880, 11, (short) 2);
        setShortElement(term193880, 12, (short) 4);
        setShortElement(term193880, 13, (short) 4);
        setShortElement(term193880, 14, (short) 3);
        setShortElement(term193880, 15, (short) 4);
        setShortElement(term193880, 16, (short) 4);
        setShortElement(term193880, 17, (short) 1);
        setShortElement(term193880, 18, (short) 2);
        setShortElement(term193880, 19, (short) 3);
        setShortElement(term193880, 20, (short) 3);
        setShortElement(term193880, 21, (short) 13);
        setShortElement(term193880, 22, (short) 1);
        setShortElement(term193880, 23, (short) 2);
        setShortElement(term193880, 24, (short) 12);
        setElement(term193879, 0, term193880);
        setIntElement(term193913, 0, 128385024);
        setIntElement(term193913, 2, 6553600);
        setIntElement(term193913, 3, 393216);
        setIntElement(term193913, 4, 3866630);
        setIntElement(term193913, 5, 1245184);
        setIntElement(term193913, 6, 3211264);
        setIntElement(term193913, 8, 6553600);
        setIntElement(term193913, 9, 393216);
        setIntElement(term193913, 10, 3866630);
        setIntElement(term193913, 11, 14352384);
        setIntElement(term193913, 12, 10354688);
        setIntElement(term193913, 13, 2883584);
        setIntElement(term193913, 14, 786432);
        setIntElement(term193913, 15, 1441792);
        setIntElement(term193913, 16, 7733248);
        setIntElement(term193913, 17, 20774912);
        setIntElement(term193913, 18, 262144);
        setIntElement(term193913, 19, 2555904);
        setIntElement(term193913, 20, 1835008);
        setIntElement(term193913, 21, 6029312);
        setIntElement(term193913, 22, 327680);
        setIntElement(term193913, 23, 1638400);
        setIntElement(term193913, 24, 720907);
        setElement(term193879, 1, term193913);
        setElement(term193946, 0, term193947);
        setElement(term193946, 1, term193954);
        setElement(term193946, 2, term193954);
        setElement(term193946, 3, term193957);
        setElement(term193946, 4, term193959);
        setElement(term193946, 5, term193963);
        setElement(term193946, 6, term193967);
        setElement(term193946, 7, term193954);
        setElement(term193946, 8, term193954);
        setElement(term193946, 9, term193957);
        setElement(term193946, 10, term193959);
        setElement(term193946, 11, term193973);
        setElement(term193946, 12, term193978);
        setElement(term193946, 13, term193982);
        setElement(term193946, 14, term193986);
        setElement(term193946, 15, term193990);
        setElement(term193946, 16, term193982);
        setElement(term193946, 17, term193994);
        setElement(term193946, 18, term193998);
        setElement(term193946, 19, term194001);
        setElement(term193946, 20, term194004);
        setElement(term193946, 21, term194008);
        setElement(term193946, 22, term194011);
        setElement(term193946, 23, term194014);
        setElement(term193946, 24, term194018);
        setElement(term193879, 2, term193946);
        setLongElement(term194022, 0, 132073604125776L);
        setLongElement(term194022, 1, 34364798256L);
        setLongElement(term194022, 2, 34363739368L);
        setLongElement(term194022, 3, 34363739368L);
        setLongElement(term194022, 4, 34363739368L);
        setLongElement(term194022, 5, 132073603951184L);
        setLongElement(term194022, 6, 34363820048L);
        setLongElement(term194022, 7, 34364798256L);
        setLongElement(term194022, 8, 34363739368L);
        setLongElement(term194022, 9, 34363739368L);
        setLongElement(term194022, 10, 34363739368L);
        setLongElement(term194022, 11, 132077283560208L);
        setLongElement(term194022, 12, 132077283629184L);
        setLongElement(term194022, 13, 132077281112816L);
        setLongElement(term194022, 14, 132077283747392L);
        setLongElement(term194022, 15, 132077281112816L);
        setLongElement(term194022, 16, 132077281112816L);
        setLongElement(term194022, 17, 34363745472L);
        setLongElement(term194022, 18, 34364710216L);
        setLongElement(term194022, 19, 34363745472L);
        setLongElement(term194022, 20, 34363745472L);
        setLongElement(term194022, 21, 34364896224L);
        setLongElement(term194022, 22, 34363745472L);
        setLongElement(term194022, 23, 34363745472L);
        setLongElement(term194022, 24, 34363745472L);
        setElement(term193879, 3, term194022);
        setField(term193874, term193874.getClass(), "backtrace", term193879);
        setField(term193874, term193874.getClass(), "detailMessage", "(was java.lang.Throwable)");
        setField(term193765, term193765.getClass(), "backtrace", null);
        setField(term193765, term193765.getClass(), "detailMessage", null);
        setField(term193765, term193765.getClass(), "cause", null);
        setField(term193765, term193765.getClass(), "stackTrace", null);
        setIntField(term193765, term193765.getClass(), "depth", 0);
        setField(term193765, term193765.getClass(), "suppressedExceptions", null);
        setField(term193874, term193874.getClass(), "cause", term193765);
        setField(term193874, term193874.getClass(), "stackTrace", term194082);
        setIntField(term193874, term193874.getClass(), "depth", 25);
        setIntField(term194084, term194084.getClass(), "modCount", 0);
        setField(term193874, term193874.getClass(), "suppressedExceptions", term194084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term182151;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term182151, term194339));
        assertTrue(recursiveEquals(retValue, term193874));
    }

};


