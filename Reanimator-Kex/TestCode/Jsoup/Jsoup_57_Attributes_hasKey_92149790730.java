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

public class Attributes_hasKey_92149790730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term1530;

    public Attributes_hasKey_92149790730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term378 = new LinkedHashMap();
        term377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term377, term377.getClass(), "attributes", term378);
        LinkedHashMap term1531 = new LinkedHashMap();
        term1530 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1530, term1530.getClass(), "attributes", term1531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        Object retValue = callMethod(klass, "hasKey", argTypes, term377, args);
        assertTrue(recursiveEquals(term377, term1530));
        assertTrue(recursiveEquals(retValue, false));
    }

};


