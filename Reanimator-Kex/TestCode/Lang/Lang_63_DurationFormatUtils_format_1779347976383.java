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

public class DurationFormatUtils_format_1779347976383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313469;
     Object term315488;

    public DurationFormatUtils_format_1779347976383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term313804 = new StringBuffer();
        StringBuffer term314090 = new StringBuffer();
        StringBuffer term314262 = new StringBuffer();
        term313469 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term313746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term313918 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term314032 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term314204 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term314376 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term314486 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term314600 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term313524 = (char[]) newCharArray(0);
        Object term314714 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term314828 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term313746, term313746.getClass(), "value", term313804);
        setIntField(term313746, term313746.getClass(), "count", 0);
        setElement(term313469, 0, term313746);
        setField(term313918, term313918.getClass(), "value", term313746);
        setIntField(term313918, term313918.getClass(), "count", 0);
        setElement(term313469, 1, term313918);
        setField(term314032, term314032.getClass(), "value", term314090);
        setIntField(term314032, term314032.getClass(), "count", 0);
        setElement(term313469, 2, term314032);
        setField(term314204, term314204.getClass(), "value", term314262);
        setIntField(term314204, term314204.getClass(), "count", 0);
        setElement(term313469, 3, term314204);
        setField(term314376, term314376.getClass(), "value", term314486);
        setIntField(term314376, term314376.getClass(), "count", 0);
        setElement(term313469, 4, term314376);
        setField(term314600, term314600.getClass(), "value", term313524);
        setIntField(term314600, term314600.getClass(), "count", 0);
        setElement(term313469, 5, term314600);
        setElement(term313469, 6, term314714);
        setElement(term313469, 7, term314828);
        term315488 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term315489 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315490 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term315493 = (byte[]) newByteArray(16);
        Object term315494 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315495 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315496 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term315499 = (byte[]) newByteArray(16);
        Object term315500 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315501 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term315504 = (byte[]) newByteArray(16);
        Object term315505 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315506 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term315507 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term315508 = (char[]) newCharArray(0);
        Object term315509 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315510 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term315490, term315490.getClass(), "toStringCache", "");
        setField(term315490, term315490.getClass(), "value", term315493);
        setByteField(term315490, term315490.getClass(), "coder", (byte) 0);
        setIntField(term315490, term315490.getClass(), "count", 0);
        setField(term315489, term315489.getClass(), "value", term315490);
        setIntField(term315489, term315489.getClass(), "count", 0);
        setElement(term315488, 0, term315489);
        setField(term315494, term315494.getClass(), "value", term315489);
        setIntField(term315494, term315494.getClass(), "count", 0);
        setElement(term315488, 1, term315494);
        setField(term315496, term315496.getClass(), "toStringCache", "");
        setField(term315496, term315496.getClass(), "value", term315499);
        setByteField(term315496, term315496.getClass(), "coder", (byte) 0);
        setIntField(term315496, term315496.getClass(), "count", 0);
        setField(term315495, term315495.getClass(), "value", term315496);
        setIntField(term315495, term315495.getClass(), "count", 0);
        setElement(term315488, 2, term315495);
        setField(term315501, term315501.getClass(), "toStringCache", "");
        setField(term315501, term315501.getClass(), "value", term315504);
        setByteField(term315501, term315501.getClass(), "coder", (byte) 0);
        setIntField(term315501, term315501.getClass(), "count", 0);
        setField(term315500, term315500.getClass(), "value", term315501);
        setIntField(term315500, term315500.getClass(), "count", 0);
        setElement(term315488, 3, term315500);
        setField(term315505, term315505.getClass(), "value", term315506);
        setIntField(term315505, term315505.getClass(), "count", 0);
        setElement(term315488, 4, term315505);
        setField(term315507, term315507.getClass(), "value", term315508);
        setIntField(term315507, term315507.getClass(), "count", 0);
        setElement(term315488, 5, term315507);
        setField(term315509, term315509.getClass(), "value", null);
        setIntField(term315509, term315509.getClass(), "count", 0);
        setElement(term315488, 6, term315509);
        setField(term315510, term315510.getClass(), "value", null);
        setIntField(term315510, term315510.getClass(), "count", 0);
        setElement(term315488, 7, term315510);
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
        args[0] = term313469;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term313469, term315488));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


