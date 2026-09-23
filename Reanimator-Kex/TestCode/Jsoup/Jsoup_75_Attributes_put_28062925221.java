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

public class Attributes_put_28062925221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589432;
     Object term589527;
     Object term589516;

    public Attributes_put_28062925221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589432 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589328 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term589432, term589432.getClass(), "size", 1);
        setElement(term589328, 0, "");
        setField(term589432, term589432.getClass(), "keys", term589328);
        setField(term589432, term589432.getClass(), "vals", term589328);
        term589527 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589528 = (Object[]) newArray("java.lang.String", 489);
        Object[] term589529 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term589527, term589527.getClass(), "size", 0);
        setField(term589527, term589527.getClass(), "keys", term589528);
        setField(term589527, term589527.getClass(), "vals", term589529);
        term589516 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589518 = (Object[]) newArray("java.lang.String", 489);
        Object[] term589519 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term589516, term589516.getClass(), "size", 0);
        setField(term589516, term589516.getClass(), "keys", term589518);
        setField(term589516, term589516.getClass(), "vals", term589519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term589432, args);
        assertTrue(recursiveEquals(term589432, term589527));
        assertTrue(recursiveEquals(retValue, term589516));
    }

};


