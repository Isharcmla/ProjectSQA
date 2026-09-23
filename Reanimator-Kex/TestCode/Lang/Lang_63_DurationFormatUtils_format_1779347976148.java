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

public class DurationFormatUtils_format_1779347976148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105361;
     Object term107240;

    public DurationFormatUtils_format_1779347976148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term105827 = new StringBuffer();
        StringBuffer term105999 = new StringBuffer();
        term105361 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term105769 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term105941 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term105769, term105769.getClass(), "value", term105827);
        setIntField(term105769, term105769.getClass(), "count", 0);
        setElement(term105361, 0, term105769);
        setField(term105941, term105941.getClass(), "value", term105999);
        setIntField(term105941, term105941.getClass(), "count", 0);
        setElement(term105361, 1, term105941);
        term107240 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term107241 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107242 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term107245 = (byte[]) newByteArray(16);
        Object term107246 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107247 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term107250 = (byte[]) newByteArray(16);
        setField(term107242, term107242.getClass(), "toStringCache", "");
        setField(term107242, term107242.getClass(), "value", term107245);
        setByteField(term107242, term107242.getClass(), "coder", (byte) 0);
        setIntField(term107242, term107242.getClass(), "count", 0);
        setField(term107241, term107241.getClass(), "value", term107242);
        setIntField(term107241, term107241.getClass(), "count", 0);
        setElement(term107240, 0, term107241);
        setField(term107247, term107247.getClass(), "toStringCache", "");
        setField(term107247, term107247.getClass(), "value", term107250);
        setByteField(term107247, term107247.getClass(), "coder", (byte) 0);
        setIntField(term107247, term107247.getClass(), "count", 0);
        setField(term107246, term107246.getClass(), "value", term107247);
        setIntField(term107246, term107246.getClass(), "count", 0);
        setElement(term107240, 1, term107246);
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
        args[0] = term105361;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term105361, term107240));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


