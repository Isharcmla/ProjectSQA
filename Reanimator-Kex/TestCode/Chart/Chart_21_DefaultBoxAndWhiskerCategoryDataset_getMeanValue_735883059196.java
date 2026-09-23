package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMeanValue_735883059196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45474;
     Object term45614;
     Object enum15;

    public DefaultBoxAndWhiskerCategoryDataset_getMeanValue_735883059196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45474 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term45538 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term45474, term45474.getClass(), "data", term45538);
        term45614 = newInstance(Class.forName("org.jfree.chart.axis.NumberTickUnit"));
        Class<? extends Object> term46344 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term46343 = ((Class) term46344).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term46343).setAccessible(true);
        enum15 = ((Field) term46343).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term45614;
        args[1] = enum15;
        try {
            callMethod(klass, "getMeanValue", argTypes, term45474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


