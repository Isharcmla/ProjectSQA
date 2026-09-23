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

public class Attributes_indexOfKey_19384242884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62607;
     Object term62770;

    public Attributes_indexOfKey_19384242884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62607 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62535 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term62607, term62607.getClass(), "size", 1);
        setField(term62607, term62607.getClass(), "keys", term62535);
        term62770 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62771 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term62770, term62770.getClass(), "size", 1);
        setField(term62770, term62770.getClass(), "keys", term62771);
        setField(term62770, term62770.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term62607, args);
        assertTrue(recursiveEquals(term62607, term62770));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


