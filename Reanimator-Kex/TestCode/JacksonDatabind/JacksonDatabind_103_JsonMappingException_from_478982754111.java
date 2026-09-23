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

public class JsonMappingException_from_478982754111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231388;

    public JsonMappingException_from_478982754111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term231457 = Class.forName((String) "java.util.regex.Pattern$BehindS");
        Class<? extends Object> term231464 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter");
        Class<? extends Object> term231467 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedDeque$CLDSpliterator");
        Class<? extends Object> term231469 = Class.forName((String) "java.util.regex.Pattern$BnM");
        Class<? extends Object> term231473 = Class.forName((String) "com.fasterxml.jackson.core.io.JsonStringEncoder");
        Class<? extends Object> term231477 = Class.forName((String) "java.util.stream.MatchOps$MatchTask");
        Class<? extends Object> term231483 = Class.forName((String) "java.util.IdentityHashMap$EntryIterator");
        Class<? extends Object> term231488 = Class.forName((String) "java.util.Observer");
        Class<? extends Object> term231492 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ToStringSerializer");
        Class<? extends Object> term231496 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<? extends Object> term231500 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name");
        Class<? extends Object> term231504 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$KeySetView");
        Class<? extends Object> term231508 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term231511 = Class.forName((String) "java.lang.Module$ReflectionData");
        Class<? extends Object> term231514 = Class.forName((String) "java.lang.invoke.LambdaFormEditor");
        Class<? extends Object> term231518 = Class.forName((String) "java.util.LinkedHashMap");
        Class<? extends Object> term231521 = Class.forName((String) "java.util.concurrent.ConcurrentLinkedQueue$Node");
        Class<? extends Object> term231524 = Class.forName((String) "java.io.BufferedOutputStream");
        Class<? extends Object> term231528 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownTypeInstantiation");
        term231388 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term231389 = (Object[]) newArray("java.lang.Object", 5);
        short[] term231390 = (short[]) newShortArray(32);
        int[] term231423 = (int[]) newIntArray(32);
        Object[] term231456 = (Object[]) newArray("java.lang.Object", 32);
        long[] term231532 = (long[]) newLongArray(32);
        Object[] term231567 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term231569 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term231388, term231388.getClass(), "_path", null);
        setField(term231388, term231388.getClass(), "_processor", null);
        setField(term231388, term231388.getClass(), "_location", null);
        setShortElement(term231390, 0, (short) 15);
        setShortElement(term231390, 1, (short) 3);
        setShortElement(term231390, 5, (short) 33);
        setShortElement(term231390, 6, (short) 2);
        setShortElement(term231390, 7, (short) 3);
        setShortElement(term231390, 11, (short) 2);
        setShortElement(term231390, 12, (short) 4);
        setShortElement(term231390, 13, (short) 4);
        setShortElement(term231390, 14, (short) 3);
        setShortElement(term231390, 15, (short) 4);
        setShortElement(term231390, 16, (short) 4);
        setShortElement(term231390, 17, (short) 1);
        setShortElement(term231390, 18, (short) 2);
        setShortElement(term231390, 19, (short) 3);
        setShortElement(term231390, 20, (short) 3);
        setShortElement(term231390, 21, (short) 13);
        setShortElement(term231390, 22, (short) 1);
        setShortElement(term231390, 23, (short) 2);
        setShortElement(term231390, 24, (short) 12);
        setElement(term231389, 0, term231390);
        setIntElement(term231423, 0, 16449536);
        setIntElement(term231423, 2, 6553600);
        setIntElement(term231423, 3, 393216);
        setIntElement(term231423, 4, 3866630);
        setIntElement(term231423, 5, 1245184);
        setIntElement(term231423, 6, 3866624);
        setIntElement(term231423, 8, 6553600);
        setIntElement(term231423, 9, 393216);
        setIntElement(term231423, 10, 3866630);
        setIntElement(term231423, 11, 14352384);
        setIntElement(term231423, 12, 10354688);
        setIntElement(term231423, 13, 2883584);
        setIntElement(term231423, 14, 786432);
        setIntElement(term231423, 15, 1441792);
        setIntElement(term231423, 16, 7733248);
        setIntElement(term231423, 17, 20774912);
        setIntElement(term231423, 18, 262144);
        setIntElement(term231423, 19, 2555904);
        setIntElement(term231423, 20, 1835008);
        setIntElement(term231423, 21, 6029312);
        setIntElement(term231423, 22, 327680);
        setIntElement(term231423, 23, 1638400);
        setIntElement(term231423, 24, 720907);
        setElement(term231389, 1, term231423);
        setElement(term231456, 0, term231457);
        setElement(term231456, 1, term231464);
        setElement(term231456, 2, term231464);
        setElement(term231456, 3, term231467);
        setElement(term231456, 4, term231469);
        setElement(term231456, 5, term231473);
        setElement(term231456, 6, term231477);
        setElement(term231456, 7, term231464);
        setElement(term231456, 8, term231464);
        setElement(term231456, 9, term231467);
        setElement(term231456, 10, term231469);
        setElement(term231456, 11, term231483);
        setElement(term231456, 12, term231488);
        setElement(term231456, 13, term231492);
        setElement(term231456, 14, term231496);
        setElement(term231456, 15, term231500);
        setElement(term231456, 16, term231492);
        setElement(term231456, 17, term231504);
        setElement(term231456, 18, term231508);
        setElement(term231456, 19, term231511);
        setElement(term231456, 20, term231514);
        setElement(term231456, 21, term231518);
        setElement(term231456, 22, term231521);
        setElement(term231456, 23, term231524);
        setElement(term231456, 24, term231528);
        setElement(term231389, 2, term231456);
        setLongElement(term231532, 0, 34363800864L);
        setLongElement(term231532, 1, 34364798256L);
        setLongElement(term231532, 2, 34363739368L);
        setLongElement(term231532, 3, 34363739368L);
        setLongElement(term231532, 4, 34363739368L);
        setLongElement(term231532, 5, 132073603951184L);
        setLongElement(term231532, 6, 34363820048L);
        setLongElement(term231532, 7, 34364798256L);
        setLongElement(term231532, 8, 34363739368L);
        setLongElement(term231532, 9, 34363739368L);
        setLongElement(term231532, 10, 34363739368L);
        setLongElement(term231532, 11, 132077283560208L);
        setLongElement(term231532, 12, 132077283629184L);
        setLongElement(term231532, 13, 132077281112816L);
        setLongElement(term231532, 14, 132077283747392L);
        setLongElement(term231532, 15, 132077281112816L);
        setLongElement(term231532, 16, 132077281112816L);
        setLongElement(term231532, 17, 34363745472L);
        setLongElement(term231532, 18, 34364710216L);
        setLongElement(term231532, 19, 34363745472L);
        setLongElement(term231532, 20, 34363745472L);
        setLongElement(term231532, 21, 34364896224L);
        setLongElement(term231532, 22, 34363745472L);
        setLongElement(term231532, 23, 34363745472L);
        setLongElement(term231532, 24, 34363745472L);
        setElement(term231389, 3, term231532);
        setField(term231388, term231388.getClass(), "backtrace", term231389);
        setField(term231388, term231388.getClass(), "detailMessage", "");
        setField(term231388, term231388.getClass(), "cause", term231388);
        setField(term231388, term231388.getClass(), "stackTrace", term231567);
        setIntField(term231388, term231388.getClass(), "depth", 25);
        setIntField(term231569, term231569.getClass(), "modCount", 0);
        setField(term231388, term231388.getClass(), "suppressedExceptions", term231569);
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
        assertTrue(recursiveEquals(retValue, term231388));
    }

};


