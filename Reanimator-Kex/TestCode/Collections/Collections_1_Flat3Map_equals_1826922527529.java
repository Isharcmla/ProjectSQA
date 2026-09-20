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
import java.util.HashMap;

public class Flat3Map_equals_1826922527529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100507;
     Object term100647;
     Object term100809;
     Object term100812;

    public Flat3Map_equals_1826922527529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term100719 = new HashMap();
        term100507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100507, term100507.getClass(), "delegateMap", null);
        setIntField(term100507, term100507.getClass(), "size", 3);
        setField(term100507, term100507.getClass(), "key3", null);
        setField(term100507, term100507.getClass(), "value3", null);
        setField(term100507, term100507.getClass(), "key2", null);
        setField(term100507, term100507.getClass(), "value2", null);
        setField(term100507, term100507.getClass(), "key1", term100719);
        HashMap term100695 = new HashMap();
        term100647 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100647, term100647.getClass(), "delegateMap", null);
        setIntField(term100647, term100647.getClass(), "size", 3);
        setField(term100647, term100647.getClass(), "key3", null);
        setField(term100647, term100647.getClass(), "value3", null);
        setIntField(term100647, term100647.getClass(), "hash3", 0);
        setIntField(term100647, term100647.getClass(), "hash2", 0);
        setField(term100647, term100647.getClass(), "key2", term100695);
        setIntField(term100647, term100647.getClass(), "hash1", 0);
        setField(term100647, term100647.getClass(), "key1", term100719);
        HashMap term100810 = new HashMap();
        term100809 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100809, term100809.getClass(), "size", 3);
        setIntField(term100809, term100809.getClass(), "hash1", 0);
        setIntField(term100809, term100809.getClass(), "hash2", 0);
        setIntField(term100809, term100809.getClass(), "hash3", 0);
        setField(term100809, term100809.getClass(), "key1", term100810);
        setField(term100809, term100809.getClass(), "key2", null);
        setField(term100809, term100809.getClass(), "key3", null);
        setField(term100809, term100809.getClass(), "value1", null);
        setField(term100809, term100809.getClass(), "value2", null);
        setField(term100809, term100809.getClass(), "value3", null);
        setField(term100809, term100809.getClass(), "delegateMap", null);
        HashMap term100813 = new HashMap();
        HashMap term100815 = new HashMap();
        term100812 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100812, term100812.getClass(), "size", 3);
        setIntField(term100812, term100812.getClass(), "hash1", 0);
        setIntField(term100812, term100812.getClass(), "hash2", 0);
        setIntField(term100812, term100812.getClass(), "hash3", 0);
        setField(term100812, term100812.getClass(), "key1", term100813);
        setField(term100812, term100812.getClass(), "key2", term100815);
        setField(term100812, term100812.getClass(), "key3", null);
        setField(term100812, term100812.getClass(), "value1", null);
        setField(term100812, term100812.getClass(), "value2", null);
        setField(term100812, term100812.getClass(), "value3", null);
        setField(term100812, term100812.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100647;
        Object retValue = callMethod(klass, "equals", argTypes, term100507, args);
        assertTrue(recursiveEquals(term100507, term100809));
        assertTrue(recursiveEquals(term100647, term100812));
        assertTrue(recursiveEquals(retValue, true));
    }

};
