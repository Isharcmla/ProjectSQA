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
import java.lang.Long;

public class HashCodeBuilder_append_69679802163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;
     Object term424;
     Object term5517;
     Object term5513;

    public HashCodeBuilder_append_69679802163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term421, term421.getClass(), "iConstant", 37);
        setIntField(term421, term421.getClass(), "iTotal", 17);
        term424 = new Long(2442117782898005296L);
        term5517 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5517, term5517.getClass(), "iConstant", 37);
        setIntField(term5517, term5517.getClass(), "iTotal", 1688793748);
        term5513 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5513, term5513.getClass(), "iConstant", 37);
        setIntField(term5513, term5513.getClass(), "iTotal", 1688793748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term424;
        Object retValue = callMethod(klass, "append", argTypes, term421, args);
        assertTrue(recursiveEquals(term421, term5517));
        assertTrue(recursiveEquals(term424, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, term5513));
    }

};


