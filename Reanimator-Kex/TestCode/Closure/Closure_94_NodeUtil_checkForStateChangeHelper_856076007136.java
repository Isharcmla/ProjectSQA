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
import java.lang.Boolean;

public class NodeUtil_checkForStateChangeHelper_856076007136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term460;
     Object term5863;

    public NodeUtil_checkForStateChangeHelper_856076007136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term433, term433.getClass(), "type", -506958186);
        setIntField(term435, term435.getClass(), "type", 729658803);
        setIntField(term437, term437.getClass(), "type", 0);
        setField(term437, term437.getClass(), "next", null);
        setField(term437, term437.getClass(), "first", null);
        setField(term437, term437.getClass(), "last", null);
        setField(term437, term437.getClass(), "propListHead", null);
        setIntField(term437, term437.getClass(), "sourcePosition", 0);
        setField(term437, term437.getClass(), "jsType", null);
        setField(term437, term437.getClass(), "parent", null);
        setField(term435, term435.getClass(), "next", term437);
        setIntField(term440, term440.getClass(), "type", 0);
        setField(term440, term440.getClass(), "next", null);
        setField(term440, term440.getClass(), "first", null);
        setField(term440, term440.getClass(), "last", null);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term435, term435.getClass(), "first", term440);
        setIntField(term443, term443.getClass(), "type", 0);
        setField(term443, term443.getClass(), "next", null);
        setField(term443, term443.getClass(), "first", null);
        setField(term443, term443.getClass(), "last", null);
        setField(term443, term443.getClass(), "propListHead", null);
        setIntField(term443, term443.getClass(), "sourcePosition", 0);
        setField(term443, term443.getClass(), "jsType", null);
        setField(term443, term443.getClass(), "parent", null);
        setField(term435, term435.getClass(), "last", term443);
        setField(term446, term446.getClass(), "next", null);
        setIntField(term446, term446.getClass(), "type", 0);
        setIntField(term446, term446.getClass(), "intValue", 0);
        setField(term446, term446.getClass(), "objectValue", null);
        setField(term435, term435.getClass(), "propListHead", term446);
        setIntField(term435, term435.getClass(), "sourcePosition", 584893196);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term433, term433.getClass(), "next", term435);
        setIntField(term450, term450.getClass(), "type", 0);
        setField(term450, term450.getClass(), "next", null);
        setField(term450, term450.getClass(), "first", null);
        setField(term450, term450.getClass(), "last", null);
        setField(term450, term450.getClass(), "propListHead", null);
        setIntField(term450, term450.getClass(), "sourcePosition", 0);
        setField(term450, term450.getClass(), "jsType", null);
        setField(term450, term450.getClass(), "parent", null);
        setField(term433, term433.getClass(), "first", term450);
        setIntField(term453, term453.getClass(), "type", 0);
        setField(term453, term453.getClass(), "next", null);
        setField(term453, term453.getClass(), "first", null);
        setField(term453, term453.getClass(), "last", null);
        setField(term453, term453.getClass(), "propListHead", null);
        setIntField(term453, term453.getClass(), "sourcePosition", 0);
        setField(term453, term453.getClass(), "jsType", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term433, term433.getClass(), "last", term453);
        setField(term456, term456.getClass(), "next", null);
        setIntField(term456, term456.getClass(), "type", 0);
        setIntField(term456, term456.getClass(), "intValue", 0);
        setField(term456, term456.getClass(), "objectValue", null);
        setField(term433, term433.getClass(), "propListHead", term456);
        setIntField(term433, term433.getClass(), "sourcePosition", 497269071);
        setField(term433, term433.getClass(), "jsType", null);
        setField(term433, term433.getClass(), "parent", null);
        term460 = new Boolean(false);
        term5863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5868 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5871 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5863, term5863.getClass(), "type", -506958186);
        setIntField(term5864, term5864.getClass(), "type", 729658803);
        setIntField(term5865, term5865.getClass(), "type", 0);
        setField(term5865, term5865.getClass(), "next", null);
        setField(term5865, term5865.getClass(), "first", null);
        setField(term5865, term5865.getClass(), "last", null);
        setField(term5865, term5865.getClass(), "propListHead", null);
        setIntField(term5865, term5865.getClass(), "sourcePosition", 0);
        setField(term5865, term5865.getClass(), "jsType", null);
        setField(term5865, term5865.getClass(), "parent", null);
        setField(term5864, term5864.getClass(), "next", term5865);
        setIntField(term5866, term5866.getClass(), "type", 0);
        setField(term5866, term5866.getClass(), "next", null);
        setField(term5866, term5866.getClass(), "first", null);
        setField(term5866, term5866.getClass(), "last", null);
        setField(term5866, term5866.getClass(), "propListHead", null);
        setIntField(term5866, term5866.getClass(), "sourcePosition", 0);
        setField(term5866, term5866.getClass(), "jsType", null);
        setField(term5866, term5866.getClass(), "parent", null);
        setField(term5864, term5864.getClass(), "first", term5866);
        setIntField(term5867, term5867.getClass(), "type", 0);
        setField(term5867, term5867.getClass(), "next", null);
        setField(term5867, term5867.getClass(), "first", null);
        setField(term5867, term5867.getClass(), "last", null);
        setField(term5867, term5867.getClass(), "propListHead", null);
        setIntField(term5867, term5867.getClass(), "sourcePosition", 0);
        setField(term5867, term5867.getClass(), "jsType", null);
        setField(term5867, term5867.getClass(), "parent", null);
        setField(term5864, term5864.getClass(), "last", term5867);
        setField(term5868, term5868.getClass(), "next", null);
        setIntField(term5868, term5868.getClass(), "type", 0);
        setIntField(term5868, term5868.getClass(), "intValue", 0);
        setField(term5868, term5868.getClass(), "objectValue", null);
        setField(term5864, term5864.getClass(), "propListHead", term5868);
        setIntField(term5864, term5864.getClass(), "sourcePosition", 584893196);
        setField(term5864, term5864.getClass(), "jsType", null);
        setField(term5864, term5864.getClass(), "parent", null);
        setField(term5863, term5863.getClass(), "next", term5864);
        setIntField(term5869, term5869.getClass(), "type", 0);
        setField(term5869, term5869.getClass(), "next", null);
        setField(term5869, term5869.getClass(), "first", null);
        setField(term5869, term5869.getClass(), "last", null);
        setField(term5869, term5869.getClass(), "propListHead", null);
        setIntField(term5869, term5869.getClass(), "sourcePosition", 0);
        setField(term5869, term5869.getClass(), "jsType", null);
        setField(term5869, term5869.getClass(), "parent", null);
        setField(term5863, term5863.getClass(), "first", term5869);
        setIntField(term5870, term5870.getClass(), "type", 0);
        setField(term5870, term5870.getClass(), "next", null);
        setField(term5870, term5870.getClass(), "first", null);
        setField(term5870, term5870.getClass(), "last", null);
        setField(term5870, term5870.getClass(), "propListHead", null);
        setIntField(term5870, term5870.getClass(), "sourcePosition", 0);
        setField(term5870, term5870.getClass(), "jsType", null);
        setField(term5870, term5870.getClass(), "parent", null);
        setField(term5863, term5863.getClass(), "last", term5870);
        setField(term5871, term5871.getClass(), "next", null);
        setIntField(term5871, term5871.getClass(), "type", 0);
        setIntField(term5871, term5871.getClass(), "intValue", 0);
        setField(term5871, term5871.getClass(), "objectValue", null);
        setField(term5863, term5863.getClass(), "propListHead", term5871);
        setIntField(term5863, term5863.getClass(), "sourcePosition", 497269071);
        setField(term5863, term5863.getClass(), "jsType", null);
        setField(term5863, term5863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term433;
        args[1] = term460;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term433, term5863));
        assertTrue(recursiveEquals(term460, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


