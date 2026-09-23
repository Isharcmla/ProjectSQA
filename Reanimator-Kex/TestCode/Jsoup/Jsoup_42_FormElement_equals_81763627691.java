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

public class FormElement_equals_81763627691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42359;
     Object term42389;
     Object term42462;
     Object term42463;

    public FormElement_equals_81763627691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42359 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term42359, term42359.getClass(), "childNodes", null);
        ArrayList term42441 = new ArrayList();
        term42389 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term42389, term42389.getClass(), "childNodes", term42441);
        term42462 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term42462, term42462.getClass(), "elements", null);
        setField(term42462, term42462.getClass(), "tag", null);
        setField(term42462, term42462.getClass(), "parentNode", null);
        setField(term42462, term42462.getClass(), "childNodes", null);
        setField(term42462, term42462.getClass(), "attributes", null);
        setField(term42462, term42462.getClass(), "baseUri", null);
        setIntField(term42462, term42462.getClass(), "siblingIndex", 0);
        ArrayList term42464 = new ArrayList();
        term42463 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term42463, term42463.getClass(), "elements", null);
        setField(term42463, term42463.getClass(), "tag", null);
        setField(term42463, term42463.getClass(), "parentNode", null);
        setField(term42463, term42463.getClass(), "childNodes", term42464);
        setField(term42463, term42463.getClass(), "attributes", null);
        setField(term42463, term42463.getClass(), "baseUri", null);
        setIntField(term42463, term42463.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42389;
        callMethod(klass, "equals", argTypes, term42359, args);
        assertTrue(recursiveEquals(term42359, term42462));
        assertTrue(recursiveEquals(term42389, term42463));
    }

};


