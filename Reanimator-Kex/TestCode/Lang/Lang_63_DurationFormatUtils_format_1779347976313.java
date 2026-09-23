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

public class DurationFormatUtils_format_1779347976313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233230;
     Object term234257;

    public DurationFormatUtils_format_1779347976313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term233565 = new StringBuffer();
        StringBuffer term233851 = new StringBuffer();
        StringBuffer term234023 = new StringBuffer();
        term233230 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term233507 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233679 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233793 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term233965 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term233507, term233507.getClass(), "value", term233565);
        setIntField(term233507, term233507.getClass(), "count", 0);
        setElement(term233230, 0, term233507);
        setField(term233679, term233679.getClass(), "value", null);
        setIntField(term233679, term233679.getClass(), "count", 0);
        setElement(term233230, 1, term233679);
        setField(term233793, term233793.getClass(), "value", term233851);
        setIntField(term233793, term233793.getClass(), "count", 0);
        setElement(term233230, 2, term233793);
        setField(term233965, term233965.getClass(), "value", term234023);
        setIntField(term233965, term233965.getClass(), "count", 0);
        setElement(term233230, 3, term233965);
        term234257 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term234258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term234259 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term234262 = (byte[]) newByteArray(16);
        Object term234263 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term234264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term234265 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term234268 = (byte[]) newByteArray(16);
        Object term234269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term234270 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term234273 = (byte[]) newByteArray(16);
        setField(term234259, term234259.getClass(), "toStringCache", "");
        setField(term234259, term234259.getClass(), "value", term234262);
        setByteField(term234259, term234259.getClass(), "coder", (byte) 0);
        setIntField(term234259, term234259.getClass(), "count", 0);
        setField(term234258, term234258.getClass(), "value", term234259);
        setIntField(term234258, term234258.getClass(), "count", 0);
        setElement(term234257, 0, term234258);
        setField(term234263, term234263.getClass(), "value", null);
        setIntField(term234263, term234263.getClass(), "count", 0);
        setElement(term234257, 1, term234263);
        setField(term234265, term234265.getClass(), "toStringCache", "");
        setField(term234265, term234265.getClass(), "value", term234268);
        setByteField(term234265, term234265.getClass(), "coder", (byte) 0);
        setIntField(term234265, term234265.getClass(), "count", 0);
        setField(term234264, term234264.getClass(), "value", term234265);
        setIntField(term234264, term234264.getClass(), "count", 0);
        setElement(term234257, 2, term234264);
        setField(term234270, term234270.getClass(), "toStringCache", "");
        setField(term234270, term234270.getClass(), "value", term234273);
        setByteField(term234270, term234270.getClass(), "coder", (byte) 0);
        setIntField(term234270, term234270.getClass(), "count", 0);
        setField(term234269, term234269.getClass(), "value", term234270);
        setIntField(term234269, term234269.getClass(), "count", 0);
        setElement(term234257, 3, term234269);
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
        args[0] = term233230;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term233230, term234257));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


