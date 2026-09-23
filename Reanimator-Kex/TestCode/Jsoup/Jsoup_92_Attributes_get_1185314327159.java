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

public class Attributes_get_1185314327159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93206;
     Object term254051;

    public Attributes_get_1185314327159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93206 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term93135 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term93206, term93206.getClass(), "size", 1);
        setField(term93206, term93206.getClass(), "keys", term93135);
        term254051 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term254052 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term254051, term254051.getClass(), "size", 1);
        setField(term254051, term254051.getClass(), "keys", term254052);
        setField(term254051, term254051.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term93206, args);
        assertTrue(recursiveEquals(term93206, term254051));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


