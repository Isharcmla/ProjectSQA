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

public class InlineFunctions_trimCanidatesNotMeetingMinimumRequirements_152658089029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term3155;

    public InlineFunctions_trimCanidatesNotMeetingMinimumRequirements_152658089029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term502 = new HashMap();
        HashMap term517 = new HashMap();
        term501 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term501, term501.getClass(), "fns", term502);
        setField(term501, term501.getClass(), "anonFns", term517);
        setField(term501, term501.getClass(), "compiler", null);
        setField(term501, term501.getClass(), "injector", null);
        setBooleanField(term501, term501.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term501, term501.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term501, term501.getClass(), "inlineLocalFunctions", false);
        setField(term501, term501.getClass(), "specializationState", null);
        HashMap term3156 = new HashMap();
        HashMap term3158 = new HashMap();
        term3155 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term3155, term3155.getClass(), "fns", term3156);
        setField(term3155, term3155.getClass(), "anonFns", term3158);
        setField(term3155, term3155.getClass(), "compiler", null);
        setField(term3155, term3155.getClass(), "injector", null);
        setBooleanField(term3155, term3155.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term3155, term3155.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term3155, term3155.getClass(), "inlineLocalFunctions", false);
        setField(term3155, term3155.getClass(), "specializationState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "trimCanidatesNotMeetingMinimumRequirements", argTypes, term501, args);
        assertTrue(recursiveEquals(term501, term3155));
    }

};


