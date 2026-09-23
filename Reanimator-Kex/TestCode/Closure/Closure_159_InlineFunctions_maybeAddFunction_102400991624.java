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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashSet;

public class InlineFunctions_maybeAddFunction_102400991624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term254;

    public InlineFunctions_maybeAddFunction_102400991624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term224 = new HashMap();
        HashMap term239 = new HashMap();
        term223 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term223, term223.getClass(), "fns", term224);
        setField(term223, term223.getClass(), "anonFns", term239);
        setField(term223, term223.getClass(), "compiler", null);
        setField(term223, term223.getClass(), "injector", null);
        setBooleanField(term223, term223.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term223, term223.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term223, term223.getClass(), "inlineLocalFunctions", false);
        setField(term223, term223.getClass(), "specializationState", null);
        HashSet term274 = new HashSet();
        HashSet term275 = new HashSet();
        Object term269 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term270 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term270, term270.getClass(), "name", null);
        setField(term270, term270.getClass(), "inputs", null);
        setField(term270, term270.getClass(), "deps", null);
        setIntField(term270, term270.getClass(), "depth", 335112684);
        setField(term269, term269.getClass(), "module", term270);
        setBooleanField(term269, term269.getClass(), "isExtern", true);
        setField(term269, term269.getClass(), "name", "");
        setField(term269, term269.getClass(), "ast", null);
        setField(term269, term269.getClass(), "provides", term274);
        setField(term269, term269.getClass(), "requires", term275);
        setBooleanField(term269, term269.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term269, term269.getClass(), "errorManager", null);
        setField(term269, term269.getClass(), "compiler", null);
        HashSet term282 = new HashSet();
        HashSet term283 = new HashSet();
        Object term277 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term278 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term278, term278.getClass(), "name", null);
        setField(term278, term278.getClass(), "inputs", null);
        setField(term278, term278.getClass(), "deps", null);
        setIntField(term278, term278.getClass(), "depth", 962840079);
        setField(term277, term277.getClass(), "module", term278);
        setBooleanField(term277, term277.getClass(), "isExtern", true);
        setField(term277, term277.getClass(), "name", "");
        setField(term277, term277.getClass(), "ast", null);
        setField(term277, term277.getClass(), "provides", term282);
        setField(term277, term277.getClass(), "requires", term283);
        setBooleanField(term277, term277.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term277, term277.getClass(), "errorManager", null);
        setField(term277, term277.getClass(), "compiler", null);
        ArrayList term267 = new ArrayList();
        ((ArrayList) term267).add(term269);
        ((ArrayList) term267).add(term277);
        ArrayList term287 = new ArrayList();
        ((ArrayList) term287).add(term278);
        ((ArrayList) term287).add(term278);
        ((ArrayList) term287).add(term270);
        term254 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term254, term254.getClass(), "name", "vrQLuWIDJX");
        setField(term254, term254.getClass(), "inputs", term267);
        setField(term254, term254.getClass(), "deps", term287);
        setIntField(term254, term254.getClass(), "depth", 1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term254;
        try {
            callMethod(klass, "maybeAddFunction", argTypes, term223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


