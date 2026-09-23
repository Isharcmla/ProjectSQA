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

public class StringUtils_deleteWhitespace_1282652624473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7169;

    public StringUtils_deleteWhitespace_1282652624473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7169 = (byte[]) newByteArray(10);
        setByteElement(term7169, 0, (byte) 90);
        setByteElement(term7169, 1, (byte) 105);
        setByteElement(term7169, 2, (byte) 97);
        setByteElement(term7169, 3, (byte) 71);
        setByteElement(term7169, 4, (byte) 73);
        setByteElement(term7169, 5, (byte) 98);
        setByteElement(term7169, 6, (byte) 110);
        setByteElement(term7169, 7, (byte) 122);
        setByteElement(term7169, 8, (byte) 84);
        setByteElement(term7169, 9, (byte) 115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  ";
        Object retValue = callMethod(klass, "deleteWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term7169));
    }

};


