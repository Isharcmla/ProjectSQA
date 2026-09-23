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

public class StrBuilder_ensureCapacity_89262521286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42723;
     Object term88131;
     Object term88127;

    public StrBuilder_ensureCapacity_89262521286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42723 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term42627 = (char[]) newCharArray(0);
        setField(term42723, term42723.getClass(), "buffer", term42627);
        term88131 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88132 = (char[]) newCharArray(0);
        setField(term88131, term88131.getClass(), "buffer", term88132);
        setIntField(term88131, term88131.getClass(), "size", 0);
        setField(term88131, term88131.getClass(), "newLine", null);
        setField(term88131, term88131.getClass(), "nullText", null);
        term88127 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88128 = (char[]) newCharArray(0);
        setField(term88127, term88127.getClass(), "buffer", term88128);
        setIntField(term88127, term88127.getClass(), "size", 0);
        setField(term88127, term88127.getClass(), "newLine", null);
        setField(term88127, term88127.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "ensureCapacity", argTypes, term42723, args);
        assertTrue(recursiveEquals(term42723, term88131));
        assertTrue(recursiveEquals(retValue, term88127));
    }

};


