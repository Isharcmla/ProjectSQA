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

public class Attributes_remove_29036394228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;
     Object term1435;

    public Attributes_remove_29036394228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term284 = new LinkedHashMap();
        term283 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term283, term283.getClass(), "attributes", term284);
        LinkedHashMap term1436 = new LinkedHashMap();
        term1435 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1435, term1435.getClass(), "attributes", term1436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "remove", argTypes, term283, args);
        assertTrue(recursiveEquals(term283, term1435));
    }

};


