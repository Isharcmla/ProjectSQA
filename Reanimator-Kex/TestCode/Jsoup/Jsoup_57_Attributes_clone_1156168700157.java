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

public class Attributes_clone_1156168700157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4029283;
     Object term4029467;
     Object term4029460;

    public Attributes_clone_1156168700157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4029343 = new LinkedHashMap();
        term4029283 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4029283, term4029283.getClass(), "attributes", term4029343);
        LinkedHashMap term4029468 = new LinkedHashMap();
        term4029467 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4029467, term4029467.getClass(), "attributes", term4029468);
        LinkedHashMap term4029461 = new LinkedHashMap();
        term4029460 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4029460, term4029460.getClass(), "attributes", term4029461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term4029283, args);
        assertTrue(recursiveEquals(term4029283, term4029467));
        assertTrue(recursiveEquals(retValue, term4029460));
    }

};


