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

public class DurationFormatUtils_format_177934797663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35181;
     Object term36291;

    public DurationFormatUtils_format_177934797663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term35960 = new StringBuffer();
        term35181 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term35450 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term35560 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term35674 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term35222 = (char[]) newCharArray(0);
        Object term35788 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term35902 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term36074 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term35450, term35450.getClass(), "value", term35560);
        setIntField(term35450, term35450.getClass(), "count", 0);
        setElement(term35181, 0, term35450);
        setField(term35674, term35674.getClass(), "value", term35222);
        setIntField(term35674, term35674.getClass(), "count", 0);
        setElement(term35181, 1, term35674);
        setField(term35788, term35788.getClass(), "value", term35788);
        setIntField(term35788, term35788.getClass(), "count", 0);
        setElement(term35181, 2, term35788);
        setElement(term35181, 3, term35674);
        setField(term35902, term35902.getClass(), "value", term35960);
        setIntField(term35902, term35902.getClass(), "count", 0);
        setElement(term35181, 4, term35902);
        setElement(term35181, 5, term36074);
        term36291 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term36292 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term36293 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term36294 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term36295 = (char[]) newCharArray(0);
        Object term36296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term36297 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term36298 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term36301 = (byte[]) newByteArray(16);
        Object term36302 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term36292, term36292.getClass(), "value", term36293);
        setIntField(term36292, term36292.getClass(), "count", 0);
        setElement(term36291, 0, term36292);
        setField(term36294, term36294.getClass(), "value", term36295);
        setIntField(term36294, term36294.getClass(), "count", 0);
        setElement(term36291, 1, term36294);
        setField(term36296, term36296.getClass(), "value", term36296);
        setIntField(term36296, term36296.getClass(), "count", 0);
        setElement(term36291, 2, term36296);
        setElement(term36291, 3, term36294);
        setField(term36298, term36298.getClass(), "toStringCache", "");
        setField(term36298, term36298.getClass(), "value", term36301);
        setByteField(term36298, term36298.getClass(), "coder", (byte) 0);
        setIntField(term36298, term36298.getClass(), "count", 0);
        setField(term36297, term36297.getClass(), "value", term36298);
        setIntField(term36297, term36297.getClass(), "count", 0);
        setElement(term36291, 4, term36297);
        setField(term36302, term36302.getClass(), "value", null);
        setIntField(term36302, term36302.getClass(), "count", 0);
        setElement(term36291, 5, term36302);
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
        args[0] = term35181;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term35181, term36291));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


