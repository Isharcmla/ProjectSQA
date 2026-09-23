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

public class Attributes_put_48534126825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term1241;

    public Attributes_put_48534126825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term96 = new LinkedHashMap();
        term95 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term95, term95.getClass(), "attributes", term96);
        LinkedHashMap term1242 = new LinkedHashMap();
        term1241 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1241, term1241.getClass(), "attributes", term1242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = "MxlszYVzRf";
        callMethod(klass, "put", argTypes, term95, args);
        assertTrue(recursiveEquals(term95, term1241));
    }

};


