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
import java.util.ArrayList;
import java.lang.Object;

public class FunctionType_getAllExtendedInterfaces_1030455110610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584652;

    public FunctionType_getAllExtendedInterfaces_1030455110610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term584798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term584798, term584798.getClass(), "referencedObjType", null);
        Object term584836 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term584704 = new ArrayList();
        ((ArrayList) term584704).add(term584798);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add((Object)null);
        ((ArrayList) term584704).add(term584836);
        term584652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term584652, term584652.getClass(), "extendedInterfaces", term584704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllExtendedInterfaces", argTypes, term584652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


