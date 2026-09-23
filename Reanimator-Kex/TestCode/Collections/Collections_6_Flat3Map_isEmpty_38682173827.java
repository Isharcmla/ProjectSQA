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

public class Flat3Map_isEmpty_38682173827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term6424;

    public Flat3Map_isEmpty_38682173827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("java.lang.Object"));
        Object term66 = newInstance(Class.forName("java.lang.Object"));
        Object term67 = newInstance(Class.forName("java.lang.Object"));
        Object term68 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term57, term57.getClass(), "size", -268815336);
        setIntField(term57, term57.getClass(), "hash1", -1210583429);
        setIntField(term57, term57.getClass(), "hash2", -663691365);
        setIntField(term57, term57.getClass(), "hash3", 339854490);
        setField(term57, term57.getClass(), "key1", term62);
        setField(term57, term57.getClass(), "key2", term63);
        setField(term57, term57.getClass(), "key3", term64);
        setField(term57, term57.getClass(), "value1", term65);
        setField(term57, term57.getClass(), "value2", term66);
        setField(term57, term57.getClass(), "value3", term67);
        setFloatField(term68, term68.getClass(), "loadFactor", 0.0F);
        setIntField(term68, term68.getClass(), "size", 0);
        setField(term68, term68.getClass(), "data", null);
        setIntField(term68, term68.getClass(), "threshold", 0);
        setIntField(term68, term68.getClass(), "modCount", 0);
        setField(term68, term68.getClass(), "entrySet", null);
        setField(term68, term68.getClass(), "keySet", null);
        setField(term68, term68.getClass(), "values", null);
        setField(term68, term68.getClass(), "keySet", null);
        setField(term68, term68.getClass(), "values", null);
        setField(term57, term57.getClass(), "delegateMap", term68);
        term6424 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6425 = newInstance(Class.forName("java.lang.Object"));
        Object term6426 = newInstance(Class.forName("java.lang.Object"));
        Object term6427 = newInstance(Class.forName("java.lang.Object"));
        Object term6428 = newInstance(Class.forName("java.lang.Object"));
        Object term6429 = newInstance(Class.forName("java.lang.Object"));
        Object term6430 = newInstance(Class.forName("java.lang.Object"));
        Object term6431 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6424, term6424.getClass(), "size", -268815336);
        setIntField(term6424, term6424.getClass(), "hash1", -1210583429);
        setIntField(term6424, term6424.getClass(), "hash2", -663691365);
        setIntField(term6424, term6424.getClass(), "hash3", 339854490);
        setField(term6424, term6424.getClass(), "key1", term6425);
        setField(term6424, term6424.getClass(), "key2", term6426);
        setField(term6424, term6424.getClass(), "key3", term6427);
        setField(term6424, term6424.getClass(), "value1", term6428);
        setField(term6424, term6424.getClass(), "value2", term6429);
        setField(term6424, term6424.getClass(), "value3", term6430);
        setFloatField(term6431, term6431.getClass(), "loadFactor", 0.0F);
        setIntField(term6431, term6431.getClass(), "size", 0);
        setField(term6431, term6431.getClass(), "data", null);
        setIntField(term6431, term6431.getClass(), "threshold", 0);
        setIntField(term6431, term6431.getClass(), "modCount", 0);
        setField(term6431, term6431.getClass(), "entrySet", null);
        setField(term6431, term6431.getClass(), "keySet", null);
        setField(term6431, term6431.getClass(), "values", null);
        setField(term6431, term6431.getClass(), "keySet", null);
        setField(term6431, term6431.getClass(), "values", null);
        setField(term6424, term6424.getClass(), "delegateMap", term6431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term6424));
        assertTrue(recursiveEquals(retValue, true));
    }

};


