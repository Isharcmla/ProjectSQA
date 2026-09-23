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

public class Period_withHours_1143441258898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4383572;

    public Period_withHours_1143441258898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4383572 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4383626 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4306625 = (Object[]) newArray("org.joda.time.DurationFieldType", 149);
        int[] term4306776 = (int[]) newIntArray(505);
        setField(term4383626, term4383626.getClass(), "iTypes", term4306625);
        setField(term4383572, term4383572.getClass(), "iType", term4383626);
        setField(term4383572, term4383572.getClass(), "iValues", term4306776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term4383572, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


