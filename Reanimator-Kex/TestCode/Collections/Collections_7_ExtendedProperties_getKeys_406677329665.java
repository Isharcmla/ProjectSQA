package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_getKeys_406677329665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182745;

    public ExtendedProperties_getKeys_406677329665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term182901 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        ArrayList term182953 = new ArrayList();
        Object term183057 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term183161 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        ArrayList term182797 = new ArrayList();
        ((ArrayList) term182797).add(term182901);
        ((ArrayList) term182797).add(term182953);
        ((ArrayList) term182797).add(term183057);
        ((ArrayList) term182797).add(term183161);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add("");
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        ((ArrayList) term182797).add((Object)null);
        term182745 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term182745, term182745.getClass(), "keysAsListed", term182797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term182745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


