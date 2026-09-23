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

public class Attributes_remove_290363942393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7281705;
     Object term7281798;

    public Attributes_remove_290363942393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7281705 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7281602 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term7281705, term7281705.getClass(), "size", 1);
        setElement(term7281602, 0, "");
        setField(term7281705, term7281705.getClass(), "keys", term7281602);
        setField(term7281705, term7281705.getClass(), "vals", term7281602);
        term7281798 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7281799 = (Object[]) newArray("java.lang.String", 489);
        Object[] term7281800 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term7281798, term7281798.getClass(), "size", 0);
        setField(term7281798, term7281798.getClass(), "keys", term7281799);
        setField(term7281798, term7281798.getClass(), "vals", term7281800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term7281705, args);
        assertTrue(recursiveEquals(term7281705, term7281798));
    }

};


