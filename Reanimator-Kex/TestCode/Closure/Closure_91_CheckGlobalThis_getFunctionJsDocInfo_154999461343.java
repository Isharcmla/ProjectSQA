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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12630;
     Object term12700;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12630 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term12700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12796 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12962 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12796, term12796.getClass(), "type", -30);
        setField(term12796, term12796.getClass(), "next", null);
        setField(term12700, term12700.getClass(), "propListHead", term12796);
        setIntField(term12866, term12866.getClass(), "type", 38);
        setField(term12866, term12866.getClass(), "propListHead", term12962);
        setField(term12700, term12700.getClass(), "parent", term12866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12700;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term12630, args);
    }

};


