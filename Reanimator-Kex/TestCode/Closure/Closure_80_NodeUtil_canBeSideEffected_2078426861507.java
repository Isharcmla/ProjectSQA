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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_canBeSideEffected_2078426861507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359301;

    public NodeUtil_canBeSideEffected_2078426861507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term359301, term359301.getClass(), "type", 0);
        setIntField(term359371, term359371.getClass(), "type", 0);
        setIntField(term359441, term359441.getClass(), "type", 0);
        setIntField(term359511, term359511.getClass(), "type", 0);
        setIntField(term359581, term359581.getClass(), "type", 0);
        setIntField(term359651, term359651.getClass(), "type", 0);
        setIntField(term359721, term359721.getClass(), "type", 0);
        setIntField(term359791, term359791.getClass(), "type", 0);
        setIntField(term359861, term359861.getClass(), "type", 0);
        setIntField(term359931, term359931.getClass(), "type", 0);
        setIntField(term360001, term360001.getClass(), "type", 0);
        setIntField(term360071, term360071.getClass(), "type", 0);
        setIntField(term360141, term360141.getClass(), "type", 0);
        setIntField(term360211, term360211.getClass(), "type", 0);
        setIntField(term360281, term360281.getClass(), "type", 0);
        setIntField(term360351, term360351.getClass(), "type", 0);
        setIntField(term360421, term360421.getClass(), "type", 0);
        setIntField(term360491, term360491.getClass(), "type", 0);
        setIntField(term360561, term360561.getClass(), "type", 0);
        setIntField(term360631, term360631.getClass(), "type", 0);
        setIntField(term360701, term360701.getClass(), "type", 0);
        setIntField(term360771, term360771.getClass(), "type", 0);
        setIntField(term360841, term360841.getClass(), "type", 0);
        setIntField(term360911, term360911.getClass(), "type", 0);
        setIntField(term360981, term360981.getClass(), "type", 0);
        setIntField(term361051, term361051.getClass(), "type", 0);
        setIntField(term361121, term361121.getClass(), "type", 0);
        setIntField(term361191, term361191.getClass(), "type", 0);
        setIntField(term361261, term361261.getClass(), "type", 0);
        setIntField(term361331, term361331.getClass(), "type", 0);
        setIntField(term361401, term361401.getClass(), "type", 0);
        setIntField(term361471, term361471.getClass(), "type", 0);
        setIntField(term361541, term361541.getClass(), "type", 0);
        setIntField(term361611, term361611.getClass(), "type", 0);
        setIntField(term361681, term361681.getClass(), "type", 0);
        setIntField(term361751, term361751.getClass(), "type", 0);
        setIntField(term361821, term361821.getClass(), "type", 0);
        setIntField(term361891, term361891.getClass(), "type", 38);
        setField(term361821, term361821.getClass(), "first", term361891);
        setField(term361751, term361751.getClass(), "first", term361821);
        setField(term361681, term361681.getClass(), "first", term361751);
        setField(term361611, term361611.getClass(), "first", term361681);
        setField(term361541, term361541.getClass(), "first", term361611);
        setField(term361471, term361471.getClass(), "first", term361541);
        setField(term361401, term361401.getClass(), "first", term361471);
        setField(term361331, term361331.getClass(), "first", term361401);
        setField(term361261, term361261.getClass(), "first", term361331);
        setField(term361191, term361191.getClass(), "first", term361261);
        setField(term361121, term361121.getClass(), "first", term361191);
        setField(term361051, term361051.getClass(), "first", term361121);
        setField(term360981, term360981.getClass(), "first", term361051);
        setField(term360911, term360911.getClass(), "first", term360981);
        setField(term360841, term360841.getClass(), "first", term360911);
        setField(term360771, term360771.getClass(), "first", term360841);
        setField(term360701, term360701.getClass(), "first", term360771);
        setField(term360631, term360631.getClass(), "first", term360701);
        setField(term360561, term360561.getClass(), "first", term360631);
        setField(term360491, term360491.getClass(), "first", term360561);
        setField(term360421, term360421.getClass(), "first", term360491);
        setField(term360351, term360351.getClass(), "first", term360421);
        setField(term360281, term360281.getClass(), "first", term360351);
        setField(term360211, term360211.getClass(), "first", term360281);
        setField(term360141, term360141.getClass(), "first", term360211);
        setField(term360071, term360071.getClass(), "first", term360141);
        setField(term360001, term360001.getClass(), "first", term360071);
        setField(term359931, term359931.getClass(), "first", term360001);
        setField(term359861, term359861.getClass(), "first", term359931);
        setField(term359791, term359791.getClass(), "first", term359861);
        setField(term359721, term359721.getClass(), "first", term359791);
        setField(term359651, term359651.getClass(), "first", term359721);
        setField(term359581, term359581.getClass(), "first", term359651);
        setField(term359511, term359511.getClass(), "first", term359581);
        setField(term359441, term359441.getClass(), "first", term359511);
        setField(term359371, term359371.getClass(), "first", term359441);
        setField(term359301, term359301.getClass(), "first", term359371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term359301;
        args[1] = null;
        try {
            callMethod(klass, "canBeSideEffected", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


