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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3153379;
     Object term3153449;

    public TypeInference_traverseGetElem_100203513557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3153379 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term3153449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3155619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3153519, term3153519.getClass(), "type", 98);
        setField(term3153589, term3153589.getClass(), "next", null);
        setIntField(term3153589, term3153589.getClass(), "type", 98);
        setField(term3153659, term3153659.getClass(), "next", null);
        setIntField(term3153659, term3153659.getClass(), "type", 98);
        setField(term3153729, term3153729.getClass(), "next", null);
        setIntField(term3153729, term3153729.getClass(), "type", 98);
        setField(term3153799, term3153799.getClass(), "next", null);
        setIntField(term3153799, term3153799.getClass(), "type", 98);
        setField(term3153869, term3153869.getClass(), "next", null);
        setIntField(term3153869, term3153869.getClass(), "type", 98);
        setField(term3153939, term3153939.getClass(), "next", null);
        setIntField(term3153939, term3153939.getClass(), "type", 98);
        setField(term3154009, term3154009.getClass(), "next", null);
        setIntField(term3154009, term3154009.getClass(), "type", 98);
        setField(term3154079, term3154079.getClass(), "next", null);
        setIntField(term3154079, term3154079.getClass(), "type", 98);
        setField(term3154149, term3154149.getClass(), "next", null);
        setIntField(term3154149, term3154149.getClass(), "type", 98);
        setField(term3154219, term3154219.getClass(), "next", null);
        setIntField(term3154219, term3154219.getClass(), "type", 98);
        setField(term3154289, term3154289.getClass(), "next", null);
        setIntField(term3154289, term3154289.getClass(), "type", 98);
        setField(term3154359, term3154359.getClass(), "next", null);
        setIntField(term3154359, term3154359.getClass(), "type", 98);
        setField(term3154429, term3154429.getClass(), "next", null);
        setIntField(term3154429, term3154429.getClass(), "type", 98);
        setField(term3154499, term3154499.getClass(), "next", null);
        setIntField(term3154499, term3154499.getClass(), "type", 98);
        setField(term3154569, term3154569.getClass(), "next", null);
        setIntField(term3154569, term3154569.getClass(), "type", 98);
        setField(term3154639, term3154639.getClass(), "next", null);
        setIntField(term3154639, term3154639.getClass(), "type", 98);
        setField(term3154709, term3154709.getClass(), "next", null);
        setIntField(term3154709, term3154709.getClass(), "type", 98);
        setField(term3154779, term3154779.getClass(), "next", null);
        setIntField(term3154779, term3154779.getClass(), "type", 98);
        setField(term3154849, term3154849.getClass(), "next", null);
        setIntField(term3154849, term3154849.getClass(), "type", 98);
        setField(term3154919, term3154919.getClass(), "next", null);
        setIntField(term3154919, term3154919.getClass(), "type", 98);
        setField(term3154989, term3154989.getClass(), "next", null);
        setIntField(term3154989, term3154989.getClass(), "type", 98);
        setField(term3155059, term3155059.getClass(), "next", null);
        setIntField(term3155059, term3155059.getClass(), "type", 98);
        setField(term3155129, term3155129.getClass(), "next", null);
        setIntField(term3155129, term3155129.getClass(), "type", 98);
        setField(term3155199, term3155199.getClass(), "next", null);
        setIntField(term3155199, term3155199.getClass(), "type", 98);
        setField(term3155269, term3155269.getClass(), "next", null);
        setIntField(term3155269, term3155269.getClass(), "type", 98);
        setField(term3155339, term3155339.getClass(), "next", null);
        setIntField(term3155339, term3155339.getClass(), "type", 98);
        setField(term3155409, term3155409.getClass(), "next", null);
        setIntField(term3155409, term3155409.getClass(), "type", 98);
        setField(term3155479, term3155479.getClass(), "next", null);
        setIntField(term3155479, term3155479.getClass(), "type", 98);
        setField(term3155549, term3155549.getClass(), "next", null);
        setIntField(term3155549, term3155549.getClass(), "type", 17);
        setField(term3155479, term3155479.getClass(), "first", term3155549);
        setField(term3155479, term3155479.getClass(), "last", null);
        setField(term3155409, term3155409.getClass(), "first", term3155479);
        setField(term3155409, term3155409.getClass(), "last", null);
        setField(term3155339, term3155339.getClass(), "first", term3155409);
        setField(term3155339, term3155339.getClass(), "last", null);
        setField(term3155269, term3155269.getClass(), "first", term3155339);
        setField(term3155269, term3155269.getClass(), "last", null);
        setField(term3155199, term3155199.getClass(), "first", term3155269);
        setField(term3155199, term3155199.getClass(), "last", null);
        setField(term3155129, term3155129.getClass(), "first", term3155199);
        setField(term3155129, term3155129.getClass(), "last", null);
        setField(term3155059, term3155059.getClass(), "first", term3155129);
        setField(term3155059, term3155059.getClass(), "last", term3155619);
        setField(term3154989, term3154989.getClass(), "first", term3155059);
        setField(term3154989, term3154989.getClass(), "last", null);
        setField(term3154919, term3154919.getClass(), "first", term3154989);
        setField(term3154919, term3154919.getClass(), "last", null);
        setField(term3154849, term3154849.getClass(), "first", term3154919);
        setField(term3154849, term3154849.getClass(), "last", null);
        setField(term3154779, term3154779.getClass(), "first", term3154849);
        setField(term3154779, term3154779.getClass(), "last", null);
        setField(term3154709, term3154709.getClass(), "first", term3154779);
        setField(term3154709, term3154709.getClass(), "last", null);
        setField(term3154639, term3154639.getClass(), "first", term3154709);
        setField(term3154639, term3154639.getClass(), "last", null);
        setField(term3154569, term3154569.getClass(), "first", term3154639);
        setField(term3154569, term3154569.getClass(), "last", null);
        setField(term3154499, term3154499.getClass(), "first", term3154569);
        setField(term3154499, term3154499.getClass(), "last", null);
        setField(term3154429, term3154429.getClass(), "first", term3154499);
        setField(term3154429, term3154429.getClass(), "last", null);
        setField(term3154359, term3154359.getClass(), "first", term3154429);
        setField(term3154359, term3154359.getClass(), "last", null);
        setField(term3154289, term3154289.getClass(), "first", term3154359);
        setField(term3154289, term3154289.getClass(), "last", null);
        setField(term3154219, term3154219.getClass(), "first", term3154289);
        setField(term3154219, term3154219.getClass(), "last", null);
        setField(term3154149, term3154149.getClass(), "first", term3154219);
        setField(term3154149, term3154149.getClass(), "last", null);
        setField(term3154079, term3154079.getClass(), "first", term3154149);
        setField(term3154079, term3154079.getClass(), "last", null);
        setField(term3154009, term3154009.getClass(), "first", term3154079);
        setField(term3154009, term3154009.getClass(), "last", null);
        setField(term3153939, term3153939.getClass(), "first", term3154009);
        setField(term3153939, term3153939.getClass(), "last", null);
        setField(term3153869, term3153869.getClass(), "first", term3153939);
        setField(term3153869, term3153869.getClass(), "last", null);
        setField(term3153799, term3153799.getClass(), "first", term3153869);
        setField(term3153799, term3153799.getClass(), "last", null);
        setField(term3153729, term3153729.getClass(), "first", term3153799);
        setField(term3153729, term3153729.getClass(), "last", null);
        setField(term3153659, term3153659.getClass(), "first", term3153729);
        setField(term3153659, term3153659.getClass(), "last", null);
        setField(term3153589, term3153589.getClass(), "first", term3153659);
        setField(term3153589, term3153589.getClass(), "last", null);
        setField(term3153519, term3153519.getClass(), "first", term3153589);
        setField(term3153519, term3153519.getClass(), "last", null);
        setField(term3153449, term3153449.getClass(), "first", term3153519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3153449;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term3153379, args);
    }

};


