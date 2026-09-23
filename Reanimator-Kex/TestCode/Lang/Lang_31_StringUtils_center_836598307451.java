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

public class StringUtils_center_836598307451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136974;
     Object term136975;
     Object term136977;
     Object term424041;

    public StringUtils_center_836598307451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136974 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term136975 = new Integer(0);
        term136977 = new Character((char) 0);
        term424041 = (byte[]) newByteArray(10);
        setByteElement(term424041, 0, (byte) 80);
        setByteElement(term424041, 1, (byte) 65);
        setByteElement(term424041, 2, (byte) 69);
        setByteElement(term424041, 3, (byte) 66);
        setByteElement(term424041, 4, (byte) 116);
        setByteElement(term424041, 5, (byte) 110);
        setByteElement(term424041, 6, (byte) 90);
        setByteElement(term424041, 7, (byte) 116);
        setByteElement(term424041, 8, (byte) 84);
        setByteElement(term424041, 9, (byte) 68);
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
        args[1] = term136975;
        args[2] = term136977;
        Object retValue = callMethod(klass, "center", argTypes, term136974, args);
        assertTrue(recursiveEquals(term136975, term424041));
        assertTrue(recursiveEquals(term136977, (byte) 69));
        assertTrue(recursiveEquals(retValue, null));
    }

};


