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

public class DurationFormatUtils_format_1779347976178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126547;
     Object term127982;

    public DurationFormatUtils_format_1779347976178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term126999 = new StringBuffer();
        term126547 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term126827 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126941 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127113 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term126827, term126827.getClass(), "value", null);
        setIntField(term126827, term126827.getClass(), "count", 0);
        setElement(term126547, 0, term126827);
        setField(term126941, term126941.getClass(), "value", term126999);
        setIntField(term126941, term126941.getClass(), "count", 0);
        setElement(term126547, 1, term126941);
        setField(term127113, term127113.getClass(), "value", "");
        setIntField(term127113, term127113.getClass(), "count", 0);
        setElement(term126547, 2, term127113);
        term127982 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term127983 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127984 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127985 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term127988 = (byte[]) newByteArray(16);
        Object term127989 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term127983, term127983.getClass(), "value", null);
        setIntField(term127983, term127983.getClass(), "count", 0);
        setElement(term127982, 0, term127983);
        setField(term127985, term127985.getClass(), "toStringCache", "");
        setField(term127985, term127985.getClass(), "value", term127988);
        setByteField(term127985, term127985.getClass(), "coder", (byte) 0);
        setIntField(term127985, term127985.getClass(), "count", 0);
        setField(term127984, term127984.getClass(), "value", term127985);
        setIntField(term127984, term127984.getClass(), "count", 0);
        setElement(term127982, 1, term127984);
        setField(term127989, term127989.getClass(), "value", "");
        setIntField(term127989, term127989.getClass(), "count", 0);
        setElement(term127982, 2, term127989);
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
        args[0] = term126547;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term126547, term127982));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


