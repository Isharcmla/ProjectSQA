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

public class FormElement_formData_212170994233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59461;
     Object term59528;
     Object term59519;

    public FormElement_formData_212170994233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59461 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59517 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term59461, term59461.getClass(), "elements", term59517);
        term59528 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59529 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term59529, term59529.getClass(), "elementData", null);
        setIntField(term59529, term59529.getClass(), "size", 0);
        setIntField(term59529, term59529.getClass(), "modCount", 0);
        setField(term59528, term59528.getClass(), "elements", term59529);
        setField(term59528, term59528.getClass(), "tag", null);
        setField(term59528, term59528.getClass(), "shadowChildrenRef", null);
        setField(term59528, term59528.getClass(), "childNodes", null);
        setField(term59528, term59528.getClass(), "attributes", null);
        setField(term59528, term59528.getClass(), "baseUri", null);
        setField(term59528, term59528.getClass(), "parentNode", null);
        setIntField(term59528, term59528.getClass(), "siblingIndex", 0);
        term59519 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term59461, args);
        assertTrue(recursiveEquals(term59461, term59528));
        assertTrue(recursiveEquals(retValue, term59519));
    }

};


