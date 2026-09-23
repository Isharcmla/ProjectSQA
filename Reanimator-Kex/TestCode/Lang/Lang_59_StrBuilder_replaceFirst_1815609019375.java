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

public class StrBuilder_replaceFirst_1815609019375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214515;
     Object term268685;
     Object term268679;

    public StrBuilder_replaceFirst_1815609019375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214515 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term214408 = (char[]) newCharArray(1);
        setIntField(term214515, term214515.getClass(), "size", 1);
        setField(term214515, term214515.getClass(), "buffer", term214408);
        term268685 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term268686 = (char[]) newCharArray(1);
        setField(term268685, term268685.getClass(), "buffer", term268686);
        setIntField(term268685, term268685.getClass(), "size", 1);
        setField(term268685, term268685.getClass(), "newLine", null);
        setField(term268685, term268685.getClass(), "nullText", null);
        term268679 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term268680 = (char[]) newCharArray(1);
        setField(term268679, term268679.getClass(), "buffer", term268680);
        setIntField(term268679, term268679.getClass(), "size", 1);
        setField(term268679, term268679.getClass(), "newLine", null);
        setField(term268679, term268679.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term214515, args);
        assertTrue(recursiveEquals(term214515, term268685));
        assertTrue(recursiveEquals(retValue, term268679));
    }

};


