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
import java.lang.Integer;

public class FastDateFormat_getTimeInstance_170386690552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10536;
     Object term10540;

    public FastDateFormat_getTimeInstance_170386690552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10536 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10536, term10536.getClass(), "mPattern", null);
        setField(term10536, term10536.getClass(), "mTimeZone", null);
        setBooleanField(term10536, term10536.getClass(), "mTimeZoneForced", false);
        setField(term10536, term10536.getClass(), "mLocale", null);
        setBooleanField(term10536, term10536.getClass(), "mLocaleForced", false);
        setField(term10536, term10536.getClass(), "mRules", null);
        setIntField(term10536, term10536.getClass(), "mMaxLengthEstimate", 0);
        term10540 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10540;
        callMethod(klass, "getTimeInstance", argTypes, term10536, args);
    }

};


