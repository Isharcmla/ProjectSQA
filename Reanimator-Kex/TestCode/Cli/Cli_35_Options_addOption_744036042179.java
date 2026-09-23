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
import java.util.HashMap;

public class Options_addOption_744036042179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57667;
     Object term57779;
     Object term57841;
     Object term57847;
     Object term57831;

    public Options_addOption_744036042179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57715 = new HashMap();
        term57667 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57667, term57667.getClass(), "shortOpts", term57715);
        term57779 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term57779, term57779.getClass(), "opt", "");
        setField(term57779, term57779.getClass(), "longOpt", null);
        setBooleanField(term57779, term57779.getClass(), "required", false);
        HashMap term57842 = new HashMap();
        term57841 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57841, term57841.getClass(), "shortOpts", term57842);
        setField(term57841, term57841.getClass(), "longOpts", null);
        setField(term57841, term57841.getClass(), "requiredOpts", null);
        setField(term57841, term57841.getClass(), "optionGroups", null);
        term57847 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term57847, term57847.getClass(), "opt", null);
        setField(term57847, term57847.getClass(), "longOpt", null);
        setField(term57847, term57847.getClass(), "argName", null);
        setField(term57847, term57847.getClass(), "description", null);
        setBooleanField(term57847, term57847.getClass(), "required", false);
        setBooleanField(term57847, term57847.getClass(), "optionalArg", false);
        setIntField(term57847, term57847.getClass(), "numberOfArgs", 0);
        setField(term57847, term57847.getClass(), "type", null);
        setField(term57847, term57847.getClass(), "values", null);
        setCharField(term57847, term57847.getClass(), "valuesep", (char) 0);
        HashMap term57832 = new HashMap();
        term57831 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57831, term57831.getClass(), "shortOpts", term57832);
        setField(term57831, term57831.getClass(), "longOpts", null);
        setField(term57831, term57831.getClass(), "requiredOpts", null);
        setField(term57831, term57831.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term57779;
        Object retValue = callMethod(klass, "addOption", argTypes, term57667, args);
        assertTrue(recursiveEquals(term57667, term57841));
        assertTrue(recursiveEquals(term57779, term57847));
        assertTrue(recursiveEquals(retValue, term57831));
    }

};


