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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class VarCheck_getSynthesizedExternsRoot_179464199313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object term3612;
     Object term3493;

    public VarCheck_getSynthesizedExternsRoot_179464199313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term589 = new ArrayList();
        ((ArrayList) term589).add((Object)null);
        ArrayList term593 = new ArrayList();
        HashMap term612 = new HashMap();
        Set<Object> term3650 =  ((Map) term612).keySet();
        HashSet term611 = new HashSet((Collection<? extends Object>) term3650);
        HashMap term619 = new HashMap();
        Set<Object> term3651 =  ((Map) term619).keySet();
        HashSet term618 = new HashSet((Collection<? extends Object>) term3651);
        HashMap term630 = new HashMap();
        Set<Object> term3652 =  ((Map) term630).keySet();
        HashSet term629 = new HashSet((Collection<? extends Object>) term3652);
        term574 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term575 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term576 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        Object term626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term576, term576.getClass(), "name", "vGiuZVPJNH");
        setField(term576, term576.getClass(), "inputs", term589);
        setField(term576, term576.getClass(), "deps", term593);
        setIntField(term576, term576.getClass(), "depth", -2027534003);
        setField(term575, term575.getClass(), "module", term576);
        setBooleanField(term575, term575.getClass(), "isExtern", true);
        setField(term575, term575.getClass(), "name", "iIRsCSYqXH");
        setField(term575, term575.getClass(), "ast", null);
        setField(term575, term575.getClass(), "provides", term611);
        setField(term575, term575.getClass(), "requires", term618);
        setBooleanField(term575, term575.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term575, term575.getClass(), "errorManager", null);
        setField(term575, term575.getClass(), "compiler", null);
        setField(term574, term574.getClass(), "synthesizedExternsInput", term575);
        setIntField(term626, term626.getClass(), "type", 0);
        setField(term626, term626.getClass(), "next", null);
        setField(term626, term626.getClass(), "first", null);
        setField(term626, term626.getClass(), "last", null);
        setField(term626, term626.getClass(), "propListHead", null);
        setIntField(term626, term626.getClass(), "sourcePosition", 0);
        setField(term626, term626.getClass(), "jsType", null);
        setField(term626, term626.getClass(), "parent", null);
        setField(term574, term574.getClass(), "synthesizedExternsRoot", term626);
        setField(term574, term574.getClass(), "varsToDeclareInExterns", term629);
        setField(term574, term574.getClass(), "compiler", null);
        setBooleanField(term574, term574.getClass(), "sanityCheck", false);
        setBooleanField(term574, term574.getClass(), "strictExternCheck", false);
        ArrayList term3617 = new ArrayList();
        ((ArrayList) term3617).add((Object)null);
        ArrayList term3619 = new ArrayList();
        HashMap term3624 = new HashMap();
        Set<Object> term3673 =  ((Map) term3624).keySet();
        HashSet term3623 = new HashSet((Collection<? extends Object>) term3673);
        HashMap term3626 = new HashMap();
        Set<Object> term3674 =  ((Map) term3626).keySet();
        HashSet term3625 = new HashSet((Collection<? extends Object>) term3674);
        HashMap term3629 = new HashMap();
        Set<Object> term3675 =  ((Map) term3629).keySet();
        HashSet term3628 = new HashSet((Collection<? extends Object>) term3675);
        term3612 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term3613 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term3614 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        Object term3627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3614, term3614.getClass(), "name", "vGiuZVPJNH");
        setField(term3614, term3614.getClass(), "inputs", term3617);
        setField(term3614, term3614.getClass(), "deps", term3619);
        setIntField(term3614, term3614.getClass(), "depth", -2027534003);
        setField(term3613, term3613.getClass(), "module", term3614);
        setBooleanField(term3613, term3613.getClass(), "isExtern", true);
        setField(term3613, term3613.getClass(), "name", "iIRsCSYqXH");
        setField(term3613, term3613.getClass(), "ast", null);
        setField(term3613, term3613.getClass(), "provides", term3623);
        setField(term3613, term3613.getClass(), "requires", term3625);
        setBooleanField(term3613, term3613.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term3613, term3613.getClass(), "errorManager", null);
        setField(term3613, term3613.getClass(), "compiler", null);
        setField(term3612, term3612.getClass(), "synthesizedExternsInput", term3613);
        setIntField(term3627, term3627.getClass(), "type", 0);
        setField(term3627, term3627.getClass(), "next", null);
        setField(term3627, term3627.getClass(), "first", null);
        setField(term3627, term3627.getClass(), "last", null);
        setField(term3627, term3627.getClass(), "propListHead", null);
        setIntField(term3627, term3627.getClass(), "sourcePosition", 0);
        setField(term3627, term3627.getClass(), "jsType", null);
        setField(term3627, term3627.getClass(), "parent", null);
        setField(term3612, term3612.getClass(), "synthesizedExternsRoot", term3627);
        setField(term3612, term3612.getClass(), "varsToDeclareInExterns", term3628);
        setField(term3612, term3612.getClass(), "compiler", null);
        setBooleanField(term3612, term3612.getClass(), "sanityCheck", false);
        setBooleanField(term3612, term3612.getClass(), "strictExternCheck", false);
        term3493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3493, term3493.getClass(), "type", 0);
        setField(term3493, term3493.getClass(), "next", null);
        setField(term3493, term3493.getClass(), "first", null);
        setField(term3493, term3493.getClass(), "last", null);
        setField(term3493, term3493.getClass(), "propListHead", null);
        setIntField(term3493, term3493.getClass(), "sourcePosition", 0);
        setField(term3493, term3493.getClass(), "jsType", null);
        setField(term3493, term3493.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSynthesizedExternsRoot", argTypes, term574, args);
        assertTrue(recursiveEquals(term574, term3612));
        assertTrue(recursiveEquals(retValue, term3493));
    }

};


