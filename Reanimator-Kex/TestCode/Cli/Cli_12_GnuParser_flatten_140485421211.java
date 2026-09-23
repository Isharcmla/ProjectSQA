package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;

public class GnuParser_flatten_140485421211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5094;
     Object term4970;
     Object term5161;
     Object term5162;
     Object term5149;

    public GnuParser_flatten_140485421211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5094 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        term4970 = (Object[]) newArray("java.lang.String", 10);
        setElement(term4970, 0, "--");
        term5161 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        setField(term5161, term5161.getClass(), "cmd", null);
        setField(term5161, term5161.getClass(), "options", null);
        setField(term5161, term5161.getClass(), "requiredOptions", null);
        term5162 = (Object[]) newArray("java.lang.String", 10);
        setElement(term5162, 0, "--");
        term5149 = (Object[]) newArray("java.lang.String", 10);
        setElement(term5149, 0, "--");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.GnuParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4970;
        args[2] = false;
        Object retValue = callMethod(klass, "flatten", argTypes, term5094, args);
        assertTrue(recursiveEquals(term5094, term5161));
        assertTrue(recursiveEquals(term4970, term5162));
        assertTrue(recursiveEquals(retValue, term5149));
    }

};


