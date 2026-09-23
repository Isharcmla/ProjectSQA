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

public class TypeInference_traverseReturn_1142297770245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261929;
     Object term261999;

    public TypeInference_traverseReturn_1142297770245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261929 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term261999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term264939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term266059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term262069, term262069.getClass(), "type", 92);
        setIntField(term262139, term262139.getClass(), "type", 92);
        setIntField(term262209, term262209.getClass(), "type", 92);
        setIntField(term262279, term262279.getClass(), "type", 92);
        setIntField(term262349, term262349.getClass(), "type", 92);
        setIntField(term262419, term262419.getClass(), "type", 92);
        setIntField(term262489, term262489.getClass(), "type", 92);
        setIntField(term262559, term262559.getClass(), "type", 92);
        setIntField(term262629, term262629.getClass(), "type", 92);
        setIntField(term262699, term262699.getClass(), "type", 92);
        setIntField(term262769, term262769.getClass(), "type", 92);
        setIntField(term262839, term262839.getClass(), "type", 92);
        setIntField(term262909, term262909.getClass(), "type", 92);
        setIntField(term262979, term262979.getClass(), "type", 92);
        setIntField(term263049, term263049.getClass(), "type", 92);
        setIntField(term263119, term263119.getClass(), "type", 92);
        setIntField(term263189, term263189.getClass(), "type", 92);
        setIntField(term263259, term263259.getClass(), "type", 92);
        setIntField(term263329, term263329.getClass(), "type", 92);
        setIntField(term263399, term263399.getClass(), "type", 92);
        setIntField(term263469, term263469.getClass(), "type", 92);
        setIntField(term263539, term263539.getClass(), "type", 92);
        setIntField(term263609, term263609.getClass(), "type", 92);
        setIntField(term263679, term263679.getClass(), "type", 92);
        setIntField(term263749, term263749.getClass(), "type", 92);
        setIntField(term263819, term263819.getClass(), "type", 92);
        setIntField(term263889, term263889.getClass(), "type", 92);
        setIntField(term263959, term263959.getClass(), "type", 92);
        setIntField(term264029, term264029.getClass(), "type", 92);
        setIntField(term264099, term264099.getClass(), "type", 92);
        setIntField(term264169, term264169.getClass(), "type", 92);
        setIntField(term264239, term264239.getClass(), "type", 92);
        setIntField(term264309, term264309.getClass(), "type", 92);
        setIntField(term264379, term264379.getClass(), "type", 92);
        setIntField(term264449, term264449.getClass(), "type", 92);
        setIntField(term264519, term264519.getClass(), "type", 92);
        setIntField(term264589, term264589.getClass(), "type", 92);
        setIntField(term264659, term264659.getClass(), "type", 92);
        setIntField(term264729, term264729.getClass(), "type", 92);
        setIntField(term264799, term264799.getClass(), "type", 92);
        setIntField(term264869, term264869.getClass(), "type", 92);
        setIntField(term264939, term264939.getClass(), "type", 92);
        setIntField(term265009, term265009.getClass(), "type", 92);
        setIntField(term265079, term265079.getClass(), "type", 92);
        setIntField(term265149, term265149.getClass(), "type", 92);
        setIntField(term265219, term265219.getClass(), "type", 92);
        setIntField(term265289, term265289.getClass(), "type", 92);
        setIntField(term265359, term265359.getClass(), "type", 92);
        setIntField(term265429, term265429.getClass(), "type", 92);
        setIntField(term265499, term265499.getClass(), "type", 92);
        setIntField(term265569, term265569.getClass(), "type", 92);
        setIntField(term265639, term265639.getClass(), "type", 92);
        setIntField(term265709, term265709.getClass(), "type", 92);
        setIntField(term265779, term265779.getClass(), "type", 92);
        setIntField(term265849, term265849.getClass(), "type", 92);
        setIntField(term265919, term265919.getClass(), "type", 92);
        setIntField(term265989, term265989.getClass(), "type", 92);
        setIntField(term266059, term266059.getClass(), "type", 81);
        setField(term265989, term265989.getClass(), "first", term266059);
        setField(term265919, term265919.getClass(), "first", term265989);
        setField(term265849, term265849.getClass(), "first", term265919);
        setField(term265779, term265779.getClass(), "first", term265849);
        setField(term265709, term265709.getClass(), "first", term265779);
        setField(term265639, term265639.getClass(), "first", term265709);
        setField(term265569, term265569.getClass(), "first", term265639);
        setField(term265499, term265499.getClass(), "first", term265569);
        setField(term265429, term265429.getClass(), "first", term265499);
        setField(term265359, term265359.getClass(), "first", term265429);
        setField(term265289, term265289.getClass(), "first", term265359);
        setField(term265219, term265219.getClass(), "first", term265289);
        setField(term265149, term265149.getClass(), "first", term265219);
        setField(term265079, term265079.getClass(), "first", term265149);
        setField(term265009, term265009.getClass(), "first", term265079);
        setField(term264939, term264939.getClass(), "first", term265009);
        setField(term264869, term264869.getClass(), "first", term264939);
        setField(term264799, term264799.getClass(), "first", term264869);
        setField(term264729, term264729.getClass(), "first", term264799);
        setField(term264659, term264659.getClass(), "first", term264729);
        setField(term264589, term264589.getClass(), "first", term264659);
        setField(term264519, term264519.getClass(), "first", term264589);
        setField(term264449, term264449.getClass(), "first", term264519);
        setField(term264379, term264379.getClass(), "first", term264449);
        setField(term264309, term264309.getClass(), "first", term264379);
        setField(term264239, term264239.getClass(), "first", term264309);
        setField(term264169, term264169.getClass(), "first", term264239);
        setField(term264099, term264099.getClass(), "first", term264169);
        setField(term264029, term264029.getClass(), "first", term264099);
        setField(term263959, term263959.getClass(), "first", term264029);
        setField(term263889, term263889.getClass(), "first", term263959);
        setField(term263819, term263819.getClass(), "first", term263889);
        setField(term263749, term263749.getClass(), "first", term263819);
        setField(term263679, term263679.getClass(), "first", term263749);
        setField(term263609, term263609.getClass(), "first", term263679);
        setField(term263539, term263539.getClass(), "first", term263609);
        setField(term263469, term263469.getClass(), "first", term263539);
        setField(term263399, term263399.getClass(), "first", term263469);
        setField(term263329, term263329.getClass(), "first", term263399);
        setField(term263259, term263259.getClass(), "first", term263329);
        setField(term263189, term263189.getClass(), "first", term263259);
        setField(term263119, term263119.getClass(), "first", term263189);
        setField(term263049, term263049.getClass(), "first", term263119);
        setField(term262979, term262979.getClass(), "first", term263049);
        setField(term262909, term262909.getClass(), "first", term262979);
        setField(term262839, term262839.getClass(), "first", term262909);
        setField(term262769, term262769.getClass(), "first", term262839);
        setField(term262699, term262699.getClass(), "first", term262769);
        setField(term262629, term262629.getClass(), "first", term262699);
        setField(term262559, term262559.getClass(), "first", term262629);
        setField(term262489, term262489.getClass(), "first", term262559);
        setField(term262419, term262419.getClass(), "first", term262489);
        setField(term262349, term262349.getClass(), "first", term262419);
        setField(term262279, term262279.getClass(), "first", term262349);
        setField(term262209, term262209.getClass(), "first", term262279);
        setField(term262139, term262139.getClass(), "first", term262209);
        setField(term262069, term262069.getClass(), "first", term262139);
        setField(term261999, term261999.getClass(), "first", term262069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term261999;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term261929, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


