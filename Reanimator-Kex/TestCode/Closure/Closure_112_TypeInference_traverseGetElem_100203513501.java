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

public class TypeInference_traverseGetElem_100203513501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114494;
     Object term2114564;

    public TypeInference_traverseGetElem_100203513501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2114494 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2114564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2114634, term2114634.getClass(), "type", 98);
        setField(term2114704, term2114704.getClass(), "next", null);
        setIntField(term2114704, term2114704.getClass(), "type", 98);
        setField(term2114774, term2114774.getClass(), "next", null);
        setIntField(term2114774, term2114774.getClass(), "type", 98);
        setField(term2114844, term2114844.getClass(), "next", null);
        setIntField(term2114844, term2114844.getClass(), "type", 98);
        setField(term2114914, term2114914.getClass(), "next", null);
        setIntField(term2114914, term2114914.getClass(), "type", 98);
        setField(term2114984, term2114984.getClass(), "next", null);
        setIntField(term2114984, term2114984.getClass(), "type", 98);
        setField(term2115054, term2115054.getClass(), "next", null);
        setIntField(term2115054, term2115054.getClass(), "type", 98);
        setField(term2115124, term2115124.getClass(), "next", null);
        setIntField(term2115124, term2115124.getClass(), "type", 98);
        setField(term2115194, term2115194.getClass(), "next", null);
        setIntField(term2115194, term2115194.getClass(), "type", 98);
        setField(term2115264, term2115264.getClass(), "next", null);
        setIntField(term2115264, term2115264.getClass(), "type", 98);
        setField(term2115334, term2115334.getClass(), "next", null);
        setIntField(term2115334, term2115334.getClass(), "type", 98);
        setField(term2115404, term2115404.getClass(), "next", null);
        setIntField(term2115404, term2115404.getClass(), "type", 98);
        setField(term2115474, term2115474.getClass(), "next", null);
        setIntField(term2115474, term2115474.getClass(), "type", 98);
        setField(term2115544, term2115544.getClass(), "next", null);
        setIntField(term2115544, term2115544.getClass(), "type", 98);
        setField(term2115614, term2115614.getClass(), "next", null);
        setIntField(term2115614, term2115614.getClass(), "type", 98);
        setField(term2115684, term2115684.getClass(), "next", null);
        setIntField(term2115684, term2115684.getClass(), "type", 98);
        setField(term2115754, term2115754.getClass(), "next", null);
        setIntField(term2115754, term2115754.getClass(), "type", 98);
        setField(term2115824, term2115824.getClass(), "next", null);
        setIntField(term2115824, term2115824.getClass(), "type", 98);
        setField(term2115894, term2115894.getClass(), "next", null);
        setIntField(term2115894, term2115894.getClass(), "type", 98);
        setField(term2115964, term2115964.getClass(), "next", null);
        setIntField(term2115964, term2115964.getClass(), "type", 98);
        setField(term2116034, term2116034.getClass(), "next", null);
        setIntField(term2116034, term2116034.getClass(), "type", 98);
        setField(term2116104, term2116104.getClass(), "next", null);
        setIntField(term2116104, term2116104.getClass(), "type", 98);
        setField(term2116174, term2116174.getClass(), "next", null);
        setIntField(term2116174, term2116174.getClass(), "type", 98);
        setField(term2116244, term2116244.getClass(), "next", null);
        setIntField(term2116244, term2116244.getClass(), "type", 98);
        setField(term2116314, term2116314.getClass(), "next", null);
        setIntField(term2116314, term2116314.getClass(), "type", 98);
        setField(term2116384, term2116384.getClass(), "next", null);
        setIntField(term2116384, term2116384.getClass(), "type", 98);
        setField(term2116454, term2116454.getClass(), "next", null);
        setIntField(term2116454, term2116454.getClass(), "type", 98);
        setField(term2116524, term2116524.getClass(), "next", null);
        setIntField(term2116524, term2116524.getClass(), "type", 98);
        setField(term2116594, term2116594.getClass(), "next", null);
        setIntField(term2116594, term2116594.getClass(), "type", 98);
        setField(term2116664, term2116664.getClass(), "next", null);
        setIntField(term2116664, term2116664.getClass(), "type", 98);
        setField(term2116734, term2116734.getClass(), "next", null);
        setIntField(term2116734, term2116734.getClass(), "type", 98);
        setField(term2116804, term2116804.getClass(), "next", null);
        setIntField(term2116804, term2116804.getClass(), "type", 98);
        setField(term2116874, term2116874.getClass(), "next", null);
        setIntField(term2116874, term2116874.getClass(), "type", 32);
        setField(term2116804, term2116804.getClass(), "first", term2116874);
        setField(term2116804, term2116804.getClass(), "last", null);
        setField(term2116734, term2116734.getClass(), "first", term2116804);
        setField(term2116734, term2116734.getClass(), "last", null);
        setField(term2116664, term2116664.getClass(), "first", term2116734);
        setField(term2116664, term2116664.getClass(), "last", null);
        setField(term2116594, term2116594.getClass(), "first", term2116664);
        setField(term2116594, term2116594.getClass(), "last", null);
        setField(term2116524, term2116524.getClass(), "first", term2116594);
        setField(term2116524, term2116524.getClass(), "last", null);
        setField(term2116454, term2116454.getClass(), "first", term2116524);
        setField(term2116454, term2116454.getClass(), "last", term2114914);
        setField(term2116384, term2116384.getClass(), "first", term2116454);
        setField(term2116384, term2116384.getClass(), "last", null);
        setField(term2116314, term2116314.getClass(), "first", term2116384);
        setField(term2116314, term2116314.getClass(), "last", null);
        setField(term2116244, term2116244.getClass(), "first", term2116314);
        setField(term2116244, term2116244.getClass(), "last", null);
        setField(term2116174, term2116174.getClass(), "first", term2116244);
        setField(term2116174, term2116174.getClass(), "last", null);
        setField(term2116104, term2116104.getClass(), "first", term2116174);
        setField(term2116104, term2116104.getClass(), "last", null);
        setField(term2116034, term2116034.getClass(), "first", term2116104);
        setField(term2116034, term2116034.getClass(), "last", null);
        setField(term2115964, term2115964.getClass(), "first", term2116034);
        setField(term2115964, term2115964.getClass(), "last", null);
        setField(term2115894, term2115894.getClass(), "first", term2115964);
        setField(term2115894, term2115894.getClass(), "last", null);
        setField(term2115824, term2115824.getClass(), "first", term2115894);
        setField(term2115824, term2115824.getClass(), "last", null);
        setField(term2115754, term2115754.getClass(), "first", term2115824);
        setField(term2115754, term2115754.getClass(), "last", null);
        setField(term2115684, term2115684.getClass(), "first", term2115754);
        setField(term2115684, term2115684.getClass(), "last", null);
        setField(term2115614, term2115614.getClass(), "first", term2115684);
        setField(term2115614, term2115614.getClass(), "last", null);
        setField(term2115544, term2115544.getClass(), "first", term2115614);
        setField(term2115544, term2115544.getClass(), "last", null);
        setField(term2115474, term2115474.getClass(), "first", term2115544);
        setField(term2115474, term2115474.getClass(), "last", null);
        setField(term2115404, term2115404.getClass(), "first", term2115474);
        setField(term2115404, term2115404.getClass(), "last", null);
        setField(term2115334, term2115334.getClass(), "first", term2115404);
        setField(term2115334, term2115334.getClass(), "last", null);
        setField(term2115264, term2115264.getClass(), "first", term2115334);
        setField(term2115264, term2115264.getClass(), "last", null);
        setField(term2115194, term2115194.getClass(), "first", term2115264);
        setField(term2115194, term2115194.getClass(), "last", null);
        setField(term2115124, term2115124.getClass(), "first", term2115194);
        setField(term2115124, term2115124.getClass(), "last", null);
        setField(term2115054, term2115054.getClass(), "first", term2115124);
        setField(term2115054, term2115054.getClass(), "last", null);
        setField(term2114984, term2114984.getClass(), "first", term2115054);
        setField(term2114984, term2114984.getClass(), "last", null);
        setField(term2114914, term2114914.getClass(), "first", term2114984);
        setField(term2114914, term2114914.getClass(), "last", null);
        setField(term2114844, term2114844.getClass(), "first", term2114914);
        setField(term2114844, term2114844.getClass(), "last", null);
        setField(term2114774, term2114774.getClass(), "first", term2114844);
        setField(term2114774, term2114774.getClass(), "last", null);
        setField(term2114704, term2114704.getClass(), "first", term2114774);
        setField(term2114704, term2114704.getClass(), "last", null);
        setField(term2114634, term2114634.getClass(), "first", term2114704);
        setField(term2114634, term2114634.getClass(), "last", null);
        setField(term2114564, term2114564.getClass(), "first", term2114634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2114564;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2114494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


