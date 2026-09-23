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

public class Element_appendNormalisedText_106893524384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6539;
     Object term6559;

    public Element_appendNormalisedText_106893524384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6539 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6540 = (byte[]) newByteArray(16);
        setField(term6539, term6539.getClass(), "value", term6540);
        setByteField(term6539, term6539.getClass(), "coder", (byte) 48);
        setIntField(term6539, term6539.getClass(), "count", 1684998508);
        term6559 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6560 = newInstance(Class.forName("java.lang.Object"));
        setField(term6559, term6559.getClass(), "value", term6560);
        setField(term6559, term6559.getClass(), "parentNode", null);
        setIntField(term6559, term6559.getClass(), "siblingIndex", -1476644457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6539;
        args[1] = term6559;
        callMethod(klass, "appendNormalisedText", argTypes, null, args);
    }

};


