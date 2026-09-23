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

public class Attributes_remove_290363942515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14318213;
     Object term14318315;

    public Attributes_remove_290363942515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14318213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14316553 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term14318213, term14318213.getClass(), "size", 5);
        setElement(term14316553, 2, "");
        setField(term14318213, term14318213.getClass(), "keys", term14316553);
        term14318315 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14318316 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term14318315, term14318315.getClass(), "size", 5);
        setElement(term14318316, 2, "");
        setField(term14318315, term14318315.getClass(), "keys", term14318316);
        setField(term14318315, term14318315.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  ";
        callMethod(klass, "remove", argTypes, term14318213, args);
        assertTrue(recursiveEquals(term14318213, term14318315));
    }

};


