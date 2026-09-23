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

public class StrBuilder_minimizeCapacity_1104595817296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49458;
     Object term88781;
     Object term88777;

    public StrBuilder_minimizeCapacity_1104595817296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49458 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term49360 = (char[]) newCharArray(0);
        setField(term49458, term49458.getClass(), "buffer", term49360);
        setIntField(term49458, term49458.getClass(), "size", 0);
        term88781 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88782 = (char[]) newCharArray(0);
        setField(term88781, term88781.getClass(), "buffer", term88782);
        setIntField(term88781, term88781.getClass(), "size", 0);
        setField(term88781, term88781.getClass(), "newLine", null);
        setField(term88781, term88781.getClass(), "nullText", null);
        term88777 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88778 = (char[]) newCharArray(0);
        setField(term88777, term88777.getClass(), "buffer", term88778);
        setIntField(term88777, term88777.getClass(), "size", 0);
        setField(term88777, term88777.getClass(), "newLine", null);
        setField(term88777, term88777.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "minimizeCapacity", argTypes, term49458, args);
        assertTrue(recursiveEquals(term49458, term88781));
        assertTrue(recursiveEquals(retValue, term88777));
    }

};


