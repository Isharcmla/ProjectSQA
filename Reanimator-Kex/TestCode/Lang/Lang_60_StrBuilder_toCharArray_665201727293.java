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

public class StrBuilder_toCharArray_665201727293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45810;
     Object term89535;
     Object term89534;

    public StrBuilder_toCharArray_665201727293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45810 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term89535 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89535, term89535.getClass(), "buffer", null);
        setIntField(term89535, term89535.getClass(), "size", 0);
        setField(term89535, term89535.getClass(), "newLine", null);
        setField(term89535, term89535.getClass(), "nullText", null);
        term89534 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        Object retValue = callMethod(klass, "toCharArray", argTypes, term45810, args);
        assertTrue(recursiveEquals(term45810, term89535));
        assertTrue(recursiveEquals(retValue, term89534));
    }

};


