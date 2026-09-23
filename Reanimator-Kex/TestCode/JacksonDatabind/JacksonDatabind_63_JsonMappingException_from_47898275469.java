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

public class JsonMappingException_from_47898275469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154391;

    public JsonMappingException_from_47898275469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154460 = Class.forName((String) "java.util.stream.WhileOps$3Op");
        Class<? extends Object> term154467 = Class.forName((String) "java.util.stream.IntPipeline$5$1");
        Class<? extends Object> term154471 = Class.forName((String) "java.nio.channels.MembershipKey");
        Class<? extends Object> term154474 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        Class<? extends Object> term154478 = Class.forName((String) "java.nio.file.attribute.PosixFileAttributeView");
        Class<? extends Object> term154482 = Class.forName((String) "java.util.concurrent.atomic.DoubleAdder$SerializationProxy");
        Class<? extends Object> term154488 = Class.forName((String) "java.util.stream.ReduceOps$8ReducingSink");
        Class<? extends Object> term154493 = Class.forName((String) "java.util.stream.SliceOps");
        Class<? extends Object> term154497 = Class.forName((String) "kex.java.lang.StringBuilder");
        Class<? extends Object> term154501 = Class.forName((String) "java.util.OptionalDouble");
        Class<? extends Object> term154505 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfRef");
        Class<? extends Object> term154509 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        Class<? extends Object> term154513 = Class.forName((String) "java.util.Collections$CheckedCollection$1");
        Class<? extends Object> term154516 = Class.forName((String) "java.lang.ProcessEnvironment$StringKeySet");
        Class<? extends Object> term154519 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom");
        Class<? extends Object> term154523 = Class.forName((String) "java.nio.file.FileTreeWalker$1");
        Class<? extends Object> term154527 = Class.forName((String) "java.io.File$TempDirectory");
        Class<? extends Object> term154530 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer");
        Class<? extends Object> term154534 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySet");
        term154391 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term154392 = (Object[]) newArray("java.lang.Object", 5);
        short[] term154393 = (short[]) newShortArray(32);
        int[] term154426 = (int[]) newIntArray(32);
        Object[] term154459 = (Object[]) newArray("java.lang.Object", 32);
        long[] term154538 = (long[]) newLongArray(32);
        Object[] term154573 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term154575 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term154391, term154391.getClass(), "_path", null);
        setField(term154391, term154391.getClass(), "_processor", null);
        setField(term154391, term154391.getClass(), "_location", null);
        setShortElement(term154393, 0, (short) 15);
        setShortElement(term154393, 1, (short) 3);
        setShortElement(term154393, 5, (short) 27);
        setShortElement(term154393, 6, (short) 2);
        setShortElement(term154393, 7, (short) 3);
        setShortElement(term154393, 11, (short) 2);
        setShortElement(term154393, 12, (short) 4);
        setShortElement(term154393, 13, (short) 4);
        setShortElement(term154393, 14, (short) 3);
        setShortElement(term154393, 15, (short) 4);
        setShortElement(term154393, 16, (short) 4);
        setShortElement(term154393, 17, (short) 1);
        setShortElement(term154393, 18, (short) 2);
        setShortElement(term154393, 19, (short) 3);
        setShortElement(term154393, 20, (short) 3);
        setShortElement(term154393, 21, (short) 13);
        setShortElement(term154393, 22, (short) 1);
        setShortElement(term154393, 23, (short) 2);
        setShortElement(term154393, 24, (short) 12);
        setElement(term154392, 0, term154393);
        setIntElement(term154426, 0, 16449536);
        setIntElement(term154426, 2, 6553600);
        setIntElement(term154426, 3, 393216);
        setIntElement(term154426, 4, 3866630);
        setIntElement(term154426, 5, 1245184);
        setIntElement(term154426, 6, 3866624);
        setIntElement(term154426, 8, 6553600);
        setIntElement(term154426, 9, 393216);
        setIntElement(term154426, 10, 3866630);
        setIntElement(term154426, 11, 14352384);
        setIntElement(term154426, 12, 10354688);
        setIntElement(term154426, 13, 2883584);
        setIntElement(term154426, 14, 786432);
        setIntElement(term154426, 15, 1441792);
        setIntElement(term154426, 16, 7733248);
        setIntElement(term154426, 17, 20774912);
        setIntElement(term154426, 18, 262144);
        setIntElement(term154426, 19, 2555904);
        setIntElement(term154426, 20, 1835008);
        setIntElement(term154426, 21, 6029312);
        setIntElement(term154426, 22, 327680);
        setIntElement(term154426, 23, 1638400);
        setIntElement(term154426, 24, 720907);
        setElement(term154392, 1, term154426);
        setElement(term154459, 0, term154460);
        setElement(term154459, 1, term154467);
        setElement(term154459, 2, term154467);
        setElement(term154459, 3, term154471);
        setElement(term154459, 4, term154474);
        setElement(term154459, 5, term154478);
        setElement(term154459, 6, term154482);
        setElement(term154459, 7, term154467);
        setElement(term154459, 8, term154467);
        setElement(term154459, 9, term154471);
        setElement(term154459, 10, term154474);
        setElement(term154459, 11, term154488);
        setElement(term154459, 12, term154493);
        setElement(term154459, 13, term154497);
        setElement(term154459, 14, term154501);
        setElement(term154459, 15, term154505);
        setElement(term154459, 16, term154497);
        setElement(term154459, 17, term154509);
        setElement(term154459, 18, term154513);
        setElement(term154459, 19, term154516);
        setElement(term154459, 20, term154519);
        setElement(term154459, 21, term154523);
        setElement(term154459, 22, term154527);
        setElement(term154459, 23, term154530);
        setElement(term154459, 24, term154534);
        setElement(term154392, 2, term154459);
        setLongElement(term154538, 0, 34363800864L);
        setLongElement(term154538, 1, 34364798256L);
        setLongElement(term154538, 2, 34363739368L);
        setLongElement(term154538, 3, 34363739368L);
        setLongElement(term154538, 4, 34363739368L);
        setLongElement(term154538, 5, 132578328998496L);
        setLongElement(term154538, 6, 34363820048L);
        setLongElement(term154538, 7, 34364798256L);
        setLongElement(term154538, 8, 34363739368L);
        setLongElement(term154538, 9, 34363739368L);
        setLongElement(term154538, 10, 34363739368L);
        setLongElement(term154538, 11, 132582552571296L);
        setLongElement(term154538, 12, 132582552640272L);
        setLongElement(term154538, 13, 132582550089488L);
        setLongElement(term154538, 14, 132582552759024L);
        setLongElement(term154538, 15, 132582550089488L);
        setLongElement(term154538, 16, 132582550089488L);
        setLongElement(term154538, 17, 34363745472L);
        setLongElement(term154538, 18, 34364710216L);
        setLongElement(term154538, 19, 34363745472L);
        setLongElement(term154538, 20, 34363745472L);
        setLongElement(term154538, 21, 34364896224L);
        setLongElement(term154538, 22, 34363745472L);
        setLongElement(term154538, 23, 34363745472L);
        setLongElement(term154538, 24, 34363745472L);
        setElement(term154392, 3, term154538);
        setField(term154391, term154391.getClass(), "backtrace", term154392);
        setField(term154391, term154391.getClass(), "detailMessage", "");
        setField(term154391, term154391.getClass(), "cause", term154391);
        setField(term154391, term154391.getClass(), "stackTrace", term154573);
        setIntField(term154391, term154391.getClass(), "depth", 25);
        setIntField(term154575, term154575.getClass(), "modCount", 0);
        setField(term154391, term154391.getClass(), "suppressedExceptions", term154575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term154391));
    }

};


