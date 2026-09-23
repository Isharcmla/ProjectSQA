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

public class FormElement_formData_212170994222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6480;
     Object term6854;
     Object term6845;

    public FormElement_formData_212170994222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6480 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term6536 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term6480, term6480.getClass(), "elements", term6536);
        term6854 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term6855 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term6855, term6855.getClass(), "elementData", null);
        setIntField(term6855, term6855.getClass(), "size", 0);
        setIntField(term6855, term6855.getClass(), "modCount", 0);
        setField(term6854, term6854.getClass(), "elements", term6855);
        setField(term6854, term6854.getClass(), "tag", null);
        setField(term6854, term6854.getClass(), "shadowChildrenRef", null);
        setField(term6854, term6854.getClass(), "childNodes", null);
        setField(term6854, term6854.getClass(), "attributes", null);
        setField(term6854, term6854.getClass(), "baseUri", null);
        setField(term6854, term6854.getClass(), "parentNode", null);
        setIntField(term6854, term6854.getClass(), "siblingIndex", 0);
        term6845 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term6480, args);
        assertTrue(recursiveEquals(term6480, term6854));
        assertTrue(recursiveEquals(retValue, term6845));
    }

};


