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

public class Attributes_putIgnoreCase_1473599146388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7522209;
     Object term8275448;

    public Attributes_putIgnoreCase_1473599146388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7522209 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7522108 = (Object[]) newArray("java.lang.String", 128);
        Object[] term7522110 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term7522209, term7522209.getClass(), "size", 1);
        setElement(term7522108, 0, "");
        setField(term7522209, term7522209.getClass(), "keys", term7522108);
        setField(term7522209, term7522209.getClass(), "vals", term7522110);
        term8275448 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8275449 = (Object[]) newArray("java.lang.String", 128);
        Object[] term8275452 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term8275448, term8275448.getClass(), "size", 1);
        setElement(term8275449, 0, "");
        setField(term8275448, term8275448.getClass(), "keys", term8275449);
        setField(term8275448, term8275448.getClass(), "vals", term8275452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        callMethod(klass, "putIgnoreCase", argTypes, term7522209, args);
        assertTrue(recursiveEquals(term7522209, term8275448));
    }

};


