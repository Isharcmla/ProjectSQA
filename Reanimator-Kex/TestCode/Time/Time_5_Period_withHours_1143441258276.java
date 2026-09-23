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

public class Period_withHours_1143441258276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131300;

    public Period_withHours_1143441258276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131300 = newInstance(Class.forName("org.joda.time.Period"));
        Object term131354 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term129693 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term129708 = (int[]) newIntArray(245);
        setField(term131354, term131354.getClass(), "iTypes", term129693);
        setField(term131300, term131300.getClass(), "iType", term131354);
        setField(term131300, term131300.getClass(), "iValues", term129708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term131300, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


