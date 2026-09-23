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

public class FormElement_equals_81763627649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29922;
     Object term30317;
     Object term30318;

    public FormElement_equals_81763627649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29922 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term30317 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term30317, term30317.getClass(), "elements", null);
        setField(term30317, term30317.getClass(), "tag", null);
        setField(term30317, term30317.getClass(), "parentNode", null);
        setField(term30317, term30317.getClass(), "childNodes", null);
        setField(term30317, term30317.getClass(), "attributes", null);
        setField(term30317, term30317.getClass(), "baseUri", null);
        setIntField(term30317, term30317.getClass(), "siblingIndex", 0);
        term30318 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term30318, term30318.getClass(), "elements", null);
        setField(term30318, term30318.getClass(), "tag", null);
        setField(term30318, term30318.getClass(), "parentNode", null);
        setField(term30318, term30318.getClass(), "childNodes", null);
        setField(term30318, term30318.getClass(), "attributes", null);
        setField(term30318, term30318.getClass(), "baseUri", null);
        setIntField(term30318, term30318.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29922;
        callMethod(klass, "equals", argTypes, term29922, args);
        assertTrue(recursiveEquals(term29922, term30317));
        assertTrue(recursiveEquals(term29922, term30318));
    }

};


