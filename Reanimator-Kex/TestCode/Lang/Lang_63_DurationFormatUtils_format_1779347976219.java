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

public class DurationFormatUtils_format_1779347976219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149785;
     Object term152404;

    public DurationFormatUtils_format_1779347976219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term150155 = new StringBuffer();
        StringBuffer term150441 = new StringBuffer();
        term149785 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term150097 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term150269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term150383 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term150555 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term149876 = (char[]) newCharArray(0);
        Object term150669 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term150783 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term150097, term150097.getClass(), "value", term150155);
        setIntField(term150097, term150097.getClass(), "count", 0);
        setElement(term149785, 0, term150097);
        setField(term150269, term150269.getClass(), "value", null);
        setIntField(term150269, term150269.getClass(), "count", 0);
        setElement(term149785, 1, term150269);
        setField(term150383, term150383.getClass(), "value", term150441);
        setIntField(term150383, term150383.getClass(), "count", 0);
        setElement(term149785, 2, term150383);
        setField(term150555, term150555.getClass(), "value", term149876);
        setIntField(term150555, term150555.getClass(), "count", 0);
        setElement(term149785, 3, term150555);
        setField(term150669, term150669.getClass(), "value", term150783);
        setIntField(term150669, term150669.getClass(), "count", 0);
        setElement(term149785, 4, term150669);
        term152404 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term152405 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term152406 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term152409 = (byte[]) newByteArray(16);
        Object term152410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term152411 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term152412 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term152415 = (byte[]) newByteArray(16);
        Object term152416 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term152417 = (char[]) newCharArray(0);
        Object term152418 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term152419 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term152406, term152406.getClass(), "toStringCache", "");
        setField(term152406, term152406.getClass(), "value", term152409);
        setByteField(term152406, term152406.getClass(), "coder", (byte) 0);
        setIntField(term152406, term152406.getClass(), "count", 0);
        setField(term152405, term152405.getClass(), "value", term152406);
        setIntField(term152405, term152405.getClass(), "count", 0);
        setElement(term152404, 0, term152405);
        setField(term152410, term152410.getClass(), "value", null);
        setIntField(term152410, term152410.getClass(), "count", 0);
        setElement(term152404, 1, term152410);
        setField(term152412, term152412.getClass(), "toStringCache", "");
        setField(term152412, term152412.getClass(), "value", term152415);
        setByteField(term152412, term152412.getClass(), "coder", (byte) 0);
        setIntField(term152412, term152412.getClass(), "count", 0);
        setField(term152411, term152411.getClass(), "value", term152412);
        setIntField(term152411, term152411.getClass(), "count", 0);
        setElement(term152404, 2, term152411);
        setField(term152416, term152416.getClass(), "value", term152417);
        setIntField(term152416, term152416.getClass(), "count", 0);
        setElement(term152404, 3, term152416);
        setField(term152419, term152419.getClass(), "value", null);
        setIntField(term152419, term152419.getClass(), "count", 0);
        setField(term152418, term152418.getClass(), "value", term152419);
        setIntField(term152418, term152418.getClass(), "count", 0);
        setElement(term152404, 4, term152418);
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
        args[0] = term149785;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term149785, term152404));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


