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

public class Element_before_697639493194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225981;

    public Element_before_697639493194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225981 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term225981, term225981.getClass(), "tag", null);
        setField(term225981, term225981.getClass(), "shadowChildrenRef", null);
        setField(term225981, term225981.getClass(), "childNodes", null);
        setField(term225981, term225981.getClass(), "attributes", null);
        setField(term225981, term225981.getClass(), "baseUri", null);
        setField(term225981, term225981.getClass(), "parentNode", null);
        setIntField(term225981, term225981.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "before", argTypes, term225981, args);
    }

};


