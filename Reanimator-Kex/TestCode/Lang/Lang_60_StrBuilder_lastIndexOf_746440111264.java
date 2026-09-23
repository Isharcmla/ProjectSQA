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
import java.lang.Integer;

public class StrBuilder_lastIndexOf_746440111264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11375;
     Object term11446;
     Object term81887;

    public StrBuilder_lastIndexOf_746440111264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11375 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11376 = (char[]) newCharArray(32);
        setField(term11375, term11375.getClass(), "buffer", term11376);
        setIntField(term11375, term11375.getClass(), "size", -243422082);
        setField(term11375, term11375.getClass(), "newLine", "CFyoseFGLF");
        setField(term11375, term11375.getClass(), "nullText", "SFqCrhEWLm");
        term11446 = new Integer(1384592638);
        term81887 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81888 = (char[]) newCharArray(32);
        setField(term81887, term81887.getClass(), "buffer", term81888);
        setIntField(term81887, term81887.getClass(), "size", -243422082);
        setField(term81887, term81887.getClass(), "newLine", "CFyoseFGLF");
        setField(term81887, term81887.getClass(), "nullText", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "GZdcJyZntS";
        args[1] = term11446;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term11375, args);
        assertTrue(recursiveEquals(term11375, term81887));
        assertTrue(recursiveEquals(term11446, 1384592638));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


