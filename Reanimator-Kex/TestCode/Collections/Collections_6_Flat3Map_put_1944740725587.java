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

public class Flat3Map_put_1944740725587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121797;
     Object term122073;
     Object term122633;
     Object term122638;

    public Flat3Map_put_1944740725587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term121797, term121797.getClass(), "delegateMap", null);
        setIntField(term121797, term121797.getClass(), "size", 2);
        setIntField(term121797, term121797.getClass(), "hash2", 0);
        setField(term121889, term121889.getClass(), "delegateMap", null);
        setIntField(term121889, term121889.getClass(), "size", -3);
        setField(term121797, term121797.getClass(), "key2", term121889);
        setIntField(term121797, term121797.getClass(), "hash1", 0);
        setField(term121981, term121981.getClass(), "delegateMap", null);
        setIntField(term121981, term121981.getClass(), "size", 2);
        setField(term121797, term121797.getClass(), "key1", term121981);
        term122073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122157 = newInstance(Class.forName("java.util.concurrent.atomic.Striped64$1"));
        setField(term122073, term122073.getClass(), "delegateMap", null);
        setIntField(term122073, term122073.getClass(), "size", 2);
        setIntField(term122073, term122073.getClass(), "hash2", 0);
        setField(term122073, term122073.getClass(), "value2", null);
        setIntField(term122073, term122073.getClass(), "hash1", 0);
        setField(term122073, term122073.getClass(), "value1", null);
        setField(term122073, term122073.getClass(), "key2", term122157);
        term122633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122634 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122637 = newInstance(Class.forName("java.util.concurrent.atomic.Striped64$1"));
        setIntField(term122633, term122633.getClass(), "size", 3);
        setIntField(term122633, term122633.getClass(), "hash1", 0);
        setIntField(term122633, term122633.getClass(), "hash2", 0);
        setIntField(term122633, term122633.getClass(), "hash3", 0);
        setIntField(term122634, term122634.getClass(), "size", 2);
        setIntField(term122634, term122634.getClass(), "hash1", 0);
        setIntField(term122634, term122634.getClass(), "hash2", 0);
        setIntField(term122634, term122634.getClass(), "hash3", 0);
        setField(term122634, term122634.getClass(), "key1", null);
        setField(term122634, term122634.getClass(), "key2", null);
        setField(term122634, term122634.getClass(), "key3", null);
        setField(term122634, term122634.getClass(), "value1", null);
        setField(term122634, term122634.getClass(), "value2", null);
        setField(term122634, term122634.getClass(), "value3", null);
        setField(term122634, term122634.getClass(), "delegateMap", null);
        setField(term122633, term122633.getClass(), "key1", term122634);
        setIntField(term122635, term122635.getClass(), "size", -3);
        setIntField(term122635, term122635.getClass(), "hash1", 0);
        setIntField(term122635, term122635.getClass(), "hash2", 0);
        setIntField(term122635, term122635.getClass(), "hash3", 0);
        setField(term122635, term122635.getClass(), "key1", null);
        setField(term122635, term122635.getClass(), "key2", null);
        setField(term122635, term122635.getClass(), "key3", null);
        setField(term122635, term122635.getClass(), "value1", null);
        setField(term122635, term122635.getClass(), "value2", null);
        setField(term122635, term122635.getClass(), "value3", null);
        setField(term122635, term122635.getClass(), "delegateMap", null);
        setField(term122633, term122633.getClass(), "key2", term122635);
        setIntField(term122636, term122636.getClass(), "size", 2);
        setIntField(term122636, term122636.getClass(), "hash1", 0);
        setIntField(term122636, term122636.getClass(), "hash2", 0);
        setIntField(term122636, term122636.getClass(), "hash3", 0);
        setField(term122636, term122636.getClass(), "key1", null);
        setField(term122636, term122636.getClass(), "key2", term122637);
        setField(term122636, term122636.getClass(), "key3", null);
        setField(term122636, term122636.getClass(), "value1", null);
        setField(term122636, term122636.getClass(), "value2", null);
        setField(term122636, term122636.getClass(), "value3", null);
        setField(term122636, term122636.getClass(), "delegateMap", null);
        setField(term122633, term122633.getClass(), "key3", term122636);
        setField(term122633, term122633.getClass(), "value1", null);
        setField(term122633, term122633.getClass(), "value2", null);
        setField(term122633, term122633.getClass(), "value3", null);
        setField(term122633, term122633.getClass(), "delegateMap", null);
        term122638 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122639 = newInstance(Class.forName("java.util.concurrent.atomic.Striped64$1"));
        setIntField(term122638, term122638.getClass(), "size", 2);
        setIntField(term122638, term122638.getClass(), "hash1", 0);
        setIntField(term122638, term122638.getClass(), "hash2", 0);
        setIntField(term122638, term122638.getClass(), "hash3", 0);
        setField(term122638, term122638.getClass(), "key1", null);
        setField(term122638, term122638.getClass(), "key2", term122639);
        setField(term122638, term122638.getClass(), "key3", null);
        setField(term122638, term122638.getClass(), "value1", null);
        setField(term122638, term122638.getClass(), "value2", null);
        setField(term122638, term122638.getClass(), "value3", null);
        setField(term122638, term122638.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term122073;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term121797, args);
        assertTrue(recursiveEquals(term121797, term122633));
        assertTrue(recursiveEquals(term122073, term122638));
        assertTrue(recursiveEquals(retValue, null));
    }

};


