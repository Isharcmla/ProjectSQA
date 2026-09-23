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

public class Attributes_equals_1603080095115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2021248;
     Object term2021366;
     Object term2021398;
     Object term2021400;

    public Attributes_equals_1603080095115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2021308 = new LinkedHashMap();
        term2021248 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2021248, term2021248.getClass(), "attributes", term2021308);
        term2021366 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        LinkedHashMap term2021399 = new LinkedHashMap();
        term2021398 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2021398, term2021398.getClass(), "attributes", term2021399);
        term2021400 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2021400, term2021400.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2021366;
        Object retValue = callMethod(klass, "equals", argTypes, term2021248, args);
        assertTrue(recursiveEquals(term2021248, term2021398));
        assertTrue(recursiveEquals(term2021366, term2021400));
        assertTrue(recursiveEquals(retValue, false));
    }

};


