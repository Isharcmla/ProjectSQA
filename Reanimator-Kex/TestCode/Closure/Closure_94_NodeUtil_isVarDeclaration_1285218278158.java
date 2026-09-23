package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_isVarDeclaration_1285218278158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005;
     Object term8773;

    public NodeUtil_isVarDeclaration_1285218278158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1018 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1005, term1005.getClass(), "type", 499519708);
        setIntField(term1007, term1007.getClass(), "type", 200252898);
        setIntField(term1009, term1009.getClass(), "type", 0);
        setField(term1009, term1009.getClass(), "next", null);
        setField(term1009, term1009.getClass(), "first", null);
        setField(term1009, term1009.getClass(), "last", null);
        setField(term1009, term1009.getClass(), "propListHead", null);
        setIntField(term1009, term1009.getClass(), "sourcePosition", 0);
        setField(term1009, term1009.getClass(), "jsType", null);
        setField(term1009, term1009.getClass(), "parent", null);
        setField(term1007, term1007.getClass(), "next", term1009);
        setIntField(term1012, term1012.getClass(), "type", 0);
        setField(term1012, term1012.getClass(), "next", null);
        setField(term1012, term1012.getClass(), "first", null);
        setField(term1012, term1012.getClass(), "last", null);
        setField(term1012, term1012.getClass(), "propListHead", null);
        setIntField(term1012, term1012.getClass(), "sourcePosition", 0);
        setField(term1012, term1012.getClass(), "jsType", null);
        setField(term1012, term1012.getClass(), "parent", null);
        setField(term1007, term1007.getClass(), "first", term1012);
        setIntField(term1015, term1015.getClass(), "type", 0);
        setField(term1015, term1015.getClass(), "next", null);
        setField(term1015, term1015.getClass(), "first", null);
        setField(term1015, term1015.getClass(), "last", null);
        setField(term1015, term1015.getClass(), "propListHead", null);
        setIntField(term1015, term1015.getClass(), "sourcePosition", 0);
        setField(term1015, term1015.getClass(), "jsType", null);
        setField(term1015, term1015.getClass(), "parent", null);
        setField(term1007, term1007.getClass(), "last", term1015);
        setField(term1018, term1018.getClass(), "next", null);
        setIntField(term1018, term1018.getClass(), "type", 0);
        setIntField(term1018, term1018.getClass(), "intValue", 0);
        setField(term1018, term1018.getClass(), "objectValue", null);
        setField(term1007, term1007.getClass(), "propListHead", term1018);
        setIntField(term1007, term1007.getClass(), "sourcePosition", -1577069773);
        setField(term1007, term1007.getClass(), "jsType", null);
        setField(term1007, term1007.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "next", term1007);
        setIntField(term1022, term1022.getClass(), "type", 0);
        setField(term1022, term1022.getClass(), "next", null);
        setField(term1022, term1022.getClass(), "first", null);
        setField(term1022, term1022.getClass(), "last", null);
        setField(term1022, term1022.getClass(), "propListHead", null);
        setIntField(term1022, term1022.getClass(), "sourcePosition", 0);
        setField(term1022, term1022.getClass(), "jsType", null);
        setField(term1022, term1022.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "first", term1022);
        setIntField(term1025, term1025.getClass(), "type", 0);
        setField(term1025, term1025.getClass(), "next", null);
        setField(term1025, term1025.getClass(), "first", null);
        setField(term1025, term1025.getClass(), "last", null);
        setField(term1025, term1025.getClass(), "propListHead", null);
        setIntField(term1025, term1025.getClass(), "sourcePosition", 0);
        setField(term1025, term1025.getClass(), "jsType", null);
        setField(term1025, term1025.getClass(), "parent", null);
        setField(term1005, term1005.getClass(), "last", term1025);
        setField(term1028, term1028.getClass(), "next", null);
        setIntField(term1028, term1028.getClass(), "type", 0);
        setIntField(term1028, term1028.getClass(), "intValue", 0);
        setField(term1028, term1028.getClass(), "objectValue", null);
        setField(term1005, term1005.getClass(), "propListHead", term1028);
        setIntField(term1005, term1005.getClass(), "sourcePosition", -266625190);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        term8773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8778 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8781 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8773, term8773.getClass(), "type", 499519708);
        setIntField(term8774, term8774.getClass(), "type", 200252898);
        setIntField(term8775, term8775.getClass(), "type", 0);
        setField(term8775, term8775.getClass(), "next", null);
        setField(term8775, term8775.getClass(), "first", null);
        setField(term8775, term8775.getClass(), "last", null);
        setField(term8775, term8775.getClass(), "propListHead", null);
        setIntField(term8775, term8775.getClass(), "sourcePosition", 0);
        setField(term8775, term8775.getClass(), "jsType", null);
        setField(term8775, term8775.getClass(), "parent", null);
        setField(term8774, term8774.getClass(), "next", term8775);
        setIntField(term8776, term8776.getClass(), "type", 0);
        setField(term8776, term8776.getClass(), "next", null);
        setField(term8776, term8776.getClass(), "first", null);
        setField(term8776, term8776.getClass(), "last", null);
        setField(term8776, term8776.getClass(), "propListHead", null);
        setIntField(term8776, term8776.getClass(), "sourcePosition", 0);
        setField(term8776, term8776.getClass(), "jsType", null);
        setField(term8776, term8776.getClass(), "parent", null);
        setField(term8774, term8774.getClass(), "first", term8776);
        setIntField(term8777, term8777.getClass(), "type", 0);
        setField(term8777, term8777.getClass(), "next", null);
        setField(term8777, term8777.getClass(), "first", null);
        setField(term8777, term8777.getClass(), "last", null);
        setField(term8777, term8777.getClass(), "propListHead", null);
        setIntField(term8777, term8777.getClass(), "sourcePosition", 0);
        setField(term8777, term8777.getClass(), "jsType", null);
        setField(term8777, term8777.getClass(), "parent", null);
        setField(term8774, term8774.getClass(), "last", term8777);
        setField(term8778, term8778.getClass(), "next", null);
        setIntField(term8778, term8778.getClass(), "type", 0);
        setIntField(term8778, term8778.getClass(), "intValue", 0);
        setField(term8778, term8778.getClass(), "objectValue", null);
        setField(term8774, term8774.getClass(), "propListHead", term8778);
        setIntField(term8774, term8774.getClass(), "sourcePosition", -1577069773);
        setField(term8774, term8774.getClass(), "jsType", null);
        setField(term8774, term8774.getClass(), "parent", null);
        setField(term8773, term8773.getClass(), "next", term8774);
        setIntField(term8779, term8779.getClass(), "type", 0);
        setField(term8779, term8779.getClass(), "next", null);
        setField(term8779, term8779.getClass(), "first", null);
        setField(term8779, term8779.getClass(), "last", null);
        setField(term8779, term8779.getClass(), "propListHead", null);
        setIntField(term8779, term8779.getClass(), "sourcePosition", 0);
        setField(term8779, term8779.getClass(), "jsType", null);
        setField(term8779, term8779.getClass(), "parent", null);
        setField(term8773, term8773.getClass(), "first", term8779);
        setIntField(term8780, term8780.getClass(), "type", 0);
        setField(term8780, term8780.getClass(), "next", null);
        setField(term8780, term8780.getClass(), "first", null);
        setField(term8780, term8780.getClass(), "last", null);
        setField(term8780, term8780.getClass(), "propListHead", null);
        setIntField(term8780, term8780.getClass(), "sourcePosition", 0);
        setField(term8780, term8780.getClass(), "jsType", null);
        setField(term8780, term8780.getClass(), "parent", null);
        setField(term8773, term8773.getClass(), "last", term8780);
        setField(term8781, term8781.getClass(), "next", null);
        setIntField(term8781, term8781.getClass(), "type", 0);
        setIntField(term8781, term8781.getClass(), "intValue", 0);
        setField(term8781, term8781.getClass(), "objectValue", null);
        setField(term8773, term8773.getClass(), "propListHead", term8781);
        setIntField(term8773, term8773.getClass(), "sourcePosition", -266625190);
        setField(term8773, term8773.getClass(), "jsType", null);
        setField(term8773, term8773.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1005;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1005, term8773));
        assertTrue(recursiveEquals(retValue, false));
    }

};


