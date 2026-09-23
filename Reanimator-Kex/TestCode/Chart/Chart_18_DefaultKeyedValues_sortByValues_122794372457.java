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
import java.lang.ClassCastException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class DefaultKeyedValues_sortByValues_122794372457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6699;

    public DefaultKeyedValues_sortByValues_122794372457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6789 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term6751 = new ArrayList();
        ((ArrayList) term6751).add(term6789);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        ((ArrayList) term6751).add((Object)null);
        term6699 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term6699, term6699.getClass(), "keys", term6751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.SortOrder");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "sortByValues", argTypes, term6699, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


