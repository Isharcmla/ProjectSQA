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

public class CheckAccessControls_getPropertyDeprecationInfo_16824769113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30112;
     Object term30120;

    public CheckAccessControls_getPropertyDeprecationInfo_16824769113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term30120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term30120, term30120.getClass(), "typeExpr", null);
        setField(term30120, term30120.getClass(), "sourceName", null);
        setBooleanField(term30120, term30120.getClass(), "isChecked", false);
        setBooleanField(term30120, term30120.getClass(), "visited", false);
        setField(term30120, term30120.getClass(), "docInfo", null);
        setBooleanField(term30120, term30120.getClass(), "unknown", false);
        setBooleanField(term30120, term30120.getClass(), "resolved", false);
        setField(term30120, term30120.getClass(), "resolveResult", null);
        setField(term30120, term30120.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term30112;
        args[1] = null;
        Object retValue = callMethod(klass, "getPropertyDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term30112, term30120));
        assertTrue(recursiveEquals(retValue, null));
    }

};


