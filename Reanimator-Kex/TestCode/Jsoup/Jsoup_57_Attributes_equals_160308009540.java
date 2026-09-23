package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;

public class Attributes_equals_160308009540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;
     Object term997;
     Object term3210;
     Object term3212;

    public Attributes_equals_160308009540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term973 = new LinkedHashMap();
        term972 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term972, term972.getClass(), "attributes", term973);
        term997 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term3211 = new LinkedHashMap();
        term3210 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3210, term3210.getClass(), "attributes", term3211);
        term3212 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term997;
        Object retValue = callMethod(klass, "equals", argTypes, term972, args);
        assertTrue(recursiveEquals(term972, term3210));
        assertTrue(recursiveEquals(term997, term3212));
        assertTrue(recursiveEquals(retValue, false));
    }

};


