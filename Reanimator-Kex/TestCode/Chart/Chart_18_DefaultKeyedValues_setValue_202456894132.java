package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_setValue_202456894132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public DefaultKeyedValues_setValue_202456894132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term136 = new ArrayList();
        ArrayList term140 = new ArrayList();
        HashMap term144 = new HashMap();
        term135 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term135, term135.getClass(), "keys", term136);
        setField(term135, term135.getClass(), "values", term140);
        setField(term135, term135.getClass(), "indexMap", term144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "setValue", argTypes, term135, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


