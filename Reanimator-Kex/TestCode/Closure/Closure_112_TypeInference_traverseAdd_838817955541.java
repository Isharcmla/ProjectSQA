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

public class TypeInference_traverseAdd_838817955541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2383075;
     Object term2383145;

    public TypeInference_traverseAdd_838817955541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2383075 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2383145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2383215, term2383215.getClass(), "next", null);
        setIntField(term2383215, term2383215.getClass(), "type", 14);
        setIntField(term2383285, term2383285.getClass(), "type", 14);
        setIntField(term2383355, term2383355.getClass(), "type", 14);
        setIntField(term2383425, term2383425.getClass(), "type", 14);
        setIntField(term2383495, term2383495.getClass(), "type", 14);
        setIntField(term2383565, term2383565.getClass(), "type", 14);
        setIntField(term2383635, term2383635.getClass(), "type", 14);
        setIntField(term2383705, term2383705.getClass(), "type", 14);
        setIntField(term2383775, term2383775.getClass(), "type", 14);
        setIntField(term2383845, term2383845.getClass(), "type", 14);
        setIntField(term2383915, term2383915.getClass(), "type", 14);
        setIntField(term2383985, term2383985.getClass(), "type", 14);
        setIntField(term2384055, term2384055.getClass(), "type", 14);
        setIntField(term2384125, term2384125.getClass(), "type", 14);
        setIntField(term2384195, term2384195.getClass(), "type", 14);
        setIntField(term2384265, term2384265.getClass(), "type", 14);
        setIntField(term2384335, term2384335.getClass(), "type", 14);
        setIntField(term2384405, term2384405.getClass(), "type", 14);
        setIntField(term2384475, term2384475.getClass(), "type", 14);
        setIntField(term2384545, term2384545.getClass(), "type", 14);
        setIntField(term2384615, term2384615.getClass(), "type", 14);
        setIntField(term2384685, term2384685.getClass(), "type", 14);
        setIntField(term2384755, term2384755.getClass(), "type", 14);
        setIntField(term2384825, term2384825.getClass(), "type", 14);
        setIntField(term2384895, term2384895.getClass(), "type", 14);
        setIntField(term2384965, term2384965.getClass(), "type", 14);
        setIntField(term2385035, term2385035.getClass(), "type", 14);
        setIntField(term2385105, term2385105.getClass(), "type", 14);
        setIntField(term2385175, term2385175.getClass(), "type", 14);
        setIntField(term2385245, term2385245.getClass(), "type", 14);
        setIntField(term2385315, term2385315.getClass(), "type", 14);
        setIntField(term2385385, term2385385.getClass(), "type", 14);
        setIntField(term2385455, term2385455.getClass(), "type", 14);
        setIntField(term2385525, term2385525.getClass(), "type", 14);
        setIntField(term2385595, term2385595.getClass(), "type", 14);
        setIntField(term2385665, term2385665.getClass(), "type", 14);
        setIntField(term2385735, term2385735.getClass(), "type", 14);
        setIntField(term2385805, term2385805.getClass(), "type", 14);
        setIntField(term2385875, term2385875.getClass(), "type", 14);
        setIntField(term2385945, term2385945.getClass(), "type", 14);
        setIntField(term2386015, term2386015.getClass(), "type", 14);
        setIntField(term2386085, term2386085.getClass(), "type", 14);
        setIntField(term2386155, term2386155.getClass(), "type", 14);
        setIntField(term2386225, term2386225.getClass(), "type", 14);
        setIntField(term2386295, term2386295.getClass(), "type", 14);
        setIntField(term2386365, term2386365.getClass(), "type", 14);
        setIntField(term2386435, term2386435.getClass(), "type", 14);
        setIntField(term2386505, term2386505.getClass(), "type", 14);
        setIntField(term2386575, term2386575.getClass(), "type", 14);
        setIntField(term2386645, term2386645.getClass(), "type", 14);
        setIntField(term2386715, term2386715.getClass(), "type", 61);
        setField(term2386645, term2386645.getClass(), "first", term2386715);
        setField(term2386575, term2386575.getClass(), "first", term2386645);
        setField(term2386505, term2386505.getClass(), "first", term2386575);
        setField(term2386435, term2386435.getClass(), "first", term2386505);
        setField(term2386365, term2386365.getClass(), "first", term2386435);
        setField(term2386295, term2386295.getClass(), "first", term2386365);
        setField(term2386225, term2386225.getClass(), "first", term2386295);
        setField(term2386155, term2386155.getClass(), "first", term2386225);
        setField(term2386085, term2386085.getClass(), "first", term2386155);
        setField(term2386015, term2386015.getClass(), "first", term2386085);
        setField(term2385945, term2385945.getClass(), "first", term2386015);
        setField(term2385875, term2385875.getClass(), "first", term2385945);
        setField(term2385805, term2385805.getClass(), "first", term2385875);
        setField(term2385735, term2385735.getClass(), "first", term2385805);
        setField(term2385665, term2385665.getClass(), "first", term2385735);
        setField(term2385595, term2385595.getClass(), "first", term2385665);
        setField(term2385525, term2385525.getClass(), "first", term2385595);
        setField(term2385455, term2385455.getClass(), "first", term2385525);
        setField(term2385385, term2385385.getClass(), "first", term2385455);
        setField(term2385315, term2385315.getClass(), "first", term2385385);
        setField(term2385245, term2385245.getClass(), "first", term2385315);
        setField(term2385175, term2385175.getClass(), "first", term2385245);
        setField(term2385105, term2385105.getClass(), "first", term2385175);
        setField(term2385035, term2385035.getClass(), "first", term2385105);
        setField(term2384965, term2384965.getClass(), "first", term2385035);
        setField(term2384895, term2384895.getClass(), "first", term2384965);
        setField(term2384825, term2384825.getClass(), "first", term2384895);
        setField(term2384755, term2384755.getClass(), "first", term2384825);
        setField(term2384685, term2384685.getClass(), "first", term2384755);
        setField(term2384615, term2384615.getClass(), "first", term2384685);
        setField(term2384545, term2384545.getClass(), "first", term2384615);
        setField(term2384475, term2384475.getClass(), "first", term2384545);
        setField(term2384405, term2384405.getClass(), "first", term2384475);
        setField(term2384335, term2384335.getClass(), "first", term2384405);
        setField(term2384265, term2384265.getClass(), "first", term2384335);
        setField(term2384195, term2384195.getClass(), "first", term2384265);
        setField(term2384125, term2384125.getClass(), "first", term2384195);
        setField(term2384055, term2384055.getClass(), "first", term2384125);
        setField(term2383985, term2383985.getClass(), "first", term2384055);
        setField(term2383915, term2383915.getClass(), "first", term2383985);
        setField(term2383845, term2383845.getClass(), "first", term2383915);
        setField(term2383775, term2383775.getClass(), "first", term2383845);
        setField(term2383705, term2383705.getClass(), "first", term2383775);
        setField(term2383635, term2383635.getClass(), "first", term2383705);
        setField(term2383565, term2383565.getClass(), "first", term2383635);
        setField(term2383495, term2383495.getClass(), "first", term2383565);
        setField(term2383425, term2383425.getClass(), "first", term2383495);
        setField(term2383355, term2383355.getClass(), "first", term2383425);
        setField(term2383285, term2383285.getClass(), "first", term2383355);
        setField(term2383215, term2383215.getClass(), "first", term2383285);
        setField(term2383145, term2383145.getClass(), "first", term2383215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2383145;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2383075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


