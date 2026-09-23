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
import java.util.ArrayList;

public class FormElement_formData_212170994237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31244;
     Object term31311;
     Object term31302;

    public FormElement_formData_212170994237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31244 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term31300 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term31244, term31244.getClass(), "elements", term31300);
        term31311 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term31312 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term31312, term31312.getClass(), "elementData", null);
        setIntField(term31312, term31312.getClass(), "size", 0);
        setIntField(term31312, term31312.getClass(), "modCount", 0);
        setField(term31311, term31311.getClass(), "elements", term31312);
        setField(term31311, term31311.getClass(), "tag", null);
        setField(term31311, term31311.getClass(), "shadowChildrenRef", null);
        setField(term31311, term31311.getClass(), "childNodes", null);
        setField(term31311, term31311.getClass(), "attributes", null);
        setField(term31311, term31311.getClass(), "baseUri", null);
        setField(term31311, term31311.getClass(), "parentNode", null);
        setIntField(term31311, term31311.getClass(), "siblingIndex", 0);
        term31302 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term31244, args);
        assertTrue(recursiveEquals(term31244, term31311));
        assertTrue(recursiveEquals(retValue, term31302));
    }

};


