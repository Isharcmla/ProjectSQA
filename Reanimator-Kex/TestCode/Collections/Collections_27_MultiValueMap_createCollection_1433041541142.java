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
import java.lang.ClassCastException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_createCollection_1433041541142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44458;

    public MultiValueMap_createCollection_1433041541142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44458 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term44576 = newInstance(Class.forName("org.apache.commons.collections4.functors.ConstantFactory"));
        Object term44680 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term44576, term44576.getClass(), "iConstant", term44680);
        setField(term44458, term44458.getClass(), "collectionFactory", term44576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term44458, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


