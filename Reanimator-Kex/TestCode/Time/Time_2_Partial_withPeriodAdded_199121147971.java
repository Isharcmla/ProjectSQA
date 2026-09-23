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

public class Partial_withPeriodAdded_199121147971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20749;
     Object term20791;
     Object term21259;
     Object term21260;
     Object term21255;

    public Partial_withPeriodAdded_199121147971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20749 = newInstance(Class.forName("org.joda.time.Partial"));
        term20791 = newInstance(Class.forName("org.joda.time.Days"));
        term21259 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term21259, term21259.getClass(), "iChronology", null);
        setField(term21259, term21259.getClass(), "iTypes", null);
        setField(term21259, term21259.getClass(), "iValues", null);
        setField(term21259, term21259.getClass(), "iFormatter", null);
        term21260 = newInstance(Class.forName("org.joda.time.Days"));
        setIntField(term21260, term21260.getClass(), "iPeriod", 0);
        term21255 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term21255, term21255.getClass(), "iChronology", null);
        setField(term21255, term21255.getClass(), "iTypes", null);
        setField(term21255, term21255.getClass(), "iValues", null);
        setField(term21255, term21255.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term20791;
        args[1] = 0;
        Object retValue = callMethod(klass, "withPeriodAdded", argTypes, term20749, args);
        assertTrue(recursiveEquals(term20749, term21259));
        assertTrue(recursiveEquals(term20791, term21260));
        assertTrue(recursiveEquals(retValue, term21255));
    }

};


