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

public class DurationFormatUtils_format_1779347976523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445020;
     Object term446532;

    public DurationFormatUtils_format_1779347976523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term445459 = new StringBuffer();
        StringBuffer term445631 = new StringBuffer();
        term445020 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term445401 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term445573 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term445745 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term445859 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term445973 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term445401, term445401.getClass(), "value", term445459);
        setIntField(term445401, term445401.getClass(), "count", 0);
        setElement(term445020, 0, term445401);
        setField(term445573, term445573.getClass(), "value", term445631);
        setIntField(term445573, term445573.getClass(), "count", 0);
        setElement(term445020, 1, term445573);
        setField(term445745, term445745.getClass(), "value", null);
        setIntField(term445745, term445745.getClass(), "count", 0);
        setElement(term445020, 2, term445745);
        setField(term445859, term445859.getClass(), "value", term445459);
        setIntField(term445859, term445859.getClass(), "count", 0);
        setElement(term445020, 3, term445859);
        setElement(term445020, 4, term445401);
        setField(term445973, term445973.getClass(), "value", term445745);
        setIntField(term445973, term445973.getClass(), "count", 0);
        setElement(term445020, 5, term445973);
        term446532 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term446533 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446534 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term446537 = (byte[]) newByteArray(16);
        Object term446538 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446539 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term446542 = (byte[]) newByteArray(16);
        Object term446543 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446544 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446545 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term446534, term446534.getClass(), "toStringCache", "");
        setField(term446534, term446534.getClass(), "value", term446537);
        setByteField(term446534, term446534.getClass(), "coder", (byte) 0);
        setIntField(term446534, term446534.getClass(), "count", 0);
        setField(term446533, term446533.getClass(), "value", term446534);
        setIntField(term446533, term446533.getClass(), "count", 0);
        setElement(term446532, 0, term446533);
        setField(term446539, term446539.getClass(), "toStringCache", "");
        setField(term446539, term446539.getClass(), "value", term446542);
        setByteField(term446539, term446539.getClass(), "coder", (byte) 0);
        setIntField(term446539, term446539.getClass(), "count", 0);
        setField(term446538, term446538.getClass(), "value", term446539);
        setIntField(term446538, term446538.getClass(), "count", 0);
        setElement(term446532, 1, term446538);
        setField(term446543, term446543.getClass(), "value", null);
        setIntField(term446543, term446543.getClass(), "count", 0);
        setElement(term446532, 2, term446543);
        setField(term446544, term446544.getClass(), "value", term446534);
        setIntField(term446544, term446544.getClass(), "count", 0);
        setElement(term446532, 3, term446544);
        setElement(term446532, 4, term446533);
        setField(term446545, term446545.getClass(), "value", term446543);
        setIntField(term446545, term446545.getClass(), "count", 0);
        setElement(term446532, 5, term446545);
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
        args[0] = term445020;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term445020, term446532));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


