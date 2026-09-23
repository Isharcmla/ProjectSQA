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
import java.lang.Object;

public class CheckGlobalThis_getFunctionJsDocInfo_154999461386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25777;
     Object term25869;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25777 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term25869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term25965 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term26057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term25965, term25965.getClass(), "type", -30);
        setField(term25965, term25965.getClass(), "next", null);
        setField(term25869, term25869.getClass(), "propListHead", term25965);
        setIntField(term26057, term26057.getClass(), "type", 38);
        setField(term26057, term26057.getClass(), "propListHead", null);
        setField(term26057, term26057.getClass(), "parent", term26149);
        setField(term25869, term25869.getClass(), "parent", term26057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25869;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term25777, args);
    }

};


