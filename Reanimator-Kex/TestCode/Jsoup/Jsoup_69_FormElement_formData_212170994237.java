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
     Object term63816;
     Object term63883;
     Object term63874;

    public FormElement_formData_212170994237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63816 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63872 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term63816, term63816.getClass(), "elements", term63872);
        term63883 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63884 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term63884, term63884.getClass(), "elementData", null);
        setIntField(term63884, term63884.getClass(), "size", 0);
        setIntField(term63884, term63884.getClass(), "modCount", 0);
        setField(term63883, term63883.getClass(), "elements", term63884);
        setField(term63883, term63883.getClass(), "tag", null);
        setField(term63883, term63883.getClass(), "shadowChildrenRef", null);
        setField(term63883, term63883.getClass(), "childNodes", null);
        setField(term63883, term63883.getClass(), "attributes", null);
        setField(term63883, term63883.getClass(), "baseUri", null);
        setField(term63883, term63883.getClass(), "parentNode", null);
        setIntField(term63883, term63883.getClass(), "siblingIndex", 0);
        term63874 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term63816, args);
        assertTrue(recursiveEquals(term63816, term63883));
        assertTrue(recursiveEquals(retValue, term63874));
    }

};


