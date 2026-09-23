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

public class TypeInference_traverseAdd_1886586883150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79474;
     Object term79544;

    public TypeInference_traverseAdd_1886586883150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term79544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79614, term79614.getClass(), "next", null);
        setIntField(term79614, term79614.getClass(), "type", 4);
        setIntField(term79684, term79684.getClass(), "type", 4);
        setIntField(term79754, term79754.getClass(), "type", 4);
        setIntField(term79824, term79824.getClass(), "type", 4);
        setIntField(term79894, term79894.getClass(), "type", 4);
        setIntField(term79964, term79964.getClass(), "type", 4);
        setIntField(term80034, term80034.getClass(), "type", 4);
        setIntField(term80104, term80104.getClass(), "type", 4);
        setIntField(term80174, term80174.getClass(), "type", 4);
        setIntField(term80244, term80244.getClass(), "type", 4);
        setIntField(term80314, term80314.getClass(), "type", 4);
        setIntField(term80384, term80384.getClass(), "type", 4);
        setIntField(term80454, term80454.getClass(), "type", 4);
        setIntField(term80524, term80524.getClass(), "type", 4);
        setIntField(term80594, term80594.getClass(), "type", 4);
        setIntField(term80664, term80664.getClass(), "type", 4);
        setIntField(term80734, term80734.getClass(), "type", 4);
        setIntField(term80804, term80804.getClass(), "type", 4);
        setIntField(term80874, term80874.getClass(), "type", 4);
        setIntField(term80944, term80944.getClass(), "type", 4);
        setIntField(term81014, term81014.getClass(), "type", 4);
        setIntField(term81084, term81084.getClass(), "type", 4);
        setIntField(term81154, term81154.getClass(), "type", 4);
        setIntField(term81224, term81224.getClass(), "type", 4);
        setIntField(term81294, term81294.getClass(), "type", 4);
        setIntField(term81364, term81364.getClass(), "type", 4);
        setIntField(term81434, term81434.getClass(), "type", 4);
        setIntField(term81504, term81504.getClass(), "type", 4);
        setIntField(term81574, term81574.getClass(), "type", 4);
        setIntField(term81644, term81644.getClass(), "type", 4);
        setIntField(term81714, term81714.getClass(), "type", 4);
        setIntField(term81784, term81784.getClass(), "type", 4);
        setIntField(term81854, term81854.getClass(), "type", 4);
        setIntField(term81924, term81924.getClass(), "type", 4);
        setIntField(term81994, term81994.getClass(), "type", 4);
        setIntField(term82064, term82064.getClass(), "type", 4);
        setIntField(term82134, term82134.getClass(), "type", 4);
        setIntField(term82204, term82204.getClass(), "type", 114);
        setField(term82134, term82134.getClass(), "first", term82204);
        setField(term82064, term82064.getClass(), "first", term82134);
        setField(term81994, term81994.getClass(), "first", term82064);
        setField(term81924, term81924.getClass(), "first", term81994);
        setField(term81854, term81854.getClass(), "first", term81924);
        setField(term81784, term81784.getClass(), "first", term81854);
        setField(term81714, term81714.getClass(), "first", term81784);
        setField(term81644, term81644.getClass(), "first", term81714);
        setField(term81574, term81574.getClass(), "first", term81644);
        setField(term81504, term81504.getClass(), "first", term81574);
        setField(term81434, term81434.getClass(), "first", term81504);
        setField(term81364, term81364.getClass(), "first", term81434);
        setField(term81294, term81294.getClass(), "first", term81364);
        setField(term81224, term81224.getClass(), "first", term81294);
        setField(term81154, term81154.getClass(), "first", term81224);
        setField(term81084, term81084.getClass(), "first", term81154);
        setField(term81014, term81014.getClass(), "first", term81084);
        setField(term80944, term80944.getClass(), "first", term81014);
        setField(term80874, term80874.getClass(), "first", term80944);
        setField(term80804, term80804.getClass(), "first", term80874);
        setField(term80734, term80734.getClass(), "first", term80804);
        setField(term80664, term80664.getClass(), "first", term80734);
        setField(term80594, term80594.getClass(), "first", term80664);
        setField(term80524, term80524.getClass(), "first", term80594);
        setField(term80454, term80454.getClass(), "first", term80524);
        setField(term80384, term80384.getClass(), "first", term80454);
        setField(term80314, term80314.getClass(), "first", term80384);
        setField(term80244, term80244.getClass(), "first", term80314);
        setField(term80174, term80174.getClass(), "first", term80244);
        setField(term80104, term80104.getClass(), "first", term80174);
        setField(term80034, term80034.getClass(), "first", term80104);
        setField(term79964, term79964.getClass(), "first", term80034);
        setField(term79894, term79894.getClass(), "first", term79964);
        setField(term79824, term79824.getClass(), "first", term79894);
        setField(term79754, term79754.getClass(), "first", term79824);
        setField(term79684, term79684.getClass(), "first", term79754);
        setField(term79614, term79614.getClass(), "first", term79684);
        setField(term79544, term79544.getClass(), "first", term79614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term79544;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term79474, args);
    }

};


