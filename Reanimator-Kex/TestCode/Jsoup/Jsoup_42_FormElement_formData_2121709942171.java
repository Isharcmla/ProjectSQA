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

public class FormElement_formData_2121709942171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72950;
     Object term73017;
     Object term73008;

    public FormElement_formData_2121709942171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72950 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term73006 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term72950, term72950.getClass(), "elements", term73006);
        term73017 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term73018 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term73018, term73018.getClass(), "elementData", null);
        setIntField(term73018, term73018.getClass(), "size", 0);
        setIntField(term73018, term73018.getClass(), "modCount", 0);
        setField(term73017, term73017.getClass(), "elements", term73018);
        setField(term73017, term73017.getClass(), "tag", null);
        setField(term73017, term73017.getClass(), "parentNode", null);
        setField(term73017, term73017.getClass(), "childNodes", null);
        setField(term73017, term73017.getClass(), "attributes", null);
        setField(term73017, term73017.getClass(), "baseUri", null);
        setIntField(term73017, term73017.getClass(), "siblingIndex", 0);
        term73008 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term72950, args);
        assertTrue(recursiveEquals(term72950, term73017));
        assertTrue(recursiveEquals(retValue, term73008));
    }

};


