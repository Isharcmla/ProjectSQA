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

public class Option_getDescription_132142370358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;
     Object term6816;

    public Option_getDescription_132142370358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1315 = new ArrayList();
        term1262 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1314 = newInstance(Class.forName("java.lang.Object"));
        setField(term1262, term1262.getClass(), "opt", "UoYtihxVaS");
        setField(term1262, term1262.getClass(), "longOpt", "JDswTTCZHV");
        setField(term1262, term1262.getClass(), "argName", "onpbIeEKoi");
        setField(term1262, term1262.getClass(), "description", "YRHGsAkhxb");
        setBooleanField(term1262, term1262.getClass(), "required", false);
        setBooleanField(term1262, term1262.getClass(), "optionalArg", false);
        setIntField(term1262, term1262.getClass(), "numberOfArgs", -522618178);
        setField(term1262, term1262.getClass(), "type", term1314);
        setField(term1262, term1262.getClass(), "values", term1315);
        setCharField(term1262, term1262.getClass(), "valuesep", 'j');
        ArrayList term6826 = new ArrayList();
        term6816 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6825 = newInstance(Class.forName("java.lang.Object"));
        setField(term6816, term6816.getClass(), "opt", "UoYtihxVaS");
        setField(term6816, term6816.getClass(), "longOpt", "JDswTTCZHV");
        setField(term6816, term6816.getClass(), "argName", "onpbIeEKoi");
        setField(term6816, term6816.getClass(), "description", "YRHGsAkhxb");
        setBooleanField(term6816, term6816.getClass(), "required", false);
        setBooleanField(term6816, term6816.getClass(), "optionalArg", false);
        setIntField(term6816, term6816.getClass(), "numberOfArgs", -522618178);
        setField(term6816, term6816.getClass(), "type", term6825);
        setField(term6816, term6816.getClass(), "values", term6826);
        setCharField(term6816, term6816.getClass(), "valuesep", 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDescription", argTypes, term1262, args);
        assertTrue(recursiveEquals(term1262, term6816));
        assertTrue(recursiveEquals(retValue, "YRHGsAkhxb"));
    }

};


