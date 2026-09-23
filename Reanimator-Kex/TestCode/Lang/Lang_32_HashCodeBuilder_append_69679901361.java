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

public class HashCodeBuilder_append_69679901361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;
     Object term401;
     Object term5469;
     Object term5465;

    public HashCodeBuilder_append_69679901361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term398, term398.getClass(), "iConstant", 37);
        setIntField(term398, term398.getClass(), "iTotal", 17);
        term401 = new Integer(1725571209);
        term5469 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5469, term5469.getClass(), "iConstant", 37);
        setIntField(term5469, term5469.getClass(), "iTotal", 1725571838);
        term5465 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5465, term5465.getClass(), "iConstant", 37);
        setIntField(term5465, term5465.getClass(), "iTotal", 1725571838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term401;
        Object retValue = callMethod(klass, "append", argTypes, term398, args);
        assertTrue(recursiveEquals(term398, term5469));
        assertTrue(recursiveEquals(term401, 1725571209));
        assertTrue(recursiveEquals(retValue, term5465));
    }

};


