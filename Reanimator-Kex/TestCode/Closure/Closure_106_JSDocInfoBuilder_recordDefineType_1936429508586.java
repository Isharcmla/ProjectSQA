package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JSDocInfoBuilder_recordDefineType_1936429508586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207199;
     Object term207644;
     Object term207786;
     Object term207791;

    public JSDocInfoBuilder_recordDefineType_1936429508586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term207451 = new HashMap();
        term207199 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term207279 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term207403 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        term207644 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term207279, term207279.getClass(), "bitset", 0);
        setField(term207403, term207403.getClass(), "parameters", term207451);
        setField(term207403, term207403.getClass(), "baseType", null);
        setField(term207279, term207279.getClass(), "info", term207403);
        setField(term207279, term207279.getClass(), "thisType", term207644);
        setField(term207199, term207199.getClass(), "currentInfo", term207279);
        HashMap term207789 = new HashMap();
        term207786 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term207787 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term207788 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term207790 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term207788, term207788.getClass(), "baseType", null);
        setField(term207788, term207788.getClass(), "implementedInterfaces", null);
        setField(term207788, term207788.getClass(), "parameters", term207789);
        setField(term207788, term207788.getClass(), "thrownTypes", null);
        setField(term207788, term207788.getClass(), "templateTypeName", null);
        setField(term207788, term207788.getClass(), "description", null);
        setField(term207788, term207788.getClass(), "deprecated", null);
        setField(term207788, term207788.getClass(), "license", null);
        setField(term207788, term207788.getClass(), "suppressions", null);
        setField(term207787, term207787.getClass(), "info", term207788);
        setField(term207787, term207787.getClass(), "documentation", null);
        setField(term207787, term207787.getClass(), "sourceName", null);
        setField(term207787, term207787.getClass(), "visibility", null);
        setIntField(term207787, term207787.getClass(), "bitset", 0);
        setField(term207787, term207787.getClass(), "type", null);
        setField(term207790, term207790.getClass(), "root", null);
        setField(term207790, term207790.getClass(), "sourceName", null);
        setField(term207790, term207790.getClass(), "registry", null);
        setField(term207787, term207787.getClass(), "thisType", term207790);
        setBooleanField(term207787, term207787.getClass(), "includeDocumentation", false);
        setField(term207786, term207786.getClass(), "currentInfo", term207787);
        setBooleanField(term207786, term207786.getClass(), "populated", false);
        setBooleanField(term207786, term207786.getClass(), "parseDocumentation", false);
        setField(term207786, term207786.getClass(), "currentMarker", null);
        term207791 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term207791, term207791.getClass(), "root", null);
        setField(term207791, term207791.getClass(), "sourceName", null);
        setField(term207791, term207791.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term207644;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term207199, args);
        assertTrue(recursiveEquals(term207199, term207786));
        assertTrue(recursiveEquals(term207644, term207791));
        assertTrue(recursiveEquals(retValue, false));
    }

};


