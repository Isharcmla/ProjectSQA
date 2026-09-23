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

public class Attributes_put_28062925363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5818832;
     Object term7038751;
     Object term7037927;

    public Attributes_put_28062925363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5818832 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5818241 = (Object[]) newArray("java.lang.String", 41);
        Object[] term5818243 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term5818832, term5818832.getClass(), "size", 1);
        setElement(term5818241, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term5818832, term5818832.getClass(), "keys", term5818241);
        setField(term5818832, term5818832.getClass(), "vals", term5818243);
        term7038751 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7038752 = (Object[]) newArray("java.lang.String", 41);
        Object[] term7038759 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term7038751, term7038751.getClass(), "size", 2);
        setElement(term7038752, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term7038752, 1, "");
        setField(term7038751, term7038751.getClass(), "keys", term7038752);
        setField(term7038751, term7038751.getClass(), "vals", term7038759);
        term7037927 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7037929 = (Object[]) newArray("java.lang.String", 41);
        Object[] term7038453 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term7037927, term7037927.getClass(), "size", 2);
        setElement(term7037929, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term7037929, 1, "");
        setField(term7037927, term7037927.getClass(), "keys", term7037929);
        setField(term7037927, term7037927.getClass(), "vals", term7038453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object retValue = callMethod(klass, "put", argTypes, term5818832, args);
        assertTrue(recursiveEquals(term5818832, term7038751));
        assertTrue(recursiveEquals(retValue, term7037927));
    }

};


