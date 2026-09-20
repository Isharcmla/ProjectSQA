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

public class Flat3Map_put_1944740725841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169379;
     Object term169601;
     Object term170037;
     Object term170041;

    public Flat3Map_put_1944740725841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169379 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169417 = newInstance(Class.forName("java.lang.Object"));
        Object term169509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term169379, term169379.getClass(), "delegateMap", null);
        setIntField(term169379, term169379.getClass(), "size", 2);
        setIntField(term169379, term169379.getClass(), "hash2", 0);
        setField(term169379, term169379.getClass(), "key2", term169417);
        setIntField(term169379, term169379.getClass(), "hash1", 0);
        setField(term169379, term169379.getClass(), "key1", term169509);
        term169601 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term169601, term169601.getClass(), "delegateMap", null);
        setIntField(term169601, term169601.getClass(), "size", 2);
        setIntField(term169601, term169601.getClass(), "hash2", 0);
        setField(term169601, term169601.getClass(), "value2", null);
        setIntField(term169601, term169601.getClass(), "hash1", 0);
        setField(term169601, term169601.getClass(), "value1", null);
        term170037 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170038 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170039 = newInstance(Class.forName("java.lang.Object"));
        Object term170040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term170037, term170037.getClass(), "size", 3);
        setIntField(term170037, term170037.getClass(), "hash1", 0);
        setIntField(term170037, term170037.getClass(), "hash2", 0);
        setIntField(term170037, term170037.getClass(), "hash3", 0);
        setIntField(term170038, term170038.getClass(), "size", 0);
        setIntField(term170038, term170038.getClass(), "hash1", 0);
        setIntField(term170038, term170038.getClass(), "hash2", 0);
        setIntField(term170038, term170038.getClass(), "hash3", 0);
        setField(term170038, term170038.getClass(), "key1", null);
        setField(term170038, term170038.getClass(), "key2", null);
        setField(term170038, term170038.getClass(), "key3", null);
        setField(term170038, term170038.getClass(), "value1", null);
        setField(term170038, term170038.getClass(), "value2", null);
        setField(term170038, term170038.getClass(), "value3", null);
        setField(term170038, term170038.getClass(), "delegateMap", null);
        setField(term170037, term170037.getClass(), "key1", term170038);
        setField(term170037, term170037.getClass(), "key2", term170039);
        setIntField(term170040, term170040.getClass(), "size", 2);
        setIntField(term170040, term170040.getClass(), "hash1", 0);
        setIntField(term170040, term170040.getClass(), "hash2", 0);
        setIntField(term170040, term170040.getClass(), "hash3", 0);
        setField(term170040, term170040.getClass(), "key1", null);
        setField(term170040, term170040.getClass(), "key2", null);
        setField(term170040, term170040.getClass(), "key3", null);
        setField(term170040, term170040.getClass(), "value1", null);
        setField(term170040, term170040.getClass(), "value2", null);
        setField(term170040, term170040.getClass(), "value3", null);
        setField(term170040, term170040.getClass(), "delegateMap", null);
        setField(term170037, term170037.getClass(), "key3", term170040);
        setField(term170037, term170037.getClass(), "value1", null);
        setField(term170037, term170037.getClass(), "value2", null);
        setField(term170037, term170037.getClass(), "value3", null);
        setField(term170037, term170037.getClass(), "delegateMap", null);
        term170041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term170041, term170041.getClass(), "size", 2);
        setIntField(term170041, term170041.getClass(), "hash1", 0);
        setIntField(term170041, term170041.getClass(), "hash2", 0);
        setIntField(term170041, term170041.getClass(), "hash3", 0);
        setField(term170041, term170041.getClass(), "key1", null);
        setField(term170041, term170041.getClass(), "key2", null);
        setField(term170041, term170041.getClass(), "key3", null);
        setField(term170041, term170041.getClass(), "value1", null);
        setField(term170041, term170041.getClass(), "value2", null);
        setField(term170041, term170041.getClass(), "value3", null);
        setField(term170041, term170041.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term169601;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term169379, args);
        assertTrue(recursiveEquals(term169379, term170037));
        assertTrue(recursiveEquals(term169601, term170041));
        assertTrue(recursiveEquals(retValue, null));
    }

};
