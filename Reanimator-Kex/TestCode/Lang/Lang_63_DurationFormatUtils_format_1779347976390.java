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

public class DurationFormatUtils_format_1779347976390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318365;
     Object term322250;

    public DurationFormatUtils_format_1779347976390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term318851 = new StringBuffer();
        StringBuffer term319175 = new StringBuffer();
        StringBuffer term319347 = new StringBuffer();
        term318365 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term318793 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term318965 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term319003 = newInstance(Class.forName("java.lang.Object"));
        Object term319117 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term319289 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term319461 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term319575 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term319689 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term318530 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term319803 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term318793, term318793.getClass(), "value", term318851);
        setIntField(term318793, term318793.getClass(), "count", 0);
        setElement(term318365, 0, term318793);
        setField(term318965, term318965.getClass(), "value", term319003);
        setIntField(term318965, term318965.getClass(), "count", 0);
        setElement(term318365, 1, term318965);
        setField(term319117, term319117.getClass(), "value", term319175);
        setIntField(term319117, term319117.getClass(), "count", 0);
        setElement(term318365, 2, term319117);
        setField(term319289, term319289.getClass(), "value", term319347);
        setIntField(term319289, term319289.getClass(), "count", 0);
        setElement(term318365, 3, term319289);
        setField(term319461, term319461.getClass(), "value", null);
        setIntField(term319461, term319461.getClass(), "count", 0);
        setElement(term318365, 4, term319461);
        setField(term319575, term319575.getClass(), "value", null);
        setIntField(term319575, term319575.getClass(), "count", 0);
        setElement(term318365, 5, term319575);
        setField(term319689, term319689.getClass(), "value", term318530);
        setIntField(term319689, term319689.getClass(), "count", 0);
        setElement(term318365, 6, term319689);
        setField(term319803, term319803.getClass(), "value", null);
        setIntField(term319803, term319803.getClass(), "count", 0);
        setElement(term318365, 7, term319803);
        setElement(term318365, 8, term318793);
        term322250 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term322251 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322252 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term322255 = (byte[]) newByteArray(16);
        Object term322256 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322257 = newInstance(Class.forName("java.lang.Object"));
        Object term322258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322259 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term322262 = (byte[]) newByteArray(16);
        Object term322263 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322264 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term322267 = (byte[]) newByteArray(16);
        Object term322268 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term322271 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term322272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term322252, term322252.getClass(), "toStringCache", "");
        setField(term322252, term322252.getClass(), "value", term322255);
        setByteField(term322252, term322252.getClass(), "coder", (byte) 0);
        setIntField(term322252, term322252.getClass(), "count", 0);
        setField(term322251, term322251.getClass(), "value", term322252);
        setIntField(term322251, term322251.getClass(), "count", 0);
        setElement(term322250, 0, term322251);
        setField(term322256, term322256.getClass(), "value", term322257);
        setIntField(term322256, term322256.getClass(), "count", 0);
        setElement(term322250, 1, term322256);
        setField(term322259, term322259.getClass(), "toStringCache", "");
        setField(term322259, term322259.getClass(), "value", term322262);
        setByteField(term322259, term322259.getClass(), "coder", (byte) 0);
        setIntField(term322259, term322259.getClass(), "count", 0);
        setField(term322258, term322258.getClass(), "value", term322259);
        setIntField(term322258, term322258.getClass(), "count", 0);
        setElement(term322250, 2, term322258);
        setField(term322264, term322264.getClass(), "toStringCache", "");
        setField(term322264, term322264.getClass(), "value", term322267);
        setByteField(term322264, term322264.getClass(), "coder", (byte) 0);
        setIntField(term322264, term322264.getClass(), "count", 0);
        setField(term322263, term322263.getClass(), "value", term322264);
        setIntField(term322263, term322263.getClass(), "count", 0);
        setElement(term322250, 3, term322263);
        setField(term322268, term322268.getClass(), "value", null);
        setIntField(term322268, term322268.getClass(), "count", 0);
        setElement(term322250, 4, term322268);
        setField(term322269, term322269.getClass(), "value", null);
        setIntField(term322269, term322269.getClass(), "count", 0);
        setElement(term322250, 5, term322269);
        setField(term322270, term322270.getClass(), "value", term322271);
        setIntField(term322270, term322270.getClass(), "count", 0);
        setElement(term322250, 6, term322270);
        setField(term322272, term322272.getClass(), "value", null);
        setIntField(term322272, term322272.getClass(), "count", 0);
        setElement(term322250, 7, term322272);
        setElement(term322250, 8, term322251);
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
        args[0] = term318365;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term318365, term322250));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


