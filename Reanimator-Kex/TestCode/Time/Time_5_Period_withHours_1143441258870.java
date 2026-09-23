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

public class Period_withHours_1143441258870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4025069;

    public Period_withHours_1143441258870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4025069 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4025123 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3986006 = (Object[]) newArray("org.joda.time.DurationFieldType", 150);
        int[] term3986158 = (int[]) newIntArray(249);
        setField(term4025123, term4025123.getClass(), "iTypes", term3986006);
        setField(term4025069, term4025069.getClass(), "iType", term4025123);
        setField(term4025069, term4025069.getClass(), "iValues", term3986158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term4025069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


