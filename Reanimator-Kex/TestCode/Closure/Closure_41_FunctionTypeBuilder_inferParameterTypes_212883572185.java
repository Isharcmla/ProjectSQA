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
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57502;
     Object term57642;
     Object term57678;
     Object term57680;
     Object term57671;

    public FunctionTypeBuilder_inferParameterTypes_212883572185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57502 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57572, term57572.getClass(), "first", null);
        setIntField(term57572, term57572.getClass(), "type", 0);
        setField(term57572, term57572.getClass(), "parent", null);
        setIntField(term57572, term57572.getClass(), "sourcePosition", 0);
        setField(term57502, term57502.getClass(), "parametersNode", term57572);
        setField(term57502, term57502.getClass(), "typeRegistry", null);
        term57642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57642, term57642.getClass(), "first", null);
        term57678 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57678, term57678.getClass(), "fnName", null);
        setField(term57678, term57678.getClass(), "compiler", null);
        setField(term57678, term57678.getClass(), "codingConvention", null);
        setField(term57678, term57678.getClass(), "typeRegistry", null);
        setField(term57678, term57678.getClass(), "errorRoot", null);
        setField(term57678, term57678.getClass(), "sourceName", null);
        setField(term57678, term57678.getClass(), "scope", null);
        setField(term57678, term57678.getClass(), "contents", null);
        setField(term57678, term57678.getClass(), "returnType", null);
        setBooleanField(term57678, term57678.getClass(), "returnTypeInferred", false);
        setField(term57678, term57678.getClass(), "implementedInterfaces", null);
        setField(term57678, term57678.getClass(), "extendedInterfaces", null);
        setField(term57678, term57678.getClass(), "baseType", null);
        setField(term57678, term57678.getClass(), "thisType", null);
        setBooleanField(term57678, term57678.getClass(), "isConstructor", false);
        setBooleanField(term57678, term57678.getClass(), "isInterface", false);
        setIntField(term57679, term57679.getClass(), "type", 83);
        setField(term57679, term57679.getClass(), "next", null);
        setField(term57679, term57679.getClass(), "first", null);
        setField(term57679, term57679.getClass(), "last", null);
        setField(term57679, term57679.getClass(), "propListHead", null);
        setIntField(term57679, term57679.getClass(), "sourcePosition", -1);
        setField(term57679, term57679.getClass(), "jsType", null);
        setField(term57679, term57679.getClass(), "parent", null);
        setField(term57678, term57678.getClass(), "parametersNode", term57679);
        setField(term57678, term57678.getClass(), "templateTypeName", null);
        term57680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57680, term57680.getClass(), "type", 0);
        setField(term57680, term57680.getClass(), "next", null);
        setField(term57680, term57680.getClass(), "first", null);
        setField(term57680, term57680.getClass(), "last", null);
        setField(term57680, term57680.getClass(), "propListHead", null);
        setIntField(term57680, term57680.getClass(), "sourcePosition", 0);
        setField(term57680, term57680.getClass(), "jsType", null);
        setField(term57680, term57680.getClass(), "parent", null);
        term57671 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57671, term57671.getClass(), "fnName", null);
        setField(term57671, term57671.getClass(), "compiler", null);
        setField(term57671, term57671.getClass(), "codingConvention", null);
        setField(term57671, term57671.getClass(), "typeRegistry", null);
        setField(term57671, term57671.getClass(), "errorRoot", null);
        setField(term57671, term57671.getClass(), "sourceName", null);
        setField(term57671, term57671.getClass(), "scope", null);
        setField(term57671, term57671.getClass(), "contents", null);
        setField(term57671, term57671.getClass(), "returnType", null);
        setBooleanField(term57671, term57671.getClass(), "returnTypeInferred", false);
        setField(term57671, term57671.getClass(), "implementedInterfaces", null);
        setField(term57671, term57671.getClass(), "extendedInterfaces", null);
        setField(term57671, term57671.getClass(), "baseType", null);
        setField(term57671, term57671.getClass(), "thisType", null);
        setBooleanField(term57671, term57671.getClass(), "isConstructor", false);
        setBooleanField(term57671, term57671.getClass(), "isInterface", false);
        setIntField(term57675, term57675.getClass(), "type", 83);
        setField(term57675, term57675.getClass(), "next", null);
        setField(term57675, term57675.getClass(), "first", null);
        setField(term57675, term57675.getClass(), "last", null);
        setField(term57675, term57675.getClass(), "propListHead", null);
        setIntField(term57675, term57675.getClass(), "sourcePosition", -1);
        setField(term57675, term57675.getClass(), "jsType", null);
        setField(term57675, term57675.getClass(), "parent", null);
        setField(term57671, term57671.getClass(), "parametersNode", term57675);
        setField(term57671, term57671.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term57642;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term57502, args);
        assertTrue(recursiveEquals(term57502, term57678));
        assertTrue(recursiveEquals(term57642, term57680));
        assertTrue(recursiveEquals(retValue, term57671));
    }

};


