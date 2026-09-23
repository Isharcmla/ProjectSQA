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

public class DurationFormatUtils_format_1779347976512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431579;
     Object term435141;

    public DurationFormatUtils_format_1779347976512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term431983 = new StringBuffer();
        StringBuilder term432157 = new StringBuilder();
        StringBuffer term432329 = new StringBuffer();
        StringBuffer term432615 = new StringBuffer();
        term431579 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term431925 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432097 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432443 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432557 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432729 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432843 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term432957 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term431668 = (char[]) newCharArray(0);
        setField(term431925, term431925.getClass(), "value", term431983);
        setIntField(term431925, term431925.getClass(), "count", 0);
        setElement(term431579, 0, term431925);
        setField(term432097, term432097.getClass(), "value", term432157);
        setIntField(term432097, term432097.getClass(), "count", 0);
        setElement(term431579, 1, term432097);
        setField(term432271, term432271.getClass(), "value", term432329);
        setIntField(term432271, term432271.getClass(), "count", 0);
        setElement(term431579, 2, term432271);
        setField(term432443, term432443.getClass(), "value", term431983);
        setIntField(term432443, term432443.getClass(), "count", 0);
        setElement(term431579, 3, term432443);
        setField(term432557, term432557.getClass(), "value", term432615);
        setIntField(term432557, term432557.getClass(), "count", 0);
        setElement(term431579, 4, term432557);
        setField(term432729, term432729.getClass(), "value", null);
        setIntField(term432729, term432729.getClass(), "count", 0);
        setElement(term431579, 5, term432729);
        setField(term432843, term432843.getClass(), "value", null);
        setIntField(term432843, term432843.getClass(), "count", 0);
        setElement(term431579, 6, term432843);
        setField(term432957, term432957.getClass(), "value", term431668);
        setIntField(term432957, term432957.getClass(), "count", 0);
        setElement(term431579, 7, term432957);
        term435141 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term435142 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435143 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435146 = (byte[]) newByteArray(16);
        Object term435147 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435148 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term435149 = (byte[]) newByteArray(16);
        Object term435150 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435151 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435154 = (byte[]) newByteArray(16);
        Object term435155 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435156 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435157 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435160 = (byte[]) newByteArray(16);
        Object term435161 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435162 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435163 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term435164 = (char[]) newCharArray(0);
        setField(term435143, term435143.getClass(), "toStringCache", "");
        setField(term435143, term435143.getClass(), "value", term435146);
        setByteField(term435143, term435143.getClass(), "coder", (byte) 0);
        setIntField(term435143, term435143.getClass(), "count", 0);
        setField(term435142, term435142.getClass(), "value", term435143);
        setIntField(term435142, term435142.getClass(), "count", 0);
        setElement(term435141, 0, term435142);
        setField(term435148, term435148.getClass(), "value", term435149);
        setByteField(term435148, term435148.getClass(), "coder", (byte) 0);
        setIntField(term435148, term435148.getClass(), "count", 0);
        setField(term435147, term435147.getClass(), "value", term435148);
        setIntField(term435147, term435147.getClass(), "count", 0);
        setElement(term435141, 1, term435147);
        setField(term435151, term435151.getClass(), "toStringCache", "");
        setField(term435151, term435151.getClass(), "value", term435154);
        setByteField(term435151, term435151.getClass(), "coder", (byte) 0);
        setIntField(term435151, term435151.getClass(), "count", 0);
        setField(term435150, term435150.getClass(), "value", term435151);
        setIntField(term435150, term435150.getClass(), "count", 0);
        setElement(term435141, 2, term435150);
        setField(term435155, term435155.getClass(), "value", term435143);
        setIntField(term435155, term435155.getClass(), "count", 0);
        setElement(term435141, 3, term435155);
        setField(term435157, term435157.getClass(), "toStringCache", "");
        setField(term435157, term435157.getClass(), "value", term435160);
        setByteField(term435157, term435157.getClass(), "coder", (byte) 0);
        setIntField(term435157, term435157.getClass(), "count", 0);
        setField(term435156, term435156.getClass(), "value", term435157);
        setIntField(term435156, term435156.getClass(), "count", 0);
        setElement(term435141, 4, term435156);
        setField(term435161, term435161.getClass(), "value", null);
        setIntField(term435161, term435161.getClass(), "count", 0);
        setElement(term435141, 5, term435161);
        setField(term435162, term435162.getClass(), "value", null);
        setIntField(term435162, term435162.getClass(), "count", 0);
        setElement(term435141, 6, term435162);
        setField(term435163, term435163.getClass(), "value", term435164);
        setIntField(term435163, term435163.getClass(), "count", 0);
        setElement(term435141, 7, term435163);
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
        args[0] = term431579;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term431579, term435141));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


