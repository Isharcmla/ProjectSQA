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
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162816;
     Object term162924;
     Object term163699;
     Object term163703;
     Object term163684;

    public FunctionBuilder_copyFromOtherFunction_842235135229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term162816, term162816.getClass(), "name", null);
        setField(term162816, term162816.getClass(), "sourceNode", null);
        setField(term162816, term162816.getClass(), "parametersNode", null);
        setField(term162816, term162816.getClass(), "returnType", null);
        setField(term162816, term162816.getClass(), "typeOfThis", null);
        setField(term162816, term162816.getClass(), "templateTypeName", null);
        Class<? extends Object> term163721 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term163720 = ((Class) term163721).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term163720).setAccessible(true);
        Object enum215 = ((Field) term163720).get((Object) null);
        term162924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term163056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term163144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term162924, term162924.getClass(), "className", "INTERFACE");
        setField(term162924, term162924.getClass(), "source", null);
        setField(term163056, term163056.getClass(), "parameters", null);
        setField(term163056, term163056.getClass(), "returnType", null);
        setField(term162924, term162924.getClass(), "call", term163056);
        setField(term162924, term162924.getClass(), "typeOfThis", term163144);
        setField(term162924, term162924.getClass(), "templateTypeName", null);
        setField(term162924, term162924.getClass(), "kind", enum215);
        term163699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term163702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term163699, term163699.getClass(), "registry", null);
        setField(term163699, term163699.getClass(), "name", "INTERFACE");
        setField(term163699, term163699.getClass(), "sourceNode", null);
        setField(term163699, term163699.getClass(), "parametersNode", null);
        setField(term163699, term163699.getClass(), "returnType", null);
        setField(term163702, term163702.getClass(), "leastSupertypeVisitor", null);
        setField(term163702, term163702.getClass(), "greatestSubtypeVisitor", null);
        setField(term163702, term163702.getClass(), "call", null);
        setField(term163702, term163702.getClass(), "prototype", null);
        setField(term163702, term163702.getClass(), "kind", null);
        setField(term163702, term163702.getClass(), "typeOfThis", null);
        setField(term163702, term163702.getClass(), "source", null);
        setField(term163702, term163702.getClass(), "implementedInterfaces", null);
        setField(term163702, term163702.getClass(), "subTypes", null);
        setField(term163702, term163702.getClass(), "templateTypeName", null);
        setField(term163702, term163702.getClass(), "className", null);
        setField(term163702, term163702.getClass(), "properties", null);
        setField(term163702, term163702.getClass(), "implicitPrototype", null);
        setBooleanField(term163702, term163702.getClass(), "nativeType", false);
        setBooleanField(term163702, term163702.getClass(), "prettyPrint", false);
        setBooleanField(term163702, term163702.getClass(), "visited", false);
        setField(term163702, term163702.getClass(), "docInfo", null);
        setBooleanField(term163702, term163702.getClass(), "unknown", false);
        setBooleanField(term163702, term163702.getClass(), "resolved", false);
        setField(term163702, term163702.getClass(), "resolveResult", null);
        setField(term163702, term163702.getClass(), "registry", null);
        setField(term163699, term163699.getClass(), "typeOfThis", term163702);
        setField(term163699, term163699.getClass(), "templateTypeName", null);
        setBooleanField(term163699, term163699.getClass(), "inferredReturnType", false);
        setBooleanField(term163699, term163699.getClass(), "isConstructor", true);
        setBooleanField(term163699, term163699.getClass(), "isNativeType", false);
        Class<? extends Object> term164030 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164029 = ((Class) term164030).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term164029).setAccessible(true);
        Object enum216 = ((Field) term164029).get((Object) null);
        term163703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term163704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term163708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term163703, term163703.getClass(), "this$0", null);
        setField(term163704, term163704.getClass(), "parameters", null);
        setField(term163704, term163704.getClass(), "returnType", null);
        setBooleanField(term163704, term163704.getClass(), "returnTypeInferred", false);
        setBooleanField(term163704, term163704.getClass(), "resolved", false);
        setField(term163704, term163704.getClass(), "resolveResult", null);
        setField(term163704, term163704.getClass(), "registry", null);
        setField(term163703, term163703.getClass(), "call", term163704);
        setField(term163703, term163703.getClass(), "prototype", null);
        setField(term163703, term163703.getClass(), "kind", enum216);
        setField(term163708, term163708.getClass(), "leastSupertypeVisitor", null);
        setField(term163708, term163708.getClass(), "greatestSubtypeVisitor", null);
        setField(term163708, term163708.getClass(), "call", null);
        setField(term163708, term163708.getClass(), "prototype", null);
        setField(term163708, term163708.getClass(), "kind", null);
        setField(term163708, term163708.getClass(), "typeOfThis", null);
        setField(term163708, term163708.getClass(), "source", null);
        setField(term163708, term163708.getClass(), "implementedInterfaces", null);
        setField(term163708, term163708.getClass(), "subTypes", null);
        setField(term163708, term163708.getClass(), "templateTypeName", null);
        setField(term163708, term163708.getClass(), "className", null);
        setField(term163708, term163708.getClass(), "properties", null);
        setField(term163708, term163708.getClass(), "implicitPrototype", null);
        setBooleanField(term163708, term163708.getClass(), "nativeType", false);
        setBooleanField(term163708, term163708.getClass(), "prettyPrint", false);
        setBooleanField(term163708, term163708.getClass(), "visited", false);
        setField(term163708, term163708.getClass(), "docInfo", null);
        setBooleanField(term163708, term163708.getClass(), "unknown", false);
        setBooleanField(term163708, term163708.getClass(), "resolved", false);
        setField(term163708, term163708.getClass(), "resolveResult", null);
        setField(term163708, term163708.getClass(), "registry", null);
        setField(term163703, term163703.getClass(), "typeOfThis", term163708);
        setField(term163703, term163703.getClass(), "source", null);
        setField(term163703, term163703.getClass(), "implementedInterfaces", null);
        setField(term163703, term163703.getClass(), "subTypes", null);
        setField(term163703, term163703.getClass(), "templateTypeName", null);
        setField(term163703, term163703.getClass(), "className", "INTERFACE");
        setField(term163703, term163703.getClass(), "properties", null);
        setField(term163703, term163703.getClass(), "implicitPrototype", null);
        setBooleanField(term163703, term163703.getClass(), "nativeType", false);
        setBooleanField(term163703, term163703.getClass(), "prettyPrint", false);
        setBooleanField(term163703, term163703.getClass(), "visited", false);
        setField(term163703, term163703.getClass(), "docInfo", null);
        setBooleanField(term163703, term163703.getClass(), "unknown", false);
        setBooleanField(term163703, term163703.getClass(), "resolved", false);
        setField(term163703, term163703.getClass(), "resolveResult", null);
        setField(term163703, term163703.getClass(), "registry", null);
        term163684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term163633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term163684, term163684.getClass(), "registry", null);
        setField(term163684, term163684.getClass(), "name", "INTERFACE");
        setField(term163684, term163684.getClass(), "sourceNode", null);
        setField(term163684, term163684.getClass(), "parametersNode", null);
        setField(term163684, term163684.getClass(), "returnType", null);
        setField(term163633, term163633.getClass(), "leastSupertypeVisitor", null);
        setField(term163633, term163633.getClass(), "greatestSubtypeVisitor", null);
        setField(term163633, term163633.getClass(), "call", null);
        setField(term163633, term163633.getClass(), "prototype", null);
        setField(term163633, term163633.getClass(), "kind", null);
        setField(term163633, term163633.getClass(), "typeOfThis", null);
        setField(term163633, term163633.getClass(), "source", null);
        setField(term163633, term163633.getClass(), "implementedInterfaces", null);
        setField(term163633, term163633.getClass(), "subTypes", null);
        setField(term163633, term163633.getClass(), "templateTypeName", null);
        setField(term163633, term163633.getClass(), "className", null);
        setField(term163633, term163633.getClass(), "properties", null);
        setField(term163633, term163633.getClass(), "implicitPrototype", null);
        setBooleanField(term163633, term163633.getClass(), "nativeType", false);
        setBooleanField(term163633, term163633.getClass(), "prettyPrint", false);
        setBooleanField(term163633, term163633.getClass(), "visited", false);
        setField(term163633, term163633.getClass(), "docInfo", null);
        setBooleanField(term163633, term163633.getClass(), "unknown", false);
        setBooleanField(term163633, term163633.getClass(), "resolved", false);
        setField(term163633, term163633.getClass(), "resolveResult", null);
        setField(term163633, term163633.getClass(), "registry", null);
        setField(term163684, term163684.getClass(), "typeOfThis", term163633);
        setField(term163684, term163684.getClass(), "templateTypeName", null);
        setBooleanField(term163684, term163684.getClass(), "inferredReturnType", false);
        setBooleanField(term163684, term163684.getClass(), "isConstructor", true);
        setBooleanField(term163684, term163684.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term162924;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term162816, args);
        assertTrue(recursiveEquals(term162816, term163699));
        assertTrue(recursiveEquals(term162924, term163703));
        assertTrue(recursiveEquals(retValue, term163684));
    }

};


