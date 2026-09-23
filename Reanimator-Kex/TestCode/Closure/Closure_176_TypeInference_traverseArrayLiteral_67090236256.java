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

public class TypeInference_traverseArrayLiteral_67090236256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422385;
     Object term422455;

    public TypeInference_traverseArrayLiteral_67090236256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422385 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term422455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term422525, term422525.getClass(), "type", 83);
        setIntField(term422595, term422595.getClass(), "type", 83);
        setIntField(term422665, term422665.getClass(), "type", 83);
        setIntField(term422735, term422735.getClass(), "type", 83);
        setIntField(term422805, term422805.getClass(), "type", 83);
        setIntField(term422875, term422875.getClass(), "type", 83);
        setIntField(term422945, term422945.getClass(), "type", 83);
        setIntField(term423015, term423015.getClass(), "type", 83);
        setIntField(term423085, term423085.getClass(), "type", 83);
        setIntField(term423155, term423155.getClass(), "type", 83);
        setIntField(term423225, term423225.getClass(), "type", 83);
        setIntField(term423295, term423295.getClass(), "type", 83);
        setIntField(term423365, term423365.getClass(), "type", 83);
        setIntField(term423435, term423435.getClass(), "type", 83);
        setIntField(term423505, term423505.getClass(), "type", 83);
        setIntField(term423575, term423575.getClass(), "type", 83);
        setIntField(term423645, term423645.getClass(), "type", 83);
        setIntField(term423715, term423715.getClass(), "type", 83);
        setIntField(term423785, term423785.getClass(), "type", 83);
        setIntField(term423855, term423855.getClass(), "type", 83);
        setIntField(term423925, term423925.getClass(), "type", 83);
        setIntField(term423995, term423995.getClass(), "type", 83);
        setIntField(term424065, term424065.getClass(), "type", 83);
        setIntField(term424135, term424135.getClass(), "type", 83);
        setIntField(term424205, term424205.getClass(), "type", 83);
        setIntField(term424275, term424275.getClass(), "type", 83);
        setIntField(term424345, term424345.getClass(), "type", 83);
        setIntField(term424415, term424415.getClass(), "type", 83);
        setIntField(term424485, term424485.getClass(), "type", 83);
        setIntField(term424555, term424555.getClass(), "type", 83);
        setIntField(term424625, term424625.getClass(), "type", 143);
        setField(term424555, term424555.getClass(), "first", term424625);
        setField(term424485, term424485.getClass(), "first", term424555);
        setField(term424415, term424415.getClass(), "first", term424485);
        setField(term424345, term424345.getClass(), "first", term424415);
        setField(term424275, term424275.getClass(), "first", term424345);
        setField(term424205, term424205.getClass(), "first", term424275);
        setField(term424135, term424135.getClass(), "first", term424205);
        setField(term424065, term424065.getClass(), "first", term424135);
        setField(term423995, term423995.getClass(), "first", term424065);
        setField(term423925, term423925.getClass(), "first", term423995);
        setField(term423855, term423855.getClass(), "first", term423925);
        setField(term423785, term423785.getClass(), "first", term423855);
        setField(term423715, term423715.getClass(), "first", term423785);
        setField(term423645, term423645.getClass(), "first", term423715);
        setField(term423575, term423575.getClass(), "first", term423645);
        setField(term423505, term423505.getClass(), "first", term423575);
        setField(term423435, term423435.getClass(), "first", term423505);
        setField(term423365, term423365.getClass(), "first", term423435);
        setField(term423295, term423295.getClass(), "first", term423365);
        setField(term423225, term423225.getClass(), "first", term423295);
        setField(term423155, term423155.getClass(), "first", term423225);
        setField(term423085, term423085.getClass(), "first", term423155);
        setField(term423015, term423015.getClass(), "first", term423085);
        setField(term422945, term422945.getClass(), "first", term423015);
        setField(term422875, term422875.getClass(), "first", term422945);
        setField(term422805, term422805.getClass(), "first", term422875);
        setField(term422735, term422735.getClass(), "first", term422805);
        setField(term422665, term422665.getClass(), "first", term422735);
        setField(term422595, term422595.getClass(), "first", term422665);
        setField(term422525, term422525.getClass(), "first", term422595);
        setField(term422455, term422455.getClass(), "first", term422525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term422455;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term422385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


