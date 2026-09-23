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

public class Document_normaliseTextNodes_97858987095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47444;
     Object term47498;
     Object term47689;
     Object term47690;

    public Document_normaliseTextNodes_97858987095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47444 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term47550 = new ArrayList();
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        ((ArrayList) term47550).add((Object)null);
        term47498 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term47498, term47498.getClass(), "childNodes", term47550);
        term47689 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term47689, term47689.getClass(), "outputSettings", null);
        setField(term47689, term47689.getClass(), "quirksMode", null);
        setField(term47689, term47689.getClass(), "tag", null);
        setField(term47689, term47689.getClass(), "classNames", null);
        setField(term47689, term47689.getClass(), "parentNode", null);
        setField(term47689, term47689.getClass(), "childNodes", null);
        setField(term47689, term47689.getClass(), "attributes", null);
        setField(term47689, term47689.getClass(), "baseUri", null);
        setIntField(term47689, term47689.getClass(), "siblingIndex", 0);
        ArrayList term47691 = new ArrayList();
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        ((ArrayList) term47691).add((Object)null);
        term47690 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term47690, term47690.getClass(), "outputSettings", null);
        setField(term47690, term47690.getClass(), "quirksMode", null);
        setField(term47690, term47690.getClass(), "tag", null);
        setField(term47690, term47690.getClass(), "classNames", null);
        setField(term47690, term47690.getClass(), "parentNode", null);
        setField(term47690, term47690.getClass(), "childNodes", term47691);
        setField(term47690, term47690.getClass(), "attributes", null);
        setField(term47690, term47690.getClass(), "baseUri", null);
        setIntField(term47690, term47690.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term47498;
        callMethod(klass, "normaliseTextNodes", argTypes, term47444, args);
        assertTrue(recursiveEquals(term47444, term47689));
        assertTrue(recursiveEquals(term47498, term47690));
    }

};


