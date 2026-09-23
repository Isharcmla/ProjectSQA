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

public class FastDateFormat_getDateTimeInstance_149510366659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8546;
     Object term8550;
     Object term8552;

    public FastDateFormat_getDateTimeInstance_149510366659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8546 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8546, term8546.getClass(), "mPattern", null);
        setField(term8546, term8546.getClass(), "mTimeZone", null);
        setBooleanField(term8546, term8546.getClass(), "mTimeZoneForced", false);
        setField(term8546, term8546.getClass(), "mLocale", null);
        setBooleanField(term8546, term8546.getClass(), "mLocaleForced", false);
        setField(term8546, term8546.getClass(), "mRules", null);
        setIntField(term8546, term8546.getClass(), "mMaxLengthEstimate", 0);
        term8550 = new Integer(0);
        term8552 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term8550;
        args[1] = term8552;
        args[2] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term8546, args);
    }

};


