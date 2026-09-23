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

public class DurationFormatUtils_format_1779347976203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140210;
     Object term141658;

    public DurationFormatUtils_format_1779347976203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term140528 = new StringBuilder();
        StringBuffer term140852 = new StringBuffer();
        StringBuffer term141176 = new StringBuffer();
        term140210 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term140468 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140642 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140680 = newInstance(Class.forName("java.lang.Object"));
        Object term140794 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140966 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141004 = newInstance(Class.forName("java.lang.Object"));
        Object term141118 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term140468, term140468.getClass(), "value", term140528);
        setIntField(term140468, term140468.getClass(), "count", 0);
        setElement(term140210, 0, term140468);
        setField(term140642, term140642.getClass(), "value", term140680);
        setIntField(term140642, term140642.getClass(), "count", 0);
        setElement(term140210, 1, term140642);
        setField(term140794, term140794.getClass(), "value", term140852);
        setIntField(term140794, term140794.getClass(), "count", 0);
        setElement(term140210, 2, term140794);
        setField(term140966, term140966.getClass(), "value", term141004);
        setIntField(term140966, term140966.getClass(), "count", 0);
        setElement(term140210, 3, term140966);
        setField(term141118, term141118.getClass(), "value", term141176);
        setIntField(term141118, term141118.getClass(), "count", 0);
        setElement(term140210, 4, term141118);
        term141658 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term141659 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141660 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term141661 = (byte[]) newByteArray(16);
        Object term141662 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141663 = newInstance(Class.forName("java.lang.Object"));
        Object term141664 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141665 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term141668 = (byte[]) newByteArray(16);
        Object term141669 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141670 = newInstance(Class.forName("java.lang.Object"));
        Object term141671 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141672 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term141675 = (byte[]) newByteArray(16);
        setField(term141660, term141660.getClass(), "value", term141661);
        setByteField(term141660, term141660.getClass(), "coder", (byte) 0);
        setIntField(term141660, term141660.getClass(), "count", 0);
        setField(term141659, term141659.getClass(), "value", term141660);
        setIntField(term141659, term141659.getClass(), "count", 0);
        setElement(term141658, 0, term141659);
        setField(term141662, term141662.getClass(), "value", term141663);
        setIntField(term141662, term141662.getClass(), "count", 0);
        setElement(term141658, 1, term141662);
        setField(term141665, term141665.getClass(), "toStringCache", "");
        setField(term141665, term141665.getClass(), "value", term141668);
        setByteField(term141665, term141665.getClass(), "coder", (byte) 0);
        setIntField(term141665, term141665.getClass(), "count", 0);
        setField(term141664, term141664.getClass(), "value", term141665);
        setIntField(term141664, term141664.getClass(), "count", 0);
        setElement(term141658, 2, term141664);
        setField(term141669, term141669.getClass(), "value", term141670);
        setIntField(term141669, term141669.getClass(), "count", 0);
        setElement(term141658, 3, term141669);
        setField(term141672, term141672.getClass(), "toStringCache", "");
        setField(term141672, term141672.getClass(), "value", term141675);
        setByteField(term141672, term141672.getClass(), "coder", (byte) 0);
        setIntField(term141672, term141672.getClass(), "count", 0);
        setField(term141671, term141671.getClass(), "value", term141672);
        setIntField(term141671, term141671.getClass(), "count", 0);
        setElement(term141658, 4, term141671);
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
        args[0] = term140210;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term140210, term141658));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


