package org.apache.commons.lang.text;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_replaceImpl_1664524742296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10338;
     Object term10397;
     Object term10399;
     Object term10401;
     Object term10415;

    public StrBuilder_replaceImpl_1664524742296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10338 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10339 = (char[]) newCharArray(32);
        setField(term10338, term10338.getClass(), "buffer", term10339);
        setIntField(term10338, term10338.getClass(), "size", 158873461);
        setField(term10338, term10338.getClass(), "newLine", "DhjNLmRMCu");
        setField(term10338, term10338.getClass(), "nullText", "PgPzMSEjjX");
        term10397 = new Integer(-430151637);
        term10399 = new Integer(-1697741339);
        term10401 = new Integer(98922530);
        term10415 = new Integer(-1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term10397;
        args[1] = term10399;
        args[2] = term10401;
        args[3] = "wzsPSPcRdj";
        args[4] = term10415;
        try {
            callMethod(klass, "replaceImpl", argTypes, term10338, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


