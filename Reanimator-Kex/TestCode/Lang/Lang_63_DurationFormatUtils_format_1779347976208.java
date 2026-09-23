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

public class DurationFormatUtils_format_1779347976208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142525;
     Object term145262;

    public DurationFormatUtils_format_1779347976208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term143943 = new StringBuffer();
        StringBuffer term144115 = new StringBuffer();
        term142525 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term143771 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term143885 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144057 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144229 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term143771, term143771.getClass(), "value", null);
        setIntField(term143771, term143771.getClass(), "count", 0);
        setElement(term142525, 0, term143771);
        setField(term143885, term143885.getClass(), "value", term143943);
        setIntField(term143885, term143885.getClass(), "count", 0);
        setElement(term142525, 1, term143885);
        setField(term144057, term144057.getClass(), "value", term144115);
        setIntField(term144057, term144057.getClass(), "count", 0);
        setElement(term142525, 2, term144057);
        setElement(term142525, 3, term144229);
        term145262 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term145263 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145265 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term145268 = (byte[]) newByteArray(16);
        Object term145269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145270 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term145273 = (byte[]) newByteArray(16);
        Object term145274 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term145263, term145263.getClass(), "value", null);
        setIntField(term145263, term145263.getClass(), "count", 0);
        setElement(term145262, 0, term145263);
        setField(term145265, term145265.getClass(), "toStringCache", "");
        setField(term145265, term145265.getClass(), "value", term145268);
        setByteField(term145265, term145265.getClass(), "coder", (byte) 0);
        setIntField(term145265, term145265.getClass(), "count", 0);
        setField(term145264, term145264.getClass(), "value", term145265);
        setIntField(term145264, term145264.getClass(), "count", 0);
        setElement(term145262, 1, term145264);
        setField(term145270, term145270.getClass(), "toStringCache", "");
        setField(term145270, term145270.getClass(), "value", term145273);
        setByteField(term145270, term145270.getClass(), "coder", (byte) 0);
        setIntField(term145270, term145270.getClass(), "count", 0);
        setField(term145269, term145269.getClass(), "value", term145270);
        setIntField(term145269, term145269.getClass(), "count", 0);
        setElement(term145262, 2, term145269);
        setField(term145274, term145274.getClass(), "value", null);
        setIntField(term145274, term145274.getClass(), "count", 0);
        setElement(term145262, 3, term145274);
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
        args[0] = term142525;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term142525, term145262));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


