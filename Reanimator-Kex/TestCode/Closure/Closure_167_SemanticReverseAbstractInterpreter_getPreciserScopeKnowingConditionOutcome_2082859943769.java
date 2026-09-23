package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230312;
     Object term230508;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230312 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term230416 = newInstance(Class.forName("com.google.common.base.Functions$SupplierFunction"));
        setField(term230312, term230312.getClass(), "INEQ", term230416);
        term230508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term230600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term230696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term230508, term230508.getClass(), "type", 14);
        setIntField(term230600, term230600.getClass(), "type", 14);
        setField(term230600, term230600.getClass(), "jsType", term230696);
        setField(term230508, term230508.getClass(), "first", term230600);
        setField(term230508, term230508.getClass(), "last", term230508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term230508;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term230312, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


