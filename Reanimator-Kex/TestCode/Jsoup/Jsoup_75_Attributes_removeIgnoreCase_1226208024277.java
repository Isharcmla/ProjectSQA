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

public class Attributes_removeIgnoreCase_1226208024277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829297;
     Object term1829348;

    public Attributes_removeIgnoreCase_1226208024277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1829297 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1829202 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1829203 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term1829297, term1829297.getClass(), "size", 1);
        setField(term1829297, term1829297.getClass(), "keys", term1829202);
        setField(term1829297, term1829297.getClass(), "vals", term1829203);
        term1829348 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1829349 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1829350 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term1829348, term1829348.getClass(), "size", 1);
        setField(term1829348, term1829348.getClass(), "keys", term1829349);
        setField(term1829348, term1829348.getClass(), "vals", term1829350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "removeIgnoreCase", argTypes, term1829297, args);
        assertTrue(recursiveEquals(term1829297, term1829348));
    }

};


