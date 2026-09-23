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

public class SemanticReverseAbstractInterpreter_caseEquality_6465389766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12287;
     Object term12357;
     Object term12521;
     Object term12625;

    public SemanticReverseAbstractInterpreter_caseEquality_6465389766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12287 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term12357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term12357, term12357.getClass(), "type", -1012924406);
        setField(term12357, term12357.getClass(), "jsType", term12451);
        term12521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12521, term12521.getClass(), "type", 1012924320);
        setField(term12521, term12521.getClass(), "jsType", null);
        term12625 = newInstance(Class.forName("com.google.common.base.Functions$SupplierFunction"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[3] = Class.forName("com.google.common.base.Function");
        Object[] args = new Object[4];
        args[0] = term12357;
        args[1] = term12521;
        args[2] = null;
        args[3] = term12625;
        try {
            callMethod(klass, "caseEquality", argTypes, term12287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


