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

public class TypeInference_traverseChildren_1478920219264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483438;
     Object term483508;

    public TypeInference_traverseChildren_1478920219264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483438 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term483508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term483578, term483578.getClass(), "type", 18);
        setIntField(term483648, term483648.getClass(), "type", 18);
        setIntField(term483718, term483718.getClass(), "type", 18);
        setIntField(term483788, term483788.getClass(), "type", 18);
        setIntField(term483858, term483858.getClass(), "type", 18);
        setIntField(term483928, term483928.getClass(), "type", 18);
        setIntField(term483998, term483998.getClass(), "type", 18);
        setIntField(term484068, term484068.getClass(), "type", 18);
        setIntField(term484138, term484138.getClass(), "type", 18);
        setIntField(term484208, term484208.getClass(), "type", 18);
        setIntField(term484278, term484278.getClass(), "type", 18);
        setIntField(term484348, term484348.getClass(), "type", 18);
        setIntField(term484418, term484418.getClass(), "type", 18);
        setIntField(term484488, term484488.getClass(), "type", 18);
        setIntField(term484558, term484558.getClass(), "type", 18);
        setIntField(term484628, term484628.getClass(), "type", 18);
        setIntField(term484698, term484698.getClass(), "type", 18);
        setIntField(term484768, term484768.getClass(), "type", 18);
        setIntField(term484838, term484838.getClass(), "type", 18);
        setIntField(term484908, term484908.getClass(), "type", 18);
        setIntField(term484978, term484978.getClass(), "type", 18);
        setIntField(term485048, term485048.getClass(), "type", 18);
        setIntField(term485118, term485118.getClass(), "type", 18);
        setIntField(term485188, term485188.getClass(), "type", 18);
        setIntField(term485258, term485258.getClass(), "type", 18);
        setIntField(term485328, term485328.getClass(), "type", 18);
        setIntField(term485398, term485398.getClass(), "type", 18);
        setIntField(term485468, term485468.getClass(), "type", 18);
        setIntField(term485538, term485538.getClass(), "type", 18);
        setIntField(term485608, term485608.getClass(), "type", 18);
        setIntField(term485678, term485678.getClass(), "type", 18);
        setIntField(term485748, term485748.getClass(), "type", 18);
        setIntField(term485818, term485818.getClass(), "type", 18);
        setIntField(term485888, term485888.getClass(), "type", 18);
        setIntField(term485958, term485958.getClass(), "type", 18);
        setIntField(term486028, term486028.getClass(), "type", 18);
        setIntField(term486098, term486098.getClass(), "type", 18);
        setIntField(term486168, term486168.getClass(), "type", 18);
        setIntField(term486238, term486238.getClass(), "type", 18);
        setIntField(term486308, term486308.getClass(), "type", 18);
        setIntField(term486378, term486378.getClass(), "type", 18);
        setIntField(term486448, term486448.getClass(), "type", 18);
        setIntField(term486518, term486518.getClass(), "type", 18);
        setIntField(term486588, term486588.getClass(), "type", 18);
        setIntField(term486658, term486658.getClass(), "type", 18);
        setIntField(term486728, term486728.getClass(), "type", 18);
        setIntField(term486798, term486798.getClass(), "type", 18);
        setIntField(term486868, term486868.getClass(), "type", 18);
        setIntField(term486938, term486938.getClass(), "type", 18);
        setIntField(term487008, term487008.getClass(), "type", 18);
        setIntField(term487078, term487078.getClass(), "type", 18);
        setIntField(term487148, term487148.getClass(), "type", 18);
        setIntField(term487218, term487218.getClass(), "type", 71);
        setField(term487148, term487148.getClass(), "first", term487218);
        setField(term487078, term487078.getClass(), "first", term487148);
        setField(term487008, term487008.getClass(), "first", term487078);
        setField(term486938, term486938.getClass(), "first", term487008);
        setField(term486868, term486868.getClass(), "first", term486938);
        setField(term486798, term486798.getClass(), "first", term486868);
        setField(term486728, term486728.getClass(), "first", term486798);
        setField(term486658, term486658.getClass(), "first", term486728);
        setField(term486588, term486588.getClass(), "first", term486658);
        setField(term486518, term486518.getClass(), "first", term486588);
        setField(term486448, term486448.getClass(), "first", term486518);
        setField(term486378, term486378.getClass(), "first", term486448);
        setField(term486308, term486308.getClass(), "first", term486378);
        setField(term486238, term486238.getClass(), "first", term486308);
        setField(term486168, term486168.getClass(), "first", term486238);
        setField(term486098, term486098.getClass(), "first", term486168);
        setField(term486028, term486028.getClass(), "first", term486098);
        setField(term485958, term485958.getClass(), "first", term486028);
        setField(term485888, term485888.getClass(), "first", term485958);
        setField(term485818, term485818.getClass(), "first", term485888);
        setField(term485748, term485748.getClass(), "first", term485818);
        setField(term485678, term485678.getClass(), "first", term485748);
        setField(term485608, term485608.getClass(), "first", term485678);
        setField(term485538, term485538.getClass(), "first", term485608);
        setField(term485468, term485468.getClass(), "first", term485538);
        setField(term485398, term485398.getClass(), "first", term485468);
        setField(term485328, term485328.getClass(), "first", term485398);
        setField(term485258, term485258.getClass(), "first", term485328);
        setField(term485188, term485188.getClass(), "first", term485258);
        setField(term485118, term485118.getClass(), "first", term485188);
        setField(term485048, term485048.getClass(), "first", term485118);
        setField(term484978, term484978.getClass(), "first", term485048);
        setField(term484908, term484908.getClass(), "first", term484978);
        setField(term484838, term484838.getClass(), "first", term484908);
        setField(term484768, term484768.getClass(), "first", term484838);
        setField(term484698, term484698.getClass(), "first", term484768);
        setField(term484628, term484628.getClass(), "first", term484698);
        setField(term484558, term484558.getClass(), "first", term484628);
        setField(term484488, term484488.getClass(), "first", term484558);
        setField(term484418, term484418.getClass(), "first", term484488);
        setField(term484348, term484348.getClass(), "first", term484418);
        setField(term484278, term484278.getClass(), "first", term484348);
        setField(term484208, term484208.getClass(), "first", term484278);
        setField(term484138, term484138.getClass(), "first", term484208);
        setField(term484068, term484068.getClass(), "first", term484138);
        setField(term483998, term483998.getClass(), "first", term484068);
        setField(term483928, term483928.getClass(), "first", term483998);
        setField(term483858, term483858.getClass(), "first", term483928);
        setField(term483788, term483788.getClass(), "first", term483858);
        setField(term483718, term483718.getClass(), "first", term483788);
        setField(term483648, term483648.getClass(), "first", term483718);
        setField(term483578, term483578.getClass(), "first", term483648);
        setField(term483508, term483508.getClass(), "first", term483578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term483508;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term483438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


