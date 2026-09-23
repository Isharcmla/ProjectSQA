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

public class ExtendedProperties_subset_483178658379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179117;

    public ExtendedProperties_subset_483178658379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term179169 = new ArrayList();
        ((ArrayList) term179169).add("");
        ((ArrayList) term179169).add((Object)null);
        ((ArrayList) term179169).add((Object)null);
        ((ArrayList) term179169).add((Object)null);
        term179117 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term179117, term179117.getClass(), "keysAsListed", term179169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "subset", argTypes, term179117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


