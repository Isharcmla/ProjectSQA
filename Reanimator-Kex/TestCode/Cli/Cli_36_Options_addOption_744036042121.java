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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class Options_addOption_744036042121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33674;
     Object term33914;
     Object term33942;
     Object term33951;
     Object term33927;

    public Options_addOption_744036042121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33764 = newInstance(Class.forName("java.lang.Object"));
        Object term33802 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term33726 = new ArrayList();
        ((ArrayList) term33726).add(term33764);
        ((ArrayList) term33726).add(term33802);
        HashMap term33850 = new HashMap();
        term33674 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33674, term33674.getClass(), "requiredOpts", term33726);
        setField(term33674, term33674.getClass(), "shortOpts", term33850);
        term33914 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33914, term33914.getClass(), "opt", null);
        setField(term33914, term33914.getClass(), "longOpt", null);
        setBooleanField(term33914, term33914.getClass(), "required", true);
        HashMap term33943 = new HashMap();
        Object term33949 = newInstance(Class.forName("java.lang.Object"));
        Object term33950 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term33947 = new ArrayList();
        ((ArrayList) term33947).add(term33949);
        ((ArrayList) term33947).add(term33950);
        ((ArrayList) term33947).add((Object)null);
        term33942 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33942, term33942.getClass(), "shortOpts", term33943);
        setField(term33942, term33942.getClass(), "longOpts", null);
        setField(term33942, term33942.getClass(), "requiredOpts", term33947);
        setField(term33942, term33942.getClass(), "optionGroups", null);
        term33951 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33951, term33951.getClass(), "opt", null);
        setField(term33951, term33951.getClass(), "longOpt", null);
        setField(term33951, term33951.getClass(), "argName", null);
        setField(term33951, term33951.getClass(), "description", null);
        setBooleanField(term33951, term33951.getClass(), "required", true);
        setBooleanField(term33951, term33951.getClass(), "optionalArg", false);
        setIntField(term33951, term33951.getClass(), "numberOfArgs", 0);
        setField(term33951, term33951.getClass(), "type", null);
        setField(term33951, term33951.getClass(), "values", null);
        setCharField(term33951, term33951.getClass(), "valuesep", (char) 0);
        HashMap term33928 = new HashMap();
        Object term33938 = newInstance(Class.forName("java.lang.Object"));
        Object term33939 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term33936 = new ArrayList();
        ((ArrayList) term33936).add(term33938);
        ((ArrayList) term33936).add(term33939);
        ((ArrayList) term33936).add((Object)null);
        term33927 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33927, term33927.getClass(), "shortOpts", term33928);
        setField(term33927, term33927.getClass(), "longOpts", null);
        setField(term33927, term33927.getClass(), "requiredOpts", term33936);
        setField(term33927, term33927.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term33914;
        Object retValue = callMethod(klass, "addOption", argTypes, term33674, args);
        assertTrue(recursiveEquals(term33674, term33942));
        assertTrue(recursiveEquals(term33914, term33951));
        assertTrue(recursiveEquals(retValue, term33927));
    }

};


