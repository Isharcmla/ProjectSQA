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

public class TypeInference_traverseReturn_94528842207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167705;
     Object term167775;

    public TypeInference_traverseReturn_94528842207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167705 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term167775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term167845, term167845.getClass(), "type", 9);
        setIntField(term167915, term167915.getClass(), "type", 9);
        setIntField(term167985, term167985.getClass(), "type", 9);
        setIntField(term168055, term168055.getClass(), "type", 9);
        setIntField(term168125, term168125.getClass(), "type", 9);
        setIntField(term168195, term168195.getClass(), "type", 9);
        setIntField(term168265, term168265.getClass(), "type", 9);
        setIntField(term168335, term168335.getClass(), "type", 9);
        setIntField(term168405, term168405.getClass(), "type", 9);
        setIntField(term168475, term168475.getClass(), "type", 9);
        setIntField(term168545, term168545.getClass(), "type", 9);
        setIntField(term168615, term168615.getClass(), "type", 9);
        setIntField(term168685, term168685.getClass(), "type", 9);
        setIntField(term168755, term168755.getClass(), "type", 9);
        setIntField(term168825, term168825.getClass(), "type", 9);
        setIntField(term168895, term168895.getClass(), "type", 9);
        setIntField(term168965, term168965.getClass(), "type", 9);
        setIntField(term169035, term169035.getClass(), "type", 9);
        setIntField(term169105, term169105.getClass(), "type", 9);
        setIntField(term169175, term169175.getClass(), "type", 9);
        setIntField(term169245, term169245.getClass(), "type", 9);
        setIntField(term169315, term169315.getClass(), "type", 9);
        setIntField(term169385, term169385.getClass(), "type", 9);
        setIntField(term169455, term169455.getClass(), "type", 9);
        setIntField(term169525, term169525.getClass(), "type", 9);
        setIntField(term169595, term169595.getClass(), "type", 9);
        setIntField(term169665, term169665.getClass(), "type", 9);
        setIntField(term169735, term169735.getClass(), "type", 15);
        setField(term169665, term169665.getClass(), "first", term169735);
        setField(term169595, term169595.getClass(), "first", term169665);
        setField(term169525, term169525.getClass(), "first", term169595);
        setField(term169455, term169455.getClass(), "first", term169525);
        setField(term169385, term169385.getClass(), "first", term169455);
        setField(term169315, term169315.getClass(), "first", term169385);
        setField(term169245, term169245.getClass(), "first", term169315);
        setField(term169175, term169175.getClass(), "first", term169245);
        setField(term169105, term169105.getClass(), "first", term169175);
        setField(term169035, term169035.getClass(), "first", term169105);
        setField(term168965, term168965.getClass(), "first", term169035);
        setField(term168895, term168895.getClass(), "first", term168965);
        setField(term168825, term168825.getClass(), "first", term168895);
        setField(term168755, term168755.getClass(), "first", term168825);
        setField(term168685, term168685.getClass(), "first", term168755);
        setField(term168615, term168615.getClass(), "first", term168685);
        setField(term168545, term168545.getClass(), "first", term168615);
        setField(term168475, term168475.getClass(), "first", term168545);
        setField(term168405, term168405.getClass(), "first", term168475);
        setField(term168335, term168335.getClass(), "first", term168405);
        setField(term168265, term168265.getClass(), "first", term168335);
        setField(term168195, term168195.getClass(), "first", term168265);
        setField(term168125, term168125.getClass(), "first", term168195);
        setField(term168055, term168055.getClass(), "first", term168125);
        setField(term167985, term167985.getClass(), "first", term168055);
        setField(term167915, term167915.getClass(), "first", term167985);
        setField(term167845, term167845.getClass(), "first", term167915);
        setField(term167775, term167775.getClass(), "first", term167845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term167775;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term167705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


