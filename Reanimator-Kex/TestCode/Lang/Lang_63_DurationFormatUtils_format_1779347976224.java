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

public class DurationFormatUtils_format_1779347976224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152850;
     Object term155095;

    public DurationFormatUtils_format_1779347976224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term153238 = new StringBuffer();
        StringBuilder term153412 = new StringBuilder();
        term152850 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term153180 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term153352 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term153526 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term153564 = newInstance(Class.forName("java.lang.Object"));
        Object term153678 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term153180, term153180.getClass(), "value", term153238);
        setIntField(term153180, term153180.getClass(), "count", 0);
        setElement(term152850, 0, term153180);
        setField(term153352, term153352.getClass(), "value", term153412);
        setIntField(term153352, term153352.getClass(), "count", 0);
        setElement(term152850, 1, term153352);
        setField(term153526, term153526.getClass(), "value", term153564);
        setIntField(term153526, term153526.getClass(), "count", 0);
        setElement(term152850, 2, term153526);
        setElement(term152850, 3, term153678);
        term155095 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term155096 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155097 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term155100 = (byte[]) newByteArray(16);
        Object term155101 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155102 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term155103 = (byte[]) newByteArray(16);
        Object term155104 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155105 = newInstance(Class.forName("java.lang.Object"));
        Object term155106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term155097, term155097.getClass(), "toStringCache", "");
        setField(term155097, term155097.getClass(), "value", term155100);
        setByteField(term155097, term155097.getClass(), "coder", (byte) 0);
        setIntField(term155097, term155097.getClass(), "count", 0);
        setField(term155096, term155096.getClass(), "value", term155097);
        setIntField(term155096, term155096.getClass(), "count", 0);
        setElement(term155095, 0, term155096);
        setField(term155102, term155102.getClass(), "value", term155103);
        setByteField(term155102, term155102.getClass(), "coder", (byte) 0);
        setIntField(term155102, term155102.getClass(), "count", 0);
        setField(term155101, term155101.getClass(), "value", term155102);
        setIntField(term155101, term155101.getClass(), "count", 0);
        setElement(term155095, 1, term155101);
        setField(term155104, term155104.getClass(), "value", term155105);
        setIntField(term155104, term155104.getClass(), "count", 0);
        setElement(term155095, 2, term155104);
        setField(term155106, term155106.getClass(), "value", null);
        setIntField(term155106, term155106.getClass(), "count", 0);
        setElement(term155095, 3, term155106);
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
        args[0] = term152850;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term152850, term155095));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


