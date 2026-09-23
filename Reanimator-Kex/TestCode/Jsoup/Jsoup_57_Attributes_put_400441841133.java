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

public class Attributes_put_400441841133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023973;
     Object term3024043;
     Object term3024057;
     Object term3024062;

    public Attributes_put_400441841133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3023973 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3023973, term3023973.getClass(), "attributes", null);
        term3024043 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        LinkedHashMap term3024058 = new LinkedHashMap();
        term3024057 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3024057, term3024057.getClass(), "attributes", term3024058);
        term3024062 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term3024062, term3024062.getClass(), "key", null);
        setField(term3024062, term3024062.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term3024043;
        callMethod(klass, "put", argTypes, term3023973, args);
        assertTrue(recursiveEquals(term3023973, term3024057));
        assertTrue(recursiveEquals(term3024043, term3024062));
    }

};


