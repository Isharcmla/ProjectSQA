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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseArrayLiteral_67090236488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2289553;
     Object term2289623;

    public TypeInference_traverseArrayLiteral_67090236488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2289553 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2289623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2292983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2289693, term2289693.getClass(), "type", 83);
        setIntField(term2289763, term2289763.getClass(), "type", 83);
        setIntField(term2289833, term2289833.getClass(), "type", 83);
        setIntField(term2289903, term2289903.getClass(), "type", 83);
        setIntField(term2289973, term2289973.getClass(), "type", 83);
        setIntField(term2290043, term2290043.getClass(), "type", 83);
        setIntField(term2290113, term2290113.getClass(), "type", 83);
        setIntField(term2290183, term2290183.getClass(), "type", 83);
        setIntField(term2290253, term2290253.getClass(), "type", 83);
        setIntField(term2290323, term2290323.getClass(), "type", 83);
        setIntField(term2290393, term2290393.getClass(), "type", 83);
        setIntField(term2290463, term2290463.getClass(), "type", 83);
        setIntField(term2290533, term2290533.getClass(), "type", 83);
        setIntField(term2290603, term2290603.getClass(), "type", 83);
        setIntField(term2290673, term2290673.getClass(), "type", 83);
        setIntField(term2290743, term2290743.getClass(), "type", 83);
        setIntField(term2290813, term2290813.getClass(), "type", 83);
        setIntField(term2290883, term2290883.getClass(), "type", 83);
        setIntField(term2290953, term2290953.getClass(), "type", 83);
        setIntField(term2291023, term2291023.getClass(), "type", 83);
        setIntField(term2291093, term2291093.getClass(), "type", 83);
        setIntField(term2291163, term2291163.getClass(), "type", 83);
        setIntField(term2291233, term2291233.getClass(), "type", 83);
        setIntField(term2291303, term2291303.getClass(), "type", 83);
        setIntField(term2291373, term2291373.getClass(), "type", 83);
        setIntField(term2291443, term2291443.getClass(), "type", 83);
        setIntField(term2291513, term2291513.getClass(), "type", 83);
        setIntField(term2291583, term2291583.getClass(), "type", 83);
        setIntField(term2291653, term2291653.getClass(), "type", 83);
        setIntField(term2291723, term2291723.getClass(), "type", 83);
        setIntField(term2291793, term2291793.getClass(), "type", 83);
        setIntField(term2291863, term2291863.getClass(), "type", 83);
        setIntField(term2291933, term2291933.getClass(), "type", 83);
        setIntField(term2292003, term2292003.getClass(), "type", 83);
        setIntField(term2292073, term2292073.getClass(), "type", 83);
        setIntField(term2292143, term2292143.getClass(), "type", 83);
        setIntField(term2292213, term2292213.getClass(), "type", 83);
        setIntField(term2292283, term2292283.getClass(), "type", 83);
        setIntField(term2292353, term2292353.getClass(), "type", 83);
        setIntField(term2292423, term2292423.getClass(), "type", 83);
        setIntField(term2292493, term2292493.getClass(), "type", 83);
        setIntField(term2292563, term2292563.getClass(), "type", 83);
        setIntField(term2292633, term2292633.getClass(), "type", 83);
        setIntField(term2292703, term2292703.getClass(), "type", 83);
        setIntField(term2292773, term2292773.getClass(), "type", 83);
        setIntField(term2292843, term2292843.getClass(), "type", 83);
        setIntField(term2292913, term2292913.getClass(), "type", 83);
        setIntField(term2292983, term2292983.getClass(), "type", 83);
        setIntField(term2293053, term2293053.getClass(), "type", 21);
        setField(term2292983, term2292983.getClass(), "first", term2293053);
        setField(term2292913, term2292913.getClass(), "first", term2292983);
        setField(term2292843, term2292843.getClass(), "first", term2292913);
        setField(term2292773, term2292773.getClass(), "first", term2292843);
        setField(term2292703, term2292703.getClass(), "first", term2292773);
        setField(term2292633, term2292633.getClass(), "first", term2292703);
        setField(term2292563, term2292563.getClass(), "first", term2292633);
        setField(term2292493, term2292493.getClass(), "first", term2292563);
        setField(term2292423, term2292423.getClass(), "first", term2292493);
        setField(term2292353, term2292353.getClass(), "first", term2292423);
        setField(term2292283, term2292283.getClass(), "first", term2292353);
        setField(term2292213, term2292213.getClass(), "first", term2292283);
        setField(term2292143, term2292143.getClass(), "first", term2292213);
        setField(term2292073, term2292073.getClass(), "first", term2292143);
        setField(term2292003, term2292003.getClass(), "first", term2292073);
        setField(term2291933, term2291933.getClass(), "first", term2292003);
        setField(term2291863, term2291863.getClass(), "first", term2291933);
        setField(term2291793, term2291793.getClass(), "first", term2291863);
        setField(term2291723, term2291723.getClass(), "first", term2291793);
        setField(term2291653, term2291653.getClass(), "first", term2291723);
        setField(term2291583, term2291583.getClass(), "first", term2291653);
        setField(term2291513, term2291513.getClass(), "first", term2291583);
        setField(term2291443, term2291443.getClass(), "first", term2291513);
        setField(term2291373, term2291373.getClass(), "first", term2291443);
        setField(term2291303, term2291303.getClass(), "first", term2291373);
        setField(term2291233, term2291233.getClass(), "first", term2291303);
        setField(term2291163, term2291163.getClass(), "first", term2291233);
        setField(term2291093, term2291093.getClass(), "first", term2291163);
        setField(term2291023, term2291023.getClass(), "first", term2291093);
        setField(term2290953, term2290953.getClass(), "first", term2291023);
        setField(term2290883, term2290883.getClass(), "first", term2290953);
        setField(term2290813, term2290813.getClass(), "first", term2290883);
        setField(term2290743, term2290743.getClass(), "first", term2290813);
        setField(term2290673, term2290673.getClass(), "first", term2290743);
        setField(term2290603, term2290603.getClass(), "first", term2290673);
        setField(term2290533, term2290533.getClass(), "first", term2290603);
        setField(term2290463, term2290463.getClass(), "first", term2290533);
        setField(term2290393, term2290393.getClass(), "first", term2290463);
        setField(term2290323, term2290323.getClass(), "first", term2290393);
        setField(term2290253, term2290253.getClass(), "first", term2290323);
        setField(term2290183, term2290183.getClass(), "first", term2290253);
        setField(term2290113, term2290113.getClass(), "first", term2290183);
        setField(term2290043, term2290043.getClass(), "first", term2290113);
        setField(term2289973, term2289973.getClass(), "first", term2290043);
        setField(term2289903, term2289903.getClass(), "first", term2289973);
        setField(term2289833, term2289833.getClass(), "first", term2289903);
        setField(term2289763, term2289763.getClass(), "first", term2289833);
        setField(term2289693, term2289693.getClass(), "first", term2289763);
        setField(term2289623, term2289623.getClass(), "first", term2289693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2289623;
        args[1] = null;
        callMethod(klass, "traverseArrayLiteral", argTypes, term2289553, args);
    }

};


