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
import java.util.HashMap;
import java.util.ArrayList;

public class AnalyzePrototypeProperties_getAllNameInfo_88882383517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11312;
     Object term11804;
     Object term11785;

    public AnalyzePrototypeProperties_getAllNameInfo_88882383517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11360 = new HashMap();
        HashMap term11408 = new HashMap();
        term11312 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term11312, term11312.getClass(), "propertyNameInfo", term11360);
        setField(term11312, term11312.getClass(), "varNameInfo", term11408);
        HashMap term11805 = new HashMap();
        HashMap term11807 = new HashMap();
        term11804 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term11804, term11804.getClass(), "PROPERTY", null);
        setField(term11804, term11804.getClass(), "VAR", null);
        setField(term11804, term11804.getClass(), "compiler", null);
        setBooleanField(term11804, term11804.getClass(), "canModifyExterns", false);
        setBooleanField(term11804, term11804.getClass(), "anchorUnusedVars", false);
        setField(term11804, term11804.getClass(), "moduleGraph", null);
        setField(term11804, term11804.getClass(), "firstModule", null);
        setField(term11804, term11804.getClass(), "symbolGraph", null);
        setField(term11804, term11804.getClass(), "globalNode", null);
        setField(term11804, term11804.getClass(), "externNode", null);
        setField(term11804, term11804.getClass(), "anonymousNode", null);
        setField(term11804, term11804.getClass(), "propertyNameInfo", term11805);
        setField(term11804, term11804.getClass(), "varNameInfo", term11807);
        term11785 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllNameInfo", argTypes, term11312, args);
        assertTrue(recursiveEquals(term11312, term11804));
        assertTrue(recursiveEquals(retValue, term11785));
    }

};


