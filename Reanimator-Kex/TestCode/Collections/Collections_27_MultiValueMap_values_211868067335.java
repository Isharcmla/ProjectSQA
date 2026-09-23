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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.lang.Object;

public class MultiValueMap_values_211868067335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;
     Object term4627;
     Object term4626;

    public MultiValueMap_values_211868067335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term488, term488.getClass(), "collectionFactory", null);
        setField(term488, term488.getClass(), "valuesView", null);
        setField(term488, term488.getClass(), "map", null);
        term4627 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term4628 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$Values"));
        setField(term4627, term4627.getClass(), "collectionFactory", null);
        setField(term4628, term4628.getClass(), "this$0", term4627);
        setField(term4627, term4627.getClass(), "valuesView", term4628);
        setField(term4627, term4627.getClass(), "map", null);
        term4626 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$Values"));
        Object term4625 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term4625, term4625.getClass(), "collectionFactory", null);
        setField(term4625, term4625.getClass(), "valuesView", term4626);
        setField(term4625, term4625.getClass(), "map", null);
        setField(term4626, term4626.getClass(), "this$0", term4625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term488, args);
        assertTrue(recursiveEquals(term488, term4627));
        assertTrue(recursiveEquals(retValue, term4626));
    }

};


