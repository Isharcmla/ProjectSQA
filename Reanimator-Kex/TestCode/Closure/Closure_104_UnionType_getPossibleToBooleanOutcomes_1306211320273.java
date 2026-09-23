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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class UnionType_getPossibleToBooleanOutcomes_1306211320273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96721;

    public UnionType_getPossibleToBooleanOutcomes_1306211320273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term97022 = new HashMap();
        Set term96931 =  ((HashMap) term97022).keySet();
        HashSet term96769 = new HashSet();
        ((HashSet) term96769).add(term96931);
        term96721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term96721, term96721.getClass(), "alternates", term96769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term96721, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


