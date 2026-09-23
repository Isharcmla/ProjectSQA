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
import java.util.ArrayList;

public class FormElement_equals_81763627687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41286;
     Object term41368;
     Object term41389;
     Object term41392;

    public FormElement_equals_81763627687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term41338 = new ArrayList();
        term41286 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term41286, term41286.getClass(), "childNodes", term41338);
        term41368 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term41368, term41368.getClass(), "childNodes", null);
        ArrayList term41390 = new ArrayList();
        term41389 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term41389, term41389.getClass(), "elements", null);
        setField(term41389, term41389.getClass(), "tag", null);
        setField(term41389, term41389.getClass(), "parentNode", null);
        setField(term41389, term41389.getClass(), "childNodes", term41390);
        setField(term41389, term41389.getClass(), "attributes", null);
        setField(term41389, term41389.getClass(), "baseUri", null);
        setIntField(term41389, term41389.getClass(), "siblingIndex", 0);
        term41392 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term41392, term41392.getClass(), "elements", null);
        setField(term41392, term41392.getClass(), "tag", null);
        setField(term41392, term41392.getClass(), "parentNode", null);
        setField(term41392, term41392.getClass(), "childNodes", null);
        setField(term41392, term41392.getClass(), "attributes", null);
        setField(term41392, term41392.getClass(), "baseUri", null);
        setIntField(term41392, term41392.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41368;
        callMethod(klass, "equals", argTypes, term41286, args);
        assertTrue(recursiveEquals(term41286, term41389));
        assertTrue(recursiveEquals(term41368, term41392));
    }

};


