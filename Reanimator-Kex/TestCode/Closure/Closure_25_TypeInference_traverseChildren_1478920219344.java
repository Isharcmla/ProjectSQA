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

public class TypeInference_traverseChildren_1478920219344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973186;
     Object term973256;

    public TypeInference_traverseChildren_1478920219344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term973186 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term973256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term973326, term973326.getClass(), "type", 18);
        setIntField(term973396, term973396.getClass(), "type", 18);
        setIntField(term973466, term973466.getClass(), "type", 18);
        setIntField(term973536, term973536.getClass(), "type", 18);
        setIntField(term973606, term973606.getClass(), "type", 18);
        setIntField(term973676, term973676.getClass(), "type", 18);
        setIntField(term973746, term973746.getClass(), "type", 18);
        setIntField(term973816, term973816.getClass(), "type", 18);
        setIntField(term973886, term973886.getClass(), "type", 18);
        setIntField(term973956, term973956.getClass(), "type", 18);
        setIntField(term974026, term974026.getClass(), "type", 18);
        setIntField(term974096, term974096.getClass(), "type", 18);
        setIntField(term974166, term974166.getClass(), "type", 18);
        setIntField(term974236, term974236.getClass(), "type", 18);
        setIntField(term974306, term974306.getClass(), "type", 18);
        setIntField(term974376, term974376.getClass(), "type", 18);
        setIntField(term974446, term974446.getClass(), "type", 18);
        setIntField(term974516, term974516.getClass(), "type", 18);
        setIntField(term974586, term974586.getClass(), "type", 18);
        setIntField(term974656, term974656.getClass(), "type", 18);
        setIntField(term974726, term974726.getClass(), "type", 18);
        setIntField(term974796, term974796.getClass(), "type", 18);
        setIntField(term974866, term974866.getClass(), "type", 18);
        setIntField(term974936, term974936.getClass(), "type", 18);
        setIntField(term975006, term975006.getClass(), "type", 18);
        setIntField(term975076, term975076.getClass(), "type", 18);
        setIntField(term975146, term975146.getClass(), "type", 18);
        setIntField(term975216, term975216.getClass(), "type", 18);
        setIntField(term975286, term975286.getClass(), "type", 18);
        setIntField(term975356, term975356.getClass(), "type", 18);
        setIntField(term975426, term975426.getClass(), "type", 54);
        setField(term975356, term975356.getClass(), "first", term975426);
        setField(term975286, term975286.getClass(), "first", term975356);
        setField(term975216, term975216.getClass(), "first", term975286);
        setField(term975146, term975146.getClass(), "first", term975216);
        setField(term975076, term975076.getClass(), "first", term975146);
        setField(term975006, term975006.getClass(), "first", term975076);
        setField(term974936, term974936.getClass(), "first", term975006);
        setField(term974866, term974866.getClass(), "first", term974936);
        setField(term974796, term974796.getClass(), "first", term974866);
        setField(term974726, term974726.getClass(), "first", term974796);
        setField(term974656, term974656.getClass(), "first", term974726);
        setField(term974586, term974586.getClass(), "first", term974656);
        setField(term974516, term974516.getClass(), "first", term974586);
        setField(term974446, term974446.getClass(), "first", term974516);
        setField(term974376, term974376.getClass(), "first", term974446);
        setField(term974306, term974306.getClass(), "first", term974376);
        setField(term974236, term974236.getClass(), "first", term974306);
        setField(term974166, term974166.getClass(), "first", term974236);
        setField(term974096, term974096.getClass(), "first", term974166);
        setField(term974026, term974026.getClass(), "first", term974096);
        setField(term973956, term973956.getClass(), "first", term974026);
        setField(term973886, term973886.getClass(), "first", term973956);
        setField(term973816, term973816.getClass(), "first", term973886);
        setField(term973746, term973746.getClass(), "first", term973816);
        setField(term973676, term973676.getClass(), "first", term973746);
        setField(term973606, term973606.getClass(), "first", term973676);
        setField(term973536, term973536.getClass(), "first", term973606);
        setField(term973466, term973466.getClass(), "first", term973536);
        setField(term973396, term973396.getClass(), "first", term973466);
        setField(term973326, term973326.getClass(), "first", term973396);
        setField(term973256, term973256.getClass(), "first", term973326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term973256;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term973186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


