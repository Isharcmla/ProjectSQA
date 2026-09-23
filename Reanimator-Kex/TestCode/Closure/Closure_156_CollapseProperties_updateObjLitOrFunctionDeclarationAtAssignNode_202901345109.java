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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68142;
     Object term68246;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68142 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term68246 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term68348 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term68246, term68246.getClass(), "declaration", term68348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term68246;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term68142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


