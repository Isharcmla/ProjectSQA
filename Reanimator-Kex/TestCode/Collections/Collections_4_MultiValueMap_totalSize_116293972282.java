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

public class MultiValueMap_totalSize_116293972282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15610;
     Object term16469;

    public MultiValueMap_totalSize_116293972282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15764 = new ArrayList();
        term15610 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term15712 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term15712, term15712.getClass(), "values", term15764);
        setField(term15610, term15610.getClass(), "map", term15712);
        ArrayList term16471 = new ArrayList();
        term16469 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term16470 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term16469, term16469.getClass(), "collectionFactory", null);
        setField(term16469, term16469.getClass(), "values", null);
        setField(term16470, term16470.getClass(), "collectionFactory", null);
        setField(term16470, term16470.getClass(), "values", term16471);
        setField(term16470, term16470.getClass(), "map", null);
        setField(term16469, term16469.getClass(), "map", term16470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "totalSize", argTypes, term15610, args);
        assertTrue(recursiveEquals(term15610, term16469));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


