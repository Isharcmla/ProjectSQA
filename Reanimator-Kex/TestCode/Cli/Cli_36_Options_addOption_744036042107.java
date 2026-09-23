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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Options_addOption_744036042107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29175;
     Object term29291;

    public Options_addOption_744036042107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29227 = new ArrayList();
        term29175 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term29175, term29175.getClass(), "requiredOpts", term29227);
        term29291 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term29291, term29291.getClass(), "opt", null);
        setField(term29291, term29291.getClass(), "longOpt", null);
        setBooleanField(term29291, term29291.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term29291;
        try {
            callMethod(klass, "addOption", argTypes, term29175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


