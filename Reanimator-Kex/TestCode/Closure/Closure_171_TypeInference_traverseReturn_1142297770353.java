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

public class TypeInference_traverseReturn_1142297770353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867159;
     Object term867229;

    public TypeInference_traverseReturn_1142297770353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867159 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term867229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term867299, term867299.getClass(), "type", 92);
        setIntField(term867369, term867369.getClass(), "type", 92);
        setIntField(term867439, term867439.getClass(), "type", 92);
        setIntField(term867509, term867509.getClass(), "type", 92);
        setIntField(term867579, term867579.getClass(), "type", 92);
        setIntField(term867649, term867649.getClass(), "type", 92);
        setIntField(term867719, term867719.getClass(), "type", 92);
        setIntField(term867789, term867789.getClass(), "type", 92);
        setIntField(term867859, term867859.getClass(), "type", 92);
        setIntField(term867929, term867929.getClass(), "type", 92);
        setIntField(term867999, term867999.getClass(), "type", 92);
        setIntField(term868069, term868069.getClass(), "type", 92);
        setIntField(term868139, term868139.getClass(), "type", 92);
        setIntField(term868209, term868209.getClass(), "type", 92);
        setIntField(term868279, term868279.getClass(), "type", 92);
        setIntField(term868349, term868349.getClass(), "type", 92);
        setIntField(term868419, term868419.getClass(), "type", 92);
        setIntField(term868489, term868489.getClass(), "type", 92);
        setIntField(term868559, term868559.getClass(), "type", 92);
        setIntField(term868629, term868629.getClass(), "type", 92);
        setIntField(term868699, term868699.getClass(), "type", 92);
        setIntField(term868769, term868769.getClass(), "type", 92);
        setIntField(term868839, term868839.getClass(), "type", 92);
        setIntField(term868909, term868909.getClass(), "type", 92);
        setIntField(term868979, term868979.getClass(), "type", 92);
        setIntField(term869049, term869049.getClass(), "type", 92);
        setIntField(term869119, term869119.getClass(), "type", 92);
        setIntField(term869189, term869189.getClass(), "type", 92);
        setIntField(term869259, term869259.getClass(), "type", 92);
        setIntField(term869329, term869329.getClass(), "type", 92);
        setIntField(term869399, term869399.getClass(), "type", 92);
        setIntField(term869469, term869469.getClass(), "type", 92);
        setIntField(term869539, term869539.getClass(), "type", 92);
        setIntField(term869609, term869609.getClass(), "type", 92);
        setIntField(term869679, term869679.getClass(), "type", 92);
        setIntField(term869749, term869749.getClass(), "type", 92);
        setIntField(term869819, term869819.getClass(), "type", 92);
        setIntField(term869889, term869889.getClass(), "type", 92);
        setIntField(term869959, term869959.getClass(), "type", 92);
        setIntField(term870029, term870029.getClass(), "type", 92);
        setIntField(term870099, term870099.getClass(), "type", 92);
        setIntField(term870169, term870169.getClass(), "type", 125);
        setField(term870099, term870099.getClass(), "first", term870169);
        setField(term870029, term870029.getClass(), "first", term870099);
        setField(term869959, term869959.getClass(), "first", term870029);
        setField(term869889, term869889.getClass(), "first", term869959);
        setField(term869819, term869819.getClass(), "first", term869889);
        setField(term869749, term869749.getClass(), "first", term869819);
        setField(term869679, term869679.getClass(), "first", term869749);
        setField(term869609, term869609.getClass(), "first", term869679);
        setField(term869539, term869539.getClass(), "first", term869609);
        setField(term869469, term869469.getClass(), "first", term869539);
        setField(term869399, term869399.getClass(), "first", term869469);
        setField(term869329, term869329.getClass(), "first", term869399);
        setField(term869259, term869259.getClass(), "first", term869329);
        setField(term869189, term869189.getClass(), "first", term869259);
        setField(term869119, term869119.getClass(), "first", term869189);
        setField(term869049, term869049.getClass(), "first", term869119);
        setField(term868979, term868979.getClass(), "first", term869049);
        setField(term868909, term868909.getClass(), "first", term868979);
        setField(term868839, term868839.getClass(), "first", term868909);
        setField(term868769, term868769.getClass(), "first", term868839);
        setField(term868699, term868699.getClass(), "first", term868769);
        setField(term868629, term868629.getClass(), "first", term868699);
        setField(term868559, term868559.getClass(), "first", term868629);
        setField(term868489, term868489.getClass(), "first", term868559);
        setField(term868419, term868419.getClass(), "first", term868489);
        setField(term868349, term868349.getClass(), "first", term868419);
        setField(term868279, term868279.getClass(), "first", term868349);
        setField(term868209, term868209.getClass(), "first", term868279);
        setField(term868139, term868139.getClass(), "first", term868209);
        setField(term868069, term868069.getClass(), "first", term868139);
        setField(term867999, term867999.getClass(), "first", term868069);
        setField(term867929, term867929.getClass(), "first", term867999);
        setField(term867859, term867859.getClass(), "first", term867929);
        setField(term867789, term867789.getClass(), "first", term867859);
        setField(term867719, term867719.getClass(), "first", term867789);
        setField(term867649, term867649.getClass(), "first", term867719);
        setField(term867579, term867579.getClass(), "first", term867649);
        setField(term867509, term867509.getClass(), "first", term867579);
        setField(term867439, term867439.getClass(), "first", term867509);
        setField(term867369, term867369.getClass(), "first", term867439);
        setField(term867299, term867299.getClass(), "first", term867369);
        setField(term867229, term867229.getClass(), "first", term867299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term867229;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term867159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


