package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96909;
     Object term96967;

    public BasicMonthOfYearDateTimeField_add_1905304068363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96909 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term96967 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term97045 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term97133 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term97231 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term97133, term97133.getClass(), "iField", term97231);
        setField(term97045, term97045.getClass(), "iYear", term97133);
        setField(term96967, term96967.getClass(), "iChronology", term97045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term96967;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term96909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


