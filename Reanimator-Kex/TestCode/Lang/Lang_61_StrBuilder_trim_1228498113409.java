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

public class StrBuilder_trim_1228498113409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281902;
     Object term282335;
     Object term282296;

    public StrBuilder_trim_1228498113409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281902 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term281601 = (char[]) newCharArray(31);
        setIntField(term281902, term281902.getClass(), "size", 25);
        setField(term281902, term281902.getClass(), "buffer", term281601);
        term282335 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term282336 = (char[]) newCharArray(31);
        setField(term282335, term282335.getClass(), "buffer", term282336);
        setIntField(term282335, term282335.getClass(), "size", 0);
        setField(term282335, term282335.getClass(), "newLine", null);
        setField(term282335, term282335.getClass(), "nullText", null);
        term282296 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term282297 = (char[]) newCharArray(31);
        setField(term282296, term282296.getClass(), "buffer", term282297);
        setIntField(term282296, term282296.getClass(), "size", 0);
        setField(term282296, term282296.getClass(), "newLine", null);
        setField(term282296, term282296.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term281902, args);
        assertTrue(recursiveEquals(term281902, term282335));
        assertTrue(recursiveEquals(retValue, term282296));
    }

};


