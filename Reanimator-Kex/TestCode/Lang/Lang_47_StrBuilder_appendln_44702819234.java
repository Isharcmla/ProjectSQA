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
import java.lang.Long;

public class StrBuilder_appendln_44702819234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6287;
     Object term6346;

    public StrBuilder_appendln_44702819234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6287 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6288 = (char[]) newCharArray(32);
        setField(term6287, term6287.getClass(), "buffer", term6288);
        setIntField(term6287, term6287.getClass(), "size", 1090617576);
        setField(term6287, term6287.getClass(), "newLine", "MvRIxilFMJ");
        setField(term6287, term6287.getClass(), "nullText", "iNwOJRBEjp");
        term6346 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6346;
        try {
            callMethod(klass, "appendln", argTypes, term6287, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


