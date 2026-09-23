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
import java.util.ArrayList;

public class MultiValueMap_createCollection_1754308673180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44607;
     Object term62643;
     Object term62636;

    public MultiValueMap_createCollection_1754308673180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44775 = new ArrayList();
        term44607 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term44723 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term44723, term44723.getClass(), "iConstant", term44775);
        setField(term44607, term44607.getClass(), "collectionFactory", term44723);
        ArrayList term62645 = new ArrayList();
        term62643 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term62644 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term62644, term62644.getClass(), "iConstant", term62645);
        setField(term62643, term62643.getClass(), "collectionFactory", term62644);
        setField(term62643, term62643.getClass(), "values", null);
        setField(term62643, term62643.getClass(), "map", null);
        term62636 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term44607, args);
        assertTrue(recursiveEquals(term44607, term62643));
        assertTrue(recursiveEquals(retValue, term62636));
    }

};


