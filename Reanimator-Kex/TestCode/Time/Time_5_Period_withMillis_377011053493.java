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

public class Period_withMillis_377011053493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270007;

    public Period_withMillis_377011053493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270007 = newInstance(Class.forName("org.joda.time.Period"));
        Object term270061 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term268933 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term268937 = (int[]) newIntArray(492);
        setField(term270061, term270061.getClass(), "iTypes", term268933);
        setField(term270007, term270007.getClass(), "iType", term270061);
        setField(term270007, term270007.getClass(), "iValues", term268937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term270007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


