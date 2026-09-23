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

public class ExtendedProperties_getKeys_406677329869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13139367;

    public ExtendedProperties_getKeys_406677329869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13139523 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        ArrayList term13139575 = new ArrayList();
        Object term13139679 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13139783 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        ArrayList term13139419 = new ArrayList();
        ((ArrayList) term13139419).add(term13139523);
        ((ArrayList) term13139419).add(term13139575);
        ((ArrayList) term13139419).add(term13139679);
        ((ArrayList) term13139419).add(term13139783);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add("");
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        ((ArrayList) term13139419).add((Object)null);
        term13139367 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term13139367, term13139367.getClass(), "keysAsListed", term13139419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term13139367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


