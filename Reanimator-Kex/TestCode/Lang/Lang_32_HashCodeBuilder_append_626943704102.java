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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class HashCodeBuilder_append_626943704102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18433;
     Object term18031;

    public HashCodeBuilder_append_626943704102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18433 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term18433, term18433.getClass(), "iTotal", 0);
        setIntField(term18433, term18433.getClass(), "iConstant", 0);
        Class<? extends Object> term18481 = Class.forName((String) "java.util.concurrent.ForkJoinTask");
        term18031 = (Object[]) newArray("java.lang.Object", 6);
        Object term18463 = newInstance(Class.forName("java.nio.DirectLongBufferRU"));
        Object term18511 = newInstance(Class.forName("java.nio.DirectLongBufferRU"));
        Object term18590 = newInstance(Class.forName("java.nio.DirectLongBufferRU"));
        Object term18628 = newInstance(Class.forName("java.lang.Object"));
        setElement(term18031, 0, term18463);
        setElement(term18031, 1, term18481);
        setElement(term18031, 2, term18511);
        setElement(term18031, 3, "byte");
        setElement(term18031, 4, term18590);
        setElement(term18031, 5, term18628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18031;
        try {
            callMethod(klass, "append", argTypes, term18433, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


