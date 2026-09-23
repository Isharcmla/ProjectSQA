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

public class FormElement_formData_212170994218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5164;
     Object term5538;
     Object term5529;

    public FormElement_formData_212170994218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5164 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term5220 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term5164, term5164.getClass(), "elements", term5220);
        term5538 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term5539 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term5539, term5539.getClass(), "elementData", null);
        setIntField(term5539, term5539.getClass(), "size", 0);
        setIntField(term5539, term5539.getClass(), "modCount", 0);
        setField(term5538, term5538.getClass(), "elements", term5539);
        setField(term5538, term5538.getClass(), "tag", null);
        setField(term5538, term5538.getClass(), "shadowChildrenRef", null);
        setField(term5538, term5538.getClass(), "childNodes", null);
        setField(term5538, term5538.getClass(), "attributes", null);
        setField(term5538, term5538.getClass(), "baseUri", null);
        setField(term5538, term5538.getClass(), "parentNode", null);
        setIntField(term5538, term5538.getClass(), "siblingIndex", 0);
        term5529 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term5164, args);
        assertTrue(recursiveEquals(term5164, term5538));
        assertTrue(recursiveEquals(retValue, term5529));
    }

};


