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

public class Element_insertChildren_1197624761120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1712;
     Object term1714;

    public Element_insertChildren_1197624761120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1712 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1712, term1712.getClass(), "tag", null);
        setField(term1712, term1712.getClass(), "parentNode", null);
        setField(term1712, term1712.getClass(), "childNodes", null);
        setField(term1712, term1712.getClass(), "attributes", null);
        setField(term1712, term1712.getClass(), "baseUri", null);
        setIntField(term1712, term1712.getClass(), "siblingIndex", 0);
        term1714 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term1714;
        args[1] = null;
        try {
            callMethod(klass, "insertChildren", argTypes, term1712, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


