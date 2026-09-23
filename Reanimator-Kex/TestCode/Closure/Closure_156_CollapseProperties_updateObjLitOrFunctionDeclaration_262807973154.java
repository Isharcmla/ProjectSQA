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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_262807973154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84482;
     Object term84586;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_262807973154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84482 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term84586 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term84688 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term84758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84688, term84688.getClass(), "twin", null);
        setField(term84688, term84688.getClass(), "node", term84758);
        setField(term84586, term84586.getClass(), "declaration", term84688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term84586;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term84482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


