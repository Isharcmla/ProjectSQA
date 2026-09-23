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

public class DurationFormatUtils_format_1779347976351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270606;
     Object term272358;

    public DurationFormatUtils_format_1779347976351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term271649 = new StringBuffer();
        StringBuffer term271821 = new StringBuffer();
        StringBuilder term271995 = new StringBuilder();
        term270606 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term271021 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term270760 = (char[]) newCharArray(0);
        Object term271135 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term271287 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term271325 = newInstance(Class.forName("java.lang.Object"));
        Object term271439 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term271477 = newInstance(Class.forName("java.lang.Object"));
        Object term271591 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term271763 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term271935 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term271021, term271021.getClass(), "value", term270760);
        setIntField(term271021, term271021.getClass(), "count", 0);
        setElement(term270606, 0, term271021);
        setField(term271135, term271135.getClass(), "value", "");
        setIntField(term271135, term271135.getClass(), "count", 0);
        setElement(term270606, 1, term271135);
        setField(term271287, term271287.getClass(), "value", term271325);
        setIntField(term271287, term271287.getClass(), "count", 0);
        setElement(term270606, 2, term271287);
        setField(term271439, term271439.getClass(), "value", term271477);
        setIntField(term271439, term271439.getClass(), "count", 0);
        setElement(term270606, 3, term271439);
        setField(term271591, term271591.getClass(), "value", term271649);
        setIntField(term271591, term271591.getClass(), "count", 0);
        setElement(term270606, 4, term271591);
        setField(term271763, term271763.getClass(), "value", term271821);
        setIntField(term271763, term271763.getClass(), "count", 0);
        setElement(term270606, 5, term271763);
        setField(term271935, term271935.getClass(), "value", term271995);
        setIntField(term271935, term271935.getClass(), "count", 0);
        setElement(term270606, 6, term271935);
        term272358 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term272359 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term272360 = (char[]) newCharArray(0);
        Object term272361 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272364 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272365 = newInstance(Class.forName("java.lang.Object"));
        Object term272366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272367 = newInstance(Class.forName("java.lang.Object"));
        Object term272368 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272369 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term272372 = (byte[]) newByteArray(16);
        Object term272373 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272374 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term272377 = (byte[]) newByteArray(16);
        Object term272378 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term272379 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term272380 = (byte[]) newByteArray(16);
        setField(term272359, term272359.getClass(), "value", term272360);
        setIntField(term272359, term272359.getClass(), "count", 0);
        setElement(term272358, 0, term272359);
        setField(term272361, term272361.getClass(), "value", "");
        setIntField(term272361, term272361.getClass(), "count", 0);
        setElement(term272358, 1, term272361);
        setField(term272364, term272364.getClass(), "value", term272365);
        setIntField(term272364, term272364.getClass(), "count", 0);
        setElement(term272358, 2, term272364);
        setField(term272366, term272366.getClass(), "value", term272367);
        setIntField(term272366, term272366.getClass(), "count", 0);
        setElement(term272358, 3, term272366);
        setField(term272369, term272369.getClass(), "toStringCache", "");
        setField(term272369, term272369.getClass(), "value", term272372);
        setByteField(term272369, term272369.getClass(), "coder", (byte) 0);
        setIntField(term272369, term272369.getClass(), "count", 0);
        setField(term272368, term272368.getClass(), "value", term272369);
        setIntField(term272368, term272368.getClass(), "count", 0);
        setElement(term272358, 4, term272368);
        setField(term272374, term272374.getClass(), "toStringCache", "");
        setField(term272374, term272374.getClass(), "value", term272377);
        setByteField(term272374, term272374.getClass(), "coder", (byte) 0);
        setIntField(term272374, term272374.getClass(), "count", 0);
        setField(term272373, term272373.getClass(), "value", term272374);
        setIntField(term272373, term272373.getClass(), "count", 0);
        setElement(term272358, 5, term272373);
        setField(term272379, term272379.getClass(), "value", term272380);
        setByteField(term272379, term272379.getClass(), "coder", (byte) 0);
        setIntField(term272379, term272379.getClass(), "count", 0);
        setField(term272378, term272378.getClass(), "value", term272379);
        setIntField(term272378, term272378.getClass(), "count", 0);
        setElement(term272358, 6, term272378);
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
        args[0] = term270606;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term270606, term272358));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


