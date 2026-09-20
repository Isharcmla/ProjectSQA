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

public class Document_normalise_128386043072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47628;
     Object term47682;
     Object term48593;
     Object term48594;

    public Document_normalise_128386043072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47628 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term47734 = new ArrayList();
        term47682 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term47682, term47682.getClass(), "childNodes", term47734);
        term48593 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term48593, term48593.getClass(), "tag", null);
        setField(term48593, term48593.getClass(), "classNames", null);
        setField(term48593, term48593.getClass(), "parentNode", null);
        setField(term48593, term48593.getClass(), "childNodes", null);
        setField(term48593, term48593.getClass(), "attributes", null);
        setField(term48593, term48593.getClass(), "baseUri", null);
        ArrayList term48595 = new ArrayList();
        term48594 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term48594, term48594.getClass(), "tag", null);
        setField(term48594, term48594.getClass(), "classNames", null);
        setField(term48594, term48594.getClass(), "parentNode", null);
        setField(term48594, term48594.getClass(), "childNodes", term48595);
        setField(term48594, term48594.getClass(), "attributes", null);
        setField(term48594, term48594.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term47682;
        callMethod(klass, "normalise", argTypes, term47628, args);
        assertTrue(recursiveEquals(term47628, term48593));
        assertTrue(recursiveEquals(term47682, term48594));
    }

};
