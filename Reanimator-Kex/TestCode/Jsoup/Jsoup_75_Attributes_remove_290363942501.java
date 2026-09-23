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

public class Attributes_remove_290363942501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12494766;
     Object term12865033;

    public Attributes_remove_290363942501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12494766 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12494412 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term12494766, term12494766.getClass(), "size", 4);
        setElement(term12494412, 3, "        ");
        setElement(term12494412, 4, "        ");
        setElement(term12494412, 5, "        ");
        setElement(term12494412, 6, "        ");
        setElement(term12494412, 7, "        ");
        setField(term12494766, term12494766.getClass(), "keys", term12494412);
        term12865033 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12865034 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term12865033, term12865033.getClass(), "size", 4);
        setElement(term12865034, 3, "        ");
        setElement(term12865034, 4, "        ");
        setElement(term12865034, 5, "        ");
        setElement(term12865034, 6, "        ");
        setElement(term12865034, 7, "        ");
        setField(term12865033, term12865033.getClass(), "keys", term12865034);
        setField(term12865033, term12865033.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term12494766, args);
        assertTrue(recursiveEquals(term12494766, term12865033));
    }

};


