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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_71041459246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679;
     Object term1680;
     Object term1707;

    public CodeGenerator_addList_71041459246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1679 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1679, term1679.getClass(), "cc", null);
        setField(term1679, term1679.getClass(), "outputCharsetEncoder", null);
        term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1693 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1680, term1680.getClass(), "type", 890669485);
        setIntField(term1682, term1682.getClass(), "type", 906181092);
        setIntField(term1684, term1684.getClass(), "type", 0);
        setField(term1684, term1684.getClass(), "next", null);
        setField(term1684, term1684.getClass(), "first", null);
        setField(term1684, term1684.getClass(), "last", null);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "next", term1684);
        setIntField(term1687, term1687.getClass(), "type", 0);
        setField(term1687, term1687.getClass(), "next", null);
        setField(term1687, term1687.getClass(), "first", null);
        setField(term1687, term1687.getClass(), "last", null);
        setField(term1687, term1687.getClass(), "propListHead", null);
        setIntField(term1687, term1687.getClass(), "sourcePosition", 0);
        setField(term1687, term1687.getClass(), "jsType", null);
        setField(term1687, term1687.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "first", term1687);
        setIntField(term1690, term1690.getClass(), "type", 0);
        setField(term1690, term1690.getClass(), "next", null);
        setField(term1690, term1690.getClass(), "first", null);
        setField(term1690, term1690.getClass(), "last", null);
        setField(term1690, term1690.getClass(), "propListHead", null);
        setIntField(term1690, term1690.getClass(), "sourcePosition", 0);
        setField(term1690, term1690.getClass(), "jsType", null);
        setField(term1690, term1690.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "last", term1690);
        setField(term1693, term1693.getClass(), "next", null);
        setIntField(term1693, term1693.getClass(), "type", 0);
        setIntField(term1693, term1693.getClass(), "intValue", 0);
        setField(term1693, term1693.getClass(), "objectValue", null);
        setField(term1682, term1682.getClass(), "propListHead", term1693);
        setIntField(term1682, term1682.getClass(), "sourcePosition", 1072005683);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "next", term1682);
        setIntField(term1697, term1697.getClass(), "type", 0);
        setField(term1697, term1697.getClass(), "next", null);
        setField(term1697, term1697.getClass(), "first", null);
        setField(term1697, term1697.getClass(), "last", null);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "first", term1697);
        setIntField(term1700, term1700.getClass(), "type", 0);
        setField(term1700, term1700.getClass(), "next", null);
        setField(term1700, term1700.getClass(), "first", null);
        setField(term1700, term1700.getClass(), "last", null);
        setField(term1700, term1700.getClass(), "propListHead", null);
        setIntField(term1700, term1700.getClass(), "sourcePosition", 0);
        setField(term1700, term1700.getClass(), "jsType", null);
        setField(term1700, term1700.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "last", term1700);
        setField(term1703, term1703.getClass(), "next", null);
        setIntField(term1703, term1703.getClass(), "type", 0);
        setIntField(term1703, term1703.getClass(), "intValue", 0);
        setField(term1703, term1703.getClass(), "objectValue", null);
        setField(term1680, term1680.getClass(), "propListHead", term1703);
        setIntField(term1680, term1680.getClass(), "sourcePosition", 1861318859);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        term1707 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1680;
        args[1] = term1707;
        try {
            callMethod(klass, "addList", argTypes, term1679, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


