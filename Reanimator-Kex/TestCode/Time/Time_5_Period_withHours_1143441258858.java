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

public class Period_withHours_1143441258858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3884136;

    public Period_withHours_1143441258858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3884136 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3884190 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3875112 = (Object[]) newArray("org.joda.time.DurationFieldType", 70);
        int[] term3875184 = (int[]) newIntArray(117);
        setField(term3884190, term3884190.getClass(), "iTypes", term3875112);
        setField(term3884136, term3884136.getClass(), "iType", term3884190);
        setField(term3884136, term3884136.getClass(), "iValues", term3875184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3884136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


