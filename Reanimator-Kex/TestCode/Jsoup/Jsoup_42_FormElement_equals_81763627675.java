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

public class FormElement_equals_81763627675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37097;
     Object term37185;

    public FormElement_equals_81763627675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37097 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term37155 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37097, term37097.getClass(), "childNodes", null);
        setField(term37097, term37097.getClass(), "attributes", term37155);
        term37185 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term37243 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37185, term37185.getClass(), "childNodes", null);
        setField(term37185, term37185.getClass(), "attributes", term37243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37185;
        try {
            callMethod(klass, "equals", argTypes, term37097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


