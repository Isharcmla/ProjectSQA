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

public class DurationFormatUtils_format_1779347976506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426513;
     Object term430135;

    public DurationFormatUtils_format_1779347976506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term426891 = new StringBuffer();
        StringBuffer term427177 = new StringBuffer();
        StringBuffer term427349 = new StringBuffer();
        StringBuffer term427521 = new StringBuffer();
        term426513 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term426833 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term427005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term426576 = (char[]) newCharArray(0);
        Object term427119 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term427291 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term427463 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term427635 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term427749 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term426833, term426833.getClass(), "value", term426891);
        setIntField(term426833, term426833.getClass(), "count", 0);
        setElement(term426513, 0, term426833);
        setField(term427005, term427005.getClass(), "value", term426576);
        setIntField(term427005, term427005.getClass(), "count", 0);
        setElement(term426513, 1, term427005);
        setField(term427119, term427119.getClass(), "value", term427177);
        setIntField(term427119, term427119.getClass(), "count", 0);
        setElement(term426513, 2, term427119);
        setField(term427291, term427291.getClass(), "value", term427349);
        setIntField(term427291, term427291.getClass(), "count", 0);
        setElement(term426513, 3, term427291);
        setField(term427463, term427463.getClass(), "value", term427521);
        setIntField(term427463, term427463.getClass(), "count", 0);
        setElement(term426513, 4, term427463);
        setField(term427635, term427635.getClass(), "value", null);
        setIntField(term427635, term427635.getClass(), "count", 0);
        setElement(term426513, 5, term427635);
        setField(term427749, term427749.getClass(), "value", "");
        setIntField(term427749, term427749.getClass(), "count", 0);
        setElement(term426513, 6, term427749);
        term430135 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term430136 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430137 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430140 = (byte[]) newByteArray(16);
        Object term430141 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term430142 = (char[]) newCharArray(0);
        Object term430143 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430144 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430147 = (byte[]) newByteArray(16);
        Object term430148 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430149 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430152 = (byte[]) newByteArray(16);
        Object term430153 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430154 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430157 = (byte[]) newByteArray(16);
        Object term430158 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430159 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term430137, term430137.getClass(), "toStringCache", "");
        setField(term430137, term430137.getClass(), "value", term430140);
        setByteField(term430137, term430137.getClass(), "coder", (byte) 0);
        setIntField(term430137, term430137.getClass(), "count", 0);
        setField(term430136, term430136.getClass(), "value", term430137);
        setIntField(term430136, term430136.getClass(), "count", 0);
        setElement(term430135, 0, term430136);
        setField(term430141, term430141.getClass(), "value", term430142);
        setIntField(term430141, term430141.getClass(), "count", 0);
        setElement(term430135, 1, term430141);
        setField(term430144, term430144.getClass(), "toStringCache", "");
        setField(term430144, term430144.getClass(), "value", term430147);
        setByteField(term430144, term430144.getClass(), "coder", (byte) 0);
        setIntField(term430144, term430144.getClass(), "count", 0);
        setField(term430143, term430143.getClass(), "value", term430144);
        setIntField(term430143, term430143.getClass(), "count", 0);
        setElement(term430135, 2, term430143);
        setField(term430149, term430149.getClass(), "toStringCache", "");
        setField(term430149, term430149.getClass(), "value", term430152);
        setByteField(term430149, term430149.getClass(), "coder", (byte) 0);
        setIntField(term430149, term430149.getClass(), "count", 0);
        setField(term430148, term430148.getClass(), "value", term430149);
        setIntField(term430148, term430148.getClass(), "count", 0);
        setElement(term430135, 3, term430148);
        setField(term430154, term430154.getClass(), "toStringCache", "");
        setField(term430154, term430154.getClass(), "value", term430157);
        setByteField(term430154, term430154.getClass(), "coder", (byte) 0);
        setIntField(term430154, term430154.getClass(), "count", 0);
        setField(term430153, term430153.getClass(), "value", term430154);
        setIntField(term430153, term430153.getClass(), "count", 0);
        setElement(term430135, 4, term430153);
        setField(term430158, term430158.getClass(), "value", null);
        setIntField(term430158, term430158.getClass(), "count", 0);
        setElement(term430135, 5, term430158);
        setField(term430159, term430159.getClass(), "value", "");
        setIntField(term430159, term430159.getClass(), "count", 0);
        setElement(term430135, 6, term430159);
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
        args[0] = term426513;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term426513, term430135));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


