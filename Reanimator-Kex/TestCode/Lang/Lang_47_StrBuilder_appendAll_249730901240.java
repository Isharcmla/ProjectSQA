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
import java.lang.Object;

public class StrBuilder_appendAll_249730901240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6626;
     Object term6685;

    public StrBuilder_appendAll_249730901240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6626 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6627 = (char[]) newCharArray(32);
        setField(term6626, term6626.getClass(), "buffer", term6627);
        setIntField(term6626, term6626.getClass(), "size", 1114000454);
        setField(term6626, term6626.getClass(), "newLine", "hCWPJQKpdc");
        setField(term6626, term6626.getClass(), "nullText", "WzMEhMXkKx");
        term6685 = (Object[]) newArray("java.lang.Object", 2);
        Object term6686 = newInstance(Class.forName("java.lang.Object"));
        Object term6687 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6685, 0, term6686);
        setElement(term6685, 1, term6687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6685;
        try {
            callMethod(klass, "appendAll", argTypes, term6626, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


