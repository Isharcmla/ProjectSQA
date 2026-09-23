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

public class FastDateFormat_getDateInstance_6659632649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8482;
     Object term8486;

    public FastDateFormat_getDateInstance_6659632649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8482 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8482, term8482.getClass(), "mPattern", null);
        setField(term8482, term8482.getClass(), "mTimeZone", null);
        setBooleanField(term8482, term8482.getClass(), "mTimeZoneForced", false);
        setField(term8482, term8482.getClass(), "mLocale", null);
        setBooleanField(term8482, term8482.getClass(), "mLocaleForced", false);
        setField(term8482, term8482.getClass(), "mRules", null);
        setIntField(term8482, term8482.getClass(), "mMaxLengthEstimate", 0);
        term8486 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8486;
        callMethod(klass, "getDateInstance", argTypes, term8482, args);
    }

};


