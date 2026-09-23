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

public class FastDateParser_escapeRegex_1067322472242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8737870;
     Object term8892281;
     Object term8892255;

    public FastDateParser_escapeRegex_1067322472242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8737870 = new StringBuilder();
        term8892281 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8892282 = (byte[]) newByteArray(16);
        setByteElement(term8892282, 0, (byte) 39);
        setByteElement(term8892282, 1, (byte) 39);
        setByteElement(term8892282, 2, (byte) 92);
        setByteElement(term8892282, 3, (byte) 124);
        setField(term8892281, term8892281.getClass(), "value", term8892282);
        setByteField(term8892281, term8892281.getClass(), "coder", (byte) 0);
        setIntField(term8892281, term8892281.getClass(), "count", 4);
        term8892255 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8892256 = (byte[]) newByteArray(16);
        setByteElement(term8892256, 0, (byte) 39);
        setByteElement(term8892256, 1, (byte) 39);
        setByteElement(term8892256, 2, (byte) 92);
        setByteElement(term8892256, 3, (byte) 124);
        setField(term8892255, term8892255.getClass(), "value", term8892256);
        setByteField(term8892255, term8892255.getClass(), "coder", (byte) 0);
        setIntField(term8892255, term8892255.getClass(), "count", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term8737870;
        args[1] = "\'\'|";
        args[2] = false;
        Object retValue = callMethod(klass, "escapeRegex", argTypes, null, args);
        assertTrue(recursiveEquals(term8737870, term8892281));
        assertTrue(recursiveEquals(retValue, term8892255));
    }

};


