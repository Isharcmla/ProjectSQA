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

public class Attribute_equals_10770040104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154770;
     Object term154805;
     Object term155310;
     Object term155311;

    public Attribute_equals_10770040104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154770 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154770, term154770.getClass(), "key", null);
        setField(term154770, term154770.getClass(), "val", null);
        term154805 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154805, term154805.getClass(), "key", null);
        setField(term154805, term154805.getClass(), "val", "java.lang.Object");
        term155310 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155310, term155310.getClass(), "key", null);
        setField(term155310, term155310.getClass(), "val", null);
        setField(term155310, term155310.getClass(), "parent", null);
        term155311 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155311, term155311.getClass(), "key", null);
        setField(term155311, term155311.getClass(), "val", "java.lang.Object");
        setField(term155311, term155311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154805;
        Object retValue = callMethod(klass, "equals", argTypes, term154770, args);
        assertTrue(recursiveEquals(term154770, term155310));
        assertTrue(recursiveEquals(term154805, term155311));
        assertTrue(recursiveEquals(retValue, false));
    }

};


