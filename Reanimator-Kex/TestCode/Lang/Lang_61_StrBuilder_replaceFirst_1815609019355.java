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

public class StrBuilder_replaceFirst_1815609019355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134209;
     Object term150626;
     Object term150590;

    public StrBuilder_replaceFirst_1815609019355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134209 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term132875 = (char[]) newCharArray(31);
        setIntField(term134209, term134209.getClass(), "size", 31);
        setField(term134209, term134209.getClass(), "buffer", term132875);
        term150626 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term150627 = (char[]) newCharArray(31);
        setField(term150626, term150626.getClass(), "buffer", term150627);
        setIntField(term150626, term150626.getClass(), "size", 31);
        setField(term150626, term150626.getClass(), "newLine", null);
        setField(term150626, term150626.getClass(), "nullText", null);
        term150590 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term150591 = (char[]) newCharArray(31);
        setField(term150590, term150590.getClass(), "buffer", term150591);
        setIntField(term150590, term150590.getClass(), "size", 31);
        setField(term150590, term150590.getClass(), "newLine", null);
        setField(term150590, term150590.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term134209, args);
        assertTrue(recursiveEquals(term134209, term150626));
        assertTrue(recursiveEquals(retValue, term150590));
    }

};


