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

public class DurationFormatUtils_format_1779347976191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132508;
     Object term134333;

    public DurationFormatUtils_format_1779347976191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term133315 = new StringBuilder();
        StringBuffer term133487 = new StringBuffer();
        StringBuffer term133659 = new StringBuffer();
        term132508 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term133255 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term133429 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term133601 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term133773 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term133811 = newInstance(Class.forName("java.lang.Object"));
        Object term133925 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term133255, term133255.getClass(), "value", term133315);
        setIntField(term133255, term133255.getClass(), "count", 0);
        setElement(term132508, 0, term133255);
        setField(term133429, term133429.getClass(), "value", term133487);
        setIntField(term133429, term133429.getClass(), "count", 0);
        setElement(term132508, 1, term133429);
        setField(term133601, term133601.getClass(), "value", term133659);
        setIntField(term133601, term133601.getClass(), "count", 0);
        setElement(term132508, 2, term133601);
        setField(term133773, term133773.getClass(), "value", term133811);
        setIntField(term133773, term133773.getClass(), "count", 0);
        setElement(term132508, 3, term133773);
        setElement(term132508, 4, term133925);
        term134333 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term134334 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134335 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term134336 = (byte[]) newByteArray(16);
        Object term134337 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134338 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term134341 = (byte[]) newByteArray(16);
        Object term134342 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134343 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term134346 = (byte[]) newByteArray(16);
        Object term134347 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134348 = newInstance(Class.forName("java.lang.Object"));
        Object term134349 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term134335, term134335.getClass(), "value", term134336);
        setByteField(term134335, term134335.getClass(), "coder", (byte) 0);
        setIntField(term134335, term134335.getClass(), "count", 0);
        setField(term134334, term134334.getClass(), "value", term134335);
        setIntField(term134334, term134334.getClass(), "count", 0);
        setElement(term134333, 0, term134334);
        setField(term134338, term134338.getClass(), "toStringCache", "");
        setField(term134338, term134338.getClass(), "value", term134341);
        setByteField(term134338, term134338.getClass(), "coder", (byte) 0);
        setIntField(term134338, term134338.getClass(), "count", 0);
        setField(term134337, term134337.getClass(), "value", term134338);
        setIntField(term134337, term134337.getClass(), "count", 0);
        setElement(term134333, 1, term134337);
        setField(term134343, term134343.getClass(), "toStringCache", "");
        setField(term134343, term134343.getClass(), "value", term134346);
        setByteField(term134343, term134343.getClass(), "coder", (byte) 0);
        setIntField(term134343, term134343.getClass(), "count", 0);
        setField(term134342, term134342.getClass(), "value", term134343);
        setIntField(term134342, term134342.getClass(), "count", 0);
        setElement(term134333, 2, term134342);
        setField(term134347, term134347.getClass(), "value", term134348);
        setIntField(term134347, term134347.getClass(), "count", 0);
        setElement(term134333, 3, term134347);
        setField(term134349, term134349.getClass(), "value", null);
        setIntField(term134349, term134349.getClass(), "count", 0);
        setElement(term134333, 4, term134349);
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
        args[0] = term132508;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term132508, term134333));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


