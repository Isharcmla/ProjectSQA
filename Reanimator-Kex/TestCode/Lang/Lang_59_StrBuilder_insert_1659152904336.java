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

public class StrBuilder_insert_1659152904336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71199;
     Object term105967;
     Object term105958;

    public StrBuilder_insert_1659152904336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71199 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term71199, term71199.getClass(), "size", 0);
        term105967 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105967, term105967.getClass(), "buffer", null);
        setIntField(term105967, term105967.getClass(), "size", 0);
        setField(term105967, term105967.getClass(), "newLine", null);
        setField(term105967, term105967.getClass(), "nullText", null);
        term105958 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105958, term105958.getClass(), "buffer", null);
        setIntField(term105958, term105958.getClass(), "size", 0);
        setField(term105958, term105958.getClass(), "newLine", null);
        setField(term105958, term105958.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        Object retValue = callMethod(klass, "insert", argTypes, term71199, args);
        assertTrue(recursiveEquals(term71199, term105967));
        assertTrue(recursiveEquals(retValue, term105958));
    }

};


