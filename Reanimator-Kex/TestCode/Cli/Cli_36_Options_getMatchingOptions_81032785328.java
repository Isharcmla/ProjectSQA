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

public class Options_getMatchingOptions_81032785328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;
     Object term3601;
     Object term3574;

    public Options_getMatchingOptions_81032785328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term638 = new LinkedHashMap();
        LinkedHashMap term644 = new LinkedHashMap();
        ArrayList term650 = new ArrayList();
        HashMap term654 = new HashMap();
        term637 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term637, term637.getClass(), "shortOpts", term638);
        setField(term637, term637.getClass(), "longOpts", term644);
        setField(term637, term637.getClass(), "requiredOpts", term650);
        setField(term637, term637.getClass(), "optionGroups", term654);
        LinkedHashMap term3602 = new LinkedHashMap();
        LinkedHashMap term3603 = new LinkedHashMap();
        ArrayList term3605 = new ArrayList();
        HashMap term3607 = new HashMap();
        term3601 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3601, term3601.getClass(), "shortOpts", term3602);
        setField(term3601, term3601.getClass(), "longOpts", term3603);
        setField(term3601, term3601.getClass(), "requiredOpts", term3605);
        setField(term3601, term3601.getClass(), "optionGroups", term3607);
        term3574 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term637, args);
        assertTrue(recursiveEquals(term637, term3601));
        assertTrue(recursiveEquals(retValue, term3574));
    }

};


