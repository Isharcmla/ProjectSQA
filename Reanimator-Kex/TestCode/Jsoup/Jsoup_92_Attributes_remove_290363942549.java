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

public class Attributes_remove_290363942549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14502529;
     Object term14503665;

    public Attributes_remove_290363942549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14502529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14499563 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14502529, term14502529.getClass(), "size", 15);
        setElement(term14499563, 3, "");
        setElement(term14499563, 4, "");
        setField(term14502529, term14502529.getClass(), "keys", term14499563);
        term14503665 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14503666 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14503665, term14503665.getClass(), "size", 15);
        setElement(term14503666, 3, "");
        setElement(term14503666, 4, "");
        setField(term14503665, term14503665.getClass(), "keys", term14503666);
        setField(term14503665, term14503665.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "   \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ";
        callMethod(klass, "remove", argTypes, term14502529, args);
        assertTrue(recursiveEquals(term14502529, term14503665));
    }

};


