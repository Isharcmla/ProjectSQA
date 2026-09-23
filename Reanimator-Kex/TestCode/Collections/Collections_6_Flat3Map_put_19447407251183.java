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
import java.lang.Object;

public class Flat3Map_put_19447407251183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368982;
     Object term369498;

    public Flat3Map_put_19447407251183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369074 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369166 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369276 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term369544 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369406 = newInstance(Class.forName("java.lang.Object"));
        setField(term368982, term368982.getClass(), "delegateMap", null);
        setIntField(term368982, term368982.getClass(), "size", 3);
        setIntField(term368982, term368982.getClass(), "hash3", -1245265647);
        setField(term369074, term369074.getClass(), "delegateMap", null);
        setIntField(term369074, term369074.getClass(), "size", 3);
        setField(term369166, term369166.getClass(), "delegateMap", null);
        setIntField(term369166, term369166.getClass(), "size", 0);
        setField(term369074, term369074.getClass(), "key3", term369166);
        setField(term369074, term369074.getClass(), "key2", null);
        setField(term369074, term369074.getClass(), "value2", null);
        setIntField(term369074, term369074.getClass(), "hash3", -2117058560);
        setField(term369074, term369074.getClass(), "value3", null);
        setIntField(term369074, term369074.getClass(), "hash2", 1109393672);
        setIntField(term369074, term369074.getClass(), "hash1", 1015316480);
        setIntField(term369276, term369276.getClass(), "size", 0);
        setField(term369074, term369074.getClass(), "key1", term369276);
        setField(term369074, term369074.getClass(), "value1", null);
        setField(term368982, term368982.getClass(), "key3", term369074);
        setIntField(term368982, term368982.getClass(), "hash2", -1245265647);
        setField(term368982, term368982.getClass(), "key2", null);
        setIntField(term368982, term368982.getClass(), "hash1", -1245265647);
        setField(term368982, term368982.getClass(), "key1", null);
        setField(term369544, term369544.getClass(), "delegateMap", null);
        setIntField(term369544, term369544.getClass(), "size", 0);
        setField(term368982, term368982.getClass(), "value3", term369544);
        setField(term368982, term368982.getClass(), "value2", null);
        setField(term368982, term368982.getClass(), "value1", term369406);
        term369498 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term369498, term369498.getClass(), "delegateMap", null);
        setIntField(term369498, term369498.getClass(), "size", 3);
        setIntField(term369498, term369498.getClass(), "hash3", -798744511);
        setField(term369498, term369498.getClass(), "value3", null);
        setIntField(term369498, term369498.getClass(), "hash2", 1667366992);
        setField(term369498, term369498.getClass(), "value2", null);
        setIntField(term369498, term369498.getClass(), "hash1", -2113888128);
        setField(term369498, term369498.getClass(), "value1", null);
        setField(term369498, term369498.getClass(), "key3", null);
        setField(term369498, term369498.getClass(), "key2", term369544);
        setField(term369636, term369636.getClass(), "delegateMap", null);
        setIntField(term369636, term369636.getClass(), "size", 1);
        setIntField(term369636, term369636.getClass(), "hash1", 0);
        setField(term369636, term369636.getClass(), "value1", null);
        setField(term369498, term369498.getClass(), "key1", term369636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term369498;
        args[1] = null;
        callMethod(klass, "put", argTypes, term368982, args);
    }

};


