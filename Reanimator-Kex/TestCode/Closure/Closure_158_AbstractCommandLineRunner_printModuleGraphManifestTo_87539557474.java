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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class AbstractCommandLineRunner_printModuleGraphManifestTo_87539557474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43037;

    public AbstractCommandLineRunner_printModuleGraphManifestTo_87539557474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43039 = new HashMap();
        Set<Object> term92547 =  ((Map) term43039).keySet();
        HashSet term43038 = new HashSet((Collection<? extends Object>) term92547);
        ArrayList term43055 = new ArrayList();
        HashMap term43059 = new HashMap();
        term43037 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        setField(term43037, term43037.getClass(), "modules", term43038);
        setField(term43037, term43037.getClass(), "modulesByDepth", term43055);
        setField(term43037, term43037.getClass(), "dependencyMap", term43059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModuleGraph");
        argTypes[1] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[2];
        args[0] = term43037;
        args[1] = null;
        try {
            callMethod(klass, "printModuleGraphManifestTo", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


