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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277680;
     Object term277750;

    public ReferenceCollectingCallback_hotSwapScript_316460051757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277680 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term277680, term277680.getClass(), "compiler", null);
        term277750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277852 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term277960 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term277750, term277750.getClass(), "type", 132);
        setIntField(term277852, term277852.getClass(), "propType", -54);
        setField(term277852, term277852.getClass(), "next", term277960);
        setField(term277750, term277750.getClass(), "propListHead", term277852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term277750;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term277680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


