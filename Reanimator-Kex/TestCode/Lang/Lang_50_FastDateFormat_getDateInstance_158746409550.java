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

public class FastDateFormat_getDateInstance_158746409550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10260;
     Object term10264;

    public FastDateFormat_getDateInstance_158746409550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10260 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10260, term10260.getClass(), "mPattern", null);
        setField(term10260, term10260.getClass(), "mTimeZone", null);
        setBooleanField(term10260, term10260.getClass(), "mTimeZoneForced", false);
        setField(term10260, term10260.getClass(), "mLocale", null);
        setBooleanField(term10260, term10260.getClass(), "mLocaleForced", false);
        setField(term10260, term10260.getClass(), "mRules", null);
        setIntField(term10260, term10260.getClass(), "mMaxLengthEstimate", 0);
        term10264 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[2];
        args[0] = term10264;
        args[1] = null;
        callMethod(klass, "getDateInstance", argTypes, term10260, args);
    }

};


