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

public class StrBuilder_append_1027807909342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68637;
     Object term68540;
     Object term150127;
     Object term150128;
     Object term150124;

    public StrBuilder_append_1027807909342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68637 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term68540 = (char[]) newCharArray(0);
        term150127 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150127, term150127.getClass(), "buffer", null);
        setIntField(term150127, term150127.getClass(), "size", 0);
        setField(term150127, term150127.getClass(), "newLine", null);
        setField(term150127, term150127.getClass(), "nullText", null);
        term150128 = (char[]) newCharArray(0);
        term150124 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150124, term150124.getClass(), "buffer", null);
        setIntField(term150124, term150124.getClass(), "size", 0);
        setField(term150124, term150124.getClass(), "newLine", null);
        setField(term150124, term150124.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term68540;
        Object retValue = callMethod(klass, "append", argTypes, term68637, args);
        assertTrue(recursiveEquals(term68637, term150127));
        assertTrue(recursiveEquals(term68540, term150128));
        assertTrue(recursiveEquals(retValue, term150124));
    }

};


