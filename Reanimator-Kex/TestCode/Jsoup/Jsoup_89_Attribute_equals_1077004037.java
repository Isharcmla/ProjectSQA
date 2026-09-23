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

public class Attribute_equals_1077004037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52959;
     Object term52988;
     Object term131497;
     Object term131505;

    public Attribute_equals_1077004037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52959 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term52984 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term52986 = (Object[]) newArray("java.lang.String", 0);
        Object[] term52987 = (Object[]) newArray("java.lang.String", 0);
        setField(term52959, term52959.getClass(), "key", "kuTXqwMtDB");
        setField(term52959, term52959.getClass(), "val", "Ghbwtircqb");
        setIntField(term52984, term52984.getClass(), "size", -522618178);
        setField(term52984, term52984.getClass(), "keys", term52986);
        setField(term52984, term52984.getClass(), "vals", term52987);
        setField(term52959, term52959.getClass(), "parent", term52984);
        term52988 = newInstance(Class.forName("java.lang.Object"));
        term131497 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131502 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131503 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131504 = (Object[]) newArray("java.lang.String", 0);
        setField(term131497, term131497.getClass(), "key", "kuTXqwMtDB");
        setField(term131497, term131497.getClass(), "val", "Ghbwtircqb");
        setIntField(term131502, term131502.getClass(), "size", -522618178);
        setField(term131502, term131502.getClass(), "keys", term131503);
        setField(term131502, term131502.getClass(), "vals", term131504);
        setField(term131497, term131497.getClass(), "parent", term131502);
        term131505 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52988;
        Object retValue = callMethod(klass, "equals", argTypes, term52959, args);
        assertTrue(recursiveEquals(term52959, term131497));
        assertTrue(recursiveEquals(term52988, term131505));
        assertTrue(recursiveEquals(retValue, false));
    }

};


