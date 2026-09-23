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

public class TypeInference_traverseReturn_94528842201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142969;
     Object term143039;

    public TypeInference_traverseReturn_94528842201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term143039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143109, term143109.getClass(), "type", 9);
        setIntField(term143179, term143179.getClass(), "type", 9);
        setIntField(term143249, term143249.getClass(), "type", 9);
        setIntField(term143319, term143319.getClass(), "type", 9);
        setIntField(term143389, term143389.getClass(), "type", 9);
        setIntField(term143459, term143459.getClass(), "type", 9);
        setIntField(term143529, term143529.getClass(), "type", 9);
        setIntField(term143599, term143599.getClass(), "type", 9);
        setIntField(term143669, term143669.getClass(), "type", 9);
        setIntField(term143739, term143739.getClass(), "type", 9);
        setIntField(term143809, term143809.getClass(), "type", 9);
        setIntField(term143879, term143879.getClass(), "type", 9);
        setIntField(term143949, term143949.getClass(), "type", 9);
        setIntField(term144019, term144019.getClass(), "type", 9);
        setIntField(term144089, term144089.getClass(), "type", 9);
        setIntField(term144159, term144159.getClass(), "type", 9);
        setIntField(term144229, term144229.getClass(), "type", 9);
        setIntField(term144299, term144299.getClass(), "type", 9);
        setIntField(term144369, term144369.getClass(), "type", 9);
        setIntField(term144439, term144439.getClass(), "type", 9);
        setIntField(term144509, term144509.getClass(), "type", 9);
        setIntField(term144579, term144579.getClass(), "type", 9);
        setIntField(term144649, term144649.getClass(), "type", 9);
        setIntField(term144719, term144719.getClass(), "type", 9);
        setIntField(term144789, term144789.getClass(), "type", 9);
        setIntField(term144859, term144859.getClass(), "type", 9);
        setIntField(term144929, term144929.getClass(), "type", 9);
        setIntField(term144999, term144999.getClass(), "type", 9);
        setIntField(term145069, term145069.getClass(), "type", 9);
        setIntField(term145139, term145139.getClass(), "type", 9);
        setIntField(term145209, term145209.getClass(), "type", 9);
        setIntField(term145279, term145279.getClass(), "type", 9);
        setIntField(term145349, term145349.getClass(), "type", 9);
        setIntField(term145419, term145419.getClass(), "type", 9);
        setIntField(term145489, term145489.getClass(), "type", 9);
        setIntField(term145559, term145559.getClass(), "type", 9);
        setIntField(term145629, term145629.getClass(), "type", 9);
        setIntField(term145699, term145699.getClass(), "type", 9);
        setIntField(term145769, term145769.getClass(), "type", 9);
        setIntField(term145839, term145839.getClass(), "type", 9);
        setIntField(term145909, term145909.getClass(), "type", 9);
        setIntField(term145979, term145979.getClass(), "type", 9);
        setIntField(term146049, term146049.getClass(), "type", 9);
        setIntField(term146119, term146119.getClass(), "type", 9);
        setIntField(term146189, term146189.getClass(), "type", 9);
        setIntField(term146259, term146259.getClass(), "type", 9);
        setIntField(term146329, term146329.getClass(), "type", 9);
        setIntField(term146399, term146399.getClass(), "type", 9);
        setIntField(term146469, term146469.getClass(), "type", 9);
        setIntField(term146539, term146539.getClass(), "type", 9);
        setIntField(term146609, term146609.getClass(), "type", 9);
        setIntField(term146679, term146679.getClass(), "type", 9);
        setIntField(term146749, term146749.getClass(), "type", 9);
        setIntField(term146819, term146819.getClass(), "type", 9);
        setIntField(term146889, term146889.getClass(), "type", 9);
        setIntField(term146959, term146959.getClass(), "type", 51);
        setField(term146889, term146889.getClass(), "first", term146959);
        setField(term146819, term146819.getClass(), "first", term146889);
        setField(term146749, term146749.getClass(), "first", term146819);
        setField(term146679, term146679.getClass(), "first", term146749);
        setField(term146609, term146609.getClass(), "first", term146679);
        setField(term146539, term146539.getClass(), "first", term146609);
        setField(term146469, term146469.getClass(), "first", term146539);
        setField(term146399, term146399.getClass(), "first", term146469);
        setField(term146329, term146329.getClass(), "first", term146399);
        setField(term146259, term146259.getClass(), "first", term146329);
        setField(term146189, term146189.getClass(), "first", term146259);
        setField(term146119, term146119.getClass(), "first", term146189);
        setField(term146049, term146049.getClass(), "first", term146119);
        setField(term145979, term145979.getClass(), "first", term146049);
        setField(term145909, term145909.getClass(), "first", term145979);
        setField(term145839, term145839.getClass(), "first", term145909);
        setField(term145769, term145769.getClass(), "first", term145839);
        setField(term145699, term145699.getClass(), "first", term145769);
        setField(term145629, term145629.getClass(), "first", term145699);
        setField(term145559, term145559.getClass(), "first", term145629);
        setField(term145489, term145489.getClass(), "first", term145559);
        setField(term145419, term145419.getClass(), "first", term145489);
        setField(term145349, term145349.getClass(), "first", term145419);
        setField(term145279, term145279.getClass(), "first", term145349);
        setField(term145209, term145209.getClass(), "first", term145279);
        setField(term145139, term145139.getClass(), "first", term145209);
        setField(term145069, term145069.getClass(), "first", term145139);
        setField(term144999, term144999.getClass(), "first", term145069);
        setField(term144929, term144929.getClass(), "first", term144999);
        setField(term144859, term144859.getClass(), "first", term144929);
        setField(term144789, term144789.getClass(), "first", term144859);
        setField(term144719, term144719.getClass(), "first", term144789);
        setField(term144649, term144649.getClass(), "first", term144719);
        setField(term144579, term144579.getClass(), "first", term144649);
        setField(term144509, term144509.getClass(), "first", term144579);
        setField(term144439, term144439.getClass(), "first", term144509);
        setField(term144369, term144369.getClass(), "first", term144439);
        setField(term144299, term144299.getClass(), "first", term144369);
        setField(term144229, term144229.getClass(), "first", term144299);
        setField(term144159, term144159.getClass(), "first", term144229);
        setField(term144089, term144089.getClass(), "first", term144159);
        setField(term144019, term144019.getClass(), "first", term144089);
        setField(term143949, term143949.getClass(), "first", term144019);
        setField(term143879, term143879.getClass(), "first", term143949);
        setField(term143809, term143809.getClass(), "first", term143879);
        setField(term143739, term143739.getClass(), "first", term143809);
        setField(term143669, term143669.getClass(), "first", term143739);
        setField(term143599, term143599.getClass(), "first", term143669);
        setField(term143529, term143529.getClass(), "first", term143599);
        setField(term143459, term143459.getClass(), "first", term143529);
        setField(term143389, term143389.getClass(), "first", term143459);
        setField(term143319, term143319.getClass(), "first", term143389);
        setField(term143249, term143249.getClass(), "first", term143319);
        setField(term143179, term143179.getClass(), "first", term143249);
        setField(term143109, term143109.getClass(), "first", term143179);
        setField(term143039, term143039.getClass(), "first", term143109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term143039;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term142969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


