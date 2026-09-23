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

public class AnalyzePrototypeProperties_getAllNameInfo_8888238357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162;

    public AnalyzePrototypeProperties_getAllNameInfo_8888238357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1162 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term1162, term1162.getClass(), "PROPERTY", null);
        setField(term1162, term1162.getClass(), "VAR", null);
        setField(term1162, term1162.getClass(), "compiler", null);
        setBooleanField(term1162, term1162.getClass(), "canModifyExterns", false);
        setBooleanField(term1162, term1162.getClass(), "anchorUnusedVars", false);
        setField(term1162, term1162.getClass(), "moduleGraph", null);
        setField(term1162, term1162.getClass(), "firstModule", null);
        setField(term1162, term1162.getClass(), "symbolGraph", null);
        setField(term1162, term1162.getClass(), "globalNode", null);
        setField(term1162, term1162.getClass(), "externNode", null);
        setField(term1162, term1162.getClass(), "anonymousNode", null);
        setField(term1162, term1162.getClass(), "propertyNameInfo", null);
        setField(term1162, term1162.getClass(), "varNameInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllNameInfo", argTypes, term1162, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


