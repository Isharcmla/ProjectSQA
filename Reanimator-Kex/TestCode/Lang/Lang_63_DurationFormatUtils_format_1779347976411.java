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

public class DurationFormatUtils_format_1779347976411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339539;
     Object term341188;

    public DurationFormatUtils_format_1779347976411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term340296 = new StringBuffer();
        StringBuilder term340470 = new StringBuilder();
        term339539 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term340238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term340410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term340238, term340238.getClass(), "value", term340296);
        setIntField(term340238, term340238.getClass(), "count", 0);
        setElement(term339539, 0, term340238);
        setElement(term339539, 1, term340238);
        setElement(term339539, 2, term340238);
        setField(term340410, term340410.getClass(), "value", term340470);
        setIntField(term340410, term340410.getClass(), "count", 0);
        setElement(term339539, 3, term340410);
        setElement(term339539, 4, term340238);
        term341188 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term341189 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term341190 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term341193 = (byte[]) newByteArray(16);
        Object term341194 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term341195 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term341196 = (byte[]) newByteArray(16);
        setField(term341190, term341190.getClass(), "toStringCache", "");
        setField(term341190, term341190.getClass(), "value", term341193);
        setByteField(term341190, term341190.getClass(), "coder", (byte) 0);
        setIntField(term341190, term341190.getClass(), "count", 0);
        setField(term341189, term341189.getClass(), "value", term341190);
        setIntField(term341189, term341189.getClass(), "count", 0);
        setElement(term341188, 0, term341189);
        setElement(term341188, 1, term341189);
        setElement(term341188, 2, term341189);
        setField(term341195, term341195.getClass(), "value", term341196);
        setByteField(term341195, term341195.getClass(), "coder", (byte) 0);
        setIntField(term341195, term341195.getClass(), "count", 0);
        setField(term341194, term341194.getClass(), "value", term341195);
        setIntField(term341194, term341194.getClass(), "count", 0);
        setElement(term341188, 3, term341194);
        setElement(term341188, 4, term341189);
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
        args[0] = term339539;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term339539, term341188));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


