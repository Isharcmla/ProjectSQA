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

public class DurationFormatUtils_format_1779347976287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209857;
     Object term211500;

    public DurationFormatUtils_format_1779347976287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term210437 = new StringBuffer();
        StringBuffer term210609 = new StringBuffer();
        StringBuffer term210781 = new StringBuffer();
        StringBuffer term210953 = new StringBuffer();
        StringBuffer term211125 = new StringBuffer();
        term209857 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term210227 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term210265 = newInstance(Class.forName("java.lang.Object"));
        Object term210379 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term210551 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term210723 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term210895 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211067 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term210227, term210227.getClass(), "value", term210265);
        setIntField(term210227, term210227.getClass(), "count", 0);
        setElement(term209857, 0, term210227);
        setField(term210379, term210379.getClass(), "value", term210437);
        setIntField(term210379, term210379.getClass(), "count", 0);
        setElement(term209857, 1, term210379);
        setField(term210551, term210551.getClass(), "value", term210609);
        setIntField(term210551, term210551.getClass(), "count", 0);
        setElement(term209857, 2, term210551);
        setField(term210723, term210723.getClass(), "value", term210781);
        setIntField(term210723, term210723.getClass(), "count", 0);
        setElement(term209857, 3, term210723);
        setField(term210895, term210895.getClass(), "value", term210953);
        setIntField(term210895, term210895.getClass(), "count", 0);
        setElement(term209857, 4, term210895);
        setField(term211067, term211067.getClass(), "value", term211125);
        setIntField(term211067, term211067.getClass(), "count", 0);
        setElement(term209857, 5, term211067);
        term211500 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term211501 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211502 = newInstance(Class.forName("java.lang.Object"));
        Object term211503 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211504 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term211507 = (byte[]) newByteArray(16);
        Object term211508 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211509 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term211512 = (byte[]) newByteArray(16);
        Object term211513 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211514 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term211517 = (byte[]) newByteArray(16);
        Object term211518 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211519 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term211522 = (byte[]) newByteArray(16);
        Object term211523 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term211524 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term211527 = (byte[]) newByteArray(16);
        setField(term211501, term211501.getClass(), "value", term211502);
        setIntField(term211501, term211501.getClass(), "count", 0);
        setElement(term211500, 0, term211501);
        setField(term211504, term211504.getClass(), "toStringCache", "");
        setField(term211504, term211504.getClass(), "value", term211507);
        setByteField(term211504, term211504.getClass(), "coder", (byte) 0);
        setIntField(term211504, term211504.getClass(), "count", 0);
        setField(term211503, term211503.getClass(), "value", term211504);
        setIntField(term211503, term211503.getClass(), "count", 0);
        setElement(term211500, 1, term211503);
        setField(term211509, term211509.getClass(), "toStringCache", "");
        setField(term211509, term211509.getClass(), "value", term211512);
        setByteField(term211509, term211509.getClass(), "coder", (byte) 0);
        setIntField(term211509, term211509.getClass(), "count", 0);
        setField(term211508, term211508.getClass(), "value", term211509);
        setIntField(term211508, term211508.getClass(), "count", 0);
        setElement(term211500, 2, term211508);
        setField(term211514, term211514.getClass(), "toStringCache", "");
        setField(term211514, term211514.getClass(), "value", term211517);
        setByteField(term211514, term211514.getClass(), "coder", (byte) 0);
        setIntField(term211514, term211514.getClass(), "count", 0);
        setField(term211513, term211513.getClass(), "value", term211514);
        setIntField(term211513, term211513.getClass(), "count", 0);
        setElement(term211500, 3, term211513);
        setField(term211519, term211519.getClass(), "toStringCache", "");
        setField(term211519, term211519.getClass(), "value", term211522);
        setByteField(term211519, term211519.getClass(), "coder", (byte) 0);
        setIntField(term211519, term211519.getClass(), "count", 0);
        setField(term211518, term211518.getClass(), "value", term211519);
        setIntField(term211518, term211518.getClass(), "count", 0);
        setElement(term211500, 4, term211518);
        setField(term211524, term211524.getClass(), "toStringCache", "");
        setField(term211524, term211524.getClass(), "value", term211527);
        setByteField(term211524, term211524.getClass(), "coder", (byte) 0);
        setIntField(term211524, term211524.getClass(), "count", 0);
        setField(term211523, term211523.getClass(), "value", term211524);
        setIntField(term211523, term211523.getClass(), "count", 0);
        setElement(term211500, 5, term211523);
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
        args[0] = term209857;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term209857, term211500));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


