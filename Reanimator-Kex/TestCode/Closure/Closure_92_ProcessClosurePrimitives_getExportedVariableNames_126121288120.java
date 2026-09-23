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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class ProcessClosurePrimitives_getExportedVariableNames_126121288120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;
     Object term7448;
     Object term7408;

    public ProcessClosurePrimitives_getExportedVariableNames_126121288120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term267 = new HashMap();
        Set<Object> term7463 =  ((Map) term267).keySet();
        HashSet term266 = new HashSet((Collection<? extends Object>) term7463);
        ArrayList term273 = new ArrayList();
        HashMap term277 = new HashMap();
        HashMap term282 = new HashMap();
        ArrayList term292 = new ArrayList();
        HashMap term297 = new HashMap();
        Set<Object> term7464 =  ((Map) term297).keySet();
        HashSet term296 = new HashSet((Collection<? extends Object>) term7464);
        Class<? extends Object> term7466 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term7465 = ((Class) term7466).getDeclaredField((String) "OFF");
        ((Field) term7465).setAccessible(true);
        Object enum18 = ((Field) term7465).get((Object) null);
        term264 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term265 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        setField(term264, term264.getClass(), "compiler", null);
        setField(term265, term265.getClass(), "modules", term266);
        setField(term265, term265.getClass(), "modulesByDepth", term273);
        setField(term265, term265.getClass(), "dependencyMap", term277);
        setField(term264, term264.getClass(), "moduleGraph", term265);
        setField(term264, term264.getClass(), "providedNames", term282);
        setField(term264, term264.getClass(), "unrecognizedRequires", term292);
        setField(term264, term264.getClass(), "exportedVariables", term296);
        setField(term264, term264.getClass(), "requiresLevel", enum18);
        setBooleanField(term264, term264.getClass(), "rewriteNewDateGoogNow", true);
        HashMap term7451 = new HashMap();
        Set<Object> term7676 =  ((Map) term7451).keySet();
        HashSet term7450 = new HashSet((Collection<? extends Object>) term7676);
        ArrayList term7452 = new ArrayList();
        HashMap term7454 = new HashMap();
        HashMap term7455 = new HashMap();
        ArrayList term7456 = new ArrayList();
        HashMap term7459 = new HashMap();
        Set<Object> term7677 =  ((Map) term7459).keySet();
        HashSet term7458 = new HashSet((Collection<? extends Object>) term7677);
        Class<? extends Object> term7679 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term7678 = ((Class) term7679).getDeclaredField((String) "OFF");
        ((Field) term7678).setAccessible(true);
        Object enum19 = ((Field) term7678).get((Object) null);
        term7448 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term7449 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        setField(term7448, term7448.getClass(), "compiler", null);
        setField(term7449, term7449.getClass(), "modules", term7450);
        setField(term7449, term7449.getClass(), "modulesByDepth", term7452);
        setField(term7449, term7449.getClass(), "dependencyMap", term7454);
        setField(term7448, term7448.getClass(), "moduleGraph", term7449);
        setField(term7448, term7448.getClass(), "providedNames", term7455);
        setField(term7448, term7448.getClass(), "unrecognizedRequires", term7456);
        setField(term7448, term7448.getClass(), "exportedVariables", term7458);
        setField(term7448, term7448.getClass(), "requiresLevel", enum19);
        setBooleanField(term7448, term7448.getClass(), "rewriteNewDateGoogNow", true);
        HashMap term7409 = new HashMap();
        Set<Object> term7889 =  ((Map) term7409).keySet();
        term7408 = new HashSet((Collection<? extends Object>) term7889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getExportedVariableNames", argTypes, term264, args);
        assertTrue(recursiveEquals(term264, term7448));
        assertTrue(recursiveEquals(retValue, term7408));
    }

};


