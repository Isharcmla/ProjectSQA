package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.lang.StringBuilder;

public class FastDateParser_escapeRegex_1067322472256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9634305;
     Object term9926466;
     Object term9926430;

    public FastDateParser_escapeRegex_1067322472256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9634305 = new StringBuilder();
        term9926466 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9926467 = (byte[]) newByteArray(16);
        setByteElement(term9926467, 0, (byte) 39);
        setByteElement(term9926467, 1, (byte) 39);
        setByteElement(term9926467, 2, (byte) 39);
        setByteElement(term9926467, 3, (byte) 39);
        setByteElement(term9926467, 4, (byte) 92);
        setByteElement(term9926467, 5, (byte) 93);
        setByteElement(term9926467, 6, (byte) 39);
        setByteElement(term9926467, 7, (byte) 39);
        setByteElement(term9926467, 8, (byte) 39);
        setByteElement(term9926467, 9, (byte) 39);
        setByteElement(term9926467, 10, (byte) 39);
        setByteElement(term9926467, 11, (byte) 39);
        setByteElement(term9926467, 12, (byte) 39);
        setByteElement(term9926467, 13, (byte) 39);
        setField(term9926466, term9926466.getClass(), "value", term9926467);
        setByteField(term9926466, term9926466.getClass(), "coder", (byte) 0);
        setIntField(term9926466, term9926466.getClass(), "count", 14);
        term9926430 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9926431 = (byte[]) newByteArray(16);
        setByteElement(term9926431, 0, (byte) 39);
        setByteElement(term9926431, 1, (byte) 39);
        setByteElement(term9926431, 2, (byte) 39);
        setByteElement(term9926431, 3, (byte) 39);
        setByteElement(term9926431, 4, (byte) 92);
        setByteElement(term9926431, 5, (byte) 93);
        setByteElement(term9926431, 6, (byte) 39);
        setByteElement(term9926431, 7, (byte) 39);
        setByteElement(term9926431, 8, (byte) 39);
        setByteElement(term9926431, 9, (byte) 39);
        setByteElement(term9926431, 10, (byte) 39);
        setByteElement(term9926431, 11, (byte) 39);
        setByteElement(term9926431, 12, (byte) 39);
        setByteElement(term9926431, 13, (byte) 39);
        setField(term9926430, term9926430.getClass(), "value", term9926431);
        setByteField(term9926430, term9926430.getClass(), "coder", (byte) 0);
        setIntField(term9926430, term9926430.getClass(), "count", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term9634305;
        args[1] = "\'\'\'\']\'\'\'\'\'\'\'\'";
        args[2] = false;
        Object retValue = callMethod(klass, "escapeRegex", argTypes, null, args);
        assertTrue(recursiveEquals(term9634305, term9926466));
        assertTrue(recursiveEquals(retValue, term9926430));
    }

};


