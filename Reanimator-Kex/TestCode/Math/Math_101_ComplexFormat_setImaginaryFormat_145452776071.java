package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ComplexFormat_setImaginaryFormat_145452776071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35294;

    public ComplexFormat_setImaginaryFormat_145452776071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35294 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        setField(term35294, term35294.getClass(), "imaginaryCharacter", null);
        setField(term35294, term35294.getClass(), "imaginaryFormat", null);
        setField(term35294, term35294.getClass(), "realFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.text.NumberFormat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImaginaryFormat", argTypes, term35294, args);
    }

};


