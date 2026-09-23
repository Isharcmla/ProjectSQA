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

public class FormElement_formData_212170994235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60052;
     Object term60119;
     Object term60110;

    public FormElement_formData_212170994235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60052 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60108 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term60052, term60052.getClass(), "elements", term60108);
        term60119 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60120 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term60120, term60120.getClass(), "elementData", null);
        setIntField(term60120, term60120.getClass(), "size", 0);
        setIntField(term60120, term60120.getClass(), "modCount", 0);
        setField(term60119, term60119.getClass(), "elements", term60120);
        setField(term60119, term60119.getClass(), "tag", null);
        setField(term60119, term60119.getClass(), "shadowChildrenRef", null);
        setField(term60119, term60119.getClass(), "childNodes", null);
        setField(term60119, term60119.getClass(), "attributes", null);
        setField(term60119, term60119.getClass(), "baseUri", null);
        setField(term60119, term60119.getClass(), "parentNode", null);
        setIntField(term60119, term60119.getClass(), "siblingIndex", 0);
        term60110 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term60052, args);
        assertTrue(recursiveEquals(term60052, term60119));
        assertTrue(recursiveEquals(retValue, term60110));
    }

};


