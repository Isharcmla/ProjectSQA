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

public class Option_getDescription_132142370358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250;
     Object term6720;

    public Option_getDescription_132142370358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1302 = new ArrayList();
        term1250 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1250, term1250.getClass(), "opt", "UoYtihxVaS");
        setField(term1250, term1250.getClass(), "longOpt", "JDswTTCZHV");
        setField(term1250, term1250.getClass(), "argName", "onpbIeEKoi");
        setField(term1250, term1250.getClass(), "description", "YRHGsAkhxb");
        setBooleanField(term1250, term1250.getClass(), "required", false);
        setBooleanField(term1250, term1250.getClass(), "optionalArg", false);
        setIntField(term1250, term1250.getClass(), "numberOfArgs", -522618178);
        setField(term1250, term1250.getClass(), "type", null);
        setField(term1250, term1250.getClass(), "values", term1302);
        setCharField(term1250, term1250.getClass(), "valuesep", 'j');
        ArrayList term6729 = new ArrayList();
        term6720 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6720, term6720.getClass(), "opt", "UoYtihxVaS");
        setField(term6720, term6720.getClass(), "longOpt", "JDswTTCZHV");
        setField(term6720, term6720.getClass(), "argName", "onpbIeEKoi");
        setField(term6720, term6720.getClass(), "description", "YRHGsAkhxb");
        setBooleanField(term6720, term6720.getClass(), "required", false);
        setBooleanField(term6720, term6720.getClass(), "optionalArg", false);
        setIntField(term6720, term6720.getClass(), "numberOfArgs", -522618178);
        setField(term6720, term6720.getClass(), "type", null);
        setField(term6720, term6720.getClass(), "values", term6729);
        setCharField(term6720, term6720.getClass(), "valuesep", 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDescription", argTypes, term1250, args);
        assertTrue(recursiveEquals(term1250, term6720));
        assertTrue(recursiveEquals(retValue, "YRHGsAkhxb"));
    }

};


