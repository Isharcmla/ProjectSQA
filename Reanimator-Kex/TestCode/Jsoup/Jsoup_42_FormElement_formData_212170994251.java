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

public class FormElement_formData_212170994251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30582;
     Object term30649;
     Object term30640;

    public FormElement_formData_212170994251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30582 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term30638 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term30582, term30582.getClass(), "elements", term30638);
        term30649 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term30650 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term30650, term30650.getClass(), "elementData", null);
        setIntField(term30650, term30650.getClass(), "size", 0);
        setIntField(term30650, term30650.getClass(), "modCount", 0);
        setField(term30649, term30649.getClass(), "elements", term30650);
        setField(term30649, term30649.getClass(), "tag", null);
        setField(term30649, term30649.getClass(), "parentNode", null);
        setField(term30649, term30649.getClass(), "childNodes", null);
        setField(term30649, term30649.getClass(), "attributes", null);
        setField(term30649, term30649.getClass(), "baseUri", null);
        setIntField(term30649, term30649.getClass(), "siblingIndex", 0);
        term30640 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term30582, args);
        assertTrue(recursiveEquals(term30582, term30649));
        assertTrue(recursiveEquals(retValue, term30640));
    }

};


