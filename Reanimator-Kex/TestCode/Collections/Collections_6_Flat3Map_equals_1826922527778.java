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
import java.util.HashMap;

public class Flat3Map_equals_1826922527778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200583;
     Object term200723;

    public Flat3Map_equals_1826922527778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term200631 = new HashMap();
        term200583 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200583, term200583.getClass(), "delegateMap", null);
        setIntField(term200583, term200583.getClass(), "size", 3);
        setField(term200583, term200583.getClass(), "key3", null);
        setField(term200583, term200583.getClass(), "value3", null);
        setField(term200583, term200583.getClass(), "key2", term200631);
        HashMap term200771 = new HashMap();
        term200723 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200723, term200723.getClass(), "delegateMap", null);
        setIntField(term200723, term200723.getClass(), "size", 3);
        setField(term200723, term200723.getClass(), "key3", term200771);
        setField(term200723, term200723.getClass(), "key2", null);
        setField(term200723, term200723.getClass(), "value2", null);
        setIntField(term200723, term200723.getClass(), "hash3", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term200723;
        callMethod(klass, "equals", argTypes, term200583, args);
    }

};


