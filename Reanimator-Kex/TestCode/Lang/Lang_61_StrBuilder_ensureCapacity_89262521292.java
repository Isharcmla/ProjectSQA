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

public class StrBuilder_ensureCapacity_89262521292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48524;
     Object term88374;
     Object term88370;

    public StrBuilder_ensureCapacity_89262521292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48524 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term48428 = (char[]) newCharArray(0);
        setField(term48524, term48524.getClass(), "buffer", term48428);
        term88374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88375 = (char[]) newCharArray(0);
        setField(term88374, term88374.getClass(), "buffer", term88375);
        setIntField(term88374, term88374.getClass(), "size", 0);
        setField(term88374, term88374.getClass(), "newLine", null);
        setField(term88374, term88374.getClass(), "nullText", null);
        term88370 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88371 = (char[]) newCharArray(0);
        setField(term88370, term88370.getClass(), "buffer", term88371);
        setIntField(term88370, term88370.getClass(), "size", 0);
        setField(term88370, term88370.getClass(), "newLine", null);
        setField(term88370, term88370.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "ensureCapacity", argTypes, term48524, args);
        assertTrue(recursiveEquals(term48524, term88374));
        assertTrue(recursiveEquals(retValue, term88370));
    }

};


