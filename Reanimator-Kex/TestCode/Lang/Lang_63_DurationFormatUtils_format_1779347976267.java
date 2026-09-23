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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193463;
     Object term195797;

    public DurationFormatUtils_format_1779347976267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term194300 = new StringBuilder();
        StringBuffer term194586 = new StringBuffer();
        StringBuffer term194758 = new StringBuffer();
        StringBuffer term195082 = new StringBuffer();
        term193463 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term194240 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term194414 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term194005 = (char[]) newCharArray(0);
        Object term194528 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term194700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term194872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term194910 = newInstance(Class.forName("java.lang.Object"));
        Object term195024 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term194240, term194240.getClass(), "value", term194300);
        setIntField(term194240, term194240.getClass(), "count", 0);
        setElement(term193463, 0, term194240);
        setField(term194414, term194414.getClass(), "value", term194005);
        setIntField(term194414, term194414.getClass(), "count", 0);
        setElement(term193463, 1, term194414);
        setField(term194528, term194528.getClass(), "value", term194586);
        setIntField(term194528, term194528.getClass(), "count", 0);
        setElement(term193463, 2, term194528);
        setField(term194700, term194700.getClass(), "value", term194758);
        setIntField(term194700, term194700.getClass(), "count", 0);
        setElement(term193463, 3, term194700);
        setField(term194872, term194872.getClass(), "value", term194910);
        setIntField(term194872, term194872.getClass(), "count", 0);
        setElement(term193463, 4, term194872);
        setField(term195024, term195024.getClass(), "value", term195082);
        setIntField(term195024, term195024.getClass(), "count", 0);
        setElement(term193463, 5, term195024);
        term195797 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term195798 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term195799 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term195800 = (byte[]) newByteArray(16);
        Object term195801 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term195802 = (char[]) newCharArray(0);
        Object term195803 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term195804 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term195807 = (byte[]) newByteArray(16);
        Object term195808 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term195809 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term195812 = (byte[]) newByteArray(16);
        Object term195813 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term195814 = newInstance(Class.forName("java.lang.Object"));
        Object term195815 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term195816 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term195819 = (byte[]) newByteArray(16);
        setField(term195799, term195799.getClass(), "value", term195800);
        setByteField(term195799, term195799.getClass(), "coder", (byte) 0);
        setIntField(term195799, term195799.getClass(), "count", 0);
        setField(term195798, term195798.getClass(), "value", term195799);
        setIntField(term195798, term195798.getClass(), "count", 0);
        setElement(term195797, 0, term195798);
        setField(term195801, term195801.getClass(), "value", term195802);
        setIntField(term195801, term195801.getClass(), "count", 0);
        setElement(term195797, 1, term195801);
        setField(term195804, term195804.getClass(), "toStringCache", "");
        setField(term195804, term195804.getClass(), "value", term195807);
        setByteField(term195804, term195804.getClass(), "coder", (byte) 0);
        setIntField(term195804, term195804.getClass(), "count", 0);
        setField(term195803, term195803.getClass(), "value", term195804);
        setIntField(term195803, term195803.getClass(), "count", 0);
        setElement(term195797, 2, term195803);
        setField(term195809, term195809.getClass(), "toStringCache", "");
        setField(term195809, term195809.getClass(), "value", term195812);
        setByteField(term195809, term195809.getClass(), "coder", (byte) 0);
        setIntField(term195809, term195809.getClass(), "count", 0);
        setField(term195808, term195808.getClass(), "value", term195809);
        setIntField(term195808, term195808.getClass(), "count", 0);
        setElement(term195797, 3, term195808);
        setField(term195813, term195813.getClass(), "value", term195814);
        setIntField(term195813, term195813.getClass(), "count", 0);
        setElement(term195797, 4, term195813);
        setField(term195816, term195816.getClass(), "toStringCache", "");
        setField(term195816, term195816.getClass(), "value", term195819);
        setByteField(term195816, term195816.getClass(), "coder", (byte) 0);
        setIntField(term195816, term195816.getClass(), "count", 0);
        setField(term195815, term195815.getClass(), "value", term195816);
        setIntField(term195815, term195815.getClass(), "count", 0);
        setElement(term195797, 5, term195815);
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
        args[0] = term193463;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term193463, term195797));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


