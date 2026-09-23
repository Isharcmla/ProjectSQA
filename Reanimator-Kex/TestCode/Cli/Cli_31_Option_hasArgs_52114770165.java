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
import java.lang.Object;
import java.util.ArrayList;

public class Option_hasArgs_52114770165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1994;
     Object term7974;

    public Option_hasArgs_52114770165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2047 = new ArrayList();
        term1994 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2046 = newInstance(Class.forName("java.lang.Object"));
        setField(term1994, term1994.getClass(), "opt", "jUbSRrkrYZ");
        setField(term1994, term1994.getClass(), "longOpt", "bWWfajKbEX");
        setField(term1994, term1994.getClass(), "argName", "cAPeiZHKGJ");
        setField(term1994, term1994.getClass(), "description", "LvJFtLBaxj");
        setBooleanField(term1994, term1994.getClass(), "required", false);
        setBooleanField(term1994, term1994.getClass(), "optionalArg", false);
        setIntField(term1994, term1994.getClass(), "numberOfArgs", 1622346318);
        setField(term1994, term1994.getClass(), "type", term2046);
        setField(term1994, term1994.getClass(), "values", term2047);
        setCharField(term1994, term1994.getClass(), "valuesep", 'r');
        ArrayList term7984 = new ArrayList();
        term7974 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7983 = newInstance(Class.forName("java.lang.Object"));
        setField(term7974, term7974.getClass(), "opt", "jUbSRrkrYZ");
        setField(term7974, term7974.getClass(), "longOpt", "bWWfajKbEX");
        setField(term7974, term7974.getClass(), "argName", "cAPeiZHKGJ");
        setField(term7974, term7974.getClass(), "description", "LvJFtLBaxj");
        setBooleanField(term7974, term7974.getClass(), "required", false);
        setBooleanField(term7974, term7974.getClass(), "optionalArg", false);
        setIntField(term7974, term7974.getClass(), "numberOfArgs", 1622346318);
        setField(term7974, term7974.getClass(), "type", term7983);
        setField(term7974, term7974.getClass(), "values", term7984);
        setCharField(term7974, term7974.getClass(), "valuesep", 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term1994, args);
        assertTrue(recursiveEquals(term1994, term7974));
        assertTrue(recursiveEquals(retValue, true));
    }

};


