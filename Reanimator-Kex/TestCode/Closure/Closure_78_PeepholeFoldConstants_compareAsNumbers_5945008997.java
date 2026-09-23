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

public class PeepholeFoldConstants_compareAsNumbers_5945008997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16380;
     Object term16450;
     Object term17010;
     Object term17011;

    public PeepholeFoldConstants_compareAsNumbers_5945008997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16380 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term17010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term17010, term17010.getClass(), "currentTraversal", null);
        term17011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17011, term17011.getClass(), "type", 0);
        setField(term17011, term17011.getClass(), "next", null);
        setField(term17011, term17011.getClass(), "first", null);
        setField(term17011, term17011.getClass(), "last", null);
        setField(term17011, term17011.getClass(), "propListHead", null);
        setIntField(term17011, term17011.getClass(), "sourcePosition", 0);
        setField(term17011, term17011.getClass(), "jsType", null);
        setField(term17011, term17011.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term16450;
        args[2] = null;
        Object retValue = callMethod(klass, "compareAsNumbers", argTypes, term16380, args);
        assertTrue(recursiveEquals(term16380, term17010));
        assertTrue(recursiveEquals(term16450, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


