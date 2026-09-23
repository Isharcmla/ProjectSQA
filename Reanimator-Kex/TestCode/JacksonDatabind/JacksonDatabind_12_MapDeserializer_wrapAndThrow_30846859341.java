package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_wrapAndThrow_30846859341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;
     Object term485;

    public MapDeserializer_wrapAndThrow_30846859341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270 = Class.forName((String) "java.nio.channels.IllegalSelectorException");
        Class<? extends Object> term273 = Class.forName((String) "java.util.Collections$1");
        Class<? extends Object> term275 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAnyGetter");
        Class<? extends Object> term279 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<? extends Object> term284 = Class.forName((String) "java.nio.file.attribute.UserPrincipalNotFoundException");
        Class<? extends Object> term288 = Class.forName((String) "java.io.ObjectStreamClass$ClassDataSlot");
        Class<? extends Object> term292 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceEntriesToDoubleTask");
        Class<? extends Object> term296 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6");
        Class<? extends Object> term300 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$2");
        Class<? extends Object> term304 = Class.forName((String) "java.nio.file.FileSystemAlreadyExistsException");
        Class<? extends Object> term308 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$BulkTask");
        Class<? extends Object> term312 = Class.forName((String) "kex.java.util.Arrays$NaturalOrder");
        Class<? extends Object> term316 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor");
        Class<? extends Object> term320 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$7");
        Class<? extends Object> term322 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<? extends Object> term325 = Class.forName((String) "com.fasterxml.jackson.databind.util.EnumResolver");
        Class<? extends Object> term327 = Class.forName((String) "java.lang.ProcessEnvironment$StringEntrySet");
        Class<? extends Object> term329 = Class.forName((String) "java.util.function.IntPredicate");
        Class<? extends Object> term432 = Class.forName((String) "java.util.stream.Nodes");
        Class<? extends Object> term434 = Class.forName((String) "java.lang.invoke.MethodHandleNatives");
        term201 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term202 = (Object[]) newArray("java.lang.Object", 5);
        short[] term203 = (short[]) newShortArray(32);
        int[] term236 = (int[]) newIntArray(32);
        Object[] term269 = (Object[]) newArray("java.lang.Object", 32);
        long[] term331 = (long[]) newLongArray(32);
        Object[] term364 = (Object[]) newArray("java.lang.Object", 5);
        short[] term365 = (short[]) newShortArray(32);
        int[] term398 = (int[]) newIntArray(32);
        Object[] term431 = (Object[]) newArray("java.lang.Object", 32);
        long[] term436 = (long[]) newLongArray(32);
        Object[] term481 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term483 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term203, 0, (short) 1);
        setShortElement(term203, 1, (short) 2);
        setShortElement(term203, 2, (short) 1);
        setShortElement(term203, 3, (short) 7);
        setShortElement(term203, 4, (short) 2);
        setShortElement(term203, 5, (short) 1);
        setShortElement(term203, 6, (short) 6);
        setShortElement(term203, 7, (short) 2);
        setShortElement(term203, 8, (short) 10);
        setShortElement(term203, 9, (short) 11);
        setShortElement(term203, 10, (short) 29);
        setShortElement(term203, 11, (short) 5);
        setShortElement(term203, 12, (short) 4);
        setShortElement(term203, 13, (short) 5);
        setShortElement(term203, 14, (short) 6);
        setShortElement(term203, 15, (short) 6);
        setShortElement(term203, 16, (short) 9);
        setShortElement(term203, 17, (short) 10);
        setShortElement(term203, 18, (short) 11);
        setShortElement(term203, 19, (short) 4);
        setShortElement(term203, 20, (short) 1);
        setShortElement(term203, 23, (short) 3);
        setShortElement(term203, 24, (short) 4);
        setShortElement(term203, 25, (short) 4);
        setShortElement(term203, 26, (short) 1);
        setShortElement(term203, 27, (short) 2);
        setShortElement(term203, 28, (short) 3);
        setShortElement(term203, 29, (short) 3);
        setShortElement(term203, 30, (short) 13);
        setShortElement(term203, 31, (short) 1);
        setElement(term202, 0, term203);
        setIntElement(term236, 1, 5570560);
        setIntElement(term236, 2, 327680);
        setIntElement(term236, 3, 4456454);
        setIntElement(term236, 4, 1769472);
        setIntElement(term236, 5, 14876672);
        setIntElement(term236, 6, 6225920);
        setIntElement(term236, 7, 917504);
        setIntElement(term236, 8, 327680);
        setIntElement(term236, 9, 8519680);
        setIntElement(term236, 10, 917504);
        setIntElement(term236, 11, 11993088);
        setIntElement(term236, 12, 655360);
        setIntElement(term236, 13, 7864320);
        setIntElement(term236, 14, 3735552);
        setIntElement(term236, 15, 7143424);
        setIntElement(term236, 16, 8454144);
        setIntElement(term236, 17, 9240576);
        setIntElement(term236, 18, 196608);
        setIntElement(term236, 19, 3801088);
        setIntElement(term236, 20, 786432);
        setIntElement(term236, 21, 589824);
        setIntElement(term236, 22, 17170432);
        setIntElement(term236, 23, 1376256);
        setIntElement(term236, 24, 5242880);
        setIntElement(term236, 25, 2883584);
        setIntElement(term236, 26, 20774912);
        setIntElement(term236, 27, 262144);
        setIntElement(term236, 28, 2555904);
        setIntElement(term236, 29, 1835008);
        setIntElement(term236, 30, 6029312);
        setIntElement(term236, 31, 327680);
        setElement(term202, 1, term236);
        setElement(term269, 0, term270);
        setElement(term269, 1, term270);
        setElement(term269, 2, term273);
        setElement(term269, 3, term275);
        setElement(term269, 4, term279);
        setElement(term269, 5, term279);
        setElement(term269, 6, term284);
        setElement(term269, 7, term284);
        setElement(term269, 8, term288);
        setElement(term269, 9, term288);
        setElement(term269, 10, term288);
        setElement(term269, 11, term288);
        setElement(term269, 12, term288);
        setElement(term269, 13, term292);
        setElement(term269, 14, term292);
        setElement(term269, 15, term296);
        setElement(term269, 16, term296);
        setElement(term269, 17, term296);
        setElement(term269, 18, term296);
        setElement(term269, 19, term300);
        setElement(term269, 20, term300);
        setElement(term269, 21, term300);
        setElement(term269, 22, term304);
        setElement(term269, 23, term296);
        setElement(term269, 24, term308);
        setElement(term269, 25, term312);
        setElement(term269, 26, term316);
        setElement(term269, 27, term320);
        setElement(term269, 28, term322);
        setElement(term269, 29, term325);
        setElement(term269, 30, term327);
        setElement(term269, 31, term329);
        setElement(term202, 2, term269);
        setLongElement(term331, 0, 34363746224L);
        setLongElement(term331, 1, 34363775512L);
        setLongElement(term331, 2, 34363775512L);
        setLongElement(term331, 3, 34363775512L);
        setLongElement(term331, 4, 125675713554912L);
        setLongElement(term331, 5, 34364440080L);
        setLongElement(term331, 6, 125675713629344L);
        setLongElement(term331, 7, 125675713468544L);
        setLongElement(term331, 8, 125675713468432L);
        setLongElement(term331, 9, 125675713468576L);
        setLongElement(term331, 10, 125675713515792L);
        setLongElement(term331, 11, 34363766248L);
        setLongElement(term331, 12, 34363766248L);
        setLongElement(term331, 13, 125672590537040L);
        setLongElement(term331, 14, 125672590537040L);
        setLongElement(term331, 15, 125672590536896L);
        setLongElement(term331, 16, 125672590581472L);
        setLongElement(term331, 17, 125672590583120L);
        setLongElement(term331, 18, 125672590583888L);
        setLongElement(term331, 19, 125672587510288L);
        setLongElement(term331, 20, 34363739368L);
        setLongElement(term331, 21, 34363739368L);
        setLongElement(term331, 22, 125672590535536L);
        setLongElement(term331, 23, 34363829248L);
        setLongElement(term331, 24, 125672587510288L);
        setLongElement(term331, 25, 125672586395920L);
        setLongElement(term331, 26, 34363745472L);
        setLongElement(term331, 27, 34364710216L);
        setLongElement(term331, 28, 34363745472L);
        setLongElement(term331, 29, 34363745472L);
        setLongElement(term331, 30, 34364896224L);
        setLongElement(term331, 31, 34363745472L);
        setElement(term202, 3, term331);
        setShortElement(term365, 0, (short) 2);
        setShortElement(term365, 1, (short) 12);
        setElement(term364, 0, term365);
        setIntElement(term398, 0, 1638400);
        setIntElement(term398, 1, 720907);
        setElement(term364, 1, term398);
        setElement(term431, 0, term432);
        setElement(term431, 1, term434);
        setElement(term364, 2, term431);
        setLongElement(term436, 0, 34363745472L);
        setLongElement(term436, 1, 34363745472L);
        setElement(term364, 3, term436);
        setElement(term202, 4, term364);
        setField(term201, term201.getClass(), "backtrace", term202);
        setField(term201, term201.getClass(), "detailMessage", "aJlieCFVtF");
        setField(term201, term201.getClass(), "cause", term201);
        setField(term201, term201.getClass(), "stackTrace", term481);
        setIntField(term201, term201.getClass(), "depth", 34);
        setIntField(term483, term483.getClass(), "modCount", 0);
        setField(term201, term201.getClass(), "suppressedExceptions", term483);
        term485 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term201;
        args[1] = term485;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


