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

public class TypeInference_traverseArrayLiteral_67090236501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209937;
     Object term2210007;

    public TypeInference_traverseArrayLiteral_67090236501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2209937 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2210007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2211967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2214067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2214137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2210077, term2210077.getClass(), "type", 83);
        setIntField(term2210147, term2210147.getClass(), "type", 83);
        setIntField(term2210217, term2210217.getClass(), "type", 83);
        setIntField(term2210287, term2210287.getClass(), "type", 83);
        setIntField(term2210357, term2210357.getClass(), "type", 83);
        setIntField(term2210427, term2210427.getClass(), "type", 83);
        setIntField(term2210497, term2210497.getClass(), "type", 83);
        setIntField(term2210567, term2210567.getClass(), "type", 83);
        setIntField(term2210637, term2210637.getClass(), "type", 83);
        setIntField(term2210707, term2210707.getClass(), "type", 83);
        setIntField(term2210777, term2210777.getClass(), "type", 83);
        setIntField(term2210847, term2210847.getClass(), "type", 83);
        setIntField(term2210917, term2210917.getClass(), "type", 83);
        setIntField(term2210987, term2210987.getClass(), "type", 83);
        setIntField(term2211057, term2211057.getClass(), "type", 83);
        setIntField(term2211127, term2211127.getClass(), "type", 83);
        setIntField(term2211197, term2211197.getClass(), "type", 83);
        setIntField(term2211267, term2211267.getClass(), "type", 83);
        setIntField(term2211337, term2211337.getClass(), "type", 83);
        setIntField(term2211407, term2211407.getClass(), "type", 83);
        setIntField(term2211477, term2211477.getClass(), "type", 83);
        setIntField(term2211547, term2211547.getClass(), "type", 83);
        setIntField(term2211617, term2211617.getClass(), "type", 83);
        setIntField(term2211687, term2211687.getClass(), "type", 83);
        setIntField(term2211757, term2211757.getClass(), "type", 83);
        setIntField(term2211827, term2211827.getClass(), "type", 83);
        setIntField(term2211897, term2211897.getClass(), "type", 83);
        setIntField(term2211967, term2211967.getClass(), "type", 83);
        setIntField(term2212037, term2212037.getClass(), "type", 83);
        setIntField(term2212107, term2212107.getClass(), "type", 83);
        setIntField(term2212177, term2212177.getClass(), "type", 83);
        setIntField(term2212247, term2212247.getClass(), "type", 83);
        setIntField(term2212317, term2212317.getClass(), "type", 83);
        setIntField(term2212387, term2212387.getClass(), "type", 83);
        setIntField(term2212457, term2212457.getClass(), "type", 83);
        setIntField(term2212527, term2212527.getClass(), "type", 83);
        setIntField(term2212597, term2212597.getClass(), "type", 83);
        setIntField(term2212667, term2212667.getClass(), "type", 83);
        setIntField(term2212737, term2212737.getClass(), "type", 83);
        setIntField(term2212807, term2212807.getClass(), "type", 83);
        setIntField(term2212877, term2212877.getClass(), "type", 83);
        setIntField(term2212947, term2212947.getClass(), "type", 83);
        setIntField(term2213017, term2213017.getClass(), "type", 83);
        setIntField(term2213087, term2213087.getClass(), "type", 83);
        setIntField(term2213157, term2213157.getClass(), "type", 83);
        setIntField(term2213227, term2213227.getClass(), "type", 83);
        setIntField(term2213297, term2213297.getClass(), "type", 83);
        setIntField(term2213367, term2213367.getClass(), "type", 83);
        setIntField(term2213437, term2213437.getClass(), "type", 83);
        setIntField(term2213507, term2213507.getClass(), "type", 83);
        setIntField(term2213577, term2213577.getClass(), "type", 83);
        setIntField(term2213647, term2213647.getClass(), "type", 83);
        setIntField(term2213717, term2213717.getClass(), "type", 83);
        setIntField(term2213787, term2213787.getClass(), "type", 83);
        setIntField(term2213857, term2213857.getClass(), "type", 83);
        setIntField(term2213927, term2213927.getClass(), "type", 83);
        setIntField(term2213997, term2213997.getClass(), "type", 83);
        setIntField(term2214067, term2214067.getClass(), "type", 83);
        setIntField(term2214137, term2214137.getClass(), "type", 47);
        setField(term2214067, term2214067.getClass(), "first", term2214137);
        setField(term2213997, term2213997.getClass(), "first", term2214067);
        setField(term2213927, term2213927.getClass(), "first", term2213997);
        setField(term2213857, term2213857.getClass(), "first", term2213927);
        setField(term2213787, term2213787.getClass(), "first", term2213857);
        setField(term2213717, term2213717.getClass(), "first", term2213787);
        setField(term2213647, term2213647.getClass(), "first", term2213717);
        setField(term2213577, term2213577.getClass(), "first", term2213647);
        setField(term2213507, term2213507.getClass(), "first", term2213577);
        setField(term2213437, term2213437.getClass(), "first", term2213507);
        setField(term2213367, term2213367.getClass(), "first", term2213437);
        setField(term2213297, term2213297.getClass(), "first", term2213367);
        setField(term2213227, term2213227.getClass(), "first", term2213297);
        setField(term2213157, term2213157.getClass(), "first", term2213227);
        setField(term2213087, term2213087.getClass(), "first", term2213157);
        setField(term2213017, term2213017.getClass(), "first", term2213087);
        setField(term2212947, term2212947.getClass(), "first", term2213017);
        setField(term2212877, term2212877.getClass(), "first", term2212947);
        setField(term2212807, term2212807.getClass(), "first", term2212877);
        setField(term2212737, term2212737.getClass(), "first", term2212807);
        setField(term2212667, term2212667.getClass(), "first", term2212737);
        setField(term2212597, term2212597.getClass(), "first", term2212667);
        setField(term2212527, term2212527.getClass(), "first", term2212597);
        setField(term2212457, term2212457.getClass(), "first", term2212527);
        setField(term2212387, term2212387.getClass(), "first", term2212457);
        setField(term2212317, term2212317.getClass(), "first", term2212387);
        setField(term2212247, term2212247.getClass(), "first", term2212317);
        setField(term2212177, term2212177.getClass(), "first", term2212247);
        setField(term2212107, term2212107.getClass(), "first", term2212177);
        setField(term2212037, term2212037.getClass(), "first", term2212107);
        setField(term2211967, term2211967.getClass(), "first", term2212037);
        setField(term2211897, term2211897.getClass(), "first", term2211967);
        setField(term2211827, term2211827.getClass(), "first", term2211897);
        setField(term2211757, term2211757.getClass(), "first", term2211827);
        setField(term2211687, term2211687.getClass(), "first", term2211757);
        setField(term2211617, term2211617.getClass(), "first", term2211687);
        setField(term2211547, term2211547.getClass(), "first", term2211617);
        setField(term2211477, term2211477.getClass(), "first", term2211547);
        setField(term2211407, term2211407.getClass(), "first", term2211477);
        setField(term2211337, term2211337.getClass(), "first", term2211407);
        setField(term2211267, term2211267.getClass(), "first", term2211337);
        setField(term2211197, term2211197.getClass(), "first", term2211267);
        setField(term2211127, term2211127.getClass(), "first", term2211197);
        setField(term2211057, term2211057.getClass(), "first", term2211127);
        setField(term2210987, term2210987.getClass(), "first", term2211057);
        setField(term2210917, term2210917.getClass(), "first", term2210987);
        setField(term2210847, term2210847.getClass(), "first", term2210917);
        setField(term2210777, term2210777.getClass(), "first", term2210847);
        setField(term2210707, term2210707.getClass(), "first", term2210777);
        setField(term2210637, term2210637.getClass(), "first", term2210707);
        setField(term2210567, term2210567.getClass(), "first", term2210637);
        setField(term2210497, term2210497.getClass(), "first", term2210567);
        setField(term2210427, term2210427.getClass(), "first", term2210497);
        setField(term2210357, term2210357.getClass(), "first", term2210427);
        setField(term2210287, term2210287.getClass(), "first", term2210357);
        setField(term2210217, term2210217.getClass(), "first", term2210287);
        setField(term2210147, term2210147.getClass(), "first", term2210217);
        setField(term2210077, term2210077.getClass(), "first", term2210147);
        setField(term2210007, term2210007.getClass(), "first", term2210077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2210007;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term2209937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


