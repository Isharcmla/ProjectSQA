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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Attributes_put_265216405240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599947;
     Object term600003;

    public Attributes_put_265216405240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599947 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term599947, term599947.getClass(), "size", 1);
        term600003 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term600003, term600003.getClass(), "key", "");
        setField(term600003, term600003.getClass(), "val", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term600003;
        try {
            callMethod(klass, "put", argTypes, term599947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


