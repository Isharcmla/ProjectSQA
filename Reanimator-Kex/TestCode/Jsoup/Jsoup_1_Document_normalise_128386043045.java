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

public class Document_normalise_128386043045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23169;
     Object term23223;
     Object term28929;
     Object term28930;

    public Document_normalise_128386043045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23169 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term23275 = new ArrayList();
        ((ArrayList) term23275).add((Object)null);
        ((ArrayList) term23275).add((Object)null);
        ((ArrayList) term23275).add((Object)null);
        ((ArrayList) term23275).add((Object)null);
        ((ArrayList) term23275).add((Object)null);
        ((ArrayList) term23275).add((Object)null);
        term23223 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term23223, term23223.getClass(), "childNodes", term23275);
        term28929 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term28929, term28929.getClass(), "tag", null);
        setField(term28929, term28929.getClass(), "classNames", null);
        setField(term28929, term28929.getClass(), "parentNode", null);
        setField(term28929, term28929.getClass(), "childNodes", null);
        setField(term28929, term28929.getClass(), "attributes", null);
        setField(term28929, term28929.getClass(), "baseUri", null);
        ArrayList term28931 = new ArrayList();
        ((ArrayList) term28931).add((Object)null);
        ((ArrayList) term28931).add((Object)null);
        ((ArrayList) term28931).add((Object)null);
        ((ArrayList) term28931).add((Object)null);
        ((ArrayList) term28931).add((Object)null);
        ((ArrayList) term28931).add((Object)null);
        term28930 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term28930, term28930.getClass(), "tag", null);
        setField(term28930, term28930.getClass(), "classNames", null);
        setField(term28930, term28930.getClass(), "parentNode", null);
        setField(term28930, term28930.getClass(), "childNodes", term28931);
        setField(term28930, term28930.getClass(), "attributes", null);
        setField(term28930, term28930.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term23223;
        callMethod(klass, "normalise", argTypes, term23169, args);
        assertTrue(recursiveEquals(term23169, term28929));
        assertTrue(recursiveEquals(term23223, term28930));
    }

};
