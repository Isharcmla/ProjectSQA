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

public class DurationFormatUtils_format_1779347976448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378059;
     Object term380737;

    public DurationFormatUtils_format_1779347976448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term378530 = new StringBuffer();
        term378059 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term378472 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378644 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378758 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378986 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term379100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term378076 = (char[]) newCharArray(73);
        Object term379214 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term378472, term378472.getClass(), "value", term378530);
        setIntField(term378472, term378472.getClass(), "count", 0);
        setElement(term378059, 0, term378472);
        setField(term378644, term378644.getClass(), "value", null);
        setIntField(term378644, term378644.getClass(), "count", 0);
        setElement(term378059, 1, term378644);
        setField(term378758, term378758.getClass(), "value", null);
        setIntField(term378758, term378758.getClass(), "count", 0);
        setElement(term378059, 2, term378758);
        setField(term378872, term378872.getClass(), "value", null);
        setIntField(term378872, term378872.getClass(), "count", 0);
        setElement(term378059, 3, term378872);
        setField(term378986, term378986.getClass(), "value", null);
        setIntField(term378986, term378986.getClass(), "count", 0);
        setElement(term378059, 4, term378986);
        setField(term379100, term379100.getClass(), "value", term378076);
        setIntField(term379100, term379100.getClass(), "count", 0);
        setElement(term378059, 5, term379100);
        setElement(term378059, 6, term379214);
        term380737 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term380738 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380739 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term380742 = (byte[]) newByteArray(16);
        Object term380743 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380744 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380745 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380747 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term380748 = (char[]) newCharArray(73);
        Object term380749 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term380739, term380739.getClass(), "toStringCache", "");
        setField(term380739, term380739.getClass(), "value", term380742);
        setByteField(term380739, term380739.getClass(), "coder", (byte) 0);
        setIntField(term380739, term380739.getClass(), "count", 0);
        setField(term380738, term380738.getClass(), "value", term380739);
        setIntField(term380738, term380738.getClass(), "count", 0);
        setElement(term380737, 0, term380738);
        setField(term380743, term380743.getClass(), "value", null);
        setIntField(term380743, term380743.getClass(), "count", 0);
        setElement(term380737, 1, term380743);
        setField(term380744, term380744.getClass(), "value", null);
        setIntField(term380744, term380744.getClass(), "count", 0);
        setElement(term380737, 2, term380744);
        setField(term380745, term380745.getClass(), "value", null);
        setIntField(term380745, term380745.getClass(), "count", 0);
        setElement(term380737, 3, term380745);
        setField(term380746, term380746.getClass(), "value", null);
        setIntField(term380746, term380746.getClass(), "count", 0);
        setElement(term380737, 4, term380746);
        setField(term380747, term380747.getClass(), "value", term380748);
        setIntField(term380747, term380747.getClass(), "count", 0);
        setElement(term380737, 5, term380747);
        setField(term380749, term380749.getClass(), "value", null);
        setIntField(term380749, term380749.getClass(), "count", 0);
        setElement(term380737, 6, term380749);
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
        args[0] = term378059;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term378059, term380737));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


