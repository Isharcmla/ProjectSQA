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

public class TypeInference_traverseReturn_94528842246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406685;
     Object term406755;

    public TypeInference_traverseReturn_94528842246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406685 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term406755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term406825, term406825.getClass(), "type", 9);
        setIntField(term406895, term406895.getClass(), "type", 9);
        setIntField(term406965, term406965.getClass(), "type", 9);
        setIntField(term407035, term407035.getClass(), "type", 9);
        setIntField(term407105, term407105.getClass(), "type", 9);
        setIntField(term407175, term407175.getClass(), "type", 9);
        setIntField(term407245, term407245.getClass(), "type", 9);
        setIntField(term407315, term407315.getClass(), "type", 9);
        setIntField(term407385, term407385.getClass(), "type", 9);
        setIntField(term407455, term407455.getClass(), "type", 9);
        setIntField(term407525, term407525.getClass(), "type", 9);
        setIntField(term407595, term407595.getClass(), "type", 9);
        setIntField(term407665, term407665.getClass(), "type", 9);
        setIntField(term407735, term407735.getClass(), "type", 9);
        setIntField(term407805, term407805.getClass(), "type", 9);
        setIntField(term407875, term407875.getClass(), "type", 9);
        setIntField(term407945, term407945.getClass(), "type", 9);
        setIntField(term408015, term408015.getClass(), "type", 9);
        setIntField(term408085, term408085.getClass(), "type", 9);
        setIntField(term408155, term408155.getClass(), "type", 9);
        setIntField(term408225, term408225.getClass(), "type", 9);
        setIntField(term408295, term408295.getClass(), "type", 9);
        setIntField(term408365, term408365.getClass(), "type", 9);
        setIntField(term408435, term408435.getClass(), "type", 9);
        setIntField(term408505, term408505.getClass(), "type", 9);
        setIntField(term408575, term408575.getClass(), "type", 9);
        setIntField(term408645, term408645.getClass(), "type", 9);
        setIntField(term408715, term408715.getClass(), "type", 9);
        setIntField(term408785, term408785.getClass(), "type", 9);
        setIntField(term408855, term408855.getClass(), "type", 9);
        setIntField(term408925, term408925.getClass(), "type", 9);
        setIntField(term408995, term408995.getClass(), "type", 9);
        setIntField(term409065, term409065.getClass(), "type", 9);
        setIntField(term409135, term409135.getClass(), "type", 9);
        setIntField(term409205, term409205.getClass(), "type", 9);
        setIntField(term409275, term409275.getClass(), "type", 9);
        setIntField(term409345, term409345.getClass(), "type", 9);
        setIntField(term409415, term409415.getClass(), "type", 9);
        setIntField(term409485, term409485.getClass(), "type", 119);
        setField(term409415, term409415.getClass(), "first", term409485);
        setField(term409345, term409345.getClass(), "first", term409415);
        setField(term409275, term409275.getClass(), "first", term409345);
        setField(term409205, term409205.getClass(), "first", term409275);
        setField(term409135, term409135.getClass(), "first", term409205);
        setField(term409065, term409065.getClass(), "first", term409135);
        setField(term408995, term408995.getClass(), "first", term409065);
        setField(term408925, term408925.getClass(), "first", term408995);
        setField(term408855, term408855.getClass(), "first", term408925);
        setField(term408785, term408785.getClass(), "first", term408855);
        setField(term408715, term408715.getClass(), "first", term408785);
        setField(term408645, term408645.getClass(), "first", term408715);
        setField(term408575, term408575.getClass(), "first", term408645);
        setField(term408505, term408505.getClass(), "first", term408575);
        setField(term408435, term408435.getClass(), "first", term408505);
        setField(term408365, term408365.getClass(), "first", term408435);
        setField(term408295, term408295.getClass(), "first", term408365);
        setField(term408225, term408225.getClass(), "first", term408295);
        setField(term408155, term408155.getClass(), "first", term408225);
        setField(term408085, term408085.getClass(), "first", term408155);
        setField(term408015, term408015.getClass(), "first", term408085);
        setField(term407945, term407945.getClass(), "first", term408015);
        setField(term407875, term407875.getClass(), "first", term407945);
        setField(term407805, term407805.getClass(), "first", term407875);
        setField(term407735, term407735.getClass(), "first", term407805);
        setField(term407665, term407665.getClass(), "first", term407735);
        setField(term407595, term407595.getClass(), "first", term407665);
        setField(term407525, term407525.getClass(), "first", term407595);
        setField(term407455, term407455.getClass(), "first", term407525);
        setField(term407385, term407385.getClass(), "first", term407455);
        setField(term407315, term407315.getClass(), "first", term407385);
        setField(term407245, term407245.getClass(), "first", term407315);
        setField(term407175, term407175.getClass(), "first", term407245);
        setField(term407105, term407105.getClass(), "first", term407175);
        setField(term407035, term407035.getClass(), "first", term407105);
        setField(term406965, term406965.getClass(), "first", term407035);
        setField(term406895, term406895.getClass(), "first", term406965);
        setField(term406825, term406825.getClass(), "first", term406895);
        setField(term406755, term406755.getClass(), "first", term406825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term406755;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term406685, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


