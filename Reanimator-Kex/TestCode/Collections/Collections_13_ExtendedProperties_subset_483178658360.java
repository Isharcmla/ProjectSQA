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

public class ExtendedProperties_subset_483178658360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126561;

    public ExtendedProperties_subset_483178658360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term126613 = new ArrayList();
        ((ArrayList) term126613).add("");
        ((ArrayList) term126613).add((Object)null);
        ((ArrayList) term126613).add((Object)null);
        ((ArrayList) term126613).add((Object)null);
        term126561 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term126561, term126561.getClass(), "keysAsListed", term126613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "subset", argTypes, term126561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


