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

public class FastDateFormat_getTimeZoneDisplay_117257549459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10586;
     Object term10590;
     Object term10592;

    public FastDateFormat_getTimeZoneDisplay_117257549459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10586 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10586, term10586.getClass(), "mPattern", null);
        setField(term10586, term10586.getClass(), "mTimeZone", null);
        setBooleanField(term10586, term10586.getClass(), "mTimeZoneForced", false);
        setField(term10586, term10586.getClass(), "mLocale", null);
        setBooleanField(term10586, term10586.getClass(), "mLocaleForced", false);
        setField(term10586, term10586.getClass(), "mRules", null);
        setIntField(term10586, term10586.getClass(), "mMaxLengthEstimate", 0);
        term10590 = new Boolean(false);
        term10592 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term10590;
        args[2] = term10592;
        args[3] = null;
        callMethod(klass, "getTimeZoneDisplay", argTypes, term10586, args);
    }

};


