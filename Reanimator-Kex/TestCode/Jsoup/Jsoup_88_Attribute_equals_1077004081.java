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

public class Attribute_equals_1077004081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148592;
     Object term148672;
     Object term148679;
     Object term148680;

    public Attribute_equals_1077004081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148592 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term148672 = newInstance(Class.forName("java.lang.invoke.ProxyClassesDumper$1"));
        term148679 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148679, term148679.getClass(), "key", null);
        setField(term148679, term148679.getClass(), "val", null);
        setField(term148679, term148679.getClass(), "parent", null);
        term148680 = newInstance(Class.forName("java.lang.invoke.ProxyClassesDumper$1"));
        setField(term148680, term148680.getClass(), "val$dir", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148672;
        Object retValue = callMethod(klass, "equals", argTypes, term148592, args);
        assertTrue(recursiveEquals(term148592, term148679));
        assertTrue(recursiveEquals(term148672, term148680));
        assertTrue(recursiveEquals(retValue, false));
    }

};


