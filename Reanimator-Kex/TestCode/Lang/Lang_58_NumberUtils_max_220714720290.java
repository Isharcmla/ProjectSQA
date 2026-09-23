package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_max_220714720290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147775;
     Object term158121;

    public NumberUtils_max_220714720290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147775 = (byte[]) newByteArray(898);
        setByteElement(term147775, 181, (byte) -127);
        setByteElement(term147775, 389, (byte) -127);
        setByteElement(term147775, 423, (byte) 1);
        term158121 = (byte[]) newByteArray(898);
        setByteElement(term158121, 181, (byte) -127);
        setByteElement(term158121, 389, (byte) -127);
        setByteElement(term158121, 423, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term147775;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term147775, term158121));
    }

};


