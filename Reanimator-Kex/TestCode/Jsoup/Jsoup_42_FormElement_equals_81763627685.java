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

public class FormElement_equals_81763627685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40868;
     Object term40898;
     Object term40976;
     Object term40977;

    public FormElement_equals_81763627685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40868 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term40868, term40868.getClass(), "childNodes", null);
        setField(term40868, term40868.getClass(), "attributes", null);
        term40898 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40956 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term40898, term40898.getClass(), "childNodes", null);
        setField(term40898, term40898.getClass(), "attributes", term40956);
        term40976 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term40976, term40976.getClass(), "elements", null);
        setField(term40976, term40976.getClass(), "tag", null);
        setField(term40976, term40976.getClass(), "parentNode", null);
        setField(term40976, term40976.getClass(), "childNodes", null);
        setField(term40976, term40976.getClass(), "attributes", null);
        setField(term40976, term40976.getClass(), "baseUri", null);
        setIntField(term40976, term40976.getClass(), "siblingIndex", 0);
        term40977 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40978 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term40977, term40977.getClass(), "elements", null);
        setField(term40977, term40977.getClass(), "tag", null);
        setField(term40977, term40977.getClass(), "parentNode", null);
        setField(term40977, term40977.getClass(), "childNodes", null);
        setField(term40978, term40978.getClass(), "attributes", null);
        setField(term40977, term40977.getClass(), "attributes", term40978);
        setField(term40977, term40977.getClass(), "baseUri", null);
        setIntField(term40977, term40977.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40898;
        callMethod(klass, "equals", argTypes, term40868, args);
        assertTrue(recursiveEquals(term40868, term40976));
        assertTrue(recursiveEquals(term40898, term40977));
    }

};


