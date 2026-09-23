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

public class TypeInference_traverseReturn_94528842301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732179;
     Object term732249;

    public TypeInference_traverseReturn_94528842301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732179 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term732249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term732319, term732319.getClass(), "type", 9);
        setIntField(term732389, term732389.getClass(), "type", 9);
        setIntField(term732459, term732459.getClass(), "type", 9);
        setIntField(term732529, term732529.getClass(), "type", 9);
        setIntField(term732599, term732599.getClass(), "type", 9);
        setIntField(term732669, term732669.getClass(), "type", 9);
        setIntField(term732739, term732739.getClass(), "type", 9);
        setIntField(term732809, term732809.getClass(), "type", 9);
        setIntField(term732879, term732879.getClass(), "type", 9);
        setIntField(term732949, term732949.getClass(), "type", 9);
        setIntField(term733019, term733019.getClass(), "type", 9);
        setIntField(term733089, term733089.getClass(), "type", 9);
        setIntField(term733159, term733159.getClass(), "type", 9);
        setIntField(term733229, term733229.getClass(), "type", 9);
        setIntField(term733299, term733299.getClass(), "type", 9);
        setIntField(term733369, term733369.getClass(), "type", 9);
        setIntField(term733439, term733439.getClass(), "type", 9);
        setIntField(term733509, term733509.getClass(), "type", 9);
        setIntField(term733579, term733579.getClass(), "type", 9);
        setIntField(term733649, term733649.getClass(), "type", 9);
        setIntField(term733719, term733719.getClass(), "type", 9);
        setIntField(term733789, term733789.getClass(), "type", 9);
        setIntField(term733859, term733859.getClass(), "type", 9);
        setIntField(term733929, term733929.getClass(), "type", 9);
        setIntField(term733999, term733999.getClass(), "type", 9);
        setIntField(term734069, term734069.getClass(), "type", 9);
        setIntField(term734139, term734139.getClass(), "type", 9);
        setIntField(term734209, term734209.getClass(), "type", 9);
        setIntField(term734279, term734279.getClass(), "type", 9);
        setIntField(term734349, term734349.getClass(), "type", 9);
        setIntField(term734419, term734419.getClass(), "type", 9);
        setIntField(term734489, term734489.getClass(), "type", 9);
        setIntField(term734559, term734559.getClass(), "type", 9);
        setIntField(term734629, term734629.getClass(), "type", 9);
        setIntField(term734699, term734699.getClass(), "type", 9);
        setIntField(term734769, term734769.getClass(), "type", 9);
        setIntField(term734839, term734839.getClass(), "type", 9);
        setIntField(term734909, term734909.getClass(), "type", 9);
        setIntField(term734979, term734979.getClass(), "type", 9);
        setIntField(term735049, term735049.getClass(), "type", 9);
        setIntField(term735119, term735119.getClass(), "type", 9);
        setIntField(term735189, term735189.getClass(), "type", 9);
        setIntField(term735259, term735259.getClass(), "type", 9);
        setIntField(term735329, term735329.getClass(), "type", 9);
        setIntField(term735399, term735399.getClass(), "type", 9);
        setIntField(term735469, term735469.getClass(), "type", 9);
        setIntField(term735539, term735539.getClass(), "type", 9);
        setIntField(term735609, term735609.getClass(), "type", 9);
        setIntField(term735679, term735679.getClass(), "type", 41);
        setField(term735609, term735609.getClass(), "first", term735679);
        setField(term735539, term735539.getClass(), "first", term735609);
        setField(term735469, term735469.getClass(), "first", term735539);
        setField(term735399, term735399.getClass(), "first", term735469);
        setField(term735329, term735329.getClass(), "first", term735399);
        setField(term735259, term735259.getClass(), "first", term735329);
        setField(term735189, term735189.getClass(), "first", term735259);
        setField(term735119, term735119.getClass(), "first", term735189);
        setField(term735049, term735049.getClass(), "first", term735119);
        setField(term734979, term734979.getClass(), "first", term735049);
        setField(term734909, term734909.getClass(), "first", term734979);
        setField(term734839, term734839.getClass(), "first", term734909);
        setField(term734769, term734769.getClass(), "first", term734839);
        setField(term734699, term734699.getClass(), "first", term734769);
        setField(term734629, term734629.getClass(), "first", term734699);
        setField(term734559, term734559.getClass(), "first", term734629);
        setField(term734489, term734489.getClass(), "first", term734559);
        setField(term734419, term734419.getClass(), "first", term734489);
        setField(term734349, term734349.getClass(), "first", term734419);
        setField(term734279, term734279.getClass(), "first", term734349);
        setField(term734209, term734209.getClass(), "first", term734279);
        setField(term734139, term734139.getClass(), "first", term734209);
        setField(term734069, term734069.getClass(), "first", term734139);
        setField(term733999, term733999.getClass(), "first", term734069);
        setField(term733929, term733929.getClass(), "first", term733999);
        setField(term733859, term733859.getClass(), "first", term733929);
        setField(term733789, term733789.getClass(), "first", term733859);
        setField(term733719, term733719.getClass(), "first", term733789);
        setField(term733649, term733649.getClass(), "first", term733719);
        setField(term733579, term733579.getClass(), "first", term733649);
        setField(term733509, term733509.getClass(), "first", term733579);
        setField(term733439, term733439.getClass(), "first", term733509);
        setField(term733369, term733369.getClass(), "first", term733439);
        setField(term733299, term733299.getClass(), "first", term733369);
        setField(term733229, term733229.getClass(), "first", term733299);
        setField(term733159, term733159.getClass(), "first", term733229);
        setField(term733089, term733089.getClass(), "first", term733159);
        setField(term733019, term733019.getClass(), "first", term733089);
        setField(term732949, term732949.getClass(), "first", term733019);
        setField(term732879, term732879.getClass(), "first", term732949);
        setField(term732809, term732809.getClass(), "first", term732879);
        setField(term732739, term732739.getClass(), "first", term732809);
        setField(term732669, term732669.getClass(), "first", term732739);
        setField(term732599, term732599.getClass(), "first", term732669);
        setField(term732529, term732529.getClass(), "first", term732599);
        setField(term732459, term732459.getClass(), "first", term732529);
        setField(term732389, term732389.getClass(), "first", term732459);
        setField(term732319, term732319.getClass(), "first", term732389);
        setField(term732249, term732249.getClass(), "first", term732319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term732249;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term732179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


