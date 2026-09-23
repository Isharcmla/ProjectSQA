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
import java.lang.Boolean;
import java.lang.Integer;

public class FastDateFormat_getTimeZoneDisplay_89086415142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8450;
     Object term8454;
     Object term8456;

    public FastDateFormat_getTimeZoneDisplay_89086415142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8450 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8450, term8450.getClass(), "mPattern", null);
        setField(term8450, term8450.getClass(), "mTimeZone", null);
        setBooleanField(term8450, term8450.getClass(), "mTimeZoneForced", false);
        setField(term8450, term8450.getClass(), "mLocale", null);
        setBooleanField(term8450, term8450.getClass(), "mLocaleForced", false);
        setField(term8450, term8450.getClass(), "mRules", null);
        setIntField(term8450, term8450.getClass(), "mMaxLengthEstimate", 0);
        term8454 = new Boolean(false);
        term8456 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term8454;
        args[2] = term8456;
        args[3] = null;
        callMethod(klass, "getTimeZoneDisplay", argTypes, term8450, args);
    }

};


