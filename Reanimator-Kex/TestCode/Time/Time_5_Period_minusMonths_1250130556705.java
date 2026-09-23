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

public class Period_minusMonths_1250130556705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191499;

    public Period_minusMonths_1250130556705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1191499 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1191553 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1189218 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term1189229 = (int[]) newIntArray(235);
        setField(term1191553, term1191553.getClass(), "iTypes", term1189218);
        setField(term1191499, term1191499.getClass(), "iType", term1191553);
        setField(term1191499, term1191499.getClass(), "iValues", term1189229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term1191499, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


