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

public class DurationFormatUtils_format_1779347976382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311908;
     Object term315115;

    public DurationFormatUtils_format_1779347976382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term312708 = new StringBuffer();
        term311908 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term312536 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term312650 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term312822 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term312860 = newInstance(Class.forName("java.lang.Object"));
        Object term312974 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term313012 = newInstance(Class.forName("java.lang.Object"));
        Object term313126 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term313240 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term313354 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term313468 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term312650, term312650.getClass(), "value", term312708);
        setIntField(term312650, term312650.getClass(), "count", 0);
        setField(term312536, term312536.getClass(), "value", term312650);
        setIntField(term312536, term312536.getClass(), "count", 0);
        setElement(term311908, 0, term312536);
        setField(term312822, term312822.getClass(), "value", term312860);
        setIntField(term312822, term312822.getClass(), "count", 0);
        setElement(term311908, 1, term312822);
        setField(term312974, term312974.getClass(), "value", term313012);
        setIntField(term312974, term312974.getClass(), "count", 0);
        setElement(term311908, 2, term312974);
        setField(term313126, term313126.getClass(), "value", term312650);
        setIntField(term313126, term313126.getClass(), "count", 0);
        setElement(term311908, 3, term313126);
        setElement(term311908, 4, term312650);
        setElement(term311908, 5, term312822);
        setField(term313240, term313240.getClass(), "value", null);
        setIntField(term313240, term313240.getClass(), "count", 0);
        setElement(term311908, 6, term313240);
        setElement(term311908, 7, term313354);
        setElement(term311908, 8, term313468);
        term315115 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term315116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315117 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315118 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term315120 = (byte[]) newByteArray(16);
        Object term315121 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315122 = newInstance(Class.forName("java.lang.Object"));
        Object term315123 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315124 = newInstance(Class.forName("java.lang.Object"));
        Object term315125 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315126 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315127 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term315128 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term315118, term315118.getClass(), "toStringCache", "");
        setField(term315118, term315118.getClass(), "value", term315120);
        setByteField(term315118, term315118.getClass(), "coder", (byte) 0);
        setIntField(term315118, term315118.getClass(), "count", 0);
        setField(term315117, term315117.getClass(), "value", term315118);
        setIntField(term315117, term315117.getClass(), "count", 0);
        setField(term315116, term315116.getClass(), "value", term315117);
        setIntField(term315116, term315116.getClass(), "count", 0);
        setElement(term315115, 0, term315116);
        setField(term315121, term315121.getClass(), "value", term315122);
        setIntField(term315121, term315121.getClass(), "count", 0);
        setElement(term315115, 1, term315121);
        setField(term315123, term315123.getClass(), "value", term315124);
        setIntField(term315123, term315123.getClass(), "count", 0);
        setElement(term315115, 2, term315123);
        setField(term315125, term315125.getClass(), "value", term315117);
        setIntField(term315125, term315125.getClass(), "count", 0);
        setElement(term315115, 3, term315125);
        setElement(term315115, 4, term315117);
        setElement(term315115, 5, term315121);
        setField(term315126, term315126.getClass(), "value", null);
        setIntField(term315126, term315126.getClass(), "count", 0);
        setElement(term315115, 6, term315126);
        setField(term315127, term315127.getClass(), "value", null);
        setIntField(term315127, term315127.getClass(), "count", 0);
        setElement(term315115, 7, term315127);
        setField(term315128, term315128.getClass(), "value", null);
        setIntField(term315128, term315128.getClass(), "count", 0);
        setElement(term315115, 8, term315128);
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
        args[0] = term311908;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term311908, term315115));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


