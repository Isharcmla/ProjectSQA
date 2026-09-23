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

public class JsonMappingException_from_100138936038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69156;

    public JsonMappingException_from_100138936038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69225 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownTypeInstantiation");
        Class<? extends Object> term69232 = Class.forName((String) "java.util.Spliterators$LongIteratorSpliterator");
        Class<? extends Object> term69235 = Class.forName((String) "java.nio.DirectIntBufferU");
        Class<? extends Object> term69237 = Class.forName((String) "java.util.zip.CheckedInputStream");
        Class<? extends Object> term69241 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper");
        Class<? extends Object> term69245 = Class.forName((String) "java.util.stream.Collectors$1OptionalBox");
        Class<? extends Object> term69251 = Class.forName((String) "java.nio.channels.MembershipKey");
        Class<? extends Object> term69256 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableMap");
        Class<? extends Object> term69260 = Class.forName((String) "java.nio.channels.MembershipKey");
        Class<? extends Object> term69264 = Class.forName((String) "com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable");
        Class<? extends Object> term69268 = Class.forName((String) "com.fasterxml.jackson.core.TreeNode");
        Class<? extends Object> term69272 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonCreator");
        Class<? extends Object> term69276 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet");
        Class<? extends Object> term69279 = Class.forName((String) "java.util.Spliterator$OfPrimitive");
        Class<? extends Object> term69282 = Class.forName((String) "java.util.Observer");
        Class<? extends Object> term69285 = Class.forName((String) "java.nio.DirectIntBufferRS");
        Class<? extends Object> term69288 = Class.forName((String) "com.fasterxml.jackson.core.JsonFactory");
        Class<? extends Object> term69291 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$SearchKeysTask");
        Class<? extends Object> term69295 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo");
        term69156 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term69157 = (Object[]) newArray("java.lang.Object", 5);
        short[] term69158 = (short[]) newShortArray(32);
        int[] term69191 = (int[]) newIntArray(32);
        Object[] term69224 = (Object[]) newArray("java.lang.Object", 32);
        long[] term69299 = (long[]) newLongArray(32);
        Object[] term69420 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term69422 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term69156, term69156.getClass(), "_path", null);
        setField(term69156, term69156.getClass(), "_processor", null);
        setField(term69156, term69156.getClass(), "_location", null);
        setShortElement(term69158, 0, (short) 12);
        setShortElement(term69158, 1, (short) 3);
        setShortElement(term69158, 5, (short) 33);
        setShortElement(term69158, 6, (short) 2);
        setShortElement(term69158, 7, (short) 3);
        setShortElement(term69158, 11, (short) 2);
        setShortElement(term69158, 12, (short) 4);
        setShortElement(term69158, 13, (short) 4);
        setShortElement(term69158, 14, (short) 3);
        setShortElement(term69158, 15, (short) 4);
        setShortElement(term69158, 16, (short) 4);
        setShortElement(term69158, 17, (short) 1);
        setShortElement(term69158, 18, (short) 2);
        setShortElement(term69158, 19, (short) 3);
        setShortElement(term69158, 20, (short) 3);
        setShortElement(term69158, 21, (short) 13);
        setShortElement(term69158, 22, (short) 1);
        setShortElement(term69158, 23, (short) 2);
        setShortElement(term69158, 24, (short) 12);
        setElement(term69157, 0, term69158);
        setIntElement(term69191, 0, 13303808);
        setIntElement(term69191, 2, 6553600);
        setIntElement(term69191, 3, 393216);
        setIntElement(term69191, 4, 3866630);
        setIntElement(term69191, 5, 1245184);
        setIntElement(term69191, 6, 3080192);
        setIntElement(term69191, 8, 6553600);
        setIntElement(term69191, 9, 393216);
        setIntElement(term69191, 10, 3866630);
        setIntElement(term69191, 11, 14352384);
        setIntElement(term69191, 12, 10354688);
        setIntElement(term69191, 13, 2883584);
        setIntElement(term69191, 14, 786432);
        setIntElement(term69191, 15, 1441792);
        setIntElement(term69191, 16, 7733248);
        setIntElement(term69191, 17, 20774912);
        setIntElement(term69191, 18, 262144);
        setIntElement(term69191, 19, 2555904);
        setIntElement(term69191, 20, 1835008);
        setIntElement(term69191, 21, 6029312);
        setIntElement(term69191, 22, 327680);
        setIntElement(term69191, 23, 1638400);
        setIntElement(term69191, 24, 720907);
        setElement(term69157, 1, term69191);
        setElement(term69224, 0, term69225);
        setElement(term69224, 1, term69232);
        setElement(term69224, 2, term69232);
        setElement(term69224, 3, term69235);
        setElement(term69224, 4, term69237);
        setElement(term69224, 5, term69241);
        setElement(term69224, 6, term69245);
        setElement(term69224, 7, term69232);
        setElement(term69224, 8, term69232);
        setElement(term69224, 9, term69235);
        setElement(term69224, 10, term69237);
        setElement(term69224, 11, term69251);
        setElement(term69224, 12, term69256);
        setElement(term69224, 13, term69260);
        setElement(term69224, 14, term69264);
        setElement(term69224, 15, term69268);
        setElement(term69224, 16, term69260);
        setElement(term69224, 17, term69272);
        setElement(term69224, 18, term69276);
        setElement(term69224, 19, term69279);
        setElement(term69224, 20, term69282);
        setElement(term69224, 21, term69285);
        setElement(term69224, 22, term69288);
        setElement(term69224, 23, term69291);
        setElement(term69224, 24, term69295);
        setElement(term69157, 2, term69224);
        setLongElement(term69299, 0, 34363800864L);
        setLongElement(term69299, 1, 34364798256L);
        setLongElement(term69299, 2, 34363739368L);
        setLongElement(term69299, 3, 34363739368L);
        setLongElement(term69299, 4, 34363739368L);
        setLongElement(term69299, 5, 132073603951184L);
        setLongElement(term69299, 6, 34363820048L);
        setLongElement(term69299, 7, 34364798256L);
        setLongElement(term69299, 8, 34363739368L);
        setLongElement(term69299, 9, 34363739368L);
        setLongElement(term69299, 10, 34363739368L);
        setLongElement(term69299, 11, 132077283560208L);
        setLongElement(term69299, 12, 132077283629184L);
        setLongElement(term69299, 13, 132077281112816L);
        setLongElement(term69299, 14, 132077283747392L);
        setLongElement(term69299, 15, 132077281112816L);
        setLongElement(term69299, 16, 132077281112816L);
        setLongElement(term69299, 17, 34363745472L);
        setLongElement(term69299, 18, 34364710216L);
        setLongElement(term69299, 19, 34363745472L);
        setLongElement(term69299, 20, 34363745472L);
        setLongElement(term69299, 21, 34364896224L);
        setLongElement(term69299, 22, 34363745472L);
        setLongElement(term69299, 23, 34363745472L);
        setLongElement(term69299, 24, 34363745472L);
        setElement(term69157, 3, term69299);
        setField(term69156, term69156.getClass(), "backtrace", term69157);
        setField(term69156, term69156.getClass(), "detailMessage", "NRdvgJlhkX");
        setField(term69156, term69156.getClass(), "cause", term69156);
        setField(term69156, term69156.getClass(), "stackTrace", term69420);
        setIntField(term69156, term69156.getClass(), "depth", 25);
        setIntField(term69422, term69422.getClass(), "modCount", 0);
        setField(term69156, term69156.getClass(), "suppressedExceptions", term69422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term69156));
    }

};


