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

public class StdValueInstantiator_unwrapAndWrapException_171815443484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3352;

    public StdValueInstantiator_unwrapAndWrapException_171815443484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3421 = Class.forName((String) "java.util.Collections$SynchronizedList");
        Class<? extends Object> term3424 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceMappingsTask");
        Class<? extends Object> term3426 = Class.forName((String) "com.fasterxml.jackson.core.SerializableString");
        Class<? extends Object> term3430 = Class.forName((String) "java.util.concurrent.CompletableFuture$Completion");
        Class<? extends Object> term3435 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory");
        Class<? extends Object> term3439 = Class.forName((String) "java.util.Queue");
        Class<? extends Object> term3443 = Class.forName((String) "java.util.concurrent.SynchronousQueue");
        Class<? extends Object> term3447 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term3451 = Class.forName((String) "com.fasterxml.jackson.core.json.JsonGeneratorImpl");
        Class<? extends Object> term3455 = Class.forName((String) "java.util.Collections$EmptyMap");
        Class<? extends Object> term3459 = Class.forName((String) "java.util.regex.Pattern$LastNode");
        Class<? extends Object> term3463 = Class.forName((String) "java.lang.reflect.ProxyGenerator$PrimitiveTypeInfo");
        Class<? extends Object> term3467 = Class.forName((String) "java.util.stream.Nodes$IntSpinedNodeBuilder");
        Class<? extends Object> term3471 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldStaticReadOnly");
        Class<? extends Object> term3474 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$EntrySpliterator");
        Class<? extends Object> term3477 = Class.forName((String) "java.io.StreamTokenizer");
        Class<? extends Object> term3480 = Class.forName((String) "java.lang.NamedPackage");
        Class<? extends Object> term3483 = Class.forName((String) "java.util.stream.StreamShape");
        Class<? extends Object> term3587 = Class.forName((String) "java.util.stream.Stream$Builder");
        Class<? extends Object> term3589 = Class.forName((String) "java.lang.Integer$IntegerCache");
        term3352 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3353 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3354 = (short[]) newShortArray(32);
        int[] term3387 = (int[]) newIntArray(32);
        Object[] term3420 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3486 = (long[]) newLongArray(32);
        Object[] term3519 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3520 = (short[]) newShortArray(32);
        int[] term3553 = (int[]) newIntArray(32);
        Object[] term3586 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3591 = (long[]) newLongArray(32);
        Object[] term3636 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3638 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3354, 0, (short) 1);
        setShortElement(term3354, 1, (short) 2);
        setShortElement(term3354, 2, (short) 1);
        setShortElement(term3354, 3, (short) 7);
        setShortElement(term3354, 4, (short) 2);
        setShortElement(term3354, 5, (short) 1);
        setShortElement(term3354, 6, (short) 6);
        setShortElement(term3354, 7, (short) 2);
        setShortElement(term3354, 8, (short) 10);
        setShortElement(term3354, 9, (short) 11);
        setShortElement(term3354, 10, (short) 29);
        setShortElement(term3354, 11, (short) 5);
        setShortElement(term3354, 12, (short) 4);
        setShortElement(term3354, 13, (short) 5);
        setShortElement(term3354, 14, (short) 6);
        setShortElement(term3354, 15, (short) 6);
        setShortElement(term3354, 16, (short) 9);
        setShortElement(term3354, 17, (short) 10);
        setShortElement(term3354, 18, (short) 11);
        setShortElement(term3354, 19, (short) 4);
        setShortElement(term3354, 20, (short) 1);
        setShortElement(term3354, 23, (short) 3);
        setShortElement(term3354, 24, (short) 4);
        setShortElement(term3354, 25, (short) 4);
        setShortElement(term3354, 26, (short) 1);
        setShortElement(term3354, 27, (short) 2);
        setShortElement(term3354, 28, (short) 3);
        setShortElement(term3354, 29, (short) 3);
        setShortElement(term3354, 30, (short) 13);
        setShortElement(term3354, 31, (short) 1);
        setElement(term3353, 0, term3354);
        setIntElement(term3387, 1, 5570560);
        setIntElement(term3387, 2, 327680);
        setIntElement(term3387, 3, 4456454);
        setIntElement(term3387, 4, 1769472);
        setIntElement(term3387, 5, 14876672);
        setIntElement(term3387, 6, 6225920);
        setIntElement(term3387, 7, 917504);
        setIntElement(term3387, 8, 327680);
        setIntElement(term3387, 9, 8519680);
        setIntElement(term3387, 10, 917504);
        setIntElement(term3387, 11, 11993088);
        setIntElement(term3387, 12, 655360);
        setIntElement(term3387, 13, 7864320);
        setIntElement(term3387, 14, 3735552);
        setIntElement(term3387, 15, 7143424);
        setIntElement(term3387, 16, 8454144);
        setIntElement(term3387, 17, 9240576);
        setIntElement(term3387, 18, 196608);
        setIntElement(term3387, 19, 3801088);
        setIntElement(term3387, 20, 786432);
        setIntElement(term3387, 21, 589824);
        setIntElement(term3387, 22, 17170432);
        setIntElement(term3387, 23, 1376256);
        setIntElement(term3387, 24, 5242880);
        setIntElement(term3387, 25, 2883584);
        setIntElement(term3387, 26, 20774912);
        setIntElement(term3387, 27, 262144);
        setIntElement(term3387, 28, 2555904);
        setIntElement(term3387, 29, 1835008);
        setIntElement(term3387, 30, 6029312);
        setIntElement(term3387, 31, 327680);
        setElement(term3353, 1, term3387);
        setElement(term3420, 0, term3421);
        setElement(term3420, 1, term3421);
        setElement(term3420, 2, term3424);
        setElement(term3420, 3, term3426);
        setElement(term3420, 4, term3430);
        setElement(term3420, 5, term3430);
        setElement(term3420, 6, term3435);
        setElement(term3420, 7, term3435);
        setElement(term3420, 8, term3439);
        setElement(term3420, 9, term3439);
        setElement(term3420, 10, term3439);
        setElement(term3420, 11, term3439);
        setElement(term3420, 12, term3439);
        setElement(term3420, 13, term3443);
        setElement(term3420, 14, term3443);
        setElement(term3420, 15, term3447);
        setElement(term3420, 16, term3447);
        setElement(term3420, 17, term3447);
        setElement(term3420, 18, term3447);
        setElement(term3420, 19, term3451);
        setElement(term3420, 20, term3451);
        setElement(term3420, 21, term3451);
        setElement(term3420, 22, term3455);
        setElement(term3420, 23, term3447);
        setElement(term3420, 24, term3459);
        setElement(term3420, 25, term3463);
        setElement(term3420, 26, term3467);
        setElement(term3420, 27, term3471);
        setElement(term3420, 28, term3474);
        setElement(term3420, 29, term3477);
        setElement(term3420, 30, term3480);
        setElement(term3420, 31, term3483);
        setElement(term3353, 2, term3420);
        setLongElement(term3486, 0, 34363746224L);
        setLongElement(term3486, 1, 34363775512L);
        setLongElement(term3486, 2, 34363775512L);
        setLongElement(term3486, 3, 34363775512L);
        setLongElement(term3486, 4, 127296325552064L);
        setLongElement(term3486, 5, 34364440080L);
        setLongElement(term3486, 6, 127296325619216L);
        setLongElement(term3486, 7, 127296325243872L);
        setLongElement(term3486, 8, 127296325243760L);
        setLongElement(term3486, 9, 127296325243904L);
        setLongElement(term3486, 10, 127296325505648L);
        setLongElement(term3486, 11, 34363766248L);
        setLongElement(term3486, 12, 34363766248L);
        setLongElement(term3486, 13, 127293269653488L);
        setLongElement(term3486, 14, 127293269653488L);
        setLongElement(term3486, 15, 127293269653344L);
        setLongElement(term3486, 16, 127293269697904L);
        setLongElement(term3486, 17, 127293269699552L);
        setLongElement(term3486, 18, 127293269700320L);
        setLongElement(term3486, 19, 127293266625536L);
        setLongElement(term3486, 20, 34363739368L);
        setLongElement(term3486, 21, 34363739368L);
        setLongElement(term3486, 22, 127293269651984L);
        setLongElement(term3486, 23, 34363829248L);
        setLongElement(term3486, 24, 127293266625536L);
        setLongElement(term3486, 25, 127293265779920L);
        setLongElement(term3486, 26, 34363745472L);
        setLongElement(term3486, 27, 34364710216L);
        setLongElement(term3486, 28, 34363745472L);
        setLongElement(term3486, 29, 34363745472L);
        setLongElement(term3486, 30, 34364896224L);
        setLongElement(term3486, 31, 34363745472L);
        setElement(term3353, 3, term3486);
        setShortElement(term3520, 0, (short) 2);
        setShortElement(term3520, 1, (short) 12);
        setElement(term3519, 0, term3520);
        setIntElement(term3553, 0, 1638400);
        setIntElement(term3553, 1, 720907);
        setElement(term3519, 1, term3553);
        setElement(term3586, 0, term3587);
        setElement(term3586, 1, term3589);
        setElement(term3519, 2, term3586);
        setLongElement(term3591, 0, 34363745472L);
        setLongElement(term3591, 1, 34363745472L);
        setElement(term3519, 3, term3591);
        setElement(term3353, 4, term3519);
        setField(term3352, term3352.getClass(), "backtrace", term3353);
        setField(term3352, term3352.getClass(), "detailMessage", "MuLcgQHgqz");
        setField(term3352, term3352.getClass(), "cause", term3352);
        setField(term3352, term3352.getClass(), "stackTrace", term3636);
        setIntField(term3352, term3352.getClass(), "depth", 34);
        setIntField(term3638, term3638.getClass(), "modCount", 0);
        setField(term3352, term3352.getClass(), "suppressedExceptions", term3638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3352;
        try {
            callMethod(klass, "unwrapAndWrapException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


