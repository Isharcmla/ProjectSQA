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

public class Document_normalise_128386043075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50345;
     Object term50399;
     Object term50693;
     Object term50694;

    public Document_normalise_128386043075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50345 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term50451 = new ArrayList();
        ((ArrayList) term50451).add((Object)null);
        ((ArrayList) term50451).add((Object)null);
        ((ArrayList) term50451).add((Object)null);
        ((ArrayList) term50451).add((Object)null);
        ((ArrayList) term50451).add((Object)null);
        term50399 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term50399, term50399.getClass(), "childNodes", term50451);
        term50693 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term50693, term50693.getClass(), "tag", null);
        setField(term50693, term50693.getClass(), "classNames", null);
        setField(term50693, term50693.getClass(), "parentNode", null);
        setField(term50693, term50693.getClass(), "childNodes", null);
        setField(term50693, term50693.getClass(), "attributes", null);
        setField(term50693, term50693.getClass(), "baseUri", null);
        ArrayList term50695 = new ArrayList();
        ((ArrayList) term50695).add((Object)null);
        ((ArrayList) term50695).add((Object)null);
        ((ArrayList) term50695).add((Object)null);
        ((ArrayList) term50695).add((Object)null);
        ((ArrayList) term50695).add((Object)null);
        term50694 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term50694, term50694.getClass(), "tag", null);
        setField(term50694, term50694.getClass(), "classNames", null);
        setField(term50694, term50694.getClass(), "parentNode", null);
        setField(term50694, term50694.getClass(), "childNodes", term50695);
        setField(term50694, term50694.getClass(), "attributes", null);
        setField(term50694, term50694.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term50399;
        callMethod(klass, "normalise", argTypes, term50345, args);
        assertTrue(recursiveEquals(term50345, term50693));
        assertTrue(recursiveEquals(term50399, term50694));
    }

};
