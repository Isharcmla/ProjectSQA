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

public class FunctionType_setPrototypeBasedOn_174053905197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14977;
     Object term15033;

    public FunctionType_setPrototypeBasedOn_174053905197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term77803 = ((Class) term77804).getDeclaredField((String) "ORDINARY");
        ((Field) term77803).setAccessible(true);
        Object enum224 = ((Field) term77803).get((Object) null);
        Class<? extends Object> term78095 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term78094 = ((Class) term78095).getDeclaredField((String) "ANY");
        ((Field) term78094).setAccessible(true);
        Object enum225 = ((Field) term78094).get((Object) null);
        term14977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term14979, term14979.getClass(), "type", 1045547089);
        setIntField(term14981, term14981.getClass(), "type", -1122880881);
        setIntField(term14983, term14983.getClass(), "type", -542712742);
        setField(term14983, term14983.getClass(), "next", null);
        setField(term14983, term14983.getClass(), "first", null);
        setField(term14983, term14983.getClass(), "last", null);
        setField(term14983, term14983.getClass(), "propListHead", null);
        setIntField(term14983, term14983.getClass(), "sourcePosition", 0);
        setField(term14983, term14983.getClass(), "jsType", null);
        setField(term14983, term14983.getClass(), "parent", null);
        setField(term14981, term14981.getClass(), "next", term14983);
        setIntField(term14986, term14986.getClass(), "type", 0);
        setField(term14986, term14986.getClass(), "next", null);
        setField(term14986, term14986.getClass(), "first", null);
        setField(term14986, term14986.getClass(), "last", null);
        setField(term14986, term14986.getClass(), "propListHead", null);
        setIntField(term14986, term14986.getClass(), "sourcePosition", 0);
        setField(term14986, term14986.getClass(), "jsType", null);
        setField(term14986, term14986.getClass(), "parent", null);
        setField(term14981, term14981.getClass(), "first", term14986);
        setIntField(term14989, term14989.getClass(), "type", 1320570890);
        setField(term14989, term14989.getClass(), "next", null);
        setField(term14989, term14989.getClass(), "first", term14986);
        setField(term14989, term14989.getClass(), "last", term14989);
        setField(term14989, term14989.getClass(), "propListHead", null);
        setIntField(term14989, term14989.getClass(), "sourcePosition", 0);
        setField(term14989, term14989.getClass(), "jsType", null);
        setField(term14989, term14989.getClass(), "parent", null);
        setField(term14981, term14981.getClass(), "last", term14989);
        setField(term14981, term14981.getClass(), "propListHead", null);
        setIntField(term14981, term14981.getClass(), "sourcePosition", 0);
        setField(term14981, term14981.getClass(), "jsType", null);
        setField(term14981, term14981.getClass(), "parent", null);
        setField(term14979, term14979.getClass(), "next", term14981);
        setIntField(term14993, term14993.getClass(), "type", -1692331299);
        setIntField(term14995, term14995.getClass(), "type", 479531250);
        setField(term14995, term14995.getClass(), "next", term14989);
        setField(term14995, term14995.getClass(), "first", null);
        setField(term14995, term14995.getClass(), "last", term14979);
        setField(term14995, term14995.getClass(), "propListHead", null);
        setIntField(term14995, term14995.getClass(), "sourcePosition", 0);
        setField(term14995, term14995.getClass(), "jsType", null);
        setField(term14995, term14995.getClass(), "parent", null);
        setField(term14993, term14993.getClass(), "next", term14995);
        setField(term14993, term14993.getClass(), "first", term14993);
        setIntField(term14998, term14998.getClass(), "type", -1254072822);
        setField(term14998, term14998.getClass(), "next", null);
        setField(term14998, term14998.getClass(), "first", term14986);
        setField(term14998, term14998.getClass(), "last", term14989);
        setField(term14998, term14998.getClass(), "propListHead", null);
        setIntField(term14998, term14998.getClass(), "sourcePosition", 0);
        setField(term14998, term14998.getClass(), "jsType", null);
        setField(term14998, term14998.getClass(), "parent", null);
        setField(term14993, term14993.getClass(), "last", term14998);
        setField(term14993, term14993.getClass(), "propListHead", null);
        setIntField(term14993, term14993.getClass(), "sourcePosition", 0);
        setField(term14993, term14993.getClass(), "jsType", null);
        setField(term14993, term14993.getClass(), "parent", null);
        setField(term14979, term14979.getClass(), "first", term14993);
        setField(term14979, term14979.getClass(), "last", term14983);
        setField(term14979, term14979.getClass(), "propListHead", null);
        setIntField(term14979, term14979.getClass(), "sourcePosition", 0);
        setField(term14979, term14979.getClass(), "jsType", null);
        setField(term14979, term14979.getClass(), "parent", null);
        setField(term14978, term14978.getClass(), "parameters", term14979);
        setField(term14978, term14978.getClass(), "returnType", null);
        setBooleanField(term14978, term14978.getClass(), "returnTypeInferred", false);
        setBooleanField(term14978, term14978.getClass(), "resolved", false);
        setField(term14978, term14978.getClass(), "resolveResult", null);
        setBooleanField(term14978, term14978.getClass(), "inTemplatedCheckVisit", false);
        setField(term14978, term14978.getClass(), "registry", null);
        setField(term14977, term14977.getClass(), "call", term14978);
        setField(term15006, term15006.getClass(), "name", null);
        setField(term15006, term15006.getClass(), "type", null);
        setBooleanField(term15006, term15006.getClass(), "inferred", false);
        setField(term15006, term15006.getClass(), "propertyNode", null);
        setField(term15006, term15006.getClass(), "docInfo", null);
        setField(term14977, term14977.getClass(), "prototypeSlot", term15006);
        setField(term14977, term14977.getClass(), "kind", enum224);
        setField(term14977, term14977.getClass(), "propAccess", enum225);
        setField(term14977, term14977.getClass(), "typeOfThis", null);
        setField(term14977, term14977.getClass(), "source", null);
        setField(term14977, term14977.getClass(), "implementedInterfaces", null);
        setField(term14977, term14977.getClass(), "extendedInterfaces", null);
        setField(term14977, term14977.getClass(), "subTypes", null);
        setField(term14977, term14977.getClass(), "templateTypeNames", null);
        setField(term14977, term14977.getClass(), "className", null);
        setField(term14977, term14977.getClass(), "properties", null);
        setBooleanField(term14977, term14977.getClass(), "nativeType", false);
        setField(term14977, term14977.getClass(), "implicitPrototypeFallback", null);
        setField(term14977, term14977.getClass(), "ownerFunction", null);
        setBooleanField(term14977, term14977.getClass(), "prettyPrint", false);
        setBooleanField(term14977, term14977.getClass(), "visited", false);
        setField(term14977, term14977.getClass(), "docInfo", null);
        setBooleanField(term14977, term14977.getClass(), "unknown", false);
        setBooleanField(term14977, term14977.getClass(), "resolved", false);
        setField(term14977, term14977.getClass(), "resolveResult", null);
        setBooleanField(term14977, term14977.getClass(), "inTemplatedCheckVisit", false);
        setField(term14977, term14977.getClass(), "registry", null);
        term15033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15033, term15033.getClass(), "type", -130649791);
        setIntField(term15035, term15035.getClass(), "type", 534834644);
        setIntField(term15037, term15037.getClass(), "type", 1959097203);
        setIntField(term15039, term15039.getClass(), "type", -209654048);
        setIntField(term15041, term15041.getClass(), "type", 477625804);
        setField(term15041, term15041.getClass(), "next", null);
        setField(term15041, term15041.getClass(), "first", null);
        setField(term15041, term15041.getClass(), "last", null);
        setField(term15041, term15041.getClass(), "propListHead", null);
        setIntField(term15041, term15041.getClass(), "sourcePosition", 0);
        setField(term15041, term15041.getClass(), "jsType", null);
        setField(term15041, term15041.getClass(), "parent", null);
        setField(term15039, term15039.getClass(), "next", term15041);
        setIntField(term15044, term15044.getClass(), "type", 252575029);
        setField(term15044, term15044.getClass(), "next", null);
        setField(term15044, term15044.getClass(), "first", null);
        setField(term15044, term15044.getClass(), "last", term15041);
        setField(term15044, term15044.getClass(), "propListHead", null);
        setIntField(term15044, term15044.getClass(), "sourcePosition", 0);
        setField(term15044, term15044.getClass(), "jsType", null);
        setField(term15044, term15044.getClass(), "parent", null);
        setField(term15039, term15039.getClass(), "first", term15044);
        setField(term15039, term15039.getClass(), "last", term15037);
        setField(term15039, term15039.getClass(), "propListHead", null);
        setIntField(term15039, term15039.getClass(), "sourcePosition", 0);
        setField(term15039, term15039.getClass(), "jsType", null);
        setField(term15039, term15039.getClass(), "parent", null);
        setField(term15037, term15037.getClass(), "next", term15039);
        setField(term15037, term15037.getClass(), "first", term15041);
        setIntField(term15048, term15048.getClass(), "type", 1460722225);
        setIntField(term15050, term15050.getClass(), "type", 1743224434);
        setField(term15050, term15050.getClass(), "next", null);
        setField(term15050, term15050.getClass(), "first", term15044);
        setField(term15050, term15050.getClass(), "last", term15039);
        setField(term15050, term15050.getClass(), "propListHead", null);
        setIntField(term15050, term15050.getClass(), "sourcePosition", 0);
        setField(term15050, term15050.getClass(), "jsType", null);
        setField(term15050, term15050.getClass(), "parent", null);
        setField(term15048, term15048.getClass(), "next", term15050);
        setField(term15048, term15048.getClass(), "first", term15035);
        setField(term15048, term15048.getClass(), "last", term15035);
        setField(term15048, term15048.getClass(), "propListHead", null);
        setIntField(term15048, term15048.getClass(), "sourcePosition", 0);
        setField(term15048, term15048.getClass(), "jsType", null);
        setField(term15048, term15048.getClass(), "parent", null);
        setField(term15037, term15037.getClass(), "last", term15048);
        setField(term15037, term15037.getClass(), "propListHead", null);
        setIntField(term15037, term15037.getClass(), "sourcePosition", 0);
        setField(term15037, term15037.getClass(), "jsType", null);
        setField(term15037, term15037.getClass(), "parent", null);
        setField(term15035, term15035.getClass(), "next", term15037);
        setIntField(term15055, term15055.getClass(), "type", 842904495);
        setField(term15055, term15055.getClass(), "next", term15048);
        setField(term15055, term15055.getClass(), "first", term15050);
        setField(term15055, term15055.getClass(), "last", term15033);
        setField(term15055, term15055.getClass(), "propListHead", null);
        setIntField(term15055, term15055.getClass(), "sourcePosition", 0);
        setField(term15055, term15055.getClass(), "jsType", null);
        setField(term15055, term15055.getClass(), "parent", null);
        setField(term15035, term15035.getClass(), "first", term15055);
        setField(term15035, term15035.getClass(), "last", term15055);
        setField(term15035, term15035.getClass(), "propListHead", null);
        setIntField(term15035, term15035.getClass(), "sourcePosition", 0);
        setField(term15035, term15035.getClass(), "jsType", null);
        setField(term15035, term15035.getClass(), "parent", null);
        setField(term15033, term15033.getClass(), "next", term15035);
        setField(term15033, term15033.getClass(), "first", term15039);
        setField(term15033, term15033.getClass(), "last", term15041);
        setField(term15033, term15033.getClass(), "propListHead", null);
        setIntField(term15033, term15033.getClass(), "sourcePosition", 0);
        setField(term15033, term15033.getClass(), "jsType", null);
        setField(term15033, term15033.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15033;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term14977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


