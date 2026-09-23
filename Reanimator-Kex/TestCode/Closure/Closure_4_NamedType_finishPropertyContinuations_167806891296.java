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
import java.util.ArrayList;

public class NamedType_finishPropertyContinuations_167806891296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93690;
     Object term144377;

    public NamedType_finishPropertyContinuations_167806891296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term93950 = new ArrayList();
        term93690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term93790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term93898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term93790, term93790.getClass(), "unknown", true);
        setBooleanField(term93898, term93898.getClass(), "nativeType", false);
        setBooleanField(term93898, term93898.getClass(), "unknown", false);
        setField(term93790, term93790.getClass(), "implicitPrototypeFallback", term93898);
        setField(term93690, term93690.getClass(), "referencedObjType", term93790);
        setField(term93690, term93690.getClass(), "propertyContinuations", term93950);
        term144377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term144378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term144379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term144377, term144377.getClass(), "reference", null);
        setField(term144377, term144377.getClass(), "sourceName", null);
        setIntField(term144377, term144377.getClass(), "lineno", 0);
        setIntField(term144377, term144377.getClass(), "charno", 0);
        setField(term144377, term144377.getClass(), "validator", null);
        setField(term144377, term144377.getClass(), "propertyContinuations", null);
        setField(term144377, term144377.getClass(), "referencedType", null);
        setField(term144378, term144378.getClass(), "call", null);
        setField(term144378, term144378.getClass(), "prototypeSlot", null);
        setField(term144378, term144378.getClass(), "kind", null);
        setField(term144378, term144378.getClass(), "propAccess", null);
        setField(term144378, term144378.getClass(), "typeOfThis", null);
        setField(term144378, term144378.getClass(), "source", null);
        setField(term144378, term144378.getClass(), "implementedInterfaces", null);
        setField(term144378, term144378.getClass(), "extendedInterfaces", null);
        setField(term144378, term144378.getClass(), "subTypes", null);
        setField(term144378, term144378.getClass(), "className", null);
        setField(term144378, term144378.getClass(), "properties", null);
        setBooleanField(term144378, term144378.getClass(), "nativeType", false);
        setField(term144379, term144379.getClass(), "this$0", null);
        setField(term144379, term144379.getClass(), "call", null);
        setField(term144379, term144379.getClass(), "prototypeSlot", null);
        setField(term144379, term144379.getClass(), "kind", null);
        setField(term144379, term144379.getClass(), "propAccess", null);
        setField(term144379, term144379.getClass(), "typeOfThis", null);
        setField(term144379, term144379.getClass(), "source", null);
        setField(term144379, term144379.getClass(), "implementedInterfaces", null);
        setField(term144379, term144379.getClass(), "extendedInterfaces", null);
        setField(term144379, term144379.getClass(), "subTypes", null);
        setField(term144379, term144379.getClass(), "className", null);
        setField(term144379, term144379.getClass(), "properties", null);
        setBooleanField(term144379, term144379.getClass(), "nativeType", false);
        setField(term144379, term144379.getClass(), "implicitPrototypeFallback", null);
        setField(term144379, term144379.getClass(), "ownerFunction", null);
        setBooleanField(term144379, term144379.getClass(), "prettyPrint", false);
        setBooleanField(term144379, term144379.getClass(), "visited", false);
        setField(term144379, term144379.getClass(), "docInfo", null);
        setBooleanField(term144379, term144379.getClass(), "unknown", false);
        setBooleanField(term144379, term144379.getClass(), "resolved", false);
        setField(term144379, term144379.getClass(), "resolveResult", null);
        setField(term144379, term144379.getClass(), "templateKeys", null);
        setField(term144379, term144379.getClass(), "templatizedTypes", null);
        setBooleanField(term144379, term144379.getClass(), "inTemplatedCheckVisit", false);
        setField(term144379, term144379.getClass(), "registry", null);
        setField(term144378, term144378.getClass(), "implicitPrototypeFallback", term144379);
        setField(term144378, term144378.getClass(), "ownerFunction", null);
        setBooleanField(term144378, term144378.getClass(), "prettyPrint", false);
        setBooleanField(term144378, term144378.getClass(), "visited", false);
        setField(term144378, term144378.getClass(), "docInfo", null);
        setBooleanField(term144378, term144378.getClass(), "unknown", false);
        setBooleanField(term144378, term144378.getClass(), "resolved", false);
        setField(term144378, term144378.getClass(), "resolveResult", null);
        setField(term144378, term144378.getClass(), "templateKeys", null);
        setField(term144378, term144378.getClass(), "templatizedTypes", null);
        setBooleanField(term144378, term144378.getClass(), "inTemplatedCheckVisit", false);
        setField(term144378, term144378.getClass(), "registry", null);
        setField(term144377, term144377.getClass(), "referencedObjType", term144378);
        setBooleanField(term144377, term144377.getClass(), "visited", false);
        setField(term144377, term144377.getClass(), "docInfo", null);
        setBooleanField(term144377, term144377.getClass(), "unknown", false);
        setBooleanField(term144377, term144377.getClass(), "resolved", false);
        setField(term144377, term144377.getClass(), "resolveResult", null);
        setField(term144377, term144377.getClass(), "templateKeys", null);
        setField(term144377, term144377.getClass(), "templatizedTypes", null);
        setBooleanField(term144377, term144377.getClass(), "inTemplatedCheckVisit", false);
        setField(term144377, term144377.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term93690, args);
        assertTrue(recursiveEquals(term93690, term144377));
    }

};


