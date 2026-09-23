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

public class FunctionType_appendVarArgsString_156835394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15979;
     Object term16033;

    public FunctionType_appendVarArgsString_156835394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50327 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50326 = ((Class) term50327).getDeclaredField((String) "ORDINARY");
        ((Field) term50326).setAccessible(true);
        Object enum128 = ((Field) term50326).get((Object) null);
        term15979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15994 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16004 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15981, term15981.getClass(), "type", -266625190);
        setIntField(term15983, term15983.getClass(), "type", -941356098);
        setIntField(term15985, term15985.getClass(), "type", 0);
        setField(term15985, term15985.getClass(), "next", null);
        setField(term15985, term15985.getClass(), "first", null);
        setField(term15985, term15985.getClass(), "last", null);
        setField(term15985, term15985.getClass(), "propListHead", null);
        setIntField(term15985, term15985.getClass(), "sourcePosition", 0);
        setField(term15985, term15985.getClass(), "jsType", null);
        setField(term15985, term15985.getClass(), "parent", null);
        setField(term15983, term15983.getClass(), "next", term15985);
        setIntField(term15988, term15988.getClass(), "type", 0);
        setField(term15988, term15988.getClass(), "next", null);
        setField(term15988, term15988.getClass(), "first", null);
        setField(term15988, term15988.getClass(), "last", null);
        setField(term15988, term15988.getClass(), "propListHead", null);
        setIntField(term15988, term15988.getClass(), "sourcePosition", 0);
        setField(term15988, term15988.getClass(), "jsType", null);
        setField(term15988, term15988.getClass(), "parent", null);
        setField(term15983, term15983.getClass(), "first", term15988);
        setIntField(term15991, term15991.getClass(), "type", 0);
        setField(term15991, term15991.getClass(), "next", null);
        setField(term15991, term15991.getClass(), "first", null);
        setField(term15991, term15991.getClass(), "last", null);
        setField(term15991, term15991.getClass(), "propListHead", null);
        setIntField(term15991, term15991.getClass(), "sourcePosition", 0);
        setField(term15991, term15991.getClass(), "jsType", null);
        setField(term15991, term15991.getClass(), "parent", null);
        setField(term15983, term15983.getClass(), "last", term15991);
        setField(term15994, term15994.getClass(), "next", null);
        setIntField(term15994, term15994.getClass(), "type", 0);
        setIntField(term15994, term15994.getClass(), "intValue", 0);
        setField(term15994, term15994.getClass(), "objectValue", null);
        setField(term15983, term15983.getClass(), "propListHead", term15994);
        setIntField(term15983, term15983.getClass(), "sourcePosition", -201517446);
        setField(term15983, term15983.getClass(), "jsType", null);
        setField(term15983, term15983.getClass(), "parent", null);
        setField(term15981, term15981.getClass(), "next", term15983);
        setIntField(term15998, term15998.getClass(), "type", 0);
        setField(term15998, term15998.getClass(), "next", null);
        setField(term15998, term15998.getClass(), "first", null);
        setField(term15998, term15998.getClass(), "last", null);
        setField(term15998, term15998.getClass(), "propListHead", null);
        setIntField(term15998, term15998.getClass(), "sourcePosition", 0);
        setField(term15998, term15998.getClass(), "jsType", null);
        setField(term15998, term15998.getClass(), "parent", null);
        setField(term15981, term15981.getClass(), "first", term15998);
        setIntField(term16001, term16001.getClass(), "type", 0);
        setField(term16001, term16001.getClass(), "next", null);
        setField(term16001, term16001.getClass(), "first", null);
        setField(term16001, term16001.getClass(), "last", null);
        setField(term16001, term16001.getClass(), "propListHead", null);
        setIntField(term16001, term16001.getClass(), "sourcePosition", 0);
        setField(term16001, term16001.getClass(), "jsType", null);
        setField(term16001, term16001.getClass(), "parent", null);
        setField(term15981, term15981.getClass(), "last", term16001);
        setField(term16004, term16004.getClass(), "next", null);
        setIntField(term16004, term16004.getClass(), "type", 0);
        setIntField(term16004, term16004.getClass(), "intValue", 0);
        setField(term16004, term16004.getClass(), "objectValue", null);
        setField(term15981, term15981.getClass(), "propListHead", term16004);
        setIntField(term15981, term15981.getClass(), "sourcePosition", -97742366);
        setField(term15981, term15981.getClass(), "jsType", null);
        setField(term15981, term15981.getClass(), "parent", null);
        setField(term15980, term15980.getClass(), "parameters", term15981);
        setField(term15980, term15980.getClass(), "returnType", null);
        setBooleanField(term15980, term15980.getClass(), "returnTypeInferred", false);
        setBooleanField(term15980, term15980.getClass(), "resolved", false);
        setField(term15980, term15980.getClass(), "resolveResult", null);
        setField(term15980, term15980.getClass(), "registry", null);
        setField(term15979, term15979.getClass(), "call", term15980);
        setField(term16010, term16010.getClass(), "ownerFunction", null);
        setField(term16010, term16010.getClass(), "className", null);
        setField(term16010, term16010.getClass(), "properties", null);
        setField(term16010, term16010.getClass(), "implicitPrototype", null);
        setBooleanField(term16010, term16010.getClass(), "nativeType", false);
        setBooleanField(term16010, term16010.getClass(), "prettyPrint", false);
        setBooleanField(term16010, term16010.getClass(), "visited", false);
        setField(term16010, term16010.getClass(), "docInfo", null);
        setBooleanField(term16010, term16010.getClass(), "unknown", false);
        setBooleanField(term16010, term16010.getClass(), "resolved", false);
        setField(term16010, term16010.getClass(), "resolveResult", null);
        setField(term16010, term16010.getClass(), "registry", null);
        setField(term15979, term15979.getClass(), "prototype", term16010);
        setField(term15979, term15979.getClass(), "kind", enum128);
        setField(term15979, term15979.getClass(), "typeOfThis", null);
        setField(term15979, term15979.getClass(), "source", null);
        setField(term15979, term15979.getClass(), "implementedInterfaces", null);
        setField(term15979, term15979.getClass(), "subTypes", null);
        setField(term15979, term15979.getClass(), "templateTypeName", null);
        setField(term15979, term15979.getClass(), "className", null);
        setField(term15979, term15979.getClass(), "properties", null);
        setField(term15979, term15979.getClass(), "implicitPrototype", null);
        setBooleanField(term15979, term15979.getClass(), "nativeType", false);
        setBooleanField(term15979, term15979.getClass(), "prettyPrint", false);
        setBooleanField(term15979, term15979.getClass(), "visited", false);
        setField(term15979, term15979.getClass(), "docInfo", null);
        setBooleanField(term15979, term15979.getClass(), "unknown", false);
        setBooleanField(term15979, term15979.getClass(), "resolved", false);
        setField(term15979, term15979.getClass(), "resolveResult", null);
        setField(term15979, term15979.getClass(), "registry", null);
        term16033 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term16034 = (byte[]) newByteArray(16);
        setField(term16033, term16033.getClass(), "value", term16034);
        setByteField(term16033, term16033.getClass(), "coder", (byte) 47);
        setIntField(term16033, term16033.getClass(), "count", 1638851942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term16033;
        args[1] = null;
        try {
            callMethod(klass, "appendVarArgsString", argTypes, term15979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


