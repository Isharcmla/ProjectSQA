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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Partial_withPeriodAdded_199121147970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20227;
     Object term20269;
     Object term20581;
     Object term20582;
     Object term20577;

    public Partial_withPeriodAdded_199121147970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20227 = newInstance(Class.forName("org.joda.time.Partial"));
        term20269 = newInstance(Class.forName("org.joda.time.Days"));
        term20581 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term20581, term20581.getClass(), "iChronology", null);
        setField(term20581, term20581.getClass(), "iTypes", null);
        setField(term20581, term20581.getClass(), "iValues", null);
        setField(term20581, term20581.getClass(), "iFormatter", null);
        term20582 = newInstance(Class.forName("org.joda.time.Days"));
        setIntField(term20582, term20582.getClass(), "iPeriod", 0);
        term20577 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term20577, term20577.getClass(), "iChronology", null);
        setField(term20577, term20577.getClass(), "iTypes", null);
        setField(term20577, term20577.getClass(), "iValues", null);
        setField(term20577, term20577.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term20269;
        args[1] = 0;
        Object retValue = callMethod(klass, "withPeriodAdded", argTypes, term20227, args);
        assertTrue(recursiveEquals(term20227, term20581));
        assertTrue(recursiveEquals(term20269, term20582));
        assertTrue(recursiveEquals(retValue, term20577));
    }

};


