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

public class Attributes_size_4990353832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term1613;

    public Attributes_size_4990353832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term472 = new LinkedHashMap();
        term471 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term471, term471.getClass(), "attributes", term472);
        LinkedHashMap term1614 = new LinkedHashMap();
        term1613 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1613, term1613.getClass(), "attributes", term1614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term471, args);
        assertTrue(recursiveEquals(term471, term1613));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


