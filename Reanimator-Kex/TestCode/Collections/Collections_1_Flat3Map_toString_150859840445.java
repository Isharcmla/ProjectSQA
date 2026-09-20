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
     Object term6071;
     Object term13688;

    public Flat3Map_toString_150859840445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6076 = newInstance(Class.forName("java.lang.Object"));
        Object term6077 = newInstance(Class.forName("java.lang.Object"));
        Object term6078 = newInstance(Class.forName("java.lang.Object"));
        Object term6079 = newInstance(Class.forName("java.lang.Object"));
        Object term6080 = newInstance(Class.forName("java.lang.Object"));
        Object term6081 = newInstance(Class.forName("java.lang.Object"));
        Object term6082 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6071, term6071.getClass(), "size", -270592367);
        setIntField(term6071, term6071.getClass(), "hash1", 178847646);
        setIntField(term6071, term6071.getClass(), "hash2", 273590437);
        setIntField(term6071, term6071.getClass(), "hash3", -348612876);
        setField(term6071, term6071.getClass(), "key1", term6076);
        setField(term6071, term6071.getClass(), "key2", term6077);
        setField(term6071, term6071.getClass(), "key3", term6078);
        setField(term6071, term6071.getClass(), "value1", term6079);
        setField(term6071, term6071.getClass(), "value2", term6080);
        setField(term6071, term6071.getClass(), "value3", term6081);
        setFloatField(term6082, term6082.getClass(), "loadFactor", 0.0F);
        setIntField(term6082, term6082.getClass(), "size", 0);
        setField(term6082, term6082.getClass(), "data", null);
        setIntField(term6082, term6082.getClass(), "threshold", 0);
        setIntField(term6082, term6082.getClass(), "modCount", 0);
        setField(term6082, term6082.getClass(), "entrySet", null);
        setField(term6082, term6082.getClass(), "keySet", null);
        setField(term6082, term6082.getClass(), "values", null);
        setField(term6082, term6082.getClass(), "keySet", null);
        setField(term6082, term6082.getClass(), "values", null);
        setField(term6071, term6071.getClass(), "delegateMap", term6082);
        term13688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13689 = newInstance(Class.forName("java.lang.Object"));
        Object term13690 = newInstance(Class.forName("java.lang.Object"));
        Object term13691 = newInstance(Class.forName("java.lang.Object"));
        Object term13692 = newInstance(Class.forName("java.lang.Object"));
        Object term13693 = newInstance(Class.forName("java.lang.Object"));
        Object term13694 = newInstance(Class.forName("java.lang.Object"));
        Object term13695 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13688, term13688.getClass(), "size", -270592367);
        setIntField(term13688, term13688.getClass(), "hash1", 178847646);
        setIntField(term13688, term13688.getClass(), "hash2", 273590437);
        setIntField(term13688, term13688.getClass(), "hash3", -348612876);
        setField(term13688, term13688.getClass(), "key1", term13689);
        setField(term13688, term13688.getClass(), "key2", term13690);
        setField(term13688, term13688.getClass(), "key3", term13691);
        setField(term13688, term13688.getClass(), "value1", term13692);
        setField(term13688, term13688.getClass(), "value2", term13693);
        setField(term13688, term13688.getClass(), "value3", term13694);
        setFloatField(term13695, term13695.getClass(), "loadFactor", 0.0F);
        setIntField(term13695, term13695.getClass(), "size", 0);
        setField(term13695, term13695.getClass(), "data", null);
        setIntField(term13695, term13695.getClass(), "threshold", 0);
        setIntField(term13695, term13695.getClass(), "modCount", 0);
        setField(term13695, term13695.getClass(), "entrySet", null);
        setField(term13695, term13695.getClass(), "keySet", null);
        setField(term13695, term13695.getClass(), "values", null);
        setField(term13695, term13695.getClass(), "keySet", null);
        setField(term13695, term13695.getClass(), "values", null);
        setField(term13688, term13688.getClass(), "delegateMap", term13695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term6071, args);
        assertTrue(recursiveEquals(term6071, term13688));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};
