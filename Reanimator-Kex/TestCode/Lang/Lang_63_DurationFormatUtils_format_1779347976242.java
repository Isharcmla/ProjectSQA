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

public class DurationFormatUtils_format_1779347976242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164045;
     Object term166488;

    public DurationFormatUtils_format_1779347976242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term164758 = new StringBuffer();
        StringBuffer term164930 = new StringBuffer();
        term164045 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term164370 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term164165 = (char[]) newCharArray(0);
        Object term164484 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term164586 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term164700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term164872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term164370, term164370.getClass(), "value", term164165);
        setIntField(term164370, term164370.getClass(), "count", 0);
        setElement(term164045, 0, term164370);
        setField(term164484, term164484.getClass(), "value", term164586);
        setIntField(term164484, term164484.getClass(), "count", 0);
        setElement(term164045, 1, term164484);
        setField(term164700, term164700.getClass(), "value", term164758);
        setIntField(term164700, term164700.getClass(), "count", 0);
        setElement(term164045, 2, term164700);
        setField(term164872, term164872.getClass(), "value", term164930);
        setIntField(term164872, term164872.getClass(), "count", 0);
        setElement(term164045, 3, term164872);
        term166488 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term166489 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term166490 = (char[]) newCharArray(0);
        Object term166491 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166492 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term166493 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166494 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term166497 = (byte[]) newByteArray(16);
        Object term166498 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166499 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term166502 = (byte[]) newByteArray(16);
        setField(term166489, term166489.getClass(), "value", term166490);
        setIntField(term166489, term166489.getClass(), "count", 0);
        setElement(term166488, 0, term166489);
        setField(term166491, term166491.getClass(), "value", term166492);
        setIntField(term166491, term166491.getClass(), "count", 0);
        setElement(term166488, 1, term166491);
        setField(term166494, term166494.getClass(), "toStringCache", "");
        setField(term166494, term166494.getClass(), "value", term166497);
        setByteField(term166494, term166494.getClass(), "coder", (byte) 0);
        setIntField(term166494, term166494.getClass(), "count", 0);
        setField(term166493, term166493.getClass(), "value", term166494);
        setIntField(term166493, term166493.getClass(), "count", 0);
        setElement(term166488, 2, term166493);
        setField(term166499, term166499.getClass(), "toStringCache", "");
        setField(term166499, term166499.getClass(), "value", term166502);
        setByteField(term166499, term166499.getClass(), "coder", (byte) 0);
        setIntField(term166499, term166499.getClass(), "count", 0);
        setField(term166498, term166498.getClass(), "value", term166499);
        setIntField(term166498, term166498.getClass(), "count", 0);
        setElement(term166488, 3, term166498);
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
        args[0] = term164045;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term164045, term166488));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


