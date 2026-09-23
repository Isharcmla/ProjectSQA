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

public class Element_getElementsMatchingText_694257764149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5855;

    public Element_getElementsMatchingText_694257764149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5855 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term5855, term5855.getClass(), "tag", null);
        setField(term5855, term5855.getClass(), "classNames", null);
        setField(term5855, term5855.getClass(), "parentNode", null);
        setField(term5855, term5855.getClass(), "childNodes", null);
        setField(term5855, term5855.getClass(), "attributes", null);
        setField(term5855, term5855.getClass(), "baseUri", null);
        setIntField(term5855, term5855.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getElementsMatchingText", argTypes, term5855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


