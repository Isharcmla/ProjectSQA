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

public class Element_data_1210266807149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82999;
     Object term84902;

    public Element_data_1210266807149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term83051 = new ArrayList();
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        ((ArrayList) term83051).add((Object)null);
        term82999 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term82999, term82999.getClass(), "childNodes", term83051);
        ArrayList term84903 = new ArrayList();
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        ((ArrayList) term84903).add((Object)null);
        term84902 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term84902, term84902.getClass(), "tag", null);
        setField(term84902, term84902.getClass(), "classNames", null);
        setField(term84902, term84902.getClass(), "parentNode", null);
        setField(term84902, term84902.getClass(), "childNodes", term84903);
        setField(term84902, term84902.getClass(), "attributes", null);
        setField(term84902, term84902.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "data", argTypes, term82999, args);
        assertTrue(recursiveEquals(term82999, term84902));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


