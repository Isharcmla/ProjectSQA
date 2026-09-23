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

public class Attributes_remove_290363942486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10764554;
     Object term11742207;

    public Attributes_remove_290363942486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10764554 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10762569 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term10764554, term10764554.getClass(), "size", 9);
        setField(term10764554, term10764554.getClass(), "keys", term10762569);
        term11742207 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11742208 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term11742207, term11742207.getClass(), "size", 9);
        setField(term11742207, term11742207.getClass(), "keys", term11742208);
        setField(term11742207, term11742207.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term10764554, args);
        assertTrue(recursiveEquals(term10764554, term11742207));
    }

};


