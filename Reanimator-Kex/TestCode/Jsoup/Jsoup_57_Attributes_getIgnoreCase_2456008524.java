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

public class Attributes_getIgnoreCase_2456008524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term1147;

    public Attributes_getIgnoreCase_2456008524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term49 = new LinkedHashMap();
        term48 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term48, term48.getClass(), "attributes", term49);
        LinkedHashMap term1148 = new LinkedHashMap();
        term1147 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1147, term1147.getClass(), "attributes", term1148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        Object retValue = callMethod(klass, "getIgnoreCase", argTypes, term48, args);
        assertTrue(recursiveEquals(term48, term1147));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


