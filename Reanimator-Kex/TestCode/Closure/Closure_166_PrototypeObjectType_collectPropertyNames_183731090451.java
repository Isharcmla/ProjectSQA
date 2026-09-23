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
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PrototypeObjectType_collectPropertyNames_183731090451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;
     Object term644;
     Object term5785;
     Object term5792;

    public PrototypeObjectType_collectPropertyNames_183731090451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term617 = new HashMap();
        term604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term604, term604.getClass(), "className", "XylxrMBraH");
        setField(term604, term604.getClass(), "properties", term617);
        setBooleanField(term604, term604.getClass(), "nativeType", false);
        setField(term604, term604.getClass(), "implicitPrototypeFallback", null);
        setField(term629, term629.getClass(), "call", null);
        setField(term629, term629.getClass(), "prototypeSlot", null);
        setField(term629, term629.getClass(), "kind", null);
        setField(term629, term629.getClass(), "typeOfThis", null);
        setField(term629, term629.getClass(), "source", null);
        setField(term629, term629.getClass(), "implementedInterfaces", null);
        setField(term629, term629.getClass(), "extendedInterfaces", null);
        setField(term629, term629.getClass(), "subTypes", null);
        setField(term629, term629.getClass(), "templateTypeNames", null);
        setField(term629, term629.getClass(), "className", null);
        setField(term629, term629.getClass(), "properties", null);
        setBooleanField(term629, term629.getClass(), "nativeType", false);
        setField(term629, term629.getClass(), "implicitPrototypeFallback", null);
        setField(term629, term629.getClass(), "ownerFunction", null);
        setBooleanField(term629, term629.getClass(), "prettyPrint", false);
        setBooleanField(term629, term629.getClass(), "visited", false);
        setField(term629, term629.getClass(), "docInfo", null);
        setBooleanField(term629, term629.getClass(), "unknown", false);
        setBooleanField(term629, term629.getClass(), "resolved", false);
        setField(term629, term629.getClass(), "resolveResult", null);
        setBooleanField(term629, term629.getClass(), "inTemplatedCheckVisit", false);
        setField(term629, term629.getClass(), "registry", null);
        setField(term604, term604.getClass(), "ownerFunction", term629);
        setBooleanField(term604, term604.getClass(), "prettyPrint", true);
        setBooleanField(term604, term604.getClass(), "visited", false);
        setField(term638, term638.getClass(), "info", null);
        setField(term638, term638.getClass(), "documentation", null);
        setField(term638, term638.getClass(), "associatedNode", null);
        setField(term638, term638.getClass(), "visibility", null);
        setIntField(term638, term638.getClass(), "bitset", 0);
        setField(term638, term638.getClass(), "type", null);
        setField(term638, term638.getClass(), "thisType", null);
        setBooleanField(term638, term638.getClass(), "includeDocumentation", false);
        setField(term604, term604.getClass(), "docInfo", term638);
        setBooleanField(term604, term604.getClass(), "unknown", false);
        setBooleanField(term604, term604.getClass(), "resolved", false);
        setField(term604, term604.getClass(), "resolveResult", null);
        setBooleanField(term604, term604.getClass(), "inTemplatedCheckVisit", false);
        setField(term604, term604.getClass(), "registry", null);
        HashMap term645 = new HashMap();
        Set<Object> term5804 =  ((Map) term645).keySet();
        term644 = new HashSet((Collection<? extends Object>) term5804);
        HashMap term5788 = new HashMap();
        term5785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5791 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5785, term5785.getClass(), "className", "XylxrMBraH");
        setField(term5785, term5785.getClass(), "properties", term5788);
        setBooleanField(term5785, term5785.getClass(), "nativeType", false);
        setField(term5785, term5785.getClass(), "implicitPrototypeFallback", null);
        setField(term5790, term5790.getClass(), "call", null);
        setField(term5790, term5790.getClass(), "prototypeSlot", null);
        setField(term5790, term5790.getClass(), "kind", null);
        setField(term5790, term5790.getClass(), "typeOfThis", null);
        setField(term5790, term5790.getClass(), "source", null);
        setField(term5790, term5790.getClass(), "implementedInterfaces", null);
        setField(term5790, term5790.getClass(), "extendedInterfaces", null);
        setField(term5790, term5790.getClass(), "subTypes", null);
        setField(term5790, term5790.getClass(), "templateTypeNames", null);
        setField(term5790, term5790.getClass(), "className", null);
        setField(term5790, term5790.getClass(), "properties", null);
        setBooleanField(term5790, term5790.getClass(), "nativeType", false);
        setField(term5790, term5790.getClass(), "implicitPrototypeFallback", null);
        setField(term5790, term5790.getClass(), "ownerFunction", null);
        setBooleanField(term5790, term5790.getClass(), "prettyPrint", false);
        setBooleanField(term5790, term5790.getClass(), "visited", false);
        setField(term5790, term5790.getClass(), "docInfo", null);
        setBooleanField(term5790, term5790.getClass(), "unknown", false);
        setBooleanField(term5790, term5790.getClass(), "resolved", false);
        setField(term5790, term5790.getClass(), "resolveResult", null);
        setBooleanField(term5790, term5790.getClass(), "inTemplatedCheckVisit", false);
        setField(term5790, term5790.getClass(), "registry", null);
        setField(term5785, term5785.getClass(), "ownerFunction", term5790);
        setBooleanField(term5785, term5785.getClass(), "prettyPrint", true);
        setBooleanField(term5785, term5785.getClass(), "visited", false);
        setField(term5791, term5791.getClass(), "info", null);
        setField(term5791, term5791.getClass(), "documentation", null);
        setField(term5791, term5791.getClass(), "associatedNode", null);
        setField(term5791, term5791.getClass(), "visibility", null);
        setIntField(term5791, term5791.getClass(), "bitset", 0);
        setField(term5791, term5791.getClass(), "type", null);
        setField(term5791, term5791.getClass(), "thisType", null);
        setBooleanField(term5791, term5791.getClass(), "includeDocumentation", false);
        setField(term5785, term5785.getClass(), "docInfo", term5791);
        setBooleanField(term5785, term5785.getClass(), "unknown", false);
        setBooleanField(term5785, term5785.getClass(), "resolved", false);
        setField(term5785, term5785.getClass(), "resolveResult", null);
        setBooleanField(term5785, term5785.getClass(), "inTemplatedCheckVisit", false);
        setField(term5785, term5785.getClass(), "registry", null);
        HashMap term5793 = new HashMap();
        Set<Object> term5815 =  ((Map) term5793).keySet();
        term5792 = new HashSet((Collection<? extends Object>) term5815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term644;
        callMethod(klass, "collectPropertyNames", argTypes, term604, args);
        assertTrue(recursiveEquals(term604, term5785));
        assertTrue(recursiveEquals(term644, term5792));
    }

};


