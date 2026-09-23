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
import java.util.ArrayList;

public class MultiValueMap_values_179741354152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8156;
     Object term8437;
     Object term8432;

    public MultiValueMap_values_179741354152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8208 = new ArrayList();
        term8156 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term8156, term8156.getClass(), "values", term8208);
        ArrayList term8438 = new ArrayList();
        term8437 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term8437, term8437.getClass(), "collectionFactory", null);
        setField(term8437, term8437.getClass(), "values", term8438);
        setField(term8437, term8437.getClass(), "map", null);
        term8432 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term8156, args);
        assertTrue(recursiveEquals(term8156, term8437));
        assertTrue(recursiveEquals(retValue, term8432));
    }

};


