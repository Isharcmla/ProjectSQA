package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_19447407251077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313720;
     Object term314082;
     Object term314865;
     Object term314876;

    public Flat3Map_put_19447407251077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term313990 = new HashMap();
        term313720 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term313812 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term313904 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term313265 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term313942 = newInstance(Class.forName("java.lang.Object"));
        setField(term313720, term313720.getClass(), "delegateMap", null);
        setIntField(term313720, term313720.getClass(), "size", 3);
        setIntField(term313720, term313720.getClass(), "hash3", -1873542648);
        setField(term313812, term313812.getClass(), "delegateMap", null);
        setIntField(term313812, term313812.getClass(), "size", 3);
        setField(term313904, term313904.getClass(), "delegateMap", null);
        setIntField(term313904, term313904.getClass(), "size", 0);
        setField(term313812, term313812.getClass(), "key3", term313904);
        setField(term313812, term313812.getClass(), "key2", null);
        setField(term313812, term313812.getClass(), "value2", null);
        setIntField(term313812, term313812.getClass(), "hash3", 1133052432);
        setField(term313812, term313812.getClass(), "value3", null);
        setIntField(term313812, term313812.getClass(), "hash2", 1744897024);
        setIntField(term313812, term313812.getClass(), "hash1", -1740046326);
        setField(term313812, term313812.getClass(), "value1", null);
        setField(term313720, term313720.getClass(), "key3", term313812);
        setIntField(term313720, term313720.getClass(), "hash2", -1873542648);
        setField(term313720, term313720.getClass(), "key2", null);
        setIntField(term313720, term313720.getClass(), "hash1", -1873542648);
        setField(term313720, term313720.getClass(), "key1", null);
        setField(term313720, term313720.getClass(), "value3", term313265);
        setField(term313720, term313720.getClass(), "value2", term313942);
        setField(term313720, term313720.getClass(), "value1", term313990);
        term314082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314174 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314254 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term314082, term314082.getClass(), "delegateMap", null);
        setIntField(term314082, term314082.getClass(), "size", 3);
        setIntField(term314082, term314082.getClass(), "hash3", 52691464);
        setField(term314082, term314082.getClass(), "value3", null);
        setIntField(term314082, term314082.getClass(), "hash2", 18874368);
        setField(term314082, term314082.getClass(), "value2", null);
        setIntField(term314082, term314082.getClass(), "hash1", -1945108480);
        setField(term314082, term314082.getClass(), "value1", null);
        setField(term314082, term314082.getClass(), "key3", null);
        setField(term314174, term314174.getClass(), "delegateMap", null);
        setIntField(term314174, term314174.getClass(), "size", 0);
        setField(term314082, term314082.getClass(), "key2", term314174);
        setField(term314082, term314082.getClass(), "key1", term314254);
        HashMap term314870 = new HashMap();
        term314865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314866 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term314867 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term314868 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term314869 = newInstance(Class.forName("java.lang.Object"));
        Object term314871 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term314872 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314873 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term314874 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term314875 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setIntField(term314865, term314865.getClass(), "size", 0);
        setIntField(term314865, term314865.getClass(), "hash1", 0);
        setIntField(term314865, term314865.getClass(), "hash2", 0);
        setIntField(term314865, term314865.getClass(), "hash3", 0);
        setField(term314865, term314865.getClass(), "key1", null);
        setField(term314865, term314865.getClass(), "key2", null);
        setField(term314865, term314865.getClass(), "key3", null);
        setField(term314865, term314865.getClass(), "value1", null);
        setField(term314865, term314865.getClass(), "value2", null);
        setField(term314865, term314865.getClass(), "value3", null);
        setFloatField(term314866, term314866.getClass(), "loadFactor", 0.75F);
        setIntField(term314866, term314866.getClass(), "size", 3);
        setField(term314868, term314868.getClass(), "next", null);
        setField(term314868, term314868.getClass(), "key", term314869);
        setField(term314868, term314868.getClass(), "value", term314870);
        setElement(term314867, 6, term314868);
        setField(term314871, term314871.getClass(), "next", null);
        setIntField(term314872, term314872.getClass(), "size", 3);
        setIntField(term314872, term314872.getClass(), "hash1", -1945108480);
        setIntField(term314872, term314872.getClass(), "hash2", 18874368);
        setIntField(term314872, term314872.getClass(), "hash3", 52691464);
        setField(term314872, term314872.getClass(), "key1", null);
        setField(term314872, term314872.getClass(), "key2", null);
        setField(term314872, term314872.getClass(), "key3", null);
        setField(term314872, term314872.getClass(), "value1", null);
        setField(term314872, term314872.getClass(), "value2", null);
        setField(term314872, term314872.getClass(), "value3", null);
        setField(term314872, term314872.getClass(), "delegateMap", null);
        setField(term314871, term314871.getClass(), "key", term314872);
        setField(term314871, term314871.getClass(), "value", null);
        setElement(term314867, 9, term314871);
        setField(term314873, term314873.getClass(), "next", null);
        setIntField(term314874, term314874.getClass(), "size", 3);
        setIntField(term314874, term314874.getClass(), "hash1", -1740046326);
        setIntField(term314874, term314874.getClass(), "hash2", 1744897024);
        setIntField(term314874, term314874.getClass(), "hash3", 1133052432);
        setField(term314874, term314874.getClass(), "key1", null);
        setField(term314874, term314874.getClass(), "key2", null);
        setField(term314874, term314874.getClass(), "key3", null);
        setField(term314874, term314874.getClass(), "value1", null);
        setField(term314874, term314874.getClass(), "value2", null);
        setField(term314874, term314874.getClass(), "value3", null);
        setField(term314874, term314874.getClass(), "delegateMap", null);
        setField(term314873, term314873.getClass(), "key", term314874);
        setField(term314873, term314873.getClass(), "value", term314875);
        setElement(term314867, 15, term314873);
        setField(term314866, term314866.getClass(), "data", term314867);
        setIntField(term314866, term314866.getClass(), "threshold", 12);
        setIntField(term314866, term314866.getClass(), "modCount", 3);
        setField(term314866, term314866.getClass(), "entrySet", null);
        setField(term314866, term314866.getClass(), "keySet", null);
        setField(term314866, term314866.getClass(), "values", null);
        setField(term314866, term314866.getClass(), "keySet", null);
        setField(term314866, term314866.getClass(), "values", null);
        setField(term314865, term314865.getClass(), "delegateMap", term314866);
        term314876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term314876, term314876.getClass(), "size", 3);
        setIntField(term314876, term314876.getClass(), "hash1", -1945108480);
        setIntField(term314876, term314876.getClass(), "hash2", 18874368);
        setIntField(term314876, term314876.getClass(), "hash3", 52691464);
        setField(term314876, term314876.getClass(), "key1", null);
        setField(term314876, term314876.getClass(), "key2", null);
        setField(term314876, term314876.getClass(), "key3", null);
        setField(term314876, term314876.getClass(), "value1", null);
        setField(term314876, term314876.getClass(), "value2", null);
        setField(term314876, term314876.getClass(), "value3", null);
        setField(term314876, term314876.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term314082;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term313720, args);
        assertTrue(recursiveEquals(term313720, term314865));
        assertTrue(recursiveEquals(term314082, term314876));
        assertTrue(recursiveEquals(retValue, null));
    }

};


