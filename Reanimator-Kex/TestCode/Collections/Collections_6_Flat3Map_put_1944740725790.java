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

public class Flat3Map_put_1944740725790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206497;
     Object term206865;

    public Flat3Map_put_1944740725790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206497 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206589 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206681 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term206497, term206497.getClass(), "delegateMap", null);
        setIntField(term206497, term206497.getClass(), "size", 3);
        setIntField(term206497, term206497.getClass(), "hash3", 0);
        setField(term206589, term206589.getClass(), "delegateMap", null);
        setIntField(term206589, term206589.getClass(), "size", 3);
        setField(term206589, term206589.getClass(), "key3", term206681);
        setField(term206589, term206589.getClass(), "key2", null);
        setField(term206589, term206589.getClass(), "value2", null);
        setIntField(term206589, term206589.getClass(), "hash3", -1);
        setIntField(term206589, term206589.getClass(), "hash2", -1);
        setIntField(term206589, term206589.getClass(), "hash1", -1);
        setField(term206497, term206497.getClass(), "key3", term206589);
        setIntField(term206497, term206497.getClass(), "hash2", 0);
        setField(term206773, term206773.getClass(), "delegateMap", null);
        setIntField(term206773, term206773.getClass(), "size", 3);
        setField(term206497, term206497.getClass(), "key2", term206773);
        term206865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206905 = newInstance(Class.forName("java.io.Console$1"));
        setField(term206865, term206865.getClass(), "delegateMap", null);
        setIntField(term206865, term206865.getClass(), "size", 3);
        setIntField(term206865, term206865.getClass(), "hash3", 0);
        setField(term206865, term206865.getClass(), "value3", null);
        setIntField(term206865, term206865.getClass(), "hash2", 0);
        setField(term206865, term206865.getClass(), "value2", null);
        setIntField(term206865, term206865.getClass(), "hash1", 0);
        setField(term206865, term206865.getClass(), "value1", null);
        setField(term206865, term206865.getClass(), "key3", null);
        setField(term206865, term206865.getClass(), "key2", term206905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term206865;
        args[1] = null;
        callMethod(klass, "put", argTypes, term206497, args);
    }

};


