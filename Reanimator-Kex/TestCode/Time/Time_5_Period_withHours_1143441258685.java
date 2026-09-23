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

public class Period_withHours_1143441258685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797696;

    public Period_withHours_1143441258685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term797696 = newInstance(Class.forName("org.joda.time.Period"));
        Object term797750 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term733134 = (Object[]) newArray("org.joda.time.DurationFieldType", 129);
        int[] term733265 = (int[]) newIntArray(489);
        setField(term797750, term797750.getClass(), "iTypes", term733134);
        setField(term797696, term797696.getClass(), "iType", term797750);
        setField(term797696, term797696.getClass(), "iValues", term733265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term797696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


