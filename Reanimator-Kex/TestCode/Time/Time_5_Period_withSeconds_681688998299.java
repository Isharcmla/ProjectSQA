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

public class Period_withSeconds_681688998299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144706;

    public Period_withSeconds_681688998299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144706 = newInstance(Class.forName("org.joda.time.Period"));
        Object term144760 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term143632 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term143636 = (int[]) newIntArray(492);
        setField(term144760, term144760.getClass(), "iTypes", term143632);
        setField(term144706, term144706.getClass(), "iType", term144760);
        setField(term144706, term144706.getClass(), "iValues", term143636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withSeconds", argTypes, term144706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


