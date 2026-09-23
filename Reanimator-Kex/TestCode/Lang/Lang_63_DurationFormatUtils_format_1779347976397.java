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

public class DurationFormatUtils_format_1779347976397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325490;
     Object term330263;

    public DurationFormatUtils_format_1779347976397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term327059 = new StringBuffer();
        StringBuffer term327447 = new StringBuffer();
        StringBuffer term327619 = new StringBuffer();
        term325490 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term326303 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term326405 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term326519 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term326557 = newInstance(Class.forName("java.lang.Object"));
        Object term326671 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term325508 = (char[]) newCharArray(258);
        Object term326785 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term326887 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term327001 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term327173 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term327275 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term327389 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term327561 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term326303, term326303.getClass(), "value", term326405);
        setIntField(term326303, term326303.getClass(), "count", 0);
        setElement(term325490, 0, term326303);
        setField(term326519, term326519.getClass(), "value", term326557);
        setIntField(term326519, term326519.getClass(), "count", 0);
        setElement(term325490, 1, term326519);
        setField(term326671, term326671.getClass(), "value", term325508);
        setIntField(term326671, term326671.getClass(), "count", 0);
        setElement(term325490, 2, term326671);
        setField(term326785, term326785.getClass(), "value", term326887);
        setIntField(term326785, term326785.getClass(), "count", 0);
        setElement(term325490, 3, term326785);
        setField(term327001, term327001.getClass(), "value", term327059);
        setIntField(term327001, term327001.getClass(), "count", 0);
        setElement(term325490, 4, term327001);
        setField(term327173, term327173.getClass(), "value", term327275);
        setIntField(term327173, term327173.getClass(), "count", 0);
        setElement(term325490, 5, term327173);
        setField(term327389, term327389.getClass(), "value", term327447);
        setIntField(term327389, term327389.getClass(), "count", 0);
        setElement(term325490, 6, term327389);
        setField(term327561, term327561.getClass(), "value", term327619);
        setIntField(term327561, term327561.getClass(), "count", 0);
        setElement(term325490, 7, term327561);
        term330263 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term330264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330265 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term330266 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330267 = newInstance(Class.forName("java.lang.Object"));
        Object term330268 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term330269 = (char[]) newCharArray(258);
        Object term330270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term330272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330273 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term330276 = (byte[]) newByteArray(16);
        Object term330277 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330278 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term330279 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330280 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term330283 = (byte[]) newByteArray(16);
        Object term330284 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term330285 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term330288 = (byte[]) newByteArray(16);
        setField(term330264, term330264.getClass(), "value", term330265);
        setIntField(term330264, term330264.getClass(), "count", 0);
        setElement(term330263, 0, term330264);
        setField(term330266, term330266.getClass(), "value", term330267);
        setIntField(term330266, term330266.getClass(), "count", 0);
        setElement(term330263, 1, term330266);
        setField(term330268, term330268.getClass(), "value", term330269);
        setIntField(term330268, term330268.getClass(), "count", 0);
        setElement(term330263, 2, term330268);
        setField(term330270, term330270.getClass(), "value", term330271);
        setIntField(term330270, term330270.getClass(), "count", 0);
        setElement(term330263, 3, term330270);
        setField(term330273, term330273.getClass(), "toStringCache", "");
        setField(term330273, term330273.getClass(), "value", term330276);
        setByteField(term330273, term330273.getClass(), "coder", (byte) 0);
        setIntField(term330273, term330273.getClass(), "count", 0);
        setField(term330272, term330272.getClass(), "value", term330273);
        setIntField(term330272, term330272.getClass(), "count", 0);
        setElement(term330263, 4, term330272);
        setField(term330277, term330277.getClass(), "value", term330278);
        setIntField(term330277, term330277.getClass(), "count", 0);
        setElement(term330263, 5, term330277);
        setField(term330280, term330280.getClass(), "toStringCache", "");
        setField(term330280, term330280.getClass(), "value", term330283);
        setByteField(term330280, term330280.getClass(), "coder", (byte) 0);
        setIntField(term330280, term330280.getClass(), "count", 0);
        setField(term330279, term330279.getClass(), "value", term330280);
        setIntField(term330279, term330279.getClass(), "count", 0);
        setElement(term330263, 6, term330279);
        setField(term330285, term330285.getClass(), "toStringCache", "");
        setField(term330285, term330285.getClass(), "value", term330288);
        setByteField(term330285, term330285.getClass(), "coder", (byte) 0);
        setIntField(term330285, term330285.getClass(), "count", 0);
        setField(term330284, term330284.getClass(), "value", term330285);
        setIntField(term330284, term330284.getClass(), "count", 0);
        setElement(term330263, 7, term330284);
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
        args[0] = term325490;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term325490, term330263));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


