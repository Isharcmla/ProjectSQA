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

public class StrBuilder_replaceFirst_1815609019421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290315;
     Object term290383;
     Object term290363;

    public StrBuilder_replaceFirst_1815609019421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290315 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term289861 = (char[]) newCharArray(15);
        setIntField(term290315, term290315.getClass(), "size", 15);
        setField(term290315, term290315.getClass(), "buffer", term289861);
        term290383 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term290384 = (char[]) newCharArray(15);
        setField(term290383, term290383.getClass(), "buffer", term290384);
        setIntField(term290383, term290383.getClass(), "size", 15);
        setField(term290383, term290383.getClass(), "newLine", null);
        setField(term290383, term290383.getClass(), "nullText", null);
        term290363 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term290364 = (char[]) newCharArray(15);
        setField(term290363, term290363.getClass(), "buffer", term290364);
        setIntField(term290363, term290363.getClass(), "size", 15);
        setField(term290363, term290363.getClass(), "newLine", null);
        setField(term290363, term290363.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term290315, args);
        assertTrue(recursiveEquals(term290315, term290383));
        assertTrue(recursiveEquals(retValue, term290363));
    }

};


