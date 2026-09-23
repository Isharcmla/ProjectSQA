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
import java.lang.Object;

public class DevirtualizePrototypeMethods_isEligibleDefinition_209337946935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6673;
     Object term6765;

    public DevirtualizePrototypeMethods_isEligibleDefinition_209337946935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6673 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term6765 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionSite"));
        Object term6929 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionsRemover$ObjectLiteralPropertyDefinition"));
        Object term6999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6929, term6929.getClass(), "value", term6999);
        setField(term6765, term6765.getClass(), "definition", term6929);
        setField(term6765, term6765.getClass(), "module", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DefinitionSite");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6765;
        callMethod(klass, "isEligibleDefinition", argTypes, term6673, args);
    }

};


