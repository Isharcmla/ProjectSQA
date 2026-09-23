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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;
     Object term3453;
     Object term3480;

    public NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3389 = new HashMap();
        HashMap term3403 = new HashMap();
        HashMap term3420 = new HashMap();
        Set<Object> term16281 =  ((Map) term3420).keySet();
        HashSet term3419 = new HashSet((Collection<? extends Object>) term16281);
        ArrayList term3429 = new ArrayList();
        HashMap term3434 = new HashMap();
        Set<Object> term16282 =  ((Map) term3434).keySet();
        HashSet term3433 = new HashSet((Collection<? extends Object>) term16282);
        ArrayList term3439 = new ArrayList();
        ((ArrayList) term3439).add((Object)null);
        ((ArrayList) term3439).add((Object)null);
        ((ArrayList) term3439).add((Object)null);
        ((ArrayList) term3439).add((Object)null);
        ((ArrayList) term3439).add((Object)null);
        ((ArrayList) term3439).add((Object)null);
        HashMap term3443 = new HashMap();
        term3388 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3428 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3388, term3388.getClass(), "compiler", null);
        setField(term3388, term3388.getClass(), "allNames", term3389);
        setField(term3388, term3388.getClass(), "referenceGraph", null);
        setField(term3388, term3388.getClass(), "scopes", term3403);
        setBooleanField(term3388, term3388.getClass(), "removeUnreferenced", false);
        setField(term3388, term3388.getClass(), "globalNames", term3419);
        setField(term3428, term3428.getClass(), "listeners", term3429);
        setField(term3388, term3388.getClass(), "changeProxy", term3428);
        setField(term3388, term3388.getClass(), "externalNames", term3433);
        setField(term3388, term3388.getClass(), "refNodes", term3439);
        setField(term3388, term3388.getClass(), "aliases", term3443);
        term3453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3453, term3453.getClass(), "type", 1236004505);
        setIntField(term3455, term3455.getClass(), "type", 1050765721);
        setIntField(term3457, term3457.getClass(), "type", 474518942);
        setIntField(term3459, term3459.getClass(), "type", -1656687479);
        setIntField(term3461, term3461.getClass(), "type", -249614216);
        setField(term3461, term3461.getClass(), "next", null);
        setField(term3461, term3461.getClass(), "first", null);
        setField(term3461, term3461.getClass(), "last", null);
        setField(term3461, term3461.getClass(), "propListHead", null);
        setIntField(term3461, term3461.getClass(), "sourcePosition", 0);
        setField(term3461, term3461.getClass(), "jsType", null);
        setField(term3461, term3461.getClass(), "parent", null);
        setField(term3459, term3459.getClass(), "next", term3461);
        setIntField(term3464, term3464.getClass(), "type", 1870727665);
        setField(term3464, term3464.getClass(), "next", null);
        setField(term3464, term3464.getClass(), "first", null);
        setField(term3464, term3464.getClass(), "last", term3461);
        setField(term3464, term3464.getClass(), "propListHead", null);
        setIntField(term3464, term3464.getClass(), "sourcePosition", 0);
        setField(term3464, term3464.getClass(), "jsType", null);
        setField(term3464, term3464.getClass(), "parent", null);
        setField(term3459, term3459.getClass(), "first", term3464);
        setField(term3459, term3459.getClass(), "last", term3457);
        setField(term3459, term3459.getClass(), "propListHead", null);
        setIntField(term3459, term3459.getClass(), "sourcePosition", 0);
        setField(term3459, term3459.getClass(), "jsType", null);
        setField(term3459, term3459.getClass(), "parent", null);
        setField(term3457, term3457.getClass(), "next", term3459);
        setField(term3457, term3457.getClass(), "first", term3461);
        setIntField(term3468, term3468.getClass(), "type", -680920524);
        setIntField(term3470, term3470.getClass(), "type", -916335264);
        setField(term3470, term3470.getClass(), "next", null);
        setField(term3470, term3470.getClass(), "first", term3464);
        setField(term3470, term3470.getClass(), "last", term3459);
        setField(term3470, term3470.getClass(), "propListHead", null);
        setIntField(term3470, term3470.getClass(), "sourcePosition", 0);
        setField(term3470, term3470.getClass(), "jsType", null);
        setField(term3470, term3470.getClass(), "parent", null);
        setField(term3468, term3468.getClass(), "next", term3470);
        setField(term3468, term3468.getClass(), "first", term3455);
        setField(term3468, term3468.getClass(), "last", term3455);
        setField(term3468, term3468.getClass(), "propListHead", null);
        setIntField(term3468, term3468.getClass(), "sourcePosition", 0);
        setField(term3468, term3468.getClass(), "jsType", null);
        setField(term3468, term3468.getClass(), "parent", null);
        setField(term3457, term3457.getClass(), "last", term3468);
        setField(term3457, term3457.getClass(), "propListHead", null);
        setIntField(term3457, term3457.getClass(), "sourcePosition", 0);
        setField(term3457, term3457.getClass(), "jsType", null);
        setField(term3457, term3457.getClass(), "parent", null);
        setField(term3455, term3455.getClass(), "next", term3457);
        setIntField(term3475, term3475.getClass(), "type", -919416536);
        setField(term3475, term3475.getClass(), "next", term3468);
        setField(term3475, term3475.getClass(), "first", term3470);
        setField(term3475, term3475.getClass(), "last", term3453);
        setField(term3475, term3475.getClass(), "propListHead", null);
        setIntField(term3475, term3475.getClass(), "sourcePosition", 0);
        setField(term3475, term3475.getClass(), "jsType", null);
        setField(term3475, term3475.getClass(), "parent", null);
        setField(term3455, term3455.getClass(), "first", term3475);
        setField(term3455, term3455.getClass(), "last", term3475);
        setField(term3455, term3455.getClass(), "propListHead", null);
        setIntField(term3455, term3455.getClass(), "sourcePosition", 0);
        setField(term3455, term3455.getClass(), "jsType", null);
        setField(term3455, term3455.getClass(), "parent", null);
        setField(term3453, term3453.getClass(), "next", term3455);
        setField(term3453, term3453.getClass(), "first", term3459);
        setField(term3453, term3453.getClass(), "last", term3461);
        setField(term3453, term3453.getClass(), "propListHead", null);
        setIntField(term3453, term3453.getClass(), "sourcePosition", 0);
        setField(term3453, term3453.getClass(), "jsType", null);
        setField(term3453, term3453.getClass(), "parent", null);
        term3480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3480, term3480.getClass(), "type", -43417861);
        setIntField(term3482, term3482.getClass(), "type", -1533843432);
        setIntField(term3484, term3484.getClass(), "type", -123338791);
        setIntField(term3486, term3486.getClass(), "type", -1467089634);
        setIntField(term3488, term3488.getClass(), "type", 413548937);
        setField(term3488, term3488.getClass(), "next", null);
        setField(term3488, term3488.getClass(), "first", null);
        setField(term3488, term3488.getClass(), "last", null);
        setField(term3488, term3488.getClass(), "propListHead", null);
        setIntField(term3488, term3488.getClass(), "sourcePosition", 0);
        setField(term3488, term3488.getClass(), "jsType", null);
        setField(term3488, term3488.getClass(), "parent", null);
        setField(term3486, term3486.getClass(), "next", term3488);
        setIntField(term3491, term3491.getClass(), "type", 1901317214);
        setField(term3491, term3491.getClass(), "next", null);
        setField(term3491, term3491.getClass(), "first", null);
        setField(term3491, term3491.getClass(), "last", term3488);
        setField(term3491, term3491.getClass(), "propListHead", null);
        setIntField(term3491, term3491.getClass(), "sourcePosition", 0);
        setField(term3491, term3491.getClass(), "jsType", null);
        setField(term3491, term3491.getClass(), "parent", null);
        setField(term3486, term3486.getClass(), "first", term3491);
        setField(term3486, term3486.getClass(), "last", term3484);
        setField(term3486, term3486.getClass(), "propListHead", null);
        setIntField(term3486, term3486.getClass(), "sourcePosition", 0);
        setField(term3486, term3486.getClass(), "jsType", null);
        setField(term3486, term3486.getClass(), "parent", null);
        setField(term3484, term3484.getClass(), "next", term3486);
        setField(term3484, term3484.getClass(), "first", term3488);
        setIntField(term3495, term3495.getClass(), "type", -1070592289);
        setIntField(term3497, term3497.getClass(), "type", -1464172784);
        setField(term3497, term3497.getClass(), "next", null);
        setField(term3497, term3497.getClass(), "first", term3491);
        setField(term3497, term3497.getClass(), "last", term3486);
        setField(term3497, term3497.getClass(), "propListHead", null);
        setIntField(term3497, term3497.getClass(), "sourcePosition", 0);
        setField(term3497, term3497.getClass(), "jsType", null);
        setField(term3497, term3497.getClass(), "parent", null);
        setField(term3495, term3495.getClass(), "next", term3497);
        setField(term3495, term3495.getClass(), "first", term3482);
        setField(term3495, term3495.getClass(), "last", term3482);
        setField(term3495, term3495.getClass(), "propListHead", null);
        setIntField(term3495, term3495.getClass(), "sourcePosition", 0);
        setField(term3495, term3495.getClass(), "jsType", null);
        setField(term3495, term3495.getClass(), "parent", null);
        setField(term3484, term3484.getClass(), "last", term3495);
        setField(term3484, term3484.getClass(), "propListHead", null);
        setIntField(term3484, term3484.getClass(), "sourcePosition", 0);
        setField(term3484, term3484.getClass(), "jsType", null);
        setField(term3484, term3484.getClass(), "parent", null);
        setField(term3482, term3482.getClass(), "next", term3484);
        setIntField(term3502, term3502.getClass(), "type", 32185364);
        setField(term3502, term3502.getClass(), "next", term3495);
        setField(term3502, term3502.getClass(), "first", term3497);
        setField(term3502, term3502.getClass(), "last", term3480);
        setField(term3502, term3502.getClass(), "propListHead", null);
        setIntField(term3502, term3502.getClass(), "sourcePosition", 0);
        setField(term3502, term3502.getClass(), "jsType", null);
        setField(term3502, term3502.getClass(), "parent", null);
        setField(term3482, term3482.getClass(), "first", term3502);
        setField(term3482, term3482.getClass(), "last", term3502);
        setField(term3482, term3482.getClass(), "propListHead", null);
        setIntField(term3482, term3482.getClass(), "sourcePosition", 0);
        setField(term3482, term3482.getClass(), "jsType", null);
        setField(term3482, term3482.getClass(), "parent", null);
        setField(term3480, term3480.getClass(), "next", term3482);
        setField(term3480, term3480.getClass(), "first", term3486);
        setField(term3480, term3480.getClass(), "last", term3488);
        setField(term3480, term3480.getClass(), "propListHead", null);
        setIntField(term3480, term3480.getClass(), "sourcePosition", 0);
        setField(term3480, term3480.getClass(), "jsType", null);
        setField(term3480, term3480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3453;
        args[1] = term3480;
        try {
            callMethod(klass, "replaceTopLevelExpressionWithRhs", argTypes, term3388, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


