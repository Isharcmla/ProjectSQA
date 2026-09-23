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

public class FunctionType_visit_187068537788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15207;

    public FunctionType_visit_187068537788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term48136 = ((Class) term48137).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term48136).setAccessible(true);
        Object enum118 = ((Field) term48136).get((Object) null);
        term15207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15222 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15232 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15209, term15209.getClass(), "type", 1916544127);
        setIntField(term15211, term15211.getClass(), "type", -726681073);
        setIntField(term15213, term15213.getClass(), "type", 0);
        setField(term15213, term15213.getClass(), "next", null);
        setField(term15213, term15213.getClass(), "first", null);
        setField(term15213, term15213.getClass(), "last", null);
        setField(term15213, term15213.getClass(), "propListHead", null);
        setIntField(term15213, term15213.getClass(), "sourcePosition", 0);
        setField(term15213, term15213.getClass(), "jsType", null);
        setField(term15213, term15213.getClass(), "parent", null);
        setField(term15211, term15211.getClass(), "next", term15213);
        setIntField(term15216, term15216.getClass(), "type", 0);
        setField(term15216, term15216.getClass(), "next", null);
        setField(term15216, term15216.getClass(), "first", null);
        setField(term15216, term15216.getClass(), "last", null);
        setField(term15216, term15216.getClass(), "propListHead", null);
        setIntField(term15216, term15216.getClass(), "sourcePosition", 0);
        setField(term15216, term15216.getClass(), "jsType", null);
        setField(term15216, term15216.getClass(), "parent", null);
        setField(term15211, term15211.getClass(), "first", term15216);
        setIntField(term15219, term15219.getClass(), "type", 0);
        setField(term15219, term15219.getClass(), "next", null);
        setField(term15219, term15219.getClass(), "first", null);
        setField(term15219, term15219.getClass(), "last", null);
        setField(term15219, term15219.getClass(), "propListHead", null);
        setIntField(term15219, term15219.getClass(), "sourcePosition", 0);
        setField(term15219, term15219.getClass(), "jsType", null);
        setField(term15219, term15219.getClass(), "parent", null);
        setField(term15211, term15211.getClass(), "last", term15219);
        setField(term15222, term15222.getClass(), "next", null);
        setIntField(term15222, term15222.getClass(), "type", 0);
        setIntField(term15222, term15222.getClass(), "intValue", 0);
        setField(term15222, term15222.getClass(), "objectValue", null);
        setField(term15211, term15211.getClass(), "propListHead", term15222);
        setIntField(term15211, term15211.getClass(), "sourcePosition", -1724487863);
        setField(term15211, term15211.getClass(), "jsType", null);
        setField(term15211, term15211.getClass(), "parent", null);
        setField(term15209, term15209.getClass(), "next", term15211);
        setIntField(term15226, term15226.getClass(), "type", 0);
        setField(term15226, term15226.getClass(), "next", null);
        setField(term15226, term15226.getClass(), "first", null);
        setField(term15226, term15226.getClass(), "last", null);
        setField(term15226, term15226.getClass(), "propListHead", null);
        setIntField(term15226, term15226.getClass(), "sourcePosition", 0);
        setField(term15226, term15226.getClass(), "jsType", null);
        setField(term15226, term15226.getClass(), "parent", null);
        setField(term15209, term15209.getClass(), "first", term15226);
        setIntField(term15229, term15229.getClass(), "type", 0);
        setField(term15229, term15229.getClass(), "next", null);
        setField(term15229, term15229.getClass(), "first", null);
        setField(term15229, term15229.getClass(), "last", null);
        setField(term15229, term15229.getClass(), "propListHead", null);
        setIntField(term15229, term15229.getClass(), "sourcePosition", 0);
        setField(term15229, term15229.getClass(), "jsType", null);
        setField(term15229, term15229.getClass(), "parent", null);
        setField(term15209, term15209.getClass(), "last", term15229);
        setField(term15232, term15232.getClass(), "next", null);
        setIntField(term15232, term15232.getClass(), "type", 0);
        setIntField(term15232, term15232.getClass(), "intValue", 0);
        setField(term15232, term15232.getClass(), "objectValue", null);
        setField(term15209, term15209.getClass(), "propListHead", term15232);
        setIntField(term15209, term15209.getClass(), "sourcePosition", -128490829);
        setField(term15209, term15209.getClass(), "jsType", null);
        setField(term15209, term15209.getClass(), "parent", null);
        setField(term15208, term15208.getClass(), "parameters", term15209);
        setField(term15208, term15208.getClass(), "returnType", null);
        setBooleanField(term15208, term15208.getClass(), "resolved", false);
        setField(term15208, term15208.getClass(), "resolveResult", null);
        setField(term15208, term15208.getClass(), "registry", null);
        setField(term15207, term15207.getClass(), "call", term15208);
        setField(term15237, term15237.getClass(), "ownerFunction", null);
        setField(term15237, term15237.getClass(), "className", null);
        setField(term15237, term15237.getClass(), "properties", null);
        setField(term15237, term15237.getClass(), "implicitPrototype", null);
        setBooleanField(term15237, term15237.getClass(), "nativeType", false);
        setBooleanField(term15237, term15237.getClass(), "visited", false);
        setField(term15237, term15237.getClass(), "docInfo", null);
        setBooleanField(term15237, term15237.getClass(), "unknown", false);
        setBooleanField(term15237, term15237.getClass(), "resolved", false);
        setField(term15237, term15237.getClass(), "resolveResult", null);
        setField(term15237, term15237.getClass(), "registry", null);
        setField(term15207, term15207.getClass(), "prototype", term15237);
        setField(term15207, term15207.getClass(), "kind", enum118);
        setField(term15207, term15207.getClass(), "typeOfThis", null);
        setField(term15207, term15207.getClass(), "source", null);
        setField(term15207, term15207.getClass(), "implementedInterfaces", null);
        setField(term15207, term15207.getClass(), "subTypes", null);
        setField(term15207, term15207.getClass(), "templateTypeName", null);
        setField(term15207, term15207.getClass(), "className", null);
        setField(term15207, term15207.getClass(), "properties", null);
        setField(term15207, term15207.getClass(), "implicitPrototype", null);
        setBooleanField(term15207, term15207.getClass(), "nativeType", false);
        setBooleanField(term15207, term15207.getClass(), "visited", false);
        setField(term15207, term15207.getClass(), "docInfo", null);
        setBooleanField(term15207, term15207.getClass(), "unknown", false);
        setBooleanField(term15207, term15207.getClass(), "resolved", false);
        setField(term15207, term15207.getClass(), "resolveResult", null);
        setField(term15207, term15207.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term15207, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


