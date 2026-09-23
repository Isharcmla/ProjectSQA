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

public class DurationFormatUtils_format_1779347976323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241229;
     Object term242371;

    public DurationFormatUtils_format_1779347976323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term241758 = new StringBuffer();
        StringBuffer term241930 = new StringBuffer();
        StringBuffer term242102 = new StringBuffer();
        term241229 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term241700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term241872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term242044 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term241700, term241700.getClass(), "value", term241758);
        setIntField(term241700, term241700.getClass(), "count", 0);
        setElement(term241229, 0, term241700);
        setField(term241872, term241872.getClass(), "value", term241930);
        setIntField(term241872, term241872.getClass(), "count", 0);
        setElement(term241229, 1, term241872);
        setField(term242044, term242044.getClass(), "value", term242102);
        setIntField(term242044, term242044.getClass(), "count", 0);
        setElement(term241229, 2, term242044);
        setElement(term241229, 3, term241872);
        term242371 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term242372 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term242373 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term242376 = (byte[]) newByteArray(16);
        Object term242377 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term242378 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term242381 = (byte[]) newByteArray(16);
        Object term242382 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term242383 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term242386 = (byte[]) newByteArray(16);
        setField(term242373, term242373.getClass(), "toStringCache", "");
        setField(term242373, term242373.getClass(), "value", term242376);
        setByteField(term242373, term242373.getClass(), "coder", (byte) 0);
        setIntField(term242373, term242373.getClass(), "count", 0);
        setField(term242372, term242372.getClass(), "value", term242373);
        setIntField(term242372, term242372.getClass(), "count", 0);
        setElement(term242371, 0, term242372);
        setField(term242378, term242378.getClass(), "toStringCache", "");
        setField(term242378, term242378.getClass(), "value", term242381);
        setByteField(term242378, term242378.getClass(), "coder", (byte) 0);
        setIntField(term242378, term242378.getClass(), "count", 0);
        setField(term242377, term242377.getClass(), "value", term242378);
        setIntField(term242377, term242377.getClass(), "count", 0);
        setElement(term242371, 1, term242377);
        setField(term242383, term242383.getClass(), "toStringCache", "");
        setField(term242383, term242383.getClass(), "value", term242386);
        setByteField(term242383, term242383.getClass(), "coder", (byte) 0);
        setIntField(term242383, term242383.getClass(), "count", 0);
        setField(term242382, term242382.getClass(), "value", term242383);
        setIntField(term242382, term242382.getClass(), "count", 0);
        setElement(term242371, 2, term242382);
        setElement(term242371, 3, term242377);
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
        args[0] = term241229;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term241229, term242371));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


