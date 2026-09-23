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

public class StrBuilder_minimizeCapacity_1104595817143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961;

    public StrBuilder_minimizeCapacity_1104595817143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term961 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term962 = (char[]) newCharArray(32);
        setField(term961, term961.getClass(), "buffer", term962);
        setIntField(term961, term961.getClass(), "size", -522618178);
        setField(term961, term961.getClass(), "newLine", "pCTimMblYc");
        setField(term961, term961.getClass(), "nullText", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "minimizeCapacity", argTypes, term961, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


