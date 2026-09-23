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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_28062925348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5574226;
     Object term6310684;
     Object term6310679;

    public Attributes_put_28062925348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5574226 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5572240 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term5574226, term5574226.getClass(), "size", 9);
        setField(term5574226, term5574226.getClass(), "keys", term5572240);
        term6310684 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6310685 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term6310684, term6310684.getClass(), "size", 9);
        setField(term6310684, term6310684.getClass(), "keys", term6310685);
        setField(term6310684, term6310684.getClass(), "vals", null);
        term6310679 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6310681 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term6310679, term6310679.getClass(), "size", 9);
        setField(term6310679, term6310679.getClass(), "keys", term6310681);
        setField(term6310679, term6310679.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term5574226, args);
        assertTrue(recursiveEquals(term5574226, term6310684));
        assertTrue(recursiveEquals(retValue, term6310679));
    }

};


