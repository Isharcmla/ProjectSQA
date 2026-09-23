package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DateUtils_truncate_188336876419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4335;
     Object term4337;

    public DateUtils_truncate_188336876419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4335 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4335, term4335.getClass(), "fastTime", 1706096172457L);
        setField(term4335, term4335.getClass(), "cdate", null);
        term4337 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4335;
        args[1] = term4337;
        callMethod(klass, "truncate", argTypes, null, args);
    }

};


