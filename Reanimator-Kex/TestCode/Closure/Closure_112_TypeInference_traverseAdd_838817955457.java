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

public class TypeInference_traverseAdd_838817955457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660321;
     Object term1660391;

    public TypeInference_traverseAdd_838817955457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1660321 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1660391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1660461, term1660461.getClass(), "next", term1660531);
        setIntField(term1660461, term1660461.getClass(), "type", 14);
        setIntField(term1660601, term1660601.getClass(), "type", 14);
        setIntField(term1660671, term1660671.getClass(), "type", 14);
        setIntField(term1660741, term1660741.getClass(), "type", 14);
        setIntField(term1660811, term1660811.getClass(), "type", 14);
        setIntField(term1660881, term1660881.getClass(), "type", 14);
        setIntField(term1660951, term1660951.getClass(), "type", 14);
        setIntField(term1661021, term1661021.getClass(), "type", 14);
        setIntField(term1661091, term1661091.getClass(), "type", 14);
        setIntField(term1661161, term1661161.getClass(), "type", 14);
        setIntField(term1661231, term1661231.getClass(), "type", 14);
        setIntField(term1661301, term1661301.getClass(), "type", 14);
        setIntField(term1661371, term1661371.getClass(), "type", 14);
        setIntField(term1661441, term1661441.getClass(), "type", 14);
        setIntField(term1661511, term1661511.getClass(), "type", 14);
        setIntField(term1661581, term1661581.getClass(), "type", 14);
        setIntField(term1661651, term1661651.getClass(), "type", 14);
        setIntField(term1661721, term1661721.getClass(), "type", 14);
        setIntField(term1661791, term1661791.getClass(), "type", 14);
        setIntField(term1661861, term1661861.getClass(), "type", 14);
        setIntField(term1661931, term1661931.getClass(), "type", 14);
        setIntField(term1662001, term1662001.getClass(), "type", 14);
        setIntField(term1662071, term1662071.getClass(), "type", 141);
        setField(term1662001, term1662001.getClass(), "first", term1662071);
        setField(term1661931, term1661931.getClass(), "first", term1662001);
        setField(term1661861, term1661861.getClass(), "first", term1661931);
        setField(term1661791, term1661791.getClass(), "first", term1661861);
        setField(term1661721, term1661721.getClass(), "first", term1661791);
        setField(term1661651, term1661651.getClass(), "first", term1661721);
        setField(term1661581, term1661581.getClass(), "first", term1661651);
        setField(term1661511, term1661511.getClass(), "first", term1661581);
        setField(term1661441, term1661441.getClass(), "first", term1661511);
        setField(term1661371, term1661371.getClass(), "first", term1661441);
        setField(term1661301, term1661301.getClass(), "first", term1661371);
        setField(term1661231, term1661231.getClass(), "first", term1661301);
        setField(term1661161, term1661161.getClass(), "first", term1661231);
        setField(term1661091, term1661091.getClass(), "first", term1661161);
        setField(term1661021, term1661021.getClass(), "first", term1661091);
        setField(term1660951, term1660951.getClass(), "first", term1661021);
        setField(term1660881, term1660881.getClass(), "first", term1660951);
        setField(term1660811, term1660811.getClass(), "first", term1660881);
        setField(term1660741, term1660741.getClass(), "first", term1660811);
        setField(term1660671, term1660671.getClass(), "first", term1660741);
        setField(term1660601, term1660601.getClass(), "first", term1660671);
        setField(term1660461, term1660461.getClass(), "first", term1660601);
        setField(term1660391, term1660391.getClass(), "first", term1660461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1660391;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1660321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


