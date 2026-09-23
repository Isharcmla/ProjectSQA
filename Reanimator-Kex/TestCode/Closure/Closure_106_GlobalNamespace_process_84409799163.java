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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GlobalNamespace_process_84409799163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14702;

    public GlobalNamespace_process_84409799163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14702 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term14772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14852 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setIntField(term14772, term14772.getClass(), "type", 0);
        setField(term14772, term14772.getClass(), "first", null);
        setField(term14702, term14702.getClass(), "externsRoot", term14772);
        setBooleanField(term14702, term14702.getClass(), "inExterns", false);
        setField(term14702, term14702.getClass(), "compiler", term14852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "process", argTypes, term14702, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


