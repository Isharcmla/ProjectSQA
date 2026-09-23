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

public class Period_minusWeeks_1043470448743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2060121;

    public Period_minusWeeks_1043470448743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2060121 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2060175 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2059046 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term2059056 = (int[]) newIntArray(115);
        setField(term2060175, term2060175.getClass(), "iTypes", term2059046);
        setField(term2060121, term2060121.getClass(), "iType", term2060175);
        setField(term2060121, term2060121.getClass(), "iValues", term2059056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term2060121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


