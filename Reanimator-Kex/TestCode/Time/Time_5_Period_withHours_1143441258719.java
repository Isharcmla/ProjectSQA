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

public class Period_withHours_1143441258719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1607195;

    public Period_withHours_1143441258719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1607195 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1607249 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1492066 = (Object[]) newArray("org.joda.time.DurationFieldType", 223);
        int[] term1492291 = (int[]) newIntArray(505);
        setField(term1607249, term1607249.getClass(), "iTypes", term1492066);
        setField(term1607195, term1607195.getClass(), "iType", term1607249);
        setField(term1607195, term1607195.getClass(), "iValues", term1492291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1607195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


