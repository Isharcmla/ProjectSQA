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

public class StrBuilder_append_1026853605305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52074;
     Object term50973;
     Object term94134;
     Object term94135;
     Object term93129;

    public StrBuilder_append_1026853605305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52074 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term50973 = (char[]) newCharArray(1000);
        term94134 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term94134, term94134.getClass(), "buffer", null);
        setIntField(term94134, term94134.getClass(), "size", 0);
        setField(term94134, term94134.getClass(), "newLine", null);
        setField(term94134, term94134.getClass(), "nullText", null);
        term94135 = (char[]) newCharArray(1000);
        term93129 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93129, term93129.getClass(), "buffer", null);
        setIntField(term93129, term93129.getClass(), "size", 0);
        setField(term93129, term93129.getClass(), "newLine", null);
        setField(term93129, term93129.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term50973;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term52074, args);
        assertTrue(recursiveEquals(term52074, term94134));
        assertTrue(recursiveEquals(term50973, term94135));
        assertTrue(recursiveEquals(retValue, term93129));
    }

};


