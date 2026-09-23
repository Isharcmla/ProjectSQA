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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7673;
     Object term7953;
     Object term8073;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7813, term7813.getClass(), "first", term7883);
        setField(term7743, term7743.getClass(), "parent", term7813);
        setField(term7673, term7673.getClass(), "parent", term7743);
        term7953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8073 = newInstance(Class.forName("com.google.common.base.Predicates$AssignableFromPredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term7673;
        args[1] = term7953;
        args[2] = term8073;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


