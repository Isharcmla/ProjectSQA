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

public class Attributes_put_28062925456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10127036;
     Object term10861459;
     Object term10861304;

    public Attributes_put_28062925456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10127036 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10125009 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term10127036, term10127036.getClass(), "size", 14);
        setElement(term10125009, 0, "                                                                                                                  ");
        setElement(term10125009, 10, "                                ");
        setField(term10127036, term10127036.getClass(), "keys", term10125009);
        term10861459 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10861460 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term10861459, term10861459.getClass(), "size", 14);
        setElement(term10861460, 0, "                                                                                                                  ");
        setElement(term10861460, 10, "                                ");
        setField(term10861459, term10861459.getClass(), "keys", term10861460);
        setField(term10861459, term10861459.getClass(), "vals", null);
        term10861304 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10861306 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term10861304, term10861304.getClass(), "size", 14);
        setElement(term10861306, 0, "                                                                                                                  ");
        setElement(term10861306, 10, "                                ");
        setField(term10861304, term10861304.getClass(), "keys", term10861306);
        setField(term10861304, term10861304.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term10127036, args);
        assertTrue(recursiveEquals(term10127036, term10861459));
        assertTrue(recursiveEquals(retValue, term10861304));
    }

};


