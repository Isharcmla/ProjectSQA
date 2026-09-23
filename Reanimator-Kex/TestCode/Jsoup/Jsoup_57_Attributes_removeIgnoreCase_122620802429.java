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

public class Attributes_removeIgnoreCase_122620802429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;
     Object term1483;

    public Attributes_removeIgnoreCase_122620802429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term331 = new LinkedHashMap();
        term330 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term330, term330.getClass(), "attributes", term331);
        LinkedHashMap term1484 = new LinkedHashMap();
        term1483 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1483, term1483.getClass(), "attributes", term1484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "removeIgnoreCase", argTypes, term330, args);
        assertTrue(recursiveEquals(term330, term1483));
    }

};


