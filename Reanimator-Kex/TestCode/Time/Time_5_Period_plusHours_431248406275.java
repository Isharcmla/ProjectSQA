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

public class Period_plusHours_431248406275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129146;

    public Period_plusHours_431248406275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129146 = newInstance(Class.forName("org.joda.time.Period"));
        Object term129200 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term128077 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term128081 = (int[]) newIntArray(489);
        setField(term129200, term129200.getClass(), "iTypes", term128077);
        setField(term129146, term129146.getClass(), "iType", term129200);
        setField(term129146, term129146.getClass(), "iValues", term128081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusHours", argTypes, term129146, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


