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

public class FastDateFormat_getTimeInstance_90247397655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10290;
     Object term10294;

    public FastDateFormat_getTimeInstance_90247397655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10290 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10290, term10290.getClass(), "mPattern", null);
        setField(term10290, term10290.getClass(), "mTimeZone", null);
        setBooleanField(term10290, term10290.getClass(), "mTimeZoneForced", false);
        setField(term10290, term10290.getClass(), "mLocale", null);
        setBooleanField(term10290, term10290.getClass(), "mLocaleForced", false);
        setField(term10290, term10290.getClass(), "mRules", null);
        setIntField(term10290, term10290.getClass(), "mMaxLengthEstimate", 0);
        term10294 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term10294;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getTimeInstance", argTypes, term10290, args);
    }

};


