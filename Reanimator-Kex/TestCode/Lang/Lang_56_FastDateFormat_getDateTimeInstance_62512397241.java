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

public class FastDateFormat_getDateTimeInstance_62512397241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8442;
     Object term8446;
     Object term8448;

    public FastDateFormat_getDateTimeInstance_62512397241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8442 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8442, term8442.getClass(), "mPattern", null);
        setField(term8442, term8442.getClass(), "mTimeZone", null);
        setBooleanField(term8442, term8442.getClass(), "mTimeZoneForced", false);
        setField(term8442, term8442.getClass(), "mLocale", null);
        setBooleanField(term8442, term8442.getClass(), "mLocaleForced", false);
        setField(term8442, term8442.getClass(), "mRules", null);
        setIntField(term8442, term8442.getClass(), "mMaxLengthEstimate", 0);
        term8446 = new Integer(0);
        term8448 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = term8446;
        args[1] = term8448;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term8442, args);
    }

};


