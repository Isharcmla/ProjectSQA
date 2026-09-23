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

public class TypeInference_traverseAdd_838817955429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357718;
     Object term1357788;

    public TypeInference_traverseAdd_838817955429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1357718 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1357788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1357858, term1357858.getClass(), "next", null);
        setIntField(term1357858, term1357858.getClass(), "type", 14);
        setIntField(term1357928, term1357928.getClass(), "type", 14);
        setIntField(term1357998, term1357998.getClass(), "type", 14);
        setIntField(term1358068, term1358068.getClass(), "type", 14);
        setIntField(term1358138, term1358138.getClass(), "type", 14);
        setIntField(term1358208, term1358208.getClass(), "type", 14);
        setIntField(term1358278, term1358278.getClass(), "type", 14);
        setIntField(term1358348, term1358348.getClass(), "type", 14);
        setIntField(term1358418, term1358418.getClass(), "type", 14);
        setIntField(term1358488, term1358488.getClass(), "type", 14);
        setIntField(term1358558, term1358558.getClass(), "type", 14);
        setIntField(term1358628, term1358628.getClass(), "type", 14);
        setIntField(term1358698, term1358698.getClass(), "type", 14);
        setIntField(term1358768, term1358768.getClass(), "type", 14);
        setIntField(term1358838, term1358838.getClass(), "type", 14);
        setIntField(term1358908, term1358908.getClass(), "type", 14);
        setIntField(term1358978, term1358978.getClass(), "type", 14);
        setIntField(term1359048, term1359048.getClass(), "type", 14);
        setIntField(term1359118, term1359118.getClass(), "type", 14);
        setIntField(term1359188, term1359188.getClass(), "type", 14);
        setIntField(term1359258, term1359258.getClass(), "type", 14);
        setIntField(term1359328, term1359328.getClass(), "type", 14);
        setIntField(term1359398, term1359398.getClass(), "type", 14);
        setIntField(term1359468, term1359468.getClass(), "type", 14);
        setIntField(term1359538, term1359538.getClass(), "type", 14);
        setIntField(term1359608, term1359608.getClass(), "type", 14);
        setIntField(term1359678, term1359678.getClass(), "type", 14);
        setIntField(term1359748, term1359748.getClass(), "type", 14);
        setIntField(term1359818, term1359818.getClass(), "type", 14);
        setIntField(term1359888, term1359888.getClass(), "type", 14);
        setIntField(term1359958, term1359958.getClass(), "type", 14);
        setIntField(term1360028, term1360028.getClass(), "type", 14);
        setIntField(term1360098, term1360098.getClass(), "type", 14);
        setIntField(term1360168, term1360168.getClass(), "type", 14);
        setIntField(term1360238, term1360238.getClass(), "type", 14);
        setIntField(term1360308, term1360308.getClass(), "type", 108);
        setField(term1360238, term1360238.getClass(), "first", term1360308);
        setField(term1360168, term1360168.getClass(), "first", term1360238);
        setField(term1360098, term1360098.getClass(), "first", term1360168);
        setField(term1360028, term1360028.getClass(), "first", term1360098);
        setField(term1359958, term1359958.getClass(), "first", term1360028);
        setField(term1359888, term1359888.getClass(), "first", term1359958);
        setField(term1359818, term1359818.getClass(), "first", term1359888);
        setField(term1359748, term1359748.getClass(), "first", term1359818);
        setField(term1359678, term1359678.getClass(), "first", term1359748);
        setField(term1359608, term1359608.getClass(), "first", term1359678);
        setField(term1359538, term1359538.getClass(), "first", term1359608);
        setField(term1359468, term1359468.getClass(), "first", term1359538);
        setField(term1359398, term1359398.getClass(), "first", term1359468);
        setField(term1359328, term1359328.getClass(), "first", term1359398);
        setField(term1359258, term1359258.getClass(), "first", term1359328);
        setField(term1359188, term1359188.getClass(), "first", term1359258);
        setField(term1359118, term1359118.getClass(), "first", term1359188);
        setField(term1359048, term1359048.getClass(), "first", term1359118);
        setField(term1358978, term1358978.getClass(), "first", term1359048);
        setField(term1358908, term1358908.getClass(), "first", term1358978);
        setField(term1358838, term1358838.getClass(), "first", term1358908);
        setField(term1358768, term1358768.getClass(), "first", term1358838);
        setField(term1358698, term1358698.getClass(), "first", term1358768);
        setField(term1358628, term1358628.getClass(), "first", term1358698);
        setField(term1358558, term1358558.getClass(), "first", term1358628);
        setField(term1358488, term1358488.getClass(), "first", term1358558);
        setField(term1358418, term1358418.getClass(), "first", term1358488);
        setField(term1358348, term1358348.getClass(), "first", term1358418);
        setField(term1358278, term1358278.getClass(), "first", term1358348);
        setField(term1358208, term1358208.getClass(), "first", term1358278);
        setField(term1358138, term1358138.getClass(), "first", term1358208);
        setField(term1358068, term1358068.getClass(), "first", term1358138);
        setField(term1357998, term1357998.getClass(), "first", term1358068);
        setField(term1357928, term1357928.getClass(), "first", term1357998);
        setField(term1357858, term1357858.getClass(), "first", term1357928);
        setField(term1357788, term1357788.getClass(), "first", term1357858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1357788;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1357718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


