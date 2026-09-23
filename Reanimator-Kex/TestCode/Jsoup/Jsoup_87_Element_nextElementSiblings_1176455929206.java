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
import java.lang.Boolean;

public class Element_nextElementSiblings_1176455929206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226005;
     Object term226007;

    public Element_nextElementSiblings_1176455929206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226005 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term226005, term226005.getClass(), "tag", null);
        setField(term226005, term226005.getClass(), "shadowChildrenRef", null);
        setField(term226005, term226005.getClass(), "childNodes", null);
        setField(term226005, term226005.getClass(), "attributes", null);
        setField(term226005, term226005.getClass(), "baseUri", null);
        setField(term226005, term226005.getClass(), "parentNode", null);
        setIntField(term226005, term226005.getClass(), "siblingIndex", 0);
        term226007 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term226007;
        callMethod(klass, "nextElementSiblings", argTypes, term226005, args);
    }

};


