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

public class GnuParser_flatten_14048542125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;
     Object term649;
     Object term2636;
     Object term2637;
     Object term2078;

    public GnuParser_flatten_14048542125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1656 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        term649 = (Object[]) newArray("java.lang.String", 10);
        setElement(term649, 0, "");
        setElement(term649, 1, "                                                                                                                                                                                                                                                                ");
        setElement(term649, 2, "-");
        setElement(term649, 3, "");
        setElement(term649, 4, "");
        setElement(term649, 5, "");
        setElement(term649, 6, "");
        setElement(term649, 7, "");
        setElement(term649, 8, "");
        setElement(term649, 9, "");
        term2636 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        setField(term2636, term2636.getClass(), "cmd", null);
        setField(term2636, term2636.getClass(), "options", null);
        setField(term2636, term2636.getClass(), "requiredOptions", null);
        term2637 = (Object[]) newArray("java.lang.String", 10);
        setElement(term2637, 0, "");
        setElement(term2637, 1, "                                                                                                                                                                                                                                                                ");
        setElement(term2637, 2, "-");
        setElement(term2637, 3, "");
        setElement(term2637, 4, "");
        setElement(term2637, 5, "");
        setElement(term2637, 6, "");
        setElement(term2637, 7, "");
        setElement(term2637, 8, "");
        setElement(term2637, 9, "");
        term2078 = (Object[]) newArray("java.lang.String", 10);
        setElement(term2078, 0, "");
        setElement(term2078, 1, "                                                                                                                                                                                                                                                                ");
        setElement(term2078, 2, "-");
        setElement(term2078, 3, "");
        setElement(term2078, 4, "");
        setElement(term2078, 5, "");
        setElement(term2078, 6, "");
        setElement(term2078, 7, "");
        setElement(term2078, 8, "");
        setElement(term2078, 9, "");
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
        args[1] = term649;
        args[2] = false;
        Object retValue = callMethod(klass, "flatten", argTypes, term1656, args);
        assertTrue(recursiveEquals(term1656, term2636));
        assertTrue(recursiveEquals(term649, term2637));
        assertTrue(recursiveEquals(retValue, term2078));
    }

};


