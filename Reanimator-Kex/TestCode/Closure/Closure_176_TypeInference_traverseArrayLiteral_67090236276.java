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

public class TypeInference_traverseArrayLiteral_67090236276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578288;
     Object term578358;

    public TypeInference_traverseArrayLiteral_67090236276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578288 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term578358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term580948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term578428, term578428.getClass(), "type", 83);
        setIntField(term578498, term578498.getClass(), "type", 83);
        setIntField(term578568, term578568.getClass(), "type", 83);
        setIntField(term578638, term578638.getClass(), "type", 83);
        setIntField(term578708, term578708.getClass(), "type", 83);
        setIntField(term578778, term578778.getClass(), "type", 83);
        setIntField(term578848, term578848.getClass(), "type", 83);
        setIntField(term578918, term578918.getClass(), "type", 83);
        setIntField(term578988, term578988.getClass(), "type", 83);
        setIntField(term579058, term579058.getClass(), "type", 83);
        setIntField(term579128, term579128.getClass(), "type", 83);
        setIntField(term579198, term579198.getClass(), "type", 83);
        setIntField(term579268, term579268.getClass(), "type", 83);
        setIntField(term579338, term579338.getClass(), "type", 83);
        setIntField(term579408, term579408.getClass(), "type", 83);
        setIntField(term579478, term579478.getClass(), "type", 83);
        setIntField(term579548, term579548.getClass(), "type", 83);
        setIntField(term579618, term579618.getClass(), "type", 83);
        setIntField(term579688, term579688.getClass(), "type", 83);
        setIntField(term579758, term579758.getClass(), "type", 83);
        setIntField(term579828, term579828.getClass(), "type", 83);
        setIntField(term579898, term579898.getClass(), "type", 83);
        setIntField(term579968, term579968.getClass(), "type", 83);
        setIntField(term580038, term580038.getClass(), "type", 83);
        setIntField(term580108, term580108.getClass(), "type", 83);
        setIntField(term580178, term580178.getClass(), "type", 83);
        setIntField(term580248, term580248.getClass(), "type", 83);
        setIntField(term580318, term580318.getClass(), "type", 83);
        setIntField(term580388, term580388.getClass(), "type", 83);
        setIntField(term580458, term580458.getClass(), "type", 83);
        setIntField(term580528, term580528.getClass(), "type", 83);
        setIntField(term580598, term580598.getClass(), "type", 83);
        setIntField(term580668, term580668.getClass(), "type", 83);
        setIntField(term580738, term580738.getClass(), "type", 83);
        setIntField(term580808, term580808.getClass(), "type", 83);
        setIntField(term580878, term580878.getClass(), "type", 83);
        setIntField(term580948, term580948.getClass(), "type", 83);
        setIntField(term581018, term581018.getClass(), "type", 18);
        setField(term580948, term580948.getClass(), "first", term581018);
        setField(term580878, term580878.getClass(), "first", term580948);
        setField(term580808, term580808.getClass(), "first", term580878);
        setField(term580738, term580738.getClass(), "first", term580808);
        setField(term580668, term580668.getClass(), "first", term580738);
        setField(term580598, term580598.getClass(), "first", term580668);
        setField(term580528, term580528.getClass(), "first", term580598);
        setField(term580458, term580458.getClass(), "first", term580528);
        setField(term580388, term580388.getClass(), "first", term580458);
        setField(term580318, term580318.getClass(), "first", term580388);
        setField(term580248, term580248.getClass(), "first", term580318);
        setField(term580178, term580178.getClass(), "first", term580248);
        setField(term580108, term580108.getClass(), "first", term580178);
        setField(term580038, term580038.getClass(), "first", term580108);
        setField(term579968, term579968.getClass(), "first", term580038);
        setField(term579898, term579898.getClass(), "first", term579968);
        setField(term579828, term579828.getClass(), "first", term579898);
        setField(term579758, term579758.getClass(), "first", term579828);
        setField(term579688, term579688.getClass(), "first", term579758);
        setField(term579618, term579618.getClass(), "first", term579688);
        setField(term579548, term579548.getClass(), "first", term579618);
        setField(term579478, term579478.getClass(), "first", term579548);
        setField(term579408, term579408.getClass(), "first", term579478);
        setField(term579338, term579338.getClass(), "first", term579408);
        setField(term579268, term579268.getClass(), "first", term579338);
        setField(term579198, term579198.getClass(), "first", term579268);
        setField(term579128, term579128.getClass(), "first", term579198);
        setField(term579058, term579058.getClass(), "first", term579128);
        setField(term578988, term578988.getClass(), "first", term579058);
        setField(term578918, term578918.getClass(), "first", term578988);
        setField(term578848, term578848.getClass(), "first", term578918);
        setField(term578778, term578778.getClass(), "first", term578848);
        setField(term578708, term578708.getClass(), "first", term578778);
        setField(term578638, term578638.getClass(), "first", term578708);
        setField(term578568, term578568.getClass(), "first", term578638);
        setField(term578498, term578498.getClass(), "first", term578568);
        setField(term578428, term578428.getClass(), "first", term578498);
        setField(term578358, term578358.getClass(), "first", term578428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term578358;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term578288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


