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
import java.util.ArrayList;

public class ProcessCommonJSModules_normalizeSourceName_23844462715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393;
     Object term2074;

    public ProcessCommonJSModules_normalizeSourceName_23844462715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term422 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term422, term422.getClass(), "module", null);
        setField(term422, term422.getClass(), "id", null);
        setField(term422, term422.getClass(), "ast", null);
        setField(term422, term422.getClass(), "provides", null);
        setField(term422, term422.getClass(), "requires", null);
        setBooleanField(term422, term422.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term422, term422.getClass(), "compiler", null);
        Object term424 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term424, term424.getClass(), "module", null);
        setField(term424, term424.getClass(), "id", null);
        setField(term424, term424.getClass(), "ast", null);
        setField(term424, term424.getClass(), "provides", null);
        setField(term424, term424.getClass(), "requires", null);
        setBooleanField(term424, term424.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term424, term424.getClass(), "compiler", null);
        Object term426 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term426, term426.getClass(), "module", null);
        setField(term426, term426.getClass(), "id", null);
        setField(term426, term426.getClass(), "ast", null);
        setField(term426, term426.getClass(), "provides", null);
        setField(term426, term426.getClass(), "requires", null);
        setBooleanField(term426, term426.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term426, term426.getClass(), "compiler", null);
        Object term428 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term428, term428.getClass(), "module", null);
        setField(term428, term428.getClass(), "id", null);
        setField(term428, term428.getClass(), "ast", null);
        setField(term428, term428.getClass(), "provides", null);
        setField(term428, term428.getClass(), "requires", null);
        setBooleanField(term428, term428.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term428, term428.getClass(), "compiler", null);
        Object term430 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term430, term430.getClass(), "module", null);
        setField(term430, term430.getClass(), "id", null);
        setField(term430, term430.getClass(), "ast", null);
        setField(term430, term430.getClass(), "provides", null);
        setField(term430, term430.getClass(), "requires", null);
        setBooleanField(term430, term430.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term430, term430.getClass(), "compiler", null);
        Object term432 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term432, term432.getClass(), "module", null);
        setField(term432, term432.getClass(), "id", null);
        setField(term432, term432.getClass(), "ast", null);
        setField(term432, term432.getClass(), "provides", null);
        setField(term432, term432.getClass(), "requires", null);
        setBooleanField(term432, term432.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term432, term432.getClass(), "compiler", null);
        ArrayList term420 = new ArrayList();
        ((ArrayList) term420).add(term422);
        ((ArrayList) term420).add(term424);
        ((ArrayList) term420).add(term426);
        ((ArrayList) term420).add(term426);
        ((ArrayList) term420).add(term428);
        ((ArrayList) term420).add(term430);
        ((ArrayList) term420).add(term430);
        ((ArrayList) term420).add(term432);
        Object term438 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term438, term438.getClass(), "name", null);
        setField(term438, term438.getClass(), "inputs", null);
        setField(term438, term438.getClass(), "deps", null);
        setIntField(term438, term438.getClass(), "depth", 0);
        ArrayList term436 = new ArrayList();
        ((ArrayList) term436).add(term438);
        ((ArrayList) term436).add(term438);
        term393 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term407 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term393, term393.getClass(), "compiler", null);
        setField(term393, term393.getClass(), "filenamePrefix", "hCWPJQKpdc");
        setBooleanField(term393, term393.getClass(), "reportDependencies", true);
        setField(term407, term407.getClass(), "name", "WzMEhMXkKx");
        setField(term407, term407.getClass(), "inputs", term420);
        setField(term407, term407.getClass(), "deps", term436);
        setIntField(term407, term407.getClass(), "depth", -1530420153);
        setField(term393, term393.getClass(), "module", term407);
        Object term2082 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2082, term2082.getClass(), "module", null);
        setField(term2082, term2082.getClass(), "id", null);
        setField(term2082, term2082.getClass(), "ast", null);
        setField(term2082, term2082.getClass(), "provides", null);
        setField(term2082, term2082.getClass(), "requires", null);
        setBooleanField(term2082, term2082.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term2082, term2082.getClass(), "compiler", null);
        Object term2083 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2083, term2083.getClass(), "module", null);
        setField(term2083, term2083.getClass(), "id", null);
        setField(term2083, term2083.getClass(), "ast", null);
        setField(term2083, term2083.getClass(), "provides", null);
        setField(term2083, term2083.getClass(), "requires", null);
        setBooleanField(term2083, term2083.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2083, term2083.getClass(), "compiler", null);
        Object term2084 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2084, term2084.getClass(), "module", null);
        setField(term2084, term2084.getClass(), "id", null);
        setField(term2084, term2084.getClass(), "ast", null);
        setField(term2084, term2084.getClass(), "provides", null);
        setField(term2084, term2084.getClass(), "requires", null);
        setBooleanField(term2084, term2084.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2084, term2084.getClass(), "compiler", null);
        Object term2085 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2085, term2085.getClass(), "module", null);
        setField(term2085, term2085.getClass(), "id", null);
        setField(term2085, term2085.getClass(), "ast", null);
        setField(term2085, term2085.getClass(), "provides", null);
        setField(term2085, term2085.getClass(), "requires", null);
        setBooleanField(term2085, term2085.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2085, term2085.getClass(), "compiler", null);
        Object term2086 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2086, term2086.getClass(), "module", null);
        setField(term2086, term2086.getClass(), "id", null);
        setField(term2086, term2086.getClass(), "ast", null);
        setField(term2086, term2086.getClass(), "provides", null);
        setField(term2086, term2086.getClass(), "requires", null);
        setBooleanField(term2086, term2086.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2086, term2086.getClass(), "compiler", null);
        Object term2087 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2087, term2087.getClass(), "module", null);
        setField(term2087, term2087.getClass(), "id", null);
        setField(term2087, term2087.getClass(), "ast", null);
        setField(term2087, term2087.getClass(), "provides", null);
        setField(term2087, term2087.getClass(), "requires", null);
        setBooleanField(term2087, term2087.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2087, term2087.getClass(), "compiler", null);
        ArrayList term2080 = new ArrayList();
        ((ArrayList) term2080).add(term2082);
        ((ArrayList) term2080).add(term2083);
        ((ArrayList) term2080).add(term2084);
        ((ArrayList) term2080).add(term2084);
        ((ArrayList) term2080).add(term2085);
        ((ArrayList) term2080).add(term2086);
        ((ArrayList) term2080).add(term2086);
        ((ArrayList) term2080).add(term2087);
        Object term2090 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term2090, term2090.getClass(), "name", null);
        setField(term2090, term2090.getClass(), "inputs", null);
        setField(term2090, term2090.getClass(), "deps", null);
        setIntField(term2090, term2090.getClass(), "depth", 0);
        ArrayList term2088 = new ArrayList();
        ((ArrayList) term2088).add(term2090);
        ((ArrayList) term2088).add(term2090);
        term2074 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term2074, term2074.getClass(), "compiler", null);
        setField(term2074, term2074.getClass(), "filenamePrefix", "hCWPJQKpdc");
        setBooleanField(term2074, term2074.getClass(), "reportDependencies", true);
        setField(term2077, term2077.getClass(), "name", "WzMEhMXkKx");
        setField(term2077, term2077.getClass(), "inputs", term2080);
        setField(term2077, term2077.getClass(), "deps", term2088);
        setIntField(term2077, term2077.getClass(), "depth", -1530420153);
        setField(term2074, term2074.getClass(), "module", term2077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        Object retValue = callMethod(klass, "normalizeSourceName", argTypes, term393, args);
        assertTrue(recursiveEquals(term393, term2074));
        assertTrue(recursiveEquals(retValue, "aNWLJdrZMq"));
    }

};


