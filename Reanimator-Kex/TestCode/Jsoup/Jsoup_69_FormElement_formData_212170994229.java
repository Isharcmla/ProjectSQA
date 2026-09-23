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

public class FormElement_formData_212170994229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52910;
     Object term52977;
     Object term52968;

    public FormElement_formData_212170994229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52910 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52966 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term52910, term52910.getClass(), "elements", term52966);
        term52977 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52978 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term52978, term52978.getClass(), "elementData", null);
        setIntField(term52978, term52978.getClass(), "size", 0);
        setIntField(term52978, term52978.getClass(), "modCount", 0);
        setField(term52977, term52977.getClass(), "elements", term52978);
        setField(term52977, term52977.getClass(), "tag", null);
        setField(term52977, term52977.getClass(), "shadowChildrenRef", null);
        setField(term52977, term52977.getClass(), "childNodes", null);
        setField(term52977, term52977.getClass(), "attributes", null);
        setField(term52977, term52977.getClass(), "baseUri", null);
        setField(term52977, term52977.getClass(), "parentNode", null);
        setIntField(term52977, term52977.getClass(), "siblingIndex", 0);
        term52968 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term52910, args);
        assertTrue(recursiveEquals(term52910, term52977));
        assertTrue(recursiveEquals(retValue, term52968));
    }

};


