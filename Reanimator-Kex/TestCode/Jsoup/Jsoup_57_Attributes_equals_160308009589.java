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

public class Attributes_equals_160308009589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20296;
     Object term20300;
     Object term20301;

    public Attributes_equals_160308009589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20296 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term20300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20300, term20300.getClass(), "attributes", null);
        term20301 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20301, term20301.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20296;
        Object retValue = callMethod(klass, "equals", argTypes, term20296, args);
        assertTrue(recursiveEquals(term20296, term20300));
        assertTrue(recursiveEquals(term20296, term20301));
        assertTrue(recursiveEquals(retValue, true));
    }

};


