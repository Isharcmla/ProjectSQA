package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;

public class HashCodeBuilder_append_69680000556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;
     Object term351;
     Object term5376;
     Object term5377;
     Object term5354;

    public HashCodeBuilder_append_69680000556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term348, term348.getClass(), "iConstant", 37);
        setIntField(term348, term348.getClass(), "iTotal", 17);
        term351 = (char[]) newCharArray(6);
        setCharElement(term351, 0, 'A');
        setCharElement(term351, 1, 'E');
        setCharElement(term351, 2, 'B');
        setCharElement(term351, 3, 't');
        setCharElement(term351, 4, 'n');
        setCharElement(term351, 5, 'Z');
        term5376 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5376, term5376.getClass(), "iConstant", 37);
        setIntField(term5376, term5376.getClass(), "iTotal", 1012889073);
        term5377 = (char[]) newCharArray(6);
        setCharElement(term5377, 0, 'A');
        setCharElement(term5377, 1, 'E');
        setCharElement(term5377, 2, 'B');
        setCharElement(term5377, 3, 't');
        setCharElement(term5377, 4, 'n');
        setCharElement(term5377, 5, 'Z');
        term5354 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5354, term5354.getClass(), "iConstant", 37);
        setIntField(term5354, term5354.getClass(), "iTotal", 1012889073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term351;
        Object retValue = callMethod(klass, "append", argTypes, term348, args);
        assertTrue(recursiveEquals(term348, term5376));
        assertTrue(recursiveEquals(term351, term5377));
        assertTrue(recursiveEquals(retValue, term5354));
    }

};


