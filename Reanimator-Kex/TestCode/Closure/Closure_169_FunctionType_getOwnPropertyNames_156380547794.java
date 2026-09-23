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

public class FunctionType_getOwnPropertyNames_156380547794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12970;

    public FunctionType_getOwnPropertyNames_156380547794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74784 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term74783 = ((Class) term74784).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term74783).setAccessible(true);
        Object enum216 = ((Field) term74783).get((Object) null);
        Class<? extends Object> term75084 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term75083 = ((Class) term75084).getDeclaredField((String) "STRUCT");
        ((Field) term75083).setAccessible(true);
        Object enum217 = ((Field) term75083).get((Object) null);
        term12970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term12972, term12972.getClass(), "type", -165587447);
        setIntField(term12974, term12974.getClass(), "type", -1347358701);
        setIntField(term12976, term12976.getClass(), "type", 806595993);
        setField(term12976, term12976.getClass(), "next", null);
        setField(term12976, term12976.getClass(), "first", null);
        setField(term12976, term12976.getClass(), "last", null);
        setField(term12976, term12976.getClass(), "propListHead", null);
        setIntField(term12976, term12976.getClass(), "sourcePosition", 0);
        setField(term12976, term12976.getClass(), "jsType", null);
        setField(term12976, term12976.getClass(), "parent", null);
        setField(term12974, term12974.getClass(), "next", term12976);
        setIntField(term12979, term12979.getClass(), "type", 0);
        setField(term12979, term12979.getClass(), "next", null);
        setField(term12979, term12979.getClass(), "first", null);
        setField(term12979, term12979.getClass(), "last", null);
        setField(term12979, term12979.getClass(), "propListHead", null);
        setIntField(term12979, term12979.getClass(), "sourcePosition", 0);
        setField(term12979, term12979.getClass(), "jsType", null);
        setField(term12979, term12979.getClass(), "parent", null);
        setField(term12974, term12974.getClass(), "first", term12979);
        setIntField(term12982, term12982.getClass(), "type", -916584829);
        setField(term12982, term12982.getClass(), "next", null);
        setField(term12982, term12982.getClass(), "first", term12979);
        setField(term12982, term12982.getClass(), "last", term12982);
        setField(term12982, term12982.getClass(), "propListHead", null);
        setIntField(term12982, term12982.getClass(), "sourcePosition", 0);
        setField(term12982, term12982.getClass(), "jsType", null);
        setField(term12982, term12982.getClass(), "parent", null);
        setField(term12974, term12974.getClass(), "last", term12982);
        setField(term12974, term12974.getClass(), "propListHead", null);
        setIntField(term12974, term12974.getClass(), "sourcePosition", 0);
        setField(term12974, term12974.getClass(), "jsType", null);
        setField(term12974, term12974.getClass(), "parent", null);
        setField(term12972, term12972.getClass(), "next", term12974);
        setIntField(term12986, term12986.getClass(), "type", 1694224101);
        setIntField(term12988, term12988.getClass(), "type", 937859191);
        setField(term12988, term12988.getClass(), "next", term12982);
        setField(term12988, term12988.getClass(), "first", null);
        setField(term12988, term12988.getClass(), "last", term12972);
        setField(term12988, term12988.getClass(), "propListHead", null);
        setIntField(term12988, term12988.getClass(), "sourcePosition", 0);
        setField(term12988, term12988.getClass(), "jsType", null);
        setField(term12988, term12988.getClass(), "parent", null);
        setField(term12986, term12986.getClass(), "next", term12988);
        setField(term12986, term12986.getClass(), "first", term12986);
        setIntField(term12991, term12991.getClass(), "type", 548228925);
        setField(term12991, term12991.getClass(), "next", null);
        setField(term12991, term12991.getClass(), "first", term12979);
        setField(term12991, term12991.getClass(), "last", term12982);
        setField(term12991, term12991.getClass(), "propListHead", null);
        setIntField(term12991, term12991.getClass(), "sourcePosition", 0);
        setField(term12991, term12991.getClass(), "jsType", null);
        setField(term12991, term12991.getClass(), "parent", null);
        setField(term12986, term12986.getClass(), "last", term12991);
        setField(term12986, term12986.getClass(), "propListHead", null);
        setIntField(term12986, term12986.getClass(), "sourcePosition", 0);
        setField(term12986, term12986.getClass(), "jsType", null);
        setField(term12986, term12986.getClass(), "parent", null);
        setField(term12972, term12972.getClass(), "first", term12986);
        setField(term12972, term12972.getClass(), "last", term12976);
        setField(term12972, term12972.getClass(), "propListHead", null);
        setIntField(term12972, term12972.getClass(), "sourcePosition", 0);
        setField(term12972, term12972.getClass(), "jsType", null);
        setField(term12972, term12972.getClass(), "parent", null);
        setField(term12971, term12971.getClass(), "parameters", term12972);
        setField(term12971, term12971.getClass(), "returnType", null);
        setBooleanField(term12971, term12971.getClass(), "returnTypeInferred", false);
        setBooleanField(term12971, term12971.getClass(), "resolved", false);
        setField(term12971, term12971.getClass(), "resolveResult", null);
        setBooleanField(term12971, term12971.getClass(), "inTemplatedCheckVisit", false);
        setField(term12971, term12971.getClass(), "registry", null);
        setField(term12970, term12970.getClass(), "call", term12971);
        setField(term12999, term12999.getClass(), "name", null);
        setField(term12999, term12999.getClass(), "type", null);
        setBooleanField(term12999, term12999.getClass(), "inferred", false);
        setField(term12999, term12999.getClass(), "propertyNode", null);
        setField(term12999, term12999.getClass(), "docInfo", null);
        setField(term12970, term12970.getClass(), "prototypeSlot", term12999);
        setField(term12970, term12970.getClass(), "kind", enum216);
        setField(term12970, term12970.getClass(), "propAccess", enum217);
        setField(term12970, term12970.getClass(), "typeOfThis", null);
        setField(term12970, term12970.getClass(), "source", null);
        setField(term12970, term12970.getClass(), "implementedInterfaces", null);
        setField(term12970, term12970.getClass(), "extendedInterfaces", null);
        setField(term12970, term12970.getClass(), "subTypes", null);
        setField(term12970, term12970.getClass(), "templateTypeNames", null);
        setField(term12970, term12970.getClass(), "className", null);
        setField(term12970, term12970.getClass(), "properties", null);
        setBooleanField(term12970, term12970.getClass(), "nativeType", false);
        setField(term12970, term12970.getClass(), "implicitPrototypeFallback", null);
        setField(term12970, term12970.getClass(), "ownerFunction", null);
        setBooleanField(term12970, term12970.getClass(), "prettyPrint", false);
        setBooleanField(term12970, term12970.getClass(), "visited", false);
        setField(term12970, term12970.getClass(), "docInfo", null);
        setBooleanField(term12970, term12970.getClass(), "unknown", false);
        setBooleanField(term12970, term12970.getClass(), "resolved", false);
        setField(term12970, term12970.getClass(), "resolveResult", null);
        setBooleanField(term12970, term12970.getClass(), "inTemplatedCheckVisit", false);
        setField(term12970, term12970.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOwnPropertyNames", argTypes, term12970, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


