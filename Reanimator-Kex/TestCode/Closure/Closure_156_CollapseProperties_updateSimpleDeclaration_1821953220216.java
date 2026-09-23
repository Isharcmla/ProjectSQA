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

public class CollapseProperties_updateSimpleDeclaration_1821953220216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119897;
     Object term119999;

    public CollapseProperties_updateSimpleDeclaration_1821953220216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119897 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term119999 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term120069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term120069, term120069.getClass(), "next", term120069);
        setField(term120139, term120139.getClass(), "parent", term120139);
        setField(term120069, term120069.getClass(), "parent", term120139);
        setIntField(term120069, term120069.getClass(), "type", 105);
        setField(term119999, term119999.getClass(), "node", term120069);
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
        args[1] = null;
        args[2] = term119999;
        try {
            callMethod(klass, "updateSimpleDeclaration", argTypes, term119897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


