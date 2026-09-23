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

public class FastDateFormat_getTimeInstance_90247397656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8524;
     Object term8528;

    public FastDateFormat_getTimeInstance_90247397656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8524 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8524, term8524.getClass(), "mPattern", null);
        setField(term8524, term8524.getClass(), "mTimeZone", null);
        setBooleanField(term8524, term8524.getClass(), "mTimeZoneForced", false);
        setField(term8524, term8524.getClass(), "mLocale", null);
        setBooleanField(term8524, term8524.getClass(), "mLocaleForced", false);
        setField(term8524, term8524.getClass(), "mRules", null);
        setIntField(term8524, term8524.getClass(), "mMaxLengthEstimate", 0);
        term8528 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term8528;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getTimeInstance", argTypes, term8524, args);
    }

};


