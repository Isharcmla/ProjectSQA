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

public class FastDateFormat_getTimeInstance_147856447352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10272;
     Object term10276;

    public FastDateFormat_getTimeInstance_147856447352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10272 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10272, term10272.getClass(), "mPattern", null);
        setField(term10272, term10272.getClass(), "mTimeZone", null);
        setBooleanField(term10272, term10272.getClass(), "mTimeZoneForced", false);
        setField(term10272, term10272.getClass(), "mLocale", null);
        setBooleanField(term10272, term10272.getClass(), "mLocaleForced", false);
        setField(term10272, term10272.getClass(), "mRules", null);
        setIntField(term10272, term10272.getClass(), "mMaxLengthEstimate", 0);
        term10276 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10276;
        callMethod(klass, "getTimeInstance", argTypes, term10272, args);
    }

};


