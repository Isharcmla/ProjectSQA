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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_insert_1811406957345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80350;
     Object term122912;
     Object term122906;

    public StrBuilder_insert_1811406957345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80350 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term80350, term80350.getClass(), "size", 0);
        term122912 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term122912, term122912.getClass(), "buffer", null);
        setIntField(term122912, term122912.getClass(), "size", 0);
        setField(term122912, term122912.getClass(), "newLine", null);
        setField(term122912, term122912.getClass(), "nullText", null);
        term122906 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term122906, term122906.getClass(), "buffer", null);
        setIntField(term122906, term122906.getClass(), "size", 0);
        setField(term122906, term122906.getClass(), "newLine", null);
        setField(term122906, term122906.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        Object retValue = callMethod(klass, "insert", argTypes, term80350, args);
        assertTrue(recursiveEquals(term80350, term122912));
        assertTrue(recursiveEquals(retValue, term122906));
    }

};


