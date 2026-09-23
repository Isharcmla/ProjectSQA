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
import java.util.ArrayList;

public class FormElement_equals_81763627681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39819;
     Object term39901;
     Object term39922;
     Object term39925;

    public FormElement_equals_81763627681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39871 = new ArrayList();
        term39819 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term39819, term39819.getClass(), "childNodes", term39871);
        term39901 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term39923 = new ArrayList();
        term39922 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term39922, term39922.getClass(), "elements", null);
        setField(term39922, term39922.getClass(), "tag", null);
        setField(term39922, term39922.getClass(), "parentNode", null);
        setField(term39922, term39922.getClass(), "childNodes", term39923);
        setField(term39922, term39922.getClass(), "attributes", null);
        setField(term39922, term39922.getClass(), "baseUri", null);
        setIntField(term39922, term39922.getClass(), "siblingIndex", 0);
        term39925 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term39925, term39925.getClass(), "elements", null);
        setField(term39925, term39925.getClass(), "tag", null);
        setField(term39925, term39925.getClass(), "parentNode", null);
        setField(term39925, term39925.getClass(), "childNodes", null);
        setField(term39925, term39925.getClass(), "attributes", null);
        setField(term39925, term39925.getClass(), "baseUri", null);
        setIntField(term39925, term39925.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39901;
        callMethod(klass, "equals", argTypes, term39819, args);
        assertTrue(recursiveEquals(term39819, term39922));
        assertTrue(recursiveEquals(term39901, term39925));
    }

};


