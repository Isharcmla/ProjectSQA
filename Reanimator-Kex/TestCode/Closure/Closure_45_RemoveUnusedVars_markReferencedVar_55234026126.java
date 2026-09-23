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

public class RemoveUnusedVars_markReferencedVar_55234026126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;
     Object term728;

    public RemoveUnusedVars_markReferencedVar_55234026126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term724, term724.getClass(), "compiler", null);
        setField(term724, term724.getClass(), "codingConvention", null);
        setBooleanField(term724, term724.getClass(), "removeGlobals", true);
        setBooleanField(term724, term724.getClass(), "preserveFunctionExpressionNames", true);
        setField(term724, term724.getClass(), "referenced", null);
        setField(term724, term724.getClass(), "maybeUnreferenced", null);
        setField(term724, term724.getClass(), "allFunctionScopes", null);
        setField(term724, term724.getClass(), "assignsByVar", null);
        setField(term724, term724.getClass(), "assignsByNode", null);
        setField(term724, term724.getClass(), "inheritsCalls", null);
        setField(term724, term724.getClass(), "continuations", null);
        setBooleanField(term724, term724.getClass(), "modifyCallSites", false);
        setField(term724, term724.getClass(), "callSiteOptimizer", null);
        term728 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728, term728.getClass(), "name", "RkybSrpybU");
        setIntField(term741, term741.getClass(), "type", 282916351);
        setIntField(term743, term743.getClass(), "type", 880977281);
        setIntField(term745, term745.getClass(), "type", 371943306);
        setIntField(term747, term747.getClass(), "type", 982388293);
        setField(term747, term747.getClass(), "next", null);
        setField(term747, term747.getClass(), "first", null);
        setField(term747, term747.getClass(), "last", null);
        setField(term747, term747.getClass(), "propListHead", null);
        setIntField(term747, term747.getClass(), "sourcePosition", 0);
        setField(term747, term747.getClass(), "jsType", null);
        setField(term747, term747.getClass(), "parent", null);
        setField(term745, term745.getClass(), "next", term747);
        setIntField(term750, term750.getClass(), "type", -1747406163);
        setField(term750, term750.getClass(), "next", null);
        setField(term750, term750.getClass(), "first", term741);
        setField(term750, term750.getClass(), "last", null);
        setField(term750, term750.getClass(), "propListHead", null);
        setIntField(term750, term750.getClass(), "sourcePosition", 0);
        setField(term750, term750.getClass(), "jsType", null);
        setField(term750, term750.getClass(), "parent", null);
        setField(term745, term745.getClass(), "first", term750);
        setIntField(term753, term753.getClass(), "type", -75206835);
        setField(term753, term753.getClass(), "next", null);
        setField(term753, term753.getClass(), "first", term743);
        setField(term753, term753.getClass(), "last", null);
        setField(term753, term753.getClass(), "propListHead", null);
        setIntField(term753, term753.getClass(), "sourcePosition", 0);
        setField(term753, term753.getClass(), "jsType", null);
        setField(term753, term753.getClass(), "parent", null);
        setField(term745, term745.getClass(), "last", term753);
        setField(term745, term745.getClass(), "propListHead", null);
        setIntField(term745, term745.getClass(), "sourcePosition", 0);
        setField(term745, term745.getClass(), "jsType", null);
        setField(term745, term745.getClass(), "parent", null);
        setField(term743, term743.getClass(), "next", term745);
        setField(term743, term743.getClass(), "first", term745);
        setIntField(term757, term757.getClass(), "type", -159494544);
        setField(term757, term757.getClass(), "next", term753);
        setField(term757, term757.getClass(), "first", term750);
        setField(term757, term757.getClass(), "last", term750);
        setField(term757, term757.getClass(), "propListHead", null);
        setIntField(term757, term757.getClass(), "sourcePosition", 0);
        setField(term757, term757.getClass(), "jsType", null);
        setField(term757, term757.getClass(), "parent", null);
        setField(term743, term743.getClass(), "last", term757);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term741, term741.getClass(), "next", term743);
        setField(term741, term741.getClass(), "first", term750);
        setIntField(term761, term761.getClass(), "type", 0);
        setField(term761, term761.getClass(), "next", null);
        setField(term761, term761.getClass(), "first", null);
        setField(term761, term761.getClass(), "last", null);
        setField(term761, term761.getClass(), "propListHead", null);
        setIntField(term761, term761.getClass(), "sourcePosition", 0);
        setField(term761, term761.getClass(), "jsType", null);
        setField(term761, term761.getClass(), "parent", null);
        setField(term741, term741.getClass(), "last", term761);
        setField(term741, term741.getClass(), "propListHead", null);
        setIntField(term741, term741.getClass(), "sourcePosition", 0);
        setField(term741, term741.getClass(), "jsType", null);
        setField(term741, term741.getClass(), "parent", null);
        setField(term728, term728.getClass(), "nameNode", term741);
        setField(term728, term728.getClass(), "type", null);
        setField(term728, term728.getClass(), "info", null);
        setBooleanField(term728, term728.getClass(), "typeInferred", false);
        setField(term728, term728.getClass(), "input", null);
        setBooleanField(term728, term728.getClass(), "isDefine", false);
        setIntField(term728, term728.getClass(), "index", 0);
        setField(term728, term728.getClass(), "scope", null);
        setBooleanField(term728, term728.getClass(), "markedEscaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term728;
        try {
            callMethod(klass, "markReferencedVar", argTypes, term724, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


