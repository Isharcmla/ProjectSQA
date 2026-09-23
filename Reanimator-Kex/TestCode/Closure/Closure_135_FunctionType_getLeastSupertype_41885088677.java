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

public class FunctionType_getLeastSupertype_41885088677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10976;

    public FunctionType_getLeastSupertype_41885088677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38840 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38839 = ((Class) term38840).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term38839).setAccessible(true);
        Object enum96 = ((Field) term38839).get((Object) null);
        term10976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10991 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11001 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10978, term10978.getClass(), "type", -1332748804);
        setIntField(term10980, term10980.getClass(), "type", 1272542218);
        setIntField(term10982, term10982.getClass(), "type", 0);
        setField(term10982, term10982.getClass(), "next", null);
        setField(term10982, term10982.getClass(), "first", null);
        setField(term10982, term10982.getClass(), "last", null);
        setField(term10982, term10982.getClass(), "propListHead", null);
        setIntField(term10982, term10982.getClass(), "sourcePosition", 0);
        setField(term10982, term10982.getClass(), "jsType", null);
        setField(term10982, term10982.getClass(), "parent", null);
        setField(term10980, term10980.getClass(), "next", term10982);
        setIntField(term10985, term10985.getClass(), "type", 0);
        setField(term10985, term10985.getClass(), "next", null);
        setField(term10985, term10985.getClass(), "first", null);
        setField(term10985, term10985.getClass(), "last", null);
        setField(term10985, term10985.getClass(), "propListHead", null);
        setIntField(term10985, term10985.getClass(), "sourcePosition", 0);
        setField(term10985, term10985.getClass(), "jsType", null);
        setField(term10985, term10985.getClass(), "parent", null);
        setField(term10980, term10980.getClass(), "first", term10985);
        setIntField(term10988, term10988.getClass(), "type", 0);
        setField(term10988, term10988.getClass(), "next", null);
        setField(term10988, term10988.getClass(), "first", null);
        setField(term10988, term10988.getClass(), "last", null);
        setField(term10988, term10988.getClass(), "propListHead", null);
        setIntField(term10988, term10988.getClass(), "sourcePosition", 0);
        setField(term10988, term10988.getClass(), "jsType", null);
        setField(term10988, term10988.getClass(), "parent", null);
        setField(term10980, term10980.getClass(), "last", term10988);
        setField(term10991, term10991.getClass(), "next", null);
        setIntField(term10991, term10991.getClass(), "type", 0);
        setIntField(term10991, term10991.getClass(), "intValue", 0);
        setField(term10991, term10991.getClass(), "objectValue", null);
        setField(term10980, term10980.getClass(), "propListHead", term10991);
        setIntField(term10980, term10980.getClass(), "sourcePosition", 1209799204);
        setField(term10980, term10980.getClass(), "jsType", null);
        setField(term10980, term10980.getClass(), "parent", null);
        setField(term10978, term10978.getClass(), "next", term10980);
        setIntField(term10995, term10995.getClass(), "type", 0);
        setField(term10995, term10995.getClass(), "next", null);
        setField(term10995, term10995.getClass(), "first", null);
        setField(term10995, term10995.getClass(), "last", null);
        setField(term10995, term10995.getClass(), "propListHead", null);
        setIntField(term10995, term10995.getClass(), "sourcePosition", 0);
        setField(term10995, term10995.getClass(), "jsType", null);
        setField(term10995, term10995.getClass(), "parent", null);
        setField(term10978, term10978.getClass(), "first", term10995);
        setIntField(term10998, term10998.getClass(), "type", 0);
        setField(term10998, term10998.getClass(), "next", null);
        setField(term10998, term10998.getClass(), "first", null);
        setField(term10998, term10998.getClass(), "last", null);
        setField(term10998, term10998.getClass(), "propListHead", null);
        setIntField(term10998, term10998.getClass(), "sourcePosition", 0);
        setField(term10998, term10998.getClass(), "jsType", null);
        setField(term10998, term10998.getClass(), "parent", null);
        setField(term10978, term10978.getClass(), "last", term10998);
        setField(term11001, term11001.getClass(), "next", null);
        setIntField(term11001, term11001.getClass(), "type", 0);
        setIntField(term11001, term11001.getClass(), "intValue", 0);
        setField(term11001, term11001.getClass(), "objectValue", null);
        setField(term10978, term10978.getClass(), "propListHead", term11001);
        setIntField(term10978, term10978.getClass(), "sourcePosition", 1094107751);
        setField(term10978, term10978.getClass(), "jsType", null);
        setField(term10978, term10978.getClass(), "parent", null);
        setField(term10977, term10977.getClass(), "parameters", term10978);
        setField(term10977, term10977.getClass(), "returnType", null);
        setBooleanField(term10977, term10977.getClass(), "resolved", false);
        setField(term10977, term10977.getClass(), "resolveResult", null);
        setField(term10977, term10977.getClass(), "registry", null);
        setField(term10976, term10976.getClass(), "call", term10977);
        setField(term11006, term11006.getClass(), "ownerFunction", null);
        setField(term11006, term11006.getClass(), "className", null);
        setField(term11006, term11006.getClass(), "properties", null);
        setField(term11006, term11006.getClass(), "implicitPrototype", null);
        setBooleanField(term11006, term11006.getClass(), "nativeType", false);
        setBooleanField(term11006, term11006.getClass(), "visited", false);
        setField(term11006, term11006.getClass(), "docInfo", null);
        setBooleanField(term11006, term11006.getClass(), "unknown", false);
        setBooleanField(term11006, term11006.getClass(), "resolved", false);
        setField(term11006, term11006.getClass(), "resolveResult", null);
        setField(term11006, term11006.getClass(), "registry", null);
        setField(term10976, term10976.getClass(), "prototype", term11006);
        setField(term10976, term10976.getClass(), "kind", enum96);
        setField(term10976, term10976.getClass(), "typeOfThis", null);
        setField(term10976, term10976.getClass(), "source", null);
        setField(term10976, term10976.getClass(), "implementedInterfaces", null);
        setField(term10976, term10976.getClass(), "subTypes", null);
        setField(term10976, term10976.getClass(), "templateTypeName", null);
        setField(term10976, term10976.getClass(), "className", null);
        setField(term10976, term10976.getClass(), "properties", null);
        setField(term10976, term10976.getClass(), "implicitPrototype", null);
        setBooleanField(term10976, term10976.getClass(), "nativeType", false);
        setBooleanField(term10976, term10976.getClass(), "visited", false);
        setField(term10976, term10976.getClass(), "docInfo", null);
        setBooleanField(term10976, term10976.getClass(), "unknown", false);
        setBooleanField(term10976, term10976.getClass(), "resolved", false);
        setField(term10976, term10976.getClass(), "resolveResult", null);
        setField(term10976, term10976.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term10976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


