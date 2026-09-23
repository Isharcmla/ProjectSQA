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

public class Period_withHours_1143441258819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3399554;

    public Period_withHours_1143441258819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3399554 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3399608 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3362407 = (Object[]) newArray("org.joda.time.DurationFieldType", 73);
        int[] term3362482 = (int[]) newIntArray(497);
        setField(term3399608, term3399608.getClass(), "iTypes", term3362407);
        setField(term3399554, term3399554.getClass(), "iType", term3399608);
        setField(term3399554, term3399554.getClass(), "iValues", term3362482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3399554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


