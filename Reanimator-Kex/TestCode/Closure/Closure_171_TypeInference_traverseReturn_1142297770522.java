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

public class TypeInference_traverseReturn_1142297770522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1610809;
     Object term1610879;

    public TypeInference_traverseReturn_1142297770522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1610809 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1610879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1610949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1611999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1610949, term1610949.getClass(), "type", 29);
        setIntField(term1611019, term1611019.getClass(), "type", 29);
        setIntField(term1611089, term1611089.getClass(), "type", 29);
        setIntField(term1611159, term1611159.getClass(), "type", 29);
        setIntField(term1611229, term1611229.getClass(), "type", 29);
        setIntField(term1611299, term1611299.getClass(), "type", 29);
        setIntField(term1611369, term1611369.getClass(), "type", 29);
        setIntField(term1611439, term1611439.getClass(), "type", 29);
        setIntField(term1611509, term1611509.getClass(), "type", 29);
        setIntField(term1611579, term1611579.getClass(), "type", 29);
        setIntField(term1611649, term1611649.getClass(), "type", 29);
        setIntField(term1611719, term1611719.getClass(), "type", 29);
        setIntField(term1611789, term1611789.getClass(), "type", 29);
        setIntField(term1611859, term1611859.getClass(), "type", 29);
        setIntField(term1611929, term1611929.getClass(), "type", 29);
        setIntField(term1611999, term1611999.getClass(), "type", 29);
        setIntField(term1612069, term1612069.getClass(), "type", 29);
        setIntField(term1612139, term1612139.getClass(), "type", 29);
        setIntField(term1612209, term1612209.getClass(), "type", 29);
        setIntField(term1612279, term1612279.getClass(), "type", 29);
        setIntField(term1612349, term1612349.getClass(), "type", 29);
        setIntField(term1612419, term1612419.getClass(), "type", 29);
        setIntField(term1612489, term1612489.getClass(), "type", 29);
        setIntField(term1612559, term1612559.getClass(), "type", 29);
        setIntField(term1612629, term1612629.getClass(), "type", 29);
        setIntField(term1612699, term1612699.getClass(), "type", 29);
        setIntField(term1612769, term1612769.getClass(), "type", 29);
        setIntField(term1612839, term1612839.getClass(), "type", 29);
        setIntField(term1612909, term1612909.getClass(), "type", 29);
        setIntField(term1612979, term1612979.getClass(), "type", 29);
        setIntField(term1613049, term1613049.getClass(), "type", 29);
        setIntField(term1613119, term1613119.getClass(), "type", 29);
        setIntField(term1613189, term1613189.getClass(), "type", 29);
        setIntField(term1613259, term1613259.getClass(), "type", 29);
        setIntField(term1613329, term1613329.getClass(), "type", 29);
        setIntField(term1613399, term1613399.getClass(), "type", 29);
        setIntField(term1613469, term1613469.getClass(), "type", 29);
        setIntField(term1613539, term1613539.getClass(), "type", 29);
        setIntField(term1613609, term1613609.getClass(), "type", 29);
        setIntField(term1613679, term1613679.getClass(), "type", 27);
        setField(term1613609, term1613609.getClass(), "first", term1613679);
        setField(term1613539, term1613539.getClass(), "first", term1613609);
        setField(term1613469, term1613469.getClass(), "first", term1613539);
        setField(term1613399, term1613399.getClass(), "first", term1613469);
        setField(term1613329, term1613329.getClass(), "first", term1613399);
        setField(term1613259, term1613259.getClass(), "first", term1613329);
        setField(term1613189, term1613189.getClass(), "first", term1613259);
        setField(term1613119, term1613119.getClass(), "first", term1613189);
        setField(term1613049, term1613049.getClass(), "first", term1613119);
        setField(term1612979, term1612979.getClass(), "first", term1613049);
        setField(term1612909, term1612909.getClass(), "first", term1612979);
        setField(term1612839, term1612839.getClass(), "first", term1612909);
        setField(term1612769, term1612769.getClass(), "first", term1612839);
        setField(term1612699, term1612699.getClass(), "first", term1612769);
        setField(term1612629, term1612629.getClass(), "first", term1612699);
        setField(term1612559, term1612559.getClass(), "first", term1612629);
        setField(term1612489, term1612489.getClass(), "first", term1612559);
        setField(term1612419, term1612419.getClass(), "first", term1612489);
        setField(term1612349, term1612349.getClass(), "first", term1612419);
        setField(term1612279, term1612279.getClass(), "first", term1612349);
        setField(term1612209, term1612209.getClass(), "first", term1612279);
        setField(term1612139, term1612139.getClass(), "first", term1612209);
        setField(term1612069, term1612069.getClass(), "first", term1612139);
        setField(term1611999, term1611999.getClass(), "first", term1612069);
        setField(term1611929, term1611929.getClass(), "first", term1611999);
        setField(term1611859, term1611859.getClass(), "first", term1611929);
        setField(term1611789, term1611789.getClass(), "first", term1611859);
        setField(term1611719, term1611719.getClass(), "first", term1611789);
        setField(term1611649, term1611649.getClass(), "first", term1611719);
        setField(term1611579, term1611579.getClass(), "first", term1611649);
        setField(term1611509, term1611509.getClass(), "first", term1611579);
        setField(term1611439, term1611439.getClass(), "first", term1611509);
        setField(term1611369, term1611369.getClass(), "first", term1611439);
        setField(term1611299, term1611299.getClass(), "first", term1611369);
        setField(term1611229, term1611229.getClass(), "first", term1611299);
        setField(term1611159, term1611159.getClass(), "first", term1611229);
        setField(term1611089, term1611089.getClass(), "first", term1611159);
        setField(term1611019, term1611019.getClass(), "first", term1611089);
        setField(term1610949, term1610949.getClass(), "first", term1611019);
        setField(term1610879, term1610879.getClass(), "first", term1610949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1610879;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1610809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


