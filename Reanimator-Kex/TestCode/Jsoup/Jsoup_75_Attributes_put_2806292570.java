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

public class Attributes_put_2806292570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60707;
     Object term60841;
     Object term60836;

    public Attributes_put_2806292570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60707 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60634 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term60707, term60707.getClass(), "size", 1);
        setField(term60707, term60707.getClass(), "keys", term60634);
        term60841 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60842 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term60841, term60841.getClass(), "size", 1);
        setField(term60841, term60841.getClass(), "keys", term60842);
        setField(term60841, term60841.getClass(), "vals", null);
        term60836 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term60838 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term60836, term60836.getClass(), "size", 1);
        setField(term60836, term60836.getClass(), "keys", term60838);
        setField(term60836, term60836.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term60707, args);
        assertTrue(recursiveEquals(term60707, term60841));
        assertTrue(recursiveEquals(retValue, term60836));
    }

};


