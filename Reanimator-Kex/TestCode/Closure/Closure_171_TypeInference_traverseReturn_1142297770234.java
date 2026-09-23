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

public class TypeInference_traverseReturn_1142297770234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219323;
     Object term219393;

    public TypeInference_traverseReturn_1142297770234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219323 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term219393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term219463, term219463.getClass(), "type", 92);
        setIntField(term219533, term219533.getClass(), "type", 92);
        setIntField(term219603, term219603.getClass(), "type", 92);
        setIntField(term219673, term219673.getClass(), "type", 92);
        setIntField(term219743, term219743.getClass(), "type", 92);
        setIntField(term219813, term219813.getClass(), "type", 92);
        setIntField(term219883, term219883.getClass(), "type", 92);
        setIntField(term219953, term219953.getClass(), "type", 92);
        setIntField(term220023, term220023.getClass(), "type", 92);
        setIntField(term220093, term220093.getClass(), "type", 92);
        setIntField(term220163, term220163.getClass(), "type", 92);
        setIntField(term220233, term220233.getClass(), "type", 92);
        setIntField(term220303, term220303.getClass(), "type", 92);
        setIntField(term220373, term220373.getClass(), "type", 92);
        setIntField(term220443, term220443.getClass(), "type", 92);
        setIntField(term220513, term220513.getClass(), "type", 92);
        setIntField(term220583, term220583.getClass(), "type", 92);
        setIntField(term220653, term220653.getClass(), "type", 92);
        setIntField(term220723, term220723.getClass(), "type", 92);
        setIntField(term220793, term220793.getClass(), "type", 92);
        setIntField(term220863, term220863.getClass(), "type", 92);
        setIntField(term220933, term220933.getClass(), "type", 92);
        setIntField(term221003, term221003.getClass(), "type", 92);
        setIntField(term221073, term221073.getClass(), "type", 92);
        setIntField(term221143, term221143.getClass(), "type", 92);
        setIntField(term221213, term221213.getClass(), "type", 92);
        setIntField(term221283, term221283.getClass(), "type", 92);
        setIntField(term221353, term221353.getClass(), "type", 92);
        setIntField(term221423, term221423.getClass(), "type", 92);
        setIntField(term221493, term221493.getClass(), "type", 92);
        setIntField(term221563, term221563.getClass(), "type", 92);
        setIntField(term221633, term221633.getClass(), "type", 92);
        setIntField(term221703, term221703.getClass(), "type", 92);
        setIntField(term221773, term221773.getClass(), "type", 92);
        setIntField(term221843, term221843.getClass(), "type", 92);
        setIntField(term221913, term221913.getClass(), "type", 92);
        setIntField(term221983, term221983.getClass(), "type", 92);
        setIntField(term222053, term222053.getClass(), "type", 92);
        setIntField(term222123, term222123.getClass(), "type", 92);
        setIntField(term222193, term222193.getClass(), "type", 49);
        setField(term222123, term222123.getClass(), "first", term222193);
        setField(term222053, term222053.getClass(), "first", term222123);
        setField(term221983, term221983.getClass(), "first", term222053);
        setField(term221913, term221913.getClass(), "first", term221983);
        setField(term221843, term221843.getClass(), "first", term221913);
        setField(term221773, term221773.getClass(), "first", term221843);
        setField(term221703, term221703.getClass(), "first", term221773);
        setField(term221633, term221633.getClass(), "first", term221703);
        setField(term221563, term221563.getClass(), "first", term221633);
        setField(term221493, term221493.getClass(), "first", term221563);
        setField(term221423, term221423.getClass(), "first", term221493);
        setField(term221353, term221353.getClass(), "first", term221423);
        setField(term221283, term221283.getClass(), "first", term221353);
        setField(term221213, term221213.getClass(), "first", term221283);
        setField(term221143, term221143.getClass(), "first", term221213);
        setField(term221073, term221073.getClass(), "first", term221143);
        setField(term221003, term221003.getClass(), "first", term221073);
        setField(term220933, term220933.getClass(), "first", term221003);
        setField(term220863, term220863.getClass(), "first", term220933);
        setField(term220793, term220793.getClass(), "first", term220863);
        setField(term220723, term220723.getClass(), "first", term220793);
        setField(term220653, term220653.getClass(), "first", term220723);
        setField(term220583, term220583.getClass(), "first", term220653);
        setField(term220513, term220513.getClass(), "first", term220583);
        setField(term220443, term220443.getClass(), "first", term220513);
        setField(term220373, term220373.getClass(), "first", term220443);
        setField(term220303, term220303.getClass(), "first", term220373);
        setField(term220233, term220233.getClass(), "first", term220303);
        setField(term220163, term220163.getClass(), "first", term220233);
        setField(term220093, term220093.getClass(), "first", term220163);
        setField(term220023, term220023.getClass(), "first", term220093);
        setField(term219953, term219953.getClass(), "first", term220023);
        setField(term219883, term219883.getClass(), "first", term219953);
        setField(term219813, term219813.getClass(), "first", term219883);
        setField(term219743, term219743.getClass(), "first", term219813);
        setField(term219673, term219673.getClass(), "first", term219743);
        setField(term219603, term219603.getClass(), "first", term219673);
        setField(term219533, term219533.getClass(), "first", term219603);
        setField(term219463, term219463.getClass(), "first", term219533);
        setField(term219393, term219393.getClass(), "first", term219463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term219393;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term219323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


