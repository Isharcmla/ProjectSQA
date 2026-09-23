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

public class Element_appendNormalisedText_1068935243178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29114;

    public Element_appendNormalisedText_1068935243178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29114 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term29114, term29114.getClass(), "tag", null);
        setField(term29114, term29114.getClass(), "classNames", null);
        setField(term29114, term29114.getClass(), "parentNode", null);
        setField(term29114, term29114.getClass(), "childNodes", null);
        setField(term29114, term29114.getClass(), "attributes", null);
        setField(term29114, term29114.getClass(), "baseUri", null);
        setIntField(term29114, term29114.getClass(), "siblingIndex", 0);
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
        callMethod(klass, "appendNormalisedText", argTypes, term29114, args);
    }

};


