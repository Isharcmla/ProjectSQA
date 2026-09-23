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

public class DurationFormatUtils_format_1779347976117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86535;
     Object term87626;

    public DurationFormatUtils_format_1779347976117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term87303 = new StringBuffer();
        term86535 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term87245 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term87417 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term87527 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term87245, term87245.getClass(), "value", term87303);
        setIntField(term87245, term87245.getClass(), "count", 0);
        setElement(term86535, 0, term87245);
        setField(term87417, term87417.getClass(), "value", term87527);
        setIntField(term87417, term87417.getClass(), "count", 0);
        setElement(term86535, 1, term87417);
        term87626 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term87627 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term87628 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term87631 = (byte[]) newByteArray(16);
        Object term87632 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term87633 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term87628, term87628.getClass(), "toStringCache", "");
        setField(term87628, term87628.getClass(), "value", term87631);
        setByteField(term87628, term87628.getClass(), "coder", (byte) 0);
        setIntField(term87628, term87628.getClass(), "count", 0);
        setField(term87627, term87627.getClass(), "value", term87628);
        setIntField(term87627, term87627.getClass(), "count", 0);
        setElement(term87626, 0, term87627);
        setField(term87632, term87632.getClass(), "value", term87633);
        setIntField(term87632, term87632.getClass(), "count", 0);
        setElement(term87626, 1, term87632);
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
        args[0] = term86535;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term86535, term87626));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


