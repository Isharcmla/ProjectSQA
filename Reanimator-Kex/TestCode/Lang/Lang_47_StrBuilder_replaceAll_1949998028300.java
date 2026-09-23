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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_replaceAll_1949998028300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10846;

    public StrBuilder_replaceAll_1949998028300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10846 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10847 = (char[]) newCharArray(32);
        setField(term10846, term10846.getClass(), "buffer", term10847);
        setIntField(term10846, term10846.getClass(), "size", 11724947);
        setField(term10846, term10846.getClass(), "newLine", "BjugTaMcxJ");
        setField(term10846, term10846.getClass(), "nullText", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "tlzpzIjMib";
        args[1] = "AZdLeSugwv";
        try {
            callMethod(klass, "replaceAll", argTypes, term10846, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


