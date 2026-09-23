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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231444;
     Object term233098;

    public DurationFormatUtils_format_1779347976311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term231804 = new StringBuffer();
        StringBuffer term231976 = new StringBuffer();
        StringBuffer term232148 = new StringBuffer();
        StringBuffer term232320 = new StringBuffer();
        StringBuffer term232492 = new StringBuffer();
        StringBuilder term232666 = new StringBuilder();
        term231444 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term231746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231918 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term232090 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term232262 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term232434 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term232606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term231746, term231746.getClass(), "value", term231804);
        setIntField(term231746, term231746.getClass(), "count", 0);
        setElement(term231444, 0, term231746);
        setField(term231918, term231918.getClass(), "value", term231976);
        setIntField(term231918, term231918.getClass(), "count", 0);
        setElement(term231444, 1, term231918);
        setField(term232090, term232090.getClass(), "value", term232148);
        setIntField(term232090, term232090.getClass(), "count", 0);
        setElement(term231444, 2, term232090);
        setField(term232262, term232262.getClass(), "value", term232320);
        setIntField(term232262, term232262.getClass(), "count", 0);
        setElement(term231444, 3, term232262);
        setField(term232434, term232434.getClass(), "value", term232492);
        setIntField(term232434, term232434.getClass(), "count", 0);
        setElement(term231444, 4, term232434);
        setField(term232606, term232606.getClass(), "value", term232666);
        setIntField(term232606, term232606.getClass(), "count", 0);
        setElement(term231444, 5, term232606);
        term233098 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term233099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233100 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term233103 = (byte[]) newByteArray(16);
        Object term233104 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233105 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term233108 = (byte[]) newByteArray(16);
        Object term233109 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233110 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term233113 = (byte[]) newByteArray(16);
        Object term233114 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233115 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term233118 = (byte[]) newByteArray(16);
        Object term233119 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233120 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term233123 = (byte[]) newByteArray(16);
        Object term233124 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233125 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term233126 = (byte[]) newByteArray(16);
        setField(term233100, term233100.getClass(), "toStringCache", "");
        setField(term233100, term233100.getClass(), "value", term233103);
        setByteField(term233100, term233100.getClass(), "coder", (byte) 0);
        setIntField(term233100, term233100.getClass(), "count", 0);
        setField(term233099, term233099.getClass(), "value", term233100);
        setIntField(term233099, term233099.getClass(), "count", 0);
        setElement(term233098, 0, term233099);
        setField(term233105, term233105.getClass(), "toStringCache", "");
        setField(term233105, term233105.getClass(), "value", term233108);
        setByteField(term233105, term233105.getClass(), "coder", (byte) 0);
        setIntField(term233105, term233105.getClass(), "count", 0);
        setField(term233104, term233104.getClass(), "value", term233105);
        setIntField(term233104, term233104.getClass(), "count", 0);
        setElement(term233098, 1, term233104);
        setField(term233110, term233110.getClass(), "toStringCache", "");
        setField(term233110, term233110.getClass(), "value", term233113);
        setByteField(term233110, term233110.getClass(), "coder", (byte) 0);
        setIntField(term233110, term233110.getClass(), "count", 0);
        setField(term233109, term233109.getClass(), "value", term233110);
        setIntField(term233109, term233109.getClass(), "count", 0);
        setElement(term233098, 2, term233109);
        setField(term233115, term233115.getClass(), "toStringCache", "");
        setField(term233115, term233115.getClass(), "value", term233118);
        setByteField(term233115, term233115.getClass(), "coder", (byte) 0);
        setIntField(term233115, term233115.getClass(), "count", 0);
        setField(term233114, term233114.getClass(), "value", term233115);
        setIntField(term233114, term233114.getClass(), "count", 0);
        setElement(term233098, 3, term233114);
        setField(term233120, term233120.getClass(), "toStringCache", "");
        setField(term233120, term233120.getClass(), "value", term233123);
        setByteField(term233120, term233120.getClass(), "coder", (byte) 0);
        setIntField(term233120, term233120.getClass(), "count", 0);
        setField(term233119, term233119.getClass(), "value", term233120);
        setIntField(term233119, term233119.getClass(), "count", 0);
        setElement(term233098, 4, term233119);
        setField(term233125, term233125.getClass(), "value", term233126);
        setByteField(term233125, term233125.getClass(), "coder", (byte) 0);
        setIntField(term233125, term233125.getClass(), "count", 0);
        setField(term233124, term233124.getClass(), "value", term233125);
        setIntField(term233124, term233124.getClass(), "count", 0);
        setElement(term233098, 5, term233124);
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
        args[0] = term231444;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term231444, term233098));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


