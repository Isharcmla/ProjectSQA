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

public class Attributes_putIgnoreCase_1473599146232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704085;
     Object term949570;

    public Attributes_putIgnoreCase_1473599146232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704085 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term703969 = (Object[]) newArray("java.lang.String", 16);
        setIntField(term704085, term704085.getClass(), "size", 1);
        setField(term704085, term704085.getClass(), "keys", term703969);
        setField(term704085, term704085.getClass(), "vals", term703969);
        term949570 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term949571 = (Object[]) newArray("java.lang.String", 16);
        Object[] term949576 = (Object[]) newArray("java.lang.String", 16);
        setIntField(term949570, term949570.getClass(), "size", 2);
        setElement(term949571, 1, "                 ");
        setField(term949570, term949570.getClass(), "keys", term949571);
        setElement(term949576, 1, "                 ");
        setField(term949570, term949570.getClass(), "vals", term949576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "                 ";
        callMethod(klass, "putIgnoreCase", argTypes, term704085, args);
        assertTrue(recursiveEquals(term704085, term949570));
    }

};


