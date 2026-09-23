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

public class TypeInference_traverseReturn_1142297770381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961265;
     Object term961335;

    public TypeInference_traverseReturn_1142297770381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term961265 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term961335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term963015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term961405, term961405.getClass(), "type", 92);
        setIntField(term961475, term961475.getClass(), "type", 92);
        setIntField(term961545, term961545.getClass(), "type", 92);
        setIntField(term961615, term961615.getClass(), "type", 92);
        setIntField(term961685, term961685.getClass(), "type", 92);
        setIntField(term961755, term961755.getClass(), "type", 92);
        setIntField(term961825, term961825.getClass(), "type", 92);
        setIntField(term961895, term961895.getClass(), "type", 92);
        setIntField(term961965, term961965.getClass(), "type", 92);
        setIntField(term962035, term962035.getClass(), "type", 92);
        setIntField(term962105, term962105.getClass(), "type", 92);
        setIntField(term962175, term962175.getClass(), "type", 92);
        setIntField(term962245, term962245.getClass(), "type", 92);
        setIntField(term962315, term962315.getClass(), "type", 92);
        setIntField(term962385, term962385.getClass(), "type", 92);
        setIntField(term962455, term962455.getClass(), "type", 92);
        setIntField(term962525, term962525.getClass(), "type", 92);
        setIntField(term962595, term962595.getClass(), "type", 92);
        setIntField(term962665, term962665.getClass(), "type", 92);
        setIntField(term962735, term962735.getClass(), "type", 92);
        setIntField(term962805, term962805.getClass(), "type", 92);
        setIntField(term962875, term962875.getClass(), "type", 92);
        setIntField(term962945, term962945.getClass(), "type", 92);
        setIntField(term963015, term963015.getClass(), "type", 49);
        setField(term962945, term962945.getClass(), "first", term963015);
        setField(term962875, term962875.getClass(), "first", term962945);
        setField(term962805, term962805.getClass(), "first", term962875);
        setField(term962735, term962735.getClass(), "first", term962805);
        setField(term962665, term962665.getClass(), "first", term962735);
        setField(term962595, term962595.getClass(), "first", term962665);
        setField(term962525, term962525.getClass(), "first", term962595);
        setField(term962455, term962455.getClass(), "first", term962525);
        setField(term962385, term962385.getClass(), "first", term962455);
        setField(term962315, term962315.getClass(), "first", term962385);
        setField(term962245, term962245.getClass(), "first", term962315);
        setField(term962175, term962175.getClass(), "first", term962245);
        setField(term962105, term962105.getClass(), "first", term962175);
        setField(term962035, term962035.getClass(), "first", term962105);
        setField(term961965, term961965.getClass(), "first", term962035);
        setField(term961895, term961895.getClass(), "first", term961965);
        setField(term961825, term961825.getClass(), "first", term961895);
        setField(term961755, term961755.getClass(), "first", term961825);
        setField(term961685, term961685.getClass(), "first", term961755);
        setField(term961615, term961615.getClass(), "first", term961685);
        setField(term961545, term961545.getClass(), "first", term961615);
        setField(term961475, term961475.getClass(), "first", term961545);
        setField(term961405, term961405.getClass(), "first", term961475);
        setField(term961335, term961335.getClass(), "first", term961405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term961335;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term961265, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


