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

public class Attributes_remove_290363942511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11614048;
     Object term13867118;

    public Attributes_remove_290363942511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11614048 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11613766 = (Object[]) newArray("java.lang.String", 106);
        Object[] term11613779 = (Object[]) newArray("java.lang.String", 498);
        setIntField(term11614048, term11614048.getClass(), "size", 3);
        setElement(term11613766, 2, "  ");
        setField(term11614048, term11614048.getClass(), "keys", term11613766);
        setField(term11614048, term11614048.getClass(), "vals", term11613779);
        term13867118 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13867119 = (Object[]) newArray("java.lang.String", 106);
        Object[] term13867120 = (Object[]) newArray("java.lang.String", 498);
        setIntField(term13867118, term13867118.getClass(), "size", 2);
        setField(term13867118, term13867118.getClass(), "keys", term13867119);
        setField(term13867118, term13867118.getClass(), "vals", term13867120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  ";
        callMethod(klass, "remove", argTypes, term11614048, args);
        assertTrue(recursiveEquals(term11614048, term13867118));
    }

};


