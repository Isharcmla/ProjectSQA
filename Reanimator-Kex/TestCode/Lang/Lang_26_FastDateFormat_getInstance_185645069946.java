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

public class FastDateFormat_getInstance_185645069946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10504;

    public FastDateFormat_getInstance_185645069946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10504 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10504, term10504.getClass(), "mPattern", null);
        setField(term10504, term10504.getClass(), "mTimeZone", null);
        setBooleanField(term10504, term10504.getClass(), "mTimeZoneForced", false);
        setField(term10504, term10504.getClass(), "mLocale", null);
        setBooleanField(term10504, term10504.getClass(), "mLocaleForced", false);
        setField(term10504, term10504.getClass(), "mRules", null);
        setIntField(term10504, term10504.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getInstance", argTypes, term10504, args);
    }

};


