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

public class Document_normaliseTextNodes_97858987053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24175;
     Object term24229;
     Object term24292;
     Object term24293;

    public Document_normaliseTextNodes_97858987053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24175 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term24281 = new ArrayList();
        term24229 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term24229, term24229.getClass(), "childNodes", term24281);
        term24292 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term24292, term24292.getClass(), "outputSettings", null);
        setField(term24292, term24292.getClass(), "quirksMode", null);
        setField(term24292, term24292.getClass(), "tag", null);
        setField(term24292, term24292.getClass(), "classNames", null);
        setField(term24292, term24292.getClass(), "parentNode", null);
        setField(term24292, term24292.getClass(), "childNodes", null);
        setField(term24292, term24292.getClass(), "attributes", null);
        setField(term24292, term24292.getClass(), "baseUri", null);
        setIntField(term24292, term24292.getClass(), "siblingIndex", 0);
        ArrayList term24294 = new ArrayList();
        term24293 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term24293, term24293.getClass(), "outputSettings", null);
        setField(term24293, term24293.getClass(), "quirksMode", null);
        setField(term24293, term24293.getClass(), "tag", null);
        setField(term24293, term24293.getClass(), "classNames", null);
        setField(term24293, term24293.getClass(), "parentNode", null);
        setField(term24293, term24293.getClass(), "childNodes", term24294);
        setField(term24293, term24293.getClass(), "attributes", null);
        setField(term24293, term24293.getClass(), "baseUri", null);
        setIntField(term24293, term24293.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term24229;
        callMethod(klass, "normaliseTextNodes", argTypes, term24175, args);
        assertTrue(recursiveEquals(term24175, term24292));
        assertTrue(recursiveEquals(term24229, term24293));
    }

};


