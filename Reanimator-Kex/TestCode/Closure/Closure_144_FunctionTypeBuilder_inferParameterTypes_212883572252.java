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
import java.lang.Object;
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_212883572252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116049;
     Object term116223;
     Object term116303;

    public FunctionTypeBuilder_inferParameterTypes_212883572252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116049 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term116153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term116049, term116049.getClass(), "typeRegistry", term116153);
        setField(term116049, term116049.getClass(), "templateTypeName", null);
        term116223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116223, term116223.getClass(), "first", null);
        HashMap term116475 = new HashMap();
        term116303 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term116427 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term116427, term116427.getClass(), "parameters", term116475);
        setField(term116303, term116303.getClass(), "info", term116427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term116223;
        args[1] = term116303;
        callMethod(klass, "inferParameterTypes", argTypes, term116049, args);
    }

};


