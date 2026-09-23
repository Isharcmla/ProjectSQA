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

public class Attributes_addAll_643491321570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14518220;
     Object term14518278;
     Object term14638850;
     Object term14638860;

    public Attributes_addAll_643491321570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14518220 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14518126 = (Object[]) newArray("java.lang.String", 745);
        setIntField(term14518220, term14518220.getClass(), "size", -2147483522);
        setField(term14518220, term14518220.getClass(), "keys", term14518126);
        term14518278 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term14518278, term14518278.getClass(), "size", -2147483518);
        term14638850 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14638853 = (Object[]) newArray("java.lang.String", 745);
        setIntField(term14638850, term14638850.getClass(), "size", -2147483522);
        setField(term14638850, term14638850.getClass(), "keys", term14638853);
        setField(term14638850, term14638850.getClass(), "vals", null);
        term14638860 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term14638860, term14638860.getClass(), "size", -2147483518);
        setField(term14638860, term14638860.getClass(), "keys", null);
        setField(term14638860, term14638860.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term14518278;
        callMethod(klass, "addAll", argTypes, term14518220, args);
        assertTrue(recursiveEquals(term14518220, term14638850));
        assertTrue(recursiveEquals(term14518278, term14638860));
    }

};


