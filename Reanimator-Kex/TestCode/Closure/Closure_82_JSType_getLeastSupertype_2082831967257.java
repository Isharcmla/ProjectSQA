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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class JSType_getLeastSupertype_2082831967257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45457;
     Object term45720;
     Object term45721;
     Object term45717;

    public JSType_getLeastSupertype_2082831967257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term45720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term45720, term45720.getClass(), "resolved", false);
        setField(term45720, term45720.getClass(), "resolveResult", null);
        setField(term45720, term45720.getClass(), "registry", null);
        term45721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term45721, term45721.getClass(), "resolved", false);
        setField(term45721, term45721.getClass(), "resolveResult", null);
        setField(term45721, term45721.getClass(), "registry", null);
        term45717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term45717, term45717.getClass(), "resolved", false);
        setField(term45717, term45717.getClass(), "resolveResult", null);
        setField(term45717, term45717.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term45457;
        args[1] = term45457;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term45457, term45720));
        assertTrue(recursiveEquals(term45457, term45721));
        assertTrue(recursiveEquals(retValue, term45717));
    }

};


