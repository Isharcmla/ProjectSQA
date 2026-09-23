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

public class FormElement_equals_817636276109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48349;
     Object term48483;

    public FormElement_equals_817636276109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48349 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term48407 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term48453 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48349, term48349.getClass(), "childNodes", null);
        setField(term48407, term48407.getClass(), "attributes", null);
        setField(term48349, term48349.getClass(), "attributes", term48407);
        setField(term48349, term48349.getClass(), "tag", term48453);
        term48483 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term48541 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term48587 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48483, term48483.getClass(), "childNodes", null);
        setField(term48541, term48541.getClass(), "attributes", null);
        setField(term48483, term48483.getClass(), "attributes", term48541);
        setField(term48483, term48483.getClass(), "tag", term48587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48483;
        try {
            callMethod(klass, "equals", argTypes, term48349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


