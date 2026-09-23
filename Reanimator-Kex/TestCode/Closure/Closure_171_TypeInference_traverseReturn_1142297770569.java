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

public class TypeInference_traverseReturn_1142297770569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1861147;
     Object term1861217;

    public TypeInference_traverseReturn_1142297770569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1861147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1861217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1863527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1861287, term1861287.getClass(), "type", 92);
        setIntField(term1861357, term1861357.getClass(), "type", 92);
        setIntField(term1861427, term1861427.getClass(), "type", 92);
        setIntField(term1861497, term1861497.getClass(), "type", 92);
        setIntField(term1861567, term1861567.getClass(), "type", 92);
        setIntField(term1861637, term1861637.getClass(), "type", 92);
        setIntField(term1861707, term1861707.getClass(), "type", 92);
        setIntField(term1861777, term1861777.getClass(), "type", 92);
        setIntField(term1861847, term1861847.getClass(), "type", 92);
        setIntField(term1861917, term1861917.getClass(), "type", 92);
        setIntField(term1861987, term1861987.getClass(), "type", 92);
        setIntField(term1862057, term1862057.getClass(), "type", 92);
        setIntField(term1862127, term1862127.getClass(), "type", 92);
        setIntField(term1862197, term1862197.getClass(), "type", 92);
        setIntField(term1862267, term1862267.getClass(), "type", 92);
        setIntField(term1862337, term1862337.getClass(), "type", 92);
        setIntField(term1862407, term1862407.getClass(), "type", 92);
        setIntField(term1862477, term1862477.getClass(), "type", 92);
        setIntField(term1862547, term1862547.getClass(), "type", 92);
        setIntField(term1862617, term1862617.getClass(), "type", 92);
        setIntField(term1862687, term1862687.getClass(), "type", 92);
        setIntField(term1862757, term1862757.getClass(), "type", 92);
        setIntField(term1862827, term1862827.getClass(), "type", 92);
        setIntField(term1862897, term1862897.getClass(), "type", 92);
        setIntField(term1862967, term1862967.getClass(), "type", 92);
        setIntField(term1863037, term1863037.getClass(), "type", 92);
        setIntField(term1863107, term1863107.getClass(), "type", 92);
        setIntField(term1863177, term1863177.getClass(), "type", 92);
        setIntField(term1863247, term1863247.getClass(), "type", 92);
        setIntField(term1863317, term1863317.getClass(), "type", 92);
        setIntField(term1863387, term1863387.getClass(), "type", 92);
        setIntField(term1863457, term1863457.getClass(), "type", 92);
        setIntField(term1863527, term1863527.getClass(), "type", 57);
        setField(term1863457, term1863457.getClass(), "first", term1863527);
        setField(term1863387, term1863387.getClass(), "first", term1863457);
        setField(term1863317, term1863317.getClass(), "first", term1863387);
        setField(term1863247, term1863247.getClass(), "first", term1863317);
        setField(term1863177, term1863177.getClass(), "first", term1863247);
        setField(term1863107, term1863107.getClass(), "first", term1863177);
        setField(term1863037, term1863037.getClass(), "first", term1863107);
        setField(term1862967, term1862967.getClass(), "first", term1863037);
        setField(term1862897, term1862897.getClass(), "first", term1862967);
        setField(term1862827, term1862827.getClass(), "first", term1862897);
        setField(term1862757, term1862757.getClass(), "first", term1862827);
        setField(term1862687, term1862687.getClass(), "first", term1862757);
        setField(term1862617, term1862617.getClass(), "first", term1862687);
        setField(term1862547, term1862547.getClass(), "first", term1862617);
        setField(term1862477, term1862477.getClass(), "first", term1862547);
        setField(term1862407, term1862407.getClass(), "first", term1862477);
        setField(term1862337, term1862337.getClass(), "first", term1862407);
        setField(term1862267, term1862267.getClass(), "first", term1862337);
        setField(term1862197, term1862197.getClass(), "first", term1862267);
        setField(term1862127, term1862127.getClass(), "first", term1862197);
        setField(term1862057, term1862057.getClass(), "first", term1862127);
        setField(term1861987, term1861987.getClass(), "first", term1862057);
        setField(term1861917, term1861917.getClass(), "first", term1861987);
        setField(term1861847, term1861847.getClass(), "first", term1861917);
        setField(term1861777, term1861777.getClass(), "first", term1861847);
        setField(term1861707, term1861707.getClass(), "first", term1861777);
        setField(term1861637, term1861637.getClass(), "first", term1861707);
        setField(term1861567, term1861567.getClass(), "first", term1861637);
        setField(term1861497, term1861497.getClass(), "first", term1861567);
        setField(term1861427, term1861427.getClass(), "first", term1861497);
        setField(term1861357, term1861357.getClass(), "first", term1861427);
        setField(term1861287, term1861287.getClass(), "first", term1861357);
        setField(term1861217, term1861217.getClass(), "first", term1861287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1861217;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1861147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


