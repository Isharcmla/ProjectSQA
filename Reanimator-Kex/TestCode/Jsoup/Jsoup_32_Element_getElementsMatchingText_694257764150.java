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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Element_getElementsMatchingText_694257764150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5743;

    public Element_getElementsMatchingText_694257764150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5743 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term5743, term5743.getClass(), "tag", null);
        setField(term5743, term5743.getClass(), "classNames", null);
        setField(term5743, term5743.getClass(), "parentNode", null);
        setField(term5743, term5743.getClass(), "childNodes", null);
        setField(term5743, term5743.getClass(), "attributes", null);
        setField(term5743, term5743.getClass(), "baseUri", null);
        setIntField(term5743, term5743.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getElementsMatchingText", argTypes, term5743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


