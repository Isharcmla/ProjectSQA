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

public class TypeValidator_mismatch_1145070107174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43290;
     Object term43380;
     Object term43568;
     Object term44301;
     Object term44302;
     Object term44305;
     Object term44306;

    public TypeValidator_mismatch_1145070107174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43290 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term43290, term43290.getClass(), "shouldReport", false);
        term43380 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term43380, term43380.getClass(), "sourceName", null);
        term43568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term44301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term44301, term44301.getClass(), "call", null);
        setField(term44301, term44301.getClass(), "prototypeSlot", null);
        setField(term44301, term44301.getClass(), "kind", null);
        setField(term44301, term44301.getClass(), "propAccess", null);
        setField(term44301, term44301.getClass(), "typeOfThis", null);
        setField(term44301, term44301.getClass(), "source", null);
        setField(term44301, term44301.getClass(), "implementedInterfaces", null);
        setField(term44301, term44301.getClass(), "extendedInterfaces", null);
        setField(term44301, term44301.getClass(), "subTypes", null);
        setField(term44301, term44301.getClass(), "className", null);
        setField(term44301, term44301.getClass(), "properties", null);
        setBooleanField(term44301, term44301.getClass(), "nativeType", false);
        setField(term44301, term44301.getClass(), "implicitPrototypeFallback", null);
        setField(term44301, term44301.getClass(), "ownerFunction", null);
        setBooleanField(term44301, term44301.getClass(), "prettyPrint", false);
        setBooleanField(term44301, term44301.getClass(), "visited", false);
        setField(term44301, term44301.getClass(), "docInfo", null);
        setBooleanField(term44301, term44301.getClass(), "unknown", false);
        setBooleanField(term44301, term44301.getClass(), "resolved", false);
        setField(term44301, term44301.getClass(), "resolveResult", null);
        setField(term44301, term44301.getClass(), "templateKeys", null);
        setField(term44301, term44301.getClass(), "templatizedTypes", null);
        setBooleanField(term44301, term44301.getClass(), "inTemplatedCheckVisit", false);
        setField(term44301, term44301.getClass(), "registry", null);
        term44302 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term44302, term44302.getClass(), "compiler", null);
        setField(term44302, term44302.getClass(), "callback", null);
        setField(term44302, term44302.getClass(), "curNode", null);
        setField(term44302, term44302.getClass(), "scopes", null);
        setField(term44302, term44302.getClass(), "scopeRoots", null);
        setField(term44302, term44302.getClass(), "cfgs", null);
        setField(term44302, term44302.getClass(), "sourceName", null);
        setField(term44302, term44302.getClass(), "inputId", null);
        setField(term44302, term44302.getClass(), "scopeCreator", null);
        setField(term44302, term44302.getClass(), "scopeCallback", null);
        term44305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term44305, term44305.getClass(), "call", null);
        setField(term44305, term44305.getClass(), "prototypeSlot", null);
        setField(term44305, term44305.getClass(), "kind", null);
        setField(term44305, term44305.getClass(), "propAccess", null);
        setField(term44305, term44305.getClass(), "typeOfThis", null);
        setField(term44305, term44305.getClass(), "source", null);
        setField(term44305, term44305.getClass(), "implementedInterfaces", null);
        setField(term44305, term44305.getClass(), "extendedInterfaces", null);
        setField(term44305, term44305.getClass(), "subTypes", null);
        setField(term44305, term44305.getClass(), "className", null);
        setField(term44305, term44305.getClass(), "properties", null);
        setBooleanField(term44305, term44305.getClass(), "nativeType", false);
        setField(term44305, term44305.getClass(), "implicitPrototypeFallback", null);
        setField(term44305, term44305.getClass(), "ownerFunction", null);
        setBooleanField(term44305, term44305.getClass(), "prettyPrint", false);
        setBooleanField(term44305, term44305.getClass(), "visited", false);
        setField(term44305, term44305.getClass(), "docInfo", null);
        setBooleanField(term44305, term44305.getClass(), "unknown", false);
        setBooleanField(term44305, term44305.getClass(), "resolved", false);
        setField(term44305, term44305.getClass(), "resolveResult", null);
        setField(term44305, term44305.getClass(), "templateKeys", null);
        setField(term44305, term44305.getClass(), "templatizedTypes", null);
        setBooleanField(term44305, term44305.getClass(), "inTemplatedCheckVisit", false);
        setField(term44305, term44305.getClass(), "registry", null);
        term44306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term44306, term44306.getClass(), "call", null);
        setField(term44306, term44306.getClass(), "prototypeSlot", null);
        setField(term44306, term44306.getClass(), "kind", null);
        setField(term44306, term44306.getClass(), "propAccess", null);
        setField(term44306, term44306.getClass(), "typeOfThis", null);
        setField(term44306, term44306.getClass(), "source", null);
        setField(term44306, term44306.getClass(), "implementedInterfaces", null);
        setField(term44306, term44306.getClass(), "extendedInterfaces", null);
        setField(term44306, term44306.getClass(), "subTypes", null);
        setField(term44306, term44306.getClass(), "className", null);
        setField(term44306, term44306.getClass(), "properties", null);
        setBooleanField(term44306, term44306.getClass(), "nativeType", false);
        setField(term44306, term44306.getClass(), "implicitPrototypeFallback", null);
        setField(term44306, term44306.getClass(), "ownerFunction", null);
        setBooleanField(term44306, term44306.getClass(), "prettyPrint", false);
        setBooleanField(term44306, term44306.getClass(), "visited", false);
        setField(term44306, term44306.getClass(), "docInfo", null);
        setBooleanField(term44306, term44306.getClass(), "unknown", false);
        setBooleanField(term44306, term44306.getClass(), "resolved", false);
        setField(term44306, term44306.getClass(), "resolveResult", null);
        setField(term44306, term44306.getClass(), "templateKeys", null);
        setField(term44306, term44306.getClass(), "templatizedTypes", null);
        setBooleanField(term44306, term44306.getClass(), "inTemplatedCheckVisit", false);
        setField(term44306, term44306.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term43380;
        args[1] = null;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term43568;
        args[4] = term43568;
        callMethod(klass, "mismatch", argTypes, term43290, args);
        assertTrue(recursiveEquals(term43290, term44301));
        assertTrue(recursiveEquals(term43380, term44302));
        assertTrue(recursiveEquals(term43568, term44305));
        assertTrue(recursiveEquals(term43568, term44306));
    }

};


