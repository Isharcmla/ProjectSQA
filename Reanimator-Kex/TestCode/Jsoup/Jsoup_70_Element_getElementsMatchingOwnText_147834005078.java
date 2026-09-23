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

public class Element_getElementsMatchingOwnText_147834005078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6144;

    public Element_getElementsMatchingOwnText_147834005078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6144 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term6144, term6144.getClass(), "tag", null);
        setField(term6144, term6144.getClass(), "shadowChildrenRef", null);
        setField(term6144, term6144.getClass(), "childNodes", null);
        setField(term6144, term6144.getClass(), "attributes", null);
        setField(term6144, term6144.getClass(), "baseUri", null);
        setField(term6144, term6144.getClass(), "parentNode", null);
        setIntField(term6144, term6144.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term6144, args);
    }

};


