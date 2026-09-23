package org.joda.time.base;

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
import java.lang.StackOverflowError;
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseSingleFieldPeriod_between_180280244169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42875;
     Object term43101;

    public BaseSingleFieldPeriod_between_180280244169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42875 = newInstance(Class.forName("org.joda.time.YearMonth"));
        Object term42953 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term43049 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term43049, term43049.getClass(), "iField", term43049);
        setField(term42953, term42953.getClass(), "iYear", term43049);
        setField(term42875, term42875.getClass(), "iChronology", term42953);
        term43101 = newInstance(Class.forName("org.joda.time.YearMonth"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term42875;
        args[1] = term43101;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


