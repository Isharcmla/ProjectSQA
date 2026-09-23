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
import static org.apache.commons.lang.time.EqualityUtils.*;

public class DateUtils_isSameInstant_113008078929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term1191;
     Object term8570;
     Object term8571;

    public DateUtils_isSameInstant_113008078929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1189 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1189, term1189.getClass(), "fastTime", 1610958182830L);
        setField(term1189, term1189.getClass(), "cdate", null);
        term1191 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1191, term1191.getClass(), "fastTime", 1606063635837L);
        setField(term1191, term1191.getClass(), "cdate", null);
        term8570 = newInstance(Class.forName("java.util.Date"));
        setLongField(term8570, term8570.getClass(), "fastTime", 1610958182830L);
        setField(term8570, term8570.getClass(), "cdate", null);
        term8571 = newInstance(Class.forName("java.util.Date"));
        setLongField(term8571, term8571.getClass(), "fastTime", 1606063635837L);
        setField(term8571, term8571.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term1189;
        args[1] = term1191;
        Object retValue = callMethod(klass, "isSameInstant", argTypes, null, args);
        assertTrue(recursiveEquals(term1189, term8570));
        assertTrue(recursiveEquals(term1191, term8571));
        assertTrue(recursiveEquals(retValue, false));
    }

};


