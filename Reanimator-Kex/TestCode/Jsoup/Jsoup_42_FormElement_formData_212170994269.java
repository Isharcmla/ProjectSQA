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

public class FormElement_formData_212170994269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35701;
     Object term35768;
     Object term35759;

    public FormElement_formData_212170994269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35701 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term35757 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term35701, term35701.getClass(), "elements", term35757);
        term35768 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term35769 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term35769, term35769.getClass(), "elementData", null);
        setIntField(term35769, term35769.getClass(), "size", 0);
        setIntField(term35769, term35769.getClass(), "modCount", 0);
        setField(term35768, term35768.getClass(), "elements", term35769);
        setField(term35768, term35768.getClass(), "tag", null);
        setField(term35768, term35768.getClass(), "parentNode", null);
        setField(term35768, term35768.getClass(), "childNodes", null);
        setField(term35768, term35768.getClass(), "attributes", null);
        setField(term35768, term35768.getClass(), "baseUri", null);
        setIntField(term35768, term35768.getClass(), "siblingIndex", 0);
        term35759 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term35701, args);
        assertTrue(recursiveEquals(term35701, term35768));
        assertTrue(recursiveEquals(retValue, term35759));
    }

};


