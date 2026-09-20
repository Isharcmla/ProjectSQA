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

public class Document_normalise_128386043077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50568;
     Object term50622;
     Object term51371;
     Object term51372;

    public Document_normalise_128386043077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50568 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term50674 = new ArrayList();
        ((ArrayList) term50674).add((Object)null);
        term50622 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term50622, term50622.getClass(), "childNodes", term50674);
        term51371 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term51371, term51371.getClass(), "tag", null);
        setField(term51371, term51371.getClass(), "classNames", null);
        setField(term51371, term51371.getClass(), "parentNode", null);
        setField(term51371, term51371.getClass(), "childNodes", null);
        setField(term51371, term51371.getClass(), "attributes", null);
        setField(term51371, term51371.getClass(), "baseUri", null);
        ArrayList term51373 = new ArrayList();
        ((ArrayList) term51373).add((Object)null);
        term51372 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term51372, term51372.getClass(), "tag", null);
        setField(term51372, term51372.getClass(), "classNames", null);
        setField(term51372, term51372.getClass(), "parentNode", null);
        setField(term51372, term51372.getClass(), "childNodes", term51373);
        setField(term51372, term51372.getClass(), "attributes", null);
        setField(term51372, term51372.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term50622;
        callMethod(klass, "normalise", argTypes, term50568, args);
        assertTrue(recursiveEquals(term50568, term51371));
        assertTrue(recursiveEquals(term50622, term51372));
    }

};
