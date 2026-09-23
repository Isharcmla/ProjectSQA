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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedInterfaces_78495442875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8768;
     Object term8822;

    public FunctionType_addRelatedInterfaces_78495442875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37053 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term37052 = ((Class) term37053).getDeclaredField((String) "ORDINARY");
        ((Field) term37052).setAccessible(true);
        Object enum98 = ((Field) term37052).get((Object) null);
        term8768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8783 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8793 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8770, term8770.getClass(), "type", -1122880881);
        setIntField(term8772, term8772.getClass(), "type", -1692331299);
        setIntField(term8774, term8774.getClass(), "type", 0);
        setField(term8774, term8774.getClass(), "next", null);
        setField(term8774, term8774.getClass(), "first", null);
        setField(term8774, term8774.getClass(), "last", null);
        setField(term8774, term8774.getClass(), "propListHead", null);
        setIntField(term8774, term8774.getClass(), "sourcePosition", 0);
        setField(term8774, term8774.getClass(), "jsType", null);
        setField(term8774, term8774.getClass(), "parent", null);
        setField(term8772, term8772.getClass(), "next", term8774);
        setIntField(term8777, term8777.getClass(), "type", 0);
        setField(term8777, term8777.getClass(), "next", null);
        setField(term8777, term8777.getClass(), "first", null);
        setField(term8777, term8777.getClass(), "last", null);
        setField(term8777, term8777.getClass(), "propListHead", null);
        setIntField(term8777, term8777.getClass(), "sourcePosition", 0);
        setField(term8777, term8777.getClass(), "jsType", null);
        setField(term8777, term8777.getClass(), "parent", null);
        setField(term8772, term8772.getClass(), "first", term8777);
        setIntField(term8780, term8780.getClass(), "type", 0);
        setField(term8780, term8780.getClass(), "next", null);
        setField(term8780, term8780.getClass(), "first", null);
        setField(term8780, term8780.getClass(), "last", null);
        setField(term8780, term8780.getClass(), "propListHead", null);
        setIntField(term8780, term8780.getClass(), "sourcePosition", 0);
        setField(term8780, term8780.getClass(), "jsType", null);
        setField(term8780, term8780.getClass(), "parent", null);
        setField(term8772, term8772.getClass(), "last", term8780);
        setField(term8783, term8783.getClass(), "next", null);
        setIntField(term8783, term8783.getClass(), "type", 0);
        setIntField(term8783, term8783.getClass(), "intValue", 0);
        setField(term8783, term8783.getClass(), "objectValue", null);
        setField(term8772, term8772.getClass(), "propListHead", term8783);
        setIntField(term8772, term8772.getClass(), "sourcePosition", 479531250);
        setField(term8772, term8772.getClass(), "jsType", null);
        setField(term8772, term8772.getClass(), "parent", null);
        setField(term8770, term8770.getClass(), "next", term8772);
        setIntField(term8787, term8787.getClass(), "type", 0);
        setField(term8787, term8787.getClass(), "next", null);
        setField(term8787, term8787.getClass(), "first", null);
        setField(term8787, term8787.getClass(), "last", null);
        setField(term8787, term8787.getClass(), "propListHead", null);
        setIntField(term8787, term8787.getClass(), "sourcePosition", 0);
        setField(term8787, term8787.getClass(), "jsType", null);
        setField(term8787, term8787.getClass(), "parent", null);
        setField(term8770, term8770.getClass(), "first", term8787);
        setIntField(term8790, term8790.getClass(), "type", 0);
        setField(term8790, term8790.getClass(), "next", null);
        setField(term8790, term8790.getClass(), "first", null);
        setField(term8790, term8790.getClass(), "last", null);
        setField(term8790, term8790.getClass(), "propListHead", null);
        setIntField(term8790, term8790.getClass(), "sourcePosition", 0);
        setField(term8790, term8790.getClass(), "jsType", null);
        setField(term8790, term8790.getClass(), "parent", null);
        setField(term8770, term8770.getClass(), "last", term8790);
        setField(term8793, term8793.getClass(), "next", null);
        setIntField(term8793, term8793.getClass(), "type", 0);
        setIntField(term8793, term8793.getClass(), "intValue", 0);
        setField(term8793, term8793.getClass(), "objectValue", null);
        setField(term8770, term8770.getClass(), "propListHead", term8793);
        setIntField(term8770, term8770.getClass(), "sourcePosition", 1320570890);
        setField(term8770, term8770.getClass(), "jsType", null);
        setField(term8770, term8770.getClass(), "parent", null);
        setField(term8769, term8769.getClass(), "parameters", term8770);
        setField(term8769, term8769.getClass(), "returnType", null);
        setBooleanField(term8769, term8769.getClass(), "returnTypeInferred", false);
        setBooleanField(term8769, term8769.getClass(), "resolved", false);
        setField(term8769, term8769.getClass(), "resolveResult", null);
        setField(term8769, term8769.getClass(), "registry", null);
        setField(term8768, term8768.getClass(), "call", term8769);
        setField(term8799, term8799.getClass(), "ownerFunction", null);
        setField(term8799, term8799.getClass(), "className", null);
        setField(term8799, term8799.getClass(), "properties", null);
        setBooleanField(term8799, term8799.getClass(), "nativeType", false);
        setField(term8799, term8799.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term8799, term8799.getClass(), "prettyPrint", false);
        setBooleanField(term8799, term8799.getClass(), "visited", false);
        setField(term8799, term8799.getClass(), "docInfo", null);
        setBooleanField(term8799, term8799.getClass(), "unknown", false);
        setBooleanField(term8799, term8799.getClass(), "resolved", false);
        setField(term8799, term8799.getClass(), "resolveResult", null);
        setField(term8799, term8799.getClass(), "registry", null);
        setField(term8768, term8768.getClass(), "prototype", term8799);
        setField(term8768, term8768.getClass(), "kind", enum98);
        setField(term8768, term8768.getClass(), "typeOfThis", null);
        setField(term8768, term8768.getClass(), "source", null);
        setField(term8768, term8768.getClass(), "implementedInterfaces", null);
        setField(term8768, term8768.getClass(), "subTypes", null);
        setField(term8768, term8768.getClass(), "templateTypeName", null);
        setField(term8768, term8768.getClass(), "className", null);
        setField(term8768, term8768.getClass(), "properties", null);
        setBooleanField(term8768, term8768.getClass(), "nativeType", false);
        setField(term8768, term8768.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term8768, term8768.getClass(), "prettyPrint", false);
        setBooleanField(term8768, term8768.getClass(), "visited", false);
        setField(term8768, term8768.getClass(), "docInfo", null);
        setBooleanField(term8768, term8768.getClass(), "unknown", false);
        setBooleanField(term8768, term8768.getClass(), "resolved", false);
        setField(term8768, term8768.getClass(), "resolveResult", null);
        setField(term8768, term8768.getClass(), "registry", null);
        HashMap term8823 = new HashMap();
        Set<Object> term37343 =  ((Map) term8823).keySet();
        term8822 = new HashSet((Collection<? extends Object>) term37343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8822;
        try {
            callMethod(klass, "addRelatedInterfaces", argTypes, term8768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


