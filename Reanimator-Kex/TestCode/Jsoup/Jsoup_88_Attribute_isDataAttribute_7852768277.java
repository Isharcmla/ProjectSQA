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

public class Attribute_isDataAttribute_7852768277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147558;
     Object term148181;

    public Attribute_isDataAttribute_7852768277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147558 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term147558, term147558.getClass(), "key", "data");
        term148181 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148181, term148181.getClass(), "key", "data");
        setField(term148181, term148181.getClass(), "val", null);
        setField(term148181, term148181.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDataAttribute", argTypes, term147558, args);
        assertTrue(recursiveEquals(term147558, term148181));
    }

};


