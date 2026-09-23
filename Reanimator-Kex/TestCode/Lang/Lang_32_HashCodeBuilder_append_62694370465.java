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

public class HashCodeBuilder_append_62694370465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;
     Object term435;
     Object term5537;
     Object term5538;
     Object term5533;

    public HashCodeBuilder_append_62694370465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term432, term432.getClass(), "iConstant", 37);
        setIntField(term432, term432.getClass(), "iTotal", 17);
        term435 = newInstance(Class.forName("java.lang.Object"));
        term5537 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5537, term5537.getClass(), "iConstant", 37);
        setIntField(term5537, term5537.getClass(), "iTotal", 1263094220);
        term5538 = newInstance(Class.forName("java.lang.Object"));
        term5533 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5533, term5533.getClass(), "iConstant", 37);
        setIntField(term5533, term5533.getClass(), "iTotal", 1263094220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term435;
        Object retValue = callMethod(klass, "append", argTypes, term432, args);
        assertTrue(recursiveEquals(term432, term5537));
        assertTrue(recursiveEquals(term435, term5538));
        assertTrue(recursiveEquals(retValue, term5533));
    }

};


