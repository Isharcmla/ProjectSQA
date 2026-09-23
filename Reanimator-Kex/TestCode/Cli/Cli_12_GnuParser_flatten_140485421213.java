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

public class GnuParser_flatten_140485421213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5769;
     Object term5503;
     Object term6104;
     Object term6105;
     Object term6006;

    public GnuParser_flatten_140485421213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5769 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        term5503 = (Object[]) newArray("java.lang.String", 16);
        setElement(term5503, 0, "");
        setElement(term5503, 1, "");
        setElement(term5503, 2, "-");
        setElement(term5503, 3, "--");
        setElement(term5503, 4, "-");
        setElement(term5503, 5, "-");
        setElement(term5503, 6, "-");
        setElement(term5503, 7, "-");
        setElement(term5503, 8, "-");
        setElement(term5503, 9, "-");
        setElement(term5503, 10, "-");
        setElement(term5503, 11, "-");
        setElement(term5503, 12, "-");
        setElement(term5503, 13, "-");
        setElement(term5503, 14, "-");
        setElement(term5503, 15, "-");
        term6104 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        setField(term6104, term6104.getClass(), "cmd", null);
        setField(term6104, term6104.getClass(), "options", null);
        setField(term6104, term6104.getClass(), "requiredOptions", null);
        term6105 = (Object[]) newArray("java.lang.String", 16);
        setElement(term6105, 0, "");
        setElement(term6105, 1, "");
        setElement(term6105, 2, "-");
        setElement(term6105, 3, "--");
        setElement(term6105, 4, "-");
        setElement(term6105, 5, "-");
        setElement(term6105, 6, "-");
        setElement(term6105, 7, "-");
        setElement(term6105, 8, "-");
        setElement(term6105, 9, "-");
        setElement(term6105, 10, "-");
        setElement(term6105, 11, "-");
        setElement(term6105, 12, "-");
        setElement(term6105, 13, "-");
        setElement(term6105, 14, "-");
        setElement(term6105, 15, "-");
        term6006 = (Object[]) newArray("java.lang.String", 16);
        setElement(term6006, 0, "");
        setElement(term6006, 1, "");
        setElement(term6006, 2, "-");
        setElement(term6006, 3, "--");
        setElement(term6006, 4, "-");
        setElement(term6006, 5, "-");
        setElement(term6006, 6, "-");
        setElement(term6006, 7, "-");
        setElement(term6006, 8, "-");
        setElement(term6006, 9, "-");
        setElement(term6006, 10, "-");
        setElement(term6006, 11, "-");
        setElement(term6006, 12, "-");
        setElement(term6006, 13, "-");
        setElement(term6006, 14, "-");
        setElement(term6006, 15, "-");
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
        args[1] = term5503;
        args[2] = false;
        Object retValue = callMethod(klass, "flatten", argTypes, term5769, args);
        assertTrue(recursiveEquals(term5769, term6104));
        assertTrue(recursiveEquals(term5503, term6105));
        assertTrue(recursiveEquals(retValue, term6006));
    }

};


