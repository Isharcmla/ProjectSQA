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

public class Attribute_isBooleanAttribute_122547229635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52888;
     Object term130524;

    public Attribute_isBooleanAttribute_122547229635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52888 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term52913 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term52915 = (Object[]) newArray("java.lang.String", 0);
        Object[] term52916 = (Object[]) newArray("java.lang.String", 0);
        setField(term52888, term52888.getClass(), "key", "dWRymuLBtr");
        setField(term52888, term52888.getClass(), "val", "AijpHYOFuy");
        setIntField(term52913, term52913.getClass(), "size", 1725571209);
        setField(term52913, term52913.getClass(), "keys", term52915);
        setField(term52913, term52913.getClass(), "vals", term52916);
        setField(term52888, term52888.getClass(), "parent", term52913);
        term130524 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term130537 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term130538 = (Object[]) newArray("java.lang.String", 0);
        Object[] term130539 = (Object[]) newArray("java.lang.String", 0);
        setField(term130524, term130524.getClass(), "key", "dWRymuLBtr");
        setField(term130524, term130524.getClass(), "val", "AijpHYOFuy");
        setIntField(term130537, term130537.getClass(), "size", 1725571209);
        setField(term130537, term130537.getClass(), "keys", term130538);
        setField(term130537, term130537.getClass(), "vals", term130539);
        setField(term130524, term130524.getClass(), "parent", term130537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isBooleanAttribute", argTypes, term52888, args);
        assertTrue(recursiveEquals(term52888, term130524));
        assertTrue(recursiveEquals(retValue, false));
    }

};


