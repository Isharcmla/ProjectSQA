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

public class DurationFormatUtils_format_1779347976137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98644;
     Object term99728;

    public DurationFormatUtils_format_1779347976137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term99102 = new StringBuffer();
        term98644 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term98930 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99044 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99216 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term98930, term98930.getClass(), "value", null);
        setIntField(term98930, term98930.getClass(), "count", 0);
        setElement(term98644, 0, term98930);
        setField(term99044, term99044.getClass(), "value", term99102);
        setIntField(term99044, term99044.getClass(), "count", 0);
        setElement(term98644, 1, term99044);
        setField(term99216, term99216.getClass(), "value", term98644);
        setIntField(term99216, term99216.getClass(), "count", 0);
        setElement(term98644, 2, term99216);
        term99728 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term99729 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99730 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99731 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term99734 = (byte[]) newByteArray(16);
        Object term99735 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term99736 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        setField(term99729, term99729.getClass(), "value", null);
        setIntField(term99729, term99729.getClass(), "count", 0);
        setElement(term99728, 0, term99729);
        setField(term99731, term99731.getClass(), "toStringCache", "");
        setField(term99731, term99731.getClass(), "value", term99734);
        setByteField(term99731, term99731.getClass(), "coder", (byte) 0);
        setIntField(term99731, term99731.getClass(), "count", 0);
        setField(term99730, term99730.getClass(), "value", term99731);
        setIntField(term99730, term99730.getClass(), "count", 0);
        setElement(term99728, 1, term99730);
        setElement(term99736, 0, term99729);
        setElement(term99736, 1, term99730);
        setElement(term99736, 2, term99735);
        setField(term99735, term99735.getClass(), "value", term99736);
        setIntField(term99735, term99735.getClass(), "count", 0);
        setElement(term99728, 2, term99735);
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
        args[0] = term98644;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term98644, term99728));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


