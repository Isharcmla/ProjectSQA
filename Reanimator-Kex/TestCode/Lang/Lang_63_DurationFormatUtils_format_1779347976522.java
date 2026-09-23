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

public class DurationFormatUtils_format_1779347976522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444314;
     Object term446204;

    public DurationFormatUtils_format_1779347976522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term444733 = new StringBuffer();
        StringBuffer term444905 = new StringBuffer();
        term444314 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term444561 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term444347 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term444675 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444847 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term445019 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term444561, term444561.getClass(), "value", term444347);
        setIntField(term444561, term444561.getClass(), "count", 0);
        setElement(term444314, 0, term444561);
        setField(term444675, term444675.getClass(), "value", term444733);
        setIntField(term444675, term444675.getClass(), "count", 0);
        setElement(term444314, 1, term444675);
        setField(term444847, term444847.getClass(), "value", term444905);
        setIntField(term444847, term444847.getClass(), "count", 0);
        setElement(term444314, 2, term444847);
        setElement(term444314, 3, term444675);
        setField(term445019, term445019.getClass(), "value", null);
        setIntField(term445019, term445019.getClass(), "count", 0);
        setElement(term444314, 4, term445019);
        term446204 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term446205 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term446206 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term446207 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446208 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term446211 = (byte[]) newByteArray(16);
        Object term446212 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term446213 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term446216 = (byte[]) newByteArray(16);
        Object term446217 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term446205, term446205.getClass(), "value", term446206);
        setIntField(term446205, term446205.getClass(), "count", 0);
        setElement(term446204, 0, term446205);
        setField(term446208, term446208.getClass(), "toStringCache", "");
        setField(term446208, term446208.getClass(), "value", term446211);
        setByteField(term446208, term446208.getClass(), "coder", (byte) 0);
        setIntField(term446208, term446208.getClass(), "count", 0);
        setField(term446207, term446207.getClass(), "value", term446208);
        setIntField(term446207, term446207.getClass(), "count", 0);
        setElement(term446204, 1, term446207);
        setField(term446213, term446213.getClass(), "toStringCache", "");
        setField(term446213, term446213.getClass(), "value", term446216);
        setByteField(term446213, term446213.getClass(), "coder", (byte) 0);
        setIntField(term446213, term446213.getClass(), "count", 0);
        setField(term446212, term446212.getClass(), "value", term446213);
        setIntField(term446212, term446212.getClass(), "count", 0);
        setElement(term446204, 2, term446212);
        setElement(term446204, 3, term446207);
        setField(term446217, term446217.getClass(), "value", null);
        setIntField(term446217, term446217.getClass(), "count", 0);
        setElement(term446204, 4, term446217);
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
        args[0] = term444314;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term444314, term446204));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


