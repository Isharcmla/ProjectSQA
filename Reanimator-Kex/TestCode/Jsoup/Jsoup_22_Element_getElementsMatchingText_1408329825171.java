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

public class Element_getElementsMatchingText_1408329825171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29100;

    public Element_getElementsMatchingText_1408329825171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29100 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term29100, term29100.getClass(), "tag", null);
        setField(term29100, term29100.getClass(), "classNames", null);
        setField(term29100, term29100.getClass(), "parentNode", null);
        setField(term29100, term29100.getClass(), "childNodes", null);
        setField(term29100, term29100.getClass(), "attributes", null);
        setField(term29100, term29100.getClass(), "baseUri", null);
        setIntField(term29100, term29100.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getElementsMatchingText", argTypes, term29100, args);
    }

};


