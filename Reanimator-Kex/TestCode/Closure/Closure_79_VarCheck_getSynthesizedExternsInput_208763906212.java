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

public class VarCheck_getSynthesizedExternsInput_208763906212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;
     Object term3464;
     Object term3403;

    public VarCheck_getSynthesizedExternsInput_208763906212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term493 = new ArrayList();
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        ArrayList term497 = new ArrayList();
        ((ArrayList) term497).add((Object)null);
        HashMap term516 = new HashMap();
        Set<Object> term3506 =  ((Map) term516).keySet();
        HashSet term515 = new HashSet((Collection<? extends Object>) term3506);
        HashMap term522 = new HashMap();
        Set<Object> term3507 =  ((Map) term522).keySet();
        HashSet term521 = new HashSet((Collection<? extends Object>) term3507);
        HashMap term533 = new HashMap();
        Set<Object> term3508 =  ((Map) term533).keySet();
        HashSet term532 = new HashSet((Collection<? extends Object>) term3508);
        term478 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term479 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term480 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        Object term529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term480, term480.getClass(), "name", "UfQtPRyWRC");
        setField(term480, term480.getClass(), "inputs", term493);
        setField(term480, term480.getClass(), "deps", term497);
        setIntField(term480, term480.getClass(), "depth", 1540719661);
        setField(term479, term479.getClass(), "module", term480);
        setBooleanField(term479, term479.getClass(), "isExtern", false);
        setField(term479, term479.getClass(), "name", "tRxZafjqIx");
        setField(term479, term479.getClass(), "ast", null);
        setField(term479, term479.getClass(), "provides", term515);
        setField(term479, term479.getClass(), "requires", term521);
        setBooleanField(term479, term479.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term479, term479.getClass(), "errorManager", null);
        setField(term479, term479.getClass(), "compiler", null);
        setField(term478, term478.getClass(), "synthesizedExternsInput", term479);
        setIntField(term529, term529.getClass(), "type", 0);
        setField(term529, term529.getClass(), "next", null);
        setField(term529, term529.getClass(), "first", null);
        setField(term529, term529.getClass(), "last", null);
        setField(term529, term529.getClass(), "propListHead", null);
        setIntField(term529, term529.getClass(), "sourcePosition", 0);
        setField(term529, term529.getClass(), "jsType", null);
        setField(term529, term529.getClass(), "parent", null);
        setField(term478, term478.getClass(), "synthesizedExternsRoot", term529);
        setField(term478, term478.getClass(), "varsToDeclareInExterns", term532);
        setField(term478, term478.getClass(), "compiler", null);
        setBooleanField(term478, term478.getClass(), "sanityCheck", false);
        setBooleanField(term478, term478.getClass(), "strictExternCheck", false);
        ArrayList term3469 = new ArrayList();
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        ArrayList term3471 = new ArrayList();
        ((ArrayList) term3471).add((Object)null);
        HashMap term3476 = new HashMap();
        Set<Object> term3557 =  ((Map) term3476).keySet();
        HashSet term3475 = new HashSet((Collection<? extends Object>) term3557);
        HashMap term3478 = new HashMap();
        Set<Object> term3571 =  ((Map) term3478).keySet();
        HashSet term3477 = new HashSet((Collection<? extends Object>) term3571);
        HashMap term3481 = new HashMap();
        Set<Object> term3580 =  ((Map) term3481).keySet();
        HashSet term3480 = new HashSet((Collection<? extends Object>) term3580);
        term3464 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term3465 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term3466 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        Object term3479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3466, term3466.getClass(), "name", "UfQtPRyWRC");
        setField(term3466, term3466.getClass(), "inputs", term3469);
        setField(term3466, term3466.getClass(), "deps", term3471);
        setIntField(term3466, term3466.getClass(), "depth", 1540719661);
        setField(term3465, term3465.getClass(), "module", term3466);
        setBooleanField(term3465, term3465.getClass(), "isExtern", false);
        setField(term3465, term3465.getClass(), "name", "tRxZafjqIx");
        setField(term3465, term3465.getClass(), "ast", null);
        setField(term3465, term3465.getClass(), "provides", term3475);
        setField(term3465, term3465.getClass(), "requires", term3477);
        setBooleanField(term3465, term3465.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term3465, term3465.getClass(), "errorManager", null);
        setField(term3465, term3465.getClass(), "compiler", null);
        setField(term3464, term3464.getClass(), "synthesizedExternsInput", term3465);
        setIntField(term3479, term3479.getClass(), "type", 0);
        setField(term3479, term3479.getClass(), "next", null);
        setField(term3479, term3479.getClass(), "first", null);
        setField(term3479, term3479.getClass(), "last", null);
        setField(term3479, term3479.getClass(), "propListHead", null);
        setIntField(term3479, term3479.getClass(), "sourcePosition", 0);
        setField(term3479, term3479.getClass(), "jsType", null);
        setField(term3479, term3479.getClass(), "parent", null);
        setField(term3464, term3464.getClass(), "synthesizedExternsRoot", term3479);
        setField(term3464, term3464.getClass(), "varsToDeclareInExterns", term3480);
        setField(term3464, term3464.getClass(), "compiler", null);
        setBooleanField(term3464, term3464.getClass(), "sanityCheck", false);
        setBooleanField(term3464, term3464.getClass(), "strictExternCheck", false);
        ArrayList term3417 = new ArrayList();
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ((ArrayList) term3417).add((Object)null);
        ArrayList term3421 = new ArrayList();
        ((ArrayList) term3421).add((Object)null);
        HashMap term3440 = new HashMap();
        Set<Object> term3610 =  ((Map) term3440).keySet();
        HashSet term3439 = new HashSet((Collection<? extends Object>) term3610);
        HashMap term3446 = new HashMap();
        Set<Object> term3611 =  ((Map) term3446).keySet();
        HashSet term3445 = new HashSet((Collection<? extends Object>) term3611);
        term3403 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term3404 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term3404, term3404.getClass(), "name", "UfQtPRyWRC");
        setField(term3404, term3404.getClass(), "inputs", term3417);
        setField(term3404, term3404.getClass(), "deps", term3421);
        setIntField(term3404, term3404.getClass(), "depth", 1540719661);
        setField(term3403, term3403.getClass(), "module", term3404);
        setBooleanField(term3403, term3403.getClass(), "isExtern", false);
        setField(term3403, term3403.getClass(), "name", "tRxZafjqIx");
        setField(term3403, term3403.getClass(), "ast", null);
        setField(term3403, term3403.getClass(), "provides", term3439);
        setField(term3403, term3403.getClass(), "requires", term3445);
        setBooleanField(term3403, term3403.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term3403, term3403.getClass(), "errorManager", null);
        setField(term3403, term3403.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSynthesizedExternsInput", argTypes, term478, args);
        assertTrue(recursiveEquals(term478, term3464));
        assertTrue(recursiveEquals(retValue, term3403));
    }

};


