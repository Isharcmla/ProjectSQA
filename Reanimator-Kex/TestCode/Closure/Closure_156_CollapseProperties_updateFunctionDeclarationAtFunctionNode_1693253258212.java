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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CollapseProperties_updateFunctionDeclarationAtFunctionNode_1693253258212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116199;
     Object term116303;

    public CollapseProperties_updateFunctionDeclarationAtFunctionNode_1693253258212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116199 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term116303 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term116405 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term116475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116405, term116405.getClass(), "node", term116475);
        setField(term116303, term116303.getClass(), "declaration", term116405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        Object[] args = new Object[1];
        args[0] = term116303;
        try {
            callMethod(klass, "updateFunctionDeclarationAtFunctionNode", argTypes, term116199, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


