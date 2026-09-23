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

public class TypeInference_traverseAdd_838817955372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859935;
     Object term860005;

    public TypeInference_traverseAdd_838817955372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term859935 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term860005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term860075, term860075.getClass(), "next", null);
        setIntField(term860075, term860075.getClass(), "type", 14);
        setIntField(term860145, term860145.getClass(), "type", 14);
        setIntField(term860215, term860215.getClass(), "type", 14);
        setIntField(term860285, term860285.getClass(), "type", 14);
        setIntField(term860355, term860355.getClass(), "type", 14);
        setIntField(term860425, term860425.getClass(), "type", 14);
        setIntField(term860495, term860495.getClass(), "type", 14);
        setIntField(term860565, term860565.getClass(), "type", 14);
        setIntField(term860635, term860635.getClass(), "type", 14);
        setIntField(term860705, term860705.getClass(), "type", 14);
        setIntField(term860775, term860775.getClass(), "type", 14);
        setIntField(term860845, term860845.getClass(), "type", 14);
        setIntField(term860915, term860915.getClass(), "type", 14);
        setIntField(term860985, term860985.getClass(), "type", 14);
        setIntField(term861055, term861055.getClass(), "type", 14);
        setIntField(term861125, term861125.getClass(), "type", 14);
        setIntField(term861195, term861195.getClass(), "type", 14);
        setIntField(term861265, term861265.getClass(), "type", 14);
        setIntField(term861335, term861335.getClass(), "type", 14);
        setIntField(term861405, term861405.getClass(), "type", 14);
        setIntField(term861475, term861475.getClass(), "type", 14);
        setIntField(term861545, term861545.getClass(), "type", 14);
        setIntField(term861615, term861615.getClass(), "type", 14);
        setIntField(term861685, term861685.getClass(), "type", 14);
        setIntField(term861755, term861755.getClass(), "type", 14);
        setIntField(term861825, term861825.getClass(), "type", 14);
        setIntField(term861895, term861895.getClass(), "type", 14);
        setIntField(term861965, term861965.getClass(), "type", 14);
        setIntField(term862035, term862035.getClass(), "type", 14);
        setIntField(term862105, term862105.getClass(), "type", 14);
        setIntField(term862175, term862175.getClass(), "type", 14);
        setIntField(term862245, term862245.getClass(), "type", 14);
        setIntField(term862315, term862315.getClass(), "type", 14);
        setIntField(term862385, term862385.getClass(), "type", 14);
        setIntField(term862455, term862455.getClass(), "type", 14);
        setIntField(term862525, term862525.getClass(), "type", 14);
        setIntField(term862595, term862595.getClass(), "type", 14);
        setIntField(term862665, term862665.getClass(), "type", 14);
        setIntField(term862735, term862735.getClass(), "type", 14);
        setIntField(term862805, term862805.getClass(), "type", 14);
        setIntField(term862875, term862875.getClass(), "type", 14);
        setIntField(term862945, term862945.getClass(), "type", 14);
        setIntField(term863015, term863015.getClass(), "type", 14);
        setIntField(term863085, term863085.getClass(), "type", 14);
        setIntField(term863155, term863155.getClass(), "type", 14);
        setIntField(term863225, term863225.getClass(), "type", 14);
        setIntField(term863295, term863295.getClass(), "type", 14);
        setIntField(term863365, term863365.getClass(), "type", 14);
        setIntField(term863435, term863435.getClass(), "type", 14);
        setIntField(term863505, term863505.getClass(), "type", 14);
        setIntField(term863575, term863575.getClass(), "type", 14);
        setIntField(term863645, term863645.getClass(), "type", 14);
        setIntField(term863715, term863715.getClass(), "type", 14);
        setIntField(term863785, term863785.getClass(), "type", 14);
        setIntField(term863855, term863855.getClass(), "type", 23);
        setField(term863785, term863785.getClass(), "first", term863855);
        setField(term863715, term863715.getClass(), "first", term863785);
        setField(term863645, term863645.getClass(), "first", term863715);
        setField(term863575, term863575.getClass(), "first", term863645);
        setField(term863505, term863505.getClass(), "first", term863575);
        setField(term863435, term863435.getClass(), "first", term863505);
        setField(term863365, term863365.getClass(), "first", term863435);
        setField(term863295, term863295.getClass(), "first", term863365);
        setField(term863225, term863225.getClass(), "first", term863295);
        setField(term863155, term863155.getClass(), "first", term863225);
        setField(term863085, term863085.getClass(), "first", term863155);
        setField(term863015, term863015.getClass(), "first", term863085);
        setField(term862945, term862945.getClass(), "first", term863015);
        setField(term862875, term862875.getClass(), "first", term862945);
        setField(term862805, term862805.getClass(), "first", term862875);
        setField(term862735, term862735.getClass(), "first", term862805);
        setField(term862665, term862665.getClass(), "first", term862735);
        setField(term862595, term862595.getClass(), "first", term862665);
        setField(term862525, term862525.getClass(), "first", term862595);
        setField(term862455, term862455.getClass(), "first", term862525);
        setField(term862385, term862385.getClass(), "first", term862455);
        setField(term862315, term862315.getClass(), "first", term862385);
        setField(term862245, term862245.getClass(), "first", term862315);
        setField(term862175, term862175.getClass(), "first", term862245);
        setField(term862105, term862105.getClass(), "first", term862175);
        setField(term862035, term862035.getClass(), "first", term862105);
        setField(term861965, term861965.getClass(), "first", term862035);
        setField(term861895, term861895.getClass(), "first", term861965);
        setField(term861825, term861825.getClass(), "first", term861895);
        setField(term861755, term861755.getClass(), "first", term861825);
        setField(term861685, term861685.getClass(), "first", term861755);
        setField(term861615, term861615.getClass(), "first", term861685);
        setField(term861545, term861545.getClass(), "first", term861615);
        setField(term861475, term861475.getClass(), "first", term861545);
        setField(term861405, term861405.getClass(), "first", term861475);
        setField(term861335, term861335.getClass(), "first", term861405);
        setField(term861265, term861265.getClass(), "first", term861335);
        setField(term861195, term861195.getClass(), "first", term861265);
        setField(term861125, term861125.getClass(), "first", term861195);
        setField(term861055, term861055.getClass(), "first", term861125);
        setField(term860985, term860985.getClass(), "first", term861055);
        setField(term860915, term860915.getClass(), "first", term860985);
        setField(term860845, term860845.getClass(), "first", term860915);
        setField(term860775, term860775.getClass(), "first", term860845);
        setField(term860705, term860705.getClass(), "first", term860775);
        setField(term860635, term860635.getClass(), "first", term860705);
        setField(term860565, term860565.getClass(), "first", term860635);
        setField(term860495, term860495.getClass(), "first", term860565);
        setField(term860425, term860425.getClass(), "first", term860495);
        setField(term860355, term860355.getClass(), "first", term860425);
        setField(term860285, term860285.getClass(), "first", term860355);
        setField(term860215, term860215.getClass(), "first", term860285);
        setField(term860145, term860145.getClass(), "first", term860215);
        setField(term860075, term860075.getClass(), "first", term860145);
        setField(term860005, term860005.getClass(), "first", term860075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term860005;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term859935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


