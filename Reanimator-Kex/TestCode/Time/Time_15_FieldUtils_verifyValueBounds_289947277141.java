package org.joda.time.field;

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
import org.joda.time.IllegalFieldValueException;
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FieldUtils_verifyValueBounds_289947277141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15603;

    public FieldUtils_verifyValueBounds_289947277141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15603 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term15723 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term15603, term15603.getClass(), "iType", term15723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term15603;
        args[1] = -2147483648;
        args[2] = -2147483647;
        args[3] = 0;
        try {
            callMethod(klass, "verifyValueBounds", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


