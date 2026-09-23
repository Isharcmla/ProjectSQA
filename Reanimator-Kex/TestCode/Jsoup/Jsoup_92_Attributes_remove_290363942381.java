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

public class Attributes_remove_290363942381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6794972;
     Object term8089625;

    public Attributes_remove_290363942381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6794972 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6794270 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term6794972, term6794972.getClass(), "size", 11);
        setField(term6794972, term6794972.getClass(), "keys", term6794270);
        term8089625 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8089655 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term8089625, term8089625.getClass(), "size", 11);
        setField(term8089625, term8089625.getClass(), "keys", term8089655);
        setField(term8089625, term8089625.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term6794972, args);
        assertTrue(recursiveEquals(term6794972, term8089625));
    }

};


