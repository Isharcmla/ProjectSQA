package org.apache.commons.collections4.map;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_containsValue_525389491147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48157;

    public MultiValueMap_containsValue_525389491147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48157 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term48261 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term48365 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term48469 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term48365, term48365.getClass(), "map", term48469);
        setField(term48261, term48261.getClass(), "map", term48365);
        setField(term48157, term48157.getClass(), "map", term48261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term48157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


