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

public class Attributes_put_28062925285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2316063;
     Object term4500555;
     Object term4500544;

    public Attributes_put_28062925285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2316063 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2315959 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term2316063, term2316063.getClass(), "size", 1);
        setElement(term2315959, 0, "");
        setField(term2316063, term2316063.getClass(), "keys", term2315959);
        setField(term2316063, term2316063.getClass(), "vals", term2315959);
        term4500555 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4500556 = (Object[]) newArray("java.lang.String", 489);
        Object[] term4500557 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term4500555, term4500555.getClass(), "size", 0);
        setField(term4500555, term4500555.getClass(), "keys", term4500556);
        setField(term4500555, term4500555.getClass(), "vals", term4500557);
        term4500544 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4500546 = (Object[]) newArray("java.lang.String", 489);
        Object[] term4500547 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term4500544, term4500544.getClass(), "size", 0);
        setField(term4500544, term4500544.getClass(), "keys", term4500546);
        setField(term4500544, term4500544.getClass(), "vals", term4500547);
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
        Object retValue = callMethod(klass, "put", argTypes, term2316063, args);
        assertTrue(recursiveEquals(term2316063, term4500555));
        assertTrue(recursiveEquals(retValue, term4500544));
    }

};


