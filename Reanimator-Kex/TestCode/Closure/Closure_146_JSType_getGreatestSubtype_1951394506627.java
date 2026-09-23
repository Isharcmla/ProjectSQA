package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175850;
     Object term176066;
     Object term177612;
     Object term177614;
     Object term177460;

    public JSType_getGreatestSubtype_1951394506627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term175968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term175968, term175968.getClass(), "unknown", false);
        setField(term175968, term175968.getClass(), "implicitPrototype", null);
        setField(term175850, term175850.getClass(), "referencedType", term175968);
        term176066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term176154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term176066, term176066.getClass(), "referencedType", term176154);
        term177612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term177613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term177612, term177612.getClass(), "indexType", null);
        setField(term177613, term177613.getClass(), "leastSupertypeVisitor", null);
        setField(term177613, term177613.getClass(), "greatestSubtypeVisitor", null);
        setField(term177613, term177613.getClass(), "call", null);
        setField(term177613, term177613.getClass(), "prototype", null);
        setField(term177613, term177613.getClass(), "kind", null);
        setField(term177613, term177613.getClass(), "typeOfThis", null);
        setField(term177613, term177613.getClass(), "source", null);
        setField(term177613, term177613.getClass(), "implementedInterfaces", null);
        setField(term177613, term177613.getClass(), "subTypes", null);
        setField(term177613, term177613.getClass(), "templateTypeName", null);
        setField(term177613, term177613.getClass(), "className", null);
        setField(term177613, term177613.getClass(), "properties", null);
        setField(term177613, term177613.getClass(), "implicitPrototype", null);
        setBooleanField(term177613, term177613.getClass(), "nativeType", false);
        setBooleanField(term177613, term177613.getClass(), "prettyPrint", false);
        setBooleanField(term177613, term177613.getClass(), "visited", false);
        setField(term177613, term177613.getClass(), "docInfo", null);
        setBooleanField(term177613, term177613.getClass(), "unknown", false);
        setBooleanField(term177613, term177613.getClass(), "resolved", false);
        setField(term177613, term177613.getClass(), "resolveResult", null);
        setField(term177613, term177613.getClass(), "registry", null);
        setField(term177612, term177612.getClass(), "referencedType", term177613);
        setBooleanField(term177612, term177612.getClass(), "visited", false);
        setField(term177612, term177612.getClass(), "docInfo", null);
        setBooleanField(term177612, term177612.getClass(), "unknown", false);
        setBooleanField(term177612, term177612.getClass(), "resolved", false);
        setField(term177612, term177612.getClass(), "resolveResult", null);
        setField(term177612, term177612.getClass(), "registry", null);
        term177614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term177615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term177614, term177614.getClass(), "parameterType", null);
        setField(term177615, term177615.getClass(), "ownerFunction", null);
        setField(term177615, term177615.getClass(), "className", null);
        setField(term177615, term177615.getClass(), "properties", null);
        setField(term177615, term177615.getClass(), "implicitPrototype", null);
        setBooleanField(term177615, term177615.getClass(), "nativeType", false);
        setBooleanField(term177615, term177615.getClass(), "prettyPrint", false);
        setBooleanField(term177615, term177615.getClass(), "visited", false);
        setField(term177615, term177615.getClass(), "docInfo", null);
        setBooleanField(term177615, term177615.getClass(), "unknown", false);
        setBooleanField(term177615, term177615.getClass(), "resolved", false);
        setField(term177615, term177615.getClass(), "resolveResult", null);
        setField(term177615, term177615.getClass(), "registry", null);
        setField(term177614, term177614.getClass(), "referencedType", term177615);
        setBooleanField(term177614, term177614.getClass(), "visited", false);
        setField(term177614, term177614.getClass(), "docInfo", null);
        setBooleanField(term177614, term177614.getClass(), "unknown", false);
        setBooleanField(term177614, term177614.getClass(), "resolved", false);
        setField(term177614, term177614.getClass(), "resolveResult", null);
        setField(term177614, term177614.getClass(), "registry", null);
        term177460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term177461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term177460, term177460.getClass(), "indexType", null);
        setField(term177461, term177461.getClass(), "leastSupertypeVisitor", null);
        setField(term177461, term177461.getClass(), "greatestSubtypeVisitor", null);
        setField(term177461, term177461.getClass(), "call", null);
        setField(term177461, term177461.getClass(), "prototype", null);
        setField(term177461, term177461.getClass(), "kind", null);
        setField(term177461, term177461.getClass(), "typeOfThis", null);
        setField(term177461, term177461.getClass(), "source", null);
        setField(term177461, term177461.getClass(), "implementedInterfaces", null);
        setField(term177461, term177461.getClass(), "subTypes", null);
        setField(term177461, term177461.getClass(), "templateTypeName", null);
        setField(term177461, term177461.getClass(), "className", null);
        setField(term177461, term177461.getClass(), "properties", null);
        setField(term177461, term177461.getClass(), "implicitPrototype", null);
        setBooleanField(term177461, term177461.getClass(), "nativeType", false);
        setBooleanField(term177461, term177461.getClass(), "prettyPrint", false);
        setBooleanField(term177461, term177461.getClass(), "visited", false);
        setField(term177461, term177461.getClass(), "docInfo", null);
        setBooleanField(term177461, term177461.getClass(), "unknown", false);
        setBooleanField(term177461, term177461.getClass(), "resolved", false);
        setField(term177461, term177461.getClass(), "resolveResult", null);
        setField(term177461, term177461.getClass(), "registry", null);
        setField(term177460, term177460.getClass(), "referencedType", term177461);
        setBooleanField(term177460, term177460.getClass(), "visited", false);
        setField(term177460, term177460.getClass(), "docInfo", null);
        setBooleanField(term177460, term177460.getClass(), "unknown", false);
        setBooleanField(term177460, term177460.getClass(), "resolved", false);
        setField(term177460, term177460.getClass(), "resolveResult", null);
        setField(term177460, term177460.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term175850;
        args[1] = term176066;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term175850, term177612));
        assertTrue(recursiveEquals(term176066, term177614));
        assertTrue(recursiveEquals(retValue, term177460));
    }

};


