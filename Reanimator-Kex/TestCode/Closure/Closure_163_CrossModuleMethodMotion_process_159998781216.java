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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class CrossModuleMethodMotion_process_159998781216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;
     Object term8927;

    public CrossModuleMethodMotion_process_159998781216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term3157 = new HashSet();
        term3019 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term3109 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        setField(term3109, term3109.getClass(), "modules", term3157);
        setField(term3019, term3019.getClass(), "moduleGraph", term3109);
        HashMap term8930 = new HashMap();
        Set<Object> term8931 =  ((Map) term8930).keySet();
        HashSet term8929 = new HashSet((Collection<? extends Object>) term8931);
        term8927 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        Object term8928 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        setField(term8927, term8927.getClass(), "compiler", null);
        setField(term8927, term8927.getClass(), "idGenerator", null);
        setField(term8927, term8927.getClass(), "analyzer", null);
        setField(term8928, term8928.getClass(), "modules", term8929);
        setField(term8928, term8928.getClass(), "modulesByDepth", null);
        setField(term8928, term8928.getClass(), "dependencyMap", null);
        setField(term8927, term8927.getClass(), "moduleGraph", term8928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "process", argTypes, term3019, args);
        assertTrue(recursiveEquals(term3019, term8927));
    }

};


