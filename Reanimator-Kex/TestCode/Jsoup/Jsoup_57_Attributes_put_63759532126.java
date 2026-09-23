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
import java.lang.Boolean;

public class Attributes_put_63759532126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term201;
     Object term1318;

    public Attributes_put_63759532126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term165 = new LinkedHashMap();
        term164 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term164, term164.getClass(), "attributes", term165);
        term201 = new Boolean(false);
        LinkedHashMap term1319 = new LinkedHashMap();
        term1318 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1318, term1318.getClass(), "attributes", term1319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "ZiaGIbnzTs";
        args[1] = term201;
        callMethod(klass, "put", argTypes, term164, args);
        assertTrue(recursiveEquals(term164, term1318));
        assertTrue(recursiveEquals(term201, false));
    }

};


