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

public class ExtendedProperties_getKeys_406677329668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6258529;

    public ExtendedProperties_getKeys_406677329668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6258633 = new ArrayList();
        ArrayList term6258685 = new ArrayList();
        ArrayList term6258737 = new ArrayList();
        ArrayList term6258581 = new ArrayList();
        ((ArrayList) term6258581).add(term6258633);
        ((ArrayList) term6258581).add(term6258685);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add(term6258737);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add("");
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        ((ArrayList) term6258581).add((Object)null);
        term6258529 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term6258529, term6258529.getClass(), "keysAsListed", term6258581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term6258529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


