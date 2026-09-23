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
import java.lang.Object;

public class Attributes_normalize_703706418193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585611;
     Object term588342;

    public Attributes_normalize_703706418193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585611 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term585542 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term585611, term585611.getClass(), "size", 1);
        setField(term585611, term585611.getClass(), "keys", term585542);
        term588342 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term588343 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term588342, term588342.getClass(), "size", 1);
        setElement(term588343, 0, "");
        setField(term588342, term588342.getClass(), "keys", term588343);
        setField(term588342, term588342.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term585611, args);
        assertTrue(recursiveEquals(term585611, term588342));
    }

};


