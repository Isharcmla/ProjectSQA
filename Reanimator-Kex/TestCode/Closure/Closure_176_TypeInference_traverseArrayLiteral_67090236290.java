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

public class TypeInference_traverseArrayLiteral_67090236290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672566;
     Object term672636;

    public TypeInference_traverseArrayLiteral_67090236290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672566 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term672636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term673966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term674036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term674106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term672706, term672706.getClass(), "type", 83);
        setIntField(term672776, term672776.getClass(), "type", 83);
        setIntField(term672846, term672846.getClass(), "type", 83);
        setIntField(term672916, term672916.getClass(), "type", 83);
        setIntField(term672986, term672986.getClass(), "type", 83);
        setIntField(term673056, term673056.getClass(), "type", 83);
        setIntField(term673126, term673126.getClass(), "type", 83);
        setIntField(term673196, term673196.getClass(), "type", 83);
        setIntField(term673266, term673266.getClass(), "type", 83);
        setIntField(term673336, term673336.getClass(), "type", 83);
        setIntField(term673406, term673406.getClass(), "type", 83);
        setIntField(term673476, term673476.getClass(), "type", 83);
        setIntField(term673546, term673546.getClass(), "type", 83);
        setIntField(term673616, term673616.getClass(), "type", 83);
        setIntField(term673686, term673686.getClass(), "type", 83);
        setIntField(term673756, term673756.getClass(), "type", 83);
        setIntField(term673826, term673826.getClass(), "type", 83);
        setIntField(term673896, term673896.getClass(), "type", 83);
        setIntField(term673966, term673966.getClass(), "type", 83);
        setIntField(term674036, term674036.getClass(), "type", 83);
        setIntField(term674106, term674106.getClass(), "type", 92);
        setField(term674036, term674036.getClass(), "first", term674106);
        setField(term673966, term673966.getClass(), "first", term674036);
        setField(term673896, term673896.getClass(), "first", term673966);
        setField(term673826, term673826.getClass(), "first", term673896);
        setField(term673756, term673756.getClass(), "first", term673826);
        setField(term673686, term673686.getClass(), "first", term673756);
        setField(term673616, term673616.getClass(), "first", term673686);
        setField(term673546, term673546.getClass(), "first", term673616);
        setField(term673476, term673476.getClass(), "first", term673546);
        setField(term673406, term673406.getClass(), "first", term673476);
        setField(term673336, term673336.getClass(), "first", term673406);
        setField(term673266, term673266.getClass(), "first", term673336);
        setField(term673196, term673196.getClass(), "first", term673266);
        setField(term673126, term673126.getClass(), "first", term673196);
        setField(term673056, term673056.getClass(), "first", term673126);
        setField(term672986, term672986.getClass(), "first", term673056);
        setField(term672916, term672916.getClass(), "first", term672986);
        setField(term672846, term672846.getClass(), "first", term672916);
        setField(term672776, term672776.getClass(), "first", term672846);
        setField(term672706, term672706.getClass(), "first", term672776);
        setField(term672636, term672636.getClass(), "first", term672706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term672636;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term672566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


