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

public class Attribute_equals_10770040109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154174;
     Object term154209;
     Object term154220;
     Object term154221;

    public Attribute_equals_10770040109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154174 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154209 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154220 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154220, term154220.getClass(), "key", null);
        setField(term154220, term154220.getClass(), "val", null);
        setField(term154220, term154220.getClass(), "parent", null);
        term154221 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154221, term154221.getClass(), "key", null);
        setField(term154221, term154221.getClass(), "val", null);
        setField(term154221, term154221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154209;
        Object retValue = callMethod(klass, "equals", argTypes, term154174, args);
        assertTrue(recursiveEquals(term154174, term154220));
        assertTrue(recursiveEquals(term154209, term154221));
        assertTrue(recursiveEquals(retValue, true));
    }

};


