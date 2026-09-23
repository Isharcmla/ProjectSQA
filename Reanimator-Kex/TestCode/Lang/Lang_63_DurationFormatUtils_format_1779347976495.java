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

public class DurationFormatUtils_format_1779347976495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418127;
     Object term420004;

    public DurationFormatUtils_format_1779347976495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term418576 = new StringBuffer();
        StringBuffer term418748 = new StringBuffer();
        StringBuffer term419034 = new StringBuffer();
        StringBuffer term419320 = new StringBuffer();
        term418127 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term418518 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418690 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418862 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418976 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term419148 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term419262 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term418518, term418518.getClass(), "value", term418576);
        setIntField(term418518, term418518.getClass(), "count", 0);
        setElement(term418127, 0, term418518);
        setField(term418690, term418690.getClass(), "value", term418748);
        setIntField(term418690, term418690.getClass(), "count", 0);
        setElement(term418127, 1, term418690);
        setField(term418862, term418862.getClass(), "value", null);
        setIntField(term418862, term418862.getClass(), "count", 0);
        setElement(term418127, 2, term418862);
        setElement(term418127, 3, term418518);
        setField(term418976, term418976.getClass(), "value", term419034);
        setIntField(term418976, term418976.getClass(), "count", 0);
        setElement(term418127, 4, term418976);
        setField(term419148, term419148.getClass(), "value", null);
        setIntField(term419148, term419148.getClass(), "count", 0);
        setElement(term418127, 5, term419148);
        setField(term419262, term419262.getClass(), "value", term419320);
        setIntField(term419262, term419262.getClass(), "count", 0);
        setElement(term418127, 6, term419262);
        term420004 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term420005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420006 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term420009 = (byte[]) newByteArray(16);
        Object term420010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420011 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term420014 = (byte[]) newByteArray(16);
        Object term420015 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420016 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420017 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term420020 = (byte[]) newByteArray(16);
        Object term420021 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420022 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term420023 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term420026 = (byte[]) newByteArray(16);
        setField(term420006, term420006.getClass(), "toStringCache", "");
        setField(term420006, term420006.getClass(), "value", term420009);
        setByteField(term420006, term420006.getClass(), "coder", (byte) 0);
        setIntField(term420006, term420006.getClass(), "count", 0);
        setField(term420005, term420005.getClass(), "value", term420006);
        setIntField(term420005, term420005.getClass(), "count", 0);
        setElement(term420004, 0, term420005);
        setField(term420011, term420011.getClass(), "toStringCache", "");
        setField(term420011, term420011.getClass(), "value", term420014);
        setByteField(term420011, term420011.getClass(), "coder", (byte) 0);
        setIntField(term420011, term420011.getClass(), "count", 0);
        setField(term420010, term420010.getClass(), "value", term420011);
        setIntField(term420010, term420010.getClass(), "count", 0);
        setElement(term420004, 1, term420010);
        setField(term420015, term420015.getClass(), "value", null);
        setIntField(term420015, term420015.getClass(), "count", 0);
        setElement(term420004, 2, term420015);
        setElement(term420004, 3, term420005);
        setField(term420017, term420017.getClass(), "toStringCache", "");
        setField(term420017, term420017.getClass(), "value", term420020);
        setByteField(term420017, term420017.getClass(), "coder", (byte) 0);
        setIntField(term420017, term420017.getClass(), "count", 0);
        setField(term420016, term420016.getClass(), "value", term420017);
        setIntField(term420016, term420016.getClass(), "count", 0);
        setElement(term420004, 4, term420016);
        setField(term420021, term420021.getClass(), "value", null);
        setIntField(term420021, term420021.getClass(), "count", 0);
        setElement(term420004, 5, term420021);
        setField(term420023, term420023.getClass(), "toStringCache", "");
        setField(term420023, term420023.getClass(), "value", term420026);
        setByteField(term420023, term420023.getClass(), "coder", (byte) 0);
        setIntField(term420023, term420023.getClass(), "count", 0);
        setField(term420022, term420022.getClass(), "value", term420023);
        setIntField(term420022, term420022.getClass(), "count", 0);
        setElement(term420004, 6, term420022);
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
        args[0] = term418127;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term418127, term420004));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


