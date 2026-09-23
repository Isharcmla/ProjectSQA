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

public class Attributes_equals_1603080095251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309858;
     Object term1309887;
     Object term2309146;
     Object term2309147;

    public Attributes_equals_1603080095251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1309858 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1309858, term1309858.getClass(), "size", 2048);
        term1309887 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1309887, term1309887.getClass(), "size", 0);
        term2309146 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term2309146, term2309146.getClass(), "size", 2048);
        setField(term2309146, term2309146.getClass(), "keys", null);
        setField(term2309146, term2309146.getClass(), "vals", null);
        term2309147 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term2309147, term2309147.getClass(), "size", 0);
        setField(term2309147, term2309147.getClass(), "keys", null);
        setField(term2309147, term2309147.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1309887;
        Object retValue = callMethod(klass, "equals", argTypes, term1309858, args);
        assertTrue(recursiveEquals(term1309858, term2309146));
        assertTrue(recursiveEquals(term1309887, term2309147));
        assertTrue(recursiveEquals(retValue, false));
    }

};


