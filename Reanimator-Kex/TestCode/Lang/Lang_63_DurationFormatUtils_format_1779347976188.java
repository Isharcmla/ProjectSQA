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

public class DurationFormatUtils_format_1779347976188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130632;
     Object term132482;

    public DurationFormatUtils_format_1779347976188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term131531 = new StringBuffer();
        term130632 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term131131 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term131245 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term131359 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term131473 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term131645 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term131131, term131131.getClass(), "value", null);
        setIntField(term131131, term131131.getClass(), "count", 0);
        setElement(term130632, 0, term131131);
        setField(term131245, term131245.getClass(), "value", term131245);
        setIntField(term131245, term131245.getClass(), "count", 0);
        setElement(term130632, 1, term131245);
        setField(term131359, term131359.getClass(), "value", null);
        setIntField(term131359, term131359.getClass(), "count", 0);
        setElement(term130632, 2, term131359);
        setElement(term130632, 3, term131359);
        setField(term131473, term131473.getClass(), "value", term131531);
        setIntField(term131473, term131473.getClass(), "count", 0);
        setElement(term130632, 4, term131473);
        setElement(term130632, 5, term131245);
        setElement(term130632, 6, term131645);
        term132482 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term132483 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132484 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132485 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132486 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132487 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term132490 = (byte[]) newByteArray(16);
        Object term132491 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term132483, term132483.getClass(), "value", null);
        setIntField(term132483, term132483.getClass(), "count", 0);
        setElement(term132482, 0, term132483);
        setField(term132484, term132484.getClass(), "value", term132484);
        setIntField(term132484, term132484.getClass(), "count", 0);
        setElement(term132482, 1, term132484);
        setField(term132485, term132485.getClass(), "value", null);
        setIntField(term132485, term132485.getClass(), "count", 0);
        setElement(term132482, 2, term132485);
        setElement(term132482, 3, term132485);
        setField(term132487, term132487.getClass(), "toStringCache", "");
        setField(term132487, term132487.getClass(), "value", term132490);
        setByteField(term132487, term132487.getClass(), "coder", (byte) 0);
        setIntField(term132487, term132487.getClass(), "count", 0);
        setField(term132486, term132486.getClass(), "value", term132487);
        setIntField(term132486, term132486.getClass(), "count", 0);
        setElement(term132482, 4, term132486);
        setElement(term132482, 5, term132484);
        setField(term132491, term132491.getClass(), "value", null);
        setIntField(term132491, term132491.getClass(), "count", 0);
        setElement(term132482, 6, term132491);
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
        args[0] = term130632;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term130632, term132482));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


