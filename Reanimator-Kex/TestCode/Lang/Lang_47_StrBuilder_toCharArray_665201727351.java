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

public class StrBuilder_toCharArray_665201727351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51068;
     Object term103638;
     Object term103637;

    public StrBuilder_toCharArray_665201727351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51068 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term103638 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term103638, term103638.getClass(), "buffer", null);
        setIntField(term103638, term103638.getClass(), "size", 0);
        setField(term103638, term103638.getClass(), "newLine", null);
        setField(term103638, term103638.getClass(), "nullText", null);
        term103637 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        Object retValue = callMethod(klass, "toCharArray", argTypes, term51068, args);
        assertTrue(recursiveEquals(term51068, term103638));
        assertTrue(recursiveEquals(retValue, term103637));
    }

};


