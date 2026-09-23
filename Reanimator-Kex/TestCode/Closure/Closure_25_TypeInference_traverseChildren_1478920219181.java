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

public class TypeInference_traverseChildren_1478920219181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60199;
     Object term60269;

    public TypeInference_traverseChildren_1478920219181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60199 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term60269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60339, term60339.getClass(), "type", 18);
        setIntField(term60409, term60409.getClass(), "type", 18);
        setIntField(term60479, term60479.getClass(), "type", 18);
        setIntField(term60549, term60549.getClass(), "type", 18);
        setIntField(term60619, term60619.getClass(), "type", 18);
        setIntField(term60689, term60689.getClass(), "type", 18);
        setIntField(term60759, term60759.getClass(), "type", 18);
        setIntField(term60829, term60829.getClass(), "type", 18);
        setIntField(term60899, term60899.getClass(), "type", 18);
        setIntField(term60969, term60969.getClass(), "type", 18);
        setIntField(term61039, term61039.getClass(), "type", 18);
        setIntField(term61109, term61109.getClass(), "type", 18);
        setIntField(term61179, term61179.getClass(), "type", 18);
        setIntField(term61249, term61249.getClass(), "type", 18);
        setIntField(term61319, term61319.getClass(), "type", 18);
        setIntField(term61389, term61389.getClass(), "type", 18);
        setIntField(term61459, term61459.getClass(), "type", 18);
        setIntField(term61529, term61529.getClass(), "type", 18);
        setIntField(term61599, term61599.getClass(), "type", 18);
        setIntField(term61669, term61669.getClass(), "type", 18);
        setIntField(term61739, term61739.getClass(), "type", 18);
        setIntField(term61809, term61809.getClass(), "type", 18);
        setIntField(term61879, term61879.getClass(), "type", 18);
        setIntField(term61949, term61949.getClass(), "type", 18);
        setIntField(term62019, term62019.getClass(), "type", 18);
        setIntField(term62089, term62089.getClass(), "type", 18);
        setIntField(term62159, term62159.getClass(), "type", 18);
        setIntField(term62229, term62229.getClass(), "type", 18);
        setIntField(term62299, term62299.getClass(), "type", 18);
        setIntField(term62369, term62369.getClass(), "type", 18);
        setIntField(term62439, term62439.getClass(), "type", 18);
        setIntField(term62509, term62509.getClass(), "type", 18);
        setIntField(term62579, term62579.getClass(), "type", 18);
        setIntField(term62649, term62649.getClass(), "type", 18);
        setIntField(term62719, term62719.getClass(), "type", 18);
        setIntField(term62789, term62789.getClass(), "type", 18);
        setIntField(term62859, term62859.getClass(), "type", 18);
        setIntField(term62929, term62929.getClass(), "type", 18);
        setIntField(term62999, term62999.getClass(), "type", 18);
        setIntField(term63069, term63069.getClass(), "type", 18);
        setIntField(term63139, term63139.getClass(), "type", 18);
        setIntField(term63209, term63209.getClass(), "type", 18);
        setIntField(term63279, term63279.getClass(), "type", 18);
        setIntField(term63349, term63349.getClass(), "type", 18);
        setIntField(term63419, term63419.getClass(), "type", 18);
        setIntField(term63489, term63489.getClass(), "type", 18);
        setIntField(term63559, term63559.getClass(), "type", 18);
        setIntField(term63629, term63629.getClass(), "type", 18);
        setIntField(term63699, term63699.getClass(), "type", 18);
        setIntField(term63769, term63769.getClass(), "type", 118);
        setField(term63699, term63699.getClass(), "first", term63769);
        setField(term63629, term63629.getClass(), "first", term63699);
        setField(term63559, term63559.getClass(), "first", term63629);
        setField(term63489, term63489.getClass(), "first", term63559);
        setField(term63419, term63419.getClass(), "first", term63489);
        setField(term63349, term63349.getClass(), "first", term63419);
        setField(term63279, term63279.getClass(), "first", term63349);
        setField(term63209, term63209.getClass(), "first", term63279);
        setField(term63139, term63139.getClass(), "first", term63209);
        setField(term63069, term63069.getClass(), "first", term63139);
        setField(term62999, term62999.getClass(), "first", term63069);
        setField(term62929, term62929.getClass(), "first", term62999);
        setField(term62859, term62859.getClass(), "first", term62929);
        setField(term62789, term62789.getClass(), "first", term62859);
        setField(term62719, term62719.getClass(), "first", term62789);
        setField(term62649, term62649.getClass(), "first", term62719);
        setField(term62579, term62579.getClass(), "first", term62649);
        setField(term62509, term62509.getClass(), "first", term62579);
        setField(term62439, term62439.getClass(), "first", term62509);
        setField(term62369, term62369.getClass(), "first", term62439);
        setField(term62299, term62299.getClass(), "first", term62369);
        setField(term62229, term62229.getClass(), "first", term62299);
        setField(term62159, term62159.getClass(), "first", term62229);
        setField(term62089, term62089.getClass(), "first", term62159);
        setField(term62019, term62019.getClass(), "first", term62089);
        setField(term61949, term61949.getClass(), "first", term62019);
        setField(term61879, term61879.getClass(), "first", term61949);
        setField(term61809, term61809.getClass(), "first", term61879);
        setField(term61739, term61739.getClass(), "first", term61809);
        setField(term61669, term61669.getClass(), "first", term61739);
        setField(term61599, term61599.getClass(), "first", term61669);
        setField(term61529, term61529.getClass(), "first", term61599);
        setField(term61459, term61459.getClass(), "first", term61529);
        setField(term61389, term61389.getClass(), "first", term61459);
        setField(term61319, term61319.getClass(), "first", term61389);
        setField(term61249, term61249.getClass(), "first", term61319);
        setField(term61179, term61179.getClass(), "first", term61249);
        setField(term61109, term61109.getClass(), "first", term61179);
        setField(term61039, term61039.getClass(), "first", term61109);
        setField(term60969, term60969.getClass(), "first", term61039);
        setField(term60899, term60899.getClass(), "first", term60969);
        setField(term60829, term60829.getClass(), "first", term60899);
        setField(term60759, term60759.getClass(), "first", term60829);
        setField(term60689, term60689.getClass(), "first", term60759);
        setField(term60619, term60619.getClass(), "first", term60689);
        setField(term60549, term60549.getClass(), "first", term60619);
        setField(term60479, term60479.getClass(), "first", term60549);
        setField(term60409, term60409.getClass(), "first", term60479);
        setField(term60339, term60339.getClass(), "first", term60409);
        setField(term60269, term60269.getClass(), "first", term60339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term60269;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term60199, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


