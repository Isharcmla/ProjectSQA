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

public class DurationFormatUtils_format_1779347976492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416168;
     Object term418063;

    public DurationFormatUtils_format_1779347976492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term416435 = new StringBuffer();
        StringBuffer term416607 = new StringBuffer();
        StringBuffer term416779 = new StringBuffer();
        term416168 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term416377 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term416549 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term416721 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term416377, term416377.getClass(), "value", term416435);
        setIntField(term416377, term416377.getClass(), "count", 0);
        setElement(term416168, 0, term416377);
        setField(term416549, term416549.getClass(), "value", term416607);
        setIntField(term416549, term416549.getClass(), "count", 0);
        setElement(term416168, 1, term416549);
        setField(term416721, term416721.getClass(), "value", term416779);
        setIntField(term416721, term416721.getClass(), "count", 0);
        setElement(term416168, 2, term416721);
        term418063 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term418064 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418065 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term418068 = (byte[]) newByteArray(16);
        Object term418069 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418070 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term418073 = (byte[]) newByteArray(16);
        Object term418074 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term418075 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term418078 = (byte[]) newByteArray(16);
        setField(term418065, term418065.getClass(), "toStringCache", "");
        setField(term418065, term418065.getClass(), "value", term418068);
        setByteField(term418065, term418065.getClass(), "coder", (byte) 0);
        setIntField(term418065, term418065.getClass(), "count", 0);
        setField(term418064, term418064.getClass(), "value", term418065);
        setIntField(term418064, term418064.getClass(), "count", 0);
        setElement(term418063, 0, term418064);
        setField(term418070, term418070.getClass(), "toStringCache", "");
        setField(term418070, term418070.getClass(), "value", term418073);
        setByteField(term418070, term418070.getClass(), "coder", (byte) 0);
        setIntField(term418070, term418070.getClass(), "count", 0);
        setField(term418069, term418069.getClass(), "value", term418070);
        setIntField(term418069, term418069.getClass(), "count", 0);
        setElement(term418063, 1, term418069);
        setField(term418075, term418075.getClass(), "toStringCache", "");
        setField(term418075, term418075.getClass(), "value", term418078);
        setByteField(term418075, term418075.getClass(), "coder", (byte) 0);
        setIntField(term418075, term418075.getClass(), "count", 0);
        setField(term418074, term418074.getClass(), "value", term418075);
        setIntField(term418074, term418074.getClass(), "count", 0);
        setElement(term418063, 2, term418074);
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
        args[0] = term416168;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term416168, term418063));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


