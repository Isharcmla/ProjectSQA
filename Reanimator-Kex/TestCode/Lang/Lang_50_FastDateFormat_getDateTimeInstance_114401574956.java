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

public class FastDateFormat_getDateTimeInstance_114401574956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10296;
     Object term10300;
     Object term10302;

    public FastDateFormat_getDateTimeInstance_114401574956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10296 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10296, term10296.getClass(), "mPattern", null);
        setField(term10296, term10296.getClass(), "mTimeZone", null);
        setBooleanField(term10296, term10296.getClass(), "mTimeZoneForced", false);
        setField(term10296, term10296.getClass(), "mLocale", null);
        setBooleanField(term10296, term10296.getClass(), "mLocaleForced", false);
        setField(term10296, term10296.getClass(), "mRules", null);
        setIntField(term10296, term10296.getClass(), "mMaxLengthEstimate", 0);
        term10300 = new Integer(0);
        term10302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10300;
        args[1] = term10302;
        callMethod(klass, "getDateTimeInstance", argTypes, term10296, args);
    }

};


