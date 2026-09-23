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

public class Element_empty_659299020198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225989;

    public Element_empty_659299020198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225989 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term225989, term225989.getClass(), "tag", null);
        setField(term225989, term225989.getClass(), "shadowChildrenRef", null);
        setField(term225989, term225989.getClass(), "childNodes", null);
        setField(term225989, term225989.getClass(), "attributes", null);
        setField(term225989, term225989.getClass(), "baseUri", null);
        setField(term225989, term225989.getClass(), "parentNode", null);
        setIntField(term225989, term225989.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "empty", argTypes, term225989, args);
    }

};


