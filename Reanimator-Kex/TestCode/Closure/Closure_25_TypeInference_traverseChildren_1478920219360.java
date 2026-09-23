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

public class TypeInference_traverseChildren_1478920219360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1108922;
     Object term1108992;

    public TypeInference_traverseChildren_1478920219360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1108922 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1108992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1111932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1112002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1112072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1112142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1109062, term1109062.getClass(), "type", 18);
        setIntField(term1109132, term1109132.getClass(), "type", 18);
        setIntField(term1109202, term1109202.getClass(), "type", 18);
        setIntField(term1109272, term1109272.getClass(), "type", 18);
        setIntField(term1109342, term1109342.getClass(), "type", 18);
        setIntField(term1109412, term1109412.getClass(), "type", 18);
        setIntField(term1109482, term1109482.getClass(), "type", 18);
        setIntField(term1109552, term1109552.getClass(), "type", 18);
        setIntField(term1109622, term1109622.getClass(), "type", 18);
        setIntField(term1109692, term1109692.getClass(), "type", 18);
        setIntField(term1109762, term1109762.getClass(), "type", 18);
        setIntField(term1109832, term1109832.getClass(), "type", 18);
        setIntField(term1109902, term1109902.getClass(), "type", 18);
        setIntField(term1109972, term1109972.getClass(), "type", 18);
        setIntField(term1110042, term1110042.getClass(), "type", 18);
        setIntField(term1110112, term1110112.getClass(), "type", 18);
        setIntField(term1110182, term1110182.getClass(), "type", 18);
        setIntField(term1110252, term1110252.getClass(), "type", 18);
        setIntField(term1110322, term1110322.getClass(), "type", 18);
        setIntField(term1110392, term1110392.getClass(), "type", 18);
        setIntField(term1110462, term1110462.getClass(), "type", 18);
        setIntField(term1110532, term1110532.getClass(), "type", 18);
        setIntField(term1110602, term1110602.getClass(), "type", 18);
        setIntField(term1110672, term1110672.getClass(), "type", 18);
        setIntField(term1110742, term1110742.getClass(), "type", 18);
        setIntField(term1110812, term1110812.getClass(), "type", 18);
        setIntField(term1110882, term1110882.getClass(), "type", 18);
        setIntField(term1110952, term1110952.getClass(), "type", 18);
        setIntField(term1111022, term1111022.getClass(), "type", 18);
        setIntField(term1111092, term1111092.getClass(), "type", 18);
        setIntField(term1111162, term1111162.getClass(), "type", 18);
        setIntField(term1111232, term1111232.getClass(), "type", 18);
        setIntField(term1111302, term1111302.getClass(), "type", 18);
        setIntField(term1111372, term1111372.getClass(), "type", 18);
        setIntField(term1111442, term1111442.getClass(), "type", 18);
        setIntField(term1111512, term1111512.getClass(), "type", 18);
        setIntField(term1111582, term1111582.getClass(), "type", 18);
        setIntField(term1111652, term1111652.getClass(), "type", 18);
        setIntField(term1111722, term1111722.getClass(), "type", 18);
        setIntField(term1111792, term1111792.getClass(), "type", 18);
        setIntField(term1111862, term1111862.getClass(), "type", 18);
        setIntField(term1111932, term1111932.getClass(), "type", 18);
        setIntField(term1112002, term1112002.getClass(), "type", 18);
        setIntField(term1112072, term1112072.getClass(), "type", 18);
        setIntField(term1112142, term1112142.getClass(), "type", 46);
        setField(term1112072, term1112072.getClass(), "first", term1112142);
        setField(term1112002, term1112002.getClass(), "first", term1112072);
        setField(term1111932, term1111932.getClass(), "first", term1112002);
        setField(term1111862, term1111862.getClass(), "first", term1111932);
        setField(term1111792, term1111792.getClass(), "first", term1111862);
        setField(term1111722, term1111722.getClass(), "first", term1111792);
        setField(term1111652, term1111652.getClass(), "first", term1111722);
        setField(term1111582, term1111582.getClass(), "first", term1111652);
        setField(term1111512, term1111512.getClass(), "first", term1111582);
        setField(term1111442, term1111442.getClass(), "first", term1111512);
        setField(term1111372, term1111372.getClass(), "first", term1111442);
        setField(term1111302, term1111302.getClass(), "first", term1111372);
        setField(term1111232, term1111232.getClass(), "first", term1111302);
        setField(term1111162, term1111162.getClass(), "first", term1111232);
        setField(term1111092, term1111092.getClass(), "first", term1111162);
        setField(term1111022, term1111022.getClass(), "first", term1111092);
        setField(term1110952, term1110952.getClass(), "first", term1111022);
        setField(term1110882, term1110882.getClass(), "first", term1110952);
        setField(term1110812, term1110812.getClass(), "first", term1110882);
        setField(term1110742, term1110742.getClass(), "first", term1110812);
        setField(term1110672, term1110672.getClass(), "first", term1110742);
        setField(term1110602, term1110602.getClass(), "first", term1110672);
        setField(term1110532, term1110532.getClass(), "first", term1110602);
        setField(term1110462, term1110462.getClass(), "first", term1110532);
        setField(term1110392, term1110392.getClass(), "first", term1110462);
        setField(term1110322, term1110322.getClass(), "first", term1110392);
        setField(term1110252, term1110252.getClass(), "first", term1110322);
        setField(term1110182, term1110182.getClass(), "first", term1110252);
        setField(term1110112, term1110112.getClass(), "first", term1110182);
        setField(term1110042, term1110042.getClass(), "first", term1110112);
        setField(term1109972, term1109972.getClass(), "first", term1110042);
        setField(term1109902, term1109902.getClass(), "first", term1109972);
        setField(term1109832, term1109832.getClass(), "first", term1109902);
        setField(term1109762, term1109762.getClass(), "first", term1109832);
        setField(term1109692, term1109692.getClass(), "first", term1109762);
        setField(term1109622, term1109622.getClass(), "first", term1109692);
        setField(term1109552, term1109552.getClass(), "first", term1109622);
        setField(term1109482, term1109482.getClass(), "first", term1109552);
        setField(term1109412, term1109412.getClass(), "first", term1109482);
        setField(term1109342, term1109342.getClass(), "first", term1109412);
        setField(term1109272, term1109272.getClass(), "first", term1109342);
        setField(term1109202, term1109202.getClass(), "first", term1109272);
        setField(term1109132, term1109132.getClass(), "first", term1109202);
        setField(term1109062, term1109062.getClass(), "first", term1109132);
        setField(term1108992, term1108992.getClass(), "first", term1109062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1108992;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1108922, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


