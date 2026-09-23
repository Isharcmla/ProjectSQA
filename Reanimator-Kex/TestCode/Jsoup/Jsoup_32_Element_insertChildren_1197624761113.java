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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Element_insertChildren_1197624761113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;
     Object term1685;

    public Element_insertChildren_1197624761113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1683 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1683, term1683.getClass(), "tag", null);
        setField(term1683, term1683.getClass(), "classNames", null);
        setField(term1683, term1683.getClass(), "parentNode", null);
        setField(term1683, term1683.getClass(), "childNodes", null);
        setField(term1683, term1683.getClass(), "attributes", null);
        setField(term1683, term1683.getClass(), "baseUri", null);
        setIntField(term1683, term1683.getClass(), "siblingIndex", 0);
        term1685 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term1685;
        args[1] = null;
        try {
            callMethod(klass, "insertChildren", argTypes, term1683, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


