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
     Object term744;
     Object term748;

    public RemoveUnusedVars_markReferencedVar_55234026126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term744, term744.getClass(), "compiler", null);
        setField(term744, term744.getClass(), "codingConvention", null);
        setBooleanField(term744, term744.getClass(), "removeGlobals", false);
        setBooleanField(term744, term744.getClass(), "preserveFunctionExpressionNames", true);
        setField(term744, term744.getClass(), "referenced", null);
        setField(term744, term744.getClass(), "maybeUnreferenced", null);
        setField(term744, term744.getClass(), "allFunctionScopes", null);
        setField(term744, term744.getClass(), "assignsByVar", null);
        setField(term744, term744.getClass(), "assignsByNode", null);
        setField(term744, term744.getClass(), "classDefiningCalls", null);
        setField(term744, term744.getClass(), "continuations", null);
        setBooleanField(term744, term744.getClass(), "modifyCallSites", false);
        setField(term744, term744.getClass(), "callSiteOptimizer", null);
        term748 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term748, term748.getClass(), "name", "RkybSrpybU");
        setIntField(term761, term761.getClass(), "type", 282916351);
        setIntField(term763, term763.getClass(), "type", 880977281);
        setIntField(term765, term765.getClass(), "type", 371943306);
        setIntField(term767, term767.getClass(), "type", 982388293);
        setField(term767, term767.getClass(), "next", null);
        setField(term767, term767.getClass(), "first", null);
        setField(term767, term767.getClass(), "last", null);
        setField(term767, term767.getClass(), "propListHead", null);
        setIntField(term767, term767.getClass(), "sourcePosition", 0);
        setField(term767, term767.getClass(), "jsType", null);
        setField(term767, term767.getClass(), "parent", null);
        setField(term765, term765.getClass(), "next", term767);
        setIntField(term770, term770.getClass(), "type", -1747406163);
        setField(term770, term770.getClass(), "next", null);
        setField(term770, term770.getClass(), "first", term761);
        setField(term770, term770.getClass(), "last", null);
        setField(term770, term770.getClass(), "propListHead", null);
        setIntField(term770, term770.getClass(), "sourcePosition", 0);
        setField(term770, term770.getClass(), "jsType", null);
        setField(term770, term770.getClass(), "parent", null);
        setField(term765, term765.getClass(), "first", term770);
        setIntField(term773, term773.getClass(), "type", -75206835);
        setField(term773, term773.getClass(), "next", null);
        setField(term773, term773.getClass(), "first", term763);
        setField(term773, term773.getClass(), "last", null);
        setField(term773, term773.getClass(), "propListHead", null);
        setIntField(term773, term773.getClass(), "sourcePosition", 0);
        setField(term773, term773.getClass(), "jsType", null);
        setField(term773, term773.getClass(), "parent", null);
        setField(term765, term765.getClass(), "last", term773);
        setField(term765, term765.getClass(), "propListHead", null);
        setIntField(term765, term765.getClass(), "sourcePosition", 0);
        setField(term765, term765.getClass(), "jsType", null);
        setField(term765, term765.getClass(), "parent", null);
        setField(term763, term763.getClass(), "next", term765);
        setField(term763, term763.getClass(), "first", term765);
        setIntField(term777, term777.getClass(), "type", -159494544);
        setField(term777, term777.getClass(), "next", term773);
        setField(term777, term777.getClass(), "first", term770);
        setField(term777, term777.getClass(), "last", term770);
        setField(term777, term777.getClass(), "propListHead", null);
        setIntField(term777, term777.getClass(), "sourcePosition", 0);
        setField(term777, term777.getClass(), "jsType", null);
        setField(term777, term777.getClass(), "parent", null);
        setField(term763, term763.getClass(), "last", term777);
        setField(term763, term763.getClass(), "propListHead", null);
        setIntField(term763, term763.getClass(), "sourcePosition", 0);
        setField(term763, term763.getClass(), "jsType", null);
        setField(term763, term763.getClass(), "parent", null);
        setField(term761, term761.getClass(), "next", term763);
        setField(term761, term761.getClass(), "first", term770);
        setIntField(term781, term781.getClass(), "type", 0);
        setField(term781, term781.getClass(), "next", null);
        setField(term781, term781.getClass(), "first", null);
        setField(term781, term781.getClass(), "last", null);
        setField(term781, term781.getClass(), "propListHead", null);
        setIntField(term781, term781.getClass(), "sourcePosition", 0);
        setField(term781, term781.getClass(), "jsType", null);
        setField(term781, term781.getClass(), "parent", null);
        setField(term761, term761.getClass(), "last", term781);
        setField(term761, term761.getClass(), "propListHead", null);
        setIntField(term761, term761.getClass(), "sourcePosition", 0);
        setField(term761, term761.getClass(), "jsType", null);
        setField(term761, term761.getClass(), "parent", null);
        setField(term748, term748.getClass(), "nameNode", term761);
        setField(term748, term748.getClass(), "type", null);
        setBooleanField(term748, term748.getClass(), "typeInferred", false);
        setField(term748, term748.getClass(), "input", null);
        setIntField(term748, term748.getClass(), "index", 0);
        setField(term748, term748.getClass(), "scope", null);
        setBooleanField(term748, term748.getClass(), "markedEscaped", false);
        setBooleanField(term748, term748.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term748;
        try {
            callMethod(klass, "markReferencedVar", argTypes, term744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
