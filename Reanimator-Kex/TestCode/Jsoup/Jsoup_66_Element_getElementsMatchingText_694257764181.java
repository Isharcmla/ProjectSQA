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

public class Element_getElementsMatchingText_694257764181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5866;

    public Element_getElementsMatchingText_694257764181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5866 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term5866, term5866.getClass(), "tag", null);
        setField(term5866, term5866.getClass(), "shadowChildrenRef", null);
        setField(term5866, term5866.getClass(), "childNodes", null);
        setField(term5866, term5866.getClass(), "attributes", null);
        setField(term5866, term5866.getClass(), "baseUri", null);
        setField(term5866, term5866.getClass(), "parentNode", null);
        setIntField(term5866, term5866.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getElementsMatchingText", argTypes, term5866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


