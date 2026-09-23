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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class StrBuilder_appendln_1800264236238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6513;
     Object term6572;

    public StrBuilder_appendln_1800264236238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6513 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6514 = (char[]) newCharArray(32);
        setField(term6513, term6513.getClass(), "buffer", term6514);
        setIntField(term6513, term6513.getClass(), "size", 1442160736);
        setField(term6513, term6513.getClass(), "newLine", "mXGCWJDOqA");
        setField(term6513, term6513.getClass(), "nullText", "dpNsDgfPso");
        term6572 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6572;
        try {
            callMethod(klass, "appendln", argTypes, term6513, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


