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
import java.lang.Object;

public class Element_appendNormalisedText_106893524388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6894;
     Object term6914;

    public Element_appendNormalisedText_106893524388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6894 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6895 = (byte[]) newByteArray(16);
        setField(term6894, term6894.getClass(), "value", term6895);
        setByteField(term6894, term6894.getClass(), "coder", (byte) 48);
        setIntField(term6894, term6894.getClass(), "count", -519881101);
        term6914 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6915 = newInstance(Class.forName("java.lang.Object"));
        setField(term6914, term6914.getClass(), "value", term6915);
        setField(term6914, term6914.getClass(), "parentNode", null);
        setIntField(term6914, term6914.getClass(), "siblingIndex", -680920524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6894;
        args[1] = term6914;
        callMethod(klass, "appendNormalisedText", argTypes, null, args);
    }

};


