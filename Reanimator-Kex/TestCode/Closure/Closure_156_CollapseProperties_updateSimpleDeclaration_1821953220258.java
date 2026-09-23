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

public class CollapseProperties_updateSimpleDeclaration_1821953220258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140095;
     Object term140199;
     Object term140301;

    public CollapseProperties_updateSimpleDeclaration_1821953220258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140095 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term140199 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term140301 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term140371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140441, term140441.getClass(), "type", 105);
        setField(term140371, term140371.getClass(), "next", term140441);
        setField(term140511, term140511.getClass(), "parent", term140511);
        setField(term140371, term140371.getClass(), "parent", term140511);
        setField(term140301, term140301.getClass(), "node", term140371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term140199;
        args[2] = term140301;
        try {
            callMethod(klass, "updateSimpleDeclaration", argTypes, term140095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


