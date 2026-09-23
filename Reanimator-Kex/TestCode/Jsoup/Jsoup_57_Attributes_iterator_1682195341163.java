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

public class Attributes_iterator_1682195341163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4032206;
     Object term4032210;
     Object term4032208;

    public Attributes_iterator_1682195341163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4032206 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4032206, term4032206.getClass(), "attributes", null);
        term4032210 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4032210, term4032210.getClass(), "attributes", null);
        term4032208 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term4032206, args);
        assertTrue(recursiveEquals(term4032206, term4032210));
        assertTrue(recursiveEquals(retValue, term4032208));
    }

};


