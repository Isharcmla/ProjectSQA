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
import java.util.ArrayList;
import java.lang.Object;

public class UnionType_getPossibleToBooleanOutcomes_1306211320149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29083;

    public UnionType_getPossibleToBooleanOutcomes_1306211320149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29173 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term29135 = new ArrayList();
        ((ArrayList) term29135).add(term29173);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        ((ArrayList) term29135).add((Object)null);
        term29083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term29083, term29083.getClass(), "alternates", term29135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term29083, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


