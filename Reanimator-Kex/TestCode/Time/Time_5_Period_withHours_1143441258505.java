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

public class Period_withHours_1143441258505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280680;

    public Period_withHours_1143441258505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280680 = newInstance(Class.forName("org.joda.time.Period"));
        Object term280734 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term279993 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term280007 = (int[]) newIntArray(41);
        setField(term280734, term280734.getClass(), "iTypes", term279993);
        setField(term280680, term280680.getClass(), "iType", term280734);
        setField(term280680, term280680.getClass(), "iValues", term280007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term280680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


