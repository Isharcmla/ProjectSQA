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

public class TypeInference_traverseArrayLiteral_67090236296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722859;
     Object term722929;

    public TypeInference_traverseArrayLiteral_67090236296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722859 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term722929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term722999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term722999, term722999.getClass(), "type", 83);
        setIntField(term723069, term723069.getClass(), "type", 83);
        setIntField(term723139, term723139.getClass(), "type", 83);
        setIntField(term723209, term723209.getClass(), "type", 83);
        setIntField(term723279, term723279.getClass(), "type", 83);
        setIntField(term723349, term723349.getClass(), "type", 83);
        setIntField(term723419, term723419.getClass(), "type", 83);
        setIntField(term723489, term723489.getClass(), "type", 83);
        setIntField(term723559, term723559.getClass(), "type", 83);
        setIntField(term723629, term723629.getClass(), "type", 83);
        setIntField(term723699, term723699.getClass(), "type", 83);
        setIntField(term723769, term723769.getClass(), "type", 83);
        setIntField(term723839, term723839.getClass(), "type", 83);
        setIntField(term723909, term723909.getClass(), "type", 83);
        setIntField(term723979, term723979.getClass(), "type", 83);
        setIntField(term724049, term724049.getClass(), "type", 83);
        setIntField(term724119, term724119.getClass(), "type", 83);
        setIntField(term724189, term724189.getClass(), "type", 83);
        setIntField(term724259, term724259.getClass(), "type", 83);
        setIntField(term724329, term724329.getClass(), "type", 83);
        setIntField(term724399, term724399.getClass(), "type", 83);
        setIntField(term724469, term724469.getClass(), "type", 83);
        setIntField(term724539, term724539.getClass(), "type", 83);
        setIntField(term724609, term724609.getClass(), "type", 83);
        setIntField(term724679, term724679.getClass(), "type", 83);
        setIntField(term724749, term724749.getClass(), "type", 83);
        setIntField(term724819, term724819.getClass(), "type", 83);
        setIntField(term724889, term724889.getClass(), "type", 83);
        setIntField(term724959, term724959.getClass(), "type", 83);
        setIntField(term725029, term725029.getClass(), "type", 83);
        setIntField(term725099, term725099.getClass(), "type", 83);
        setIntField(term725169, term725169.getClass(), "type", 83);
        setIntField(term725239, term725239.getClass(), "type", 83);
        setIntField(term725309, term725309.getClass(), "type", 83);
        setIntField(term725379, term725379.getClass(), "type", 83);
        setIntField(term725449, term725449.getClass(), "type", 83);
        setIntField(term725519, term725519.getClass(), "type", 83);
        setIntField(term725589, term725589.getClass(), "type", 71);
        setField(term725519, term725519.getClass(), "first", term725589);
        setField(term725449, term725449.getClass(), "first", term725519);
        setField(term725379, term725379.getClass(), "first", term725449);
        setField(term725309, term725309.getClass(), "first", term725379);
        setField(term725239, term725239.getClass(), "first", term725309);
        setField(term725169, term725169.getClass(), "first", term725239);
        setField(term725099, term725099.getClass(), "first", term725169);
        setField(term725029, term725029.getClass(), "first", term725099);
        setField(term724959, term724959.getClass(), "first", term725029);
        setField(term724889, term724889.getClass(), "first", term724959);
        setField(term724819, term724819.getClass(), "first", term724889);
        setField(term724749, term724749.getClass(), "first", term724819);
        setField(term724679, term724679.getClass(), "first", term724749);
        setField(term724609, term724609.getClass(), "first", term724679);
        setField(term724539, term724539.getClass(), "first", term724609);
        setField(term724469, term724469.getClass(), "first", term724539);
        setField(term724399, term724399.getClass(), "first", term724469);
        setField(term724329, term724329.getClass(), "first", term724399);
        setField(term724259, term724259.getClass(), "first", term724329);
        setField(term724189, term724189.getClass(), "first", term724259);
        setField(term724119, term724119.getClass(), "first", term724189);
        setField(term724049, term724049.getClass(), "first", term724119);
        setField(term723979, term723979.getClass(), "first", term724049);
        setField(term723909, term723909.getClass(), "first", term723979);
        setField(term723839, term723839.getClass(), "first", term723909);
        setField(term723769, term723769.getClass(), "first", term723839);
        setField(term723699, term723699.getClass(), "first", term723769);
        setField(term723629, term723629.getClass(), "first", term723699);
        setField(term723559, term723559.getClass(), "first", term723629);
        setField(term723489, term723489.getClass(), "first", term723559);
        setField(term723419, term723419.getClass(), "first", term723489);
        setField(term723349, term723349.getClass(), "first", term723419);
        setField(term723279, term723279.getClass(), "first", term723349);
        setField(term723209, term723209.getClass(), "first", term723279);
        setField(term723139, term723139.getClass(), "first", term723209);
        setField(term723069, term723069.getClass(), "first", term723139);
        setField(term722999, term722999.getClass(), "first", term723069);
        setField(term722929, term722929.getClass(), "first", term722999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term722929;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term722859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


