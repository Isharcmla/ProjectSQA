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

public class Period_minusSeconds_841451504449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232191;

    public Period_minusSeconds_841451504449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232191 = newInstance(Class.forName("org.joda.time.Period"));
        Object term232245 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term232035 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term232041 = (int[]) newIntArray(11);
        setField(term232245, term232245.getClass(), "iTypes", term232035);
        setField(term232191, term232191.getClass(), "iType", term232245);
        setField(term232191, term232191.getClass(), "iValues", term232041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusSeconds", argTypes, term232191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


