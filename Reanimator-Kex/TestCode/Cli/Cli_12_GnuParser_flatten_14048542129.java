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

public class GnuParser_flatten_14048542129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4758;
     Object term4619;
     Object term4862;
     Object term4863;
     Object term4846;

    public GnuParser_flatten_14048542129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4758 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        term4619 = (Object[]) newArray("java.lang.String", 2);
        setElement(term4619, 0, "-");
        setElement(term4619, 1, "-");
        term4862 = newInstance(Class.forName("org.apache.commons.cli.GnuParser"));
        setField(term4862, term4862.getClass(), "cmd", null);
        setField(term4862, term4862.getClass(), "options", null);
        setField(term4862, term4862.getClass(), "requiredOptions", null);
        term4863 = (Object[]) newArray("java.lang.String", 2);
        setElement(term4863, 0, "-");
        setElement(term4863, 1, "-");
        term4846 = (Object[]) newArray("java.lang.String", 2);
        setElement(term4846, 0, "-");
        setElement(term4846, 1, "-");
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
        args[1] = term4619;
        args[2] = false;
        Object retValue = callMethod(klass, "flatten", argTypes, term4758, args);
        assertTrue(recursiveEquals(term4758, term4862));
        assertTrue(recursiveEquals(term4619, term4863));
        assertTrue(recursiveEquals(retValue, term4846));
    }

};


