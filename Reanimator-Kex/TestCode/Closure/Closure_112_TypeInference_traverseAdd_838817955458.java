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

public class TypeInference_traverseAdd_838817955458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1662326;
     Object term1662396;

    public TypeInference_traverseAdd_838817955458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1662326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1662396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1663936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1662466, term1662466.getClass(), "next", term1662536);
        setIntField(term1662466, term1662466.getClass(), "type", 14);
        setIntField(term1662606, term1662606.getClass(), "type", 14);
        setIntField(term1662676, term1662676.getClass(), "type", 14);
        setIntField(term1662746, term1662746.getClass(), "type", 14);
        setIntField(term1662816, term1662816.getClass(), "type", 14);
        setIntField(term1662886, term1662886.getClass(), "type", 14);
        setIntField(term1662956, term1662956.getClass(), "type", 14);
        setIntField(term1663026, term1663026.getClass(), "type", 14);
        setIntField(term1663096, term1663096.getClass(), "type", 14);
        setIntField(term1663166, term1663166.getClass(), "type", 14);
        setIntField(term1663236, term1663236.getClass(), "type", 14);
        setIntField(term1663306, term1663306.getClass(), "type", 14);
        setIntField(term1663376, term1663376.getClass(), "type", 14);
        setIntField(term1663446, term1663446.getClass(), "type", 14);
        setIntField(term1663516, term1663516.getClass(), "type", 14);
        setIntField(term1663586, term1663586.getClass(), "type", 14);
        setIntField(term1663656, term1663656.getClass(), "type", 14);
        setIntField(term1663726, term1663726.getClass(), "type", 14);
        setIntField(term1663796, term1663796.getClass(), "type", 14);
        setIntField(term1663866, term1663866.getClass(), "type", 14);
        setIntField(term1663936, term1663936.getClass(), "type", 14);
        setIntField(term1664006, term1664006.getClass(), "type", 14);
        setIntField(term1664076, term1664076.getClass(), "type", 14);
        setIntField(term1664146, term1664146.getClass(), "type", 14);
        setIntField(term1664216, term1664216.getClass(), "type", 114);
        setField(term1664146, term1664146.getClass(), "first", term1664216);
        setField(term1664076, term1664076.getClass(), "first", term1664146);
        setField(term1664006, term1664006.getClass(), "first", term1664076);
        setField(term1663936, term1663936.getClass(), "first", term1664006);
        setField(term1663866, term1663866.getClass(), "first", term1663936);
        setField(term1663796, term1663796.getClass(), "first", term1663866);
        setField(term1663726, term1663726.getClass(), "first", term1663796);
        setField(term1663656, term1663656.getClass(), "first", term1663726);
        setField(term1663586, term1663586.getClass(), "first", term1663656);
        setField(term1663516, term1663516.getClass(), "first", term1663586);
        setField(term1663446, term1663446.getClass(), "first", term1663516);
        setField(term1663376, term1663376.getClass(), "first", term1663446);
        setField(term1663306, term1663306.getClass(), "first", term1663376);
        setField(term1663236, term1663236.getClass(), "first", term1663306);
        setField(term1663166, term1663166.getClass(), "first", term1663236);
        setField(term1663096, term1663096.getClass(), "first", term1663166);
        setField(term1663026, term1663026.getClass(), "first", term1663096);
        setField(term1662956, term1662956.getClass(), "first", term1663026);
        setField(term1662886, term1662886.getClass(), "first", term1662956);
        setField(term1662816, term1662816.getClass(), "first", term1662886);
        setField(term1662746, term1662746.getClass(), "first", term1662816);
        setField(term1662676, term1662676.getClass(), "first", term1662746);
        setField(term1662606, term1662606.getClass(), "first", term1662676);
        setField(term1662466, term1662466.getClass(), "first", term1662606);
        setField(term1662396, term1662396.getClass(), "first", term1662466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1662396;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1662326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


