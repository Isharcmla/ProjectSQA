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
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396841;
     Object term397956;

    public DurationFormatUtils_format_1779347976467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term397738 = new StringBuffer();
        term396841 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term397566 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term397680 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term397566, term397566.getClass(), "value", null);
        setIntField(term397566, term397566.getClass(), "count", 0);
        setElement(term396841, 0, term397566);
        setField(term397680, term397680.getClass(), "value", term397738);
        setIntField(term397680, term397680.getClass(), "count", 0);
        setElement(term396841, 1, term397680);
        setElement(term396841, 2, term397566);
        setElement(term396841, 3, term397680);
        setElement(term396841, 4, term397680);
        setElement(term396841, 5, term397566);
        term397956 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term397957 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term397958 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term397959 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term397962 = (byte[]) newByteArray(16);
        setField(term397957, term397957.getClass(), "value", null);
        setIntField(term397957, term397957.getClass(), "count", 0);
        setElement(term397956, 0, term397957);
        setField(term397959, term397959.getClass(), "toStringCache", "");
        setField(term397959, term397959.getClass(), "value", term397962);
        setByteField(term397959, term397959.getClass(), "coder", (byte) 0);
        setIntField(term397959, term397959.getClass(), "count", 0);
        setField(term397958, term397958.getClass(), "value", term397959);
        setIntField(term397958, term397958.getClass(), "count", 0);
        setElement(term397956, 1, term397958);
        setElement(term397956, 2, term397957);
        setElement(term397956, 3, term397958);
        setElement(term397956, 4, term397958);
        setElement(term397956, 5, term397957);
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
        args[0] = term396841;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term396841, term397956));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


