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

public class Attributes_put_28062925374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3129172;
     Object term5387025;
     Object term5372496;

    public Attributes_put_28062925374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3129172 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3126842 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term3129172, term3129172.getClass(), "size", 10);
        setElement(term3126842, 2, "                                                                ");
        setElement(term3126842, 7, "                                                                                                                                                                                                                                                                ");
        setField(term3129172, term3129172.getClass(), "keys", term3126842);
        term5387025 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5387050 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5387025, term5387025.getClass(), "size", 10);
        setElement(term5387050, 2, "                                                                ");
        setElement(term5387050, 7, "                                                                                                                                                                                                                                                                ");
        setField(term5387025, term5387025.getClass(), "keys", term5387050);
        setField(term5387025, term5387025.getClass(), "vals", null);
        term5372496 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5372504 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5372496, term5372496.getClass(), "size", 10);
        setElement(term5372504, 2, "                                                                ");
        setElement(term5372504, 7, "                                                                                                                                                                                                                                                                ");
        setField(term5372496, term5372496.getClass(), "keys", term5372504);
        setField(term5372496, term5372496.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term3129172, args);
        assertTrue(recursiveEquals(term3129172, term5387025));
        assertTrue(recursiveEquals(retValue, term5372496));
    }

};


