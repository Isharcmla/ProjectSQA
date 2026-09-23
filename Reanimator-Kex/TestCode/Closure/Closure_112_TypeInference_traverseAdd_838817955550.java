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

public class TypeInference_traverseAdd_838817955550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2433805;
     Object term2433875;

    public TypeInference_traverseAdd_838817955550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2433805 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2433875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2433945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2433945, term2433945.getClass(), "next", null);
        setIntField(term2433945, term2433945.getClass(), "type", 14);
        setIntField(term2434015, term2434015.getClass(), "type", 14);
        setIntField(term2434085, term2434085.getClass(), "type", 14);
        setIntField(term2434155, term2434155.getClass(), "type", 14);
        setIntField(term2434225, term2434225.getClass(), "type", 14);
        setIntField(term2434295, term2434295.getClass(), "type", 14);
        setIntField(term2434365, term2434365.getClass(), "type", 14);
        setIntField(term2434435, term2434435.getClass(), "type", 14);
        setIntField(term2434505, term2434505.getClass(), "type", 14);
        setIntField(term2434575, term2434575.getClass(), "type", 14);
        setIntField(term2434645, term2434645.getClass(), "type", 14);
        setIntField(term2434715, term2434715.getClass(), "type", 14);
        setIntField(term2434785, term2434785.getClass(), "type", 14);
        setIntField(term2434855, term2434855.getClass(), "type", 14);
        setIntField(term2434925, term2434925.getClass(), "type", 14);
        setIntField(term2434995, term2434995.getClass(), "type", 14);
        setIntField(term2435065, term2435065.getClass(), "type", 14);
        setIntField(term2435135, term2435135.getClass(), "type", 14);
        setIntField(term2435205, term2435205.getClass(), "type", 14);
        setIntField(term2435275, term2435275.getClass(), "type", 14);
        setIntField(term2435345, term2435345.getClass(), "type", 14);
        setIntField(term2435415, term2435415.getClass(), "type", 14);
        setIntField(term2435485, term2435485.getClass(), "type", 14);
        setIntField(term2435555, term2435555.getClass(), "type", 14);
        setIntField(term2435625, term2435625.getClass(), "type", 14);
        setIntField(term2435695, term2435695.getClass(), "type", 14);
        setIntField(term2435765, term2435765.getClass(), "type", 14);
        setIntField(term2435835, term2435835.getClass(), "type", 14);
        setIntField(term2435905, term2435905.getClass(), "type", 14);
        setIntField(term2435975, term2435975.getClass(), "type", 14);
        setIntField(term2436045, term2436045.getClass(), "type", 14);
        setIntField(term2436115, term2436115.getClass(), "type", 14);
        setIntField(term2436185, term2436185.getClass(), "type", 14);
        setIntField(term2436255, term2436255.getClass(), "type", 14);
        setIntField(term2436325, term2436325.getClass(), "type", 14);
        setIntField(term2436395, term2436395.getClass(), "type", 14);
        setIntField(term2436465, term2436465.getClass(), "type", 14);
        setIntField(term2436535, term2436535.getClass(), "type", 14);
        setIntField(term2436605, term2436605.getClass(), "type", 138);
        setField(term2436535, term2436535.getClass(), "first", term2436605);
        setField(term2436465, term2436465.getClass(), "first", term2436535);
        setField(term2436395, term2436395.getClass(), "first", term2436465);
        setField(term2436325, term2436325.getClass(), "first", term2436395);
        setField(term2436255, term2436255.getClass(), "first", term2436325);
        setField(term2436185, term2436185.getClass(), "first", term2436255);
        setField(term2436115, term2436115.getClass(), "first", term2436185);
        setField(term2436045, term2436045.getClass(), "first", term2436115);
        setField(term2435975, term2435975.getClass(), "first", term2436045);
        setField(term2435905, term2435905.getClass(), "first", term2435975);
        setField(term2435835, term2435835.getClass(), "first", term2435905);
        setField(term2435765, term2435765.getClass(), "first", term2435835);
        setField(term2435695, term2435695.getClass(), "first", term2435765);
        setField(term2435625, term2435625.getClass(), "first", term2435695);
        setField(term2435555, term2435555.getClass(), "first", term2435625);
        setField(term2435485, term2435485.getClass(), "first", term2435555);
        setField(term2435415, term2435415.getClass(), "first", term2435485);
        setField(term2435345, term2435345.getClass(), "first", term2435415);
        setField(term2435275, term2435275.getClass(), "first", term2435345);
        setField(term2435205, term2435205.getClass(), "first", term2435275);
        setField(term2435135, term2435135.getClass(), "first", term2435205);
        setField(term2435065, term2435065.getClass(), "first", term2435135);
        setField(term2434995, term2434995.getClass(), "first", term2435065);
        setField(term2434925, term2434925.getClass(), "first", term2434995);
        setField(term2434855, term2434855.getClass(), "first", term2434925);
        setField(term2434785, term2434785.getClass(), "first", term2434855);
        setField(term2434715, term2434715.getClass(), "first", term2434785);
        setField(term2434645, term2434645.getClass(), "first", term2434715);
        setField(term2434575, term2434575.getClass(), "first", term2434645);
        setField(term2434505, term2434505.getClass(), "first", term2434575);
        setField(term2434435, term2434435.getClass(), "first", term2434505);
        setField(term2434365, term2434365.getClass(), "first", term2434435);
        setField(term2434295, term2434295.getClass(), "first", term2434365);
        setField(term2434225, term2434225.getClass(), "first", term2434295);
        setField(term2434155, term2434155.getClass(), "first", term2434225);
        setField(term2434085, term2434085.getClass(), "first", term2434155);
        setField(term2434015, term2434015.getClass(), "first", term2434085);
        setField(term2433945, term2433945.getClass(), "first", term2434015);
        setField(term2433875, term2433875.getClass(), "first", term2433945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2433875;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2433805, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


