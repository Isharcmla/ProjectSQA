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

public class FastDateFormat_getDateTimeInstance_126980123459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10388;
     Object term10392;
     Object term10394;

    public FastDateFormat_getDateTimeInstance_126980123459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10388 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10388, term10388.getClass(), "mPattern", null);
        setField(term10388, term10388.getClass(), "mTimeZone", null);
        setBooleanField(term10388, term10388.getClass(), "mTimeZoneForced", false);
        setField(term10388, term10388.getClass(), "mLocale", null);
        setBooleanField(term10388, term10388.getClass(), "mLocaleForced", false);
        setField(term10388, term10388.getClass(), "mRules", null);
        setIntField(term10388, term10388.getClass(), "mMaxLengthEstimate", 0);
        term10392 = new Integer(0);
        term10394 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term10392;
        args[1] = term10394;
        args[2] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term10388, args);
    }

};


