package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeValidator_expectCanAssignTo_395910950128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30865;
     Object term30963;
     Object term30975;
     Object term30976;

    public TypeValidator_expectCanAssignTo_395910950128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30865 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term30963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term30975 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term30975, term30975.getClass(), "compiler", null);
        setField(term30975, term30975.getClass(), "typeRegistry", null);
        setField(term30975, term30975.getClass(), "allValueTypes", null);
        setBooleanField(term30975, term30975.getClass(), "shouldReport", false);
        setField(term30975, term30975.getClass(), "nullOrUndefined", null);
        setField(term30975, term30975.getClass(), "mismatches", null);
        term30976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term30976, term30976.getClass(), "isChecked", false);
        setBooleanField(term30976, term30976.getClass(), "visited", false);
        setField(term30976, term30976.getClass(), "docInfo", null);
        setBooleanField(term30976, term30976.getClass(), "unknown", false);
        setBooleanField(term30976, term30976.getClass(), "resolved", false);
        setField(term30976, term30976.getClass(), "resolveResult", null);
        setField(term30976, term30976.getClass(), "templateKeys", null);
        setField(term30976, term30976.getClass(), "templatizedTypes", null);
        setBooleanField(term30976, term30976.getClass(), "inTemplatedCheckVisit", false);
        setField(term30976, term30976.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term30963;
        args[3] = null;
        args[4] = null;
        Object retValue = callMethod(klass, "expectCanAssignTo", argTypes, term30865, args);
        assertTrue(recursiveEquals(term30865, term30975));
        assertTrue(recursiveEquals(term30963, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


