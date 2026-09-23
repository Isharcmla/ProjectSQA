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

public class Attributes_iterator_168219534134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;
     Object term1646;
     Object term1638;

    public Attributes_iterator_168219534134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term547 = new LinkedHashMap();
        term546 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term546, term546.getClass(), "attributes", term547);
        LinkedHashMap term1647 = new LinkedHashMap();
        term1646 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1646, term1646.getClass(), "attributes", term1647);
        term1638 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term546, args);
        assertTrue(recursiveEquals(term546, term1646));
        assertTrue(recursiveEquals(retValue, term1638));
    }

};


