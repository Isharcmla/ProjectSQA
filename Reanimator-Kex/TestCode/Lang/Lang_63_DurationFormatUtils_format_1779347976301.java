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

public class DurationFormatUtils_format_1779347976301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222888;
     Object term224266;

    public DurationFormatUtils_format_1779347976301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term223587 = new StringBuffer();
        StringBuffer term223759 = new StringBuffer();
        term222888 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term223187 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term222946 = (char[]) newCharArray(0);
        Object term223301 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term223415 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term223529 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term223701 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term223873 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term222960 = (char[]) newCharArray(0);
        Object term223987 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term222949 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term223187, term223187.getClass(), "value", term222946);
        setIntField(term223187, term223187.getClass(), "count", 0);
        setElement(term222888, 0, term223187);
        setField(term223301, term223301.getClass(), "value", term223415);
        setIntField(term223301, term223301.getClass(), "count", 0);
        setElement(term222888, 1, term223301);
        setField(term223529, term223529.getClass(), "value", term223587);
        setIntField(term223529, term223529.getClass(), "count", 0);
        setElement(term222888, 2, term223529);
        setField(term223701, term223701.getClass(), "value", term223759);
        setIntField(term223701, term223701.getClass(), "count", 0);
        setElement(term222888, 3, term223701);
        setField(term223873, term223873.getClass(), "value", term222960);
        setIntField(term223873, term223873.getClass(), "count", 0);
        setElement(term222888, 4, term223873);
        setField(term223987, term223987.getClass(), "value", term222949);
        setIntField(term223987, term223987.getClass(), "count", 0);
        setElement(term222888, 5, term223987);
        term224266 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term224267 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term224268 = (char[]) newCharArray(0);
        Object term224269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term224270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term224271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term224272 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term224275 = (byte[]) newByteArray(16);
        Object term224276 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term224277 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term224280 = (byte[]) newByteArray(16);
        Object term224281 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term224282 = (char[]) newCharArray(0);
        Object term224283 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term224284 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term224267, term224267.getClass(), "value", term224268);
        setIntField(term224267, term224267.getClass(), "count", 0);
        setElement(term224266, 0, term224267);
        setField(term224270, term224270.getClass(), "value", null);
        setIntField(term224270, term224270.getClass(), "count", 0);
        setField(term224269, term224269.getClass(), "value", term224270);
        setIntField(term224269, term224269.getClass(), "count", 0);
        setElement(term224266, 1, term224269);
        setField(term224272, term224272.getClass(), "toStringCache", "");
        setField(term224272, term224272.getClass(), "value", term224275);
        setByteField(term224272, term224272.getClass(), "coder", (byte) 0);
        setIntField(term224272, term224272.getClass(), "count", 0);
        setField(term224271, term224271.getClass(), "value", term224272);
        setIntField(term224271, term224271.getClass(), "count", 0);
        setElement(term224266, 2, term224271);
        setField(term224277, term224277.getClass(), "toStringCache", "");
        setField(term224277, term224277.getClass(), "value", term224280);
        setByteField(term224277, term224277.getClass(), "coder", (byte) 0);
        setIntField(term224277, term224277.getClass(), "count", 0);
        setField(term224276, term224276.getClass(), "value", term224277);
        setIntField(term224276, term224276.getClass(), "count", 0);
        setElement(term224266, 3, term224276);
        setField(term224281, term224281.getClass(), "value", term224282);
        setIntField(term224281, term224281.getClass(), "count", 0);
        setElement(term224266, 4, term224281);
        setField(term224283, term224283.getClass(), "value", term224284);
        setIntField(term224283, term224283.getClass(), "count", 0);
        setElement(term224266, 5, term224283);
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
        args[0] = term222888;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term222888, term224266));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


