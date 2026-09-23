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

public class DurationFormatUtils_format_1779347976355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274538;
     Object term276277;

    public DurationFormatUtils_format_1779347976355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term275104 = new StringBuffer();
        StringBuffer term275492 = new StringBuffer();
        StringBuffer term275664 = new StringBuffer();
        StringBuilder term275952 = new StringBuilder();
        term274538 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term275046 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term275218 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term275320 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term275434 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term275606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term275778 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term275892 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term275046, term275046.getClass(), "value", term275104);
        setIntField(term275046, term275046.getClass(), "count", 0);
        setElement(term274538, 0, term275046);
        setField(term275218, term275218.getClass(), "value", term275320);
        setIntField(term275218, term275218.getClass(), "count", 0);
        setElement(term274538, 1, term275218);
        setField(term275434, term275434.getClass(), "value", term275492);
        setIntField(term275434, term275434.getClass(), "count", 0);
        setElement(term274538, 2, term275434);
        setField(term275606, term275606.getClass(), "value", term275664);
        setIntField(term275606, term275606.getClass(), "count", 0);
        setElement(term274538, 3, term275606);
        setField(term275778, term275778.getClass(), "value", null);
        setIntField(term275778, term275778.getClass(), "count", 0);
        setElement(term274538, 4, term275778);
        setField(term275892, term275892.getClass(), "value", term275952);
        setIntField(term275892, term275892.getClass(), "count", 0);
        setElement(term274538, 5, term275892);
        term276277 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term276278 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276279 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term276282 = (byte[]) newByteArray(16);
        Object term276283 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276284 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term276285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276286 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term276289 = (byte[]) newByteArray(16);
        Object term276290 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276291 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term276294 = (byte[]) newByteArray(16);
        Object term276295 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276297 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term276298 = (byte[]) newByteArray(16);
        setField(term276279, term276279.getClass(), "toStringCache", "");
        setField(term276279, term276279.getClass(), "value", term276282);
        setByteField(term276279, term276279.getClass(), "coder", (byte) 0);
        setIntField(term276279, term276279.getClass(), "count", 0);
        setField(term276278, term276278.getClass(), "value", term276279);
        setIntField(term276278, term276278.getClass(), "count", 0);
        setElement(term276277, 0, term276278);
        setField(term276283, term276283.getClass(), "value", term276284);
        setIntField(term276283, term276283.getClass(), "count", 0);
        setElement(term276277, 1, term276283);
        setField(term276286, term276286.getClass(), "toStringCache", "");
        setField(term276286, term276286.getClass(), "value", term276289);
        setByteField(term276286, term276286.getClass(), "coder", (byte) 0);
        setIntField(term276286, term276286.getClass(), "count", 0);
        setField(term276285, term276285.getClass(), "value", term276286);
        setIntField(term276285, term276285.getClass(), "count", 0);
        setElement(term276277, 2, term276285);
        setField(term276291, term276291.getClass(), "toStringCache", "");
        setField(term276291, term276291.getClass(), "value", term276294);
        setByteField(term276291, term276291.getClass(), "coder", (byte) 0);
        setIntField(term276291, term276291.getClass(), "count", 0);
        setField(term276290, term276290.getClass(), "value", term276291);
        setIntField(term276290, term276290.getClass(), "count", 0);
        setElement(term276277, 3, term276290);
        setField(term276295, term276295.getClass(), "value", null);
        setIntField(term276295, term276295.getClass(), "count", 0);
        setElement(term276277, 4, term276295);
        setField(term276297, term276297.getClass(), "value", term276298);
        setByteField(term276297, term276297.getClass(), "coder", (byte) 0);
        setIntField(term276297, term276297.getClass(), "count", 0);
        setField(term276296, term276296.getClass(), "value", term276297);
        setIntField(term276296, term276296.getClass(), "count", 0);
        setElement(term276277, 5, term276296);
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
        args[0] = term274538;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term274538, term276277));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


