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

public class FastDateFormat_getDateInstance_64268682352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8500;
     Object term8504;

    public FastDateFormat_getDateInstance_64268682352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8500 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8500, term8500.getClass(), "mPattern", null);
        setField(term8500, term8500.getClass(), "mTimeZone", null);
        setBooleanField(term8500, term8500.getClass(), "mTimeZoneForced", false);
        setField(term8500, term8500.getClass(), "mLocale", null);
        setBooleanField(term8500, term8500.getClass(), "mLocaleForced", false);
        setField(term8500, term8500.getClass(), "mRules", null);
        setIntField(term8500, term8500.getClass(), "mMaxLengthEstimate", 0);
        term8504 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term8504;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getDateInstance", argTypes, term8500, args);
    }

};


