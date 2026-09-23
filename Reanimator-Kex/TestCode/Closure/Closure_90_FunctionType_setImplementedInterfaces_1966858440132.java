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
import java.util.LinkedList;

public class FunctionType_setImplementedInterfaces_1966858440132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71218;
     Object term71376;

    public FunctionType_setImplementedInterfaces_1966858440132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term71322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term71218, term71218.getClass(), "registry", term71322);
        term71376 = new LinkedList();
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
        ((LinkedList) term71376).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term71376;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term71218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


