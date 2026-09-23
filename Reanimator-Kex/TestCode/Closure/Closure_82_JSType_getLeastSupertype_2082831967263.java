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

public class JSType_getLeastSupertype_2082831967263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46860;
     Object term46870;
     Object term46871;
     Object term46864;

    public JSType_getLeastSupertype_2082831967263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term46870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term46870, term46870.getClass(), "isChecked", false);
        setBooleanField(term46870, term46870.getClass(), "visited", false);
        setField(term46870, term46870.getClass(), "docInfo", null);
        setBooleanField(term46870, term46870.getClass(), "unknown", false);
        setBooleanField(term46870, term46870.getClass(), "resolved", false);
        setField(term46870, term46870.getClass(), "resolveResult", null);
        setField(term46870, term46870.getClass(), "registry", null);
        term46871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term46871, term46871.getClass(), "isChecked", false);
        setBooleanField(term46871, term46871.getClass(), "visited", false);
        setField(term46871, term46871.getClass(), "docInfo", null);
        setBooleanField(term46871, term46871.getClass(), "unknown", false);
        setBooleanField(term46871, term46871.getClass(), "resolved", false);
        setField(term46871, term46871.getClass(), "resolveResult", null);
        setField(term46871, term46871.getClass(), "registry", null);
        term46864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term46864, term46864.getClass(), "isChecked", false);
        setBooleanField(term46864, term46864.getClass(), "visited", false);
        setField(term46864, term46864.getClass(), "docInfo", null);
        setBooleanField(term46864, term46864.getClass(), "unknown", false);
        setBooleanField(term46864, term46864.getClass(), "resolved", false);
        setField(term46864, term46864.getClass(), "resolveResult", null);
        setField(term46864, term46864.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term46860;
        args[1] = term46860;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term46860, term46870));
        assertTrue(recursiveEquals(term46860, term46871));
        assertTrue(recursiveEquals(retValue, term46864));
    }

};


