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
import java.lang.Boolean;
import java.lang.Integer;

public class FastDatePrinter_getTimeZoneDisplay_78689532956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27476;
     Object term27478;
     Object term27480;

    public FastDatePrinter_getTimeZoneDisplay_78689532956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27476 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(term27476, term27476.getClass(), "mPattern", null);
        setField(term27476, term27476.getClass(), "mTimeZone", null);
        setField(term27476, term27476.getClass(), "mLocale", null);
        setField(term27476, term27476.getClass(), "mRules", null);
        setIntField(term27476, term27476.getClass(), "mMaxLengthEstimate", 0);
        term27478 = new Boolean(false);
        term27480 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term27478;
        args[2] = term27480;
        args[3] = null;
        callMethod(klass, "getTimeZoneDisplay", argTypes, term27476, args);
    }

};


