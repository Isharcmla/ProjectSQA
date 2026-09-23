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

public class Attribute_equals_1077004087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148187;
     Object term148191;
     Object term148192;

    public Attribute_equals_1077004087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148187 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term148191 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148191, term148191.getClass(), "key", null);
        setField(term148191, term148191.getClass(), "val", null);
        setField(term148191, term148191.getClass(), "parent", null);
        term148192 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148192, term148192.getClass(), "key", null);
        setField(term148192, term148192.getClass(), "val", null);
        setField(term148192, term148192.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148187;
        Object retValue = callMethod(klass, "equals", argTypes, term148187, args);
        assertTrue(recursiveEquals(term148187, term148191));
        assertTrue(recursiveEquals(term148187, term148192));
        assertTrue(recursiveEquals(retValue, true));
    }

};


