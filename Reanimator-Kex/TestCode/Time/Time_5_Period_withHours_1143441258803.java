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

public class Period_withHours_1143441258803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3092362;

    public Period_withHours_1143441258803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3092362 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3092416 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3061835 = (Object[]) newArray("org.joda.time.DurationFieldType", 119);
        int[] term3061956 = (int[]) newIntArray(245);
        setField(term3092416, term3092416.getClass(), "iTypes", term3061835);
        setField(term3092362, term3092362.getClass(), "iType", term3092416);
        setField(term3092362, term3092362.getClass(), "iValues", term3061956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3092362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


