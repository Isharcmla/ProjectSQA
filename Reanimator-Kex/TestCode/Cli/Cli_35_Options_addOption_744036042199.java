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

public class Options_addOption_744036042199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66062;
     Object term66302;
     Object term66330;
     Object term66339;
     Object term66315;

    public Options_addOption_744036042199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66152 = newInstance(Class.forName("java.lang.Object"));
        Object term66190 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term66114 = new ArrayList();
        ((ArrayList) term66114).add(term66152);
        ((ArrayList) term66114).add(term66190);
        HashMap term66238 = new HashMap();
        term66062 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term66062, term66062.getClass(), "requiredOpts", term66114);
        setField(term66062, term66062.getClass(), "shortOpts", term66238);
        term66302 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term66302, term66302.getClass(), "opt", null);
        setField(term66302, term66302.getClass(), "longOpt", null);
        setBooleanField(term66302, term66302.getClass(), "required", true);
        HashMap term66331 = new HashMap();
        Object term66337 = newInstance(Class.forName("java.lang.Object"));
        Object term66338 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term66335 = new ArrayList();
        ((ArrayList) term66335).add(term66337);
        ((ArrayList) term66335).add(term66338);
        ((ArrayList) term66335).add((Object)null);
        term66330 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term66330, term66330.getClass(), "shortOpts", term66331);
        setField(term66330, term66330.getClass(), "longOpts", null);
        setField(term66330, term66330.getClass(), "requiredOpts", term66335);
        setField(term66330, term66330.getClass(), "optionGroups", null);
        term66339 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term66339, term66339.getClass(), "opt", null);
        setField(term66339, term66339.getClass(), "longOpt", null);
        setField(term66339, term66339.getClass(), "argName", null);
        setField(term66339, term66339.getClass(), "description", null);
        setBooleanField(term66339, term66339.getClass(), "required", true);
        setBooleanField(term66339, term66339.getClass(), "optionalArg", false);
        setIntField(term66339, term66339.getClass(), "numberOfArgs", 0);
        setField(term66339, term66339.getClass(), "type", null);
        setField(term66339, term66339.getClass(), "values", null);
        setCharField(term66339, term66339.getClass(), "valuesep", (char) 0);
        HashMap term66316 = new HashMap();
        Object term66326 = newInstance(Class.forName("java.lang.Object"));
        Object term66327 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term66324 = new ArrayList();
        ((ArrayList) term66324).add(term66326);
        ((ArrayList) term66324).add(term66327);
        ((ArrayList) term66324).add((Object)null);
        term66315 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term66315, term66315.getClass(), "shortOpts", term66316);
        setField(term66315, term66315.getClass(), "longOpts", null);
        setField(term66315, term66315.getClass(), "requiredOpts", term66324);
        setField(term66315, term66315.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term66302;
        Object retValue = callMethod(klass, "addOption", argTypes, term66062, args);
        assertTrue(recursiveEquals(term66062, term66330));
        assertTrue(recursiveEquals(term66302, term66339));
        assertTrue(recursiveEquals(retValue, term66315));
    }

};


