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

public class Attributes_put_28062925593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15666923;

    public Attributes_put_28062925593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15666923 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15665602 = (Object[]) newArray("java.lang.String", 109);
        setIntField(term15666923, term15666923.getClass(), "size", 11);
        setElement(term15665602, 0, "");
        setElement(term15665602, 1, "");
        setElement(term15665602, 10, " \u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setElement(term15665602, 11, "");
        setElement(term15665602, 12, "");
        setElement(term15665602, 13, "");
        setElement(term15665602, 14, "");
        setElement(term15665602, 15, "");
        setElement(term15665602, 16, "");
        setElement(term15665602, 17, "");
        setElement(term15665602, 18, "");
        setElement(term15665602, 19, "");
        setElement(term15665602, 20, "");
        setElement(term15665602, 21, "");
        setElement(term15665602, 22, "");
        setElement(term15665602, 23, "");
        setElement(term15665602, 24, "");
        setElement(term15665602, 25, "");
        setElement(term15665602, 26, "");
        setElement(term15665602, 27, "");
        setElement(term15665602, 28, "");
        setElement(term15665602, 29, "");
        setElement(term15665602, 30, "");
        setElement(term15665602, 31, "");
        setElement(term15665602, 32, "");
        setElement(term15665602, 33, "");
        setElement(term15665602, 34, "");
        setElement(term15665602, 35, "");
        setElement(term15665602, 36, "");
        setElement(term15665602, 37, "");
        setElement(term15665602, 38, "");
        setElement(term15665602, 39, "");
        setElement(term15665602, 40, "");
        setElement(term15665602, 41, "");
        setElement(term15665602, 42, "");
        setElement(term15665602, 43, "");
        setElement(term15665602, 44, "");
        setElement(term15665602, 45, "");
        setElement(term15665602, 46, "");
        setElement(term15665602, 47, "");
        setElement(term15665602, 48, "");
        setElement(term15665602, 49, "");
        setElement(term15665602, 50, "");
        setElement(term15665602, 51, "");
        setElement(term15665602, 52, "");
        setElement(term15665602, 53, "");
        setElement(term15665602, 54, "");
        setElement(term15665602, 55, "");
        setElement(term15665602, 56, "");
        setElement(term15665602, 57, "");
        setElement(term15665602, 58, "");
        setElement(term15665602, 59, "");
        setElement(term15665602, 60, "");
        setElement(term15665602, 61, "");
        setElement(term15665602, 62, "");
        setElement(term15665602, 63, "");
        setElement(term15665602, 64, "");
        setElement(term15665602, 65, "");
        setElement(term15665602, 66, "");
        setElement(term15665602, 67, "");
        setElement(term15665602, 68, "");
        setElement(term15665602, 69, "");
        setElement(term15665602, 70, "");
        setElement(term15665602, 71, "");
        setElement(term15665602, 72, "");
        setElement(term15665602, 73, "");
        setElement(term15665602, 74, "");
        setElement(term15665602, 75, "");
        setElement(term15665602, 76, "");
        setElement(term15665602, 77, "");
        setElement(term15665602, 78, "");
        setElement(term15665602, 79, "");
        setElement(term15665602, 80, "");
        setElement(term15665602, 81, "");
        setElement(term15665602, 82, "");
        setElement(term15665602, 83, "");
        setElement(term15665602, 84, "");
        setElement(term15665602, 85, "");
        setElement(term15665602, 86, "");
        setElement(term15665602, 87, "");
        setElement(term15665602, 88, "");
        setElement(term15665602, 89, "");
        setElement(term15665602, 90, "");
        setElement(term15665602, 91, "");
        setElement(term15665602, 92, "");
        setElement(term15665602, 93, "");
        setElement(term15665602, 94, "");
        setElement(term15665602, 95, "");
        setElement(term15665602, 96, "");
        setElement(term15665602, 97, "");
        setElement(term15665602, 98, "");
        setElement(term15665602, 99, "");
        setElement(term15665602, 100, "");
        setElement(term15665602, 101, "");
        setElement(term15665602, 102, "");
        setElement(term15665602, 103, "");
        setElement(term15665602, 104, "");
        setElement(term15665602, 105, "");
        setElement(term15665602, 106, "");
        setElement(term15665602, 107, "");
        setElement(term15665602, 108, "");
        setField(term15666923, term15666923.getClass(), "keys", term15665602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = " \u0001\u0001\u0001\u0001\u0001\u0001\u0001";
        args[1] = false;
        try {
            callMethod(klass, "put", argTypes, term15666923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


