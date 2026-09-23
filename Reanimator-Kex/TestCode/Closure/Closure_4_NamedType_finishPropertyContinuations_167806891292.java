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

public class NamedType_finishPropertyContinuations_167806891292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91508;

    public NamedType_finishPropertyContinuations_167806891292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term91602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term91508, term91508.getClass(), "referencedObjType", term91508);
        setField(term91508, term91508.getClass(), "referencedType", term91602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finishPropertyContinuations", argTypes, term91508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


