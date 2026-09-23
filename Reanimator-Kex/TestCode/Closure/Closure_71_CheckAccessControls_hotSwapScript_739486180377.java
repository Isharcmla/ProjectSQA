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

public class CheckAccessControls_hotSwapScript_739486180377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117535;
     Object term117685;
     Object term193959;
     Object term193961;

    public CheckAccessControls_hotSwapScript_739486180377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117535 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term117615 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term117535, term117535.getClass(), "compiler", term117615);
        term117685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term117685, term117685.getClass(), "type", 0);
        setField(term117755, term117755.getClass(), "next", term117825);
        setIntField(term117755, term117755.getClass(), "type", 30);
        setField(term117755, term117755.getClass(), "first", null);
        setField(term117755, term117755.getClass(), "jsType", term117925);
        setField(term117685, term117685.getClass(), "first", term117755);
        term193959 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term193960 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term193960, term193960.getClass(), "options", null);
        setField(term193960, term193960.getClass(), "passes", null);
        setField(term193960, term193960.getClass(), "externs", null);
        setField(term193960, term193960.getClass(), "modules", null);
        setField(term193960, term193960.getClass(), "moduleGraph", null);
        setField(term193960, term193960.getClass(), "inputs", null);
        setField(term193960, term193960.getClass(), "errorManager", null);
        setField(term193960, term193960.getClass(), "warningsGuard", null);
        setField(term193960, term193960.getClass(), "externsRoot", null);
        setField(term193960, term193960.getClass(), "jsRoot", null);
        setField(term193960, term193960.getClass(), "externAndJsRoot", null);
        setField(term193960, term193960.getClass(), "inputsByName", null);
        setField(term193960, term193960.getClass(), "sourceMap", null);
        setField(term193960, term193960.getClass(), "externExports", null);
        setIntField(term193960, term193960.getClass(), "uniqueNameId", 0);
        setBooleanField(term193960, term193960.getClass(), "useThreads", false);
        setBooleanField(term193960, term193960.getClass(), "hasRegExpGlobalReferences", false);
        setField(term193960, term193960.getClass(), "functionInformationMap", null);
        setField(term193960, term193960.getClass(), "debugLog", null);
        setField(term193960, term193960.getClass(), "defaultCodingConvention", null);
        setField(term193960, term193960.getClass(), "typeRegistry", null);
        setField(term193960, term193960.getClass(), "parserConfig", null);
        setField(term193960, term193960.getClass(), "abstractInterpreter", null);
        setField(term193960, term193960.getClass(), "typeValidator", null);
        setField(term193960, term193960.getClass(), "tracker", null);
        setField(term193960, term193960.getClass(), "oldErrorReporter", null);
        setField(term193960, term193960.getClass(), "defaultErrorReporter", null);
        setField(term193960, term193960.getClass(), "outStream", null);
        setField(term193960, term193960.getClass(), "sanityCheck", null);
        setField(term193960, term193960.getClass(), "currentTracer", null);
        setField(term193960, term193960.getClass(), "currentPassName", null);
        setField(term193960, term193960.getClass(), "recentChange", null);
        setField(term193960, term193960.getClass(), "codeChangeHandlers", null);
        setField(term193960, term193960.getClass(), "stage", null);
        setField(term193959, term193959.getClass(), "compiler", term193960);
        setField(term193959, term193959.getClass(), "validator", null);
        setIntField(term193959, term193959.getClass(), "deprecatedDepth", 0);
        setIntField(term193959, term193959.getClass(), "methodDepth", 0);
        setField(term193959, term193959.getClass(), "currentClass", null);
        setField(term193959, term193959.getClass(), "initializedConstantProperties", null);
        term193961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term193961, term193961.getClass(), "type", 0);
        setField(term193961, term193961.getClass(), "next", null);
        setIntField(term193962, term193962.getClass(), "type", 30);
        setIntField(term193963, term193963.getClass(), "type", 0);
        setField(term193963, term193963.getClass(), "next", null);
        setField(term193963, term193963.getClass(), "first", null);
        setField(term193963, term193963.getClass(), "last", null);
        setField(term193963, term193963.getClass(), "propListHead", null);
        setIntField(term193963, term193963.getClass(), "sourcePosition", 0);
        setField(term193963, term193963.getClass(), "jsType", null);
        setField(term193963, term193963.getClass(), "parent", null);
        setField(term193962, term193962.getClass(), "next", term193963);
        setField(term193962, term193962.getClass(), "first", null);
        setField(term193962, term193962.getClass(), "last", null);
        setField(term193962, term193962.getClass(), "propListHead", null);
        setIntField(term193962, term193962.getClass(), "sourcePosition", 0);
        setField(term193964, term193964.getClass(), "call", null);
        setField(term193964, term193964.getClass(), "prototype", null);
        setField(term193964, term193964.getClass(), "kind", null);
        setField(term193964, term193964.getClass(), "typeOfThis", null);
        setField(term193964, term193964.getClass(), "source", null);
        setField(term193964, term193964.getClass(), "implementedInterfaces", null);
        setField(term193964, term193964.getClass(), "subTypes", null);
        setField(term193964, term193964.getClass(), "templateTypeName", null);
        setField(term193964, term193964.getClass(), "className", null);
        setField(term193964, term193964.getClass(), "properties", null);
        setBooleanField(term193964, term193964.getClass(), "nativeType", false);
        setField(term193964, term193964.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term193964, term193964.getClass(), "prettyPrint", false);
        setBooleanField(term193964, term193964.getClass(), "visited", false);
        setField(term193964, term193964.getClass(), "docInfo", null);
        setBooleanField(term193964, term193964.getClass(), "unknown", false);
        setBooleanField(term193964, term193964.getClass(), "resolved", false);
        setField(term193964, term193964.getClass(), "resolveResult", null);
        setField(term193964, term193964.getClass(), "registry", null);
        setField(term193962, term193962.getClass(), "jsType", term193964);
        setField(term193962, term193962.getClass(), "parent", null);
        setField(term193961, term193961.getClass(), "first", term193962);
        setField(term193961, term193961.getClass(), "last", null);
        setField(term193961, term193961.getClass(), "propListHead", null);
        setIntField(term193961, term193961.getClass(), "sourcePosition", 0);
        setField(term193961, term193961.getClass(), "jsType", null);
        setField(term193961, term193961.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term117685;
        callMethod(klass, "hotSwapScript", argTypes, term117535, args);
        assertTrue(recursiveEquals(term117535, term193959));
        assertTrue(recursiveEquals(term117685, term193961));
    }

};


