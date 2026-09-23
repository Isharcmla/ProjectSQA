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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_sortByValues_122794372440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term292;
     Object term4041;
     Object term4047;

    public DefaultKeyedValues_sortByValues_122794372440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term279 = new ArrayList();
        ArrayList term283 = new ArrayList();
        HashMap term287 = new HashMap();
        term278 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term278, term278.getClass(), "keys", term279);
        setField(term278, term278.getClass(), "values", term283);
        setField(term278, term278.getClass(), "indexMap", term287);
        term292 = newInstance(Class.forName("org.jfree.chart.util.SortOrder"));
        setField(term292, term292.getClass(), "name", "sjlJAEtRrb");
        ArrayList term4042 = new ArrayList();
        ArrayList term4044 = new ArrayList();
        HashMap term4046 = new HashMap();
        term4041 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term4041, term4041.getClass(), "keys", term4042);
        setField(term4041, term4041.getClass(), "values", term4044);
        setField(term4041, term4041.getClass(), "indexMap", term4046);
        term4047 = newInstance(Class.forName("org.jfree.chart.util.SortOrder"));
        setField(term4047, term4047.getClass(), "name", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.SortOrder");
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "sortByValues", argTypes, term278, args);
        assertTrue(recursiveEquals(term278, term4041));
        assertTrue(recursiveEquals(term292, term4047));
    }

};


