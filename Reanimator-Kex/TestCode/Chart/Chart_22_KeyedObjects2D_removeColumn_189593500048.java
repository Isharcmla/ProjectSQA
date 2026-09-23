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
import java.lang.NullPointerException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class KeyedObjects2D_removeColumn_189593500048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8424;

    public KeyedObjects2D_removeColumn_189593500048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8514 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term8476 = new ArrayList();
        ((ArrayList) term8476).add((Object)null);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        ((ArrayList) term8476).add(term8514);
        term8424 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term8424, term8424.getClass(), "columnKeys", term8476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeColumn", argTypes, term8424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


