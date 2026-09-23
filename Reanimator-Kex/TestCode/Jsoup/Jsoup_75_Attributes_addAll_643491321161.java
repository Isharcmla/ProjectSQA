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

public class Attributes_addAll_643491321161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231950;
     Object term233607;
     Object term233608;

    public Attributes_addAll_643491321161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231950 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term231950, term231950.getClass(), "size", 0);
        term233607 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term233607, term233607.getClass(), "size", 0);
        setField(term233607, term233607.getClass(), "keys", null);
        setField(term233607, term233607.getClass(), "vals", null);
        term233608 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term233608, term233608.getClass(), "size", 0);
        setField(term233608, term233608.getClass(), "keys", null);
        setField(term233608, term233608.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term231950;
        callMethod(klass, "addAll", argTypes, term231950, args);
        assertTrue(recursiveEquals(term231950, term233607));
        assertTrue(recursiveEquals(term231950, term233608));
    }

};


