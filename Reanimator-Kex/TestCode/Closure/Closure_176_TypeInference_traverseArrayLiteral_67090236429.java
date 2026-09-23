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

public class TypeInference_traverseArrayLiteral_67090236429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1653449;
     Object term1653519;

    public TypeInference_traverseArrayLiteral_67090236429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1653449 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1653519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1653589, term1653589.getClass(), "type", 83);
        setIntField(term1653659, term1653659.getClass(), "type", 83);
        setIntField(term1653729, term1653729.getClass(), "type", 83);
        setIntField(term1653799, term1653799.getClass(), "type", 83);
        setIntField(term1653869, term1653869.getClass(), "type", 83);
        setIntField(term1653939, term1653939.getClass(), "type", 83);
        setIntField(term1654009, term1654009.getClass(), "type", 83);
        setIntField(term1654079, term1654079.getClass(), "type", 83);
        setIntField(term1654149, term1654149.getClass(), "type", 83);
        setIntField(term1654219, term1654219.getClass(), "type", 83);
        setIntField(term1654289, term1654289.getClass(), "type", 83);
        setIntField(term1654359, term1654359.getClass(), "type", 83);
        setIntField(term1654429, term1654429.getClass(), "type", 83);
        setIntField(term1654499, term1654499.getClass(), "type", 83);
        setIntField(term1654569, term1654569.getClass(), "type", 83);
        setIntField(term1654639, term1654639.getClass(), "type", 83);
        setIntField(term1654709, term1654709.getClass(), "type", 83);
        setIntField(term1654779, term1654779.getClass(), "type", 83);
        setIntField(term1654849, term1654849.getClass(), "type", 83);
        setIntField(term1654919, term1654919.getClass(), "type", 83);
        setIntField(term1654989, term1654989.getClass(), "type", 83);
        setIntField(term1655059, term1655059.getClass(), "type", 83);
        setIntField(term1655129, term1655129.getClass(), "type", 83);
        setIntField(term1655199, term1655199.getClass(), "type", 83);
        setIntField(term1655269, term1655269.getClass(), "type", 83);
        setIntField(term1655339, term1655339.getClass(), "type", 83);
        setIntField(term1655409, term1655409.getClass(), "type", 83);
        setIntField(term1655479, term1655479.getClass(), "type", 83);
        setIntField(term1655549, term1655549.getClass(), "type", 83);
        setIntField(term1655619, term1655619.getClass(), "type", 83);
        setIntField(term1655689, term1655689.getClass(), "type", 83);
        setIntField(term1655759, term1655759.getClass(), "type", 83);
        setIntField(term1655829, term1655829.getClass(), "type", 83);
        setIntField(term1655899, term1655899.getClass(), "type", 83);
        setIntField(term1655969, term1655969.getClass(), "type", 83);
        setIntField(term1656039, term1656039.getClass(), "type", 83);
        setIntField(term1656109, term1656109.getClass(), "type", 83);
        setIntField(term1656179, term1656179.getClass(), "type", 83);
        setIntField(term1656249, term1656249.getClass(), "type", 83);
        setIntField(term1656319, term1656319.getClass(), "type", 83);
        setIntField(term1656389, term1656389.getClass(), "type", 83);
        setIntField(term1656459, term1656459.getClass(), "type", 83);
        setIntField(term1656529, term1656529.getClass(), "type", 83);
        setIntField(term1656599, term1656599.getClass(), "type", 83);
        setIntField(term1656669, term1656669.getClass(), "type", 83);
        setIntField(term1656739, term1656739.getClass(), "type", 83);
        setIntField(term1656809, term1656809.getClass(), "type", 83);
        setIntField(term1656879, term1656879.getClass(), "type", 83);
        setIntField(term1656949, term1656949.getClass(), "type", 83);
        setIntField(term1657019, term1657019.getClass(), "type", 83);
        setIntField(term1657089, term1657089.getClass(), "type", 83);
        setIntField(term1657159, term1657159.getClass(), "type", 83);
        setIntField(term1657229, term1657229.getClass(), "type", 83);
        setIntField(term1657299, term1657299.getClass(), "type", 83);
        setIntField(term1657369, term1657369.getClass(), "type", 83);
        setIntField(term1657439, term1657439.getClass(), "type", 83);
        setIntField(term1657509, term1657509.getClass(), "type", 83);
        setIntField(term1657579, term1657579.getClass(), "type", 83);
        setIntField(term1657649, term1657649.getClass(), "type", 8);
        setField(term1657579, term1657579.getClass(), "first", term1657649);
        setField(term1657509, term1657509.getClass(), "first", term1657579);
        setField(term1657439, term1657439.getClass(), "first", term1657509);
        setField(term1657369, term1657369.getClass(), "first", term1657439);
        setField(term1657299, term1657299.getClass(), "first", term1657369);
        setField(term1657229, term1657229.getClass(), "first", term1657299);
        setField(term1657159, term1657159.getClass(), "first", term1657229);
        setField(term1657089, term1657089.getClass(), "first", term1657159);
        setField(term1657019, term1657019.getClass(), "first", term1657089);
        setField(term1656949, term1656949.getClass(), "first", term1657019);
        setField(term1656879, term1656879.getClass(), "first", term1656949);
        setField(term1656809, term1656809.getClass(), "first", term1656879);
        setField(term1656739, term1656739.getClass(), "first", term1656809);
        setField(term1656669, term1656669.getClass(), "first", term1656739);
        setField(term1656599, term1656599.getClass(), "first", term1656669);
        setField(term1656529, term1656529.getClass(), "first", term1656599);
        setField(term1656459, term1656459.getClass(), "first", term1656529);
        setField(term1656389, term1656389.getClass(), "first", term1656459);
        setField(term1656319, term1656319.getClass(), "first", term1656389);
        setField(term1656249, term1656249.getClass(), "first", term1656319);
        setField(term1656179, term1656179.getClass(), "first", term1656249);
        setField(term1656109, term1656109.getClass(), "first", term1656179);
        setField(term1656039, term1656039.getClass(), "first", term1656109);
        setField(term1655969, term1655969.getClass(), "first", term1656039);
        setField(term1655899, term1655899.getClass(), "first", term1655969);
        setField(term1655829, term1655829.getClass(), "first", term1655899);
        setField(term1655759, term1655759.getClass(), "first", term1655829);
        setField(term1655689, term1655689.getClass(), "first", term1655759);
        setField(term1655619, term1655619.getClass(), "first", term1655689);
        setField(term1655549, term1655549.getClass(), "first", term1655619);
        setField(term1655479, term1655479.getClass(), "first", term1655549);
        setField(term1655409, term1655409.getClass(), "first", term1655479);
        setField(term1655339, term1655339.getClass(), "first", term1655409);
        setField(term1655269, term1655269.getClass(), "first", term1655339);
        setField(term1655199, term1655199.getClass(), "first", term1655269);
        setField(term1655129, term1655129.getClass(), "first", term1655199);
        setField(term1655059, term1655059.getClass(), "first", term1655129);
        setField(term1654989, term1654989.getClass(), "first", term1655059);
        setField(term1654919, term1654919.getClass(), "first", term1654989);
        setField(term1654849, term1654849.getClass(), "first", term1654919);
        setField(term1654779, term1654779.getClass(), "first", term1654849);
        setField(term1654709, term1654709.getClass(), "first", term1654779);
        setField(term1654639, term1654639.getClass(), "first", term1654709);
        setField(term1654569, term1654569.getClass(), "first", term1654639);
        setField(term1654499, term1654499.getClass(), "first", term1654569);
        setField(term1654429, term1654429.getClass(), "first", term1654499);
        setField(term1654359, term1654359.getClass(), "first", term1654429);
        setField(term1654289, term1654289.getClass(), "first", term1654359);
        setField(term1654219, term1654219.getClass(), "first", term1654289);
        setField(term1654149, term1654149.getClass(), "first", term1654219);
        setField(term1654079, term1654079.getClass(), "first", term1654149);
        setField(term1654009, term1654009.getClass(), "first", term1654079);
        setField(term1653939, term1653939.getClass(), "first", term1654009);
        setField(term1653869, term1653869.getClass(), "first", term1653939);
        setField(term1653799, term1653799.getClass(), "first", term1653869);
        setField(term1653729, term1653729.getClass(), "first", term1653799);
        setField(term1653659, term1653659.getClass(), "first", term1653729);
        setField(term1653589, term1653589.getClass(), "first", term1653659);
        setField(term1653519, term1653519.getClass(), "first", term1653589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1653519;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1653449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


