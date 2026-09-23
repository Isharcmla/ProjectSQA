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

public class TypeInference_traverseReturn_1142297770501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1508951;
     Object term1509021;

    public TypeInference_traverseReturn_1142297770501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1508951 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1509021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1509091, term1509091.getClass(), "type", 92);
        setIntField(term1509161, term1509161.getClass(), "type", 92);
        setIntField(term1509231, term1509231.getClass(), "type", 92);
        setIntField(term1509301, term1509301.getClass(), "type", 92);
        setIntField(term1509371, term1509371.getClass(), "type", 92);
        setIntField(term1509441, term1509441.getClass(), "type", 92);
        setIntField(term1509511, term1509511.getClass(), "type", 92);
        setIntField(term1509581, term1509581.getClass(), "type", 92);
        setIntField(term1509651, term1509651.getClass(), "type", 92);
        setIntField(term1509721, term1509721.getClass(), "type", 92);
        setIntField(term1509791, term1509791.getClass(), "type", 92);
        setIntField(term1509861, term1509861.getClass(), "type", 92);
        setIntField(term1509931, term1509931.getClass(), "type", 92);
        setIntField(term1510001, term1510001.getClass(), "type", 92);
        setIntField(term1510071, term1510071.getClass(), "type", 92);
        setIntField(term1510141, term1510141.getClass(), "type", 92);
        setIntField(term1510211, term1510211.getClass(), "type", 92);
        setIntField(term1510281, term1510281.getClass(), "type", 92);
        setIntField(term1510351, term1510351.getClass(), "type", 92);
        setIntField(term1510421, term1510421.getClass(), "type", 92);
        setIntField(term1510491, term1510491.getClass(), "type", 92);
        setIntField(term1510561, term1510561.getClass(), "type", 92);
        setIntField(term1510631, term1510631.getClass(), "type", 92);
        setIntField(term1510701, term1510701.getClass(), "type", 92);
        setIntField(term1510771, term1510771.getClass(), "type", 92);
        setIntField(term1510841, term1510841.getClass(), "type", 92);
        setIntField(term1510911, term1510911.getClass(), "type", 92);
        setIntField(term1510981, term1510981.getClass(), "type", 92);
        setIntField(term1511051, term1511051.getClass(), "type", 92);
        setIntField(term1511121, term1511121.getClass(), "type", 92);
        setIntField(term1511191, term1511191.getClass(), "type", 92);
        setIntField(term1511261, term1511261.getClass(), "type", 92);
        setIntField(term1511331, term1511331.getClass(), "type", 139);
        setField(term1511261, term1511261.getClass(), "first", term1511331);
        setField(term1511191, term1511191.getClass(), "first", term1511261);
        setField(term1511121, term1511121.getClass(), "first", term1511191);
        setField(term1511051, term1511051.getClass(), "first", term1511121);
        setField(term1510981, term1510981.getClass(), "first", term1511051);
        setField(term1510911, term1510911.getClass(), "first", term1510981);
        setField(term1510841, term1510841.getClass(), "first", term1510911);
        setField(term1510771, term1510771.getClass(), "first", term1510841);
        setField(term1510701, term1510701.getClass(), "first", term1510771);
        setField(term1510631, term1510631.getClass(), "first", term1510701);
        setField(term1510561, term1510561.getClass(), "first", term1510631);
        setField(term1510491, term1510491.getClass(), "first", term1510561);
        setField(term1510421, term1510421.getClass(), "first", term1510491);
        setField(term1510351, term1510351.getClass(), "first", term1510421);
        setField(term1510281, term1510281.getClass(), "first", term1510351);
        setField(term1510211, term1510211.getClass(), "first", term1510281);
        setField(term1510141, term1510141.getClass(), "first", term1510211);
        setField(term1510071, term1510071.getClass(), "first", term1510141);
        setField(term1510001, term1510001.getClass(), "first", term1510071);
        setField(term1509931, term1509931.getClass(), "first", term1510001);
        setField(term1509861, term1509861.getClass(), "first", term1509931);
        setField(term1509791, term1509791.getClass(), "first", term1509861);
        setField(term1509721, term1509721.getClass(), "first", term1509791);
        setField(term1509651, term1509651.getClass(), "first", term1509721);
        setField(term1509581, term1509581.getClass(), "first", term1509651);
        setField(term1509511, term1509511.getClass(), "first", term1509581);
        setField(term1509441, term1509441.getClass(), "first", term1509511);
        setField(term1509371, term1509371.getClass(), "first", term1509441);
        setField(term1509301, term1509301.getClass(), "first", term1509371);
        setField(term1509231, term1509231.getClass(), "first", term1509301);
        setField(term1509161, term1509161.getClass(), "first", term1509231);
        setField(term1509091, term1509091.getClass(), "first", term1509161);
        setField(term1509021, term1509021.getClass(), "first", term1509091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1509021;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1508951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


