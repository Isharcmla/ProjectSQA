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

public class Attributes_put_28062925502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11609006;

    public Attributes_put_28062925502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11609006 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11607685 = (Object[]) newArray("java.lang.String", 109);
        setIntField(term11609006, term11609006.getClass(), "size", 11);
        setElement(term11607685, 0, "");
        setElement(term11607685, 1, "");
        setElement(term11607685, 10, " \u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setElement(term11607685, 11, "");
        setElement(term11607685, 12, "");
        setElement(term11607685, 13, "");
        setElement(term11607685, 14, "");
        setElement(term11607685, 15, "");
        setElement(term11607685, 16, "");
        setElement(term11607685, 17, "");
        setElement(term11607685, 18, "");
        setElement(term11607685, 19, "");
        setElement(term11607685, 20, "");
        setElement(term11607685, 21, "");
        setElement(term11607685, 22, "");
        setElement(term11607685, 23, "");
        setElement(term11607685, 24, "");
        setElement(term11607685, 25, "");
        setElement(term11607685, 26, "");
        setElement(term11607685, 27, "");
        setElement(term11607685, 28, "");
        setElement(term11607685, 29, "");
        setElement(term11607685, 30, "");
        setElement(term11607685, 31, "");
        setElement(term11607685, 32, "");
        setElement(term11607685, 33, "");
        setElement(term11607685, 34, "");
        setElement(term11607685, 35, "");
        setElement(term11607685, 36, "");
        setElement(term11607685, 37, "");
        setElement(term11607685, 38, "");
        setElement(term11607685, 39, "");
        setElement(term11607685, 40, "");
        setElement(term11607685, 41, "");
        setElement(term11607685, 42, "");
        setElement(term11607685, 43, "");
        setElement(term11607685, 44, "");
        setElement(term11607685, 45, "");
        setElement(term11607685, 46, "");
        setElement(term11607685, 47, "");
        setElement(term11607685, 48, "");
        setElement(term11607685, 49, "");
        setElement(term11607685, 50, "");
        setElement(term11607685, 51, "");
        setElement(term11607685, 52, "");
        setElement(term11607685, 53, "");
        setElement(term11607685, 54, "");
        setElement(term11607685, 55, "");
        setElement(term11607685, 56, "");
        setElement(term11607685, 57, "");
        setElement(term11607685, 58, "");
        setElement(term11607685, 59, "");
        setElement(term11607685, 60, "");
        setElement(term11607685, 61, "");
        setElement(term11607685, 62, "");
        setElement(term11607685, 63, "");
        setElement(term11607685, 64, "");
        setElement(term11607685, 65, "");
        setElement(term11607685, 66, "");
        setElement(term11607685, 67, "");
        setElement(term11607685, 68, "");
        setElement(term11607685, 69, "");
        setElement(term11607685, 70, "");
        setElement(term11607685, 71, "");
        setElement(term11607685, 72, "");
        setElement(term11607685, 73, "");
        setElement(term11607685, 74, "");
        setElement(term11607685, 75, "");
        setElement(term11607685, 76, "");
        setElement(term11607685, 77, "");
        setElement(term11607685, 78, "");
        setElement(term11607685, 79, "");
        setElement(term11607685, 80, "");
        setElement(term11607685, 81, "");
        setElement(term11607685, 82, "");
        setElement(term11607685, 83, "");
        setElement(term11607685, 84, "");
        setElement(term11607685, 85, "");
        setElement(term11607685, 86, "");
        setElement(term11607685, 87, "");
        setElement(term11607685, 88, "");
        setElement(term11607685, 89, "");
        setElement(term11607685, 90, "");
        setElement(term11607685, 91, "");
        setElement(term11607685, 92, "");
        setElement(term11607685, 93, "");
        setElement(term11607685, 94, "");
        setElement(term11607685, 95, "");
        setElement(term11607685, 96, "");
        setElement(term11607685, 97, "");
        setElement(term11607685, 98, "");
        setElement(term11607685, 99, "");
        setElement(term11607685, 100, "");
        setElement(term11607685, 101, "");
        setElement(term11607685, 102, "");
        setElement(term11607685, 103, "");
        setElement(term11607685, 104, "");
        setElement(term11607685, 105, "");
        setElement(term11607685, 106, "");
        setElement(term11607685, 107, "");
        setElement(term11607685, 108, "");
        setField(term11609006, term11609006.getClass(), "keys", term11607685);
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
            callMethod(klass, "put", argTypes, term11609006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


