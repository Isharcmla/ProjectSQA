package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Options_getOptions_82251445124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;
     Object term3397;
     Object term3392;

    public Options_getOptions_82251445124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term528 = new LinkedHashMap();
        LinkedHashMap term534 = new LinkedHashMap();
        ArrayList term540 = new ArrayList();
        HashMap term544 = new HashMap();
        term527 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term527, term527.getClass(), "shortOpts", term528);
        setField(term527, term527.getClass(), "longOpts", term534);
        setField(term527, term527.getClass(), "requiredOpts", term540);
        setField(term527, term527.getClass(), "optionGroups", term544);
        LinkedHashMap term3398 = new LinkedHashMap();
        LinkedHashMap term3400 = new LinkedHashMap();
        ArrayList term3401 = new ArrayList();
        HashMap term3403 = new HashMap();
        term3397 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3397, term3397.getClass(), "shortOpts", term3398);
        setField(term3397, term3397.getClass(), "longOpts", term3400);
        setField(term3397, term3397.getClass(), "requiredOpts", term3401);
        setField(term3397, term3397.getClass(), "optionGroups", term3403);
        ArrayList term3393 = new ArrayList();
        term3392 = newInstance(Class.forName("java.util.Collections$UnmodifiableCollection"));
        setField(term3392, term3392.getClass(), "c", term3393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term527, args);
        assertTrue(recursiveEquals(term527, term3397));
        assertTrue(recursiveEquals(retValue, term3392));
    }

};


