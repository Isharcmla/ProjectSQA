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

public class DurationFormatUtils_format_1779347976171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122840;
     Object term125663;

    public DurationFormatUtils_format_1779347976171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term123306 = new StringBuffer();
        term122840 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term123248 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term123420 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term123248, term123248.getClass(), "value", term123306);
        setIntField(term123248, term123248.getClass(), "count", 0);
        setElement(term122840, 0, term123248);
        setElement(term122840, 1, term123420);
        term125663 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term125664 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125665 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term125668 = (byte[]) newByteArray(16);
        Object term125669 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term125665, term125665.getClass(), "toStringCache", "");
        setField(term125665, term125665.getClass(), "value", term125668);
        setByteField(term125665, term125665.getClass(), "coder", (byte) 0);
        setIntField(term125665, term125665.getClass(), "count", 0);
        setField(term125664, term125664.getClass(), "value", term125665);
        setIntField(term125664, term125664.getClass(), "count", 0);
        setElement(term125663, 0, term125664);
        setField(term125669, term125669.getClass(), "value", null);
        setIntField(term125669, term125669.getClass(), "count", 0);
        setElement(term125663, 1, term125669);
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
        args[0] = term122840;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term122840, term125663));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


