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

public class Attributes_equals_160308009579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61119;
     Object term61999;
     Object term62000;

    public Attributes_equals_160308009579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61119 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term61999 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term61999, term61999.getClass(), "size", 0);
        setField(term61999, term61999.getClass(), "keys", null);
        setField(term61999, term61999.getClass(), "vals", null);
        term62000 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term62000, term62000.getClass(), "size", 0);
        setField(term62000, term62000.getClass(), "keys", null);
        setField(term62000, term62000.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61119;
        Object retValue = callMethod(klass, "equals", argTypes, term61119, args);
        assertTrue(recursiveEquals(term61119, term61999));
        assertTrue(recursiveEquals(term61119, term62000));
        assertTrue(recursiveEquals(retValue, true));
    }

};


