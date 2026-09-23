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

public class TypeInference_traverseReturn_94528842308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752588;
     Object term752658;

    public TypeInference_traverseReturn_94528842308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term752658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term752728, term752728.getClass(), "type", 9);
        setIntField(term752798, term752798.getClass(), "type", 9);
        setIntField(term752868, term752868.getClass(), "type", 9);
        setIntField(term752938, term752938.getClass(), "type", 9);
        setIntField(term753008, term753008.getClass(), "type", 9);
        setIntField(term753078, term753078.getClass(), "type", 9);
        setIntField(term753148, term753148.getClass(), "type", 9);
        setIntField(term753218, term753218.getClass(), "type", 9);
        setIntField(term753288, term753288.getClass(), "type", 9);
        setIntField(term753358, term753358.getClass(), "type", 9);
        setIntField(term753428, term753428.getClass(), "type", 9);
        setIntField(term753498, term753498.getClass(), "type", 9);
        setIntField(term753568, term753568.getClass(), "type", 9);
        setIntField(term753638, term753638.getClass(), "type", 9);
        setIntField(term753708, term753708.getClass(), "type", 9);
        setIntField(term753778, term753778.getClass(), "type", 9);
        setIntField(term753848, term753848.getClass(), "type", 9);
        setIntField(term753918, term753918.getClass(), "type", 9);
        setIntField(term753988, term753988.getClass(), "type", 9);
        setIntField(term754058, term754058.getClass(), "type", 9);
        setIntField(term754128, term754128.getClass(), "type", 9);
        setIntField(term754198, term754198.getClass(), "type", 9);
        setIntField(term754268, term754268.getClass(), "type", 9);
        setIntField(term754338, term754338.getClass(), "type", 9);
        setIntField(term754408, term754408.getClass(), "type", 9);
        setIntField(term754478, term754478.getClass(), "type", 9);
        setIntField(term754548, term754548.getClass(), "type", 9);
        setIntField(term754618, term754618.getClass(), "type", 9);
        setIntField(term754688, term754688.getClass(), "type", 9);
        setIntField(term754758, term754758.getClass(), "type", 9);
        setIntField(term754828, term754828.getClass(), "type", 9);
        setIntField(term754898, term754898.getClass(), "type", 9);
        setIntField(term754968, term754968.getClass(), "type", 9);
        setIntField(term755038, term755038.getClass(), "type", 9);
        setIntField(term755108, term755108.getClass(), "type", 9);
        setIntField(term755178, term755178.getClass(), "type", 9);
        setIntField(term755248, term755248.getClass(), "type", 9);
        setIntField(term755318, term755318.getClass(), "type", 9);
        setIntField(term755388, term755388.getClass(), "type", 9);
        setIntField(term755458, term755458.getClass(), "type", 9);
        setIntField(term755528, term755528.getClass(), "type", 9);
        setIntField(term755598, term755598.getClass(), "type", 9);
        setIntField(term755668, term755668.getClass(), "type", 9);
        setIntField(term755738, term755738.getClass(), "type", 9);
        setIntField(term755808, term755808.getClass(), "type", 9);
        setIntField(term755878, term755878.getClass(), "type", 9);
        setIntField(term755948, term755948.getClass(), "type", 9);
        setIntField(term756018, term756018.getClass(), "type", 9);
        setIntField(term756088, term756088.getClass(), "type", 15);
        setField(term756018, term756018.getClass(), "first", term756088);
        setField(term755948, term755948.getClass(), "first", term756018);
        setField(term755878, term755878.getClass(), "first", term755948);
        setField(term755808, term755808.getClass(), "first", term755878);
        setField(term755738, term755738.getClass(), "first", term755808);
        setField(term755668, term755668.getClass(), "first", term755738);
        setField(term755598, term755598.getClass(), "first", term755668);
        setField(term755528, term755528.getClass(), "first", term755598);
        setField(term755458, term755458.getClass(), "first", term755528);
        setField(term755388, term755388.getClass(), "first", term755458);
        setField(term755318, term755318.getClass(), "first", term755388);
        setField(term755248, term755248.getClass(), "first", term755318);
        setField(term755178, term755178.getClass(), "first", term755248);
        setField(term755108, term755108.getClass(), "first", term755178);
        setField(term755038, term755038.getClass(), "first", term755108);
        setField(term754968, term754968.getClass(), "first", term755038);
        setField(term754898, term754898.getClass(), "first", term754968);
        setField(term754828, term754828.getClass(), "first", term754898);
        setField(term754758, term754758.getClass(), "first", term754828);
        setField(term754688, term754688.getClass(), "first", term754758);
        setField(term754618, term754618.getClass(), "first", term754688);
        setField(term754548, term754548.getClass(), "first", term754618);
        setField(term754478, term754478.getClass(), "first", term754548);
        setField(term754408, term754408.getClass(), "first", term754478);
        setField(term754338, term754338.getClass(), "first", term754408);
        setField(term754268, term754268.getClass(), "first", term754338);
        setField(term754198, term754198.getClass(), "first", term754268);
        setField(term754128, term754128.getClass(), "first", term754198);
        setField(term754058, term754058.getClass(), "first", term754128);
        setField(term753988, term753988.getClass(), "first", term754058);
        setField(term753918, term753918.getClass(), "first", term753988);
        setField(term753848, term753848.getClass(), "first", term753918);
        setField(term753778, term753778.getClass(), "first", term753848);
        setField(term753708, term753708.getClass(), "first", term753778);
        setField(term753638, term753638.getClass(), "first", term753708);
        setField(term753568, term753568.getClass(), "first", term753638);
        setField(term753498, term753498.getClass(), "first", term753568);
        setField(term753428, term753428.getClass(), "first", term753498);
        setField(term753358, term753358.getClass(), "first", term753428);
        setField(term753288, term753288.getClass(), "first", term753358);
        setField(term753218, term753218.getClass(), "first", term753288);
        setField(term753148, term753148.getClass(), "first", term753218);
        setField(term753078, term753078.getClass(), "first", term753148);
        setField(term753008, term753008.getClass(), "first", term753078);
        setField(term752938, term752938.getClass(), "first", term753008);
        setField(term752868, term752868.getClass(), "first", term752938);
        setField(term752798, term752798.getClass(), "first", term752868);
        setField(term752728, term752728.getClass(), "first", term752798);
        setField(term752658, term752658.getClass(), "first", term752728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term752658;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term752588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


