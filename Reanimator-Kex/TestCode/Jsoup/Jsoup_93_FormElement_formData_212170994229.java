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
     Object term19988;
     Object term20055;
     Object term20046;

    public FormElement_formData_212170994229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19988 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term20044 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term19988, term19988.getClass(), "elements", term20044);
        term20055 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term20056 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term20056, term20056.getClass(), "elementData", null);
        setIntField(term20056, term20056.getClass(), "size", 0);
        setIntField(term20056, term20056.getClass(), "modCount", 0);
        setField(term20055, term20055.getClass(), "elements", term20056);
        setField(term20055, term20055.getClass(), "tag", null);
        setField(term20055, term20055.getClass(), "shadowChildrenRef", null);
        setField(term20055, term20055.getClass(), "childNodes", null);
        setField(term20055, term20055.getClass(), "attributes", null);
        setField(term20055, term20055.getClass(), "baseUri", null);
        setField(term20055, term20055.getClass(), "parentNode", null);
        setIntField(term20055, term20055.getClass(), "siblingIndex", 0);
        term20046 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term19988, args);
        assertTrue(recursiveEquals(term19988, term20055));
        assertTrue(recursiveEquals(retValue, term20046));
    }

};


