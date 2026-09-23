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
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041323;
     Object term1041393;

    public TypeInference_traverseReturn_1142297770404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041323 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1041393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1041463, term1041463.getClass(), "type", 29);
        setIntField(term1041533, term1041533.getClass(), "type", 29);
        setIntField(term1041603, term1041603.getClass(), "type", 29);
        setIntField(term1041673, term1041673.getClass(), "type", 29);
        setIntField(term1041743, term1041743.getClass(), "type", 29);
        setIntField(term1041813, term1041813.getClass(), "type", 29);
        setIntField(term1041883, term1041883.getClass(), "type", 29);
        setIntField(term1041953, term1041953.getClass(), "type", 29);
        setIntField(term1042023, term1042023.getClass(), "type", 29);
        setIntField(term1042093, term1042093.getClass(), "type", 29);
        setIntField(term1042163, term1042163.getClass(), "type", 29);
        setIntField(term1042233, term1042233.getClass(), "type", 29);
        setIntField(term1042303, term1042303.getClass(), "type", 29);
        setIntField(term1042373, term1042373.getClass(), "type", 29);
        setIntField(term1042443, term1042443.getClass(), "type", 29);
        setIntField(term1042513, term1042513.getClass(), "type", 29);
        setIntField(term1042583, term1042583.getClass(), "type", 29);
        setIntField(term1042653, term1042653.getClass(), "type", 29);
        setIntField(term1042723, term1042723.getClass(), "type", 29);
        setIntField(term1042793, term1042793.getClass(), "type", 29);
        setIntField(term1042863, term1042863.getClass(), "type", 29);
        setIntField(term1042933, term1042933.getClass(), "type", 29);
        setIntField(term1043003, term1043003.getClass(), "type", 29);
        setIntField(term1043073, term1043073.getClass(), "type", 29);
        setIntField(term1043143, term1043143.getClass(), "type", 29);
        setIntField(term1043213, term1043213.getClass(), "type", 19);
        setField(term1043143, term1043143.getClass(), "first", term1043213);
        setField(term1043073, term1043073.getClass(), "first", term1043143);
        setField(term1043003, term1043003.getClass(), "first", term1043073);
        setField(term1042933, term1042933.getClass(), "first", term1043003);
        setField(term1042863, term1042863.getClass(), "first", term1042933);
        setField(term1042793, term1042793.getClass(), "first", term1042863);
        setField(term1042723, term1042723.getClass(), "first", term1042793);
        setField(term1042653, term1042653.getClass(), "first", term1042723);
        setField(term1042583, term1042583.getClass(), "first", term1042653);
        setField(term1042513, term1042513.getClass(), "first", term1042583);
        setField(term1042443, term1042443.getClass(), "first", term1042513);
        setField(term1042373, term1042373.getClass(), "first", term1042443);
        setField(term1042303, term1042303.getClass(), "first", term1042373);
        setField(term1042233, term1042233.getClass(), "first", term1042303);
        setField(term1042163, term1042163.getClass(), "first", term1042233);
        setField(term1042093, term1042093.getClass(), "first", term1042163);
        setField(term1042023, term1042023.getClass(), "first", term1042093);
        setField(term1041953, term1041953.getClass(), "first", term1042023);
        setField(term1041883, term1041883.getClass(), "first", term1041953);
        setField(term1041813, term1041813.getClass(), "first", term1041883);
        setField(term1041743, term1041743.getClass(), "first", term1041813);
        setField(term1041673, term1041673.getClass(), "first", term1041743);
        setField(term1041603, term1041603.getClass(), "first", term1041673);
        setField(term1041533, term1041533.getClass(), "first", term1041603);
        setField(term1041463, term1041463.getClass(), "first", term1041533);
        setField(term1041393, term1041393.getClass(), "first", term1041463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1041393;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1041323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


