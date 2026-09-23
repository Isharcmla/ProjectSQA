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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_toCharArray_665140223128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1746;

    public StrBuilder_toCharArray_665140223128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1746 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1747 = (char[]) newCharArray(32);
        setField(term1746, term1746.getClass(), "buffer", term1747);
        setIntField(term1746, term1746.getClass(), "size", -6029667);
        setField(term1746, term1746.getClass(), "newLine", "SbAoxhfrkn");
        setField(term1746, term1746.getClass(), "nullText", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toCharArray", argTypes, term1746, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


