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

public class Period_withHours_1143441258694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979943;

    public Period_withHours_1143441258694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979943 = newInstance(Class.forName("org.joda.time.Period"));
        Object term979997 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term957097 = (Object[]) newArray("org.joda.time.DurationFieldType", 89);
        int[] term957188 = (int[]) newIntArray(245);
        setField(term979997, term979997.getClass(), "iTypes", term957097);
        setField(term979943, term979943.getClass(), "iType", term979997);
        setField(term979943, term979943.getClass(), "iValues", term957188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term979943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


