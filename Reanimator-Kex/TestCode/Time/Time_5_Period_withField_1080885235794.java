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

public class Period_withField_1080885235794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2936460;
     Object term2936634;

    public Period_withField_1080885235794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2936460 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2936514 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term2936460, term2936460.getClass(), "iType", term2936514);
        term2936634 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2936634;
        args[1] = 0;
        try {
            callMethod(klass, "withField", argTypes, term2936460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


