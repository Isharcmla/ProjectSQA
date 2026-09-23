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

public class Attributes_put_180316978589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15659474;
     Object term15659539;
     Object term15659520;

    public Attributes_put_180316978589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15659474 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15659316 = (Object[]) newArray("java.lang.String", 1);
        Object[] term15659320 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term15659474, term15659474.getClass(), "size", 1);
        setField(term15659474, term15659474.getClass(), "keys", term15659316);
        setField(term15659474, term15659474.getClass(), "vals", term15659320);
        term15659539 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15659540 = (Object[]) newArray("java.lang.String", 4);
        Object[] term15659543 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term15659539, term15659539.getClass(), "size", 2);
        setElement(term15659540, 1, "");
        setField(term15659539, term15659539.getClass(), "keys", term15659540);
        setField(term15659539, term15659539.getClass(), "vals", term15659543);
        term15659520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15659522 = (Object[]) newArray("java.lang.String", 4);
        Object[] term15659525 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term15659520, term15659520.getClass(), "size", 2);
        setElement(term15659522, 1, "");
        setField(term15659520, term15659520.getClass(), "keys", term15659522);
        setField(term15659520, term15659520.getClass(), "vals", term15659525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term15659474, args);
        assertTrue(recursiveEquals(term15659474, term15659539));
        assertTrue(recursiveEquals(retValue, term15659520));
    }

};


