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

public class Flat3Map_put_1944740725422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74844;
     Object term75864;
     Object term75871;

    public Flat3Map_put_1944740725422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term74880 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        setField(term74844, term74844.getClass(), "delegateMap", null);
        setIntField(term74844, term74844.getClass(), "size", 3);
        setIntField(term74844, term74844.getClass(), "hash3", 0);
        setField(term74844, term74844.getClass(), "value3", null);
        setIntField(term74844, term74844.getClass(), "hash2", 0);
        setField(term74844, term74844.getClass(), "value2", null);
        setIntField(term74844, term74844.getClass(), "hash1", 0);
        setField(term74844, term74844.getClass(), "value1", term74880);
        term75864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75865 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term75866 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term75867 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75868 = newInstance(Class.forName("java.lang.Object"));
        Object term75869 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term75870 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term75864, term75864.getClass(), "size", 0);
        setIntField(term75864, term75864.getClass(), "hash1", 0);
        setIntField(term75864, term75864.getClass(), "hash2", 0);
        setIntField(term75864, term75864.getClass(), "hash3", 0);
        setField(term75864, term75864.getClass(), "key1", null);
        setField(term75864, term75864.getClass(), "key2", null);
        setField(term75864, term75864.getClass(), "key3", null);
        setField(term75864, term75864.getClass(), "value1", null);
        setField(term75864, term75864.getClass(), "value2", null);
        setField(term75864, term75864.getClass(), "value3", null);
        setFloatField(term75865, term75865.getClass(), "loadFactor", 0.75F);
        setIntField(term75865, term75865.getClass(), "size", 2);
        setField(term75867, term75867.getClass(), "next", null);
        setField(term75867, term75867.getClass(), "key", term75868);
        setField(term75869, term75869.getClass(), "lambdaForm", null);
        setField(term75867, term75867.getClass(), "value", term75869);
        setElement(term75866, 5, term75867);
        setField(term75870, term75870.getClass(), "next", null);
        setField(term75870, term75870.getClass(), "key", term75864);
        setField(term75870, term75870.getClass(), "value", null);
        setElement(term75866, 6, term75870);
        setField(term75865, term75865.getClass(), "data", term75866);
        setIntField(term75865, term75865.getClass(), "threshold", 12);
        setIntField(term75865, term75865.getClass(), "modCount", 2);
        setField(term75865, term75865.getClass(), "entrySet", null);
        setField(term75865, term75865.getClass(), "keySet", null);
        setField(term75865, term75865.getClass(), "values", null);
        setField(term75865, term75865.getClass(), "keySet", null);
        setField(term75865, term75865.getClass(), "values", null);
        setField(term75864, term75864.getClass(), "delegateMap", term75865);
        term75871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75872 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term75873 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term75874 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75875 = newInstance(Class.forName("java.lang.Object"));
        Object term75876 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term75877 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term75871, term75871.getClass(), "size", 0);
        setIntField(term75871, term75871.getClass(), "hash1", 0);
        setIntField(term75871, term75871.getClass(), "hash2", 0);
        setIntField(term75871, term75871.getClass(), "hash3", 0);
        setField(term75871, term75871.getClass(), "key1", null);
        setField(term75871, term75871.getClass(), "key2", null);
        setField(term75871, term75871.getClass(), "key3", null);
        setField(term75871, term75871.getClass(), "value1", null);
        setField(term75871, term75871.getClass(), "value2", null);
        setField(term75871, term75871.getClass(), "value3", null);
        setFloatField(term75872, term75872.getClass(), "loadFactor", 0.75F);
        setIntField(term75872, term75872.getClass(), "size", 2);
        setField(term75874, term75874.getClass(), "next", null);
        setField(term75874, term75874.getClass(), "key", term75875);
        setField(term75876, term75876.getClass(), "lambdaForm", null);
        setField(term75874, term75874.getClass(), "value", term75876);
        setElement(term75873, 5, term75874);
        setField(term75877, term75877.getClass(), "next", null);
        setField(term75877, term75877.getClass(), "key", term75871);
        setField(term75877, term75877.getClass(), "value", null);
        setElement(term75873, 6, term75877);
        setField(term75872, term75872.getClass(), "data", term75873);
        setIntField(term75872, term75872.getClass(), "threshold", 12);
        setIntField(term75872, term75872.getClass(), "modCount", 2);
        setField(term75872, term75872.getClass(), "entrySet", null);
        setField(term75872, term75872.getClass(), "keySet", null);
        setField(term75872, term75872.getClass(), "values", null);
        setField(term75872, term75872.getClass(), "keySet", null);
        setField(term75872, term75872.getClass(), "values", null);
        setField(term75871, term75871.getClass(), "delegateMap", term75872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term74844;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term74844, args);
        assertTrue(recursiveEquals(term74844, term75864));
        assertTrue(recursiveEquals(term74844, term75871));
        assertTrue(recursiveEquals(retValue, null));
    }

};


