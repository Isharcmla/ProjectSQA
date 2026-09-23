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

public class TypeInference_traverseGetElem_947565415354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064858;
     Object term1064928;

    public TypeInference_traverseGetElem_947565415354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1064858 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1064928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1064998, term1064998.getClass(), "type", 21);
        setField(term1065068, term1065068.getClass(), "next", null);
        setIntField(term1065068, term1065068.getClass(), "type", 21);
        setField(term1065138, term1065138.getClass(), "next", null);
        setIntField(term1065138, term1065138.getClass(), "type", 21);
        setField(term1065208, term1065208.getClass(), "next", null);
        setIntField(term1065208, term1065208.getClass(), "type", 21);
        setField(term1065278, term1065278.getClass(), "next", null);
        setIntField(term1065278, term1065278.getClass(), "type", 21);
        setField(term1065348, term1065348.getClass(), "next", null);
        setIntField(term1065348, term1065348.getClass(), "type", 21);
        setField(term1065418, term1065418.getClass(), "next", null);
        setIntField(term1065418, term1065418.getClass(), "type", 21);
        setField(term1065488, term1065488.getClass(), "next", null);
        setIntField(term1065488, term1065488.getClass(), "type", 21);
        setField(term1065558, term1065558.getClass(), "next", null);
        setIntField(term1065558, term1065558.getClass(), "type", 21);
        setField(term1065628, term1065628.getClass(), "next", null);
        setIntField(term1065628, term1065628.getClass(), "type", 21);
        setField(term1065698, term1065698.getClass(), "next", null);
        setIntField(term1065698, term1065698.getClass(), "type", 21);
        setField(term1065768, term1065768.getClass(), "next", null);
        setIntField(term1065768, term1065768.getClass(), "type", 21);
        setField(term1065838, term1065838.getClass(), "next", null);
        setIntField(term1065838, term1065838.getClass(), "type", 21);
        setField(term1065908, term1065908.getClass(), "next", null);
        setIntField(term1065908, term1065908.getClass(), "type", 21);
        setField(term1065978, term1065978.getClass(), "next", null);
        setIntField(term1065978, term1065978.getClass(), "type", 21);
        setField(term1066048, term1066048.getClass(), "next", null);
        setIntField(term1066048, term1066048.getClass(), "type", 21);
        setField(term1066118, term1066118.getClass(), "next", null);
        setIntField(term1066118, term1066118.getClass(), "type", 21);
        setField(term1066188, term1066188.getClass(), "next", null);
        setIntField(term1066188, term1066188.getClass(), "type", 21);
        setField(term1066258, term1066258.getClass(), "next", null);
        setIntField(term1066258, term1066258.getClass(), "type", 21);
        setField(term1066328, term1066328.getClass(), "next", null);
        setIntField(term1066328, term1066328.getClass(), "type", 21);
        setField(term1066398, term1066398.getClass(), "next", null);
        setIntField(term1066398, term1066398.getClass(), "type", 21);
        setField(term1066468, term1066468.getClass(), "next", null);
        setIntField(term1066468, term1066468.getClass(), "type", 21);
        setField(term1066538, term1066538.getClass(), "next", null);
        setIntField(term1066538, term1066538.getClass(), "type", 21);
        setField(term1066608, term1066608.getClass(), "next", null);
        setIntField(term1066608, term1066608.getClass(), "type", 21);
        setField(term1066678, term1066678.getClass(), "next", null);
        setIntField(term1066678, term1066678.getClass(), "type", 21);
        setField(term1066748, term1066748.getClass(), "next", null);
        setIntField(term1066748, term1066748.getClass(), "type", 21);
        setField(term1066818, term1066818.getClass(), "next", null);
        setIntField(term1066818, term1066818.getClass(), "type", 21);
        setField(term1066888, term1066888.getClass(), "next", null);
        setIntField(term1066888, term1066888.getClass(), "type", 21);
        setField(term1066958, term1066958.getClass(), "next", null);
        setIntField(term1066958, term1066958.getClass(), "type", 21);
        setField(term1067028, term1067028.getClass(), "next", null);
        setIntField(term1067028, term1067028.getClass(), "type", 21);
        setField(term1067098, term1067098.getClass(), "next", null);
        setIntField(term1067098, term1067098.getClass(), "type", 44);
        setField(term1067028, term1067028.getClass(), "first", term1067098);
        setField(term1066958, term1066958.getClass(), "first", term1067028);
        setField(term1066888, term1066888.getClass(), "first", term1066958);
        setField(term1066818, term1066818.getClass(), "first", term1066888);
        setField(term1066748, term1066748.getClass(), "first", term1066818);
        setField(term1066678, term1066678.getClass(), "first", term1066748);
        setField(term1066608, term1066608.getClass(), "first", term1066678);
        setField(term1066538, term1066538.getClass(), "first", term1066608);
        setField(term1066468, term1066468.getClass(), "first", term1066538);
        setField(term1066398, term1066398.getClass(), "first", term1066468);
        setField(term1066328, term1066328.getClass(), "first", term1066398);
        setField(term1066258, term1066258.getClass(), "first", term1066328);
        setField(term1066188, term1066188.getClass(), "first", term1066258);
        setField(term1066118, term1066118.getClass(), "first", term1066188);
        setField(term1066048, term1066048.getClass(), "first", term1066118);
        setField(term1065978, term1065978.getClass(), "first", term1066048);
        setField(term1065908, term1065908.getClass(), "first", term1065978);
        setField(term1065838, term1065838.getClass(), "first", term1065908);
        setField(term1065768, term1065768.getClass(), "first", term1065838);
        setField(term1065698, term1065698.getClass(), "first", term1065768);
        setField(term1065628, term1065628.getClass(), "first", term1065698);
        setField(term1065558, term1065558.getClass(), "first", term1065628);
        setField(term1065488, term1065488.getClass(), "first", term1065558);
        setField(term1065418, term1065418.getClass(), "first", term1065488);
        setField(term1065348, term1065348.getClass(), "first", term1065418);
        setField(term1065278, term1065278.getClass(), "first", term1065348);
        setField(term1065208, term1065208.getClass(), "first", term1065278);
        setField(term1065138, term1065138.getClass(), "first", term1065208);
        setField(term1065068, term1065068.getClass(), "first", term1065138);
        setField(term1064998, term1064998.getClass(), "first", term1065068);
        setField(term1064928, term1064928.getClass(), "first", term1064998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1064928;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1064858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


