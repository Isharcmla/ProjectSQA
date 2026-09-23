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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_1805879430224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226047;
     Object term226049;

    public Element_getElementsByIndexEquals_1805879430224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226047 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term226047, term226047.getClass(), "tag", null);
        setField(term226047, term226047.getClass(), "shadowChildrenRef", null);
        setField(term226047, term226047.getClass(), "childNodes", null);
        setField(term226047, term226047.getClass(), "attributes", null);
        setField(term226047, term226047.getClass(), "baseUri", null);
        setField(term226047, term226047.getClass(), "parentNode", null);
        setIntField(term226047, term226047.getClass(), "siblingIndex", 0);
        term226049 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term226049;
        callMethod(klass, "getElementsByIndexEquals", argTypes, term226047, args);
    }

};


