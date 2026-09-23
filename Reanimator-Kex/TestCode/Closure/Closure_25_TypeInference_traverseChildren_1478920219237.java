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

public class TypeInference_traverseChildren_1478920219237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368625;
     Object term368695;

    public TypeInference_traverseChildren_1478920219237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368625 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term368695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term368765, term368765.getClass(), "type", 18);
        setIntField(term368835, term368835.getClass(), "type", 18);
        setIntField(term368905, term368905.getClass(), "type", 18);
        setIntField(term368975, term368975.getClass(), "type", 18);
        setIntField(term369045, term369045.getClass(), "type", 18);
        setIntField(term369115, term369115.getClass(), "type", 18);
        setIntField(term369185, term369185.getClass(), "type", 18);
        setIntField(term369255, term369255.getClass(), "type", 18);
        setIntField(term369325, term369325.getClass(), "type", 18);
        setIntField(term369395, term369395.getClass(), "type", 18);
        setIntField(term369465, term369465.getClass(), "type", 18);
        setIntField(term369535, term369535.getClass(), "type", 18);
        setIntField(term369605, term369605.getClass(), "type", 18);
        setIntField(term369675, term369675.getClass(), "type", 18);
        setIntField(term369745, term369745.getClass(), "type", 18);
        setIntField(term369815, term369815.getClass(), "type", 18);
        setIntField(term369885, term369885.getClass(), "type", 18);
        setIntField(term369955, term369955.getClass(), "type", 18);
        setIntField(term370025, term370025.getClass(), "type", 18);
        setIntField(term370095, term370095.getClass(), "type", 18);
        setIntField(term370165, term370165.getClass(), "type", 18);
        setIntField(term370235, term370235.getClass(), "type", 18);
        setIntField(term370305, term370305.getClass(), "type", 18);
        setIntField(term370375, term370375.getClass(), "type", 18);
        setIntField(term370445, term370445.getClass(), "type", 18);
        setIntField(term370515, term370515.getClass(), "type", 18);
        setIntField(term370585, term370585.getClass(), "type", 18);
        setIntField(term370655, term370655.getClass(), "type", 18);
        setIntField(term370725, term370725.getClass(), "type", 18);
        setIntField(term370795, term370795.getClass(), "type", 18);
        setIntField(term370865, term370865.getClass(), "type", 18);
        setIntField(term370935, term370935.getClass(), "type", 18);
        setIntField(term371005, term371005.getClass(), "type", 18);
        setIntField(term371075, term371075.getClass(), "type", 18);
        setIntField(term371145, term371145.getClass(), "type", 18);
        setIntField(term371215, term371215.getClass(), "type", 18);
        setIntField(term371285, term371285.getClass(), "type", 18);
        setIntField(term371355, term371355.getClass(), "type", 18);
        setIntField(term371425, term371425.getClass(), "type", 18);
        setIntField(term371495, term371495.getClass(), "type", 18);
        setIntField(term371565, term371565.getClass(), "type", 18);
        setIntField(term371635, term371635.getClass(), "type", 18);
        setIntField(term371705, term371705.getClass(), "type", 18);
        setIntField(term371775, term371775.getClass(), "type", 18);
        setIntField(term371845, term371845.getClass(), "type", 18);
        setIntField(term371915, term371915.getClass(), "type", 18);
        setIntField(term371985, term371985.getClass(), "type", 18);
        setIntField(term372055, term372055.getClass(), "type", 18);
        setIntField(term372125, term372125.getClass(), "type", 18);
        setIntField(term372195, term372195.getClass(), "type", 18);
        setIntField(term372265, term372265.getClass(), "type", 18);
        setIntField(term372335, term372335.getClass(), "type", 18);
        setIntField(term372405, term372405.getClass(), "type", 18);
        setIntField(term372475, term372475.getClass(), "type", 126);
        setField(term372405, term372405.getClass(), "first", term372475);
        setField(term372335, term372335.getClass(), "first", term372405);
        setField(term372265, term372265.getClass(), "first", term372335);
        setField(term372195, term372195.getClass(), "first", term372265);
        setField(term372125, term372125.getClass(), "first", term372195);
        setField(term372055, term372055.getClass(), "first", term372125);
        setField(term371985, term371985.getClass(), "first", term372055);
        setField(term371915, term371915.getClass(), "first", term371985);
        setField(term371845, term371845.getClass(), "first", term371915);
        setField(term371775, term371775.getClass(), "first", term371845);
        setField(term371705, term371705.getClass(), "first", term371775);
        setField(term371635, term371635.getClass(), "first", term371705);
        setField(term371565, term371565.getClass(), "first", term371635);
        setField(term371495, term371495.getClass(), "first", term371565);
        setField(term371425, term371425.getClass(), "first", term371495);
        setField(term371355, term371355.getClass(), "first", term371425);
        setField(term371285, term371285.getClass(), "first", term371355);
        setField(term371215, term371215.getClass(), "first", term371285);
        setField(term371145, term371145.getClass(), "first", term371215);
        setField(term371075, term371075.getClass(), "first", term371145);
        setField(term371005, term371005.getClass(), "first", term371075);
        setField(term370935, term370935.getClass(), "first", term371005);
        setField(term370865, term370865.getClass(), "first", term370935);
        setField(term370795, term370795.getClass(), "first", term370865);
        setField(term370725, term370725.getClass(), "first", term370795);
        setField(term370655, term370655.getClass(), "first", term370725);
        setField(term370585, term370585.getClass(), "first", term370655);
        setField(term370515, term370515.getClass(), "first", term370585);
        setField(term370445, term370445.getClass(), "first", term370515);
        setField(term370375, term370375.getClass(), "first", term370445);
        setField(term370305, term370305.getClass(), "first", term370375);
        setField(term370235, term370235.getClass(), "first", term370305);
        setField(term370165, term370165.getClass(), "first", term370235);
        setField(term370095, term370095.getClass(), "first", term370165);
        setField(term370025, term370025.getClass(), "first", term370095);
        setField(term369955, term369955.getClass(), "first", term370025);
        setField(term369885, term369885.getClass(), "first", term369955);
        setField(term369815, term369815.getClass(), "first", term369885);
        setField(term369745, term369745.getClass(), "first", term369815);
        setField(term369675, term369675.getClass(), "first", term369745);
        setField(term369605, term369605.getClass(), "first", term369675);
        setField(term369535, term369535.getClass(), "first", term369605);
        setField(term369465, term369465.getClass(), "first", term369535);
        setField(term369395, term369395.getClass(), "first", term369465);
        setField(term369325, term369325.getClass(), "first", term369395);
        setField(term369255, term369255.getClass(), "first", term369325);
        setField(term369185, term369185.getClass(), "first", term369255);
        setField(term369115, term369115.getClass(), "first", term369185);
        setField(term369045, term369045.getClass(), "first", term369115);
        setField(term368975, term368975.getClass(), "first", term369045);
        setField(term368905, term368905.getClass(), "first", term368975);
        setField(term368835, term368835.getClass(), "first", term368905);
        setField(term368765, term368765.getClass(), "first", term368835);
        setField(term368695, term368695.getClass(), "first", term368765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term368695;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term368625, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


