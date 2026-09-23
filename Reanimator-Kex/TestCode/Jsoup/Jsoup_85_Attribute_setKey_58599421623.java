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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attribute_setKey_58599421623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public Attribute_setKey_58599421623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term167 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term169 = (Object[]) newArray("java.lang.String", 0);
        Object[] term170 = (Object[]) newArray("java.lang.String", 0);
        setField(term142, term142.getClass(), "key", "SzjVpOQTyS");
        setField(term142, term142.getClass(), "val", "MjGYSRKTNF");
        setIntField(term167, term167.getClass(), "size", 1484323161);
        setField(term167, term167.getClass(), "keys", term169);
        setField(term167, term167.getClass(), "vals", term170);
        setField(term142, term142.getClass(), "parent", term167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        try {
            callMethod(klass, "setKey", argTypes, term142, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


