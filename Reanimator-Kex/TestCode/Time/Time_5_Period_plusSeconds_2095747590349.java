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

public class Period_plusSeconds_2095747590349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173602;

    public Period_plusSeconds_2095747590349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173602 = newInstance(Class.forName("org.joda.time.Period"));
        Object term173656 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term173534 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term173656, term173656.getClass(), "iTypes", term173534);
        setField(term173602, term173602.getClass(), "iType", term173656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusSeconds", argTypes, term173602, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


