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
import java.lang.Integer;

public class StringUtils_abbreviate_2083402565486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194381;
     Object term194382;
     Object term228458;

    public StringUtils_abbreviate_2083402565486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194381 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term194382 = new Integer(0);
        term228458 = (byte[]) newByteArray(10);
        setByteElement(term228458, 0, (byte) 77);
        setByteElement(term228458, 1, (byte) 117);
        setByteElement(term228458, 2, (byte) 76);
        setByteElement(term228458, 3, (byte) 99);
        setByteElement(term228458, 4, (byte) 103);
        setByteElement(term228458, 5, (byte) 81);
        setByteElement(term228458, 6, (byte) 72);
        setByteElement(term228458, 7, (byte) 103);
        setByteElement(term228458, 8, (byte) 113);
        setByteElement(term228458, 9, (byte) 122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term194382;
        Object retValue = callMethod(klass, "abbreviate", argTypes, term194381, args);
        assertTrue(recursiveEquals(term194382, term228458));
        assertTrue(recursiveEquals(retValue, null));
    }

};


