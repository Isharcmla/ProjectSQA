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

public class Flat3Map_put_1944740725702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169834;

    public Flat3Map_put_1944740725702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169834 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169858 = newInstance(Class.forName("java.lang.ModuleLayer"));
        setField(term169834, term169834.getClass(), "delegateMap", null);
        setIntField(term169834, term169834.getClass(), "size", 3);
        setIntField(term169834, term169834.getClass(), "hash3", 0);
        setField(term169834, term169834.getClass(), "value3", null);
        setIntField(term169834, term169834.getClass(), "hash2", 0);
        setField(term169834, term169834.getClass(), "value2", term169858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term169834;
        args[1] = null;
        callMethod(klass, "put", argTypes, term169834, args);
    }

};


