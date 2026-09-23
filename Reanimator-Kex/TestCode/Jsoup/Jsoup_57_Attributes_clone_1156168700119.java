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

public class Attributes_clone_1156168700119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2021607;
     Object term2022069;
     Object term2022062;

    public Attributes_clone_1156168700119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2021667 = new LinkedHashMap();
        term2021607 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2021607, term2021607.getClass(), "attributes", term2021667);
        LinkedHashMap term2022070 = new LinkedHashMap();
        term2022069 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2022069, term2022069.getClass(), "attributes", term2022070);
        LinkedHashMap term2022063 = new LinkedHashMap();
        term2022062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2022062, term2022062.getClass(), "attributes", term2022063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term2021607, args);
        assertTrue(recursiveEquals(term2021607, term2022069));
        assertTrue(recursiveEquals(retValue, term2022062));
    }

};


