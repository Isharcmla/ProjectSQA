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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_remove_290363942441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9873520;

    public Attributes_remove_290363942441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9873520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9872314 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term9873520, term9873520.getClass(), "size", 11);
        setElement(term9872314, 7, "");
        setElement(term9872314, 8, "");
        setElement(term9872314, 9, "");
        setElement(term9872314, 10, "");
        setElement(term9872314, 11, "");
        setElement(term9872314, 12, "");
        setElement(term9872314, 13, "");
        setElement(term9872314, 14, "");
        setField(term9873520, term9873520.getClass(), "keys", term9872314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "remove", argTypes, term9873520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


