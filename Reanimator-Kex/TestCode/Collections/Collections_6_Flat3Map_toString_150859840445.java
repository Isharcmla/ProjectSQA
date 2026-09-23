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

public class Flat3Map_toString_150859840445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6069;
     Object term14043;

    public Flat3Map_toString_150859840445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6069 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6074 = newInstance(Class.forName("java.lang.Object"));
        Object term6075 = newInstance(Class.forName("java.lang.Object"));
        Object term6076 = newInstance(Class.forName("java.lang.Object"));
        Object term6077 = newInstance(Class.forName("java.lang.Object"));
        Object term6078 = newInstance(Class.forName("java.lang.Object"));
        Object term6079 = newInstance(Class.forName("java.lang.Object"));
        Object term6080 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6069, term6069.getClass(), "size", -270592367);
        setIntField(term6069, term6069.getClass(), "hash1", 178847646);
        setIntField(term6069, term6069.getClass(), "hash2", 273590437);
        setIntField(term6069, term6069.getClass(), "hash3", -348612876);
        setField(term6069, term6069.getClass(), "key1", term6074);
        setField(term6069, term6069.getClass(), "key2", term6075);
        setField(term6069, term6069.getClass(), "key3", term6076);
        setField(term6069, term6069.getClass(), "value1", term6077);
        setField(term6069, term6069.getClass(), "value2", term6078);
        setField(term6069, term6069.getClass(), "value3", term6079);
        setFloatField(term6080, term6080.getClass(), "loadFactor", 0.0F);
        setIntField(term6080, term6080.getClass(), "size", 0);
        setField(term6080, term6080.getClass(), "data", null);
        setIntField(term6080, term6080.getClass(), "threshold", 0);
        setIntField(term6080, term6080.getClass(), "modCount", 0);
        setField(term6080, term6080.getClass(), "entrySet", null);
        setField(term6080, term6080.getClass(), "keySet", null);
        setField(term6080, term6080.getClass(), "values", null);
        setField(term6080, term6080.getClass(), "keySet", null);
        setField(term6080, term6080.getClass(), "values", null);
        setField(term6069, term6069.getClass(), "delegateMap", term6080);
        term14043 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term14044 = newInstance(Class.forName("java.lang.Object"));
        Object term14045 = newInstance(Class.forName("java.lang.Object"));
        Object term14046 = newInstance(Class.forName("java.lang.Object"));
        Object term14047 = newInstance(Class.forName("java.lang.Object"));
        Object term14048 = newInstance(Class.forName("java.lang.Object"));
        Object term14049 = newInstance(Class.forName("java.lang.Object"));
        Object term14050 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term14043, term14043.getClass(), "size", -270592367);
        setIntField(term14043, term14043.getClass(), "hash1", 178847646);
        setIntField(term14043, term14043.getClass(), "hash2", 273590437);
        setIntField(term14043, term14043.getClass(), "hash3", -348612876);
        setField(term14043, term14043.getClass(), "key1", term14044);
        setField(term14043, term14043.getClass(), "key2", term14045);
        setField(term14043, term14043.getClass(), "key3", term14046);
        setField(term14043, term14043.getClass(), "value1", term14047);
        setField(term14043, term14043.getClass(), "value2", term14048);
        setField(term14043, term14043.getClass(), "value3", term14049);
        setFloatField(term14050, term14050.getClass(), "loadFactor", 0.0F);
        setIntField(term14050, term14050.getClass(), "size", 0);
        setField(term14050, term14050.getClass(), "data", null);
        setIntField(term14050, term14050.getClass(), "threshold", 0);
        setIntField(term14050, term14050.getClass(), "modCount", 0);
        setField(term14050, term14050.getClass(), "entrySet", null);
        setField(term14050, term14050.getClass(), "keySet", null);
        setField(term14050, term14050.getClass(), "values", null);
        setField(term14050, term14050.getClass(), "keySet", null);
        setField(term14050, term14050.getClass(), "values", null);
        setField(term14043, term14043.getClass(), "delegateMap", term14050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term6069, args);
        assertTrue(recursiveEquals(term6069, term14043));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};


