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

public class Period_withHours_1143441258791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2930776;

    public Period_withHours_1143441258791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2930776 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2930830 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2821837 = (Object[]) newArray("org.joda.time.DurationFieldType", 211);
        int[] term2822050 = (int[]) newIntArray(505);
        setField(term2930830, term2930830.getClass(), "iTypes", term2821837);
        setField(term2930776, term2930776.getClass(), "iType", term2930830);
        setField(term2930776, term2930776.getClass(), "iValues", term2822050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2930776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


