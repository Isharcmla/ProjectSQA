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

public class Document_normalise_128386043038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18621;
     Object term18675;
     Object term21351;
     Object term21352;

    public Document_normalise_128386043038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18621 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term18727 = new ArrayList();
        ((ArrayList) term18727).add((Object)null);
        ((ArrayList) term18727).add((Object)null);
        term18675 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term18675, term18675.getClass(), "childNodes", term18727);
        term21351 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21351, term21351.getClass(), "tag", null);
        setField(term21351, term21351.getClass(), "classNames", null);
        setField(term21351, term21351.getClass(), "parentNode", null);
        setField(term21351, term21351.getClass(), "childNodes", null);
        setField(term21351, term21351.getClass(), "attributes", null);
        setField(term21351, term21351.getClass(), "baseUri", null);
        ArrayList term21353 = new ArrayList();
        ((ArrayList) term21353).add((Object)null);
        ((ArrayList) term21353).add((Object)null);
        term21352 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21352, term21352.getClass(), "tag", null);
        setField(term21352, term21352.getClass(), "classNames", null);
        setField(term21352, term21352.getClass(), "parentNode", null);
        setField(term21352, term21352.getClass(), "childNodes", term21353);
        setField(term21352, term21352.getClass(), "attributes", null);
        setField(term21352, term21352.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term18675;
        callMethod(klass, "normalise", argTypes, term18621, args);
        assertTrue(recursiveEquals(term18621, term21351));
        assertTrue(recursiveEquals(term18675, term21352));
    }

};
