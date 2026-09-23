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

public class FormElement_formData_212170994238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13421;
     Object term22161;
     Object term22152;

    public FormElement_formData_212170994238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13421 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term13477 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term13421, term13421.getClass(), "elements", term13477);
        term22161 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term22162 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term22162, term22162.getClass(), "elementData", null);
        setIntField(term22162, term22162.getClass(), "size", 0);
        setIntField(term22162, term22162.getClass(), "modCount", 0);
        setField(term22161, term22161.getClass(), "elements", term22162);
        setField(term22161, term22161.getClass(), "tag", null);
        setField(term22161, term22161.getClass(), "parentNode", null);
        setField(term22161, term22161.getClass(), "childNodes", null);
        setField(term22161, term22161.getClass(), "attributes", null);
        setField(term22161, term22161.getClass(), "baseUri", null);
        setIntField(term22161, term22161.getClass(), "siblingIndex", 0);
        term22152 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term13421, args);
        assertTrue(recursiveEquals(term13421, term22161));
        assertTrue(recursiveEquals(retValue, term22152));
    }

};


