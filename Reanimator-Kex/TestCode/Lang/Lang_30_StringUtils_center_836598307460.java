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
import java.lang.Character;

public class StringUtils_center_836598307460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194348;
     Object term194349;
     Object term194351;
     Object term227078;

    public StringUtils_center_836598307460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194348 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term194349 = new Integer(0);
        term194351 = new Character((char) 0);
        term227078 = (byte[]) newByteArray(10);
        setByteElement(term227078, 0, (byte) 80);
        setByteElement(term227078, 1, (byte) 65);
        setByteElement(term227078, 2, (byte) 69);
        setByteElement(term227078, 3, (byte) 66);
        setByteElement(term227078, 4, (byte) 116);
        setByteElement(term227078, 5, (byte) 110);
        setByteElement(term227078, 6, (byte) 90);
        setByteElement(term227078, 7, (byte) 116);
        setByteElement(term227078, 8, (byte) 84);
        setByteElement(term227078, 9, (byte) 68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term194349;
        args[2] = term194351;
        Object retValue = callMethod(klass, "center", argTypes, term194348, args);
        assertTrue(recursiveEquals(term194349, term227078));
        assertTrue(recursiveEquals(term194351, (byte) 69));
        assertTrue(recursiveEquals(retValue, null));
    }

};


