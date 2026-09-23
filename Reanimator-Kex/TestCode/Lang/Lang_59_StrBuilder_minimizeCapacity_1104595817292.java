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

public class StrBuilder_minimizeCapacity_1104595817292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47563;
     Object term90544;
     Object term90540;

    public StrBuilder_minimizeCapacity_1104595817292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47563 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term47465 = (char[]) newCharArray(0);
        setField(term47563, term47563.getClass(), "buffer", term47465);
        setIntField(term47563, term47563.getClass(), "size", 0);
        term90544 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90545 = (char[]) newCharArray(0);
        setField(term90544, term90544.getClass(), "buffer", term90545);
        setIntField(term90544, term90544.getClass(), "size", 0);
        setField(term90544, term90544.getClass(), "newLine", null);
        setField(term90544, term90544.getClass(), "nullText", null);
        term90540 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90541 = (char[]) newCharArray(0);
        setField(term90540, term90540.getClass(), "buffer", term90541);
        setIntField(term90540, term90540.getClass(), "size", 0);
        setField(term90540, term90540.getClass(), "newLine", null);
        setField(term90540, term90540.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "minimizeCapacity", argTypes, term47563, args);
        assertTrue(recursiveEquals(term47563, term90544));
        assertTrue(recursiveEquals(retValue, term90540));
    }

};


