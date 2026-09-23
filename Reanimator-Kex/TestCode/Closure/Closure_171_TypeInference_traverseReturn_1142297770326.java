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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732277;
     Object term732347;

    public TypeInference_traverseReturn_1142297770326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732277 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term732347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term734067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term732417, term732417.getClass(), "type", 29);
        setIntField(term732487, term732487.getClass(), "type", 29);
        setIntField(term732557, term732557.getClass(), "type", 29);
        setIntField(term732627, term732627.getClass(), "type", 29);
        setIntField(term732697, term732697.getClass(), "type", 29);
        setIntField(term732767, term732767.getClass(), "type", 29);
        setIntField(term732837, term732837.getClass(), "type", 29);
        setIntField(term732907, term732907.getClass(), "type", 29);
        setIntField(term732999, term732999.getClass(), "type", 29);
        setIntField(term733069, term733069.getClass(), "type", 29);
        setIntField(term733161, term733161.getClass(), "type", 29);
        setIntField(term733253, term733253.getClass(), "type", 29);
        setIntField(term733345, term733345.getClass(), "type", 29);
        setIntField(term733415, term733415.getClass(), "type", 29);
        setIntField(term733485, term733485.getClass(), "type", 29);
        setIntField(term733555, term733555.getClass(), "type", 29);
        setIntField(term733625, term733625.getClass(), "type", 29);
        setIntField(term733695, term733695.getClass(), "type", 29);
        setIntField(term733765, term733765.getClass(), "type", 29);
        setIntField(term733835, term733835.getClass(), "type", 29);
        setIntField(term733905, term733905.getClass(), "type", 29);
        setIntField(term733997, term733997.getClass(), "type", 29);
        setIntField(term734067, term734067.getClass(), "type", 29);
        setIntField(term734137, term734137.getClass(), "type", 29);
        setIntField(term734207, term734207.getClass(), "type", 29);
        setIntField(term734277, term734277.getClass(), "type", 29);
        setIntField(term734347, term734347.getClass(), "type", 29);
        setIntField(term734417, term734417.getClass(), "type", 29);
        setIntField(term734487, term734487.getClass(), "type", 29);
        setIntField(term734557, term734557.getClass(), "type", 29);
        setIntField(term734627, term734627.getClass(), "type", 29);
        setIntField(term734697, term734697.getClass(), "type", 29);
        setIntField(term734767, term734767.getClass(), "type", 29);
        setIntField(term734837, term734837.getClass(), "type", 29);
        setIntField(term734907, term734907.getClass(), "type", 29);
        setField(term734907, term734907.getClass(), "first", term732697);
        setField(term734837, term734837.getClass(), "first", term734907);
        setField(term734767, term734767.getClass(), "first", term734837);
        setField(term734697, term734697.getClass(), "first", term734767);
        setField(term734627, term734627.getClass(), "first", term734697);
        setField(term734557, term734557.getClass(), "first", term734627);
        setField(term734487, term734487.getClass(), "first", term734557);
        setField(term734417, term734417.getClass(), "first", term734487);
        setField(term734347, term734347.getClass(), "first", term734417);
        setField(term734277, term734277.getClass(), "first", term734347);
        setField(term734207, term734207.getClass(), "first", term734277);
        setField(term734137, term734137.getClass(), "first", term734207);
        setField(term734067, term734067.getClass(), "first", term734137);
        setField(term733997, term733997.getClass(), "first", term734067);
        setField(term733905, term733905.getClass(), "first", term733997);
        setField(term733835, term733835.getClass(), "first", term733905);
        setField(term733765, term733765.getClass(), "first", term733835);
        setField(term733695, term733695.getClass(), "first", term733765);
        setField(term733625, term733625.getClass(), "first", term733695);
        setField(term733555, term733555.getClass(), "first", term733625);
        setField(term733485, term733485.getClass(), "first", term733555);
        setField(term733415, term733415.getClass(), "first", term733485);
        setField(term733345, term733345.getClass(), "first", term733415);
        setField(term733253, term733253.getClass(), "first", term733345);
        setField(term733161, term733161.getClass(), "first", term733253);
        setField(term733069, term733069.getClass(), "first", term733161);
        setField(term732999, term732999.getClass(), "first", term733069);
        setField(term732907, term732907.getClass(), "first", term732999);
        setField(term732837, term732837.getClass(), "first", term732907);
        setField(term732767, term732767.getClass(), "first", term732837);
        setField(term732697, term732697.getClass(), "first", term732767);
        setField(term732627, term732627.getClass(), "first", term732697);
        setField(term732557, term732557.getClass(), "first", term732627);
        setField(term732487, term732487.getClass(), "first", term732557);
        setField(term732417, term732417.getClass(), "first", term732487);
        setField(term732347, term732347.getClass(), "first", term732417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term732347;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term732277, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


