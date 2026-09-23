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

public class Flat3Map_put_1944740725707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172197;
     Object term172771;

    public Flat3Map_put_1944740725707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172197 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172289 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term171752 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term172381 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172511 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term172641 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term172679 = newInstance(Class.forName("java.lang.Object"));
        setField(term172197, term172197.getClass(), "delegateMap", null);
        setIntField(term172197, term172197.getClass(), "size", 0);
        setIntField(term172197, term172197.getClass(), "hash3", -333616376);
        setField(term172289, term172289.getClass(), "delegateMap", null);
        setIntField(term172289, term172289.getClass(), "size", 3);
        setField(term172289, term172289.getClass(), "key3", term171752);
        setField(term172289, term172289.getClass(), "key2", null);
        setField(term172289, term172289.getClass(), "value2", term172197);
        setIntField(term172289, term172289.getClass(), "hash3", 370147328);
        setField(term172289, term172289.getClass(), "value3", null);
        setIntField(term172289, term172289.getClass(), "hash2", -795869184);
        setIntField(term172289, term172289.getClass(), "hash1", 425721856);
        setField(term172289, term172289.getClass(), "value1", null);
        setField(term172197, term172197.getClass(), "key3", term172289);
        setIntField(term172197, term172197.getClass(), "hash2", -333616376);
        setField(term172381, term172381.getClass(), "delegateMap", null);
        setIntField(term172381, term172381.getClass(), "size", -4);
        setField(term172197, term172197.getClass(), "key2", term172381);
        setIntField(term172197, term172197.getClass(), "hash1", 333616375);
        setField(term172197, term172197.getClass(), "value3", term172511);
        setField(term172197, term172197.getClass(), "value2", term172641);
        setField(term172197, term172197.getClass(), "key1", null);
        setField(term172197, term172197.getClass(), "value1", term172679);
        term172771 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172771, term172771.getClass(), "delegateMap", null);
        setIntField(term172771, term172771.getClass(), "size", 3);
        setIntField(term172771, term172771.getClass(), "hash3", -409416159);
        setField(term172771, term172771.getClass(), "value3", null);
        setIntField(term172771, term172771.getClass(), "hash2", 268517376);
        setField(term172771, term172771.getClass(), "value2", null);
        setIntField(term172771, term172771.getClass(), "hash1", -192717593);
        setField(term172771, term172771.getClass(), "value1", null);
        setField(term172771, term172771.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term172771;
        args[1] = null;
        callMethod(klass, "put", argTypes, term172197, args);
    }

};


