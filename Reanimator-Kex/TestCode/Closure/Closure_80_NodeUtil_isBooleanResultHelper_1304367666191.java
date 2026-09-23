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

public class NodeUtil_isBooleanResultHelper_1304367666191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;
     Object term10440;

    public NodeUtil_isBooleanResultHelper_1304367666191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1008 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1018 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term995, term995.getClass(), "type", -439048495);
        setIntField(term997, term997.getClass(), "type", 787278105);
        setIntField(term999, term999.getClass(), "type", 0);
        setField(term999, term999.getClass(), "next", null);
        setField(term999, term999.getClass(), "first", null);
        setField(term999, term999.getClass(), "last", null);
        setField(term999, term999.getClass(), "propListHead", null);
        setIntField(term999, term999.getClass(), "sourcePosition", 0);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
        setField(term997, term997.getClass(), "next", term999);
        setIntField(term1002, term1002.getClass(), "type", 0);
        setField(term1002, term1002.getClass(), "next", null);
        setField(term1002, term1002.getClass(), "first", null);
        setField(term1002, term1002.getClass(), "last", null);
        setField(term1002, term1002.getClass(), "propListHead", null);
        setIntField(term1002, term1002.getClass(), "sourcePosition", 0);
        setField(term1002, term1002.getClass(), "jsType", null);
        setField(term1002, term1002.getClass(), "parent", null);
        setField(term997, term997.getClass(), "first", term1002);
        setIntField(term1005, term1005.getClass(), "type", 0);
        setField(term1005, term1005.getClass(), "next", null);
        setField(term1005, term1005.getClass(), "first", null);
        setField(term1005, term1005.getClass(), "last", null);
        setField(term1005, term1005.getClass(), "propListHead", null);
        setIntField(term1005, term1005.getClass(), "sourcePosition", 0);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term997, term997.getClass(), "last", term1005);
        setField(term1008, term1008.getClass(), "next", null);
        setIntField(term1008, term1008.getClass(), "type", 0);
        setIntField(term1008, term1008.getClass(), "intValue", 0);
        setField(term1008, term1008.getClass(), "objectValue", null);
        setField(term997, term997.getClass(), "propListHead", term1008);
        setIntField(term997, term997.getClass(), "sourcePosition", 320711637);
        setField(term997, term997.getClass(), "jsType", null);
        setField(term997, term997.getClass(), "parent", null);
        setField(term995, term995.getClass(), "next", term997);
        setIntField(term1012, term1012.getClass(), "type", 0);
        setField(term1012, term1012.getClass(), "next", null);
        setField(term1012, term1012.getClass(), "first", null);
        setField(term1012, term1012.getClass(), "last", null);
        setField(term1012, term1012.getClass(), "propListHead", null);
        setIntField(term1012, term1012.getClass(), "sourcePosition", 0);
        setField(term1012, term1012.getClass(), "jsType", null);
        setField(term1012, term1012.getClass(), "parent", null);
        setField(term995, term995.getClass(), "first", term1012);
        setIntField(term1015, term1015.getClass(), "type", 0);
        setField(term1015, term1015.getClass(), "next", null);
        setField(term1015, term1015.getClass(), "first", null);
        setField(term1015, term1015.getClass(), "last", null);
        setField(term1015, term1015.getClass(), "propListHead", null);
        setIntField(term1015, term1015.getClass(), "sourcePosition", 0);
        setField(term1015, term1015.getClass(), "jsType", null);
        setField(term1015, term1015.getClass(), "parent", null);
        setField(term995, term995.getClass(), "last", term1015);
        setField(term1018, term1018.getClass(), "next", null);
        setIntField(term1018, term1018.getClass(), "type", 0);
        setIntField(term1018, term1018.getClass(), "intValue", 0);
        setField(term1018, term1018.getClass(), "objectValue", null);
        setField(term995, term995.getClass(), "propListHead", term1018);
        setIntField(term995, term995.getClass(), "sourcePosition", 1241164745);
        setField(term995, term995.getClass(), "jsType", null);
        setField(term995, term995.getClass(), "parent", null);
        term10440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10445 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10448 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10440, term10440.getClass(), "type", -439048495);
        setIntField(term10441, term10441.getClass(), "type", 787278105);
        setIntField(term10442, term10442.getClass(), "type", 0);
        setField(term10442, term10442.getClass(), "next", null);
        setField(term10442, term10442.getClass(), "first", null);
        setField(term10442, term10442.getClass(), "last", null);
        setField(term10442, term10442.getClass(), "propListHead", null);
        setIntField(term10442, term10442.getClass(), "sourcePosition", 0);
        setField(term10442, term10442.getClass(), "jsType", null);
        setField(term10442, term10442.getClass(), "parent", null);
        setField(term10441, term10441.getClass(), "next", term10442);
        setIntField(term10443, term10443.getClass(), "type", 0);
        setField(term10443, term10443.getClass(), "next", null);
        setField(term10443, term10443.getClass(), "first", null);
        setField(term10443, term10443.getClass(), "last", null);
        setField(term10443, term10443.getClass(), "propListHead", null);
        setIntField(term10443, term10443.getClass(), "sourcePosition", 0);
        setField(term10443, term10443.getClass(), "jsType", null);
        setField(term10443, term10443.getClass(), "parent", null);
        setField(term10441, term10441.getClass(), "first", term10443);
        setIntField(term10444, term10444.getClass(), "type", 0);
        setField(term10444, term10444.getClass(), "next", null);
        setField(term10444, term10444.getClass(), "first", null);
        setField(term10444, term10444.getClass(), "last", null);
        setField(term10444, term10444.getClass(), "propListHead", null);
        setIntField(term10444, term10444.getClass(), "sourcePosition", 0);
        setField(term10444, term10444.getClass(), "jsType", null);
        setField(term10444, term10444.getClass(), "parent", null);
        setField(term10441, term10441.getClass(), "last", term10444);
        setField(term10445, term10445.getClass(), "next", null);
        setIntField(term10445, term10445.getClass(), "type", 0);
        setIntField(term10445, term10445.getClass(), "intValue", 0);
        setField(term10445, term10445.getClass(), "objectValue", null);
        setField(term10441, term10441.getClass(), "propListHead", term10445);
        setIntField(term10441, term10441.getClass(), "sourcePosition", 320711637);
        setField(term10441, term10441.getClass(), "jsType", null);
        setField(term10441, term10441.getClass(), "parent", null);
        setField(term10440, term10440.getClass(), "next", term10441);
        setIntField(term10446, term10446.getClass(), "type", 0);
        setField(term10446, term10446.getClass(), "next", null);
        setField(term10446, term10446.getClass(), "first", null);
        setField(term10446, term10446.getClass(), "last", null);
        setField(term10446, term10446.getClass(), "propListHead", null);
        setIntField(term10446, term10446.getClass(), "sourcePosition", 0);
        setField(term10446, term10446.getClass(), "jsType", null);
        setField(term10446, term10446.getClass(), "parent", null);
        setField(term10440, term10440.getClass(), "first", term10446);
        setIntField(term10447, term10447.getClass(), "type", 0);
        setField(term10447, term10447.getClass(), "next", null);
        setField(term10447, term10447.getClass(), "first", null);
        setField(term10447, term10447.getClass(), "last", null);
        setField(term10447, term10447.getClass(), "propListHead", null);
        setIntField(term10447, term10447.getClass(), "sourcePosition", 0);
        setField(term10447, term10447.getClass(), "jsType", null);
        setField(term10447, term10447.getClass(), "parent", null);
        setField(term10440, term10440.getClass(), "last", term10447);
        setField(term10448, term10448.getClass(), "next", null);
        setIntField(term10448, term10448.getClass(), "type", 0);
        setIntField(term10448, term10448.getClass(), "intValue", 0);
        setField(term10448, term10448.getClass(), "objectValue", null);
        setField(term10440, term10440.getClass(), "propListHead", term10448);
        setIntField(term10440, term10440.getClass(), "sourcePosition", 1241164745);
        setField(term10440, term10440.getClass(), "jsType", null);
        setField(term10440, term10440.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term995;
        Object retValue = callMethod(klass, "isBooleanResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term995, term10440));
        assertTrue(recursiveEquals(retValue, false));
    }

};


