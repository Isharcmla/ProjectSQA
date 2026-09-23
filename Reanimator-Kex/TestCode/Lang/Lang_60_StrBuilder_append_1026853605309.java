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

public class StrBuilder_append_1026853605309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52841;
     Object term51740;
     Object term95532;
     Object term95533;
     Object term94527;

    public StrBuilder_append_1026853605309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52841 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term51740 = (char[]) newCharArray(1000);
        term95532 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term95532, term95532.getClass(), "buffer", null);
        setIntField(term95532, term95532.getClass(), "size", 0);
        setField(term95532, term95532.getClass(), "newLine", null);
        setField(term95532, term95532.getClass(), "nullText", null);
        term95533 = (char[]) newCharArray(1000);
        term94527 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term94527, term94527.getClass(), "buffer", null);
        setIntField(term94527, term94527.getClass(), "size", 0);
        setField(term94527, term94527.getClass(), "newLine", null);
        setField(term94527, term94527.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term51740;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term52841, args);
        assertTrue(recursiveEquals(term52841, term95532));
        assertTrue(recursiveEquals(term51740, term95533));
        assertTrue(recursiveEquals(retValue, term94527));
    }

};


