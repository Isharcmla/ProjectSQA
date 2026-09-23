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

public class Period_withHours_1143441258832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3642896;

    public Period_withHours_1143441258832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3642896 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3642950 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3571109 = (Object[]) newArray("org.joda.time.DurationFieldType", 139);
        int[] term3571250 = (int[]) newIntArray(505);
        setField(term3642950, term3642950.getClass(), "iTypes", term3571109);
        setField(term3642896, term3642896.getClass(), "iType", term3642950);
        setField(term3642896, term3642896.getClass(), "iValues", term3571250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3642896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


