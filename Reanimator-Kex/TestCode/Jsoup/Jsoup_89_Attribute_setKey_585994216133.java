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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attribute_setKey_585994216133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168044;

    public Attribute_setKey_585994216133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168044 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term168102 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term167962 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term168102, term168102.getClass(), "size", 1);
        setField(term168102, term168102.getClass(), "keys", term167962);
        setField(term168044, term168044.getClass(), "parent", term168102);
        setField(term168044, term168044.getClass(), "key", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        try {
            callMethod(klass, "setKey", argTypes, term168044, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


