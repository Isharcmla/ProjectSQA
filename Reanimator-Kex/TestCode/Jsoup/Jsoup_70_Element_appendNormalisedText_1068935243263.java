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

public class Element_appendNormalisedText_1068935243263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295741;

    public Element_appendNormalisedText_1068935243263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295741 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term295741, term295741.getClass(), "tag", null);
        setField(term295741, term295741.getClass(), "shadowChildrenRef", null);
        setField(term295741, term295741.getClass(), "childNodes", null);
        setField(term295741, term295741.getClass(), "attributes", null);
        setField(term295741, term295741.getClass(), "baseUri", null);
        setField(term295741, term295741.getClass(), "parentNode", null);
        setIntField(term295741, term295741.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "appendNormalisedText", argTypes, term295741, args);
    }

};


