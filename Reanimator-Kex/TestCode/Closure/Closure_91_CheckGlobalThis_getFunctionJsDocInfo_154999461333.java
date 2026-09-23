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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9733;
     Object term9803;
     Object term10584;
     Object term10585;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9733 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term9803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9899 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9899, term9899.getClass(), "type", -30);
        setField(term9899, term9899.getClass(), "next", null);
        setField(term9803, term9803.getClass(), "propListHead", term9899);
        setIntField(term9969, term9969.getClass(), "type", 38);
        setField(term9969, term9969.getClass(), "propListHead", null);
        setField(term9969, term9969.getClass(), "parent", term9803);
        setField(term9803, term9803.getClass(), "parent", term9969);
        term10584 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term10584, term10584.getClass(), "compiler", null);
        setField(term10584, term10584.getClass(), "level", null);
        setField(term10584, term10584.getClass(), "assignLhsChild", null);
        term10585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10586 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10585, term10585.getClass(), "type", 0);
        setField(term10585, term10585.getClass(), "next", null);
        setField(term10585, term10585.getClass(), "first", null);
        setField(term10585, term10585.getClass(), "last", null);
        setField(term10586, term10586.getClass(), "next", null);
        setIntField(term10586, term10586.getClass(), "type", -30);
        setIntField(term10586, term10586.getClass(), "intValue", 0);
        setField(term10586, term10586.getClass(), "objectValue", null);
        setField(term10585, term10585.getClass(), "propListHead", term10586);
        setIntField(term10585, term10585.getClass(), "sourcePosition", 0);
        setField(term10585, term10585.getClass(), "jsType", null);
        setIntField(term10587, term10587.getClass(), "type", 38);
        setField(term10587, term10587.getClass(), "next", null);
        setField(term10587, term10587.getClass(), "first", null);
        setField(term10587, term10587.getClass(), "last", null);
        setField(term10587, term10587.getClass(), "propListHead", null);
        setIntField(term10587, term10587.getClass(), "sourcePosition", 0);
        setField(term10587, term10587.getClass(), "jsType", null);
        setField(term10587, term10587.getClass(), "parent", term10585);
        setField(term10585, term10585.getClass(), "parent", term10587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9803;
        Object retValue = callMethod(klass, "getFunctionJsDocInfo", argTypes, term9733, args);
        assertTrue(recursiveEquals(term9733, term10584));
        assertTrue(recursiveEquals(term9803, term10585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


