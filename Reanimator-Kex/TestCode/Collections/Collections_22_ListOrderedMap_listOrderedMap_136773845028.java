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
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class ListOrderedMap_listOrderedMap_136773845028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term5604;
     Object term5585;

    public ListOrderedMap_listOrderedMap_136773845028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new LinkedHashMap();
        term5604 = new LinkedHashMap();
        ArrayList term5586 = new ArrayList();
        LinkedHashMap term5590 = new LinkedHashMap();
        term5585 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5585, term5585.getClass(), "insertOrder", term5586);
        setField(term5585, term5585.getClass(), "map", term5590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "listOrderedMap", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term5604));
        assertTrue(recursiveEquals(retValue, term5585));
    }

};


