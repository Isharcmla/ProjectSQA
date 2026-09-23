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

public class Attributes_putIgnoreCase_1473599146429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8340655;
     Object term8896295;

    public Attributes_putIgnoreCase_1473599146429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8340655 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8340539 = (Object[]) newArray("java.lang.String", 16);
        setIntField(term8340655, term8340655.getClass(), "size", 1);
        setField(term8340655, term8340655.getClass(), "keys", term8340539);
        setField(term8340655, term8340655.getClass(), "vals", term8340539);
        term8896295 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8896296 = (Object[]) newArray("java.lang.String", 16);
        Object[] term8896299 = (Object[]) newArray("java.lang.String", 16);
        setIntField(term8896295, term8896295.getClass(), "size", 2);
        setElement(term8896296, 1, "                 ");
        setField(term8896295, term8896295.getClass(), "keys", term8896296);
        setElement(term8896299, 1, "                 ");
        setField(term8896295, term8896295.getClass(), "vals", term8896299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "                 ";
        callMethod(klass, "putIgnoreCase", argTypes, term8340655, args);
        assertTrue(recursiveEquals(term8340655, term8896295));
    }

};


