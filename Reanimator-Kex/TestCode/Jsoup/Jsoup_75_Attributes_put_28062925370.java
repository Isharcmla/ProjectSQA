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

public class Attributes_put_28062925370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3122595;
     Object term5101247;
     Object term5097689;

    public Attributes_put_28062925370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3122595 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3120934 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term3122595, term3122595.getClass(), "size", 5);
        setElement(term3120934, 2, "");
        setField(term3122595, term3122595.getClass(), "keys", term3120934);
        term5101247 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5101248 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term5101247, term5101247.getClass(), "size", 5);
        setElement(term5101248, 2, "");
        setField(term5101247, term5101247.getClass(), "keys", term5101248);
        setField(term5101247, term5101247.getClass(), "vals", null);
        term5097689 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5097691 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term5097689, term5097689.getClass(), "size", 5);
        setElement(term5097691, 2, "");
        setField(term5097689, term5097689.getClass(), "keys", term5097691);
        setField(term5097689, term5097689.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term3122595, args);
        assertTrue(recursiveEquals(term3122595, term5101247));
        assertTrue(recursiveEquals(retValue, term5097689));
    }

};


