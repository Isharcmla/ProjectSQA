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

public class Attributes_remove_290363942460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10138731;
     Object term10872833;

    public Attributes_remove_290363942460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10138731 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10136402 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term10138731, term10138731.getClass(), "size", 10);
        setElement(term10136402, 2, "                                                                ");
        setElement(term10136402, 7, "                                                                                                                                                                                                                                                                ");
        setField(term10138731, term10138731.getClass(), "keys", term10136402);
        term10872833 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10872834 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term10872833, term10872833.getClass(), "size", 10);
        setElement(term10872834, 2, "                                                                ");
        setElement(term10872834, 7, "                                                                                                                                                                                                                                                                ");
        setField(term10872833, term10872833.getClass(), "keys", term10872834);
        setField(term10872833, term10872833.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term10138731, args);
        assertTrue(recursiveEquals(term10138731, term10872833));
    }

};


