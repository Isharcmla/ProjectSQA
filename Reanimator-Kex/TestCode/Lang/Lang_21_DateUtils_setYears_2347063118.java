package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DateUtils_setYears_2347063118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3934;
     Object term3936;

    public DateUtils_setYears_2347063118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3934 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3934, term3934.getClass(), "fastTime", 1349087753960L);
        setField(term3934, term3934.getClass(), "cdate", null);
        term3936 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3934;
        args[1] = term3936;
        callMethod(klass, "setYears", argTypes, null, args);
    }

};


