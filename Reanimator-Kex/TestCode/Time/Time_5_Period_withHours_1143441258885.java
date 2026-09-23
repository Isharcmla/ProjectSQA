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

public class Period_withHours_1143441258885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4137564;

    public Period_withHours_1143441258885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4137564 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4137618 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4053306 = (Object[]) newArray("org.joda.time.DurationFieldType", 217);
        int[] term4053525 = (int[]) newIntArray(377);
        setField(term4137618, term4137618.getClass(), "iTypes", term4053306);
        setField(term4137564, term4137564.getClass(), "iType", term4137618);
        setField(term4137564, term4137564.getClass(), "iValues", term4053525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term4137564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


