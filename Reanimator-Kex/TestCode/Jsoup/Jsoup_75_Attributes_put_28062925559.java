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

public class Attributes_put_28062925559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14395898;

    public Attributes_put_28062925559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14395898 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14394617 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term14395898, term14395898.getClass(), "size", 4);
        setElement(term14394617, 3, "  ");
        setElement(term14394617, 4, "  ");
        setElement(term14394617, 5, "  ");
        setElement(term14394617, 6, "  ");
        setElement(term14394617, 7, "  ");
        setElement(term14394617, 8, "  ");
        setElement(term14394617, 9, "  ");
        setElement(term14394617, 10, "  ");
        setField(term14395898, term14395898.getClass(), "keys", term14394617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "  ";
        args[1] = false;
        try {
            callMethod(klass, "put", argTypes, term14395898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


