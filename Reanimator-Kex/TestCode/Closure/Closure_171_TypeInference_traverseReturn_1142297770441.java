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

public class TypeInference_traverseReturn_1142297770441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1204972;
     Object term1205042;

    public TypeInference_traverseReturn_1142297770441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1204972 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1205042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1205112, term1205112.getClass(), "type", 92);
        setIntField(term1205182, term1205182.getClass(), "type", 92);
        setIntField(term1205252, term1205252.getClass(), "type", 92);
        setIntField(term1205322, term1205322.getClass(), "type", 92);
        setIntField(term1205392, term1205392.getClass(), "type", 92);
        setIntField(term1205462, term1205462.getClass(), "type", 92);
        setIntField(term1205532, term1205532.getClass(), "type", 92);
        setIntField(term1205602, term1205602.getClass(), "type", 92);
        setIntField(term1205672, term1205672.getClass(), "type", 92);
        setIntField(term1205742, term1205742.getClass(), "type", 92);
        setIntField(term1205812, term1205812.getClass(), "type", 92);
        setIntField(term1205882, term1205882.getClass(), "type", 92);
        setIntField(term1205952, term1205952.getClass(), "type", 92);
        setIntField(term1206022, term1206022.getClass(), "type", 92);
        setIntField(term1206092, term1206092.getClass(), "type", 92);
        setIntField(term1206162, term1206162.getClass(), "type", 92);
        setIntField(term1206232, term1206232.getClass(), "type", 92);
        setIntField(term1206302, term1206302.getClass(), "type", 92);
        setIntField(term1206372, term1206372.getClass(), "type", 92);
        setIntField(term1206442, term1206442.getClass(), "type", 92);
        setIntField(term1206512, term1206512.getClass(), "type", 92);
        setIntField(term1206582, term1206582.getClass(), "type", 92);
        setIntField(term1206652, term1206652.getClass(), "type", 92);
        setIntField(term1206722, term1206722.getClass(), "type", 92);
        setIntField(term1206792, term1206792.getClass(), "type", 92);
        setIntField(term1206862, term1206862.getClass(), "type", 92);
        setIntField(term1206932, term1206932.getClass(), "type", 92);
        setIntField(term1207002, term1207002.getClass(), "type", 92);
        setIntField(term1207072, term1207072.getClass(), "type", 92);
        setIntField(term1207142, term1207142.getClass(), "type", 92);
        setIntField(term1207212, term1207212.getClass(), "type", 28);
        setField(term1207142, term1207142.getClass(), "first", term1207212);
        setField(term1207072, term1207072.getClass(), "first", term1207142);
        setField(term1207002, term1207002.getClass(), "first", term1207072);
        setField(term1206932, term1206932.getClass(), "first", term1207002);
        setField(term1206862, term1206862.getClass(), "first", term1206932);
        setField(term1206792, term1206792.getClass(), "first", term1206862);
        setField(term1206722, term1206722.getClass(), "first", term1206792);
        setField(term1206652, term1206652.getClass(), "first", term1206722);
        setField(term1206582, term1206582.getClass(), "first", term1206652);
        setField(term1206512, term1206512.getClass(), "first", term1206582);
        setField(term1206442, term1206442.getClass(), "first", term1206512);
        setField(term1206372, term1206372.getClass(), "first", term1206442);
        setField(term1206302, term1206302.getClass(), "first", term1206372);
        setField(term1206232, term1206232.getClass(), "first", term1206302);
        setField(term1206162, term1206162.getClass(), "first", term1206232);
        setField(term1206092, term1206092.getClass(), "first", term1206162);
        setField(term1206022, term1206022.getClass(), "first", term1206092);
        setField(term1205952, term1205952.getClass(), "first", term1206022);
        setField(term1205882, term1205882.getClass(), "first", term1205952);
        setField(term1205812, term1205812.getClass(), "first", term1205882);
        setField(term1205742, term1205742.getClass(), "first", term1205812);
        setField(term1205672, term1205672.getClass(), "first", term1205742);
        setField(term1205602, term1205602.getClass(), "first", term1205672);
        setField(term1205532, term1205532.getClass(), "first", term1205602);
        setField(term1205462, term1205462.getClass(), "first", term1205532);
        setField(term1205392, term1205392.getClass(), "first", term1205462);
        setField(term1205322, term1205322.getClass(), "first", term1205392);
        setField(term1205252, term1205252.getClass(), "first", term1205322);
        setField(term1205182, term1205182.getClass(), "first", term1205252);
        setField(term1205112, term1205112.getClass(), "first", term1205182);
        setField(term1205042, term1205042.getClass(), "first", term1205112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1205042;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1204972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


