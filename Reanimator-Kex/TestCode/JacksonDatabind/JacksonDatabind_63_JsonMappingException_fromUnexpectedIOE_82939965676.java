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

public class JsonMappingException_fromUnexpectedIOE_82939965676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162246;
     Object term163156;
     Object term162833;

    public JsonMappingException_fromUnexpectedIOE_82939965676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162246 = newInstance(Class.forName("java.io.SyncFailedException"));
        term163156 = newInstance(Class.forName("java.io.SyncFailedException"));
        setField(term163156, term163156.getClass(), "backtrace", null);
        setField(term163156, term163156.getClass(), "detailMessage", null);
        setField(term163156, term163156.getClass(), "cause", null);
        setField(term163156, term163156.getClass(), "stackTrace", null);
        setIntField(term163156, term163156.getClass(), "depth", 0);
        setField(term163156, term163156.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term162902 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReservationNode");
        Class<? extends Object> term162909 = Class.forName((String) "java.lang.Class$3");
        Class<? extends Object> term162913 = Class.forName((String) "com.fasterxml.jackson.databind.SerializerProvider");
        Class<? extends Object> term162916 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor");
        Class<? extends Object> term162920 = Class.forName((String) "java.util.FormattableFlags");
        Class<? extends Object> term162924 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableCollection");
        Class<? extends Object> term162930 = Class.forName((String) "java.lang.CharacterDataUndefined");
        Class<? extends Object> term162935 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToDoubleTask");
        Class<? extends Object> term162939 = Class.forName((String) "java.lang.invoke.VarHandleBytes");
        Class<? extends Object> term162943 = Class.forName((String) "java.util.Stack");
        Class<? extends Object> term162947 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntrySetSpliterator");
        Class<? extends Object> term162951 = Class.forName((String) "java.io.ObjectInputFilter");
        Class<? extends Object> term162955 = Class.forName((String) "java.lang.CharacterDataPrivateUse");
        Class<? extends Object> term162958 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer");
        Class<? extends Object> term162961 = Class.forName((String) "java.nio.file.attribute.FileOwnerAttributeView");
        Class<? extends Object> term162965 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase");
        Class<? extends Object> term162969 = Class.forName((String) "java.nio.file.attribute.AclFileAttributeView");
        Class<? extends Object> term162972 = Class.forName((String) "java.util.concurrent.RunnableFuture");
        Class<? extends Object> term162976 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        term162833 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term162834 = (Object[]) newArray("java.lang.Object", 5);
        short[] term162835 = (short[]) newShortArray(32);
        int[] term162868 = (int[]) newIntArray(32);
        Object[] term162901 = (Object[]) newArray("java.lang.Object", 32);
        long[] term162980 = (long[]) newLongArray(32);
        Object[] term163081 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term163083 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term162833, term162833.getClass(), "_path", null);
        setField(term162833, term162833.getClass(), "_processor", null);
        setField(term162833, term162833.getClass(), "_location", null);
        setShortElement(term162835, 0, (short) 30);
        setShortElement(term162835, 1, (short) 3);
        setShortElement(term162835, 5, (short) 27);
        setShortElement(term162835, 6, (short) 2);
        setShortElement(term162835, 7, (short) 3);
        setShortElement(term162835, 11, (short) 2);
        setShortElement(term162835, 12, (short) 4);
        setShortElement(term162835, 13, (short) 4);
        setShortElement(term162835, 14, (short) 3);
        setShortElement(term162835, 15, (short) 4);
        setShortElement(term162835, 16, (short) 4);
        setShortElement(term162835, 17, (short) 1);
        setShortElement(term162835, 18, (short) 2);
        setShortElement(term162835, 19, (short) 3);
        setShortElement(term162835, 20, (short) 3);
        setShortElement(term162835, 21, (short) 13);
        setShortElement(term162835, 22, (short) 1);
        setShortElement(term162835, 23, (short) 2);
        setShortElement(term162835, 24, (short) 12);
        setElement(term162834, 0, term162835);
        setIntElement(term162868, 0, 57016320);
        setIntElement(term162868, 2, 6553600);
        setIntElement(term162868, 3, 393216);
        setIntElement(term162868, 4, 3866630);
        setIntElement(term162868, 5, 1245184);
        setIntElement(term162868, 6, 2424832);
        setIntElement(term162868, 8, 6553600);
        setIntElement(term162868, 9, 393216);
        setIntElement(term162868, 10, 3866630);
        setIntElement(term162868, 11, 14352384);
        setIntElement(term162868, 12, 10354688);
        setIntElement(term162868, 13, 2883584);
        setIntElement(term162868, 14, 786432);
        setIntElement(term162868, 15, 1441792);
        setIntElement(term162868, 16, 7733248);
        setIntElement(term162868, 17, 20774912);
        setIntElement(term162868, 18, 262144);
        setIntElement(term162868, 19, 2555904);
        setIntElement(term162868, 20, 1835008);
        setIntElement(term162868, 21, 6029312);
        setIntElement(term162868, 22, 327680);
        setIntElement(term162868, 23, 1638400);
        setIntElement(term162868, 24, 720907);
        setElement(term162834, 1, term162868);
        setElement(term162901, 0, term162902);
        setElement(term162901, 1, term162909);
        setElement(term162901, 2, term162909);
        setElement(term162901, 3, term162913);
        setElement(term162901, 4, term162916);
        setElement(term162901, 5, term162920);
        setElement(term162901, 6, term162924);
        setElement(term162901, 7, term162909);
        setElement(term162901, 8, term162909);
        setElement(term162901, 9, term162913);
        setElement(term162901, 10, term162916);
        setElement(term162901, 11, term162930);
        setElement(term162901, 12, term162935);
        setElement(term162901, 13, term162939);
        setElement(term162901, 14, term162943);
        setElement(term162901, 15, term162947);
        setElement(term162901, 16, term162939);
        setElement(term162901, 17, term162951);
        setElement(term162901, 18, term162955);
        setElement(term162901, 19, term162958);
        setElement(term162901, 20, term162961);
        setElement(term162901, 21, term162965);
        setElement(term162901, 22, term162969);
        setElement(term162901, 23, term162972);
        setElement(term162901, 24, term162976);
        setElement(term162834, 2, term162901);
        setLongElement(term162980, 0, 132578329177248L);
        setLongElement(term162980, 1, 34364798256L);
        setLongElement(term162980, 2, 34363739368L);
        setLongElement(term162980, 3, 34363739368L);
        setLongElement(term162980, 4, 34363739368L);
        setLongElement(term162980, 5, 132578328998496L);
        setLongElement(term162980, 6, 34363820048L);
        setLongElement(term162980, 7, 34364798256L);
        setLongElement(term162980, 8, 34363739368L);
        setLongElement(term162980, 9, 34363739368L);
        setLongElement(term162980, 10, 34363739368L);
        setLongElement(term162980, 11, 132582552571296L);
        setLongElement(term162980, 12, 132582552640272L);
        setLongElement(term162980, 13, 132582550089488L);
        setLongElement(term162980, 14, 132582552759024L);
        setLongElement(term162980, 15, 132582550089488L);
        setLongElement(term162980, 16, 132582550089488L);
        setLongElement(term162980, 17, 34363745472L);
        setLongElement(term162980, 18, 34364710216L);
        setLongElement(term162980, 19, 34363745472L);
        setLongElement(term162980, 20, 34363745472L);
        setLongElement(term162980, 21, 34364896224L);
        setLongElement(term162980, 22, 34363745472L);
        setLongElement(term162980, 23, 34363745472L);
        setLongElement(term162980, 24, 34363745472L);
        setElement(term162834, 3, term162980);
        setField(term162833, term162833.getClass(), "backtrace", term162834);
        setField(term162833, term162833.getClass(), "detailMessage", "Unexpected IOException (of type java.io.SyncFailedException): null");
        setField(term162833, term162833.getClass(), "cause", term162833);
        setField(term162833, term162833.getClass(), "stackTrace", term163081);
        setIntField(term162833, term162833.getClass(), "depth", 25);
        setIntField(term163083, term163083.getClass(), "modCount", 0);
        setField(term162833, term162833.getClass(), "suppressedExceptions", term163083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term162246;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term162246, term163156));
        assertTrue(recursiveEquals(retValue, term162833));
    }

};


