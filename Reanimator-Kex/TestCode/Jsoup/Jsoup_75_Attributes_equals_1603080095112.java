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

public class Attributes_equals_1603080095112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66735;
     Object term66803;
     Object term66938;
     Object term66939;

    public Attributes_equals_1603080095112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66735 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term66803 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        term66938 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term66938, term66938.getClass(), "size", 0);
        setField(term66938, term66938.getClass(), "keys", null);
        setField(term66938, term66938.getClass(), "vals", null);
        term66939 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        setField(term66939, term66939.getClass(), "req", null);
        setField(term66939, term66939.getClass(), "res", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66803;
        Object retValue = callMethod(klass, "equals", argTypes, term66735, args);
        assertTrue(recursiveEquals(term66735, term66938));
        assertTrue(recursiveEquals(term66803, term66939));
        assertTrue(recursiveEquals(retValue, false));
    }

};


