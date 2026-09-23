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
import java.util.LinkedHashMap;

public class Attributes_get_118531432723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1097;

    public Attributes_get_118531432723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2 = new LinkedHashMap();
        term1 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1, term1.getClass(), "attributes", term2);
        LinkedHashMap term1098 = new LinkedHashMap();
        term1097 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1097, term1097.getClass(), "attributes", term1098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "get", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term1097));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


