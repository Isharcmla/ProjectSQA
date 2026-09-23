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
     Object term2014;

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
        Object term2022 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2022, term2022.getClass(), "module", null);
        setField(term2022, term2022.getClass(), "id", null);
        setField(term2022, term2022.getClass(), "ast", null);
        setField(term2022, term2022.getClass(), "provides", null);
        setField(term2022, term2022.getClass(), "requires", null);
        setBooleanField(term2022, term2022.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term2022, term2022.getClass(), "compiler", null);
        Object term2023 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2023, term2023.getClass(), "module", null);
        setField(term2023, term2023.getClass(), "id", null);
        setField(term2023, term2023.getClass(), "ast", null);
        setField(term2023, term2023.getClass(), "provides", null);
        setField(term2023, term2023.getClass(), "requires", null);
        setBooleanField(term2023, term2023.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2023, term2023.getClass(), "compiler", null);
        Object term2024 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2024, term2024.getClass(), "module", null);
        setField(term2024, term2024.getClass(), "id", null);
        setField(term2024, term2024.getClass(), "ast", null);
        setField(term2024, term2024.getClass(), "provides", null);
        setField(term2024, term2024.getClass(), "requires", null);
        setBooleanField(term2024, term2024.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2024, term2024.getClass(), "compiler", null);
        Object term2025 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2025, term2025.getClass(), "module", null);
        setField(term2025, term2025.getClass(), "id", null);
        setField(term2025, term2025.getClass(), "ast", null);
        setField(term2025, term2025.getClass(), "provides", null);
        setField(term2025, term2025.getClass(), "requires", null);
        setBooleanField(term2025, term2025.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2025, term2025.getClass(), "compiler", null);
        Object term2026 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2026, term2026.getClass(), "module", null);
        setField(term2026, term2026.getClass(), "id", null);
        setField(term2026, term2026.getClass(), "ast", null);
        setField(term2026, term2026.getClass(), "provides", null);
        setField(term2026, term2026.getClass(), "requires", null);
        setBooleanField(term2026, term2026.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2026, term2026.getClass(), "compiler", null);
        Object term2027 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term2027, term2027.getClass(), "module", null);
        setField(term2027, term2027.getClass(), "id", null);
        setField(term2027, term2027.getClass(), "ast", null);
        setField(term2027, term2027.getClass(), "provides", null);
        setField(term2027, term2027.getClass(), "requires", null);
        setBooleanField(term2027, term2027.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term2027, term2027.getClass(), "compiler", null);
        ArrayList term2020 = new ArrayList();
        ((ArrayList) term2020).add(term2022);
        ((ArrayList) term2020).add(term2023);
        ((ArrayList) term2020).add(term2024);
        ((ArrayList) term2020).add(term2024);
        ((ArrayList) term2020).add(term2025);
        ((ArrayList) term2020).add(term2026);
        ((ArrayList) term2020).add(term2026);
        ((ArrayList) term2020).add(term2027);
        Object term2030 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term2030, term2030.getClass(), "name", null);
        setField(term2030, term2030.getClass(), "inputs", null);
        setField(term2030, term2030.getClass(), "deps", null);
        setIntField(term2030, term2030.getClass(), "depth", 0);
        ArrayList term2028 = new ArrayList();
        ((ArrayList) term2028).add(term2030);
        ((ArrayList) term2028).add(term2030);
        term2014 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term2017 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term2014, term2014.getClass(), "compiler", null);
        setField(term2014, term2014.getClass(), "filenamePrefix", "hCWPJQKpdc");
        setBooleanField(term2014, term2014.getClass(), "reportDependencies", true);
        setField(term2017, term2017.getClass(), "name", "WzMEhMXkKx");
        setField(term2017, term2017.getClass(), "inputs", term2020);
        setField(term2017, term2017.getClass(), "deps", term2028);
        setIntField(term2017, term2017.getClass(), "depth", -1530420153);
        setField(term2014, term2014.getClass(), "module", term2017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        Object retValue = callMethod(klass, "normalizeSourceName", argTypes, term393, args);
        assertTrue(recursiveEquals(term393, term2014));
        assertTrue(recursiveEquals(retValue, "aNWLJdrZMq"));
    }

};


