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

public class Attributes_equals_160308009592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63573;
     Object term63649;
     Object term64045;
     Object term64046;

    public Attributes_equals_160308009592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63573 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term63649 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        term64045 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term64045, term64045.getClass(), "size", 0);
        setField(term64045, term64045.getClass(), "keys", null);
        setField(term64045, term64045.getClass(), "vals", null);
        term64046 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        setField(term64046, term64046.getClass(), "val$file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63649;
        Object retValue = callMethod(klass, "equals", argTypes, term63573, args);
        assertTrue(recursiveEquals(term63573, term64045));
        assertTrue(recursiveEquals(term63649, term64046));
        assertTrue(recursiveEquals(retValue, false));
    }

};


