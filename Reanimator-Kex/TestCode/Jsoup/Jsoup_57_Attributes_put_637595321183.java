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

public class Attributes_put_637595321183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5033956;
     Object term5035064;

    public Attributes_put_637595321183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5034016 = new LinkedHashMap();
        term5033956 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5033956, term5033956.getClass(), "attributes", term5034016);
        LinkedHashMap term5035065 = new LinkedHashMap();
        term5035064 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5035064, term5035064.getClass(), "attributes", term5035065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = true;
        callMethod(klass, "put", argTypes, term5033956, args);
        assertTrue(recursiveEquals(term5033956, term5035064));
    }

};


