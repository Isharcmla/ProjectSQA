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

public class Period_withHours_1143441258367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180864;

    public Period_withHours_1143441258367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180864 = newInstance(Class.forName("org.joda.time.Period"));
        Object term180918 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term180782 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term180785 = (int[]) newIntArray(2);
        setField(term180918, term180918.getClass(), "iTypes", term180782);
        setField(term180864, term180864.getClass(), "iType", term180918);
        setField(term180864, term180864.getClass(), "iValues", term180785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term180864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


