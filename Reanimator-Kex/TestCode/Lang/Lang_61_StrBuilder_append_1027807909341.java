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

public class StrBuilder_append_1027807909341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71362;
     Object term122384;
     Object term122377;

    public StrBuilder_append_1027807909341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71362 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term71265 = (char[]) newCharArray(0);
        setIntField(term71362, term71362.getClass(), "size", 0);
        setField(term71362, term71362.getClass(), "buffer", term71265);
        term122384 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term122385 = (char[]) newCharArray(1);
        setField(term122384, term122384.getClass(), "buffer", term122385);
        setIntField(term122384, term122384.getClass(), "size", 1);
        setField(term122384, term122384.getClass(), "newLine", null);
        setField(term122384, term122384.getClass(), "nullText", null);
        term122377 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term122378 = (char[]) newCharArray(1);
        setField(term122377, term122377.getClass(), "buffer", term122378);
        setIntField(term122377, term122377.getClass(), "size", 1);
        setField(term122377, term122377.getClass(), "newLine", null);
        setField(term122377, term122377.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "append", argTypes, term71362, args);
        assertTrue(recursiveEquals(term71362, term122384));
        assertTrue(recursiveEquals(retValue, term122377));
    }

};


