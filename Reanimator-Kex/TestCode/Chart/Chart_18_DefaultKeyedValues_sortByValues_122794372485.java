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

public class DefaultKeyedValues_sortByValues_122794372485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16023;

    public DefaultKeyedValues_sortByValues_122794372485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16075 = new ArrayList();
        term16023 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term16023, term16023.getClass(), "keys", term16075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.SortOrder");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "sortByValues", argTypes, term16023, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


