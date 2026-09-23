package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;

public class Attributes_equals_1603080095131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023669;
     Object term3023787;
     Object term3023868;
     Object term3023871;

    public Attributes_equals_1603080095131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3023729 = new LinkedHashMap();
        term3023669 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3023669, term3023669.getClass(), "attributes", term3023729);
        LinkedHashMap term3023847 = new LinkedHashMap();
        term3023787 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3023787, term3023787.getClass(), "attributes", term3023847);
        LinkedHashMap term3023869 = new LinkedHashMap();
        term3023868 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3023868, term3023868.getClass(), "attributes", term3023869);
        LinkedHashMap term3023872 = new LinkedHashMap();
        term3023871 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3023871, term3023871.getClass(), "attributes", term3023872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3023787;
        Object retValue = callMethod(klass, "equals", argTypes, term3023669, args);
        assertTrue(recursiveEquals(term3023669, term3023868));
        assertTrue(recursiveEquals(term3023787, term3023871));
        assertTrue(recursiveEquals(retValue, true));
    }

};


