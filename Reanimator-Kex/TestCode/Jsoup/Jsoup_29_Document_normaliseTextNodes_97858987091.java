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
import java.lang.Object;

public class Document_normaliseTextNodes_97858987091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44400;
     Object term44454;
     Object term44527;
     Object term44528;

    public Document_normaliseTextNodes_97858987091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44400 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term44506 = new ArrayList();
        ((ArrayList) term44506).add((Object)null);
        ((ArrayList) term44506).add((Object)null);
        ((ArrayList) term44506).add((Object)null);
        ((ArrayList) term44506).add((Object)null);
        ((ArrayList) term44506).add((Object)null);
        term44454 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term44454, term44454.getClass(), "childNodes", term44506);
        term44527 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term44527, term44527.getClass(), "outputSettings", null);
        setField(term44527, term44527.getClass(), "quirksMode", null);
        setField(term44527, term44527.getClass(), "tag", null);
        setField(term44527, term44527.getClass(), "classNames", null);
        setField(term44527, term44527.getClass(), "parentNode", null);
        setField(term44527, term44527.getClass(), "childNodes", null);
        setField(term44527, term44527.getClass(), "attributes", null);
        setField(term44527, term44527.getClass(), "baseUri", null);
        setIntField(term44527, term44527.getClass(), "siblingIndex", 0);
        ArrayList term44529 = new ArrayList();
        ((ArrayList) term44529).add((Object)null);
        ((ArrayList) term44529).add((Object)null);
        ((ArrayList) term44529).add((Object)null);
        ((ArrayList) term44529).add((Object)null);
        ((ArrayList) term44529).add((Object)null);
        term44528 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term44528, term44528.getClass(), "outputSettings", null);
        setField(term44528, term44528.getClass(), "quirksMode", null);
        setField(term44528, term44528.getClass(), "tag", null);
        setField(term44528, term44528.getClass(), "classNames", null);
        setField(term44528, term44528.getClass(), "parentNode", null);
        setField(term44528, term44528.getClass(), "childNodes", term44529);
        setField(term44528, term44528.getClass(), "attributes", null);
        setField(term44528, term44528.getClass(), "baseUri", null);
        setIntField(term44528, term44528.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term44454;
        callMethod(klass, "normaliseTextNodes", argTypes, term44400, args);
        assertTrue(recursiveEquals(term44400, term44527));
        assertTrue(recursiveEquals(term44454, term44528));
    }

};


