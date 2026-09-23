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

public class TypeInference_traverseArrayLiteral_67090236359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1234343;
     Object term1234413;

    public TypeInference_traverseArrayLiteral_67090236359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1234343 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1234413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1234483, term1234483.getClass(), "type", 83);
        setIntField(term1234553, term1234553.getClass(), "type", 83);
        setIntField(term1234623, term1234623.getClass(), "type", 83);
        setIntField(term1234693, term1234693.getClass(), "type", 83);
        setIntField(term1234763, term1234763.getClass(), "type", 83);
        setIntField(term1234833, term1234833.getClass(), "type", 83);
        setIntField(term1234903, term1234903.getClass(), "type", 83);
        setIntField(term1234973, term1234973.getClass(), "type", 83);
        setIntField(term1235043, term1235043.getClass(), "type", 83);
        setIntField(term1235113, term1235113.getClass(), "type", 83);
        setIntField(term1235183, term1235183.getClass(), "type", 83);
        setIntField(term1235253, term1235253.getClass(), "type", 83);
        setIntField(term1235323, term1235323.getClass(), "type", 83);
        setIntField(term1235393, term1235393.getClass(), "type", 83);
        setIntField(term1235463, term1235463.getClass(), "type", 83);
        setIntField(term1235533, term1235533.getClass(), "type", 83);
        setIntField(term1235603, term1235603.getClass(), "type", 83);
        setIntField(term1235673, term1235673.getClass(), "type", 83);
        setIntField(term1235743, term1235743.getClass(), "type", 83);
        setIntField(term1235813, term1235813.getClass(), "type", 83);
        setIntField(term1235883, term1235883.getClass(), "type", 83);
        setIntField(term1235953, term1235953.getClass(), "type", 83);
        setIntField(term1236023, term1236023.getClass(), "type", 83);
        setIntField(term1236093, term1236093.getClass(), "type", 83);
        setIntField(term1236163, term1236163.getClass(), "type", 83);
        setIntField(term1236233, term1236233.getClass(), "type", 83);
        setIntField(term1236303, term1236303.getClass(), "type", 83);
        setIntField(term1236373, term1236373.getClass(), "type", 83);
        setIntField(term1236443, term1236443.getClass(), "type", 83);
        setIntField(term1236513, term1236513.getClass(), "type", 83);
        setIntField(term1236583, term1236583.getClass(), "type", 83);
        setIntField(term1236653, term1236653.getClass(), "type", 83);
        setIntField(term1236723, term1236723.getClass(), "type", 83);
        setIntField(term1236793, term1236793.getClass(), "type", 83);
        setIntField(term1236863, term1236863.getClass(), "type", 83);
        setIntField(term1236933, term1236933.getClass(), "type", 83);
        setIntField(term1237003, term1237003.getClass(), "type", 83);
        setIntField(term1237073, term1237073.getClass(), "type", 83);
        setIntField(term1237143, term1237143.getClass(), "type", 83);
        setIntField(term1237213, term1237213.getClass(), "type", 83);
        setIntField(term1237283, term1237283.getClass(), "type", 83);
        setIntField(term1237353, term1237353.getClass(), "type", 83);
        setIntField(term1237423, term1237423.getClass(), "type", 83);
        setIntField(term1237493, term1237493.getClass(), "type", 83);
        setIntField(term1237563, term1237563.getClass(), "type", 83);
        setIntField(term1237633, term1237633.getClass(), "type", 51);
        setField(term1237563, term1237563.getClass(), "first", term1237633);
        setField(term1237493, term1237493.getClass(), "first", term1237563);
        setField(term1237423, term1237423.getClass(), "first", term1237493);
        setField(term1237353, term1237353.getClass(), "first", term1237423);
        setField(term1237283, term1237283.getClass(), "first", term1237353);
        setField(term1237213, term1237213.getClass(), "first", term1237283);
        setField(term1237143, term1237143.getClass(), "first", term1237213);
        setField(term1237073, term1237073.getClass(), "first", term1237143);
        setField(term1237003, term1237003.getClass(), "first", term1237073);
        setField(term1236933, term1236933.getClass(), "first", term1237003);
        setField(term1236863, term1236863.getClass(), "first", term1236933);
        setField(term1236793, term1236793.getClass(), "first", term1236863);
        setField(term1236723, term1236723.getClass(), "first", term1236793);
        setField(term1236653, term1236653.getClass(), "first", term1236723);
        setField(term1236583, term1236583.getClass(), "first", term1236653);
        setField(term1236513, term1236513.getClass(), "first", term1236583);
        setField(term1236443, term1236443.getClass(), "first", term1236513);
        setField(term1236373, term1236373.getClass(), "first", term1236443);
        setField(term1236303, term1236303.getClass(), "first", term1236373);
        setField(term1236233, term1236233.getClass(), "first", term1236303);
        setField(term1236163, term1236163.getClass(), "first", term1236233);
        setField(term1236093, term1236093.getClass(), "first", term1236163);
        setField(term1236023, term1236023.getClass(), "first", term1236093);
        setField(term1235953, term1235953.getClass(), "first", term1236023);
        setField(term1235883, term1235883.getClass(), "first", term1235953);
        setField(term1235813, term1235813.getClass(), "first", term1235883);
        setField(term1235743, term1235743.getClass(), "first", term1235813);
        setField(term1235673, term1235673.getClass(), "first", term1235743);
        setField(term1235603, term1235603.getClass(), "first", term1235673);
        setField(term1235533, term1235533.getClass(), "first", term1235603);
        setField(term1235463, term1235463.getClass(), "first", term1235533);
        setField(term1235393, term1235393.getClass(), "first", term1235463);
        setField(term1235323, term1235323.getClass(), "first", term1235393);
        setField(term1235253, term1235253.getClass(), "first", term1235323);
        setField(term1235183, term1235183.getClass(), "first", term1235253);
        setField(term1235113, term1235113.getClass(), "first", term1235183);
        setField(term1235043, term1235043.getClass(), "first", term1235113);
        setField(term1234973, term1234973.getClass(), "first", term1235043);
        setField(term1234903, term1234903.getClass(), "first", term1234973);
        setField(term1234833, term1234833.getClass(), "first", term1234903);
        setField(term1234763, term1234763.getClass(), "first", term1234833);
        setField(term1234693, term1234693.getClass(), "first", term1234763);
        setField(term1234623, term1234623.getClass(), "first", term1234693);
        setField(term1234553, term1234553.getClass(), "first", term1234623);
        setField(term1234483, term1234483.getClass(), "first", term1234553);
        setField(term1234413, term1234413.getClass(), "first", term1234483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1234413;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1234343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


