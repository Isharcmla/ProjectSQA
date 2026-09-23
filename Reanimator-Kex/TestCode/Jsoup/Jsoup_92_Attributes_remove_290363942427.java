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

public class Attributes_remove_290363942427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8338796;
     Object term8895798;

    public Attributes_remove_290363942427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8338796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8338442 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term8338796, term8338796.getClass(), "size", 4);
        setElement(term8338442, 3, "        ");
        setElement(term8338442, 4, "        ");
        setElement(term8338442, 5, "        ");
        setElement(term8338442, 6, "        ");
        setElement(term8338442, 7, "        ");
        setField(term8338796, term8338796.getClass(), "keys", term8338442);
        term8895798 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8895799 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term8895798, term8895798.getClass(), "size", 4);
        setElement(term8895799, 3, "        ");
        setElement(term8895799, 4, "        ");
        setElement(term8895799, 5, "        ");
        setElement(term8895799, 6, "        ");
        setElement(term8895799, 7, "        ");
        setField(term8895798, term8895798.getClass(), "keys", term8895799);
        setField(term8895798, term8895798.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term8338796, args);
        assertTrue(recursiveEquals(term8338796, term8895798));
    }

};


