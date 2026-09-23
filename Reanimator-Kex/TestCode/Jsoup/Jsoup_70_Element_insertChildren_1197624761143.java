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

public class Element_insertChildren_1197624761143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2392;
     Object term2394;

    public Element_insertChildren_1197624761143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2392 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term2392, term2392.getClass(), "tag", null);
        setField(term2392, term2392.getClass(), "shadowChildrenRef", null);
        setField(term2392, term2392.getClass(), "childNodes", null);
        setField(term2392, term2392.getClass(), "attributes", null);
        setField(term2392, term2392.getClass(), "baseUri", null);
        setField(term2392, term2392.getClass(), "parentNode", null);
        setIntField(term2392, term2392.getClass(), "siblingIndex", 0);
        term2394 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term2394;
        args[1] = null;
        try {
            callMethod(klass, "insertChildren", argTypes, term2392, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


