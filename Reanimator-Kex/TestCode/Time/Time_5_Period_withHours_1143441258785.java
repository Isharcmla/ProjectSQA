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

public class Period_withHours_1143441258785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2813433;

    public Period_withHours_1143441258785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2813433 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2813487 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2783470 = (Object[]) newArray("org.joda.time.DurationFieldType", 115);
        int[] term2783587 = (int[]) newIntArray(249);
        setField(term2813487, term2813487.getClass(), "iTypes", term2783470);
        setField(term2813433, term2813433.getClass(), "iType", term2813487);
        setField(term2813433, term2813433.getClass(), "iValues", term2783587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2813433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


