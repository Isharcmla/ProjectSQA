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

public class Attributes_get_1185314327541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14369594;
     Object term14371503;

    public Attributes_get_1185314327541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14369594 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14367533 = (Object[]) newArray("java.lang.String", 495);
        Object[] term14368101 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term14369594, term14369594.getClass(), "size", 15);
        setElement(term14367533, 0, "            ");
        setElement(term14367533, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term14367533, 2, "                ");
        setElement(term14367533, 6, "");
        setElement(term14367533, 9, "");
        setElement(term14367533, 10, " ");
        setField(term14369594, term14369594.getClass(), "keys", term14367533);
        setElement(term14368101, 0, "            ");
        setElement(term14368101, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term14368101, 2, "                ");
        setElement(term14368101, 6, "");
        setElement(term14368101, 9, "");
        setElement(term14368101, 10, " ");
        setField(term14369594, term14369594.getClass(), "vals", term14368101);
        term14371503 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14371504 = (Object[]) newArray("java.lang.String", 495);
        Object[] term14371517 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term14371503, term14371503.getClass(), "size", 15);
        setElement(term14371504, 0, "            ");
        setElement(term14371504, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term14371504, 2, "                ");
        setElement(term14371504, 6, "");
        setElement(term14371504, 9, "");
        setElement(term14371504, 10, " ");
        setField(term14371503, term14371503.getClass(), "keys", term14371504);
        setElement(term14371517, 0, "            ");
        setElement(term14371517, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term14371517, 2, "                ");
        setElement(term14371517, 6, "");
        setElement(term14371517, 9, "");
        setElement(term14371517, 10, " ");
        setField(term14371503, term14371503.getClass(), "vals", term14371517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "get", argTypes, term14369594, args);
        assertTrue(recursiveEquals(term14369594, term14371503));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


