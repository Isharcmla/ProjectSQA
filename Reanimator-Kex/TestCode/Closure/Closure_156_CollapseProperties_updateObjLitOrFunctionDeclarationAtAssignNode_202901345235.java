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
import java.lang.String;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130594;
     Object term130698;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtAssignNode_202901345235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130594 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term133632 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term133631 = ((Class) term133632).getDeclaredField((String) "SET");
        ((Field) term133631).setAccessible(true);
        Object enum210 = ((Field) term133631).get((Object) null);
        term130698 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term130800 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term130870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term130940, term130940.getClass(), "type", 0);
        setField(term130870, term130870.getClass(), "next", term130940);
        setField(term131010, term131010.getClass(), "parent", null);
        setField(term130870, term130870.getClass(), "parent", term131010);
        setField(term130800, term130800.getClass(), "node", term130870);
        setField(term130698, term130698.getClass(), "declaration", term130800);
        setField(term130698, term130698.getClass(), "parent", null);
        setField(term130698, term130698.getClass(), "type", enum210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term130698;
        args[1] = null;
        try {
            callMethod(klass, "updateObjLitOrFunctionDeclarationAtAssignNode", argTypes, term130594, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


