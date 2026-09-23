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

public class FunctionTypeBuilder_inferParameterTypes_212883572261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120721;
     Object term120791;
     Object term120941;

    public FunctionTypeBuilder_inferParameterTypes_212883572261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120721 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term120721, term120721.getClass(), "typeRegistry", null);
        term120791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term120791, term120791.getClass(), "first", term120861);
        HashMap term121113 = new HashMap();
        term120941 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121065 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term121065, term121065.getClass(), "parameters", term121113);
        setField(term120941, term120941.getClass(), "info", term121065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term120791;
        args[1] = term120941;
        callMethod(klass, "inferParameterTypes", argTypes, term120721, args);
    }

};


