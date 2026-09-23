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
import java.lang.Integer;

public class HashCodeBuilder_appendSuper_28437414669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term468;
     Object term5625;
     Object term5621;

    public HashCodeBuilder_appendSuper_28437414669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term465, term465.getClass(), "iConstant", 37);
        setIntField(term465, term465.getClass(), "iTotal", 17);
        term468 = new Integer(1622346318);
        term5625 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5625, term5625.getClass(), "iConstant", 37);
        setIntField(term5625, term5625.getClass(), "iTotal", 1622346947);
        term5621 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5621, term5621.getClass(), "iConstant", 37);
        setIntField(term5621, term5621.getClass(), "iTotal", 1622346947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term468;
        Object retValue = callMethod(klass, "appendSuper", argTypes, term465, args);
        assertTrue(recursiveEquals(term465, term5625));
        assertTrue(recursiveEquals(term468, 1622346318));
        assertTrue(recursiveEquals(retValue, term5621));
    }

};


