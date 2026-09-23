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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FormElement_equals_81763627679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39053;
     Object term39129;

    public FormElement_equals_81763627679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39053 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term39099 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39053, term39053.getClass(), "childNodes", null);
        setField(term39053, term39053.getClass(), "attributes", null);
        setField(term39053, term39053.getClass(), "tag", term39099);
        term39129 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term39175 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39129, term39129.getClass(), "childNodes", null);
        setField(term39129, term39129.getClass(), "attributes", null);
        setField(term39129, term39129.getClass(), "tag", term39175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39129;
        try {
            callMethod(klass, "equals", argTypes, term39053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


