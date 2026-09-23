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

public class DurationFormatUtils_format_1779347976229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155428;
     Object term158748;

    public DurationFormatUtils_format_1779347976229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term156457 = new StringBuffer();
        term155428 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term156285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term155572 = (char[]) newCharArray(0);
        Object term156399 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term156571 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term155441 = (char[]) newCharArray(130);
        setField(term156285, term156285.getClass(), "value", term155572);
        setIntField(term156285, term156285.getClass(), "count", 0);
        setElement(term155428, 0, term156285);
        setField(term156399, term156399.getClass(), "value", term156457);
        setIntField(term156399, term156399.getClass(), "count", 0);
        setElement(term155428, 1, term156399);
        setField(term156571, term156571.getClass(), "value", term155441);
        setIntField(term156571, term156571.getClass(), "count", 0);
        setElement(term155428, 2, term156571);
        term158748 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term158749 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term158750 = (char[]) newCharArray(0);
        Object term158751 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term158752 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term158755 = (byte[]) newByteArray(16);
        Object term158756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term158757 = (char[]) newCharArray(130);
        setField(term158749, term158749.getClass(), "value", term158750);
        setIntField(term158749, term158749.getClass(), "count", 0);
        setElement(term158748, 0, term158749);
        setField(term158752, term158752.getClass(), "toStringCache", "");
        setField(term158752, term158752.getClass(), "value", term158755);
        setByteField(term158752, term158752.getClass(), "coder", (byte) 0);
        setIntField(term158752, term158752.getClass(), "count", 0);
        setField(term158751, term158751.getClass(), "value", term158752);
        setIntField(term158751, term158751.getClass(), "count", 0);
        setElement(term158748, 1, term158751);
        setField(term158756, term158756.getClass(), "value", term158757);
        setIntField(term158756, term158756.getClass(), "count", 0);
        setElement(term158748, 2, term158756);
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
        args[0] = term155428;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term155428, term158748));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


