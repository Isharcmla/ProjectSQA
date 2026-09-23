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

public class Attributes_put_28062925369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3120705;
     Object term5097566;
     Object term5097532;

    public Attributes_put_28062925369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3120705 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3116867 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term3120705, term3120705.getClass(), "size", 8);
        setElement(term3116867, 2, " ");
        setElement(term3116867, 4, "                    ");
        setElement(term3116867, 6, "  ");
        setField(term3120705, term3120705.getClass(), "keys", term3116867);
        term5097566 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5097567 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5097566, term5097566.getClass(), "size", 8);
        setElement(term5097567, 2, " ");
        setElement(term5097567, 4, "                    ");
        setElement(term5097567, 6, "  ");
        setField(term5097566, term5097566.getClass(), "keys", term5097567);
        setField(term5097566, term5097566.getClass(), "vals", null);
        term5097532 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5097534 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5097532, term5097532.getClass(), "size", 8);
        setElement(term5097534, 2, " ");
        setElement(term5097534, 4, "                    ");
        setElement(term5097534, 6, "  ");
        setField(term5097532, term5097532.getClass(), "keys", term5097534);
        setField(term5097532, term5097532.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                 ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term3120705, args);
        assertTrue(recursiveEquals(term3120705, term5097566));
        assertTrue(recursiveEquals(retValue, term5097532));
    }

};


