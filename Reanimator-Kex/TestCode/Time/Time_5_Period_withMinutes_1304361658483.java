package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_withMinutes_1304361658483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261253;

    public Period_withMinutes_1304361658483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261253 = newInstance(Class.forName("org.joda.time.Period"));
        Object term261307 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term260969 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term260976 = (int[]) newIntArray(33);
        setField(term261307, term261307.getClass(), "iTypes", term260969);
        setField(term261253, term261253.getClass(), "iType", term261307);
        setField(term261253, term261253.getClass(), "iValues", term260976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMinutes", argTypes, term261253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


