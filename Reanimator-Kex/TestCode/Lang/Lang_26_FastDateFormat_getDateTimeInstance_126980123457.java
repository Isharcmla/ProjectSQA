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

public class FastDateFormat_getDateTimeInstance_126980123457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10570;
     Object term10574;
     Object term10576;

    public FastDateFormat_getDateTimeInstance_126980123457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10570 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10570, term10570.getClass(), "mPattern", null);
        setField(term10570, term10570.getClass(), "mTimeZone", null);
        setBooleanField(term10570, term10570.getClass(), "mTimeZoneForced", false);
        setField(term10570, term10570.getClass(), "mLocale", null);
        setBooleanField(term10570, term10570.getClass(), "mLocaleForced", false);
        setField(term10570, term10570.getClass(), "mRules", null);
        setIntField(term10570, term10570.getClass(), "mMaxLengthEstimate", 0);
        term10574 = new Integer(0);
        term10576 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term10574;
        args[1] = term10576;
        args[2] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term10570, args);
    }

};


