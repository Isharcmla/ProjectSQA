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

public class JsonMappingException_wrapWithPath_481861005226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366835;
     Object term367300;
     Object term367085;

    public JsonMappingException_wrapWithPath_481861005226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366835 = newInstance(Class.forName("java.lang.Throwable"));
        term367300 = newInstance(Class.forName("java.lang.Throwable"));
        setField(term367300, term367300.getClass(), "backtrace", null);
        setField(term367300, term367300.getClass(), "detailMessage", null);
        setField(term367300, term367300.getClass(), "cause", null);
        setField(term367300, term367300.getClass(), "stackTrace", null);
        setIntField(term367300, term367300.getClass(), "depth", 0);
        setField(term367300, term367300.getClass(), "suppressedExceptions", null);
        LinkedList term367086 = new LinkedList();
        ((LinkedList) term367086).add((Object)null);
        Class<? extends Object> term367158 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer");
        Class<? extends Object> term367165 = Class.forName((String) "java.util.HashMap$EntrySet");
        Class<? extends Object> term367169 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$Index");
        Class<? extends Object> term367172 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializer$BeanReferring");
        Class<? extends Object> term367176 = Class.forName((String) "java.util.zip.Inflater$InflaterZStreamRef");
        Class<? extends Object> term367180 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default");
        Class<? extends Object> term367186 = Class.forName((String) "java.io.NotActiveException");
        Class<? extends Object> term367191 = Class.forName((String) "java.lang.invoke.ClassSpecializer$Factory");
        Class<? extends Object> term367195 = Class.forName((String) "java.nio.file.FileSystemNotFoundException");
        Class<? extends Object> term367199 = Class.forName((String) "java.io.ObjectOutputStream$1");
        Class<? extends Object> term367203 = Class.forName((String) "java.util.Collections$SynchronizedSet");
        Class<? extends Object> term367207 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat");
        Class<? extends Object> term367211 = Class.forName((String) "java.nio.file.StandardWatchEventKinds$StdWatchEventKind");
        Class<? extends Object> term367214 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer");
        Class<? extends Object> term367217 = Class.forName((String) "java.math.MathContext");
        Class<? extends Object> term367221 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer");
        Class<? extends Object> term367225 = Class.forName((String) "java.nio.file.attribute.DosFileAttributeView");
        Class<? extends Object> term367228 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializer");
        Class<? extends Object> term367232 = Class.forName((String) "java.lang.StackStreamFactory$FrameBuffer");
        term367085 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term367090 = (Object[]) newArray("java.lang.Object", 5);
        short[] term367091 = (short[]) newShortArray(32);
        int[] term367124 = (int[]) newIntArray(32);
        Object[] term367157 = (Object[]) newArray("java.lang.Object", 32);
        long[] term367236 = (long[]) newLongArray(32);
        Object term367080 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term367296 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term367298 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term367085, term367085.getClass(), "_path", term367086);
        setField(term367085, term367085.getClass(), "_processor", null);
        setField(term367085, term367085.getClass(), "_location", null);
        setShortElement(term367091, 0, (short) 20);
        setShortElement(term367091, 1, (short) 3);
        setShortElement(term367091, 5, (short) 27);
        setShortElement(term367091, 6, (short) 2);
        setShortElement(term367091, 7, (short) 3);
        setShortElement(term367091, 11, (short) 2);
        setShortElement(term367091, 12, (short) 4);
        setShortElement(term367091, 13, (short) 4);
        setShortElement(term367091, 14, (short) 3);
        setShortElement(term367091, 15, (short) 4);
        setShortElement(term367091, 16, (short) 4);
        setShortElement(term367091, 17, (short) 1);
        setShortElement(term367091, 18, (short) 2);
        setShortElement(term367091, 19, (short) 3);
        setShortElement(term367091, 20, (short) 3);
        setShortElement(term367091, 21, (short) 13);
        setShortElement(term367091, 22, (short) 1);
        setShortElement(term367091, 23, (short) 2);
        setShortElement(term367091, 24, (short) 12);
        setElement(term367090, 0, term367091);
        setIntElement(term367124, 0, 128385024);
        setIntElement(term367124, 2, 6553600);
        setIntElement(term367124, 3, 393216);
        setIntElement(term367124, 4, 3866630);
        setIntElement(term367124, 5, 1245184);
        setIntElement(term367124, 6, 3211264);
        setIntElement(term367124, 8, 6553600);
        setIntElement(term367124, 9, 393216);
        setIntElement(term367124, 10, 3866630);
        setIntElement(term367124, 11, 14352384);
        setIntElement(term367124, 12, 10354688);
        setIntElement(term367124, 13, 2883584);
        setIntElement(term367124, 14, 786432);
        setIntElement(term367124, 15, 1441792);
        setIntElement(term367124, 16, 7733248);
        setIntElement(term367124, 17, 20774912);
        setIntElement(term367124, 18, 262144);
        setIntElement(term367124, 19, 2555904);
        setIntElement(term367124, 20, 1835008);
        setIntElement(term367124, 21, 6029312);
        setIntElement(term367124, 22, 327680);
        setIntElement(term367124, 23, 1638400);
        setIntElement(term367124, 24, 720907);
        setElement(term367090, 1, term367124);
        setElement(term367157, 0, term367158);
        setElement(term367157, 1, term367165);
        setElement(term367157, 2, term367165);
        setElement(term367157, 3, term367169);
        setElement(term367157, 4, term367172);
        setElement(term367157, 5, term367176);
        setElement(term367157, 6, term367180);
        setElement(term367157, 7, term367165);
        setElement(term367157, 8, term367165);
        setElement(term367157, 9, term367169);
        setElement(term367157, 10, term367172);
        setElement(term367157, 11, term367186);
        setElement(term367157, 12, term367191);
        setElement(term367157, 13, term367195);
        setElement(term367157, 14, term367199);
        setElement(term367157, 15, term367203);
        setElement(term367157, 16, term367195);
        setElement(term367157, 17, term367207);
        setElement(term367157, 18, term367211);
        setElement(term367157, 19, term367214);
        setElement(term367157, 20, term367217);
        setElement(term367157, 21, term367221);
        setElement(term367157, 22, term367225);
        setElement(term367157, 23, term367228);
        setElement(term367157, 24, term367232);
        setElement(term367090, 2, term367157);
        setLongElement(term367236, 0, 132578328546864L);
        setLongElement(term367236, 1, 34364798256L);
        setLongElement(term367236, 2, 34363739368L);
        setLongElement(term367236, 3, 34363739368L);
        setLongElement(term367236, 4, 34363739368L);
        setLongElement(term367236, 5, 132578328998496L);
        setLongElement(term367236, 6, 34363820048L);
        setLongElement(term367236, 7, 34364798256L);
        setLongElement(term367236, 8, 34363739368L);
        setLongElement(term367236, 9, 34363739368L);
        setLongElement(term367236, 10, 34363739368L);
        setLongElement(term367236, 11, 132582552571296L);
        setLongElement(term367236, 12, 132582552640272L);
        setLongElement(term367236, 13, 132582550089488L);
        setLongElement(term367236, 14, 132582552759024L);
        setLongElement(term367236, 15, 132582550089488L);
        setLongElement(term367236, 16, 132582550089488L);
        setLongElement(term367236, 17, 34363745472L);
        setLongElement(term367236, 18, 34364710216L);
        setLongElement(term367236, 19, 34363745472L);
        setLongElement(term367236, 20, 34363745472L);
        setLongElement(term367236, 21, 34364896224L);
        setLongElement(term367236, 22, 34363745472L);
        setLongElement(term367236, 23, 34363745472L);
        setLongElement(term367236, 24, 34363745472L);
        setElement(term367090, 3, term367236);
        setField(term367085, term367085.getClass(), "backtrace", term367090);
        setField(term367085, term367085.getClass(), "detailMessage", "(was java.lang.Throwable)");
        setField(term367080, term367080.getClass(), "backtrace", null);
        setField(term367080, term367080.getClass(), "detailMessage", null);
        setField(term367080, term367080.getClass(), "cause", null);
        setField(term367080, term367080.getClass(), "stackTrace", null);
        setIntField(term367080, term367080.getClass(), "depth", 0);
        setField(term367080, term367080.getClass(), "suppressedExceptions", null);
        setField(term367085, term367085.getClass(), "cause", term367080);
        setField(term367085, term367085.getClass(), "stackTrace", term367296);
        setIntField(term367085, term367085.getClass(), "depth", 25);
        setIntField(term367298, term367298.getClass(), "modCount", 0);
        setField(term367085, term367085.getClass(), "suppressedExceptions", term367298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term366835;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term366835, term367300));
        assertTrue(recursiveEquals(retValue, term367085));
    }

};


