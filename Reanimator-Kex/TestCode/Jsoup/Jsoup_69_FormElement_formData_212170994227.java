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

public class FormElement_formData_212170994227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52259;
     Object term52326;
     Object term52317;

    public FormElement_formData_212170994227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52259 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52315 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term52259, term52259.getClass(), "elements", term52315);
        term52326 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52327 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term52327, term52327.getClass(), "elementData", null);
        setIntField(term52327, term52327.getClass(), "size", 0);
        setIntField(term52327, term52327.getClass(), "modCount", 0);
        setField(term52326, term52326.getClass(), "elements", term52327);
        setField(term52326, term52326.getClass(), "tag", null);
        setField(term52326, term52326.getClass(), "shadowChildrenRef", null);
        setField(term52326, term52326.getClass(), "childNodes", null);
        setField(term52326, term52326.getClass(), "attributes", null);
        setField(term52326, term52326.getClass(), "baseUri", null);
        setField(term52326, term52326.getClass(), "parentNode", null);
        setIntField(term52326, term52326.getClass(), "siblingIndex", 0);
        term52317 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term52259, args);
        assertTrue(recursiveEquals(term52259, term52326));
        assertTrue(recursiveEquals(retValue, term52317));
    }

};


