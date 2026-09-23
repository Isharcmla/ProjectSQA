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

public class Option_hasArgs_52114770165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;
     Object term7864;

    public Option_hasArgs_52114770165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2027 = new ArrayList();
        term1975 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1975, term1975.getClass(), "opt", "jUbSRrkrYZ");
        setField(term1975, term1975.getClass(), "longOpt", "bWWfajKbEX");
        setField(term1975, term1975.getClass(), "argName", "cAPeiZHKGJ");
        setField(term1975, term1975.getClass(), "description", "LvJFtLBaxj");
        setBooleanField(term1975, term1975.getClass(), "required", false);
        setBooleanField(term1975, term1975.getClass(), "optionalArg", false);
        setIntField(term1975, term1975.getClass(), "numberOfArgs", 1622346318);
        setField(term1975, term1975.getClass(), "type", null);
        setField(term1975, term1975.getClass(), "values", term2027);
        setCharField(term1975, term1975.getClass(), "valuesep", 'r');
        ArrayList term7873 = new ArrayList();
        term7864 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7864, term7864.getClass(), "opt", "jUbSRrkrYZ");
        setField(term7864, term7864.getClass(), "longOpt", "bWWfajKbEX");
        setField(term7864, term7864.getClass(), "argName", "cAPeiZHKGJ");
        setField(term7864, term7864.getClass(), "description", "LvJFtLBaxj");
        setBooleanField(term7864, term7864.getClass(), "required", false);
        setBooleanField(term7864, term7864.getClass(), "optionalArg", false);
        setIntField(term7864, term7864.getClass(), "numberOfArgs", 1622346318);
        setField(term7864, term7864.getClass(), "type", null);
        setField(term7864, term7864.getClass(), "values", term7873);
        setCharField(term7864, term7864.getClass(), "valuesep", 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term1975, args);
        assertTrue(recursiveEquals(term1975, term7864));
        assertTrue(recursiveEquals(retValue, true));
    }

};


