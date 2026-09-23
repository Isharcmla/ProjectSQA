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

public class DurationFormatUtils_format_1779347976341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261521;
     Object term263329;

    public DurationFormatUtils_format_1779347976341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term262329 = new StringBuffer();
        StringBuffer term262501 = new StringBuffer();
        StringBuffer term262673 = new StringBuffer();
        StringBuffer term262845 = new StringBuffer();
        term261521 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term262271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term262443 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term262615 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term262787 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term262959 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term261811 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term262271, term262271.getClass(), "value", term262329);
        setIntField(term262271, term262271.getClass(), "count", 0);
        setElement(term261521, 0, term262271);
        setField(term262443, term262443.getClass(), "value", term262501);
        setIntField(term262443, term262443.getClass(), "count", 0);
        setElement(term261521, 1, term262443);
        setField(term262615, term262615.getClass(), "value", term262673);
        setIntField(term262615, term262615.getClass(), "count", 0);
        setElement(term261521, 2, term262615);
        setField(term262787, term262787.getClass(), "value", term262845);
        setIntField(term262787, term262787.getClass(), "count", 0);
        setElement(term261521, 3, term262787);
        setField(term262959, term262959.getClass(), "value", term261811);
        setIntField(term262959, term262959.getClass(), "count", 0);
        setElement(term261521, 4, term262959);
        term263329 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term263330 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term263331 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term263334 = (byte[]) newByteArray(16);
        Object term263335 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term263336 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term263339 = (byte[]) newByteArray(16);
        Object term263340 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term263341 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term263344 = (byte[]) newByteArray(16);
        Object term263345 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term263346 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term263349 = (byte[]) newByteArray(16);
        Object term263350 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term263351 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term263331, term263331.getClass(), "toStringCache", "");
        setField(term263331, term263331.getClass(), "value", term263334);
        setByteField(term263331, term263331.getClass(), "coder", (byte) 0);
        setIntField(term263331, term263331.getClass(), "count", 0);
        setField(term263330, term263330.getClass(), "value", term263331);
        setIntField(term263330, term263330.getClass(), "count", 0);
        setElement(term263329, 0, term263330);
        setField(term263336, term263336.getClass(), "toStringCache", "");
        setField(term263336, term263336.getClass(), "value", term263339);
        setByteField(term263336, term263336.getClass(), "coder", (byte) 0);
        setIntField(term263336, term263336.getClass(), "count", 0);
        setField(term263335, term263335.getClass(), "value", term263336);
        setIntField(term263335, term263335.getClass(), "count", 0);
        setElement(term263329, 1, term263335);
        setField(term263341, term263341.getClass(), "toStringCache", "");
        setField(term263341, term263341.getClass(), "value", term263344);
        setByteField(term263341, term263341.getClass(), "coder", (byte) 0);
        setIntField(term263341, term263341.getClass(), "count", 0);
        setField(term263340, term263340.getClass(), "value", term263341);
        setIntField(term263340, term263340.getClass(), "count", 0);
        setElement(term263329, 2, term263340);
        setField(term263346, term263346.getClass(), "toStringCache", "");
        setField(term263346, term263346.getClass(), "value", term263349);
        setByteField(term263346, term263346.getClass(), "coder", (byte) 0);
        setIntField(term263346, term263346.getClass(), "count", 0);
        setField(term263345, term263345.getClass(), "value", term263346);
        setIntField(term263345, term263345.getClass(), "count", 0);
        setElement(term263329, 3, term263345);
        setField(term263350, term263350.getClass(), "value", term263351);
        setIntField(term263350, term263350.getClass(), "count", 0);
        setElement(term263329, 4, term263350);
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
        args[0] = term261521;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term261521, term263329));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


