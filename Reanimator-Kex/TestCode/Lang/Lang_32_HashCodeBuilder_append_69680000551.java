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
import java.lang.Boolean;

public class HashCodeBuilder_append_69680000551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term318;
     Object term5296;
     Object term5292;

    public HashCodeBuilder_append_69680000551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term315, term315.getClass(), "iConstant", 37);
        setIntField(term315, term315.getClass(), "iTotal", 17);
        term318 = new Boolean(true);
        term5296 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5296, term5296.getClass(), "iConstant", 37);
        setIntField(term5296, term5296.getClass(), "iTotal", 629);
        term5292 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5292, term5292.getClass(), "iConstant", 37);
        setIntField(term5292, term5292.getClass(), "iTotal", 629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term318;
        Object retValue = callMethod(klass, "append", argTypes, term315, args);
        assertTrue(recursiveEquals(term315, term5296));
        assertTrue(recursiveEquals(term318, true));
        assertTrue(recursiveEquals(retValue, term5292));
    }

};


