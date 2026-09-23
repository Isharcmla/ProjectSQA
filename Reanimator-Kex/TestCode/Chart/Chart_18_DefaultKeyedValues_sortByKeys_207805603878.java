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

public class DefaultKeyedValues_sortByKeys_207805603878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13598;

    public DefaultKeyedValues_sortByKeys_207805603878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13650 = new ArrayList();
        term13598 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term13598, term13598.getClass(), "keys", term13650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.SortOrder");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "sortByKeys", argTypes, term13598, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


