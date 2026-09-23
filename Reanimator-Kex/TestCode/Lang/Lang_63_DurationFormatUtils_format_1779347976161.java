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
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115135;
     Object term118332;

    public DurationFormatUtils_format_1779347976161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term115931 = new StringBuilder();
        StringBuffer term116543 = new StringBuffer();
        StringBuffer term116715 = new StringBuffer();
        term115135 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term115655 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term115757 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term115871 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term116045 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term116147 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term116261 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term116371 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term116485 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term116657 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term115655, term115655.getClass(), "value", term115757);
        setIntField(term115655, term115655.getClass(), "count", 0);
        setElement(term115135, 0, term115655);
        setField(term115871, term115871.getClass(), "value", term115931);
        setIntField(term115871, term115871.getClass(), "count", 0);
        setElement(term115135, 1, term115871);
        setField(term116045, term116045.getClass(), "value", term116147);
        setIntField(term116045, term116045.getClass(), "count", 0);
        setElement(term115135, 2, term116045);
        setField(term116261, term116261.getClass(), "value", term116371);
        setIntField(term116261, term116261.getClass(), "count", 0);
        setElement(term115135, 3, term116261);
        setField(term116485, term116485.getClass(), "value", term116543);
        setIntField(term116485, term116485.getClass(), "count", 0);
        setElement(term115135, 4, term116485);
        setField(term116657, term116657.getClass(), "value", term116715);
        setIntField(term116657, term116657.getClass(), "count", 0);
        setElement(term115135, 5, term116657);
        term118332 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term118333 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118334 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term118335 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118336 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term118337 = (byte[]) newByteArray(16);
        Object term118338 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118339 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term118340 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118341 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term118342 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118343 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term118346 = (byte[]) newByteArray(16);
        Object term118347 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118348 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term118351 = (byte[]) newByteArray(16);
        setField(term118333, term118333.getClass(), "value", term118334);
        setIntField(term118333, term118333.getClass(), "count", 0);
        setElement(term118332, 0, term118333);
        setField(term118336, term118336.getClass(), "value", term118337);
        setByteField(term118336, term118336.getClass(), "coder", (byte) 0);
        setIntField(term118336, term118336.getClass(), "count", 0);
        setField(term118335, term118335.getClass(), "value", term118336);
        setIntField(term118335, term118335.getClass(), "count", 0);
        setElement(term118332, 1, term118335);
        setField(term118338, term118338.getClass(), "value", term118339);
        setIntField(term118338, term118338.getClass(), "count", 0);
        setElement(term118332, 2, term118338);
        setField(term118340, term118340.getClass(), "value", term118341);
        setIntField(term118340, term118340.getClass(), "count", 0);
        setElement(term118332, 3, term118340);
        setField(term118343, term118343.getClass(), "toStringCache", "");
        setField(term118343, term118343.getClass(), "value", term118346);
        setByteField(term118343, term118343.getClass(), "coder", (byte) 0);
        setIntField(term118343, term118343.getClass(), "count", 0);
        setField(term118342, term118342.getClass(), "value", term118343);
        setIntField(term118342, term118342.getClass(), "count", 0);
        setElement(term118332, 4, term118342);
        setField(term118348, term118348.getClass(), "toStringCache", "");
        setField(term118348, term118348.getClass(), "value", term118351);
        setByteField(term118348, term118348.getClass(), "coder", (byte) 0);
        setIntField(term118348, term118348.getClass(), "count", 0);
        setField(term118347, term118347.getClass(), "value", term118348);
        setIntField(term118347, term118347.getClass(), "count", 0);
        setElement(term118332, 5, term118347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term115135;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term115135, term118332));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


