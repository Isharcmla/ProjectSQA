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

public class StrBuilder_ensureCapacity_89262521353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51726;
     Object term103653;
     Object term103649;

    public StrBuilder_ensureCapacity_89262521353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51726 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term51630 = (char[]) newCharArray(0);
        setField(term51726, term51726.getClass(), "buffer", term51630);
        term103653 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term103654 = (char[]) newCharArray(0);
        setField(term103653, term103653.getClass(), "buffer", term103654);
        setIntField(term103653, term103653.getClass(), "size", 0);
        setField(term103653, term103653.getClass(), "newLine", null);
        setField(term103653, term103653.getClass(), "nullText", null);
        term103649 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term103650 = (char[]) newCharArray(0);
        setField(term103649, term103649.getClass(), "buffer", term103650);
        setIntField(term103649, term103649.getClass(), "size", 0);
        setField(term103649, term103649.getClass(), "newLine", null);
        setField(term103649, term103649.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "ensureCapacity", argTypes, term51726, args);
        assertTrue(recursiveEquals(term51726, term103653));
        assertTrue(recursiveEquals(retValue, term103649));
    }

};


