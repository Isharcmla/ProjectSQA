package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_append_817161130339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65066;
     Object term149362;
     Object term149342;

    public StrBuilder_append_817161130339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65066 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term64954 = (char[]) newCharArray(0);
        setIntField(term65066, term65066.getClass(), "size", 0);
        setField(term65066, term65066.getClass(), "buffer", term64954);
        term149362 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term149363 = (char[]) newCharArray(3);
        setCharElement(term149363, 0, (char) 48);
        setCharElement(term149363, 1, (char) 46);
        setCharElement(term149363, 2, (char) 48);
        setField(term149362, term149362.getClass(), "buffer", term149363);
        setIntField(term149362, term149362.getClass(), "size", 3);
        setField(term149362, term149362.getClass(), "newLine", null);
        setField(term149362, term149362.getClass(), "nullText", null);
        term149342 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term149343 = (char[]) newCharArray(3);
        setCharElement(term149343, 0, (char) 48);
        setCharElement(term149343, 1, (char) 46);
        setCharElement(term149343, 2, (char) 48);
        setField(term149342, term149342.getClass(), "buffer", term149343);
        setIntField(term149342, term149342.getClass(), "size", 3);
        setField(term149342, term149342.getClass(), "newLine", null);
        setField(term149342, term149342.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "append", argTypes, term65066, args);
        assertTrue(recursiveEquals(term65066, term149362));
        assertTrue(recursiveEquals(retValue, term149342));
    }

};


