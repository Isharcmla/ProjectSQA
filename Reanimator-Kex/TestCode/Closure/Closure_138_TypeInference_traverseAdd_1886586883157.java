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

public class TypeInference_traverseAdd_1886586883157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109521;
     Object term109591;

    public TypeInference_traverseAdd_1886586883157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109521 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term109591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109661, term109661.getClass(), "next", term109731);
        setIntField(term109661, term109661.getClass(), "type", 4);
        setIntField(term109801, term109801.getClass(), "type", 4);
        setIntField(term109871, term109871.getClass(), "type", 4);
        setIntField(term109941, term109941.getClass(), "type", 4);
        setIntField(term110011, term110011.getClass(), "type", 4);
        setIntField(term110081, term110081.getClass(), "type", 4);
        setIntField(term110151, term110151.getClass(), "type", 4);
        setIntField(term110221, term110221.getClass(), "type", 4);
        setIntField(term110291, term110291.getClass(), "type", 4);
        setIntField(term110361, term110361.getClass(), "type", 4);
        setIntField(term110431, term110431.getClass(), "type", 4);
        setIntField(term110501, term110501.getClass(), "type", 4);
        setIntField(term110571, term110571.getClass(), "type", 4);
        setIntField(term110641, term110641.getClass(), "type", 4);
        setIntField(term110711, term110711.getClass(), "type", 4);
        setIntField(term110781, term110781.getClass(), "type", 4);
        setIntField(term110851, term110851.getClass(), "type", 4);
        setIntField(term110921, term110921.getClass(), "type", 4);
        setIntField(term110991, term110991.getClass(), "type", 4);
        setIntField(term111061, term111061.getClass(), "type", 4);
        setIntField(term111131, term111131.getClass(), "type", 126);
        setField(term111061, term111061.getClass(), "first", term111131);
        setField(term110991, term110991.getClass(), "first", term111061);
        setField(term110921, term110921.getClass(), "first", term110991);
        setField(term110851, term110851.getClass(), "first", term110921);
        setField(term110781, term110781.getClass(), "first", term110851);
        setField(term110711, term110711.getClass(), "first", term110781);
        setField(term110641, term110641.getClass(), "first", term110711);
        setField(term110571, term110571.getClass(), "first", term110641);
        setField(term110501, term110501.getClass(), "first", term110571);
        setField(term110431, term110431.getClass(), "first", term110501);
        setField(term110361, term110361.getClass(), "first", term110431);
        setField(term110291, term110291.getClass(), "first", term110361);
        setField(term110221, term110221.getClass(), "first", term110291);
        setField(term110151, term110151.getClass(), "first", term110221);
        setField(term110081, term110081.getClass(), "first", term110151);
        setField(term110011, term110011.getClass(), "first", term110081);
        setField(term109941, term109941.getClass(), "first", term110011);
        setField(term109871, term109871.getClass(), "first", term109941);
        setField(term109801, term109801.getClass(), "first", term109871);
        setField(term109661, term109661.getClass(), "first", term109801);
        setField(term109591, term109591.getClass(), "first", term109661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term109591;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term109521, args);
    }

};


