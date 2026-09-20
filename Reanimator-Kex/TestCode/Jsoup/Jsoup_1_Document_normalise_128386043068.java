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

public class Document_normalise_128386043068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43616;
     Object term43670;
     Object term45158;
     Object term45159;

    public Document_normalise_128386043068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43616 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term43722 = new ArrayList();
        ((ArrayList) term43722).add((Object)null);
        ((ArrayList) term43722).add((Object)null);
        ((ArrayList) term43722).add((Object)null);
        term43670 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term43670, term43670.getClass(), "childNodes", term43722);
        term45158 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term45158, term45158.getClass(), "tag", null);
        setField(term45158, term45158.getClass(), "classNames", null);
        setField(term45158, term45158.getClass(), "parentNode", null);
        setField(term45158, term45158.getClass(), "childNodes", null);
        setField(term45158, term45158.getClass(), "attributes", null);
        setField(term45158, term45158.getClass(), "baseUri", null);
        ArrayList term45160 = new ArrayList();
        ((ArrayList) term45160).add((Object)null);
        ((ArrayList) term45160).add((Object)null);
        ((ArrayList) term45160).add((Object)null);
        term45159 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term45159, term45159.getClass(), "tag", null);
        setField(term45159, term45159.getClass(), "classNames", null);
        setField(term45159, term45159.getClass(), "parentNode", null);
        setField(term45159, term45159.getClass(), "childNodes", term45160);
        setField(term45159, term45159.getClass(), "attributes", null);
        setField(term45159, term45159.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term43670;
        callMethod(klass, "normalise", argTypes, term43616, args);
        assertTrue(recursiveEquals(term43616, term45158));
        assertTrue(recursiveEquals(term43670, term45159));
    }

};
