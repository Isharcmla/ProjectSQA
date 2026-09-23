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

public class FastDateFormat_getDateTimeInstance_149510366658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10312;
     Object term10316;
     Object term10318;

    public FastDateFormat_getDateTimeInstance_149510366658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10312 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10312, term10312.getClass(), "mPattern", null);
        setField(term10312, term10312.getClass(), "mTimeZone", null);
        setBooleanField(term10312, term10312.getClass(), "mTimeZoneForced", false);
        setField(term10312, term10312.getClass(), "mLocale", null);
        setBooleanField(term10312, term10312.getClass(), "mLocaleForced", false);
        setField(term10312, term10312.getClass(), "mRules", null);
        setIntField(term10312, term10312.getClass(), "mMaxLengthEstimate", 0);
        term10316 = new Integer(0);
        term10318 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term10316;
        args[1] = term10318;
        args[2] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term10312, args);
    }

};


