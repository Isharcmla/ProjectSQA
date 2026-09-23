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

public class Attributes_remove_290363942547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14499245;
     Object term14499433;

    public Attributes_remove_290363942547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14499245 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14497221 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term14499245, term14499245.getClass(), "size", 12);
        setElement(term14497221, 10, "                \u0001\u0001");
        setField(term14499245, term14499245.getClass(), "keys", term14497221);
        term14499433 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14499434 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term14499433, term14499433.getClass(), "size", 12);
        setElement(term14499434, 10, "                \u0001\u0001");
        setField(term14499433, term14499433.getClass(), "keys", term14499434);
        setField(term14499433, term14499433.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                \u0001\u0001\u0001\u0001";
        callMethod(klass, "remove", argTypes, term14499245, args);
        assertTrue(recursiveEquals(term14499245, term14499433));
    }

};


