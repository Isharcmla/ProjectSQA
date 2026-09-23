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

public class FormElement_formData_212170994221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5062;
     Object term5129;
     Object term5120;

    public FormElement_formData_212170994221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5062 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term5118 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term5062, term5062.getClass(), "elements", term5118);
        term5129 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term5130 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term5130, term5130.getClass(), "elementData", null);
        setIntField(term5130, term5130.getClass(), "size", 0);
        setIntField(term5130, term5130.getClass(), "modCount", 0);
        setField(term5129, term5129.getClass(), "elements", term5130);
        setField(term5129, term5129.getClass(), "tag", null);
        setField(term5129, term5129.getClass(), "parentNode", null);
        setField(term5129, term5129.getClass(), "childNodes", null);
        setField(term5129, term5129.getClass(), "attributes", null);
        setField(term5129, term5129.getClass(), "baseUri", null);
        setIntField(term5129, term5129.getClass(), "siblingIndex", 0);
        term5120 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term5062, args);
        assertTrue(recursiveEquals(term5062, term5129));
        assertTrue(recursiveEquals(retValue, term5120));
    }

};


