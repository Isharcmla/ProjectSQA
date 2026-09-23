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

public class StringUtils_replaceChars_748338513500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10806;

    public StringUtils_replaceChars_748338513500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10806 = (byte[]) newByteArray(10);
        setByteElement(term10806, 0, (byte) 115);
        setByteElement(term10806, 1, (byte) 119);
        setByteElement(term10806, 2, (byte) 90);
        setByteElement(term10806, 3, (byte) 86);
        setByteElement(term10806, 4, (byte) 101);
        setByteElement(term10806, 5, (byte) 74);
        setByteElement(term10806, 6, (byte) 65);
        setByteElement(term10806, 7, (byte) 120);
        setByteElement(term10806, 8, (byte) 106);
        setByteElement(term10806, 9, (byte) 116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "       ";
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        args[2] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        Object retValue = callMethod(klass, "replaceChars", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term10806));
    }

};


