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

public class Attributes_addAll_643491321453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8785662;
     Object term8785720;
     Object term8786123;
     Object term8786125;

    public Attributes_addAll_643491321453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8785662 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8785568 = (Object[]) newArray("java.lang.String", 745);
        setIntField(term8785662, term8785662.getClass(), "size", -2147483522);
        setField(term8785662, term8785662.getClass(), "keys", term8785568);
        term8785720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term8785720, term8785720.getClass(), "size", -2147483518);
        term8786123 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8786124 = (Object[]) newArray("java.lang.String", 745);
        setIntField(term8786123, term8786123.getClass(), "size", -2147483522);
        setField(term8786123, term8786123.getClass(), "keys", term8786124);
        setField(term8786123, term8786123.getClass(), "vals", null);
        term8786125 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term8786125, term8786125.getClass(), "size", -2147483518);
        setField(term8786125, term8786125.getClass(), "keys", null);
        setField(term8786125, term8786125.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term8785720;
        callMethod(klass, "addAll", argTypes, term8785662, args);
        assertTrue(recursiveEquals(term8785662, term8786123));
        assertTrue(recursiveEquals(term8785720, term8786125));
    }

};


