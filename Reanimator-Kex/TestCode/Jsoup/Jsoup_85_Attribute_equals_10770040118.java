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

public class Attribute_equals_10770040118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156411;
     Object term156484;
     Object term156813;
     Object term156816;

    public Attribute_equals_10770040118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156411 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156411, term156411.getClass(), "key", "int");
        term156484 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term156813 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156813, term156813.getClass(), "key", "int");
        setField(term156813, term156813.getClass(), "val", null);
        setField(term156813, term156813.getClass(), "parent", null);
        term156816 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156816, term156816.getClass(), "key", null);
        setField(term156816, term156816.getClass(), "val", null);
        setField(term156816, term156816.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156484;
        Object retValue = callMethod(klass, "equals", argTypes, term156411, args);
        assertTrue(recursiveEquals(term156411, term156813));
        assertTrue(recursiveEquals(term156484, term156816));
        assertTrue(recursiveEquals(retValue, false));
    }

};


