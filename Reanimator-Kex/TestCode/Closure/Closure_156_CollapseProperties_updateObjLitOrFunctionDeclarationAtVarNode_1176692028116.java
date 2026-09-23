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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_1176692028116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69332;
     Object term69436;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_1176692028116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69332 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term69436 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term69538 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term69436, term69436.getClass(), "declaration", term69538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = term69436;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtVarNode", argTypes, term69332, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


