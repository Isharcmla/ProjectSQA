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

public class TypeInference_traverseReturn_1142297770523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1614005;
     Object term1614075;

    public TypeInference_traverseReturn_1142297770523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1614005 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1614075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1614985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1616735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1614145, term1614145.getClass(), "type", 92);
        setIntField(term1614215, term1614215.getClass(), "type", 92);
        setIntField(term1614285, term1614285.getClass(), "type", 92);
        setIntField(term1614355, term1614355.getClass(), "type", 92);
        setIntField(term1614425, term1614425.getClass(), "type", 92);
        setIntField(term1614495, term1614495.getClass(), "type", 92);
        setIntField(term1614565, term1614565.getClass(), "type", 92);
        setIntField(term1614635, term1614635.getClass(), "type", 92);
        setIntField(term1614705, term1614705.getClass(), "type", 92);
        setIntField(term1614775, term1614775.getClass(), "type", 92);
        setIntField(term1614845, term1614845.getClass(), "type", 92);
        setIntField(term1614915, term1614915.getClass(), "type", 92);
        setIntField(term1614985, term1614985.getClass(), "type", 92);
        setIntField(term1615055, term1615055.getClass(), "type", 92);
        setIntField(term1615125, term1615125.getClass(), "type", 92);
        setIntField(term1615195, term1615195.getClass(), "type", 92);
        setIntField(term1615265, term1615265.getClass(), "type", 92);
        setIntField(term1615335, term1615335.getClass(), "type", 92);
        setIntField(term1615405, term1615405.getClass(), "type", 92);
        setIntField(term1615475, term1615475.getClass(), "type", 92);
        setIntField(term1615545, term1615545.getClass(), "type", 92);
        setIntField(term1615615, term1615615.getClass(), "type", 92);
        setIntField(term1615685, term1615685.getClass(), "type", 92);
        setIntField(term1615755, term1615755.getClass(), "type", 92);
        setIntField(term1615825, term1615825.getClass(), "type", 92);
        setIntField(term1615895, term1615895.getClass(), "type", 92);
        setIntField(term1615965, term1615965.getClass(), "type", 92);
        setIntField(term1616035, term1616035.getClass(), "type", 92);
        setIntField(term1616105, term1616105.getClass(), "type", 92);
        setIntField(term1616175, term1616175.getClass(), "type", 92);
        setIntField(term1616245, term1616245.getClass(), "type", 92);
        setIntField(term1616315, term1616315.getClass(), "type", 92);
        setIntField(term1616385, term1616385.getClass(), "type", 92);
        setIntField(term1616455, term1616455.getClass(), "type", 92);
        setIntField(term1616525, term1616525.getClass(), "type", 92);
        setIntField(term1616595, term1616595.getClass(), "type", 92);
        setIntField(term1616665, term1616665.getClass(), "type", 92);
        setIntField(term1616735, term1616735.getClass(), "type", 16);
        setField(term1616665, term1616665.getClass(), "first", term1616735);
        setField(term1616595, term1616595.getClass(), "first", term1616665);
        setField(term1616525, term1616525.getClass(), "first", term1616595);
        setField(term1616455, term1616455.getClass(), "first", term1616525);
        setField(term1616385, term1616385.getClass(), "first", term1616455);
        setField(term1616315, term1616315.getClass(), "first", term1616385);
        setField(term1616245, term1616245.getClass(), "first", term1616315);
        setField(term1616175, term1616175.getClass(), "first", term1616245);
        setField(term1616105, term1616105.getClass(), "first", term1616175);
        setField(term1616035, term1616035.getClass(), "first", term1616105);
        setField(term1615965, term1615965.getClass(), "first", term1616035);
        setField(term1615895, term1615895.getClass(), "first", term1615965);
        setField(term1615825, term1615825.getClass(), "first", term1615895);
        setField(term1615755, term1615755.getClass(), "first", term1615825);
        setField(term1615685, term1615685.getClass(), "first", term1615755);
        setField(term1615615, term1615615.getClass(), "first", term1615685);
        setField(term1615545, term1615545.getClass(), "first", term1615615);
        setField(term1615475, term1615475.getClass(), "first", term1615545);
        setField(term1615405, term1615405.getClass(), "first", term1615475);
        setField(term1615335, term1615335.getClass(), "first", term1615405);
        setField(term1615265, term1615265.getClass(), "first", term1615335);
        setField(term1615195, term1615195.getClass(), "first", term1615265);
        setField(term1615125, term1615125.getClass(), "first", term1615195);
        setField(term1615055, term1615055.getClass(), "first", term1615125);
        setField(term1614985, term1614985.getClass(), "first", term1615055);
        setField(term1614915, term1614915.getClass(), "first", term1614985);
        setField(term1614845, term1614845.getClass(), "first", term1614915);
        setField(term1614775, term1614775.getClass(), "first", term1614845);
        setField(term1614705, term1614705.getClass(), "first", term1614775);
        setField(term1614635, term1614635.getClass(), "first", term1614705);
        setField(term1614565, term1614565.getClass(), "first", term1614635);
        setField(term1614495, term1614495.getClass(), "first", term1614565);
        setField(term1614425, term1614425.getClass(), "first", term1614495);
        setField(term1614355, term1614355.getClass(), "first", term1614425);
        setField(term1614285, term1614285.getClass(), "first", term1614355);
        setField(term1614215, term1614215.getClass(), "first", term1614285);
        setField(term1614145, term1614145.getClass(), "first", term1614215);
        setField(term1614075, term1614075.getClass(), "first", term1614145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1614075;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1614005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


