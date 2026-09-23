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

public class Document_normaliseTextNodes_97858987041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20596;
     Object term20650;
     Object term21130;
     Object term21131;

    public Document_normaliseTextNodes_97858987041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20596 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term20702 = new ArrayList();
        ((ArrayList) term20702).add((Object)null);
        term20650 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term20650, term20650.getClass(), "childNodes", term20702);
        term21130 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21130, term21130.getClass(), "outputSettings", null);
        setField(term21130, term21130.getClass(), "quirksMode", null);
        setField(term21130, term21130.getClass(), "tag", null);
        setField(term21130, term21130.getClass(), "classNames", null);
        setField(term21130, term21130.getClass(), "parentNode", null);
        setField(term21130, term21130.getClass(), "childNodes", null);
        setField(term21130, term21130.getClass(), "attributes", null);
        setField(term21130, term21130.getClass(), "baseUri", null);
        setIntField(term21130, term21130.getClass(), "siblingIndex", 0);
        ArrayList term21132 = new ArrayList();
        ((ArrayList) term21132).add((Object)null);
        term21131 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21131, term21131.getClass(), "outputSettings", null);
        setField(term21131, term21131.getClass(), "quirksMode", null);
        setField(term21131, term21131.getClass(), "tag", null);
        setField(term21131, term21131.getClass(), "classNames", null);
        setField(term21131, term21131.getClass(), "parentNode", null);
        setField(term21131, term21131.getClass(), "childNodes", term21132);
        setField(term21131, term21131.getClass(), "attributes", null);
        setField(term21131, term21131.getClass(), "baseUri", null);
        setIntField(term21131, term21131.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term20650;
        callMethod(klass, "normaliseTextNodes", argTypes, term20596, args);
        assertTrue(recursiveEquals(term20596, term21130));
        assertTrue(recursiveEquals(term20650, term21131));
    }

};


