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

public class DurationFormatUtils_format_1779347976317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236170;
     Object term238150;

    public DurationFormatUtils_format_1779347976317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term236509 = new StringBuilder();
        StringBuilder term236683 = new StringBuilder();
        StringBuffer term236855 = new StringBuffer();
        StringBuffer term237141 = new StringBuffer();
        term236170 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term236449 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term236623 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term236797 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term236969 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237083 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237255 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term236449, term236449.getClass(), "value", term236509);
        setIntField(term236449, term236449.getClass(), "count", 0);
        setElement(term236170, 0, term236449);
        setField(term236623, term236623.getClass(), "value", term236683);
        setIntField(term236623, term236623.getClass(), "count", 0);
        setElement(term236170, 1, term236623);
        setField(term236797, term236797.getClass(), "value", term236855);
        setIntField(term236797, term236797.getClass(), "count", 0);
        setElement(term236170, 2, term236797);
        setField(term236969, term236969.getClass(), "value", null);
        setIntField(term236969, term236969.getClass(), "count", 0);
        setElement(term236170, 3, term236969);
        setField(term237083, term237083.getClass(), "value", term237141);
        setIntField(term237083, term237083.getClass(), "count", 0);
        setElement(term236170, 4, term237083);
        setElement(term236170, 5, term237255);
        term238150 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term238151 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238152 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term238153 = (byte[]) newByteArray(16);
        Object term238154 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238155 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term238156 = (byte[]) newByteArray(16);
        Object term238157 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238158 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term238161 = (byte[]) newByteArray(16);
        Object term238162 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238163 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238164 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term238167 = (byte[]) newByteArray(16);
        Object term238168 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term238152, term238152.getClass(), "value", term238153);
        setByteField(term238152, term238152.getClass(), "coder", (byte) 0);
        setIntField(term238152, term238152.getClass(), "count", 0);
        setField(term238151, term238151.getClass(), "value", term238152);
        setIntField(term238151, term238151.getClass(), "count", 0);
        setElement(term238150, 0, term238151);
        setField(term238155, term238155.getClass(), "value", term238156);
        setByteField(term238155, term238155.getClass(), "coder", (byte) 0);
        setIntField(term238155, term238155.getClass(), "count", 0);
        setField(term238154, term238154.getClass(), "value", term238155);
        setIntField(term238154, term238154.getClass(), "count", 0);
        setElement(term238150, 1, term238154);
        setField(term238158, term238158.getClass(), "toStringCache", "");
        setField(term238158, term238158.getClass(), "value", term238161);
        setByteField(term238158, term238158.getClass(), "coder", (byte) 0);
        setIntField(term238158, term238158.getClass(), "count", 0);
        setField(term238157, term238157.getClass(), "value", term238158);
        setIntField(term238157, term238157.getClass(), "count", 0);
        setElement(term238150, 2, term238157);
        setField(term238162, term238162.getClass(), "value", null);
        setIntField(term238162, term238162.getClass(), "count", 0);
        setElement(term238150, 3, term238162);
        setField(term238164, term238164.getClass(), "toStringCache", "");
        setField(term238164, term238164.getClass(), "value", term238167);
        setByteField(term238164, term238164.getClass(), "coder", (byte) 0);
        setIntField(term238164, term238164.getClass(), "count", 0);
        setField(term238163, term238163.getClass(), "value", term238164);
        setIntField(term238163, term238163.getClass(), "count", 0);
        setElement(term238150, 4, term238163);
        setField(term238168, term238168.getClass(), "value", null);
        setIntField(term238168, term238168.getClass(), "count", 0);
        setElement(term238150, 5, term238168);
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
        args[0] = term236170;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term236170, term238150));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


