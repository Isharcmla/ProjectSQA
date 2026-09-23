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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CollapseProperties_updateObjLitOrFunctionDeclaration_262807973131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74221;
     Object term74325;
     Object term74997;
     Object term74998;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_262807973131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74221 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term74325 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term74427 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term74529 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term74427, term74427.getClass(), "twin", term74529);
        setField(term74325, term74325.getClass(), "declaration", term74427);
        term74997 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term74997, term74997.getClass(), "compiler", null);
        setField(term74997, term74997.getClass(), "globalNames", null);
        setField(term74997, term74997.getClass(), "nameMap", null);
        setBooleanField(term74997, term74997.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term74997, term74997.getClass(), "inlineAliases", false);
        term74998 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term74999 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term75000 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term74998, term74998.getClass(), "name", null);
        setField(term74998, term74998.getClass(), "parent", null);
        setField(term74998, term74998.getClass(), "props", null);
        setField(term74999, term74999.getClass(), "node", null);
        setField(term74999, term74999.getClass(), "type", null);
        setField(term74999, term74999.getClass(), "sourceName", null);
        setField(term74999, term74999.getClass(), "scope", null);
        setField(term74999, term74999.getClass(), "module", null);
        setField(term75000, term75000.getClass(), "node", null);
        setField(term75000, term75000.getClass(), "type", null);
        setField(term75000, term75000.getClass(), "sourceName", null);
        setField(term75000, term75000.getClass(), "scope", null);
        setField(term75000, term75000.getClass(), "module", null);
        setField(term75000, term75000.getClass(), "twin", null);
        setField(term74999, term74999.getClass(), "twin", term75000);
        setField(term74998, term74998.getClass(), "declaration", term74999);
        setField(term74998, term74998.getClass(), "refs", null);
        setField(term74998, term74998.getClass(), "type", null);
        setBooleanField(term74998, term74998.getClass(), "isClassOrEnum", false);
        setBooleanField(term74998, term74998.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term74998, term74998.getClass(), "globalSets", 0);
        setIntField(term74998, term74998.getClass(), "localSets", 0);
        setIntField(term74998, term74998.getClass(), "aliasingGets", 0);
        setIntField(term74998, term74998.getClass(), "totalGets", 0);
        setIntField(term74998, term74998.getClass(), "callGets", 0);
        setBooleanField(term74998, term74998.getClass(), "inExterns", false);
        setField(term74998, term74998.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term74325;
        args[1] = null;
        callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term74221, args);
        assertTrue(recursiveEquals(term74221, term74997));
        assertTrue(recursiveEquals(term74325, term74998));
    }

};


