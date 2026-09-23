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
import java.lang.reflect.InaccessibleObjectException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Period_withPeriodType_408142087545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313223;
     Object term313277;

    public Period_withPeriodType_408142087545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313223 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term313223, term313223.getClass(), "iType", null);
        term313277 = newInstance(Class.forName("org.joda.time.PeriodType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = term313277;
        try {
            callMethod(klass, "withPeriodType", argTypes, term313223, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


