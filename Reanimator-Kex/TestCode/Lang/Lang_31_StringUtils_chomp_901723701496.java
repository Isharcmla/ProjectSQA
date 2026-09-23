package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class StringUtils_chomp_901723701496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425860;

    public StringUtils_chomp_901723701496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425860 = (byte[]) newByteArray(10);
        setByteElement(term425860, 0, (byte) 105);
        setByteElement(term425860, 1, (byte) 101);
        setByteElement(term425860, 2, (byte) 67);
        setByteElement(term425860, 3, (byte) 116);
        setByteElement(term425860, 4, (byte) 81);
        setByteElement(term425860, 5, (byte) 70);
        setByteElement(term425860, 6, (byte) 100);
        setByteElement(term425860, 7, (byte) 107);
        setByteElement(term425860, 8, (byte) 105);
        setByteElement(term425860, 9, (byte) 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "chomp", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, ""));
    }

};


