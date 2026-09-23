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

public class DurationFormatUtils_format_1779347976197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136483;
     Object term138013;

    public DurationFormatUtils_format_1779347976197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term137397 = new StringBuffer();
        term136483 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term137225 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term137012 = (char[]) newCharArray(0);
        Object term137339 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term137511 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term137625 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term137225, term137225.getClass(), "value", term137012);
        setIntField(term137225, term137225.getClass(), "count", 0);
        setElement(term136483, 0, term137225);
        setField(term137339, term137339.getClass(), "value", term137397);
        setIntField(term137339, term137339.getClass(), "count", 0);
        setElement(term136483, 1, term137339);
        setField(term137511, term137511.getClass(), "value", null);
        setIntField(term137511, term137511.getClass(), "count", 0);
        setElement(term136483, 2, term137511);
        setField(term137625, term137625.getClass(), "value", term137339);
        setIntField(term137625, term137625.getClass(), "count", 0);
        setElement(term136483, 3, term137625);
        term138013 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term138014 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term138015 = (char[]) newCharArray(0);
        Object term138016 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term138017 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term138020 = (byte[]) newByteArray(16);
        Object term138021 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term138022 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term138014, term138014.getClass(), "value", term138015);
        setIntField(term138014, term138014.getClass(), "count", 0);
        setElement(term138013, 0, term138014);
        setField(term138017, term138017.getClass(), "toStringCache", "");
        setField(term138017, term138017.getClass(), "value", term138020);
        setByteField(term138017, term138017.getClass(), "coder", (byte) 0);
        setIntField(term138017, term138017.getClass(), "count", 0);
        setField(term138016, term138016.getClass(), "value", term138017);
        setIntField(term138016, term138016.getClass(), "count", 0);
        setElement(term138013, 1, term138016);
        setField(term138021, term138021.getClass(), "value", null);
        setIntField(term138021, term138021.getClass(), "count", 0);
        setElement(term138013, 2, term138021);
        setField(term138022, term138022.getClass(), "value", term138016);
        setIntField(term138022, term138022.getClass(), "count", 0);
        setElement(term138013, 3, term138022);
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
        args[0] = term136483;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term136483, term138013));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


