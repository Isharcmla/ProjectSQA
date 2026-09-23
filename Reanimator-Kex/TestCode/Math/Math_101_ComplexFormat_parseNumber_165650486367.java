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
import java.lang.Double;

public class ComplexFormat_parseNumber_165650486367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35288;
     Object term35289;

    public ComplexFormat_parseNumber_165650486367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35288 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        setField(term35288, term35288.getClass(), "imaginaryCharacter", null);
        setField(term35288, term35288.getClass(), "imaginaryFormat", null);
        setField(term35288, term35288.getClass(), "realFormat", null);
        term35289 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term35289;
        args[2] = null;
        callMethod(klass, "parseNumber", argTypes, term35288, args);
    }

};


