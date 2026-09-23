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

public class Attributes_addAll_64349132133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;
     Object term521;
     Object term1632;
     Object term1634;

    public Attributes_addAll_64349132133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term497 = new LinkedHashMap();
        term496 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term496, term496.getClass(), "attributes", term497);
        LinkedHashMap term522 = new LinkedHashMap();
        term521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term521, term521.getClass(), "attributes", term522);
        LinkedHashMap term1633 = new LinkedHashMap();
        term1632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1632, term1632.getClass(), "attributes", term1633);
        LinkedHashMap term1635 = new LinkedHashMap();
        term1634 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1634, term1634.getClass(), "attributes", term1635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term521;
        callMethod(klass, "addAll", argTypes, term496, args);
        assertTrue(recursiveEquals(term496, term1632));
        assertTrue(recursiveEquals(term521, term1634));
    }

};


