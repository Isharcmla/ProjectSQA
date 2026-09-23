package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.StringBuilder;

public class FunctionType_appendVarArgsString_1435184971580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558183;
     Object term558243;
     Object term558367;
     Object term558418;
     Object term558419;
     Object term558420;

    public FunctionType_appendVarArgsString_1435184971580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term558243 = new StringBuilder();
        term558367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term558418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term558418, term558418.getClass(), "call", null);
        setField(term558418, term558418.getClass(), "prototypeSlot", null);
        setField(term558418, term558418.getClass(), "kind", null);
        setField(term558418, term558418.getClass(), "propAccess", null);
        setField(term558418, term558418.getClass(), "typeOfThis", null);
        setField(term558418, term558418.getClass(), "source", null);
        setField(term558418, term558418.getClass(), "implementedInterfaces", null);
        setField(term558418, term558418.getClass(), "extendedInterfaces", null);
        setField(term558418, term558418.getClass(), "subTypes", null);
        setField(term558418, term558418.getClass(), "templateTypeNames", null);
        setField(term558418, term558418.getClass(), "className", null);
        setField(term558418, term558418.getClass(), "properties", null);
        setBooleanField(term558418, term558418.getClass(), "nativeType", false);
        setField(term558418, term558418.getClass(), "implicitPrototypeFallback", null);
        setField(term558418, term558418.getClass(), "ownerFunction", null);
        setBooleanField(term558418, term558418.getClass(), "prettyPrint", false);
        setBooleanField(term558418, term558418.getClass(), "visited", false);
        setField(term558418, term558418.getClass(), "docInfo", null);
        setBooleanField(term558418, term558418.getClass(), "unknown", false);
        setBooleanField(term558418, term558418.getClass(), "resolved", false);
        setField(term558418, term558418.getClass(), "resolveResult", null);
        setBooleanField(term558418, term558418.getClass(), "inTemplatedCheckVisit", false);
        setField(term558418, term558418.getClass(), "registry", null);
        term558419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term558419, term558419.getClass(), "typeExpr", null);
        setField(term558419, term558419.getClass(), "sourceName", null);
        setBooleanField(term558419, term558419.getClass(), "isChecked", false);
        setBooleanField(term558419, term558419.getClass(), "visited", false);
        setField(term558419, term558419.getClass(), "docInfo", null);
        setBooleanField(term558419, term558419.getClass(), "unknown", false);
        setBooleanField(term558419, term558419.getClass(), "resolved", false);
        setField(term558419, term558419.getClass(), "resolveResult", null);
        setBooleanField(term558419, term558419.getClass(), "inTemplatedCheckVisit", false);
        setField(term558419, term558419.getClass(), "registry", null);
        term558420 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term558421 = (byte[]) newByteArray(16);
        setByteElement(term558421, 0, (byte) 46);
        setByteElement(term558421, 1, (byte) 46);
        setByteElement(term558421, 2, (byte) 46);
        setByteElement(term558421, 3, (byte) 91);
        setByteElement(term558421, 4, (byte) 63);
        setByteElement(term558421, 5, (byte) 93);
        setField(term558420, term558420.getClass(), "value", term558421);
        setByteField(term558420, term558420.getClass(), "coder", (byte) 0);
        setIntField(term558420, term558420.getClass(), "count", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term558243;
        args[1] = term558367;
        args[2] = false;
        callMethod(klass, "appendVarArgsString", argTypes, term558183, args);
        assertTrue(recursiveEquals(term558183, term558418));
        assertTrue(recursiveEquals(term558243, term558419));
        assertTrue(recursiveEquals(term558367, false));
    }

};


