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

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144668;
     Object term144772;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144668 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term144772 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term144874 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term144944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144944, term144944.getClass(), "next", null);
        setField(term145014, term145014.getClass(), "parent", term145084);
        setField(term144944, term144944.getClass(), "parent", term145014);
        setField(term144874, term144874.getClass(), "node", term144944);
        setField(term144772, term144772.getClass(), "declaration", term144874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term144772;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term144668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


