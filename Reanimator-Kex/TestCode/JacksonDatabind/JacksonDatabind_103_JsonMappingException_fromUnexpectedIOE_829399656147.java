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

public class JsonMappingException_fromUnexpectedIOE_829399656147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286661;
     Object term287047;
     Object term286683;

    public JsonMappingException_fromUnexpectedIOE_829399656147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286661 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term287047 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term287047, term287047.getClass(), "_path", null);
        setField(term287047, term287047.getClass(), "_processor", null);
        setField(term287047, term287047.getClass(), "_location", null);
        setField(term287047, term287047.getClass(), "backtrace", null);
        setField(term287047, term287047.getClass(), "detailMessage", null);
        setField(term287047, term287047.getClass(), "cause", null);
        setField(term287047, term287047.getClass(), "stackTrace", null);
        setIntField(term287047, term287047.getClass(), "depth", 0);
        setField(term287047, term287047.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term286752 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntConsumer");
        Class<? extends Object> term286759 = Class.forName((String) "java.util.concurrent.PriorityBlockingQueue$Itr");
        Class<? extends Object> term286762 = Class.forName((String) "java.util.stream.IntPipeline$5");
        Class<? extends Object> term286764 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfPrimitive");
        Class<? extends Object> term286768 = Class.forName((String) "java.lang.FdLibm$Pow");
        Class<? extends Object> term286772 = Class.forName((String) "java.util.concurrent.CompletableFuture$AsyncSupply");
        Class<? extends Object> term286778 = Class.forName((String) "java.io.SyncFailedException");
        Class<? extends Object> term286783 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecycler");
        Class<? extends Object> term286787 = Class.forName((String) "java.lang.System$Logger");
        Class<? extends Object> term286791 = Class.forName((String) "java.nio.file.attribute.PosixFileAttributeView");
        Class<? extends Object> term286795 = Class.forName((String) "java.util.concurrent.FutureTask");
        Class<? extends Object> term286799 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.RawSerializer");
        Class<? extends Object> term286803 = Class.forName((String) "java.util.concurrent.CompletableFuture$Timeout");
        Class<? extends Object> term286806 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$BindCaller");
        Class<? extends Object> term286809 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers");
        Class<? extends Object> term286813 = Class.forName((String) "java.util.ResourceBundle$SingleFormatControl");
        Class<? extends Object> term286816 = Class.forName((String) "java.util.regex.Pattern$Ques");
        Class<? extends Object> term286819 = Class.forName((String) "kex.java.util.ArrayList$Itr");
        Class<? extends Object> term286823 = Class.forName((String) "java.util.LinkedList$ListItr");
        term286683 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term286684 = (Object[]) newArray("java.lang.Object", 5);
        short[] term286685 = (short[]) newShortArray(32);
        int[] term286718 = (int[]) newIntArray(32);
        Object[] term286751 = (Object[]) newArray("java.lang.Object", 32);
        long[] term286827 = (long[]) newLongArray(32);
        Object[] term286951 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term286953 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term286683, term286683.getClass(), "_path", null);
        setField(term286683, term286683.getClass(), "_processor", null);
        setField(term286683, term286683.getClass(), "_location", null);
        setShortElement(term286685, 0, (short) 27);
        setShortElement(term286685, 1, (short) 3);
        setShortElement(term286685, 5, (short) 33);
        setShortElement(term286685, 6, (short) 2);
        setShortElement(term286685, 7, (short) 3);
        setShortElement(term286685, 11, (short) 2);
        setShortElement(term286685, 12, (short) 4);
        setShortElement(term286685, 13, (short) 4);
        setShortElement(term286685, 14, (short) 3);
        setShortElement(term286685, 15, (short) 4);
        setShortElement(term286685, 16, (short) 4);
        setShortElement(term286685, 17, (short) 1);
        setShortElement(term286685, 18, (short) 2);
        setShortElement(term286685, 19, (short) 3);
        setShortElement(term286685, 20, (short) 3);
        setShortElement(term286685, 21, (short) 13);
        setShortElement(term286685, 22, (short) 1);
        setShortElement(term286685, 23, (short) 2);
        setShortElement(term286685, 24, (short) 12);
        setElement(term286684, 0, term286685);
        setIntElement(term286718, 0, 57016320);
        setIntElement(term286718, 2, 6553600);
        setIntElement(term286718, 3, 393216);
        setIntElement(term286718, 4, 3866630);
        setIntElement(term286718, 5, 1245184);
        setIntElement(term286718, 6, 2424832);
        setIntElement(term286718, 8, 6553600);
        setIntElement(term286718, 9, 393216);
        setIntElement(term286718, 10, 3866630);
        setIntElement(term286718, 11, 14352384);
        setIntElement(term286718, 12, 10354688);
        setIntElement(term286718, 13, 2883584);
        setIntElement(term286718, 14, 786432);
        setIntElement(term286718, 15, 1441792);
        setIntElement(term286718, 16, 7733248);
        setIntElement(term286718, 17, 20774912);
        setIntElement(term286718, 18, 262144);
        setIntElement(term286718, 19, 2555904);
        setIntElement(term286718, 20, 1835008);
        setIntElement(term286718, 21, 6029312);
        setIntElement(term286718, 22, 327680);
        setIntElement(term286718, 23, 1638400);
        setIntElement(term286718, 24, 720907);
        setElement(term286684, 1, term286718);
        setElement(term286751, 0, term286752);
        setElement(term286751, 1, term286759);
        setElement(term286751, 2, term286759);
        setElement(term286751, 3, term286762);
        setElement(term286751, 4, term286764);
        setElement(term286751, 5, term286768);
        setElement(term286751, 6, term286772);
        setElement(term286751, 7, term286759);
        setElement(term286751, 8, term286759);
        setElement(term286751, 9, term286762);
        setElement(term286751, 10, term286764);
        setElement(term286751, 11, term286778);
        setElement(term286751, 12, term286783);
        setElement(term286751, 13, term286787);
        setElement(term286751, 14, term286791);
        setElement(term286751, 15, term286795);
        setElement(term286751, 16, term286787);
        setElement(term286751, 17, term286799);
        setElement(term286751, 18, term286803);
        setElement(term286751, 19, term286806);
        setElement(term286751, 20, term286809);
        setElement(term286751, 21, term286813);
        setElement(term286751, 22, term286816);
        setElement(term286751, 23, term286819);
        setElement(term286751, 24, term286823);
        setElement(term286684, 2, term286751);
        setLongElement(term286827, 0, 132073604125296L);
        setLongElement(term286827, 1, 34364798256L);
        setLongElement(term286827, 2, 34363739368L);
        setLongElement(term286827, 3, 34363739368L);
        setLongElement(term286827, 4, 34363739368L);
        setLongElement(term286827, 5, 132073603951184L);
        setLongElement(term286827, 6, 34363820048L);
        setLongElement(term286827, 7, 34364798256L);
        setLongElement(term286827, 8, 34363739368L);
        setLongElement(term286827, 9, 34363739368L);
        setLongElement(term286827, 10, 34363739368L);
        setLongElement(term286827, 11, 132077283560208L);
        setLongElement(term286827, 12, 132077283629184L);
        setLongElement(term286827, 13, 132077281112816L);
        setLongElement(term286827, 14, 132077283747392L);
        setLongElement(term286827, 15, 132077281112816L);
        setLongElement(term286827, 16, 132077281112816L);
        setLongElement(term286827, 17, 34363745472L);
        setLongElement(term286827, 18, 34364710216L);
        setLongElement(term286827, 19, 34363745472L);
        setLongElement(term286827, 20, 34363745472L);
        setLongElement(term286827, 21, 34364896224L);
        setLongElement(term286827, 22, 34363745472L);
        setLongElement(term286827, 23, 34363745472L);
        setLongElement(term286827, 24, 34363745472L);
        setElement(term286684, 3, term286827);
        setField(term286683, term286683.getClass(), "backtrace", term286684);
        setField(term286683, term286683.getClass(), "detailMessage", "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): N/A");
        setField(term286683, term286683.getClass(), "cause", term286683);
        setField(term286683, term286683.getClass(), "stackTrace", term286951);
        setIntField(term286683, term286683.getClass(), "depth", 25);
        setIntField(term286953, term286953.getClass(), "modCount", 0);
        setField(term286683, term286683.getClass(), "suppressedExceptions", term286953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term286661;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term286661, term287047));
        assertTrue(recursiveEquals(retValue, term286683));
    }

};


