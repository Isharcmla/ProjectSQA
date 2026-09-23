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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249235;
     Object term251418;

    public DurationFormatUtils_format_1779347976332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term249586 = new StringBuilder();
        StringBuffer term249872 = new StringBuffer();
        term249235 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term249526 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249814 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249986 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term249297 = (char[]) newCharArray(0);
        Object term250100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term249287 = (char[]) newCharArray(0);
        setField(term249526, term249526.getClass(), "value", term249586);
        setIntField(term249526, term249526.getClass(), "count", 0);
        setElement(term249235, 0, term249526);
        setField(term249700, term249700.getClass(), "value", null);
        setIntField(term249700, term249700.getClass(), "count", 0);
        setElement(term249235, 1, term249700);
        setField(term249814, term249814.getClass(), "value", term249872);
        setIntField(term249814, term249814.getClass(), "count", 0);
        setElement(term249235, 2, term249814);
        setElement(term249235, 3, term249814);
        setField(term249986, term249986.getClass(), "value", term249297);
        setIntField(term249986, term249986.getClass(), "count", 0);
        setElement(term249235, 4, term249986);
        setField(term250100, term250100.getClass(), "value", term249287);
        setIntField(term250100, term250100.getClass(), "count", 0);
        setElement(term249235, 5, term250100);
        term251418 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term251419 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251420 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term251421 = (byte[]) newByteArray(16);
        Object term251422 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251423 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251424 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term251427 = (byte[]) newByteArray(16);
        Object term251428 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term251429 = (char[]) newCharArray(0);
        Object term251430 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term251431 = (char[]) newCharArray(0);
        setField(term251420, term251420.getClass(), "value", term251421);
        setByteField(term251420, term251420.getClass(), "coder", (byte) 0);
        setIntField(term251420, term251420.getClass(), "count", 0);
        setField(term251419, term251419.getClass(), "value", term251420);
        setIntField(term251419, term251419.getClass(), "count", 0);
        setElement(term251418, 0, term251419);
        setField(term251422, term251422.getClass(), "value", null);
        setIntField(term251422, term251422.getClass(), "count", 0);
        setElement(term251418, 1, term251422);
        setField(term251424, term251424.getClass(), "toStringCache", "");
        setField(term251424, term251424.getClass(), "value", term251427);
        setByteField(term251424, term251424.getClass(), "coder", (byte) 0);
        setIntField(term251424, term251424.getClass(), "count", 0);
        setField(term251423, term251423.getClass(), "value", term251424);
        setIntField(term251423, term251423.getClass(), "count", 0);
        setElement(term251418, 2, term251423);
        setElement(term251418, 3, term251423);
        setField(term251428, term251428.getClass(), "value", term251429);
        setIntField(term251428, term251428.getClass(), "count", 0);
        setElement(term251418, 4, term251428);
        setField(term251430, term251430.getClass(), "value", term251431);
        setIntField(term251430, term251430.getClass(), "count", 0);
        setElement(term251418, 5, term251430);
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
        args[0] = term249235;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term249235, term251418));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


