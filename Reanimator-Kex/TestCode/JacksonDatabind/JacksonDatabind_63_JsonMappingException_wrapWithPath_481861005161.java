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

public class JsonMappingException_wrapWithPath_481861005161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278628;
     Object term285602;
     Object term285368;

    public JsonMappingException_wrapWithPath_481861005161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278628 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        term285602 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        setField(term285602, term285602.getClass(), "backtrace", null);
        setField(term285602, term285602.getClass(), "detailMessage", null);
        setField(term285602, term285602.getClass(), "cause", null);
        setField(term285602, term285602.getClass(), "stackTrace", null);
        setIntField(term285602, term285602.getClass(), "depth", 0);
        setField(term285602, term285602.getClass(), "suppressedExceptions", null);
        LinkedList term285369 = new LinkedList();
        ((LinkedList) term285369).add((Object)null);
        Class<? extends Object> term285441 = Class.forName((String) "java.lang.Module$1DummyModuleInfo");
        Class<? extends Object> term285448 = Class.forName((String) "java.util.stream.StreamOpFlag$Type");
        Class<? extends Object> term285452 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfInt");
        Class<? extends Object> term285455 = Class.forName((String) "java.lang.invoke.MethodHandleProxies$2");
        Class<? extends Object> term285459 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedCompleter");
        Class<? extends Object> term285463 = Class.forName((String) "java.util.TreeMap$AscendingSubMap");
        Class<? extends Object> term285469 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$Node");
        Class<? extends Object> term285474 = Class.forName((String) "java.io.FileFilter");
        Class<? extends Object> term285478 = Class.forName((String) "java.util.IdentityHashMap$ValueIterator");
        Class<? extends Object> term285482 = Class.forName((String) "java.util.zip.CheckedOutputStream");
        Class<? extends Object> term285486 = Class.forName((String) "java.nio.DirectDoubleBufferRS");
        Class<? extends Object> term285490 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferRB");
        Class<? extends Object> term285494 = Class.forName((String) "java.util.IdentityHashMap$Values");
        Class<? extends Object> term285497 = Class.forName((String) "java.lang.StringCoding$Result");
        Class<? extends Object> term285500 = Class.forName((String) "java.util.function.LongToDoubleFunction");
        Class<? extends Object> term285504 = Class.forName((String) "java.lang.Thread");
        Class<? extends Object> term285508 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfInt");
        Class<? extends Object> term285511 = Class.forName((String) "java.lang.invoke.ConstantGroup");
        Class<? extends Object> term285515 = Class.forName((String) "java.lang.invoke.VarHandleObjects$FieldInstanceReadOnly");
        term285368 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term285373 = (Object[]) newArray("java.lang.Object", 5);
        short[] term285374 = (short[]) newShortArray(32);
        int[] term285407 = (int[]) newIntArray(32);
        Object[] term285440 = (Object[]) newArray("java.lang.Object", 32);
        long[] term285519 = (long[]) newLongArray(32);
        Object term285363 = newInstance(Class.forName("java.lang.ReflectiveOperationException"));
        Object[] term285598 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term285600 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term285368, term285368.getClass(), "_path", term285369);
        setField(term285368, term285368.getClass(), "_processor", null);
        setField(term285368, term285368.getClass(), "_location", null);
        setShortElement(term285374, 0, (short) 20);
        setShortElement(term285374, 1, (short) 3);
        setShortElement(term285374, 5, (short) 27);
        setShortElement(term285374, 6, (short) 2);
        setShortElement(term285374, 7, (short) 3);
        setShortElement(term285374, 11, (short) 2);
        setShortElement(term285374, 12, (short) 4);
        setShortElement(term285374, 13, (short) 4);
        setShortElement(term285374, 14, (short) 3);
        setShortElement(term285374, 15, (short) 4);
        setShortElement(term285374, 16, (short) 4);
        setShortElement(term285374, 17, (short) 1);
        setShortElement(term285374, 18, (short) 2);
        setShortElement(term285374, 19, (short) 3);
        setShortElement(term285374, 20, (short) 3);
        setShortElement(term285374, 21, (short) 13);
        setShortElement(term285374, 22, (short) 1);
        setShortElement(term285374, 23, (short) 2);
        setShortElement(term285374, 24, (short) 12);
        setElement(term285373, 0, term285374);
        setIntElement(term285407, 0, 128385024);
        setIntElement(term285407, 2, 6553600);
        setIntElement(term285407, 3, 393216);
        setIntElement(term285407, 4, 3866630);
        setIntElement(term285407, 5, 1245184);
        setIntElement(term285407, 6, 3211264);
        setIntElement(term285407, 8, 6553600);
        setIntElement(term285407, 9, 393216);
        setIntElement(term285407, 10, 3866630);
        setIntElement(term285407, 11, 14352384);
        setIntElement(term285407, 12, 10354688);
        setIntElement(term285407, 13, 2883584);
        setIntElement(term285407, 14, 786432);
        setIntElement(term285407, 15, 1441792);
        setIntElement(term285407, 16, 7733248);
        setIntElement(term285407, 17, 20774912);
        setIntElement(term285407, 18, 262144);
        setIntElement(term285407, 19, 2555904);
        setIntElement(term285407, 20, 1835008);
        setIntElement(term285407, 21, 6029312);
        setIntElement(term285407, 22, 327680);
        setIntElement(term285407, 23, 1638400);
        setIntElement(term285407, 24, 720907);
        setElement(term285373, 1, term285407);
        setElement(term285440, 0, term285441);
        setElement(term285440, 1, term285448);
        setElement(term285440, 2, term285448);
        setElement(term285440, 3, term285452);
        setElement(term285440, 4, term285455);
        setElement(term285440, 5, term285459);
        setElement(term285440, 6, term285463);
        setElement(term285440, 7, term285448);
        setElement(term285440, 8, term285448);
        setElement(term285440, 9, term285452);
        setElement(term285440, 10, term285455);
        setElement(term285440, 11, term285469);
        setElement(term285440, 12, term285474);
        setElement(term285440, 13, term285478);
        setElement(term285440, 14, term285482);
        setElement(term285440, 15, term285486);
        setElement(term285440, 16, term285478);
        setElement(term285440, 17, term285490);
        setElement(term285440, 18, term285494);
        setElement(term285440, 19, term285497);
        setElement(term285440, 20, term285500);
        setElement(term285440, 21, term285504);
        setElement(term285440, 22, term285508);
        setElement(term285440, 23, term285511);
        setElement(term285440, 24, term285515);
        setElement(term285373, 2, term285440);
        setLongElement(term285519, 0, 132578328546864L);
        setLongElement(term285519, 1, 34364798256L);
        setLongElement(term285519, 2, 34363739368L);
        setLongElement(term285519, 3, 34363739368L);
        setLongElement(term285519, 4, 34363739368L);
        setLongElement(term285519, 5, 132578328998496L);
        setLongElement(term285519, 6, 34363820048L);
        setLongElement(term285519, 7, 34364798256L);
        setLongElement(term285519, 8, 34363739368L);
        setLongElement(term285519, 9, 34363739368L);
        setLongElement(term285519, 10, 34363739368L);
        setLongElement(term285519, 11, 132582552571296L);
        setLongElement(term285519, 12, 132582552640272L);
        setLongElement(term285519, 13, 132582550089488L);
        setLongElement(term285519, 14, 132582552759024L);
        setLongElement(term285519, 15, 132582550089488L);
        setLongElement(term285519, 16, 132582550089488L);
        setLongElement(term285519, 17, 34363745472L);
        setLongElement(term285519, 18, 34364710216L);
        setLongElement(term285519, 19, 34363745472L);
        setLongElement(term285519, 20, 34363745472L);
        setLongElement(term285519, 21, 34364896224L);
        setLongElement(term285519, 22, 34363745472L);
        setLongElement(term285519, 23, 34363745472L);
        setLongElement(term285519, 24, 34363745472L);
        setElement(term285373, 3, term285519);
        setField(term285368, term285368.getClass(), "backtrace", term285373);
        setField(term285368, term285368.getClass(), "detailMessage", "(was java.lang.ReflectiveOperationException)");
        setField(term285363, term285363.getClass(), "backtrace", null);
        setField(term285363, term285363.getClass(), "detailMessage", null);
        setField(term285363, term285363.getClass(), "cause", null);
        setField(term285363, term285363.getClass(), "stackTrace", null);
        setIntField(term285363, term285363.getClass(), "depth", 0);
        setField(term285363, term285363.getClass(), "suppressedExceptions", null);
        setField(term285368, term285368.getClass(), "cause", term285363);
        setField(term285368, term285368.getClass(), "stackTrace", term285598);
        setIntField(term285368, term285368.getClass(), "depth", 25);
        setIntField(term285600, term285600.getClass(), "modCount", 0);
        setField(term285368, term285368.getClass(), "suppressedExceptions", term285600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term278628;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term278628, term285602));
        assertTrue(recursiveEquals(retValue, term285368));
    }

};


