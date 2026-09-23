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

public class Attributes_addAll_64349132189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80070;
     Object term80347;
     Object term80348;

    public Attributes_addAll_64349132189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80070 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term80070, term80070.getClass(), "size", 0);
        term80347 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term80347, term80347.getClass(), "size", 0);
        setField(term80347, term80347.getClass(), "keys", null);
        setField(term80347, term80347.getClass(), "vals", null);
        term80348 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term80348, term80348.getClass(), "size", 0);
        setField(term80348, term80348.getClass(), "keys", null);
        setField(term80348, term80348.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term80070;
        callMethod(klass, "addAll", argTypes, term80070, args);
        assertTrue(recursiveEquals(term80070, term80347));
        assertTrue(recursiveEquals(term80070, term80348));
    }

};


