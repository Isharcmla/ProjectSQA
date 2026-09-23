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

public class FormElement_formData_212170994247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60552;
     Object term60619;
     Object term60610;

    public FormElement_formData_212170994247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60552 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60608 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term60552, term60552.getClass(), "elements", term60608);
        term60619 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60620 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term60620, term60620.getClass(), "elementData", null);
        setIntField(term60620, term60620.getClass(), "size", 0);
        setIntField(term60620, term60620.getClass(), "modCount", 0);
        setField(term60619, term60619.getClass(), "elements", term60620);
        setField(term60619, term60619.getClass(), "tag", null);
        setField(term60619, term60619.getClass(), "shadowChildrenRef", null);
        setField(term60619, term60619.getClass(), "childNodes", null);
        setField(term60619, term60619.getClass(), "attributes", null);
        setField(term60619, term60619.getClass(), "baseUri", null);
        setField(term60619, term60619.getClass(), "parentNode", null);
        setIntField(term60619, term60619.getClass(), "siblingIndex", 0);
        term60610 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term60552, args);
        assertTrue(recursiveEquals(term60552, term60619));
        assertTrue(recursiveEquals(retValue, term60610));
    }

};


