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

public class Document_normalise_128386043030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15058;
     Object term15112;
     Object term15191;
     Object term15192;

    public Document_normalise_128386043030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15058 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term15164 = new ArrayList();
        ((ArrayList) term15164).add((Object)null);
        ((ArrayList) term15164).add((Object)null);
        ((ArrayList) term15164).add((Object)null);
        ((ArrayList) term15164).add((Object)null);
        term15112 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term15112, term15112.getClass(), "childNodes", term15164);
        term15191 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term15191, term15191.getClass(), "tag", null);
        setField(term15191, term15191.getClass(), "classNames", null);
        setField(term15191, term15191.getClass(), "parentNode", null);
        setField(term15191, term15191.getClass(), "childNodes", null);
        setField(term15191, term15191.getClass(), "attributes", null);
        setField(term15191, term15191.getClass(), "baseUri", null);
        ArrayList term15193 = new ArrayList();
        ((ArrayList) term15193).add((Object)null);
        ((ArrayList) term15193).add((Object)null);
        ((ArrayList) term15193).add((Object)null);
        ((ArrayList) term15193).add((Object)null);
        term15192 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term15192, term15192.getClass(), "tag", null);
        setField(term15192, term15192.getClass(), "classNames", null);
        setField(term15192, term15192.getClass(), "parentNode", null);
        setField(term15192, term15192.getClass(), "childNodes", term15193);
        setField(term15192, term15192.getClass(), "attributes", null);
        setField(term15192, term15192.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term15112;
        callMethod(klass, "normalise", argTypes, term15058, args);
        assertTrue(recursiveEquals(term15058, term15191));
        assertTrue(recursiveEquals(term15112, term15192));
    }

};
