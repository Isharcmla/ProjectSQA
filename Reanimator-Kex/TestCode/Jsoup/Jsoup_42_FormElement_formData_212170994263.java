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

public class FormElement_formData_212170994263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34501;
     Object term34568;
     Object term34559;

    public FormElement_formData_212170994263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34501 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term34557 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term34501, term34501.getClass(), "elements", term34557);
        term34568 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term34569 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term34569, term34569.getClass(), "elementData", null);
        setIntField(term34569, term34569.getClass(), "size", 0);
        setIntField(term34569, term34569.getClass(), "modCount", 0);
        setField(term34568, term34568.getClass(), "elements", term34569);
        setField(term34568, term34568.getClass(), "tag", null);
        setField(term34568, term34568.getClass(), "parentNode", null);
        setField(term34568, term34568.getClass(), "childNodes", null);
        setField(term34568, term34568.getClass(), "attributes", null);
        setField(term34568, term34568.getClass(), "baseUri", null);
        setIntField(term34568, term34568.getClass(), "siblingIndex", 0);
        term34559 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term34501, args);
        assertTrue(recursiveEquals(term34501, term34568));
        assertTrue(recursiveEquals(retValue, term34559));
    }

};


