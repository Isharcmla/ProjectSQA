package com.fasterxml.jackson.dataformat.xml.ser;

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
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class XmlSerializerProvider_wrapAsIOE_171612328525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public XmlSerializerProvider_wrapAsIOE_171612328525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor$Base");
        Class<? extends Object> term209 = Class.forName((String) "java.util.stream.LongPipeline$2");
        Class<? extends Object> term211 = Class.forName((String) "java.lang.ref.Finalizer$1");
        Class<? extends Object> term215 = Class.forName((String) "java.util.HashMap$KeySet");
        Class<? extends Object> term220 = Class.forName((String) "com.fasterxml.jackson.databind.ext.DOMDeserializer");
        Class<? extends Object> term224 = Class.forName((String) "java.nio.DirectByteBuffer$Deallocator");
        Class<? extends Object> term228 = Class.forName((String) "java.util.TreeMap$DescendingKeySpliterator");
        Class<? extends Object> term232 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueIterator");
        Class<? extends Object> term236 = Class.forName((String) "org.codehaus.stax2.ri.typed.ValueDecoderFactory$DoubleArrayDecoder");
        Class<? extends Object> term240 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver");
        Class<? extends Object> term244 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        Class<? extends Object> term248 = Class.forName((String) "org.codehaus.stax2.ri.evt.AttributeEventImpl");
        Class<? extends Object> term252 = Class.forName((String) "java.util.jar.JarVerifier$3");
        Class<? extends Object> term256 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic");
        Class<? extends Object> term259 = Class.forName((String) "java.util.concurrent.PriorityBlockingQueue");
        Class<? extends Object> term262 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonProperty");
        Class<? extends Object> term265 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceEntriesToLongTask");
        Class<? extends Object> term268 = Class.forName((String) "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate");
        Class<? extends Object> term372 = Class.forName((String) "java.nio.HeapCharBufferR");
        Class<? extends Object> term374 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$1");
        term137 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term138 = (Object[]) newArray("java.lang.Object", 5);
        short[] term139 = (short[]) newShortArray(32);
        int[] term172 = (int[]) newIntArray(32);
        Object[] term205 = (Object[]) newArray("java.lang.Object", 32);
        long[] term271 = (long[]) newLongArray(32);
        Object[] term304 = (Object[]) newArray("java.lang.Object", 5);
        short[] term305 = (short[]) newShortArray(32);
        int[] term338 = (int[]) newIntArray(32);
        Object[] term371 = (Object[]) newArray("java.lang.Object", 32);
        long[] term376 = (long[]) newLongArray(32);
        Object[] term421 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term423 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term139, 0, (short) 1);
        setShortElement(term139, 1, (short) 2);
        setShortElement(term139, 2, (short) 1);
        setShortElement(term139, 3, (short) 7);
        setShortElement(term139, 4, (short) 2);
        setShortElement(term139, 5, (short) 1);
        setShortElement(term139, 6, (short) 6);
        setShortElement(term139, 7, (short) 2);
        setShortElement(term139, 8, (short) 10);
        setShortElement(term139, 9, (short) 11);
        setShortElement(term139, 10, (short) 29);
        setShortElement(term139, 11, (short) 5);
        setShortElement(term139, 12, (short) 4);
        setShortElement(term139, 13, (short) 5);
        setShortElement(term139, 14, (short) 6);
        setShortElement(term139, 15, (short) 7);
        setShortElement(term139, 16, (short) 10);
        setShortElement(term139, 17, (short) 11);
        setShortElement(term139, 18, (short) 12);
        setShortElement(term139, 19, (short) 4);
        setShortElement(term139, 20, (short) 1);
        setShortElement(term139, 23, (short) 3);
        setShortElement(term139, 24, (short) 4);
        setShortElement(term139, 25, (short) 9);
        setShortElement(term139, 26, (short) 1);
        setShortElement(term139, 27, (short) 2);
        setShortElement(term139, 28, (short) 3);
        setShortElement(term139, 29, (short) 3);
        setShortElement(term139, 30, (short) 13);
        setShortElement(term139, 31, (short) 1);
        setElement(term138, 0, term139);
        setIntElement(term172, 1, 5570560);
        setIntElement(term172, 2, 327680);
        setIntElement(term172, 3, 4456454);
        setIntElement(term172, 4, 1769472);
        setIntElement(term172, 5, 14876672);
        setIntElement(term172, 6, 6225920);
        setIntElement(term172, 7, 917504);
        setIntElement(term172, 8, 327680);
        setIntElement(term172, 9, 8519680);
        setIntElement(term172, 10, 917504);
        setIntElement(term172, 11, 11993088);
        setIntElement(term172, 12, 655360);
        setIntElement(term172, 13, 7864320);
        setIntElement(term172, 14, 3735552);
        setIntElement(term172, 15, 7143424);
        setIntElement(term172, 16, 8454144);
        setIntElement(term172, 17, 9240576);
        setIntElement(term172, 18, 196608);
        setIntElement(term172, 19, 3801088);
        setIntElement(term172, 20, 786432);
        setIntElement(term172, 21, 589824);
        setIntElement(term172, 22, 17170432);
        setIntElement(term172, 23, 1376256);
        setIntElement(term172, 24, 5242880);
        setIntElement(term172, 25, 2883584);
        setIntElement(term172, 26, 20774912);
        setIntElement(term172, 27, 262144);
        setIntElement(term172, 28, 2555904);
        setIntElement(term172, 29, 1835008);
        setIntElement(term172, 30, 6029312);
        setIntElement(term172, 31, 327680);
        setElement(term138, 1, term172);
        setElement(term205, 0, term206);
        setElement(term205, 1, term206);
        setElement(term205, 2, term209);
        setElement(term205, 3, term211);
        setElement(term205, 4, term215);
        setElement(term205, 5, term215);
        setElement(term205, 6, term220);
        setElement(term205, 7, term220);
        setElement(term205, 8, term224);
        setElement(term205, 9, term224);
        setElement(term205, 10, term224);
        setElement(term205, 11, term224);
        setElement(term205, 12, term224);
        setElement(term205, 13, term228);
        setElement(term205, 14, term228);
        setElement(term205, 15, term232);
        setElement(term205, 16, term232);
        setElement(term205, 17, term232);
        setElement(term205, 18, term232);
        setElement(term205, 19, term236);
        setElement(term205, 20, term236);
        setElement(term205, 21, term236);
        setElement(term205, 22, term240);
        setElement(term205, 23, term232);
        setElement(term205, 24, term244);
        setElement(term205, 25, term248);
        setElement(term205, 26, term252);
        setElement(term205, 27, term256);
        setElement(term205, 28, term259);
        setElement(term205, 29, term262);
        setElement(term205, 30, term265);
        setElement(term205, 31, term268);
        setElement(term138, 2, term205);
        setLongElement(term271, 0, 34363746224L);
        setLongElement(term271, 1, 34363775512L);
        setLongElement(term271, 2, 34363775512L);
        setLongElement(term271, 3, 34363775512L);
        setLongElement(term271, 4, 139456653059792L);
        setLongElement(term271, 5, 34364440080L);
        setLongElement(term271, 6, 139456653135520L);
        setLongElement(term271, 7, 139456652974128L);
        setLongElement(term271, 8, 139456652974016L);
        setLongElement(term271, 9, 139456652974160L);
        setLongElement(term271, 10, 139456653021312L);
        setLongElement(term271, 11, 34363766248L);
        setLongElement(term271, 12, 34363766248L);
        setLongElement(term271, 13, 139453118788384L);
        setLongElement(term271, 14, 139453118788384L);
        setLongElement(term271, 15, 139453118788240L);
        setLongElement(term271, 16, 139453118798624L);
        setLongElement(term271, 17, 139453118800272L);
        setLongElement(term271, 18, 139453118801040L);
        setLongElement(term271, 19, 139453115772832L);
        setLongElement(term271, 20, 34363739368L);
        setLongElement(term271, 21, 34363739368L);
        setLongElement(term271, 22, 139453118794096L);
        setLongElement(term271, 23, 34363829248L);
        setLongElement(term271, 24, 139453115772832L);
        setLongElement(term271, 25, 139456690258064L);
        setLongElement(term271, 26, 34363745472L);
        setLongElement(term271, 27, 34364710216L);
        setLongElement(term271, 28, 34363745472L);
        setLongElement(term271, 29, 34363745472L);
        setLongElement(term271, 30, 34364896224L);
        setLongElement(term271, 31, 34363745472L);
        setElement(term138, 3, term271);
        setShortElement(term305, 0, (short) 2);
        setShortElement(term305, 1, (short) 12);
        setElement(term304, 0, term305);
        setIntElement(term338, 0, 1638400);
        setIntElement(term338, 1, 720907);
        setElement(term304, 1, term338);
        setElement(term371, 0, term372);
        setElement(term371, 1, term374);
        setElement(term304, 2, term371);
        setLongElement(term376, 0, 34363745472L);
        setLongElement(term376, 1, 34363745472L);
        setElement(term304, 3, term376);
        setElement(term138, 4, term304);
        setField(term137, term137.getClass(), "backtrace", term138);
        setField(term137, term137.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "cause", term137);
        setField(term137, term137.getClass(), "stackTrace", term421);
        setIntField(term137, term137.getClass(), "depth", 34);
        setIntField(term423, term423.getClass(), "modCount", 0);
        setField(term137, term137.getClass(), "suppressedExceptions", term423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term137;
        try {
            callMethod(klass, "_wrapAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


